package net.eldm.util

import com.google.inject.Inject
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral

import static extension net.eldm.spi.Natives.*

class TypeResolver {
  @Inject extension PatternParser iParser
  
  def ElementDef getEntryType(MapEntryDef kd) {
    return kd.type ?: kd.value.valueType //TODO: cache return type on kd.type ?
  }
  
  def ElementDef getValueType(Literal value) {
    val eFact = EldmDslFactory.eINSTANCE
    
    val nativeType = value.nativeType
    if (nativeType !== null)
      return eFact.createElementDef => [ native = nativeType ]
    
    switch value {
      ListLiteral: return eFact.createListDef => [
        type = value.vals.head.valueType
      ]
      
      MapLiteral: return eFact.createMapDef => [
        defs += value.entries.map[ entry |
          eFact.createMapEntryDef => [
            opt = false
            name = entry.name
            type = entry.value.valueType
          ]
        ]
      ]
      
      EnumLiteral: return value.ref.value.valueType
      
      PatternLiteral: return value.parse.valueType
    }
    
    return null
  }
}