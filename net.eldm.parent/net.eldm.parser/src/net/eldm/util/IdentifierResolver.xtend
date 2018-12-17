package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import net.eldm.eldmDsl.BlockExpression
import net.eldm.eldmDsl.EldmDslFactory
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.ExternalDef
import net.eldm.eldmDsl.Function
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.Module
import net.eldm.eldmDsl.TopDef
import net.eldm.eldmDsl.TypeDef
import net.eldm.eldmDsl.Var
import org.eclipse.emf.ecore.EObject

import static extension net.eldm.spi.Natives.*
import static net.eldm.util.ValidationStack.*

@Singleton
class IdentifierResolver {
  @Inject extension TypeResolver tResolver
  
  def ElementDef resolve(EObject leaf, String id) {
    // TODO: or any other identifier container that can be referenced!
    val leafCont = leaf.findContainer(Var)
    
    // search in recursive function blocks
    var EObject block = leaf
    do {
      block = block.findContainer(BlockExpression)
      if (block !== null) {
        // try search in expression block
        val type = block.resolveIdentifier(leafCont, id)
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
        // try search in module block
        val mod = leaf.findContainer(Module)
        if (mod !== null) {
          val type = mod.resolveIdentifier(leafCont, id)
          if (type !== null)
            return type
        }
      }
    } while (block !== null)
    
    error('''Couldn't resolve reference '«id»'.''')
  }
  
  def ElementDef resolveIdentifier(EObject block, Var leaf, String id) {
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
    
    //also search for Module enums
    if (block instanceof Module) {
      val enumTypeDef = block.eContents
        .filter(TypeDef)
        .filter[type instanceof EnumDef]
        .findFirst[name == id]
      
      if (enumTypeDef !== null) {
        
        val enumDef = enumTypeDef.type as EnumDef
        if (enumDef === null)
          return null
        
        /* typedef Sex enum { name: str }
             M { name: 'Male' }
             F { name: 'Female' }
           returns { M: Sex.type, F: Sex.type }
        */
        val eFact = EldmDslFactory.eINSTANCE
        return eFact.createMapDef => [
          for (item: enumDef.defs) {
            defs += eFact.createMapEntryDef => [
              name = item.name
              type = enumDef.type ?: eFact.createElementDef => [ native = STR ]
            ]
          }
        ]
      }
    }
    
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
  
  def MapDef getMapDef(TopDef tDef) {
    return switch tDef {
      MapDef: tDef
      
      EnumDef: tDef.type
      
      ElementDef: {
        val tRef = tDef.ref
        switch tRef {
          TypeDef: {
            if (tRef.type instanceof ElementDef)
              return (tRef.type as ElementDef).mapDef
          }
          
          ExternalDef: error("getMapDef - ExternalDef not supported yet") //TODO: if (param.ref instanceof ExternalDef)
        }
      }
    }
  }
  
  def getMapEntry(MapDef type, String id) {
    for (it : type.defs)
      if (name == id)
        return it
    return null
  }
}