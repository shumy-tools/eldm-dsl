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

class Natives {
  public static String ANY = 'any'
  
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
  
  static def isOneOf(InferredDef inferred, String ...types) {
    val nat = inferred.nativeType
    return types.exists[it == nat]
  }
  
  static def isOneOf(Literal value, String ...types) {
    val nat = value.nativeType
    return types.exists[it == nat]
  }
  
  
  static def getNativeType(InferredDef inferred) {
    if (inferred === null) return ANY
    
    if (inferred.native !== null)
      return inferred.native
    
    if (inferred.ref !== null)
      return inferred.ref.name
          
    return switch inferred {
      MapDef: MAP
      ListDef: LST
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