package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import net.eldm.eldmDsl.BlockExpression
import net.eldm.eldmDsl.Function
import net.eldm.eldmDsl.InferredDef
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.Module
import net.eldm.eldmDsl.TypeDef
import net.eldm.eldmDsl.Var
import org.eclipse.emf.ecore.EObject

import static net.eldm.util.ValidationStack.*
import net.eldm.eldmDsl.Contract
import net.eldm.eldmDsl.FuncDecl

@Singleton
class IdentifierResolver {
  @Inject extension TypeResolver tResolver
  
  def InferredDef resolve(EObject leaf, String id) {
    val contract = leaf.findContainer(Contract)
    if (contract !== null) {
      val funcDecl = contract.findContainer(FuncDecl)
      val mDef = switch contract.flow {
        case 'in': funcDecl.param.inferType as MapDef
        case 'out': funcDecl.result.inferType as MapDef
      }
      
      val type = mDef.resolve(id)
      if (type !== null)
        return type
      
      val mod = contract.findContainer(Module)
      return mod.resolve(contract, id)
    }
    
    // search in recursive function blocks
    val leafCont = leaf.findContainer(Var)
    var EObject block = leaf
    do {
      block = block.findContainer(BlockExpression)
      if (block !== null) {
        // try search in expression block
        var type = block.resolveIdentifier(leafCont, id)
        if (type !== null)
          return type
        
        // try search in function parameter
        val pBlock = block.eContainer
        type = switch pBlock {
          Function: {
            val mDef = pBlock.decl.param.inferType as MapDef 
            mDef.resolve(id)
          }
          
          //TODO: search in other blocks, if, for, while, etc
          default: error('''Identifier resolution not supported for: '«pBlock.class.simpleName»'.''')
        }
        
        if (type !== null)
          return type
        
      } else {
        // try search in module block
        val mod = leaf.findContainer(Module)
        var type = mod.resolve(leafCont, id)
        if (type !== null)
          return type
      }
    } while (block !== null)
    
    error('''Couldn't resolve reference '«id»'.''')
  }
  
  def InferredDef resolve(MapDef mDef, String id) {
    if (mDef === null)
      return null
    
    val entry = mDef.getMapEntry(id)
    if (entry !== null)
      return entry.entryType
  }
  
  def InferredDef resolve(Module mod, EObject leaf, String id) {
    if (mod !== null) {
      val type = mod.resolveIdentifier(leaf, id)
      if (type !== null)
        return type
        
      val tDef = mod.eContents.filter(TypeDef).findFirst[name == id]
      if (tDef !== null)
        return tDef.inferType
    }
  }
  
  def InferredDef resolveIdentifier(EObject block, EObject leaf, String id) {
    //search in (block or module) upstream
    val blockIdents = block.eContents.filter(Var)
//    print('''
//    (block: «block.class.simpleName», leaf: «leaf.name», find: «id»)
//      VARS [«FOR it: blockIdents SEPARATOR ', '»(«name»:«type.nativeType»)«ENDFOR»]
//    ''')
    
    // if leaf is in the same block -> ignore all downstream items
    val validIdents = blockIdents.takeWhile[it !== leaf].toList
    
    // search in reverse order from the valid identifiers
//    println('''  VALID [«FOR it: validIdents SEPARATOR ','»(«name»: «type.nativeType»)«ENDFOR»]''')
    val ident = validIdents.reverse.findFirst[name == id]
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
  
  def getMapEntry(MapDef type, String id) {
    for (it : type.defs)
      if (name == id)
        return it
    return null
  }
}