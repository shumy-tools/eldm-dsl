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
  
  // TEST with enums----------------------------------------------------------------------------------------------------------------------
  
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
        
    ''', "Multiple keys with the same name [id]")
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
      "Inferred type not assignable to native 'str'."
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
      "Key 'des' does not exist."
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
      "Required key 'id' not set."
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
      "Inferred type not assignable to native 'map'."
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
        
    ''', "Inferred type not assignable to native 'int'.")
  }
  
  @Test
  def void testComplexIncompatibleTypesInList() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef List ..{ id: int, osx?: int }
        
        typedef Sex enum { id: int, list: List }:
          M { id: 10, list: [ { osx: int@'22' }, map@'{ id: 5, osx: 3 }', { id: int@'12' } ] }
        
    ''', "Inferred type not assignable to map with required key 'id'.")
  }
  
  @Test
  def void testEnums() {
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
  
  // TEST with let values-----------------------------------------------------------------------------------------------------------------
  
  @Test
  def void testLetSelfReference() {
    ph.testExpectedErrors('''
      module /main/test
      
      definitions:
        let b = b is { id: int, name: str }
        
    ''',
      "Identifier expression cannot reference itself!"
    )
  }
  
  @Test
  def void testInvalidExtendableMapAssignement() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef Map { id: int, name?: str }
        
        let x: map = { id: 10 }
        let y: Map = { id: 10 } set x // { id: int } + map -> { id: int, * }
        
    ''',
      "Inferred type with extendable fields not assignable to defined map."
    )
  }
  
  @Test
  def void testLetValues() {
    ph.test('''
      module /main/test
      
      definitions:
        typedef Extended { id: int, * }
              
        typedef Subject {
          id: int
          name?: str
        }
        
        let ex: Extended = { id: 10, other: 'field' }
        
        let x = { name: 'Alex' }
        let y: Subject = x set { id: 10 }
        let z = 10 + 30 * 2 is int and true == 2016-01-23 < 2017-05-12
        
        let a: map = { id: 20, name: 'Alex' }
        let b = a is { id: int, name: str }
        let c = { id: 20 } is map
        let d = { id: 20, name: 'Alex' } is Subject
        
        let d = [10, 30] + [5]
        
    ''')
  }
  
  @Test
  def void testFunction() {
    ph.test('''
      module /main/test
      
      definitions:
        typedef Id { id: int }
        
        typedef Subject {
          id: int
          name?: str
        }
        
        let id = 'text' // this is shadowed by internal scope
        
      def get /subject Id -> Subject:
        let y = id is int
        let a = { id: 10 }
        let b = a set { name: 'Alex' }
        
    ''')
  }
}