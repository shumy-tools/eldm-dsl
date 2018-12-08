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
  
  
  
  
  // isValidAssignment ------------------------------------------------
  def String isValidAssignment(Definition defDef, Literal lValue) {
    switch defDef {
      TypeDef: return defDef.isValidAssignment(lValue)
      ExternalDef: return defDef.isValidAssignment(lValue)
      default: return '''Unsupported Definition: «defDef.class». Please report this bug.'''
    }
  }
  
  def String isValidAssignment(TypeDef typeDef, Literal lValue) {
    if (typeDef.type !== null)
      return typeDef.type.isValidAssignment(lValue)
     
    if (typeDef.parser !== null) {
      val pattern = typeDef.parse(lValue)
      if (pattern !== null)
        return null
    }
    
    return "Literal value not assignable to TypeDef."
  }
  
  def String isValidAssignment(ElementDef elmDef, Literal lValue) {
    if (elmDef.native !== null) {
      switch elmDef.native {
        case ANY: return null
        case PATH: if (lValue.path !== null || elmDef.parse(lValue) !== null) return null
        
        case BOOL: if (lValue instanceof BoolLiteral || elmDef.parse(lValue) !== null) return null
        case STR: if (lValue instanceof StrLiteral || elmDef.parse(lValue) !== null) return null
        case INT: if (lValue instanceof IntLiteral || elmDef.parse(lValue) !== null) return null
        case FLT: if (lValue instanceof FltLiteral || elmDef.parse(lValue) !== null) return null
        
        case LDA,
        case LTM,
        case LDT: if (elmDef.parse(lValue) !== null) return null
        
        default: return '''Unsupported native type: «elmDef.native». Please report this bug.'''
      }
      
      return '''Native value not assignable to type '«elmDef.native»'.'''
    }
    
    if (elmDef.ref !== null)
      return elmDef.ref.isValidAssignment(lValue)
    
    switch elmDef {
      MapDef: return elmDef.isValidAssignment(lValue)
      ListDef: return elmDef.isValidAssignment(lValue)
      EnumDef: return elmDef.isValidAssignment(lValue)
      default: return '''Unsupported ElementDef: «elmDef.class». Please report this bug.'''
    }
  }
  
  def String isValidAssignment(MapDef mapDef, Literal lValue) {
    val use = mapDef.parse(lValue) ?: lValue
    
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
    val use = lstDef.parse(lValue) ?: lValue
    
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
    val use = enumRef.parse(lValue) ?: lValue
    
    if (use instanceof EnumLiteral) {
      for (ed : enumRef.defs)
        if (ed === use.ref)
          return null
    }
    
    return "Literal value not assignable to EnumDef."
  }
  
  def String isValidAssignment(ExternalDef extDef, Literal lValue) {
    return "External definitions not yet supported!" //TODO: support external defs
    
    //return "Literal value not assignable to ExternalDef."
  }
}