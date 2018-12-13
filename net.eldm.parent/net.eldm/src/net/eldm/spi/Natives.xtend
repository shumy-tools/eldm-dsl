package net.eldm.spi

import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.DateLiteral
import net.eldm.eldmDsl.DateTimeLiteral
import net.eldm.eldmDsl.ElementDef
import net.eldm.eldmDsl.EnumDef
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.ListDef
import net.eldm.eldmDsl.Literal
import net.eldm.eldmDsl.MapDef
import net.eldm.eldmDsl.PathLiteral
import net.eldm.eldmDsl.StrLiteral
import net.eldm.eldmDsl.TimeLiteral
import net.eldm.eldmDsl.MapLiteral
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.EnumLiteral

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
  public static String ENUM = 'enum'
  
  static def isOneOf(ElementDef elmDef, String ...types) {
    val nat = elmDef.nativeType
    return types.exists[it == nat]
  }
  
  static def isOneOf(Literal value, String ...types) {
    val nat = value.nativeType
    return types.exists[it == nat]
  }
  
  
  static def getNativeType(ElementDef elmDef) {
    if (elmDef === null) return ANY
    
    if (elmDef.native !== null)
      return elmDef.native
    
    if (elmDef.ref !== null)
      return elmDef.ref.name
          
    return switch elmDef {
      MapDef: MAP
      ListDef: LST
      EnumDef: ENUM
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
      EnumLiteral: ENUM
    }
  }
}