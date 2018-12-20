/*
 * generated by Xtext 2.15.0
 */
package net.eldm.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.eldm.services.EldmDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EldmDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EldmDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MapDef_CommaKeyword_1_3_1_0_q;
	protected AbstractElementAlias match_MapDef___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_4___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_5_RightCurlyBracketKeyword_1_6__;
	protected AbstractElementAlias match_MapLiteral___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_3___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_4_RightCurlyBracketKeyword_1_5__;
	protected AbstractElementAlias match_Module___DefinitionsKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EldmDslGrammarAccess) access;
		match_MapDef_CommaKeyword_1_3_1_0_q = new TokenAlias(false, true, grammarAccess.getMapDefAccess().getCommaKeyword_1_3_1_0());
		match_MapDef___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_4___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_5_RightCurlyBracketKeyword_1_6__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1()), new TokenAlias(false, false, grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_0_0_4())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getMapDefAccess().getENDTerminalRuleCall_1_5()), new TokenAlias(false, false, grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_1_6())));
		match_MapLiteral___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_3___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_4_RightCurlyBracketKeyword_1_5__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_0_1()), new TokenAlias(false, false, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_0_0_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getMapLiteralAccess().getBEGINTerminalRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getMapLiteralAccess().getENDTerminalRuleCall_1_4()), new TokenAlias(false, false, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_1_5())));
		match_Module___DefinitionsKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getModuleAccess().getDefinitionsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getModuleAccess().getBEGINTerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getModuleAccess().getENDTerminalRuleCall_4_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBREAKRule())
			return getBREAKToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * BREAK: ('\n'|'\r')*;
	 */
	protected String getBREAKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_MapDef_CommaKeyword_1_3_1_0_q.equals(syntax))
				emit_MapDef_CommaKeyword_1_3_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MapDef___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_4___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_5_RightCurlyBracketKeyword_1_6__.equals(syntax))
				emit_MapDef___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_4___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_5_RightCurlyBracketKeyword_1_6__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MapLiteral___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_3___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_4_RightCurlyBracketKeyword_1_5__.equals(syntax))
				emit_MapLiteral___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_3___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_4_RightCurlyBracketKeyword_1_5__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Module___DefinitionsKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_4__q.equals(syntax))
				emit_Module___DefinitionsKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     defs+=MapEntryDef (ambiguity) BREAK defs+=MapEntryDef
	 */
	protected void emit_MapDef_CommaKeyword_1_3_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ('{' BEGIN END '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_MapDef___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_4___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_5_RightCurlyBracketKeyword_1_6__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ('{' BEGIN END '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_MapLiteral___LeftCurlyBracketKeyword_0_0_1_RightCurlyBracketKeyword_0_0_3___or___LeftCurlyBracketKeyword_1_1_BEGINTerminalRuleCall_1_2_ENDTerminalRuleCall_1_4_RightCurlyBracketKeyword_1_5__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('definitions:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     imports+=Import (ambiguity) (rule end)
	 *     imports+=Import (ambiguity) opers+=Operation
	 *     imports+=Import (ambiguity) paths+=SubPath
	 *     name=PathLiteral (ambiguity) (rule end)
	 *     name=PathLiteral (ambiguity) opers+=Operation
	 *     name=PathLiteral (ambiguity) paths+=SubPath
	 *     plugs+=PlugDsl (ambiguity) (rule end)
	 *     plugs+=PlugDsl (ambiguity) opers+=Operation
	 *     plugs+=PlugDsl (ambiguity) paths+=SubPath
	 */
	protected void emit_Module___DefinitionsKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
