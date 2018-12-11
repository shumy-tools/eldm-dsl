package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
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

@Singleton
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
  
  
  def boolean is(Literal lValue, Definition defDef) {
    switch defDef {
      TypeDef: return lValue.is(defDef)
      ExternalDef: return lValue.is(defDef)
      
      default: {
        lValue.error('''Unrecognized Definition: «defDef.class.simpleName»! Please report this bug.''')
        return false
      }
    }
  }
  
  def boolean inDefinition(ElementDef inferred, Definition superDef) {
    switch superDef {
      TypeDef: return inferred.inType(superDef)
      ExternalDef: return inferred.inExternal(superDef)
      
      default: {
        inferred.error('''Unrecognized Definition: «superDef.class.simpleName»! Please report this bug.''')
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
          lValue.error('''Unrecognized native type: «elmDef.native»! Please report this bug.''')
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
        lValue.error('''Unrecognized ElementDef: «elmDef.class.simpleName»! Please report this bug.''')
        false
      }
    }
  }
  
  def boolean inElement(ElementDef inferred, ElementDef superDef) {
    if (superDef === null) // is equivalent to ANY
      return true
    
    if (superDef.native !== null) {
      if (inferred.nativeType == superDef.native)
        return true
      
      // inferred.ref is always null (inference calculation do not generate cross-references)
      if (inferred.ref !== null)
        inferred.error("A cross-reference in inferred type! Please report this bug.")
      
      inferred.error('''Inferred type not assignable to type '«superDef.native»'.''')
      return false
    }
    
    if (superDef.ref !== null)
      return inferred.inDefinition(superDef.ref)
    
    if (superDef instanceof MapDef && inferred instanceof MapDef)
      return (inferred as MapDef).inMap(superDef as MapDef)
    
    if (superDef instanceof ListDef && inferred instanceof ListDef)
      return (inferred as ListDef).inList(superDef as ListDef)
    
    /*
    if (superDef instanceof EnumDef && inferred instanceof EnumDef)
      return inferred.in(superDef)
    */
    
    // TODO: improve error message
    inferred.error('''Uncompatible types («superDef.class.simpleName» != «inferred.class.simpleName»)''')
    return false
  }
  
  def boolean is(Literal lValue, MapDef mapDef) {
    val inferred = lValue.inferType
    if (inferred instanceof MapDef)
      return inferred.inMap(mapDef)
    
    lValue.error("Literal value not assignable to MapDef.")
    return false 
  }
  
  def boolean inMap(MapDef inferred, MapDef superDef) {
    // invalid KeyDef sets!
    for(entry : inferred.defs) {
      val kd = superDef.getMapEntryDef(entry.name)
      if (kd === null) {
        inferred.error('''KeyDef '«entry.name»' does not exist.''')
        return false
      }
      
      // is compatible type?
      // inferred.type is always present
      if (!entry.type.inElement(kd.entryType))
        return false
    }
    
    // mandatory KeyDef not set!
    val mandatory = superDef.defs.filter[!opt && value === null]
    for(kd : mandatory)
      if (!inferred.contains(kd.name)) {
        inferred.error('''Mandatory KeyDef '«kd.name»' not set.''')
        return false
      }
    
    return true
  }  
  
  
  def boolean is(Literal lValue, ListDef lstDef) {
    /*val use = ListLiteral.parse(lValue) ?: lValue
    if (use instanceof ListLiteral) {
      for (item : use.vals) {
        if (!item.is(lstDef.type))
          return false
      }
      
      return true
    }
    
    lValue.error("Literal value not assignable to ListDef.")
    return false*/
    
    val inferred = lValue.inferType
    if (inferred instanceof ListDef)
      return inferred.inList(lstDef)
    
    lValue.error("Literal value not assignable to ListDef.")
    return false
  }
  
  def boolean inList(ListDef inferred, ListDef superDef) {
    return inferred.type.inElement(superDef.type)
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
  
  def boolean inType(ElementDef inferred, TypeDef superDef) {
    if (superDef.type !== null)
      return inferred.inElement(superDef.type)
      
    if (superDef.parser !== null) {
      inferred.error("inType - Not supported yet!")
    }
    
    inferred.error("Literal value not assignable to TypeDef.")
    return false
  }
  
  def boolean is(Literal lValue, ExternalDef extDef) {
    //TODO: support external defs
    lValue.error("External definitions not yet supported!")
    return false 
    
    //return "Literal value not assignable to ExternalDef."
  }
  
  def boolean inExternal(ElementDef inferred, ExternalDef extDef) {
    inferred.error("inExternal - Not supported yet!")
    return false 
  }
  
  
  private def contains(MapDef type, String id) {
    for (entry : type.defs)
      if (entry.name == id)
        return true
    return false
  }
  
  private def getMapEntryDef(MapDef type, String id) {
    for (it : type.defs)
      if (name == id)
        return it
    return null
  }
}