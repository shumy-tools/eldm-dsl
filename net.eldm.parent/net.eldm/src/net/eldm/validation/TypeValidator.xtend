package net.eldm.validation

import net.eldm.eldmDsl.ElementTypeDef
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapEntryLiteral
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.NullLiteral
import net.eldm.eldmDsl.ValueDef
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.DateLiteral
import net.eldm.eldmDsl.TimeLiteral
import net.eldm.eldmDsl.DateTimeLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.EnumLiteral

class TypeValidator {
  static def contains(MapLiteral obj, MapEntryDef type) {
    for (entry : obj.entries)
      if (entry.name == type.name)
        return true
    return false
  }
  
  static def getKeyDef(MapDef type, MapEntryLiteral entry) {
    for (it : type.defs)
      if (name == entry.name)
        return it
    return null
  }
  
  // getType ----------------------------------------------------------
  static def getType(MapEntryDef kd) {
    return kd.type ?: kd.value.type
  }
  
  /*static def getType(PatternLiteral pl) {
    return null as ElementTypeDef
  }*/
  
  static def ElementTypeDef getType(Literal value) {
    //TODO: --------  construct list | map | ... on demand!
    return null as ElementTypeDef
  }
  
  // isValidAssignment ------------------------------------------------
  static def String isValidAssignment(ElementTypeDef type, Literal value) {
    if (value instanceof NullLiteral) return null
    
    if (type instanceof ValueDef) {
      if (type.native == 'any') return null
      if (type.native == 'bool' && value instanceof BoolLiteral) return null
      if (type.native == 'str' && value instanceof StrLiteral) return null
      if (type.native == 'int' && value instanceof IntLiteral) return null
      if (type.native == 'flt' && value instanceof FltLiteral) return null
      if (type.native == 'lda' && value instanceof DateLiteral) return null
      if (type.native == 'ltm' && value instanceof TimeLiteral) return null
      if (type.native == 'ldt' && value instanceof DateTimeLiteral) return null
      if (type.native == 'path' && value.path !== null) return null
      
      if (type instanceof MapDef && value instanceof MapLiteral)
        return (type as MapDef).isValidAssignment(value as MapLiteral)
      
      if (type instanceof ListDef && value instanceof ListLiteral)
        return (type as ListDef).isValidAssignment(value as ListLiteral)
      
    } else {
      if (type.ref instanceof EnumDef && value instanceof EnumLiteral)
        return (type.ref as EnumDef).isValidAssignment(value as EnumLiteral)
        
      // PatternLiteral
      // ref = Definition
    }
    
    return "Value not assignable to type."
  }
  
  static def String isValidAssignment(MapDef type, MapLiteral obj) {
    // Invalid KeyDef sets!
    for(entry : obj.entries) {
      val kd = type.getKeyDef(entry)
      if (kd === null)
        return '''KeyDef '«entry.name»' does not exist.'''
      
      val msg = kd.getType.isValidAssignment(entry.value)
      if (msg !== null)
        return msg
    }
    
    // mandatory KeyDef not set!
    val mandatory = type.defs.filter[!opt && value === null]
    for(keyDef : mandatory)
      if (!obj.contains(keyDef))
        return '''Mandatory KeyDef '«keyDef.name»' not set.'''
    
    return null
  }
  
  static def String isValidAssignment(ListDef lst, ListLiteral obj) {
    for (value : obj.vals) {
      val msg = lst.type.isValidAssignment(value)
      if (msg !== null)
        return msg
    }
    
    return null
  }
  
  static def String isValidAssignment(EnumDef enumRef, EnumLiteral obj) {
    for (ed : enumRef.defs)
      if (ed === obj.ref)
        return null
    
    return "Enum not assignable to type."
  }
}