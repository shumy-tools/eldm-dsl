package net.eldm.util

import com.google.inject.Inject
import java.io.StringReader
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TypeDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import net.eldm.spi.PathLiteral

import static net.eldm.spi.Natives.*

class InlineParser {
  @Inject EldmDslParser eldmParser
  @Inject EldmDslGrammarAccess eldmRules
  @Inject extension TypeValidator tValidator
  
  def StrLiteral parsePattern(Literal value) {
    if (value instanceof PatternLiteral) {
      val eFact = EldmDslFactory.eINSTANCE
      
      val tDef = value.ref as TypeDef
      val code = tDef.extractCode
      val text = value.extractText
      
      switch tDef.parser {
        case 'match': if (text.matches(code)) return eFact.createStrLiteral => [ value = text ]
        case 'mask': if (text.masked(code)) return eFact.createStrLiteral => [ value = text ] 
      }
    }
    
    return null
  }
  
  def <T> T parse(Class<T> type, Literal value) {
    if (value instanceof PatternLiteral)
      return type.parse(value)
    
    return null
  }
  
  def <T> T parse(Class<T> type, PatternLiteral value) {
    val text = if (value.native == STR) value.text else value.extractText
    
    if (Literal.isAssignableFrom(type)) {
      val rule = switch type {
        case BoolLiteral: eldmRules.boolLiteralRule
        case StrLiteral:  eldmRules.strLiteralRule
        case IntLiteral:  eldmRules.intLiteralRule
        case FltLiteral:  eldmRules.fltLiteralRule
        
        case MapLiteral:  eldmRules.mapLiteralRule
        case ListLiteral: eldmRules.listLiteralRule
        case EnumLiteral: eldmRules.enumLiteralRule
        
        default: eldmRules.literalRule
      }
      
      val result = eldmParser.parse(rule, new StringReader(text))
      if (result.hasSyntaxErrors) {
        println('''Failed to parse («text») to type «type.simpleName»''')
        return null
      }
      
      val res = result.rootASTElement as Literal
      
      //validate if it's assignable to value.native ?
      if (value.native !== null && res.is(value.native))
        return res as T
      
      //validate if it's assignable to value.ref ?
      if (value.ref !== null && res.is(value.ref) === null)
        return res as T
      
      return null
    } else {
      val res = switch type {
        case PathLiteral: PathLiteral.parse(text)
        case LocalDate: LocalDate.parse(text)
        case LocalTime: LocalTime.parse(text)
        case LocalDateTime: LocalDateTime.parse(text)
        default: null
      }
      
      return res as T
    }
  }
  
  private def masked(String value, String mask) {
    var vIndex = 0
    try {
      for (c : mask.toCharArray) {
        val v = value.charAt(vIndex).toString
        switch c.toString {
          // any digit
          case '#': if (v.matches("[0-9]")) vIndex++ else return false
          
          // any capital letter
          case 'A': if (v.matches("[A-Z]")) vIndex++ else return false
          
          // any small letter
          case 'a': if (v.matches("[a-z]")) vIndex++ else return false
          
          // any capital alphanumeric character
          case 'N': if (v.matches("[0-9A-Z]")) vIndex++ else return false
          
          // any small alphanumeric character
          case 'n': if (v.matches("[0-9a-z]")) vIndex++ else return false
          
          // any special symbol -!$%^&*()_+|~=`{}[]:";'<>?,./\ or space
          case 'X': if ("-!$%^&*()_+|~=`{}[]:\";'<>?,./\\".contains(v)) vIndex++ else return false
          
          // matching the char
          default: if (value.charAt(vIndex) == c) vIndex++ else return false
        }
      }
      
      if (vIndex !== value.length) return false
    } catch (IndexOutOfBoundsException e) {
      return false
    }
    
    return true
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