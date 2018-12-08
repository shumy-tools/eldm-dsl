package net.eldm.core

import java.io.StringReader
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.TypeDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static net.eldm.Natives.*

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
  
  def parsePattern(ElementDef type, Literal value) {
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
        case ANY:  return text
        case BOOL: return Boolean.parseBoolean(text)
        case STR:  return text
        case INT:  return Long.parseLong(text)
        case FLT:  return Double.parseDouble(text)
        case PATH: if (text.matches("/([a-z]|[0-9]|-)*)*")) return text //TODO: return a Path class!
        
        case LDA:  return LocalDate.parse(text)
        case LTM:  return LocalTime.parse(text)
        case LDT:  return LocalDateTime.parse(text)
        
        case MAP: return eldmParser.parse(eldmRules.mapLiteralRule, new StringReader(text)).rootASTElement as MapLiteral
        case LST: return eldmParser.parse(eldmRules.listLiteralRule, new StringReader(text)).rootASTElement as ListLiteral
        case ENUM: return eldmParser.parse(eldmRules.enumLiteralRule, new StringReader(text)).rootASTElement as EnumLiteral
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