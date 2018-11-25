package net.eldm.ui.syntaxcoloring

import com.google.inject.Singleton
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

@Singleton
class IldmAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  override protected String calculateId(String tokenName, int tokenType) {
    if(tokenName == "RULE_TEXT")
      return HighlightingStyles.STRING_ID
    
    return super.calculateId(tokenName, tokenType)
  }
}