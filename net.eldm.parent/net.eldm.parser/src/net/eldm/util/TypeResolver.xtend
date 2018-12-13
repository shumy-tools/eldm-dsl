package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.HashMap
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
import net.eldm.eldmDsl.ResultExpression
import net.eldm.validation.EldmDslValidator
import org.eclipse.emf.ecore.EObject

import static extension net.eldm.spi.Natives.*

@Singleton
class TypeResolver {
  @Inject extension PatternParser iParser
  //@Inject extension TypeValidator tValidator
  @Inject extension EldmDslValidator eValidator
  
  // TODO: how to manage destroyed objects?
  val cache = new HashMap<EObject, EObject>
  def getInferredValue(EObject inferred) { return cache.get(inferred) }
  
  
  def ElementDef getEntryType(MapEntryDef kd) {
    return kd.type ?: { kd.type = kd.value.inferType; kd.type }
  }
  
  def ElementDef inferType(ResultExpression exp) {
    return null
  }
  
  def ElementDef inferType(Literal value) {
    val inferred = value.internalInferType
    if (value !== null && inferred !== null)
      cache.put(inferred, value)
    
    return inferred
  }
  
  private def ElementDef internalInferType(Literal value) {
    val eFact = EldmDslFactory.eINSTANCE
    
    val nativeType = value.nativeType
    if (nativeType !== null)
      return eFact.createElementDef => [ native = nativeType ]
    
    val inferred = switch value {
      
      MapLiteral: eFact.createMapDef => [
        defs += value.entries.map[ entry |
          eFact.createMapEntryDef => [
            opt = false
            name = entry.name
            type = entry.value.inferType //TODO: lazy inference, set value instead? Only for MapLiteral or PatternLiteral!
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
          type = minType(type, elmDef)
          if (type.native == ANY) return
        }
      ]
      
      EnumLiteral: value.ref.value.inferType
      
      PatternLiteral: {
        val res = value.parse
        if (res === null) // error already reported if parse result is null
          return null
        
        res.inferType
      }
    }
    
    if (inferred !== null) {
      //TODO: check for validations in the EldmDslValidator!
      return inferred
    }
    
    value.error('''Failed to infer. Non recognized Literal: «value.class.simpleName»! Please report this bug.''')
    return null
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
      
      default: {
        current.error('''Failed to calculate minType. Non recognized «current.ref.class.simpleName»! Please report this bug.''')
        eFact.createElementDef => [ native = ANY ]
      }
    }
  }
}