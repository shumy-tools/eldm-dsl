package net.eldm.tests

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
  
  static def void test(ParseHelper<?> ph, CharSequence code) {
    val it = ph.parse(code)
    assertNotNull(it)
    
    val errors = validate(eResource)
    assertTrue(errors.empty, '''Unexpected errors: «errors.map[message].join(", ")»''')
  }
  
  static def void testForAnyError(ParseHelper<?> ph, CharSequence code) {
    val it = ph.parse(code)
    assertNotNull(it)
    
    val issues = validate(eResource)
    assertTrue(!issues.empty, '''Expecting errors, but no errors returned!''')
  }
  
  static def void testExpectedErrors(ParseHelper<?> ph, CharSequence code, String ...msgList) {
    val it = ph.parse(code)
    assertNotNull(it)
    
    val issues = validate(eResource)
    val expected = issues.filter[!msgList.filter[ msg | message == msg].empty]
    val unexpected = issues.filter[msgList.filter[ msg | message == msg].empty]
    
    assertTrue(unexpected.empty, '''Unexpected errors of type: «unexpected.map[message].join(", ")»''')
    assertTrue(expected.length === msgList.length, '''Expecting errors of type: «msgList.join(", ")» -> Only present: «expected.map[message].join(", ")»''')
  }
}