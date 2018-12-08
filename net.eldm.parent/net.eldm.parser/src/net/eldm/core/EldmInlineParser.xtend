package net.eldm.core

import java.io.StringReader
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.TypeDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import net.eldm.eldmDsl.ValueDef
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.ListDef

@FinalFieldsConstructor
class EldmInlineParser {
  val EldmDslParser eldmParser
  val EldmDslGrammarAccess eldmRules
  
  /*def parsePattern(Literal value, String nativeType) {
    if (value instanceof PatternLiteral)
      if (value.native == nativeType)
        return value.parseNative
    
    return null
  }
  */
  
  def parsePattern(Literal value, TypeDef type) {
    if (value instanceof PatternLiteral)
      if (value.ref === type)
        return value.parseTypeDef
    
    return null
  }
  
  def parsePattern(Literal value, ValueDef type) {
    if (value instanceof PatternLiteral) {
      if (value.native == type.native)
        return value.parseNative
      
      //TODO: remove this hack!!
      if (
        value.native == 'map' && type instanceof MapDef
        || value.native == 'lst' && type instanceof ListDef
        || value.native == 'enum' && type instanceof EnumDef
      )
        return value.parseNative
        
      if (value.ref === type)
        return value.parseTypeDef
    }
    
    return null
  }
  
  private def Object parseNative(PatternLiteral value) {
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
  
  private def Literal parseTypeDef(PatternLiteral value) {
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
  
  private def Literal parseTypeDefPattern(PatternLiteral value) {
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