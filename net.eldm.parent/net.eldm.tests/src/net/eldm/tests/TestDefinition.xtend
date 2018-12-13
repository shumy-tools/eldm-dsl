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
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef Subject { id: int, name: no-type }
      
    ''', "Couldn't resolve reference to Definition 'no-type'.")
  }
  
  @Test
  def void testMultipleKeysWithSameName() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef Subject { id?: int, id: str, name: str }
      
    ''', "Multiple keys with the same name.")
  }
  
  @Test
  def void testEnumInvalidType() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef Sex enum { desc: str }:
          M { desc: 10 }
          F { desc: 'Female' }
      
    ''',
      "Enum value no assignable to enum type."
    )
  }
  
  @Test
  def void testEnumNonExistentDef() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef Sex enum { desc: str }:
          M { des: 'Male' }
          F { desc: 'Female' }
      
    ''',
      "Enum value no assignable to enum type."
    )
  }
  
  @Test
  def void testEnumMandatoryDefNotSet() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef Sex enum { id: int, desc: str }:
          M { id: 10, desc: 'Male' }
          F { desc: 'Female' }
      
    ''',
      "Enum value no assignable to enum type."
    )
  }
  
  @Test
  def void testInvalidMap() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef List ..{ id: int }
        
        typedef Sex enum { id: int, list: List }:
          M { id: 10, list: map@'[ { id: 10 } ]' }
      
    ''',
      "Enum value no assignable to enum type.",
      "Failed to assign parsed value '[ { id: 10 } ]' to pattern map."
    )
  }
  
  @Test
  def void testIncompatibleTypesInList() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef List ..{ id: int, osx?: int }
        
        typedef Sex enum { id: int, list: List }:
          M { id: 10, list: [ { id: 10, osx: 10 }, { id: '10' } ] }
      
    ''', "Enum value no assignable to enum type.")
  }
  
  @Test
  def void testComplexIncompatibleTypesInList() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef List ..{ id: int, osx?: int }
        
        typedef Sex enum { id: int, list: List }:
          M { id: 10, list: [ { osx: int@'22' }, map@'{ id: 5, osx: 3 }', { id: int@'12' } ] }
      
    ''', "Enum value no assignable to enum type.")
  }
  
  @Test
  def void testCorrect() {
    ph.test('''
      module /test
      
      definitions:
        typedef ptr mask 'A#a#-##.n#NXX'
        
        typedef email match """[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}"""
        
        typedef Subject {
          id: int
          name: ptr
          comp: {
            email: email
            arr: ..{ id?: int, orx = 10 }
          }
        }
        
        typedef Other { id: int, date: lda }
        
        typedef List ..{ id?: int, orx = 10 }
        
        typedef ListRef {
          id?: int
          orx = 10
          list: List
        }
        
        typedef Sex enum { desc: str, other?: Other, list?: List, mail?: email }:
          M { desc: str@'Male', list: [ { orx: int@'22' }, { id: int@'12' }, map@'{ id: 5, orx: 3 }' ] }
          F { desc: 'Female', other: { id: int@"""10""", date: lda@'2018-01-20' }, mail: email@'alex@gmail.com' }
          O { desc: """Other""", list: List@'[ { id: 3 }, { id: 10, orx: 11 } ]' }
        
        typedef New enum { id: flt, seq?: ptr, mp: map }:
          ALEX { id: 1.3, seq: ptr@'R3g7-60.e5U\ ', mp: { x: -10, y: 12.5 } }
          MICA { id: 1.5, mp: map@'{ x: 10 }' }
          PAUL { id: -1.0, mp: Other@'{ id: 0, date: 2016-01-12 }' }
        
        typedef Ox enum:
          X Y
        
    ''')
  }
}