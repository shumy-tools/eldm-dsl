package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.HashMap
import java.util.Map
import net.eldm.eldmDsl.InferredDef
import net.eldm.eldmDsl.LambdaDef
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MemberCall
import org.eclipse.emf.common.util.EList

import static net.eldm.util.ValidationStack.*

import static extension net.eldm.spi.Natives.*

@Singleton
class CallResolver {
  val nativeFuncs = new HashMap<String, Map<String, FunctionDecl>>
  val externalFuncs = new HashMap<String, Map<String, FunctionDecl>>
  
  @Inject extension TypeValidator tValidator
  @Inject extension TypeResolver tResolver
  @Inject extension IdentifierResolver iResolver
  @Inject extension TypeParser tParser
  
  @Inject
  def void init() {
    nativeFuncs.put(STR, #{
      'len' -> funcWith(NONE -> [INT.typeOf])
    })
    
    nativeFuncs.put(MAP, #{
      'keys' -> funcWith(NONE -> ["..str".typeOf]),
      'values' -> funcWith(NONE -> [
        if (it instanceof MapDef)
          return defs.map[type.inferType].minType
        "..any".typeOf
      ])
    })
    
    nativeFuncs.put(LST, #{
      'len' -> funcWith(NONE -> [INT.typeOf]),
      'filter' -> funcWith("(open -> any)" -> ["..any".typeOf])
    })
  }
  
  
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
      return ANY.typeOf
    } else {
      if (tDef.native !== null) {
        if (!call.unknown)
          return tDef.functionCall(call)
          //error('''Couldn't resolve reference to '«call.member»' from a native map type. Use the unknown operator.''')
        
        return ANY.typeOf
      } else {
        val mDef = tDef as MapDef
        val entry = mDef.getMapEntry(call.member)
        if (entry === null)
          return tDef.functionCall(call)
          //error('''Couldn't resolve reference to '«call.member»' from the map.''')
        
        return entry.entryType
      }
    }
  }
  
  private def InferredDef lstCall(InferredDef tDef, MemberCall call) {
    if (call.member !== null) {
      return tDef.functionCall(call)
    } else {
      val kType = call.key.inferType
      if (kType.native != INT)
        error('''The lst index must be of type int.''')
      
      if (tDef.native !== null)
        return ANY.typeOf
      else
        return (tDef as ListDef).type.inferType
    }
  }
  
  private def InferredDef functionCall(InferredDef tDef, MemberCall call) {
    val type = tDef.nativeType
    
    val func = type.getFunction(call.member)
    if (func === null)
      error('''The type '«type»' has no function/member '«call.member»'.''')
    
    if (func.param.nativeType != NONE && call.lambda === null)
      error('''The function '«call.member»' requires a parameter.''')
    else
      return func.result.apply(tDef)
    
    // it's a lambda call ?
    val lCall = call.lambda
    if (lCall.param !== null) {
      if (!(func.param instanceof LambdaDef))
        error('''The function '«call.member»' parameter is not a lambda.''')
      
      //TODO: process lambdas
    } else {
      val inferred = lCall.exp.inferType
      inferred.inElement(func.param.inferType)
      return func.result.apply(tDef)
    }
  }
  
  private def getFunction(String type, String name) {
    val func = nativeFuncs.get(type)?.get(name) ?: externalFuncs.get(type)?.get(name)
    return func?.copy
  }
}