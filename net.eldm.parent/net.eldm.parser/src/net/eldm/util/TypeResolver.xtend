package net.eldm.util

import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.Literal

import static net.eldm.spi.Natives.*

class TypeResolver {
  def getEntryType(MapEntryDef kd) {
    return kd.type ?: kd.value.valueType //TODO: cache return type on kd.type ?
  }
  
  def ElementDef getValueType(Literal value) {
    val eFact = EldmDslFactory.eINSTANCE
    
    if (value === null)
      return eFact.createElementDef => [ native = ANY ]
    
    switch value {
      BoolLiteral: return eFact.createElementDef => [ native = BOOL ]
      StrLiteral: return eFact.createElementDef => [ native = STR ]
      IntLiteral: return eFact.createElementDef => [ native = INT ]
      FltLiteral: return eFact.createElementDef => [ native = FLT ]
      
      ListLiteral: return eFact.createListDef => [
        type = (value as ListLiteral).vals.head.valueType
      ]
      
      MapLiteral: return eFact.createMapDef => [
        defs += (value as MapLiteral).entries.map[ entry |
          eFact.createMapEntryDef => [
            opt = false
            name = entry.name
            type = entry.value.valueType
          ]
        ]
      ]
      
      EnumLiteral: return (value as EnumLiteral).ref.value.valueType
      
      // TODO: cases
      //PatternLiteral:
      //case value.path !== null:
    }
    
    //TODO: --------  construct list | map | ... on demand!
    return null as ElementDef
  }
}