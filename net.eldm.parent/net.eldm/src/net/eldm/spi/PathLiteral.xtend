package net.eldm.spi

import org.eclipse.xtend.lib.annotations.Data

@Data
class PathLiteral {
  val String value
  
  static def parse(String value) {
    if (value.matches("(/[a-z0-9-])*"))
      return new PathLiteral(value)
    
    return null
  }
}