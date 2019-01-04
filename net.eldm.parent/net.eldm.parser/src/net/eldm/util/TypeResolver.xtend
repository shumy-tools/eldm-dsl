package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.List
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.ExternalDef
import net.eldm.eldmDsl.InferredDef
import net.eldm.eldmDsl.IsExpression
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.Primary
import net.eldm.eldmDsl.TopDef
import net.eldm.eldmDsl.TypeDef
import net.eldm.eldmDsl.UnaryOperation
import net.eldm.eldmDsl.ValueExpression
import net.eldm.eldmDsl.Var
import org.eclipse.emf.ecore.util.EcoreUtil

import static extension net.eldm.spi.Natives.*
import static extension net.eldm.util.ValidationStack.*

@Singleton
class TypeResolver {
  @Inject extension PatternParser iParser
  @Inject extension TypeParser tParser
  @Inject extension TypeValidator tValidator
  @Inject extension IdentifierResolver iResolver
  @Inject extension CallResolver cResolver
  
  val eFact = EldmDslFactory.eINSTANCE
  
  def InferredDef getEntryType(MapEntryDef kd) {
    if (kd.type !== null)
      kd.type.inferType
    else {
      kd.type = EcoreUtil.copy(kd.value.inferType)
      kd.type as InferredDef
    }
  }
  
  def InferredDef getVarType(Var vr) {
    if (vr.type !== null)
      vr.type.inferType
    else {
      vr.type = EcoreUtil.copy(vr.result.inferType)
      vr.type as InferredDef
    }
  }
  
  def InferredDef getPrimaryType(Primary pr) {
    val type = pr.inferType
    if (pr.cast) {
      val castType = pr.type.inferType
      try {
        dontPop = true
        type.inElement(castType)
      } catch (ValidationError ve1) {
        try {
          castType.inElement(type)
        } catch (ValidationError ve2) {
          dontPop = false
          error('''Couldn't cast type.''')
        }
      }
      
      dontPop = false
      return castType
    }
    
    return type
  }
  
  def InferredDef inferType(ValueExpression exp) {
    if (exp === null)
      return NONE.typeOf
      
    exp.push
      if (exp instanceof Primary) {
        val inferred = exp.primaryType
        
        pop
        return inferred
      }
      
      val lType = exp.left.inferType
      var rType = exp.right.inferType
      
      val inferred = switch exp.feature {
        case 'is': {
          if (exp instanceof IsExpression) {
            rType = exp.type.inferType // override to output the correct error message in the end
            val min = lType.minType(rType)
            if (min.nativeType == lType.nativeType)
              BOOL.typeOf
          }
        }
        
        case 'and', case 'or': {
          val min = lType.minType(rType)
          if (min.isOneOf(BOOL))
            BOOL.typeOf
        }
        
        case '>=', case '<=', case '>', case '<':  {
          val min = lType.minType(rType)
          if (min.isOneOf(NUM, LDT))
            BOOL.typeOf
        }
        
        case '==', case '!=': {
          val min = lType.minType(rType)
          if (min.isOneOf(NAT, LDT))
            BOOL.typeOf
        }
        
        case '+': {
          val max = lType.maxType(rType)
          if (max.isOneOf(STR, NUM, MAP, ITR, COL))
            max
        }
        
        case '-': {
          if (lType.isOneOf(STR, NUM)) {
            val max = lType.maxType(rType)
            if (max.isOneOf(STR, NUM))
              max
          } else if (lType.isOneOf(LDT, MAP, ITR, COL)) {
            //TODO: LST, MAP subtraction is different
            // { id: 10, name: 'Alex' } - { id } -> remove id field
            // ['Alex', 'Bruno', ...] - [0, 1] -> remove 0 and 1 index  
          }
        }
        
        case '*', case '**', case '/', case '%': {
          val max = lType.maxType(rType)
          if (max.isOneOf(NUM))
            max
        }
        
        case '!': {
          if (exp instanceof UnaryOperation) {
            rType = exp.operand.inferType
            if (rType.isOneOf(BOOL))
              BOOL.typeOf
          }
        }
        
        default:
          error('''Failed to infer ValueExpression! Please report this bug.''')
      }
      
      if (inferred === null)
        error('''No supported feature '«exp.feature»' between types («lType.nativeType», «rType.nativeType»)''')
      
    pop
    return inferred
  }
  
  def InferredDef inferType(Primary pr) {
    pr.push
      var type = if (pr.value !== null)
        pr.value.inferType
      else if (pr.exp !== null)
        pr.exp.inferType
      else if (pr.ref !== null)
        pr.resolve(pr.ref)
      else
        error('''Failed to infer Primary type! Please report this bug.''')
      
      type = type.call(pr.calls)
      
    pop
    return type
  }
  
  def InferredDef inferType(Literal value) {
    if (value === null)
      return NONE.typeOf
    
    value.push
      if (value.isOneOf(NAT, LDT, PATH)) {
        pop
        return value.nativeType.typeOf
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
          
          ext = false
        ]
        
        ListLiteral: eFact.createListDef => [
          ext = 'L'
          type = value.vals.map[inferType].minType
        ]
        
        PatternLiteral:
          value.parse.inferType // error already reported if PatternParser
        
        default:
          error('''Failed to infer. Non recognized Literal: «value.class.simpleName»! Please report this bug.''')
      }
      
      //TODO: check for validations in the EldmDslValidator!
    
    pop
    return inferred
  }
  
  def InferredDef inferType(TopDef tDef) {
    return switch tDef {
      ElementDef: tDef.inferType
      
      EnumDef: {
        /* typedef Sex enum { name: str }
             M { name: 'Male' }
             F { name: 'Female' }
           returns { M: Sex.type, F: Sex.type }
        */
        eFact.createMapDef => [
          for (item: tDef.defs) {
            defs += eFact.createMapEntryDef => [
              name = item.name
              type = EcoreUtil.copy(tDef.type ?: MAP.typeOf)
            ]
          }
        ]
      }
    }
  }
  
  def InferredDef inferType(ElementDef tDef) {
    if (tDef === null)
      return NONE.typeOf
    
    if (tDef instanceof InferredDef)
      return tDef //TODO: do I need to infer MapDef, ListDef, TemplateDef, LambdaDef?
    
    val tRef = tDef.ref
    if (tRef !== null)
      return switch tRef {
        TypeDef: tRef.inferType
        ExternalDef: error("getMapDef - ExternalDef not supported yet") //TODO: if (param.ref instanceof ExternalDef)
      }
  }
  
  def InferredDef inferType(TypeDef tDef) {
    if (tDef.type !== null)
      return tDef.type.inferType
    
    //TODO: should I return something different than STR?
    if (tDef.parser !== null)
      return STR.typeOf
  }
  
  
  def InferredDef minType(List<InferredDef> lst) {
    var InferredDef inferred = null
    
    val head = lst.head
    if (head === null)
      return ANY.typeOf
    
    inferred = head.inferType
    for (elm: lst.tail) {
      val elmDef = elm.inferType
      inferred = inferred.minType(elmDef)
      
      if (inferred.native == ANY)
        return EcoreUtil.copy(inferred)
    }
    
    return EcoreUtil.copy(inferred)
  }
  
  def InferredDef minType(InferredDef current, InferredDef next) {
    if (current === null || next === null)
      return ANY.typeOf
    
    //BEGIN: analysing Definition references----------------------------
      if (current.ref instanceof TypeDef)
        return next.minTypeDef(current.ref as TypeDef)
      
      if (next.ref instanceof TypeDef)
        return current.minTypeDef(next.ref as TypeDef)
    //END: analysing Definition references------------------------------
    
    //BEGIN: analysing collection types --------------------------------
      val cNative = current.nativeType
      val nNative = next.nativeType
      if (cNative != nNative) {
        val minNat = cNative.minNative(nNative)
        if (current.native === null && next.native === null && minNat == ITR)
          return eFact.createListDef => [
            ext = 'I'
            type = minType((current as ListDef).type.inferType, (next as ListDef).type.inferType)
          ]
        else
          return minNat.typeOf
      }
    //END: analysing collection types -----------------------------------
    
    //BEGIN: analysing natives------------------------------------------
      // i.e: map + {id: int} -> map
      if (current.native !== null && current.native == next.native)
        return current
      
      if (cNative == next.native || current.native == nNative)
        return cNative.typeOf
    //END: analysing natives--------------------------------------------
    
    
    // when at this position, it's assured that both are equal collections.
    return switch current {
      MapDef: eFact.createMapDef => [ // i.e: {id: int} + {name?: str} -> {id?: int, name?: str}
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
            type = minType(tuple.key.type.inferType, tuple.value.type.inferType)
          ]
        ]
        
        // unique fields at this level
        val unique = current.defs.filter[ oe | !nex.defs.exists[oe.name == name]].toList
        unique.addAll(nex.defs.filter[ te | !current.defs.exists[te.name == name]])
        
        // set other optional fields
        defs += unique.map[ entry |
          eFact.createMapEntryDef => [
            opt = true
            name = entry.name
            type = EcoreUtil.copy(entry.type)
          ]
        ]
        
        // are there any extendable fields?
        ext = current.ext || nex.ext
      ]
      
      ListDef: eFact.createListDef => [
        type = minType(current.type.inferType, (next as ListDef).type.inferType)
      ]
      
      default:
        error('''Failed to calculate minType. Non recognized «current.ref.class.simpleName»! Please report this bug.''')
    }
  }
  
  def InferredDef maxType(InferredDef current, InferredDef next) {
    if (current === null || next === null)
      return ANY.typeOf
    
    //BEGIN: analysing Definition references----------------------------
      if (current.ref instanceof TypeDef)
        return next.maxTypeDef(current.ref as TypeDef)
      
      if (next.ref instanceof TypeDef)
        return current.maxTypeDef(next.ref as TypeDef)
    //END: analysing Definition references------------------------------
    
    //BEGIN: analysing collection types --------------------------------
      val cNative = current.nativeType
      val nNative = next.nativeType
      if (cNative != nNative) {
        val minNat = cNative.minNative(nNative)
        if (current.native === null && next.native === null && minNat == ITR)
          return eFact.createListDef => [
            ext = 'I'
            type = maxType((current as ListDef).type.inferType, (next as ListDef).type.inferType)
          ]
        else
          return minNat.typeOf
      }
    //END: analysing collection types -----------------------------------
    
    //BEGIN: analysing natives------------------------------------------
      if (current.native !== null && current.native == next.native)
        return EcoreUtil.copy(current)
      
      //implicit => if (current.native === null && (next.native !== null || next.native === null)) current
      val left = if (current.native !== null && next.native === null) next else current
      val right = if (left === current) next else current
    //END: analysing natives--------------------------------------------
    
    
    // when at this position, it's assured that left is a collection compatible with right. Yet, right may be native.
    return switch left {
      MapDef: eFact.createMapDef => [
        if (right.native !== null) { // i.e: {id: int} + map -> {id: int, *}
          defs += left.defs.map[ entry | // copy is needed to avoid ConcurrentModificationException
            eFact.createMapEntryDef => [
                opt = entry.opt
                name = entry.name
                type = EcoreUtil.copy(entry.type)
              ]
          ]
          
          ext = true
        } else { // i.e: {id: int} + {id?: int, name: str} -> {id: int, name: str}
          val nex = right as MapDef
          
          // intersected fields at this level
          val intersect = left.defs.map[ oe |
            val te = nex.defs.findFirst[oe.name == name]
            if (te !== null) (oe -> te)
          ].filterNull
          
          // set required fields and intersected optionals
          defs += intersect.map[ tuple |
            eFact.createMapEntryDef => [
              name = tuple.key.name
              opt = tuple.key.opt && tuple.value.opt
              type = maxType(tuple.key.type.inferType, tuple.value.type.inferType)
            ]
          ]
          
          // unique fields at this level
          val unique = left.defs.filter[ oe | !nex.defs.exists[oe.name == name]].toList
          unique.addAll(nex.defs.filter[ te | !left.defs.exists[te.name == name]])
          
          // set other unique fields
          defs += unique.map[ entry | // copy is needed to avoid ConcurrentModificationException
            eFact.createMapEntryDef => [
              opt = entry.opt
              name = entry.name
              type = EcoreUtil.copy(entry.type)
            ]
          ]
          
          // are there any extendable fields?
          ext = left.ext || nex.ext
        }
      ]
      
      ListDef: {
        val lNative = left.nativeType
        val rNative = right.nativeType
        val minNat = lNative.minNative(rNative)
        
        if (right.native !== null)
          minNat.typeOf
        else eFact.createListDef => [
          ext = minNat.listExt
          type = maxType(left.type.inferType, (right as ListDef).type.inferType)
        ]
      }
      
      default:
        error('''Failed to calculate maxType. Non recognized «left.ref.class.simpleName»! Please report this bug.''')
    }
  }
  
  def InferredDef minTypeDef(InferredDef left, TypeDef right) {
    val rType = right.type.inferType
    return EcoreUtil.copy(left.minType(rType))
  }
  
  def InferredDef maxTypeDef(InferredDef left, TypeDef right) {
    val rType = right.type.inferType
    return EcoreUtil.copy(left.maxType(rType))
  }
}