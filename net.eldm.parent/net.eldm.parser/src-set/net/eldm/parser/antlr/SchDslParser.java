/*
 * generated by Xtext 2.15.0
 */
package net.eldm.parser.antlr;

import com.google.inject.Inject;
import net.eldm.parser.antlr.internal.InternalSchDslParser;
import net.eldm.services.SchDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SchDslParser extends AbstractAntlrParser {

	@Inject
	private SchDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSchDslParser createParser(XtextTokenStream stream) {
		return new InternalSchDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SchDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SchDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
