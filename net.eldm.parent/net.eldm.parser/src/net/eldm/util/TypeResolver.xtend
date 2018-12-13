package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.Primary
import net.eldm.eldmDsl.ResultExpression

import static extension net.eldm.spi.Natives.*
import static extension net.eldm.util.ValidationStack.*
import net.eldm.eldmDsl.IsExpression
import net.eldm.eldmDsl.LetValue

@Singleton
class TypeResolver {
  @Inject extension PatternParser iParser
  @Inject extension TypeValidator tValidator
  
  def ElementDef getEntryType(MapEntryDef kd) {
    return kd.type ?: { kd.type = kd.value.inferType; kd.type }
  }
  
  def ElementDef getLetType(LetValue v) {
    return v.type ?: { v.type = v.result.inferType; v.type }
  }
  
  def ElementDef inferType(ResultExpression exp) {
    val eFact = EldmDslFactory.eINSTANCE
    if (exp === null)
      return eFact.createElementDef => [ native = ANY ]
      
    exp.push
      if (exp instanceof Primary) {
        val inferred = if (exp.value !== null) {
          exp.value.inferType
        } else if (exp.ref !== null) {
          val lType = exp.ref.letType
          if (exp.calls.empty)
            lType
          else
            error("Calls not yet supported") //TODO: infer target type
          
        } else
          error('''Failed to infer ResultExpression! Path not recognized. Please report this bug.''')
        
        pop
        return inferred
      }
      
      val lType = exp.left.inferType
      val rType = exp.right.inferType
      val min = lType.minType(rType)
      
      val inferred = switch exp.feature {
        case 'is': {
          if (exp instanceof IsExpression) {
            lType.inElement(exp.type)
            eFact.createElementDef => [ native = BOOL ]
          }
        }
        
        case 'and', case 'or': {
          if (min.isOneOf(BOOL))
            eFact.createElementDef => [ native = BOOL ]
        }
        
        case '>=', case '<=', case '>', case '<':  {
          if (min.isOneOf(INT, FLT, LDA, LTM, LDT))
            eFact.createElementDef => [ native = BOOL ]
        }
        
        case '==', case '!=': {
          if (min.isOneOf(BOOL, INT, FLT, LDA, LTM, LDT))
            eFact.createElementDef => [ native = BOOL ]
        }
        
        case '+', case '-': {
          if (min.isOneOf(STR, INT, FLT, MAP, LST))
            min
        }
        
        case '*', case '**', case '/', case '%': {
          if (min.isOneOf(INT, FLT))
            min
        }
        
        case '!': {
          error('''Not yet supported!''')
        }
        
        default:
          error('''Failed to infer ResultExpression! Please report this bug.''')
      }
      
      if (inferred === null)
        error('''No supported feature '«exp.feature»' between types («lType.nativeType», «rType.nativeType»)''')
      
    pop
    return inferred
  }
  
  def ElementDef inferType(Literal value) {
    val eFact = EldmDslFactory.eINSTANCE
    if (value === null)
      return eFact.createElementDef => [ native = ANY ]
    
    value.push
      if (value.isOneOf(BOOL, STR, INT, FLT, LDA, LTM, LDT, PATH)) {
        pop
        return eFact.createElementDef => [ native = value.nativeType ]
      }
      
      val inferred = switch value {
        MapLiteral: eFact.createMapDef => [
          defs += value.entries.map[ entry |
            eFact.createMapEntryDef => [
              opt = false
              name = entry.name
              type = entry.value.inferType
            ]
          ]
        ]
        
        ListLiteral: eFact.createListDef => [
          val head = value.vals.head
          if (head === null) {
            type = eFact.createElementDef => [ native = ANY ]
            return
          }
          
          type = head.inferType
          for (elm: value.vals.tail) {
            val elmDef = elm.inferType
            elm.push
              type = type.minType(elmDef)
            pop
            if (type.native == ANY) return
          }
        ]
        
        EnumLiteral:
          value.ref.value.inferType
        
        PatternLiteral:
          value.parse.inferType // error already reported if PatternParser
        
        default:
          error('''Failed to infer. Non recognized Literal: «value.class.simpleName»! Please report this bug.''')
      }
      
      //TODO: check for validations in the EldmDslValidator!
    
    pop
    return inferred
  }
  
  private def ElementDef minType(ElementDef current, ElementDef next) {
    val eFact = EldmDslFactory.eINSTANCE
    
    if (current.native !== null && current.native == next.native)
      return current
    
    if (current.nativeType != next.nativeType)
      return eFact.createElementDef => [ native = ANY ]
    
    return switch current {
      MapDef: eFact.createMapDef => [
        val nex = next as MapDef
        
        // intersected fields at this level
        val intersect = current.defs.map[ oe |
          val te = nex.defs.findFirst[oe.name == name]
          if (te !== null) (oe -> te)
        ].filterNull
        
        // set required fields and intersected optionals
        defs += intersect.map[ tuple |
          eFact.createMapEntryDef => [
            name = tuple.key.name
            opt = tuple.key.opt || tuple.value.opt
            type = minType(tuple.key.type, tuple.value.type)
          ]
        ]
        
        // unique fields at this level
        val optionals = current.defs.filter[ oe | !nex.defs.exists[oe.name == name]].toList
        optionals.addAll(nex.defs.filter[ te | !current.defs.exists[te.name == name]])
        
        // set other optional fields
        defs += optionals.map[ entry |
          eFact.createMapEntryDef => [
              opt = true
              name = entry.name
              type = entry.type
            ]
        ]
      ]
      
      ListDef: eFact.createListDef => [
        val nex = next as ListDef
        type = minType(current.type, nex.type)
      ]
      
      default:
        error('''Failed to calculate minType. Non recognized «current.ref.class.simpleName»! Please report this bug.''')
    }
  }
}