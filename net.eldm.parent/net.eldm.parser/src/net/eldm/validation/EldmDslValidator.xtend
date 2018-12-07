/*
 * generated by Xtext 2.15.0
 */
package net.eldm.validation

import com.google.inject.Inject
import net.eldm.eldmDsl.EldmDslPackage
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.TypeDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class EldmDslValidator extends AbstractEldmDslValidator {
  @Inject EldmDslParser eldmParser
  @Inject EldmDslGrammarAccess eldmRules
  
  @Check
  def checkTypeDefCase(TypeDef it) {
    if (parser !== null) {
      if (name != name.toLowerCase)
        warning("Incorrect name for string-type! Set all chars to lower-case.", it, EldmDslPackage.Literals.DEFINITION__NAME)
    } else
      if (name != name.toFirstUpper)
        warning("Incorrect name for structure! Set the first char to upper-case.", it, EldmDslPackage.Literals.DEFINITION__NAME)
  }
  
  @Check
  def void checkKeyDefCase(MapEntryDef it) {
    if (name != name.toLowerCase)
      warning("Incorrect name for key! Set all chars to lower-case.", it, EldmDslPackage.Literals.MAP_ENTRY_DEF__NAME)
  }
  
  @Check
  def void checkMapDefUniqueKeys(MapEntryDef kd) {
    val parent = (kd.eContainer as MapDef)
    if (parent.defs.filter[name == kd.name].size > 1)
      error("Multiple keys with the same name.", kd, EldmDslPackage.Literals.MAP_ENTRY_DEF__NAME)
  }
  
  @Check
  def void checkEnumDef(EnumDef ed) {
    val tVal = new TypeValidator(eldmParser, eldmRules)
    ed.defs.forEach[
      val msg = tVal.isValidAssignment(ed.type, value)
      if (msg !== null)
        error(msg, it, EldmDslPackage.Literals.ENUM_ITEM_DEF__VALUE)
    ]
  }
}
