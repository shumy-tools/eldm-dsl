package net.eldm.util

import com.google.inject.Inject
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.Definition
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.ExternalDef
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapEntryLiteral
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TypeDef
import net.eldm.spi.PathLiteral

import static net.eldm.spi.Natives.*

class TypeValidator {
  @Inject extension InlineParser iParser
  @Inject extension TypeResolver tResolver
  
  def boolean is(Literal lValue, Class<?> type) {
    if (Literal.isAssignableFrom(type))
      return type.isAssignableFrom(lValue.class) // type -> Literal
        || lValue instanceof PatternLiteral && type.parse(lValue as PatternLiteral) !== null
    else if (PathLiteral.isAssignableFrom(type)) // type -> PathLiteral
      return lValue.path !== null
        || lValue instanceof PatternLiteral && type.parse(lValue as PatternLiteral) !== null
    else // type -> LocalDate | LocalTime | LocalDateTime
      return lValue instanceof PatternLiteral && type.parse(lValue as PatternLiteral) !== null
  }
  
  def boolean is(Literal value, String natType) {
    return switch value {
      BoolLiteral case natType == BOOL: true
      StrLiteral case natType == STR: true
      IntLiteral case natType == INT: true
      
      MapLiteral case natType == MAP: true
      ListLiteral case natType == LST: true
      EnumLiteral case natType == ENUM: true
      
      default: false
    }
  }
  
  def String is(Literal lValue, Definition defDef) {
    switch defDef {
      TypeDef: return lValue.is(defDef)
      ExternalDef: return lValue.is(defDef)
      default: return '''Unrecognized Definition: «defDef.class». Please report this bug.'''
    }
  }
  
  def String is(Literal lValue, TypeDef typeDef) {
    if (typeDef.type !== null)
      return lValue.is(typeDef.type)
     
    if (typeDef.parser !== null) {
      val pattern = lValue.parsePattern
      if (pattern !== null)
        return null
    }
    
    return "Literal value not assignable to TypeDef."
  }
  
  def String is(Literal lValue, ElementDef elmDef) {
    if (elmDef.native !== null) {
      switch elmDef.native {
        case ANY:  return null
        case PATH: if (lValue.is(PathLiteral)) return null
        
        case BOOL: if (lValue.is(BoolLiteral)) return null
        case STR:  if (lValue.is(StrLiteral)) return null
        case INT:  if (lValue.is(IntLiteral)) return null
        case FLT:  if (lValue.is(FltLiteral)) return null
        
        case LDA:  if (lValue.is(LocalDate)) return null
        case LTM:  if (lValue.is(LocalTime)) return null
        case LDT:  if (lValue.is(LocalDateTime)) return null
        
        default:   return '''Unrecognized native type: «elmDef.native». Please report this bug.'''
      }
      
      return '''Native value not assignable to type '«elmDef.native»'.'''
    }
    
    if (elmDef.ref !== null)
      return lValue.is(elmDef.ref)
    
    switch elmDef {
      MapDef: return lValue.is(elmDef)
      ListDef: return lValue.is(elmDef)
      EnumDef: return lValue.is(elmDef)
      default: return '''Unrecognized ElementDef: «elmDef.class». Please report this bug.'''
    }
  }
  
  def String is(Literal lValue, MapDef mapDef) {
    val use = MapLiteral.parse(lValue) ?: lValue
    if (use instanceof MapLiteral) {
      // Invalid KeyDef sets!
      for(entry : use.entries) {
        val kd = mapDef.getKeyDef(entry)
        if (kd === null)
          return '''KeyDef '«entry.name»' does not exist.'''
        
        val msg = entry.value.is(kd.entryType)
        if (msg !== null)
          return msg
      }
      
      // mandatory KeyDef not set!
      val mandatory = mapDef.defs.filter[!opt && value === null]
      //println('''«type.defs.map['''(«name», «opt»)''']» -> «mandatory.map[name]»''')
      for(keyDef : mandatory)
        if (!use.contains(keyDef))
          return '''Mandatory KeyDef '«keyDef.name»' not set.'''
      
      return null
    }
    
    return "Literal value not assignable to MapDef."
  }
  
  def String is(Literal lValue, ListDef lstDef) {
    val use = ListLiteral.parse(lValue) ?: lValue
    if (use instanceof ListLiteral) {
      for (item : use.vals) {
        val msg = item.is(lstDef.type)
        if (msg !== null)
          return msg
      }
      
      return null
    }
    
    return "Literal value not assignable to ListDef."
  }
  
  def String is(Literal lValue, EnumDef enumRef) {
    val use = EnumLiteral.parse(lValue) ?: lValue
    if (use instanceof EnumLiteral) {
      for (ed : enumRef.defs)
        if (ed === use.ref)
          return null
    }
    
    return "Literal value not assignable to EnumDef."
  }
  
  def String is(Literal lValue, ExternalDef extDef) {
    return "External definitions not yet supported!" //TODO: support external defs
    
    //return "Literal value not assignable to ExternalDef."
  }
  
  
  
  private def contains(MapLiteral obj, MapEntryDef type) {
    for (entry : obj.entries)
      if (entry.name == type.name)
        return true
    return false
  }
  
  private def getKeyDef(MapDef type, MapEntryLiteral entry) {
    for (it : type.defs)
      if (name == entry.name)
        return it
    return null
  }
}