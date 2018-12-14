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

import static extension net.eldm.spi.Natives.*
import static extension net.eldm.util.ValidationStack.*

@Singleton
class TypeValidator {
  @Inject extension TypeResolver tResolver
  
  def void inDefinition(ElementDef inferred, Definition superDef) {
    switch superDef {
      TypeDef: inferred.inType(superDef)
      ExternalDef: inferred.inExternal(superDef)
      
      default:
        error('''Non recognized Definition: «superDef.class.simpleName»! Please report this bug.''')
    }
  }
  
  def void inElement(ElementDef inferred, ElementDef superDef) {
    if (superDef === null || superDef.native == ANY)
      return;
    
    if (superDef.native !== null) {
      if (inferred.nativeType == superDef.native)
        return;
      
      // inferred.ref is always null (inference calculation do not generate cross-references)
      if (inferred.ref !== null)
        error("A cross-reference in inferred type! Please report this bug.")
      
      error('''Inferred type not assignable to native '«superDef.native»'.''')
    }
    
    if (superDef.ref !== null) {
      inferred.inDefinition(superDef.ref)
      return;
    }
    
    if (superDef instanceof MapDef && inferred instanceof MapDef) {
      (inferred as MapDef).inMap(superDef as MapDef)
      return;
    }
    
    if (superDef instanceof ListDef && inferred instanceof ListDef) {
      (inferred as ListDef).inList(superDef as ListDef)
      return;
    }
    
    if (superDef instanceof EnumDef && inferred instanceof MapDef) {
      (inferred as MapDef).inEnum(superDef as EnumDef)
      return;
    }
    
    error('''Non compatible elements («inferred.class.simpleName», «superDef.class.simpleName»). Please report this bug.''')
  }
  
  def void inMap(MapDef inferred, MapDef superDef) {
    // invalid KeyDef sets!
    for(entry : inferred.defs) {
      val kd = superDef.getMapEntryDef(entry.name)
      if (kd === null) {
        if (!superDef.ext) 
          error('''Key '«entry.name»' does not exist.''')
      } else {
        // is compatible type?
        // inferred.type is always present
        if (entry.opt && !kd.opt)
          error('''Inferred type not assignable to map with required key '«kd.name»'.''')
        
        entry.type.inElement(kd.entryType)  
      }
    }
    
    // mandatory KeyDef not set!
    val mandatory = superDef.defs.filter[!opt]
    for(kd : mandatory)
      if (!inferred.contains(kd.name))
        error('''Required key '«kd.name»' not set.''')
    
    // deal with extendable fields?
    if (inferred.ext && !superDef.ext)
      error('''Inferred type with extendable fields not assignable to defined map.''')
    
    return;
  }
  
  def void inList(ListDef inferred, ListDef superDef) {
    inferred.type.inElement(superDef.type)
  }
  
  def void inEnum(MapDef inferred, EnumDef superDef) {
    inferred.inMap(superDef.type)
  }
  
  def void inType(ElementDef inferred, TypeDef superDef) {
    if (superDef.type !== null) {
      inferred.inElement(superDef.type)
      return;
    }
    
    // the parser already verified the content string
    if (superDef.parser !== null && inferred.native == STR)
      return;
    
    error("Literal value not assignable to TypeDef.")
  }
  
  def void inExternal(ElementDef inferred, ExternalDef extDef) {
    //TODO: support external defs
    error("inExternal - Not supported yet!")
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