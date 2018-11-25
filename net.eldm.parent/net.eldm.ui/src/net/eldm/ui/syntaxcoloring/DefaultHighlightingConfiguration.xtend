package net.eldm.ui.syntaxcoloring

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class DefaultHighlightingConfiguration implements IHighlightingConfiguration {
  public static final String TEXT_ID = "text"
  
  override void configure(IHighlightingConfigurationAcceptor acceptor) {
    acceptor.acceptDefaultHighlighting(TEXT_ID, "Text", textTextStyle())
  }
  
  def TextStyle textTextStyle() {
    new TextStyle => [
      color = new RGB(127, 0, 85)
      style = SWT.BOLD
    ]
  }
}