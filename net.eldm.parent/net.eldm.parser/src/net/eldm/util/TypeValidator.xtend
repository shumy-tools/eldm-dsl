package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import net.eldm.eldmDsl.Definition
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.ExternalDef
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.TypeDef
import net.eldm.validation.EldmDslValidator

import static extension net.eldm.spi.Natives.*

@Singleton
class TypeValidator {
  @Inject extension TypeResolver tResolver
  @Inject extension EldmDslValidator eValidator
  
  def boolean inDefinition(ElementDef inferred, Definition superDef) {
    switch superDef {
      TypeDef: return inferred.inType(superDef)
      ExternalDef: return inferred.inExternal(superDef)
      
      default: {
        inferred.error('''Non recognized Definition: «superDef.class.simpleName»! Please report this bug.''')
        return false
      }
    }
  }
  
  def boolean inElement(ElementDef inferred, ElementDef superDef) {
    if (superDef === null || superDef.native == ANY)
      return true
    
    if (superDef.native !== null) {
      if (inferred.nativeType == superDef.native)
        return true
      
      // inferred.ref is always null (inference calculation do not generate cross-references)
      if (inferred.ref !== null)
        inferred.error("A cross-reference in inferred type! Please report this bug.")
      
      return false
    }
    
    if (superDef.ref !== null)
      return inferred.inDefinition(superDef.ref)
    
    if (superDef instanceof MapDef && inferred instanceof MapDef)
      return (inferred as MapDef).inMap(superDef as MapDef)
    
    if (superDef instanceof ListDef && inferred instanceof ListDef)
      return (inferred as ListDef).inList(superDef as ListDef)
    
    if (superDef instanceof EnumDef && inferred instanceof MapDef)
      return (inferred as MapDef).inEnum(superDef as EnumDef)
    
    return false
  }
  
  def boolean inMap(MapDef inferred, MapDef superDef) {
    // invalid KeyDef sets!
    for(entry : inferred.defs) {
      val kd = superDef.getMapEntryDef(entry.name)
      if (kd === null)
        return false
      
      // is compatible type?
      // inferred.type is always present
      if (!entry.type.inElement(kd.entryType))
        return false
    }
    
    // mandatory KeyDef not set!
    val mandatory = superDef.defs.filter[!opt && value === null]
    for(kd : mandatory)
      if (!inferred.contains(kd.name))
        return false
    
    return true
  }
  
  def boolean inList(ListDef inferred, ListDef superDef) {
    return inferred.type.inElement(superDef.type)
  }
  
  def boolean inEnum(MapDef inferred, EnumDef superDef) {
    return inferred.inMap(superDef.type)
  }
  
  def boolean inType(ElementDef inferred, TypeDef superDef) {
    if (superDef.type !== null)
      return inferred.inElement(superDef.type)
    
    // the parser already verified the content string
    if (superDef.parser !== null && inferred.native == STR)
      return true
    
    return false
  }
  
  def boolean inExternal(ElementDef inferred, ExternalDef extDef) {
    //TODO: support external defs
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