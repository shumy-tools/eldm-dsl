package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import net.eldm.eldmDsl.BlockExpression
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.Function
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.Module
import net.eldm.eldmDsl.Primary
import net.eldm.eldmDsl.TypeDef
import net.eldm.eldmDsl.Var
import org.eclipse.emf.ecore.EObject

import static net.eldm.util.ValidationStack.*

@Singleton
class IdentifierResolver {
  @Inject extension TypeResolver tResolver
  
  def ElementDef resolve(Primary pr) {
    var type = if (pr.value !== null)
      pr.value.inferType
    else if (pr.ref !== null)
      pr.resolve(pr.ref)
    else
      error('''Failed to infer Primary type! Please report this bug.''')
    
    // resolve member calls
    var mDef = type.mapDef
    for (it : pr.calls) {
      if (mDef === null)
        error('''Couldn't resolve reference '«member»'.''')
      
      val entry = mDef.getMapEntry(member)
      if (entry === null)
        error('''Couldn't resolve reference '«member»'.''')
      
      //TODO: optional entry and nullSafe call!
      
      type = entry.type
      mDef = type.mapDef
    }
    
    return type
  }
  
  def ElementDef resolve(EObject item, String id) {
    // search in recursive function blocks
    var EObject block = item
    do {
      block = block.findContainer(BlockExpression)
      if (block !== null) {
        // try search in expression block
        val type = block.resolveVar(id)
        if (type !== null)
          return type
        
        // try search in function parameter
        val func = block.eContainer
        if (func instanceof Function) {
          val fParam = func.decl.param.mapDef
          if (fParam !== null) {
            val entry = fParam.getMapEntry(id)
            if (entry !== null)
              return entry.entryType 
          }
        }
      } else {
        // try search in module
        val mod = item.findContainer(Module)
        if (mod !== null) {
          val type = mod.resolveVar(id)
          if (type !== null)
            return type
        }
      }
    } while (block !== null)
    
    error('''Couldn't resolve reference '«id»'.''')
  }
  
  def ElementDef resolveVar(EObject obj, String id) {
    val ident = obj.eContents.filter(Var).findFirst[
      name == id
    ]
    
    if (ident !== null)
      return ident.varType
    
    return null
  }
  
  def <T extends EObject> T findContainer(EObject leaf, Class<T> type) {
    if (leaf === null) return null
    
    var EObject obj = leaf
    do
      obj = obj.eContainer
    while (obj !== null && !(type.isAssignableFrom(obj.class)))
    
    return obj as T
  }
  
  def MapDef getMapDef(ElementDef type) {
    if (type instanceof MapDef)
      return type
    
    val tRef = type.ref
    if (tRef instanceof TypeDef)
      if (tRef.type instanceof ElementDef)
        return (tRef.type as ElementDef).mapDef
    
    //TODO: if (param.ref instanceof ExternalDef)
    return null
  }
  
  def getMapEntry(MapDef type, String id) {
    for (it : type.defs)
      if (name == id)
        return it
    return null
  }
}