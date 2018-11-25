package net.eldm.tests

import net.eldm.eldmDsl.Module
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode

import static org.junit.jupiter.api.Assertions.*

class TestHelper {
  static def validate(Resource resource) {
    val validator = (resource as XtextResource).resourceServiceProvider.resourceValidator
    return validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
  }
  
  static def void test(ParseHelper<Module> ph, CharSequence code) {
    val it = ph.parse(code)
    assertNotNull(it)
    assertNotNull(name)
    assertTrue(!name.empty)
    
    val errors = validate(eResource)
    assertTrue(errors.empty, '''Unexpected errors: «errors.map[message].join(", ")»''')
  }
  
  static def void testError(ParseHelper<Module> ph, CharSequence code) {
    val it = ph.parse(code)
    assertNotNull(it)
    
    val issues = validate(eResource)
    assertTrue(!issues.empty, '''Expected errors, but no errors found!''')
  }
  
  static def void testExpectedError(ParseHelper<Module> ph, CharSequence code, String msg) {
    val it = ph.parse(code)
    assertNotNull(it)
    
    val issues = validate(eResource)
    val expected = issues.filter[message == msg]
    
    assertTrue(!expected.empty, '''No expected errors of type: «msg»''')
  }
}