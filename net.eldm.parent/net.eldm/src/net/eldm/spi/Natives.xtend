package net.eldm.spi

import java.util.ArrayList
import java.util.List
import java.util.Map
import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.DateLiteral
import net.eldm.eldmDsl.DateTimeLiteral
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.InferredDef
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.LambdaDef
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PathLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TemplateDef
import net.eldm.eldmDsl.TimeLiteral
import net.eldm.eldmDsl.TopDef
import net.eldm.eldmDsl.TypeDef
import net.eldm.eldmDsl.ExternalDef
import net.eldm.eldmDsl.PatternLiteral
import net.eldm.eldmDsl.Definition

class Natives {
  public static val NONE = 'none'
  
  public static val ANY = 'any'
    public static val CLS = 'cls'
    public static val PATH = 'path'
    public static val LAMB = 'lamb'
  
    public static val NAT = 'nat'
      public static val BOOL = 'bool'
      public static val STR = 'str'
    
      public static val NUM = 'num'
        public static val INT = 'int'
        public static val FLT = 'flt'
      
    public static val LDT = 'ldt'
      public static val LDA = 'lda'
      public static val LTM = 'ltm'
      
    public static val COL = 'col'
      public static val MAP = 'map'
      
      public static val ITR = 'itr'
        public static val LST = 'lst'
        public static val SET = 'set'
  
  // TypeTree
  public static val Map<String, Object> TT = #{
    NONE -> null,
    
    ANY -> #{
      CLS -> null,
      PATH -> null,
      LAMB -> null,
      
      NAT -> # {
        BOOL -> null,
        STR -> null,
        
        NUM -> #{
          INT -> null,
          FLT -> null
        }
      },
      
      LDT -> #{
        LDA -> null,
        LTM -> null
      },
      
      COL -> #{
        MAP -> null,
        ITR -> #{
          LST -> null,
          SET -> null
        }
      }
    }
  }
  
  static def isOneOf(InferredDef inferred, String ...types) {
    val nat = inferred.nativeType
    val path = TT.search(nat)
    
    return types.exists[choice | path.exists[it == choice]]
  }
  
  static def isOneOf(Literal value, String ...types) {
    val nat = value.nativeType
    val path = TT.search(nat)
    
    return types.exists[choice | path.exists[it == choice]]
  }
  
  static def is(String nat, String superNat) {
    val path = TT.search(nat)
    return path.exists[it == superNat]
  }
  
  static def String getListExt(String nat) {
    switch nat {
      case ITR: 'I'
      case LST: 'L'
      case SET: 'S'
    }
  }
  
  static def String getNativeType(Definition tDef) {
    switch tDef {
      TypeDef: tDef.type.nativeType
      ExternalDef: throw new RuntimeException("getNativeType - ExternalDef not yet supported")
    }
  }
  
  static def String getNativeType(TopDef type) {
    if (type === null) return NONE
    
    return switch type {
      EnumDef: MAP
      
      ElementDef: {
        if (type.ref !== null)
          return type.ref.nativeType
        
        if (type instanceof InferredDef) {
          if (type.native !== null)
            return type.native
          
          return switch type {
            MapDef: MAP
            
            ListDef: switch type.ext {
              case 'I': ITR
              case 'L': LST
              case 'S': SET
            }
            
            TemplateDef: {
              if (type.type !== null)
                return CLS + type.type.nativeType
              
              if (type.name !== null)
                return '<' + type.name + '>'
            }
            
            LambdaDef: LAMB
          }
        }
      }
    }
  }
  
  static def String getNativeType(Literal value) {
    if (value === null) return ANY
    
    return switch value {
      BoolLiteral: BOOL
      StrLiteral: STR
      IntLiteral: INT
      FltLiteral: FLT
      
      DateLiteral: LDA
      TimeLiteral: LTM
      DateTimeLiteral: LDT
      PathLiteral: PATH
      
      MapLiteral: MAP
      ListLiteral: LST
      
      PatternLiteral: {
        if (value.native !== null)
          value.native
        else
          value.ref.nativeType
      }
    }
  }
  
  static def String minNative(String left, String right) {
    val lPath = TT.search(left)
    val rPath = TT.search(right)
    
    if (lPath === null || rPath === null)
      return NONE
    
    println('''(left=«lPath», right=«rPath»)''')
    for (lp : lPath)
      for (rp : rPath)
        if (lp == rp) {
          println('''  MIN: «lp»''')
          return lp
        }
    return NONE
  }
  
  static def List<String> nativePath(String name) {
    TT.search(name)
  }
  
  private static def List<String> search(Map<String, Object> node, String name) {
    for (key: node.keySet) {
      if (key == name)
        return #[key]
        
      val value = node.get(key)
      if (value instanceof Map) {
        val found = value.search(name)
        if (found !== null)
          return (new ArrayList => [
            addAll(found)
            add(key)
          ])
      }
    }
    
    return null
  }
}