package net.eldm.validation

import java.io.StringReader
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.Definition
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementTypeDef
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
import net.eldm.eldmDsl.ValueDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

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
  
  // inline parsers ----------------------------------------------------------
  def Object parseNative(PatternLiteral value) {
    try {
      val text = value.extractText
      switch value.native {
        case 'str':  return text
        case 'bool': return Boolean.parseBoolean(text)
        case 'int':  return Long.parseLong(text)
        case 'flt':  return Double.parseDouble(text)
        case 'lda':  return LocalDate.parse(text)
        case 'ltm':  return LocalTime.parse(text)
        case 'ldt':  return LocalDateTime.parse(text)
        
        case 'path': if (text.matches("/([a-z]|[0-9]|-)*)*")) return text //TODO: return a Path class!
        case 'map': return eldmParser.parse(eldmRules.mapLiteralRule, new StringReader(text)).rootASTElement as MapLiteral
        case 'lst': return eldmParser.parse(eldmRules.listLiteralRule, new StringReader(text)).rootASTElement as ListLiteral
        case 'enum': return eldmParser.parse(eldmRules.enumLiteralRule, new StringReader(text)).rootASTElement as EnumLiteral
      }
      
      return null
    } catch (Throwable ex) {
      ex.printStackTrace
      return null
    }
  }
  
  def Literal parseTypeDef(PatternLiteral value) {
    try {
      if (value.ref !== null) {
        if (value.ref instanceof TypeDef && (value.ref as TypeDef).parser !== null)
          return value.parseTypeDefPattern
          
        val text = value.extractText
        return eldmParser.parse(eldmRules.literalRule, new StringReader(text)).rootASTElement as Literal
      } else
        throw new RuntimeException("parseTypeDef: unsupported path") // the same parseNative!
    } catch (Throwable ex) {
      ex.printStackTrace
      return null
    }
  }
  
  def Literal parseTypeDefPattern(PatternLiteral value) {
    val eFact = EldmDslFactory.eINSTANCE
    
    val tDef = value.ref as TypeDef
    val code = tDef.extractCode
    val text = value.extractText
    
    switch tDef.parser {
      case 'regex': if (text.matches(code)) return eFact.createStrLiteral => [ value = text ]
      
      //TODO: cases
      //case 'mask':
      //case 'code': 
    }
    
    return null
  }
  
  // getType ----------------------------------------------------------
  def getEntryType(MapEntryDef kd) {
    return kd.type ?: kd.value.literalType //TODO: cache return type on kd.type ?
  }
  
  def ElementTypeDef getLiteralType(Literal value) {
    val eFact = EldmDslFactory.eINSTANCE
    
    if (value === null)
      return eFact.createValueDef => [ native = 'any' ]
    
    switch value {
      BoolLiteral: return eFact.createValueDef => [ native = 'bool' ]
      StrLiteral: return eFact.createValueDef => [ native = 'str' ]
      IntLiteral: return eFact.createValueDef => [ native = 'int' ]
      FltLiteral: return eFact.createValueDef => [ native = 'flt' ]
      
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
    return null as ElementTypeDef
  }
  
  // isValidAssignment ------------------------------------------------
  def dispatch String isValidAssignment(ElementTypeDef type, Literal value) {
    if (type instanceof ValueDef)
      return (type as ValueDef).isValidAssignment(value)
    else // Definition reference
      return (type.ref as Definition).isValidAssignment(value)
  }
  
  /*def String isValidPatternAssignment(Definition defType, String value) {
    val it = eldmParser.parse(eldmRules.literalRule, new StringReader(value))
    if (hasSyntaxErrors)
      return "Pattern value not assignable to Definition."
    
    return defType.isValidAssignment(rootASTElement as Literal)
  }*/
  
  def dispatch String isValidAssignment(Definition defType, Literal value) {
    // TypeDef ------------------------------------------------------
    if (defType instanceof TypeDef) {
      if (defType.type instanceof ValueDef)
        return (defType.type as ValueDef).isValidAssignment(value)
      else { // parser reference
        val pattern = value.parsePattern(defType)
        if (pattern !== null)
          return null
        //return defType.isValidAssignment(pattern as Literal)
      }
    }
    
    // EnumDef ------------------------------------------------------
    if (defType instanceof EnumDef)
      return (defType as EnumDef).isValidAssignment(value)
    
    // ExternalDef --------------------------------------------------
    if (defType instanceof ExternalDef)
      return (defType as ExternalDef).isValidAssignment(value)
    
    return "Literal value not assignable to Definition."
  }
  
  def dispatch String isValidAssignment(ValueDef type, Literal value) {
    if (type.native !== null)
      return isValidNativeAssignment(type.native, value)
    
    if (type instanceof MapDef)
      return (type as MapDef).isValidAssignment(value)
    
    if (type instanceof ListDef)
      return (type as ListDef).isValidAssignment(value)
    
    return "Literal value not assignable to ValueDef."
  }
  
  def dispatch String isValidAssignment(MapDef type, Literal lValue) {
    val pattern = lValue.parsePattern("map")
    val use = pattern ?: lValue
    
    if (use instanceof MapLiteral) {
      // Invalid KeyDef sets!
      for(entry : use.entries) {
        val kd = type.getKeyDef(entry)
        if (kd === null)
          return '''KeyDef '«entry.name»' does not exist.'''
        
        val msg = kd.entryType.isValidAssignment(entry.value)
        if (msg !== null)
          return msg
      }
      
      // mandatory KeyDef not set!
      val mandatory = type.defs.filter[!opt]
      //println('''«type.defs.map['''(«name», «opt»)''']» -> «mandatory.map[name]»''')
      for(keyDef : mandatory)
        if (!use.contains(keyDef))
          return '''Mandatory KeyDef '«keyDef.name»' not set.'''
      
      return null
    }
    
    return "Literal value not assignable to MapDef."
  }
  
  def dispatch String isValidAssignment(ListDef lst, Literal lValue) {
    val pattern = lValue.parsePattern("lst")
    val use = pattern ?: lValue
    
    if (use instanceof ListLiteral) {
      for (item : use.vals) {
        val msg = lst.type.isValidAssignment(item)
        if (msg !== null)
          return msg
      }
      
      return null
    }
    
    return "Literal value not assignable to ListDef."
  }
  
  def dispatch String isValidAssignment(EnumDef enumRef, Literal lValue) {
    val pattern = lValue.parsePattern("enum")
    val use = pattern ?: lValue
    
    if (use instanceof EnumLiteral) {
      for (ed : enumRef.defs)
        if (ed === use.ref)
          return null
    }
    
    return "Literal value not assignable to EnumDef."
  }
  
  def dispatch String isValidAssignment(ExternalDef externalRef, Literal value) {
    return "External definitions not yet supported!" //TODO: support external defs
  }
  
  def String isValidNativeAssignment(String nativeType, Literal value) {
    switch nativeType {
      case "any": return null
      case "bool": if (value instanceof BoolLiteral || value.parsePattern(nativeType) !== null) return null
      case "str": if (value instanceof StrLiteral || value.parsePattern(nativeType) !== null) return null
      case "int": if (value instanceof IntLiteral || value.parsePattern(nativeType) !== null) return null
      case "flt": if (value instanceof FltLiteral || value.parsePattern(nativeType) !== null) return null
      case "path": if (value.path !== null || value.parsePattern(nativeType) !== null) return null
    }
    
    return '''Native value not assignable to type '«nativeType»'.'''
  }
  
  private def parsePattern(Literal value, String nativeType) {
    if (value instanceof PatternLiteral)
      if (value.native == nativeType)
        return value.parseNative
    
    return null
  }
  
  private def parsePattern(Literal value, TypeDef type) {
    if (value instanceof PatternLiteral)
      if (value.ref === type)
        return value.parseTypeDef
    
    return null
  }
  
  private def extractText(PatternLiteral value) {
    if (value.text.startsWith("'"))
      return value.text.substring(1, value.text.length - 1) // ' -> '
    else
      return value.text.substring(3, value.text.length - 3) // """ -> """
  }
  
  private def extractCode(TypeDef value) {
    if (value.code.startsWith("'"))
      return value.code.substring(1, value.code.length - 1) // ' -> '
    else
      return value.code.substring(3, value.code.length - 3) // """ -> """
  }
}