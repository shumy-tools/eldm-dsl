package net.eldm.util

import java.util.Stack
import org.eclipse.emf.ecore.EObject

class ValidationStack {
  static val localdp = new ThreadLocal<Boolean> {
    override protected initialValue() { false }
  }
  
  static val local = new ThreadLocal<Stack<EObject>> {
    override protected initialValue() { new Stack<EObject> }
  }
  
  static def void push(EObject obj) {
    local.get.push(obj)
  }
  
  static def EObject pop() {
    local.get.pop
  }
  
  static def <T> T error(String msg) {
    val stack = local.get
    val dp = localdp.get
    
    var EObject obj = null
    if (!dp) {
      do obj = stack.pop while (obj.eResource === null)
      stack.clear
    } else {
      obj = stack.peek
    }
    
    throw new ValidationError(obj, msg)
  }
  
  static def dontPop(boolean dp) {
    localdp.set(dp)
  }
}

class ValidationError extends RuntimeException {
  public val EObject obj
  
  new(EObject obj, String msg) {
    super(msg)
    this.obj = obj
  }
}