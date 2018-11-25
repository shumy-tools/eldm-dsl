package net.eldm.tests

import com.google.inject.Inject
import net.eldm.eldmDsl.Module
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static extension net.eldm.tests.TestHelper.*

@ExtendWith(InjectionExtension)
@InjectWith(EldmDslInjectorProvider)
class TestDefinition {
  @Inject ParseHelper<Module> ph

  @Test
  def void testNonExistentType() {
    ph.testExpectedError('''
      module /test
      
      defs
        typedef Subject { id: int, name: no-type }
      
    ''', "Couldn't resolve reference to Definition 'no-type'.")
  }
  
  @Test
  def void testMultipleKeysWithSameName() {
    ph.testExpectedError('''
      module /test
      
      defs
        typedef Subject { id?: int, id: str, name: str }
      
    ''', "Multiple keys with the same name.")
  }
  
  @Test
  def void testEnumInvalidType() {
    ph.testExpectedError('''
      module /test
      
      defs
        enum SEX { desc: str }:
          M { desc: 10 }
          F { desc: 'Female' }
      
    ''', "Value not assignable to type.")
  }
  
  @Test
  def void testEnumNonExistentDef() {
    ph.testExpectedError('''
      module /test
      
      defs
        enum SEX { desc: str }:
          M { des: 'Male' }
          F { desc: 'Female' }
      
    ''', "KeyDef 'des' does not exist.")
  }
  
  @Test
  def void testEnumMandatoryDefNotSet() {
    ph.testExpectedError('''
      module /test
      
      defs
        enum SEX { id: int, desc: str }:
          M { id: 10, desc: 'Male' }
          F { desc: 'Female' }
      
    ''', "Mandatory KeyDef 'id' not set.")
  }
  
  @Test
  def void testCorrect() {
    ph.test('''
      module /test
      
      defs
        typedef date-ptr mask '####-##-##'
        typedef email regex '[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}'
        
        typedef date-type return """
          new java.time.LocalDate.parse(it)
        """
        
        typedef Subject {
          id: int
          name: date-type
          comp: {
            email: email
            arr: ..{ id?: int, or = 10 }
          }
        }
        
        typedef List ..{ id?: int, or = 10 }
        
        typedef ListRef {
          id?: int
          or = 10
          list: List
        }
        
        enum SEX { desc: str }:
          M { desc: 'Male' }
          F { desc: 'Female' }
      
    ''')
  }
}