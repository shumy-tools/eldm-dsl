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
  
  // parse only match | mask
  def parse(TypeDef typeDef, Literal it) {
    if (it instanceof PatternLiteral)
      if (typeDef === ref)
        return parseTypeDef
    
    return null
  }
  
  def parse(ElementDef elmDef, Literal it) {
    if (it instanceof PatternLiteral) {
      if (elmDef.native == native)
        return parseElementDef
      
      switch elmDef {
        MapDef case native == 'map', 
        ListDef case native == 'lst',
        EnumDef case native == 'enum': return parseElementDef
      }
      
      if (elmDef === ref)
        return parseTypeDef
    }
    
    return null
  }
  
  private def Literal parseTypeDef(PatternLiteral value) {
    try {
      if (value.ref !== null) {
        if (value.ref instanceof TypeDef && (value.ref as TypeDef).parser !== null)
          return value.parseTypeDefPattern
          
        val text = value.extractText
        return Literal.parse(text)
      } else
        throw new RuntimeException("parseTypeDef: unsupported path") // same path as parseElementDef!
    } catch (Throwable ex) {
      ex.printStackTrace
      return null
    }
  }
  
  private def Object parseElementDef(PatternLiteral value) {
    try {
      val text = value.extractText
      switch value.native {
        case ANY:  return text
        case PATH: if (text.matches("(/[a-z0-9-])*")) return text //TODO: return a Path class!
        
        case BOOL: return Boolean.parseBoolean(text)
        case STR:  return text
        case INT:  return Long.parseLong(text)
        case FLT:  return Double.parseDouble(text)
        
        case LDA:  return LocalDate.parse(text)
        case LTM:  return LocalTime.parse(text)
        case LDT:  return LocalDateTime.parse(text)
        
        case MAP: return MapLiteral.parse(text)
        case LST: return ListLiteral.parse(text)
        case ENUM: return EnumLiteral.parse(text)
      }
      
      return null
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
      case 'match': if (text.matches(code)) return eFact.createStrLiteral => [ value = text ]
      case 'mask': throw new RuntimeException("mask type not supported yet")
    }
    
    return null
  }
  
  private def <T extends Literal> T parse(Class<T> type, String code) {
    val rule = switch type {
      case MapLiteral: eldmRules.mapLiteralRule
      case ListLiteral: eldmRules.listLiteralRule
      case EnumLiteral: eldmRules.enumLiteralRule
      default: eldmRules.literalRule
    }
    
    val result = eldmParser.parse(rule, new StringReader(code))
    if (result.hasSyntaxErrors) {
      result.syntaxErrors.forEach[ println(it) ]
      return null
    }
    
    return result.rootASTElement as T
  }
  
  private def extractText(PatternLiteral value) {
    value.text.extract
  }
  
  private def extractCode(TypeDef value) {
    value.code.extract
  }
  
  private def extract(String value) {
    if (value.startsWith("'"))
      return value.substring(1, value.length - 1) // ' -> '
    else
      return value.substring(3, value.length - 3) // """ -> """
  }
}