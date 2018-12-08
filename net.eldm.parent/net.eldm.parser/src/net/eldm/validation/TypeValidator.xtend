package net.eldm.validation

import net.eldm.core.EldmInlineParser
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.Definition
import net.eldm.eldmDsl.EldmDslFactory
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
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TypeDef
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static net.eldm.Natives.*

@FinalFieldsConstructor
class TypeValidator {
  val extension EldmInlineParser iParser
  
  def contains(MapLiteral obj, MapEntryDef type) {
    for (entry : obj.entries)
      if (entry.name == type.name)
        return true
    return false
  }
  
  def getKeyDef(MapDef type, MapEntryLiteral entry) {
    for (it : type.defs)
      if (name == entry.name)
        return it
    return null
  }
  
  // getType ----------------------------------------------------------
  def getEntryType(MapEntryDef kd) {
    return kd.type ?: kd.value.literalType //TODO: cache return type on kd.type ?
  }
  
  def ElementDef getLiteralType(Literal value) {
    val eFact = EldmDslFactory.eINSTANCE
    
    if (value === null)
      return eFact.createElementDef => [ native = ANY ]
    
    switch value {
      BoolLiteral: return eFact.createElementDef => [ native = BOOL ]
      StrLiteral: return eFact.createElementDef => [ native = STR ]
      IntLiteral: return eFact.createElementDef => [ native = INT ]
      FltLiteral: return eFact.createElementDef => [ native = FLT ]
      
      ListLiteral: return eFact.createListDef => [
        type = (value as ListLiteral).vals.head.literalType
      ]
      
      MapLiteral: return eFact.createMapDef => [
        defs += (value as MapLiteral).entries.map[ entry |
          eFact.createMapEntryDef => [
            opt = false
            name = entry.name
            type = entry.value.literalType
          ]
        ]
      ]
      
      EnumLiteral: return (value as EnumLiteral).ref.value.literalType
      
      // TODO: cases
      //PatternLiteral:
      //case value.path !== null:
    }
    
    //TODO: --------  construct list | map | ... on demand!
    return null as ElementDef
  }
  
  
  
  
  
  def String isValidAssignment(Definition defType, Literal value) {
    // TypeDef ------------------------------------------------------
    if (defType instanceof TypeDef) {
      if (defType.type instanceof ElementDef)
        return (defType.type as ElementDef).isValidAssignment(value)
      else { // parser reference
        val pattern = value.parsePattern(defType)
        if (pattern !== null)
          return null
        //return defType.isValidAssignment(pattern as Literal)
      }
    }
    
    // ExternalDef --------------------------------------------------
    if (defType instanceof ExternalDef)
      return (defType as ExternalDef).isValidAssignment(value)
    
    return "Literal value not assignable to Definition."
  }
  
  // isValidAssignment ------------------------------------------------
  def String isValidAssignment(ElementDef type, Literal value) {
    if (type.native !== null) {
      switch type.native {
        case ANY: return null
        case BOOL: if (value instanceof BoolLiteral || type.parsePattern(value) !== null) return null
        case STR: if (value instanceof StrLiteral || type.parsePattern(value) !== null) return null
        case INT: if (value instanceof IntLiteral || type.parsePattern(value) !== null) return null
        case FLT: if (value instanceof FltLiteral || type.parsePattern(value) !== null) return null
        case PATH: if (value.path !== null || type.parsePattern(value) !== null) return null
      }
      return '''Native value not assignable to type '«type.native»'.'''
    }
    
    if (type.ref !== null)
      return type.ref.isValidAssignment(value)
    
    switch type {
      MapDef: return type.isValidAssignment(value)
      ListDef: return type.isValidAssignment(value)
      EnumDef: return type.isValidAssignment(value)
    }
    
    return "Literal value not assignable to ElementDef."
  }
  
  def String isValidAssignment(MapDef mapDef, Literal lValue) {
    val pattern = mapDef.parsePattern(lValue)
    val use = pattern ?: lValue
    
    if (use instanceof MapLiteral) {
      // Invalid KeyDef sets!
      for(entry : use.entries) {
        val kd = mapDef.getKeyDef(entry)
        if (kd === null)
          return '''KeyDef '«entry.name»' does not exist.'''
        
        val msg = kd.entryType.isValidAssignment(entry.value)
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
  
  def String isValidAssignment(ListDef lstDef, Literal lValue) {
    val pattern = lstDef.parsePattern(lValue)
    val use = pattern ?: lValue
    
    if (use instanceof ListLiteral) {
      for (item : use.vals) {
        val msg = lstDef.type.isValidAssignment(item)
        if (msg !== null)
          return msg
      }
      
      return null
    }
    
    return "Literal value not assignable to ListDef."
  }
  
  def String isValidAssignment(EnumDef enumRef, Literal lValue) {
    val pattern = enumRef.parsePattern(lValue)
    val use = pattern ?: lValue
    
    if (use instanceof EnumLiteral) {
      for (ed : enumRef.defs)
        if (ed === use.ref)
          return null
    }
    
    return "Literal value not assignable to EnumDef."
  }
  
  def String isValidAssignment(ExternalDef externalRef, Literal value) {
    return "External definitions not yet supported!" //TODO: support external defs
  }
}