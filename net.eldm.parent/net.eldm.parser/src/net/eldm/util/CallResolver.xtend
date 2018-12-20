package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.InferredDef
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MemberCall
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static net.eldm.util.ValidationStack.*

import static extension net.eldm.spi.Natives.*

@FinalFieldsConstructor
class FunctionDecl {
  public val List<InferredDef> params //TODO: accept optional parameters!
  public val InferredDef result
  
  new (InferredDef res) {
    this.params = Collections.EMPTY_LIST
    this.result = res
  }
  
  // somehow xtext fuckup internal state of these objects when re-parsing!
  def copy() {
    val pars = params.map[EcoreUtil.copy(it)]
    val res = EcoreUtil.copy(result)
    new FunctionDecl(pars, res)
  }
}

@Singleton
class CallResolver {
  @Inject extension TypeValidator tValidator
  @Inject extension TypeResolver tResolver
  @Inject extension IdentifierResolver iResolver
  
  val eFact = EldmDslFactory.eINSTANCE
  
  val nativeFuncs = #{
    MAP -> #{
      'keys' -> new FunctionDecl(eFact.createListDef => [type = (eFact.createInferredDef => [ native = STR ])]),
      'values' -> new FunctionDecl(eFact.createListDef => [type = (eFact.createInferredDef => [ native = ANY ])])
    },
    
    LST -> #{
      'len' -> new FunctionDecl(eFact.createInferredDef => [ native = INT ])
    }
  }
  
  val Map<String, Map<String, FunctionDecl>> externalFuncs = new HashMap<String, Map<String, FunctionDecl>>
  
  def InferredDef call(InferredDef type, EList<MemberCall> calls) {
    // resolve member calls
    var tDef = type
    for (it : calls) {
      tDef = switch tDef.nativeType {
        case MAP: tDef.mapCall(it)
        case LST: tDef.lstCall(it)
      }
    }
    
    return tDef
  }
  
  private def InferredDef mapCall(InferredDef tDef, MemberCall call) {
    if (call.key !== null) {
      val kType = call.key.inferType
      if (kType.native != STR)
        error('''The map key must be of type str.''')
      
      // must return any, because STR key cannot be resolved at compile time
      return eFact.createInferredDef => [ native = ANY ]
    } else {
      if (tDef.native !== null) {
        if (!call.unknown)
          return MAP.functionCall(call)
          //error('''Couldn't resolve reference to '«call.member»' from a native map type. Use the unknown operator.''')
        
        return eFact.createInferredDef => [ native = ANY ]
      } else {
        val mDef = tDef as MapDef
        val entry = mDef.getMapEntry(call.member)
        if (entry === null)
          return MAP.functionCall(call)
          //error('''Couldn't resolve reference to '«call.member»' from the map.''')
        
        return entry.entryType
      }
    }
  }
  
  private def InferredDef lstCall(InferredDef tDef, MemberCall call) {
    if (call.member !== null) {
      return LST.functionCall(call)
    } else {
      val kType = call.key.inferType
      if (kType.native != INT)
        error('''The lst index must be of type int.''')
      
      if (tDef.native !== null)
        return eFact.createInferredDef => [ native = ANY ]
      else
        return (tDef as ListDef).type.inferType
    }
  }
  
  private def InferredDef functionCall(String type, MemberCall call) {
    val func = type.getFunction(call.member)
    if (func === null)
      error('''The type '«type»' has no function/member '«call.member»'.''')
    
    var int i = 0
    for (expected: func.params) {
      val exp = call.params.get(0)
      if (exp === null)
        error('''Expecting parameter '«i»' for function '«call.member»'.''')
      
      val cType = exp.inferType
      cType.inElement(expected)
      //error('''Invalid parameter '«i»' for function '«call.member»'.''')
      i++
    }
    
    return func.result
  }
  
  private def getFunction(String type, String name) {
    val func = nativeFuncs.get(type)?.get(name) ?: externalFuncs.get(type)?.get(name)
    return func.copy
  }
}