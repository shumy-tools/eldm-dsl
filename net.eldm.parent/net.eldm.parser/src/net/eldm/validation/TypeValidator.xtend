package net.eldm.validation

import net.eldm.eldmDsl.ElementTypeDef
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapEntryLiteral
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.ValueDef
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.TypeDef
import java.time.LocalDate
import java.time.LocalTime
import java.time.LocalDateTime
import net.eldm.eldmDsl.Definition
import net.eldm.eldmDsl.ExternalDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import java.io.StringReader

@FinalFieldsConstructor
class TypeValidator {
  val EldmDslParser eldmParser
  val EldmDslGrammarAccess eldmRules
  
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
  
  def Object parse(PatternLiteral value) {
    try {
      val tValue = value.text.substring(1, value.text.length - 1)
      switch value.native {
        case 'str':  return tValue
        case 'bool': return Boolean.parseBoolean(tValue)
        case 'int':  return Long.parseLong(tValue)
        case 'flt':  return Double.parseDouble(tValue)
        case 'lda':  return LocalDate.parse(tValue)
        case 'ltm':  return LocalTime.parse(tValue)
        case 'ldt':  return LocalDateTime.parse(tValue)
        case 'path': if (tValue.matches("/([a-z]|[0-9]|-)*)*")) return tValue //TODO: return a Path class!
        default: return null
      }
    } catch (Throwable ex) {
      ex.printStackTrace
      return null
    }
  }
  
  // getType ----------------------------------------------------------
  def getType(MapEntryDef kd) {
    return kd.type ?: kd.value.type
  }
  
  def ElementTypeDef getType(Literal value) {
    //TODO: --------  construct list | map | ... on demand!
    return null as ElementTypeDef
  }
  
  // isValidAssignment ------------------------------------------------
  def String isValidAssignment(ElementTypeDef type, Literal value) {
    if (type instanceof ValueDef)
      return (type as ValueDef).isValidAssignment(value)
    else // Definition reference
      return (type.ref as Definition).isValidAssignment(value)
  }
  
  def String isValidPatternAssignment(Definition defType, String value) {
    val it = eldmParser.parse(eldmRules.literalRule, new StringReader(value))
    if (hasSyntaxErrors)
      return "Pattern value not assignable to Definition."
    
    return defType.isValidAssignment(rootASTElement as Literal)
  }
  
  def String isValidAssignment(Definition defType, Literal value) {
    // TypeDef ------------------------------------------------------
    if (defType instanceof TypeDef) {
      if (defType.type !== null && defType.type instanceof ValueDef)
        return (defType.type as ValueDef).isValidAssignment(value)
      else if (value instanceof PatternLiteral) { // Pattern reference
        if (value.native !== null && value.parse !== null)
          return null
        else // Definition reference
          return (value.ref as Definition).isValidPatternAssignment(value.text)
      }
    }
    
    // EnumDef ------------------------------------------------------
    if (defType instanceof EnumDef && value instanceof EnumLiteral)
      return (defType as EnumDef).isValidAssignment(value as EnumLiteral)
    
    // ExternalDef --------------------------------------------------
    if (defType instanceof ExternalDef)
      return "External definitions not yet supported!" //TODO: support external defs
    
    return "Literal value not assignable to Definition."
  }
  
  def String isValidAssignment(ValueDef type, Literal value) {
    if (type.native !== null)
      return isValidNativeAssignment(type.native, value)
    
    if (type instanceof MapDef && value instanceof MapLiteral)
      return (type as MapDef).isValidAssignment(value as MapLiteral)
    
    if (type instanceof ListDef && value instanceof ListLiteral)
      return (type as ListDef).isValidAssignment(value as ListLiteral)
    
    return "Literal value not assignable to ValueDef."
  }
  
  def String isValidNativeAssignment(String nativeType, Literal value) {
    switch nativeType {
      case "any": return null
      case "bool": if (value instanceof BoolLiteral || value.isValidPatternType(nativeType)) return null
      case "str": if (value instanceof StrLiteral || value.isValidPatternType(nativeType)) return null
      case "int": if (value instanceof IntLiteral || value.isValidPatternType(nativeType)) return null
      case "flt": if (value instanceof FltLiteral || value.isValidPatternType(nativeType)) return null
      case "path": if (value.path !== null || value.isValidPatternType(nativeType)) return null
    }
    
    return '''Native value not assignable to type '«nativeType»'.'''
  }
  
  def String isValidAssignment(MapDef type, MapLiteral obj) {
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
  
  def String isValidAssignment(ListDef lst, ListLiteral obj) {
    for (value : obj.vals) {
      val msg = lst.type.isValidAssignment(value)
      if (msg !== null)
        return msg
    }
    
    return null
  }
  
  def String isValidAssignment(EnumDef enumRef, EnumLiteral obj) {
    for (ed : enumRef.defs)
      if (ed === obj.ref)
        return null
    
    return "Enum not assignable to type."
  }
  
  private def isValidPatternType(Literal value, String nativeType) {
     if (value instanceof PatternLiteral)
       return value.native == nativeType && value.parse !== null
     
     return false
  }
}