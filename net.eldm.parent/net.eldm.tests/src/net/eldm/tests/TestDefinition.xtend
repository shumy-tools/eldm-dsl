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
        typedef List .I.{ id: int }
        
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
        typedef List .I.{ id: int, osx?: int }
        
        typedef Sex enum { id: int, list: List }:
          M { id: 10, list: [ { id: 10, osx: 10 }, { id: '10' } ] }
        
    ''', "Inferred type not assignable to native 'int'.")
  }
  
  @Test
  def void testComplexIncompatibleTypesInList() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef List .I.{ id: int, osx?: int }
        
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
            arr: .I.{ id?: int, orx = 10 }
          }
        }
        
        typedef Other { id: int, date: lda }
        
        typedef List .I.{ id?: int, orx = 10 }
        
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
        
      def get /subject {}:
        let sex: str = Sex.M.desc
        
    ''')
  }
  
  // TEST with let values-----------------------------------------------------------------------------------------------------------------
  
  @Test
  def void testCyclicReference() {
    ph.testExpectedErrors('''
      module /main/test
      
      definitions:
        let b = b is { id: int, name: str }
        
    ''',
      "Couldn't resolve reference 'b'."
    )
  }
  
  @Test
  def void testInvalidExtendableMapAssignement() {
    ph.testExpectedErrors('''
      module /test
      
      definitions:
        typedef Map { id: int, name?: str }
        
        let x: map = { id: 10 }
        let y: Map = { id: 10 } + x // { id: int } + map -> { id: int, ? }
        
    ''',
      "Inferred type with extendable fields not assignable to defined map."
    )
  }
  
  @Test
  def void testLetValues() {
    ph.test('''
      module /main/test
      
      definitions:
        typedef Extended { id: int, ? }
              
        typedef Subject {
          id: int
          name?: str
        }
        
        let ex: Extended = { id: 10, other: 'field' }
        
        let x = { name: 'Alex' }
        let y: Subject = x + { id: 10 }
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
        let b = a + { name: 'Alex' }
        let c: int = a.id + 10
        let d: str = b.name + 'Martins'
        
        let a1: { id: int, user?: Subject } = { id: 10, user: { id: 5, name: 'Alex' } }
        let a2 = a1.user.name + 'Martins'
        
        let arr = [1, 2, 3]
        let l1: int = arr.len + arr[0]
        let keys: .I.str = a.keys + ['Other']
        //let ln: int =  (a.keys + ['Other']).len // .I.any don't have length
        
    ''')
  }
  
  @Test
  def void testContract() {
    ph.test('''
      module /main/test
      
      definitions:
        typedef Id { id: int }
        
        typedef Subject {
          id: int
          name?: str
        }
        
        let const = 10
      
      in (id > 10) -> 'error message'
      out (name is str) -> 'error message'
      def get /subject Id -> Subject:
        let y = id is int
        
    ''')
  }
  
  @Test
  def void testUnknowKeys() {
    val let1 = "let y = «str»x?.name + 'Martins'"
    val let2 = "let x = «{ name: str }»x"
    ph.test('''
      module /main/test
      
      def service get { id: int, x: map }:
        «let1»
        «let2» // x parameter shadowed by redefinition
        let z = x.name + 'Martins'
        
    ''')
  }
  
  @Test
  def void testIsError() {
    ph.testExpectedErrors('''
      module /main/test
      
      def service get { id: int, x: map }:
        let x = { name: 'Alex' }
        let z = x.name + 'Martins: '
        let w = x.name is map
        
    ''',
      "No supported feature 'is' between types (str, map)"
    )
  }
  
  @Test
  def void testCastError() {
    val let = "let y = «{ name: str }»(x + { id: 10 })"
    ph.testExpectedErrors('''
      module /main/test
      
      def service get { id: int, x: map }:
        «let»
        
    ''',
      "Couldn't cast type."
    )
  }
}