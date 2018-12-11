package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.HashMap
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.ResultExpression
import org.eclipse.emf.ecore.EObject

import static extension net.eldm.spi.Natives.*

@Singleton
class TypeResolver {
  @Inject extension PatternParser iParser
  
  // TODO: how to manage destroyed objects?
  val cache = new HashMap<EObject, EObject>
  def getInferredValue(EObject inferred) { return cache.get(inferred) }
  
  
  def ElementDef getEntryType(MapEntryDef kd) {
    return kd.type ?: { kd.type = kd.value.inferType; kd.type }
  }
  
  /*def ElementDef getLetResultType(LetValue lv) {
    val inferred = lv.result.inferType
    if (lv.type === null)
      lv.type =  inferred
    
    return inferred
  }*/
  
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
    
    switch value {
      ListLiteral: return eFact.createListDef => [
        type = value.vals.head.inferType
      ]
      
      MapLiteral: return eFact.createMapDef => [
        defs += value.entries.map[ entry |
          eFact.createMapEntryDef => [
            opt = false
            name = entry.name
            type = entry.value.inferType
          ]
        ]
      ]
      
      EnumLiteral: return value.ref.value.inferType
      
      PatternLiteral: return value.parse.inferType
    }
    
    return null
  }
  
  def ElementDef inferType(ResultExpression exp) {
    return null
  }
}