package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.Function
import net.eldm.eldmDsl.IsExpression
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.Module
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.Primary
import net.eldm.eldmDsl.TypeDef
import net.eldm.eldmDsl.ValueExpression
import net.eldm.eldmDsl.Var
import org.eclipse.emf.ecore.EObject

import static extension net.eldm.spi.Natives.*
import static extension net.eldm.util.ValidationStack.*

@Singleton
class TypeResolver {
  @Inject extension PatternParser iParser
  
  def ElementDef getEntryType(MapEntryDef kd) {
    return kd.type ?: { kd.type = kd.value.inferType; kd.type }
  }
  
  def ElementDef getVarType(Var id) {
    if (id.present)
      error("Identifier expression cannot reference itself!")
    
    return id.type ?: { id.type = id.result.inferType; id.type }
  }
  
  def getPrimaryType(Primary pr) {
    return pr.type ?: {
      if (pr.value !== null) {
        pr.type = pr.value.inferType
        pr.type
      } else if (pr.ref !== null) {
        pr.type = pr.resolveIdentifier
        pr.type
      } else
        error('''Failed to infer Primary type! Please report this bug.''')
    }
  }
  
  def ElementDef inferType(ValueExpression exp) {
    val eFact = EldmDslFactory.eINSTANCE
    if (exp === null)
      return eFact.createElementDef => [ native = ANY ]
      
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
            rType = exp.type // override to output the correct error message in the end
            val min = lType.minType(rType)
            if (min.nativeType == lType.nativeType)
              eFact.createElementDef => [ native = BOOL ]
          }
        }
        
        case 'and', case 'or': {
          val min = lType.minType(rType)
          if (min.isOneOf(BOOL))
            eFact.createElementDef => [ native = BOOL ]
        }
        
        case '>=', case '<=', case '>', case '<':  {
          val min = lType.minType(rType)
          if (min.isOneOf(INT, FLT, LDA, LTM, LDT))
            eFact.createElementDef => [ native = BOOL ]
        }
        
        case '==', case '!=': {
          val min = lType.minType(rType)
          if (min.isOneOf(BOOL, INT, FLT, LDA, LTM, LDT))
            eFact.createElementDef => [ native = BOOL ]
        }
        
        case 'del', case 'set': {
          val max = lType.maxType(rType)
          if (max.isOneOf(MAP))
            max
        }
        
        case '+', case '-': {
          //TODO: this is more complex, i.e: MapLiteral - MapDef 
          val min = lType.minType(rType)
          if (min.isOneOf(STR, INT, FLT, LST))
            min
        }
        
        case '*', case '**', case '/', case '%': {
          val min = lType.minType(rType)
          if (min.isOneOf(INT, FLT))
            min
        }
        
        case '!': {
          error('''Not yet supported!''')
        }
        
        default:
          error('''Failed to infer ValueExpression! Please report this bug.''')
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
          
          ext = false
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
    
    if (current === null || next === null)
      return eFact.createElementDef => [ native = ANY ]
    
    //BEGIN: analysing Definition references----------------------------
      if (current.ref instanceof TypeDef)
        return next.minTypeDef(current.ref as TypeDef)
      
      if (next.ref instanceof TypeDef)
        return current.minTypeDef(next.ref as TypeDef)
    //END: analysing Definition references------------------------------
    
    //BEGIN: analysing collection types --------------------------------
      val cNative = current.nativeType
      val nNative = next.nativeType
      if (cNative != nNative)
        return eFact.createElementDef => [ native = ANY ]
    //END: analysing collection types -----------------------------------
    
    //BEGIN: analysing natives------------------------------------------
      // i.e: map + {id: int} -> map
      if (current.native !== null && current.native == next.native)
        return current
      
      if (cNative == next.native || current.native == nNative)
        return eFact.createElementDef => [ native = cNative ]
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
            type = minType(tuple.key.type, tuple.value.type)
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
              type = entry.type
            ]
        ]
        
        // are there any extendable fields?
        ext = current.ext || nex.ext
      ]
      
      ListDef: eFact.createListDef => [
        type = minType(current.type, (next as ListDef).type)
      ]
      
      default:
        error('''Failed to calculate minType. Non recognized «current.ref.class.simpleName»! Please report this bug.''')
    }
  }
  
  private def ElementDef maxType(ElementDef current, ElementDef next) {
    val eFact = EldmDslFactory.eINSTANCE
    
    if (current === null || next === null)
      return eFact.createElementDef => [ native = ANY ]
    
    //BEGIN: analysing Definition references----------------------------
      if (current.ref instanceof TypeDef)
        return next.maxTypeDef(current.ref as TypeDef)
      
      if (next.ref instanceof TypeDef)
        return current.maxTypeDef(next.ref as TypeDef)
    //END: analysing Definition references------------------------------
    
    //BEGIN: analysing collection types --------------------------------
      if (current.nativeType != next.nativeType)
        return eFact.createElementDef => [ native = ANY ]
    //END: analysing collection types -----------------------------------
    
    //BEGIN: analysing natives------------------------------------------
      if (current.native !== null && current.native == next.native)
        return current
      
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
                type = entry.type
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
              type = maxType(tuple.key.type, tuple.value.type)
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
                type = entry.type
              ]
          ]
          
          // are there any extendable fields?
          ext = left.ext || nex.ext
        }
      ]
      
      ListDef: eFact.createListDef => [
        if (right.native !== null)
          type = eFact.createElementDef => [ native = LST ]
        else
          type = maxType(left.type, (right as ListDef).type)
      ]
      
      default:
        error('''Failed to calculate maxType. Non recognized «left.ref.class.simpleName»! Please report this bug.''')
    }
  }
  
  def ElementDef minTypeDef(ElementDef left, TypeDef right) {
    val sType = right.type
    if (sType !== null)
      return switch sType {
        ElementDef: left.minType(sType)
        EnumDef: error("minTypeDef - EnumDef not supported")
      }
    else
      error("minTypeDef for ExternalDef - Not supported yet!")
      //TODO: support ExternalDef
  }
  
  def ElementDef maxTypeDef(ElementDef left, TypeDef right) {
    val sType = right.type
    if (sType !== null)
      return switch sType {
        ElementDef: left.maxType(sType)
        EnumDef: error("maxTypeDef - EnumDef not supported")
      }
    else
      error("maxTypeDef for ExternalDef - Not supported yet!")
      //TODO: support ExternalDef
  }
  
  def ElementDef resolveIdentifier(Primary pr) {
    val func = pr.findContainer(Function)
    if (func !== null) {
      // search variables in body
      val type = func.decl.param.resolveVar(pr.ref)
      if (type !== null)
        return type
      
      // search in function parameter
      val fParam = func.decl.param.mapDef
      if (fParam !== null) {
          val entry = fParam.getMapEntryDef(pr.ref)
          if (entry !== null)
            return entry.entryType
      }
      
    } else {
      val mod = pr.findContainer(Module)
      if (mod !== null) {
        // search module values (let)
        val type = mod.resolveVar(pr.ref)
        if (type !== null)
          return type
      }
    }
    
    error('''Couldn't resolve reference '«pr.ref»'.''')
    return null;
  }
  
  def ElementDef resolveVar(EObject obj, String id) {
    val ident = obj.eContents.filter(Var).findFirst[
      name == id
    ]
    
    if (ident !== null)
      return ident.varType
  }
  
  def <T extends EObject> T findContainer(EObject leaf, Class<T> type) {
    if (leaf === null) return null
    
    var EObject obj = leaf
    do
      obj = obj.eContainer
    while (obj !== null && !(type.isAssignableFrom(obj.class)))
    
    return obj as T
  }
  
  def MapDef getMapDef(ElementDef type) {
    if (type instanceof MapDef)
      return type
    
    val tRef = type.ref
    if (tRef instanceof TypeDef)
      if (tRef.type instanceof ElementDef)
        return (tRef.type as ElementDef).mapDef
    
    //TODO: if (param.ref instanceof ExternalDef)
    error('''Couldn't resolve MapDef! Please report this bug.''')
    return null
  }
  
  def getMapEntryDef(MapDef type, String id) {
    for (it : type.defs)
      if (name == id)
        return it
    return null
  }
}