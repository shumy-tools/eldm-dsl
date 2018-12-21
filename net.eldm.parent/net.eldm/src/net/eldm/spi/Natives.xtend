package net.eldm.spi

import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.DateLiteral
import net.eldm.eldmDsl.DateTimeLiteral
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.InferredDef
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.PathLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TimeLiteral
import net.eldm.eldmDsl.TopDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.LambdaDef

class Natives {
  public static String NONE = 'none'
  public static String ANY = 'any'
  public static String OPEN = 'open'
  
  public static String BOOL = 'bool'
  public static String STR = 'str'
  public static String INT = 'int'
  public static String FLT = 'flt'
  
  public static String LDA = 'lda'
  public static String LTM = 'ltm'
  public static String LDT = 'ldt'
  public static String PATH = 'path'
  
  public static String MAP = 'map'
  public static String LST = 'lst'
  
  public static String ENUM = 'enum'
  public static String LAMBDA = 'lamb'
  
  static def isOneOf(InferredDef inferred, String ...types) {
    val nat = inferred.nativeType
    return types.exists[it == nat]
  }
  
  static def isOneOf(Literal value, String ...types) {
    val nat = value.nativeType
    return types.exists[it == nat]
  }
  
  
  static def getNativeType(TopDef type) {
    if (type === null) return NONE
    
    return switch type {
      EnumDef: ENUM
      LambdaDef: LAMBDA
      ElementDef: {
        if (type.ref !== null)
          return type.ref.name
        
        if (type instanceof InferredDef) {
          if (type.native !== null)
            return type.native
          
          return switch type {
            MapDef: MAP
            ListDef: LST
          }
        }
      }
    }
  }
  
  static def getNativeType(Literal value) {
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
    }
  }
}