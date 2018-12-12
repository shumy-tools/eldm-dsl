package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.io.StringReader
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.TypeDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import net.eldm.validation.EldmDslValidator

import static extension net.eldm.spi.Natives.*

@Singleton
class PatternParser {
  @Inject EldmDslParser eldmParser
  @Inject EldmDslGrammarAccess eldmRules
  @Inject extension TypeValidator tValidator
  @Inject extension TypeResolver tResolver
  @Inject extension EldmDslValidator eValidator
  
  def Literal parse(PatternLiteral value) {
    val eFact = EldmDslFactory.eINSTANCE
    val text = if (value.native == STR) value.text else value.extractText
    
    if (value.ref instanceof TypeDef && (value.ref as TypeDef).parser !== null) {
      val tDef = value.ref as TypeDef
      val code = tDef.extractCode
      
      switch tDef.parser {
        case 'match': if (text.matches(code)) return eFact.createStrLiteral => [ value = text ]
        case 'mask': if (text.masked(code)) return eFact.createStrLiteral => [ value = text ]
      }
      
      value.error('''Failed to parse '«text»' to pattern «value.native ?: value.ref.name».''')
      return null
    }
    
    val result = eldmParser.parse(eldmRules.literalRule, new StringReader(text))
    if (result.hasSyntaxErrors || !(result.rootASTElement instanceof Literal)) {
      value.error('''Failed to parse '«text»' to pattern «value.native ?: value.ref.name».''')
      return null
    }
    
    val res = result.rootASTElement as Literal
    val elmDef = res.inferType
    
    //TODO: check for validations in the EldmDslValidator!
    
    //validate if it's assignable to value.native ?
    if (value.native !== null) {
      val superDef = eFact.createElementDef => [ native = value.native ]
      if (elmDef.inElement(superDef))
        return res
    }
    
    //validate if it's assignable to value.ref ?
    if (value.ref !== null) {
      if (elmDef.inDefinition(value.ref))
        return res
    }
    
    value.error('''Failed to assign parsed value '«text»' to pattern «value.native ?: value.ref.name».''')
    return null
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