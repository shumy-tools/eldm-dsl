/*
 * generated by Xtext 2.15.0
 */
package net.eldm.validation

import com.google.inject.Inject
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import net.eldm.eldmDsl.EldmDslPackage
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.FuncDecl
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapEntryDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.Module
import net.eldm.eldmDsl.TypeDef
import net.eldm.eldmDsl.Var
import net.eldm.util.TypeResolver
import net.eldm.util.TypeValidator
import net.eldm.util.ValidationError
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check

import static extension net.eldm.util.ValidationStack.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class EldmDslValidator extends AbstractEldmDslValidator {
  @Inject extension TypeValidator tValidator
  @Inject extension TypeResolver tResolver
  
  def tryValidation(EObject obj, ()=>void tryFunc) {
    try {
      obj.push
        tryFunc.apply
      pop
    } catch (ValidationError err) {
      println("COMPILER-ERROR: " + err.message)
      this.error(err.message, err.obj, null)
    } catch (Throwable ex) {
      this.error("Internal compiler error. Please report this bug.", obj, null)
      ex.printStackTrace
    }
  }
  
  def detectRepeatedKey(List<String> list) {
    val detected = new ArrayList<String>
    if (list.length > 1)
      for (i : 0..(list.length - 2))
        for (j : (i+1)..(list.length - 1))
          if (list.get(i) == list.get(j))
            detected.add(list.get(i))
    
    return detected
  }
  
  def boolean isMapDef(ElementDef param) {
    if (param instanceof MapDef)
      return true
    
    val tRef = param.ref 
    if (tRef instanceof TypeDef)
      if (tRef.type instanceof ElementDef)
        return (tRef.type as ElementDef).isMapDef
    
    //TODO: if (param.ref instanceof ExternalDef)
    
    return false
  }
  
  /*TODO: required validations
   * variables are only available in Function body
   * Verify the use of reserved keywords in map and enum entries
  */
  
  @Check
  def void checkModule(Module it) {
    // check unique definitions
    val uniques = new HashSet<String>
    imports.filter[defs !== null].flatMap[defs].forEach[
      if(uniques.contains(name))
        error('''Multiple definitions with the same name.''', it, EldmDslPackage.Literals.EXTERNAL_DEF__REF)
      uniques.add(name)
    ]
    
    defs.forEach[
      if(uniques.contains(name))
        error('''Multiple definitions with the same name.''', it, EldmDslPackage.Literals.DEFINITION__NAME)
      uniques.add(name)
    ]
    
    // variable defs are only available in Functions
    eAllContents.filter(Var).forEach[
      if (!let)
        error('''Variables are only available in function bodies.''', it, EldmDslPackage.Literals.VAR__LET)
    ]
  }
  
  @Check
  def void checkFuncDecl(FuncDecl it) {
    //TODO: check unique name in the sub-path
    
    if (param !== null && !param.isMapDef)
      error('''The parameter can only be a map definition.''', it, EldmDslPackage.Literals.FUNC_DECL__PARAM)
    
    if (result !== null && !result.isMapDef)
      error('''The result can only be a map definition.''', it, EldmDslPackage.Literals.FUNC_DECL__RESULT)
  }
  
  @Check
  def void checkVarCase(Var it) {
    if (name != name.toLowerCase)
      warning("Incorrect name for let-value! Set all chars to lower-case.", it, EldmDslPackage.Literals.VAR__NAME)
  }
  
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
  def void checkMapDefUniqueKeys(MapDef it) {
    val list = it.defs.map[name]
    val keys = list.detectRepeatedKey
    
    if (!keys.empty)
      error('''Multiple keys with the same name [«keys.join(", ")»]''', it, EldmDslPackage.Literals.MAP_DEF__DEFS)
  }
  
  @Check
  def void checkMapLitteralUniqueKeys(MapLiteral it) {
    val list = entries.map[name]
    val keys = list.detectRepeatedKey
    
    if (!keys.empty)
      error('''Multiple keys with the same name [«keys.join(", ")»]''', it, EldmDslPackage.Literals.MAP_LITERAL__ENTRIES)
  }
  
  @Check
  def void checkEnumDef(EnumDef ed) {
    if (ed.type === null) {
      ed.defs.forEach[
        if (value !== null)
          error("Enum has no value definition.", it, EldmDslPackage.Literals.ENUM_ITEM_DEF__NAME)
      ]
      
      return
    }
    
    ed.defs.forEach[
      tryValidation[ value.inferType.inElement(ed.type) ]
    ]
  }
  
  @Check
  def void checkVar(Var it) {
    val x = it
    tryValidation[
      val rType = x.result.inferType
      rType.inElement(x.type)
    ]
  }
}
