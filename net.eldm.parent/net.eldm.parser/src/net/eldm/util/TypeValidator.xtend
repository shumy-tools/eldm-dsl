package net.eldm.util

import com.google.inject.Inject
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.DateLiteral
import net.eldm.eldmDsl.DateTimeLiteral
import net.eldm.eldmDsl.Definition
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.ExternalDef
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.LetValue
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapEntryLiteral
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PathLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TimeLiteral
import net.eldm.eldmDsl.TypeDef
import net.eldm.validation.EldmDslValidator

import static extension net.eldm.spi.Collections.*
import static extension net.eldm.spi.Natives.*

class TypeValidator {
  @Inject extension PatternParser iParser
  @Inject extension TypeResolver tResolver
  @Inject extension EldmDslValidator eValidator
  
  def boolean is(Literal lValue, Class<? extends Literal> type) {
    return type.isAssignableFrom(lValue.class) || lValue instanceof PatternLiteral && type.parse(lValue) !== null
  }
  
  def boolean is(Literal value, String natType) {
    if (value.nativeType == natType) return true
    if (value.collectionType == natType) return true
    
    return false
  }
  
  def boolean is(LetValue lValue, ElementDef elmDef) {
    lValue.error("Test incorrect")
    return false
  }
  
  def boolean is(Literal lValue, Definition defDef) {
    switch defDef {
      TypeDef: return lValue.is(defDef)
      ExternalDef: return lValue.is(defDef)
      
      default: {
        lValue.error('''Unrecognized Definition: «defDef.class.simpleName». Please report this bug.''')
        return false
      }
    }
  }
  
  def boolean is(Literal lValue, ElementDef elmDef) {
    if (elmDef.native !== null) {
      val isValidNative = switch elmDef.native {
        case ANY: true
        
        case BOOL: lValue.is(BoolLiteral)
        case STR:  lValue.is(StrLiteral)
        case INT:  lValue.is(IntLiteral)
        case FLT:  lValue.is(FltLiteral)
        
        case LDA:  lValue.is(DateLiteral)
        case LTM:  lValue.is(TimeLiteral)
        case LDT:  lValue.is(DateTimeLiteral)
        case PATH: lValue.is(PathLiteral)
        
        case MAP:  lValue.is(MapLiteral)
        case LST:  lValue.is(ListLiteral)
        case ENUM: lValue.is(EnumLiteral)
        
        default: {
          lValue.error('''Unrecognized native type: «elmDef.native». Please report this bug.''')
          return false
        }  
      }
      
      if (!isValidNative)
        lValue.error('''Native value not assignable to type '«elmDef.native»'.''')
      
      return isValidNative
    }
    
    if (elmDef.ref !== null)
      return lValue.is(elmDef.ref)
    
    return switch elmDef {
      MapDef: lValue.is(elmDef)
      ListDef: lValue.is(elmDef)
      EnumDef: lValue.is(elmDef)
      
      default: {
        lValue.error('''Unrecognized ElementDef: «elmDef.class.simpleName». Please report this bug.''')
        false
      }
    }
  }
  
  def boolean is(Literal lValue, MapDef mapDef) {
    val use = MapLiteral.parse(lValue) ?: lValue
    if (use instanceof MapLiteral) {
      // Invalid KeyDef sets!
      for(entry : use.entries) {
        val kd = mapDef.getKeyDef(entry)
        if (kd === null) {
          lValue.error('''KeyDef '«entry.name»' does not exist.''')
          return false
        }
        
        if (!entry.value.is(kd.entryType))
          return false
      }
      
      // mandatory KeyDef not set!
      val mandatory = mapDef.defs.filter[!opt && value === null]
      for(keyDef : mandatory)
        if (!use.contains(keyDef)) {
          lValue.error('''Mandatory KeyDef '«keyDef.name»' not set.''')
          return false 
        }
        
      return true
    }
    
    lValue.error("Literal value not assignable to MapDef.")
    return false 
  }
  
  def boolean is(Literal lValue, ListDef lstDef) {
    val use = ListLiteral.parse(lValue) ?: lValue
    if (use instanceof ListLiteral) {
      for (item : use.vals) {
        if (!item.is(lstDef.type))
          return false
      }
      
      return true
    }
    
    lValue.error("Literal value not assignable to ListDef.")
    return false
  }
  
  def boolean is(Literal lValue, EnumDef enumRef) {
    val use = EnumLiteral.parse(lValue) ?: lValue
    if (use instanceof EnumLiteral) {
      for (ed : enumRef.defs)
        if (ed === use.ref)
          return true
    }
    
    lValue.error("Literal value not assignable to EnumDef.")
    return false
  }
  
  def boolean is(Literal lValue, TypeDef typeDef) {
    if (typeDef.type !== null)
      return lValue.is(typeDef.type)
     
    if (typeDef.parser !== null) {
      val pattern = lValue.parsePattern
      if (pattern !== null)
        return true
    }
    
    lValue.error("Literal value not assignable to TypeDef.")
    return false
  }
  
  def boolean is(Literal lValue, ExternalDef extDef) {
    //TODO: support external defs
    lValue.error("External definitions not yet supported!")
    return false 
    
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