package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.HashMap
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumLiteral
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
  @Inject extension TypeValidator tValidator
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
        
        var current = head
        type = head.inferType
        for (elm: value.vals.tail) {
          val elmValue = if (elm instanceof PatternLiteral) elm.parse else elm
          val currentValue = if (current instanceof PatternLiteral) current.parse else current
            
          if (elmValue instanceof MapLiteral && currentValue instanceof MapLiteral) {
            type = value.minimalInfer(elmValue as MapLiteral, currentValue as MapLiteral)
            current = elmValue
          } else {
            val inferred = elmValue.inferType
            if (type.inElement(inferred)) {
              type = inferred
              current = elmValue
            } else if (!inferred.inElement(type)) {
              type = eFact.createElementDef => [ native = ANY ]
              return // ANY is compatible with all
            }  
          }
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
  
  private def MapDef minimalInfer(ListLiteral lValue, MapDef one, MapDef two) {
    
  }
  
  //TODO: literals are not adequate for minimal requirements, ie: [ {id: 10}, {osx: 'str'}, {id: 4, osx:'rt'} ] all fields are optional -> returning lst
  // maybe we can solve this by lazy MapLiteral inference, setting the value instead of type!
  private def MapDef minimalInfer(ListLiteral lValue, MapLiteral one, MapLiteral two) {
    val eFact = EldmDslFactory.eINSTANCE
    return eFact.createMapDef => [
      // all required at this level
      val reo = one.entries.map[ oe |
        val te = two.entries.findFirst[oe.name == name]
        if (te !== null) #[oe, te]
      ].filterNull
      
      // process required fields
      // also process incompatible types oe.type != te.type
      defs += reo.map[ entry |
        val oev = entry.get(0).value
        val tev = entry.get(1).value
        
        val oeValue = if (oev instanceof PatternLiteral) oev.parse else oev
        val teValue = if (tev instanceof PatternLiteral) tev.parse else tev
        
        //TODO: process pattern maps, ie: map@'{ id: 10, osx: 34 }'
        if (oeValue instanceof MapLiteral && teValue instanceof MapLiteral) {
          eFact.createMapEntryDef => [
            opt = false
            name = entry.get(0).name
            type = lValue.minimalInfer(oeValue as MapLiteral, teValue as MapLiteral)
          ]
        } else {
          val oeInferred = oeValue.inferType
          val teInferred = teValue.inferType
          
          val inferType = if (oeInferred.inElement(teInferred))
            oeInferred
          else if (teInferred.inElement(oeInferred))
            teInferred
          
          if (inferType === null)
            lValue.error("Incompatible element types in list.")
          
          eFact.createMapEntryDef => [
            opt = false
            name = entry.get(0).name
            type = inferType
          ]
        }
      ]
      
      val optionals = one.entries.filter[ oe | !two.entries.exists[te | oe.name == te.name]].toList
      optionals.addAll(two.entries.filter[ te | !one.entries.exists[oe | te.name == oe.name]])
      
      defs += optionals.map[ entry |
        eFact.createMapEntryDef => [
            opt = true
            name = entry.name
            type = entry.value.inferType
          ]
      ]
      
    ]
  }
}