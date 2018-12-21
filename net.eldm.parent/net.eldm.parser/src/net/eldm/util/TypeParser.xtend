package net.eldm.util

import com.google.inject.Inject
import com.google.inject.Singleton
import java.io.StringReader
import net.eldm.eldmDsl.InferredDef
import net.eldm.eldmDsl.LambdaDef
import net.eldm.eldmDsl.TopDef
import net.eldm.parser.antlr.EldmDslParser
import net.eldm.services.EldmDslGrammarAccess
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class FunctionDecl {
  // the accepted type of the parameter
  public val TopDef param
  
  // a functions that calculates the result type depending on the inferred entry
  public val (InferredDef)=>InferredDef result
  
  // somehow xtext fuckup internal state of these objects when re-parsing!
  def copy() {
    val par = EcoreUtil.copy(param)
    new FunctionDecl(par, result)
  }
}

@Singleton
class TypeParser {
  @Inject EldmDslParser eldmParser
  @Inject EldmDslGrammarAccess eldmRules
  
  def InferredDef typeOf(String sType) {
    val result = sType.internalTypeOf
    if (result === null)
      throw new RuntimeException('''Failed to parse lambda '«sType»'.''')
    
    return result
  }
  
  def LambdaDef lambdaOf(String sType) {
    val result = sType.internalLambdaOf
    if (result === null)
      throw new RuntimeException('''Failed to parse lambda '«sType»'.''')
    
    return result
  }
  
  def funcWith(Pair<String, (InferredDef)=>InferredDef> it) {
    val param = key.internalTypeOf ?: key.internalLambdaOf
    if (param === null)
      throw new RuntimeException('''Failed to parse function parameter '«key».''')
    
    if (value === null)
      throw new RuntimeException('''Function definition requires lambda inferrer.''')
    
    new FunctionDecl(param, value)
  }
  
  private def InferredDef internalTypeOf(String sType) {
    val result = eldmParser.parse(eldmRules.inferredDefRule, new StringReader(sType))
    if (result.hasSyntaxErrors || !(result.rootASTElement instanceof InferredDef))
      return null
    
    return result.rootASTElement as InferredDef
  }
  
  def LambdaDef internalLambdaOf(String sType) {
    val result = eldmParser.parse(eldmRules.lambdaDefRule, new StringReader(sType))
    if (result.hasSyntaxErrors || !(result.rootASTElement instanceof LambdaDef))
      return null
    
    return result.rootASTElement as LambdaDef
  }
}