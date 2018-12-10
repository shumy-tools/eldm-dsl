package net.eldm.spi

import net.eldm.eldmDsl.BoolLiteral
import net.eldm.eldmDsl.DateLiteral
import net.eldm.eldmDsl.DateTimeLiteral
import net.eldm.eldmDsl.EnumLiteral
import net.eldm.eldmDsl.FltLiteral
import net.eldm.eldmDsl.IntLiteral
import net.eldm.eldmDsl.ListLiteral
import net.eldm.eldmDsl.Literal
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
    }
  }
}

class Collections {
  public static String MAP = 'map'
  public static String LST = 'lst'
  public static String ENUM = 'enum'
  
  static def getCollectionType(Literal value) {
    return switch value {
      MapLiteral: MAP
      ListLiteral: LST
      EnumLiteral: ENUM
    }
  }
}