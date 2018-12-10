package net.eldm.util

import com.google.inject.Inject
import java.io.StringReader
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TypeDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess

import static net.eldm.spi.Natives.*

class PatternParser {
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
  
  def Literal parse(PatternLiteral value) {
    val text = if (value.native == STR) value.text else value.extractText
    
    val result = eldmParser.parse(eldmRules.literalRule, new StringReader(text))
    if (result.hasSyntaxErrors || !(result.rootASTElement instanceof Literal)) {
      println('''Failed to parse («text») to «value.native ?: value.ref.name»''')
      return null
    }
    
    val res = result.rootASTElement as Literal
    
    //validate if it's assignable to value.native ?
    if (value.native !== null && res.is(value.native))
      return res
    
    //validate if it's assignable to value.ref ?
    if (value.ref !== null && res.is(value.ref) === null)
      return res
    
    return null
  }
  
  def <T extends Literal> T parse(Class<T> type, Literal value) {
    if (value instanceof PatternLiteral)
      return type.parse(value)
    
    return null
  }
  
  def <T extends Literal> T parse(Class<T> type, PatternLiteral value) {
    val res = value.parse
    
    if (res === null) return null
    if (!type.isAssignableFrom(res.class)) return null
    
    return res as T
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
          case 'X': if ("-!$%^&*()_+|~=`{}[]:\";'<>?,./\\ ".contains(v)) vIndex++ else return false
          
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