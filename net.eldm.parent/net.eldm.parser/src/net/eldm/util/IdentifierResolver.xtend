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
  
  def ElementDef resolveIdentifier(Primary pr) {
    // search in recursive function blocks
    var EObject block = pr
    do {
      block = block.findContainer(BlockExpression)
      if (block !== null) {
        // try search in expression block
        val type = block.resolveVar(pr.ref)
        if (type !== null)
          return type
        
        // try search in function parameter
        val func = block.eContainer
        if (func instanceof Function) {
          val fParam = func.decl.param.mapDef
          if (fParam !== null) {
              val entry = fParam.getMapEntryDef(pr.ref)
              if (entry !== null)
                return entry.entryType
          }
        }
      } else {
        // try search in module
        val mod = pr.findContainer(Module)
        if (mod !== null) {
          val type = mod.resolveVar(pr.ref)
          if (type !== null)
            return type
        }
      }
    } while (block !== null)
    
    error('''Couldn't resolve reference '«pr.ref»'.''')
    return null;
  }
  
  def ElementDef resolveVar(EObject obj, String id) {
    val ident = obj.eContents.filter(Var).findFirst[
      name == id
    ]
    
    if (ident !== null)
      return ident.varType
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
    error('''Couldn't resolve MapDef! Please report this bug.''')
    return null
  }
  
  def getMapEntryDef(MapDef type, String id) {
    for (it : type.defs)
      if (name == id)
        return it
    return null
  }
}