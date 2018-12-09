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
      
      definitions:
        typedef Subject { id: int, name: no-type }
      
    ''', "Couldn't resolve reference to Definition 'no-type'.")
  }
  
  @Test
  def void testMultipleKeysWithSameName() {
    ph.testExpectedError('''
      module /test
      
      definitions:
        typedef Subject { id?: int, id: str, name: str }
      
    ''', "Multiple keys with the same name.")
  }
  
  @Test
  def void testEnumInvalidType() {
    ph.testExpectedError('''
      module /test
      
      definitions:
        typedef Sex enum { desc: str }:
          M { desc: 10 }
          F { desc: 'Female' }
      
    ''', "Native value not assignable to type 'str'.")
  }
  
  @Test
  def void testEnumNonExistentDef() {
    ph.testExpectedError('''
      module /test
      
      definitions:
        typedef Sex enum { desc: str }:
          M { des: 'Male' }
          F { desc: 'Female' }
      
    ''', "KeyDef 'des' does not exist.")
  }
  
  @Test
  def void testEnumMandatoryDefNotSet() {
    ph.testExpectedError('''
      module /test
      
      definitions:
        typedef Sex enum { id: int, desc: str }:
          M { id: 10, desc: 'Male' }
          F { desc: 'Female' }
      
    ''', "Mandatory KeyDef 'id' not set.")
  }
  
  @Test
  def void testInvalidMap() {
    ph.testExpectedError('''
      module /test
      
      definitions:
        typedef List ..{ id: int }
        
        typedef Sex enum { id: int, list: List }:
          M { id: 10, list: map@'[ { id: 10 } ]' }
      
    ''', "Literal value not assignable to ListDef.")
  }
  
  @Test
  def void testCorrect() {
    ph.test('''
      module /test
      
      definitions:
        typedef ptr mask 'A#a#-##.n#NX'
        
        typedef email match """[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}"""
        
        typedef Subject {
          id: int
          name: ptr
          comp: {
            email: email
            arr: ..{ id?: int, or = 10 }
          }
        }
        
        typedef Other { id: int, date: lda }
        
        typedef List ..{ id?: int, or = 10 }
        
        typedef ListRef {
          id?: int
          or = 10
          list: List
        }
        
        typedef Sex enum { desc: str, other?: Other, list?: List, mail?: email }:
          M { desc: str@'Male', list: [ { id: int@'12' }, map@'{ id: 5, or: 3 }' ] }
          F { desc: 'Female', other: { id: int@"""10""", date: lda@'2018-01-20' }, mail: email@'alex@gmail.com' }
          O { desc: """Other""", list: List@'[ { id: 3 }, { id: 10, or: 11 } ]' }
        
        typedef New enum { id: flt, seq?: ptr }:
          ALEX { id: 1.3, seq: ptr@'R3g7-60.e5U\' }
      
    ''')
  }
}