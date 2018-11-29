package net.eldm.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import net.eldm.services.EldmDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEldmDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Test10", "PlugDsl", "Block", "Typedef", "Module", "Return", "Exp", "Async", "False", "Regex", "Bool", "Defs", "Enum", "From", "Lda_1", "Ldt_1", "Ltm_1", "Mask", "Null", "Path", "True", "Any", "Def", "Flt", "Get", "Int", "Lda", "Ldt", "Let", "Ltm", "Mut", "Set", "Str", "NumberSignLeftParenthesis", "HyphenMinusGreaterThanSign", "FullStopFullStop", "As", "LineFeed", "CarriageReturn", "RightParenthesis", "Asterisk", "Comma", "FullStop", "Colon", "EqualsSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_PID", "RULE_ID", "RULE_INT", "RULE_NATURAL", "RULE_FLOAT", "RULE_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=16;
    public static final int Null=22;
    public static final int RULE_BEGIN=55;
    public static final int True=24;
    public static final int False=12;
    public static final int Defs=15;
    public static final int Str=36;
    public static final int RULE_PID=57;
    public static final int Regex=13;
    public static final int Bool=14;
    public static final int Async=11;
    public static final int FullStopFullStop=39;
    public static final int RightSquareBracket=52;
    public static final int RULE_ID=58;
    public static final int Mask=21;
    public static final int RightParenthesis=43;
    public static final int Mut=34;
    public static final int Typedef=7;
    public static final int RULE_INT=59;
    public static final int Get=28;
    public static final int RULE_NATURAL=60;
    public static final int RULE_ML_COMMENT=63;
    public static final int Block=6;
    public static final int RULE_TEXT=62;
    public static final int LeftSquareBracket=51;
    public static final int Module=8;
    public static final int RULE_END=56;
    public static final int Set=35;
    public static final int Ltm=33;
    public static final int Lda=30;
    public static final int Test10=4;
    public static final int Any=25;
    public static final int Int=29;
    public static final int Flt=27;
    public static final int RULE_SL_COMMENT=64;
    public static final int Ldt_1=19;
    public static final int Comma=45;
    public static final int EqualsSign=48;
    public static final int Ltm_1=20;
    public static final int As=40;
    public static final int NumberSignLeftParenthesis=37;
    public static final int CarriageReturn=42;
    public static final int Colon=47;
    public static final int RightCurlyBracket=54;
    public static final int EOF=-1;
    public static final int Ldt=31;
    public static final int Asterisk=44;
    public static final int Path=23;
    public static final int FullStop=46;
    public static final int Return=9;
    public static final int Def=26;
    public static final int RULE_WS=65;
    public static final int Lda_1=18;
    public static final int LeftCurlyBracket=53;
    public static final int From=17;
    public static final int RULE_ANY_OTHER=66;
    public static final int CommercialAt=50;
    public static final int PlugDsl=5;
    public static final int QuestionMark=49;
    public static final int RULE_FLOAT=61;
    public static final int Let=32;
    public static final int Exp=10;
    public static final int HyphenMinusGreaterThanSign=38;
    public static final int LineFeed=41;

    // delegates
    // delegators


        public InternalEldmDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEldmDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEldmDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEldmDslParser.g"; }


    	private EldmDslGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LineFeed", "'\n'");
    		tokenNameToValue.put("CarriageReturn", "'\r'");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("QuestionMark", "'?'");
    		tokenNameToValue.put("CommercialAt", "'@'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("NumberSignLeftParenthesis", "'#('");
    		tokenNameToValue.put("HyphenMinusGreaterThanSign", "'->'");
    		tokenNameToValue.put("FullStopFullStop", "'..'");
    		tokenNameToValue.put("As", "'as'");
    		tokenNameToValue.put("Any", "'any'");
    		tokenNameToValue.put("Def", "'def'");
    		tokenNameToValue.put("Flt", "'flt'");
    		tokenNameToValue.put("Get", "'get'");
    		tokenNameToValue.put("Int", "'int'");
    		tokenNameToValue.put("Lda", "'lda'");
    		tokenNameToValue.put("Ldt", "'ldt'");
    		tokenNameToValue.put("Let", "'let'");
    		tokenNameToValue.put("Ltm", "'ltm'");
    		tokenNameToValue.put("Mut", "'mut'");
    		tokenNameToValue.put("Set", "'set'");
    		tokenNameToValue.put("Str", "'str'");
    		tokenNameToValue.put("Bool", "'bool'");
    		tokenNameToValue.put("Defs", "'defs'");
    		tokenNameToValue.put("Enum", "'enum'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Lda_1", "'lda@'");
    		tokenNameToValue.put("Ldt_1", "'ldt@'");
    		tokenNameToValue.put("Ltm_1", "'ltm@'");
    		tokenNameToValue.put("Mask", "'mask'");
    		tokenNameToValue.put("Null", "'null'");
    		tokenNameToValue.put("Path", "'path'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("Exp", "'<exp>'");
    		tokenNameToValue.put("Async", "'async'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Regex", "'regex'");
    		tokenNameToValue.put("Module", "'module'");
    		tokenNameToValue.put("Return", "'return'");
    		tokenNameToValue.put("Block", "'<block>'");
    		tokenNameToValue.put("Typedef", "'typedef'");
    		tokenNameToValue.put("PlugDsl", "'plug-dsl'");
    		tokenNameToValue.put("Test10", "'{test:10}'");
    	}

    	public void setGrammarAccess(EldmDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModule"
    // InternalEldmDslParser.g:107:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:108:1: ( ruleModule EOF )
            // InternalEldmDslParser.g:109:1: ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalEldmDslParser.g:116:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:120:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalEldmDslParser.g:121:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalEldmDslParser.g:121:2: ( ( rule__Module__Group__0 ) )
            // InternalEldmDslParser.g:122:3: ( rule__Module__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:123:3: ( rule__Module__Group__0 )
            // InternalEldmDslParser.g:123:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePlugDsl"
    // InternalEldmDslParser.g:132:1: entryRulePlugDsl : rulePlugDsl EOF ;
    public final void entryRulePlugDsl() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:133:1: ( rulePlugDsl EOF )
            // InternalEldmDslParser.g:134:1: rulePlugDsl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlugDslRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlugDsl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlugDslRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlugDsl"


    // $ANTLR start "rulePlugDsl"
    // InternalEldmDslParser.g:141:1: rulePlugDsl : ( ( rule__PlugDsl__Group__0 ) ) ;
    public final void rulePlugDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:145:2: ( ( ( rule__PlugDsl__Group__0 ) ) )
            // InternalEldmDslParser.g:146:2: ( ( rule__PlugDsl__Group__0 ) )
            {
            // InternalEldmDslParser.g:146:2: ( ( rule__PlugDsl__Group__0 ) )
            // InternalEldmDslParser.g:147:3: ( rule__PlugDsl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlugDslAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:148:3: ( rule__PlugDsl__Group__0 )
            // InternalEldmDslParser.g:148:4: rule__PlugDsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlugDsl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlugDslAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlugDsl"


    // $ANTLR start "entryRuleImport"
    // InternalEldmDslParser.g:157:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:158:1: ( ruleImport EOF )
            // InternalEldmDslParser.g:159:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEldmDslParser.g:166:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:170:2: ( ( ( rule__Import__Alternatives ) ) )
            // InternalEldmDslParser.g:171:2: ( ( rule__Import__Alternatives ) )
            {
            // InternalEldmDslParser.g:171:2: ( ( rule__Import__Alternatives ) )
            // InternalEldmDslParser.g:172:3: ( rule__Import__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:173:3: ( rule__Import__Alternatives )
            // InternalEldmDslParser.g:173:4: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Import__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportOperation"
    // InternalEldmDslParser.g:182:1: entryRuleImportOperation : ruleImportOperation EOF ;
    public final void entryRuleImportOperation() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:183:1: ( ruleImportOperation EOF )
            // InternalEldmDslParser.g:184:1: ruleImportOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportOperation"


    // $ANTLR start "ruleImportOperation"
    // InternalEldmDslParser.g:191:1: ruleImportOperation : ( ( rule__ImportOperation__Group__0 ) ) ;
    public final void ruleImportOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:195:2: ( ( ( rule__ImportOperation__Group__0 ) ) )
            // InternalEldmDslParser.g:196:2: ( ( rule__ImportOperation__Group__0 ) )
            {
            // InternalEldmDslParser.g:196:2: ( ( rule__ImportOperation__Group__0 ) )
            // InternalEldmDslParser.g:197:3: ( rule__ImportOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportOperationAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:198:3: ( rule__ImportOperation__Group__0 )
            // InternalEldmDslParser.g:198:4: rule__ImportOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportOperation"


    // $ANTLR start "entryRuleImportDefinition"
    // InternalEldmDslParser.g:207:1: entryRuleImportDefinition : ruleImportDefinition EOF ;
    public final void entryRuleImportDefinition() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:208:1: ( ruleImportDefinition EOF )
            // InternalEldmDslParser.g:209:1: ruleImportDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportDefinition"


    // $ANTLR start "ruleImportDefinition"
    // InternalEldmDslParser.g:216:1: ruleImportDefinition : ( ( rule__ImportDefinition__Group__0 ) ) ;
    public final void ruleImportDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:220:2: ( ( ( rule__ImportDefinition__Group__0 ) ) )
            // InternalEldmDslParser.g:221:2: ( ( rule__ImportDefinition__Group__0 ) )
            {
            // InternalEldmDslParser.g:221:2: ( ( rule__ImportDefinition__Group__0 ) )
            // InternalEldmDslParser.g:222:3: ( rule__ImportDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:223:3: ( rule__ImportDefinition__Group__0 )
            // InternalEldmDslParser.g:223:4: rule__ImportDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportDefinition"


    // $ANTLR start "entryRuleExternalDef"
    // InternalEldmDslParser.g:232:1: entryRuleExternalDef : ruleExternalDef EOF ;
    public final void entryRuleExternalDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:233:1: ( ruleExternalDef EOF )
            // InternalEldmDslParser.g:234:1: ruleExternalDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExternalDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalEldmDslParser.g:241:1: ruleExternalDef : ( ( rule__ExternalDef__Alternatives ) ) ;
    public final void ruleExternalDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:245:2: ( ( ( rule__ExternalDef__Alternatives ) ) )
            // InternalEldmDslParser.g:246:2: ( ( rule__ExternalDef__Alternatives ) )
            {
            // InternalEldmDslParser.g:246:2: ( ( rule__ExternalDef__Alternatives ) )
            // InternalEldmDslParser.g:247:3: ( rule__ExternalDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:248:3: ( rule__ExternalDef__Alternatives )
            // InternalEldmDslParser.g:248:4: rule__ExternalDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleExternalModule"
    // InternalEldmDslParser.g:257:1: entryRuleExternalModule : ruleExternalModule EOF ;
    public final void entryRuleExternalModule() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:258:1: ( ruleExternalModule EOF )
            // InternalEldmDslParser.g:259:1: ruleExternalModule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExternalModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalModuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalModule"


    // $ANTLR start "ruleExternalModule"
    // InternalEldmDslParser.g:266:1: ruleExternalModule : ( ( rule__ExternalModule__Alternatives ) ) ;
    public final void ruleExternalModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:270:2: ( ( ( rule__ExternalModule__Alternatives ) ) )
            // InternalEldmDslParser.g:271:2: ( ( rule__ExternalModule__Alternatives ) )
            {
            // InternalEldmDslParser.g:271:2: ( ( rule__ExternalModule__Alternatives ) )
            // InternalEldmDslParser.g:272:3: ( rule__ExternalModule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalModuleAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:273:3: ( rule__ExternalModule__Alternatives )
            // InternalEldmDslParser.g:273:4: rule__ExternalModule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalModuleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalModule"


    // $ANTLR start "entryRuleSubPath"
    // InternalEldmDslParser.g:282:1: entryRuleSubPath : ruleSubPath EOF ;
    public final void entryRuleSubPath() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:283:1: ( ruleSubPath EOF )
            // InternalEldmDslParser.g:284:1: ruleSubPath EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubPath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubPath"


    // $ANTLR start "ruleSubPath"
    // InternalEldmDslParser.g:291:1: ruleSubPath : ( ( rule__SubPath__Group__0 ) ) ;
    public final void ruleSubPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:295:2: ( ( ( rule__SubPath__Group__0 ) ) )
            // InternalEldmDslParser.g:296:2: ( ( rule__SubPath__Group__0 ) )
            {
            // InternalEldmDslParser.g:296:2: ( ( rule__SubPath__Group__0 ) )
            // InternalEldmDslParser.g:297:3: ( rule__SubPath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:298:3: ( rule__SubPath__Group__0 )
            // InternalEldmDslParser.g:298:4: rule__SubPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubPath__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubPath"


    // $ANTLR start "entryRuleOperation"
    // InternalEldmDslParser.g:307:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:308:1: ( ruleOperation EOF )
            // InternalEldmDslParser.g:309:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalEldmDslParser.g:316:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:320:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalEldmDslParser.g:321:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalEldmDslParser.g:321:2: ( ( rule__Operation__Group__0 ) )
            // InternalEldmDslParser.g:322:3: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:323:3: ( rule__Operation__Group__0 )
            // InternalEldmDslParser.g:323:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParamDef"
    // InternalEldmDslParser.g:332:1: entryRuleParamDef : ruleParamDef EOF ;
    public final void entryRuleParamDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:333:1: ( ruleParamDef EOF )
            // InternalEldmDslParser.g:334:1: ruleParamDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamDef"


    // $ANTLR start "ruleParamDef"
    // InternalEldmDslParser.g:341:1: ruleParamDef : ( ( rule__ParamDef__Alternatives ) ) ;
    public final void ruleParamDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:345:2: ( ( ( rule__ParamDef__Alternatives ) ) )
            // InternalEldmDslParser.g:346:2: ( ( rule__ParamDef__Alternatives ) )
            {
            // InternalEldmDslParser.g:346:2: ( ( rule__ParamDef__Alternatives ) )
            // InternalEldmDslParser.g:347:3: ( rule__ParamDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamDefAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:348:3: ( rule__ParamDef__Alternatives )
            // InternalEldmDslParser.g:348:4: rule__ParamDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParamDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamDef"


    // $ANTLR start "entryRuleBlockExpression"
    // InternalEldmDslParser.g:357:1: entryRuleBlockExpression : ruleBlockExpression EOF ;
    public final void entryRuleBlockExpression() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:358:1: ( ruleBlockExpression EOF )
            // InternalEldmDslParser.g:359:1: ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // InternalEldmDslParser.g:366:1: ruleBlockExpression : ( ( rule__BlockExpression__Group__0 ) ) ;
    public final void ruleBlockExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:370:2: ( ( ( rule__BlockExpression__Group__0 ) ) )
            // InternalEldmDslParser.g:371:2: ( ( rule__BlockExpression__Group__0 ) )
            {
            // InternalEldmDslParser.g:371:2: ( ( rule__BlockExpression__Group__0 ) )
            // InternalEldmDslParser.g:372:3: ( rule__BlockExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:373:3: ( rule__BlockExpression__Group__0 )
            // InternalEldmDslParser.g:373:4: rule__BlockExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalEldmDslParser.g:382:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:383:1: ( ruleExpression EOF )
            // InternalEldmDslParser.g:384:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEldmDslParser.g:391:1: ruleExpression : ( Exp ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:395:2: ( ( Exp ) )
            // InternalEldmDslParser.g:396:2: ( Exp )
            {
            // InternalEldmDslParser.g:396:2: ( Exp )
            // InternalEldmDslParser.g:397:3: Exp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpKeyword()); 
            }
            match(input,Exp,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMapExpression"
    // InternalEldmDslParser.g:407:1: entryRuleMapExpression : ruleMapExpression EOF ;
    public final void entryRuleMapExpression() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:408:1: ( ruleMapExpression EOF )
            // InternalEldmDslParser.g:409:1: ruleMapExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapExpression"


    // $ANTLR start "ruleMapExpression"
    // InternalEldmDslParser.g:416:1: ruleMapExpression : ( Test10 ) ;
    public final void ruleMapExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:420:2: ( ( Test10 ) )
            // InternalEldmDslParser.g:421:2: ( Test10 )
            {
            // InternalEldmDslParser.g:421:2: ( Test10 )
            // InternalEldmDslParser.g:422:3: Test10
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapExpressionAccess().getTest10Keyword()); 
            }
            match(input,Test10,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapExpressionAccess().getTest10Keyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapExpression"


    // $ANTLR start "entryRuleDefinition"
    // InternalEldmDslParser.g:432:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:433:1: ( ruleDefinition EOF )
            // InternalEldmDslParser.g:434:1: ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalEldmDslParser.g:441:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:445:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalEldmDslParser.g:446:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalEldmDslParser.g:446:2: ( ( rule__Definition__Alternatives ) )
            // InternalEldmDslParser.g:447:3: ( rule__Definition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:448:3: ( rule__Definition__Alternatives )
            // InternalEldmDslParser.g:448:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleTypeDef"
    // InternalEldmDslParser.g:457:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:458:1: ( ruleTypeDef EOF )
            // InternalEldmDslParser.g:459:1: ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalEldmDslParser.g:466:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:470:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // InternalEldmDslParser.g:471:2: ( ( rule__TypeDef__Group__0 ) )
            {
            // InternalEldmDslParser.g:471:2: ( ( rule__TypeDef__Group__0 ) )
            // InternalEldmDslParser.g:472:3: ( rule__TypeDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:473:3: ( rule__TypeDef__Group__0 )
            // InternalEldmDslParser.g:473:4: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleEnumDef"
    // InternalEldmDslParser.g:482:1: entryRuleEnumDef : ruleEnumDef EOF ;
    public final void entryRuleEnumDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:483:1: ( ruleEnumDef EOF )
            // InternalEldmDslParser.g:484:1: ruleEnumDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumDef"


    // $ANTLR start "ruleEnumDef"
    // InternalEldmDslParser.g:491:1: ruleEnumDef : ( ( rule__EnumDef__Group__0 ) ) ;
    public final void ruleEnumDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:495:2: ( ( ( rule__EnumDef__Group__0 ) ) )
            // InternalEldmDslParser.g:496:2: ( ( rule__EnumDef__Group__0 ) )
            {
            // InternalEldmDslParser.g:496:2: ( ( rule__EnumDef__Group__0 ) )
            // InternalEldmDslParser.g:497:3: ( rule__EnumDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:498:3: ( rule__EnumDef__Group__0 )
            // InternalEldmDslParser.g:498:4: rule__EnumDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumDef"


    // $ANTLR start "entryRuleEnumItemDef"
    // InternalEldmDslParser.g:507:1: entryRuleEnumItemDef : ruleEnumItemDef EOF ;
    public final void entryRuleEnumItemDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:508:1: ( ruleEnumItemDef EOF )
            // InternalEldmDslParser.g:509:1: ruleEnumItemDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumItemDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumItemDef"


    // $ANTLR start "ruleEnumItemDef"
    // InternalEldmDslParser.g:516:1: ruleEnumItemDef : ( ( rule__EnumItemDef__Group__0 ) ) ;
    public final void ruleEnumItemDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:520:2: ( ( ( rule__EnumItemDef__Group__0 ) ) )
            // InternalEldmDslParser.g:521:2: ( ( rule__EnumItemDef__Group__0 ) )
            {
            // InternalEldmDslParser.g:521:2: ( ( rule__EnumItemDef__Group__0 ) )
            // InternalEldmDslParser.g:522:3: ( rule__EnumItemDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemDefAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:523:3: ( rule__EnumItemDef__Group__0 )
            // InternalEldmDslParser.g:523:4: rule__EnumItemDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumItemDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumItemDef"


    // $ANTLR start "entryRuleElementTypeDef"
    // InternalEldmDslParser.g:532:1: entryRuleElementTypeDef : ruleElementTypeDef EOF ;
    public final void entryRuleElementTypeDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:533:1: ( ruleElementTypeDef EOF )
            // InternalEldmDslParser.g:534:1: ruleElementTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElementTypeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementTypeDef"


    // $ANTLR start "ruleElementTypeDef"
    // InternalEldmDslParser.g:541:1: ruleElementTypeDef : ( ( rule__ElementTypeDef__Alternatives ) ) ;
    public final void ruleElementTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:545:2: ( ( ( rule__ElementTypeDef__Alternatives ) ) )
            // InternalEldmDslParser.g:546:2: ( ( rule__ElementTypeDef__Alternatives ) )
            {
            // InternalEldmDslParser.g:546:2: ( ( rule__ElementTypeDef__Alternatives ) )
            // InternalEldmDslParser.g:547:3: ( rule__ElementTypeDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeDefAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:548:3: ( rule__ElementTypeDef__Alternatives )
            // InternalEldmDslParser.g:548:4: rule__ElementTypeDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementTypeDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementTypeDef"


    // $ANTLR start "entryRuleValueDef"
    // InternalEldmDslParser.g:557:1: entryRuleValueDef : ruleValueDef EOF ;
    public final void entryRuleValueDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:558:1: ( ruleValueDef EOF )
            // InternalEldmDslParser.g:559:1: ruleValueDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValueDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueDef"


    // $ANTLR start "ruleValueDef"
    // InternalEldmDslParser.g:566:1: ruleValueDef : ( ( rule__ValueDef__Alternatives ) ) ;
    public final void ruleValueDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:570:2: ( ( ( rule__ValueDef__Alternatives ) ) )
            // InternalEldmDslParser.g:571:2: ( ( rule__ValueDef__Alternatives ) )
            {
            // InternalEldmDslParser.g:571:2: ( ( rule__ValueDef__Alternatives ) )
            // InternalEldmDslParser.g:572:3: ( rule__ValueDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueDefAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:573:3: ( rule__ValueDef__Alternatives )
            // InternalEldmDslParser.g:573:4: rule__ValueDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueDef"


    // $ANTLR start "entryRuleMapDef"
    // InternalEldmDslParser.g:582:1: entryRuleMapDef : ruleMapDef EOF ;
    public final void entryRuleMapDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:583:1: ( ruleMapDef EOF )
            // InternalEldmDslParser.g:584:1: ruleMapDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapDef"


    // $ANTLR start "ruleMapDef"
    // InternalEldmDslParser.g:591:1: ruleMapDef : ( ( rule__MapDef__Alternatives ) ) ;
    public final void ruleMapDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:595:2: ( ( ( rule__MapDef__Alternatives ) ) )
            // InternalEldmDslParser.g:596:2: ( ( rule__MapDef__Alternatives ) )
            {
            // InternalEldmDslParser.g:596:2: ( ( rule__MapDef__Alternatives ) )
            // InternalEldmDslParser.g:597:3: ( rule__MapDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:598:3: ( rule__MapDef__Alternatives )
            // InternalEldmDslParser.g:598:4: rule__MapDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapDef"


    // $ANTLR start "entryRuleMapEntryDef"
    // InternalEldmDslParser.g:607:1: entryRuleMapEntryDef : ruleMapEntryDef EOF ;
    public final void entryRuleMapEntryDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:608:1: ( ruleMapEntryDef EOF )
            // InternalEldmDslParser.g:609:1: ruleMapEntryDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapEntryDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapEntryDef"


    // $ANTLR start "ruleMapEntryDef"
    // InternalEldmDslParser.g:616:1: ruleMapEntryDef : ( ( rule__MapEntryDef__Group__0 ) ) ;
    public final void ruleMapEntryDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:620:2: ( ( ( rule__MapEntryDef__Group__0 ) ) )
            // InternalEldmDslParser.g:621:2: ( ( rule__MapEntryDef__Group__0 ) )
            {
            // InternalEldmDslParser.g:621:2: ( ( rule__MapEntryDef__Group__0 ) )
            // InternalEldmDslParser.g:622:3: ( rule__MapEntryDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:623:3: ( rule__MapEntryDef__Group__0 )
            // InternalEldmDslParser.g:623:4: rule__MapEntryDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapEntryDef"


    // $ANTLR start "entryRuleListDef"
    // InternalEldmDslParser.g:632:1: entryRuleListDef : ruleListDef EOF ;
    public final void entryRuleListDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:633:1: ( ruleListDef EOF )
            // InternalEldmDslParser.g:634:1: ruleListDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListDef"


    // $ANTLR start "ruleListDef"
    // InternalEldmDslParser.g:641:1: ruleListDef : ( ( rule__ListDef__Group__0 ) ) ;
    public final void ruleListDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:645:2: ( ( ( rule__ListDef__Group__0 ) ) )
            // InternalEldmDslParser.g:646:2: ( ( rule__ListDef__Group__0 ) )
            {
            // InternalEldmDslParser.g:646:2: ( ( rule__ListDef__Group__0 ) )
            // InternalEldmDslParser.g:647:3: ( rule__ListDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:648:3: ( rule__ListDef__Group__0 )
            // InternalEldmDslParser.g:648:4: rule__ListDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListDef"


    // $ANTLR start "entryRuleNativeDef"
    // InternalEldmDslParser.g:657:1: entryRuleNativeDef : ruleNativeDef EOF ;
    public final void entryRuleNativeDef() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:658:1: ( ruleNativeDef EOF )
            // InternalEldmDslParser.g:659:1: ruleNativeDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNativeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeDef"


    // $ANTLR start "ruleNativeDef"
    // InternalEldmDslParser.g:666:1: ruleNativeDef : ( ( rule__NativeDef__Alternatives ) ) ;
    public final void ruleNativeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:670:2: ( ( ( rule__NativeDef__Alternatives ) ) )
            // InternalEldmDslParser.g:671:2: ( ( rule__NativeDef__Alternatives ) )
            {
            // InternalEldmDslParser.g:671:2: ( ( rule__NativeDef__Alternatives ) )
            // InternalEldmDslParser.g:672:3: ( rule__NativeDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNativeDefAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:673:3: ( rule__NativeDef__Alternatives )
            // InternalEldmDslParser.g:673:4: rule__NativeDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NativeDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNativeDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeDef"


    // $ANTLR start "entryRuleLiteral"
    // InternalEldmDslParser.g:682:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:683:1: ( ruleLiteral EOF )
            // InternalEldmDslParser.g:684:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalEldmDslParser.g:691:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:695:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalEldmDslParser.g:696:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalEldmDslParser.g:696:2: ( ( rule__Literal__Alternatives ) )
            // InternalEldmDslParser.g:697:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:698:3: ( rule__Literal__Alternatives )
            // InternalEldmDslParser.g:698:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // InternalEldmDslParser.g:707:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:708:1: ( ruleNullLiteral EOF )
            // InternalEldmDslParser.g:709:1: ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNullLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // InternalEldmDslParser.g:716:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:720:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:721:2: ( ( rule__NullLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:721:2: ( ( rule__NullLiteral__Group__0 ) )
            // InternalEldmDslParser.g:722:3: ( rule__NullLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:723:3: ( rule__NullLiteral__Group__0 )
            // InternalEldmDslParser.g:723:4: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalEldmDslParser.g:732:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:733:1: ( ruleBoolLiteral EOF )
            // InternalEldmDslParser.g:734:1: ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalEldmDslParser.g:741:1: ruleBoolLiteral : ( ( rule__BoolLiteral__Group__0 ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:745:2: ( ( ( rule__BoolLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:746:2: ( ( rule__BoolLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:746:2: ( ( rule__BoolLiteral__Group__0 ) )
            // InternalEldmDslParser.g:747:3: ( rule__BoolLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:748:3: ( rule__BoolLiteral__Group__0 )
            // InternalEldmDslParser.g:748:4: rule__BoolLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStrLiteral"
    // InternalEldmDslParser.g:757:1: entryRuleStrLiteral : ruleStrLiteral EOF ;
    public final void entryRuleStrLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:758:1: ( ruleStrLiteral EOF )
            // InternalEldmDslParser.g:759:1: ruleStrLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStrLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStrLiteral"


    // $ANTLR start "ruleStrLiteral"
    // InternalEldmDslParser.g:766:1: ruleStrLiteral : ( ( rule__StrLiteral__ValueAssignment ) ) ;
    public final void ruleStrLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:770:2: ( ( ( rule__StrLiteral__ValueAssignment ) ) )
            // InternalEldmDslParser.g:771:2: ( ( rule__StrLiteral__ValueAssignment ) )
            {
            // InternalEldmDslParser.g:771:2: ( ( rule__StrLiteral__ValueAssignment ) )
            // InternalEldmDslParser.g:772:3: ( rule__StrLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrLiteralAccess().getValueAssignment()); 
            }
            // InternalEldmDslParser.g:773:3: ( rule__StrLiteral__ValueAssignment )
            // InternalEldmDslParser.g:773:4: rule__StrLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StrLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalEldmDslParser.g:782:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:783:1: ( ruleIntLiteral EOF )
            // InternalEldmDslParser.g:784:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalEldmDslParser.g:791:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:795:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalEldmDslParser.g:796:2: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalEldmDslParser.g:796:2: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalEldmDslParser.g:797:3: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // InternalEldmDslParser.g:798:3: ( rule__IntLiteral__ValueAssignment )
            // InternalEldmDslParser.g:798:4: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFltLiteral"
    // InternalEldmDslParser.g:807:1: entryRuleFltLiteral : ruleFltLiteral EOF ;
    public final void entryRuleFltLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:808:1: ( ruleFltLiteral EOF )
            // InternalEldmDslParser.g:809:1: ruleFltLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFltLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFltLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFltLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFltLiteral"


    // $ANTLR start "ruleFltLiteral"
    // InternalEldmDslParser.g:816:1: ruleFltLiteral : ( ( rule__FltLiteral__ValueAssignment ) ) ;
    public final void ruleFltLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:820:2: ( ( ( rule__FltLiteral__ValueAssignment ) ) )
            // InternalEldmDslParser.g:821:2: ( ( rule__FltLiteral__ValueAssignment ) )
            {
            // InternalEldmDslParser.g:821:2: ( ( rule__FltLiteral__ValueAssignment ) )
            // InternalEldmDslParser.g:822:3: ( rule__FltLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFltLiteralAccess().getValueAssignment()); 
            }
            // InternalEldmDslParser.g:823:3: ( rule__FltLiteral__ValueAssignment )
            // InternalEldmDslParser.g:823:4: rule__FltLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FltLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFltLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFltLiteral"


    // $ANTLR start "entryRuleDateLiteral"
    // InternalEldmDslParser.g:832:1: entryRuleDateLiteral : ruleDateLiteral EOF ;
    public final void entryRuleDateLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:833:1: ( ruleDateLiteral EOF )
            // InternalEldmDslParser.g:834:1: ruleDateLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDateLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // InternalEldmDslParser.g:841:1: ruleDateLiteral : ( ( rule__DateLiteral__Group__0 ) ) ;
    public final void ruleDateLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:845:2: ( ( ( rule__DateLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:846:2: ( ( rule__DateLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:846:2: ( ( rule__DateLiteral__Group__0 ) )
            // InternalEldmDslParser.g:847:3: ( rule__DateLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:848:3: ( rule__DateLiteral__Group__0 )
            // InternalEldmDslParser.g:848:4: rule__DateLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalEldmDslParser.g:857:1: entryRuleTimeLiteral : ruleTimeLiteral EOF ;
    public final void entryRuleTimeLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:858:1: ( ruleTimeLiteral EOF )
            // InternalEldmDslParser.g:859:1: ruleTimeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTimeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalEldmDslParser.g:866:1: ruleTimeLiteral : ( ( rule__TimeLiteral__Group__0 ) ) ;
    public final void ruleTimeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:870:2: ( ( ( rule__TimeLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:871:2: ( ( rule__TimeLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:871:2: ( ( rule__TimeLiteral__Group__0 ) )
            // InternalEldmDslParser.g:872:3: ( rule__TimeLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:873:3: ( rule__TimeLiteral__Group__0 )
            // InternalEldmDslParser.g:873:4: rule__TimeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleDateTimeLiteral"
    // InternalEldmDslParser.g:882:1: entryRuleDateTimeLiteral : ruleDateTimeLiteral EOF ;
    public final void entryRuleDateTimeLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:883:1: ( ruleDateTimeLiteral EOF )
            // InternalEldmDslParser.g:884:1: ruleDateTimeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDateTimeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateTimeLiteral"


    // $ANTLR start "ruleDateTimeLiteral"
    // InternalEldmDslParser.g:891:1: ruleDateTimeLiteral : ( ( rule__DateTimeLiteral__Group__0 ) ) ;
    public final void ruleDateTimeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:895:2: ( ( ( rule__DateTimeLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:896:2: ( ( rule__DateTimeLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:896:2: ( ( rule__DateTimeLiteral__Group__0 ) )
            // InternalEldmDslParser.g:897:3: ( rule__DateTimeLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:898:3: ( rule__DateTimeLiteral__Group__0 )
            // InternalEldmDslParser.g:898:4: rule__DateTimeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTimeLiteral"


    // $ANTLR start "entryRuleListLiteral"
    // InternalEldmDslParser.g:907:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:908:1: ( ruleListLiteral EOF )
            // InternalEldmDslParser.g:909:1: ruleListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListLiteral"


    // $ANTLR start "ruleListLiteral"
    // InternalEldmDslParser.g:916:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:920:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:921:2: ( ( rule__ListLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:921:2: ( ( rule__ListLiteral__Group__0 ) )
            // InternalEldmDslParser.g:922:3: ( rule__ListLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:923:3: ( rule__ListLiteral__Group__0 )
            // InternalEldmDslParser.g:923:4: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListLiteral"


    // $ANTLR start "entryRuleMapLiteral"
    // InternalEldmDslParser.g:932:1: entryRuleMapLiteral : ruleMapLiteral EOF ;
    public final void entryRuleMapLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:933:1: ( ruleMapLiteral EOF )
            // InternalEldmDslParser.g:934:1: ruleMapLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapLiteral"


    // $ANTLR start "ruleMapLiteral"
    // InternalEldmDslParser.g:941:1: ruleMapLiteral : ( ( rule__MapLiteral__Group__0 ) ) ;
    public final void ruleMapLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:945:2: ( ( ( rule__MapLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:946:2: ( ( rule__MapLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:946:2: ( ( rule__MapLiteral__Group__0 ) )
            // InternalEldmDslParser.g:947:3: ( rule__MapLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:948:3: ( rule__MapLiteral__Group__0 )
            // InternalEldmDslParser.g:948:4: rule__MapLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapLiteral"


    // $ANTLR start "entryRuleMapEntryLiteral"
    // InternalEldmDslParser.g:957:1: entryRuleMapEntryLiteral : ruleMapEntryLiteral EOF ;
    public final void entryRuleMapEntryLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:958:1: ( ruleMapEntryLiteral EOF )
            // InternalEldmDslParser.g:959:1: ruleMapEntryLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapEntryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapEntryLiteral"


    // $ANTLR start "ruleMapEntryLiteral"
    // InternalEldmDslParser.g:966:1: ruleMapEntryLiteral : ( ( rule__MapEntryLiteral__Group__0 ) ) ;
    public final void ruleMapEntryLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:970:2: ( ( ( rule__MapEntryLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:971:2: ( ( rule__MapEntryLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:971:2: ( ( rule__MapEntryLiteral__Group__0 ) )
            // InternalEldmDslParser.g:972:3: ( rule__MapEntryLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:973:3: ( rule__MapEntryLiteral__Group__0 )
            // InternalEldmDslParser.g:973:4: rule__MapEntryLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapEntryLiteral"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalEldmDslParser.g:982:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:983:1: ( ruleEnumLiteral EOF )
            // InternalEldmDslParser.g:984:1: ruleEnumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalEldmDslParser.g:991:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:995:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:996:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:996:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalEldmDslParser.g:997:3: ( rule__EnumLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:998:3: ( rule__EnumLiteral__Group__0 )
            // InternalEldmDslParser.g:998:4: rule__EnumLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRulePatternLiteral"
    // InternalEldmDslParser.g:1007:1: entryRulePatternLiteral : rulePatternLiteral EOF ;
    public final void entryRulePatternLiteral() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:1008:1: ( rulePatternLiteral EOF )
            // InternalEldmDslParser.g:1009:1: rulePatternLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePatternLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternLiteral"


    // $ANTLR start "rulePatternLiteral"
    // InternalEldmDslParser.g:1016:1: rulePatternLiteral : ( ( rule__PatternLiteral__Group__0 ) ) ;
    public final void rulePatternLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1020:2: ( ( ( rule__PatternLiteral__Group__0 ) ) )
            // InternalEldmDslParser.g:1021:2: ( ( rule__PatternLiteral__Group__0 ) )
            {
            // InternalEldmDslParser.g:1021:2: ( ( rule__PatternLiteral__Group__0 ) )
            // InternalEldmDslParser.g:1022:3: ( rule__PatternLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:1023:3: ( rule__PatternLiteral__Group__0 )
            // InternalEldmDslParser.g:1023:4: rule__PatternLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternLiteral"


    // $ANTLR start "entryRulePath"
    // InternalEldmDslParser.g:1032:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:1033:1: ( rulePath EOF )
            // InternalEldmDslParser.g:1034:1: rulePath EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalEldmDslParser.g:1041:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1045:2: ( ( ( rule__Path__Group__0 ) ) )
            // InternalEldmDslParser.g:1046:2: ( ( rule__Path__Group__0 ) )
            {
            // InternalEldmDslParser.g:1046:2: ( ( rule__Path__Group__0 ) )
            // InternalEldmDslParser.g:1047:3: ( rule__Path__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:1048:3: ( rule__Path__Group__0 )
            // InternalEldmDslParser.g:1048:4: rule__Path__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalEldmDslParser.g:1057:1: entryRuleQualifiedNameInStaticImport : ruleQualifiedNameInStaticImport EOF ;
    public final void entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:1058:1: ( ruleQualifiedNameInStaticImport EOF )
            // InternalEldmDslParser.g:1059:1: ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalEldmDslParser.g:1066:1: ruleQualifiedNameInStaticImport : ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) ;
    public final void ruleQualifiedNameInStaticImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1070:2: ( ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) )
            // InternalEldmDslParser.g:1071:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            {
            // InternalEldmDslParser.g:1071:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            // InternalEldmDslParser.g:1072:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            {
            // InternalEldmDslParser.g:1072:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) )
            // InternalEldmDslParser.g:1073:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:1074:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            // InternalEldmDslParser.g:1074:5: rule__QualifiedNameInStaticImport__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedNameInStaticImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }

            }

            // InternalEldmDslParser.g:1077:3: ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            // InternalEldmDslParser.g:1078:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalEldmDslParser.g:1079:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEldmDslParser.g:1079:5: rule__QualifiedNameInStaticImport__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__QualifiedNameInStaticImport__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"


    // $ANTLR start "entryRuleBREAK"
    // InternalEldmDslParser.g:1089:1: entryRuleBREAK : ruleBREAK EOF ;
    public final void entryRuleBREAK() throws RecognitionException {
        try {
            // InternalEldmDslParser.g:1090:1: ( ruleBREAK EOF )
            // InternalEldmDslParser.g:1091:1: ruleBREAK EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBREAKRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBREAK();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBREAKRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBREAK"


    // $ANTLR start "ruleBREAK"
    // InternalEldmDslParser.g:1098:1: ruleBREAK : ( ( rule__BREAK__Alternatives )* ) ;
    public final void ruleBREAK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1102:2: ( ( ( rule__BREAK__Alternatives )* ) )
            // InternalEldmDslParser.g:1103:2: ( ( rule__BREAK__Alternatives )* )
            {
            // InternalEldmDslParser.g:1103:2: ( ( rule__BREAK__Alternatives )* )
            // InternalEldmDslParser.g:1104:3: ( rule__BREAK__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBREAKAccess().getAlternatives()); 
            }
            // InternalEldmDslParser.g:1105:3: ( rule__BREAK__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=LineFeed && LA2_0<=CarriageReturn)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEldmDslParser.g:1105:4: rule__BREAK__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BREAK__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBREAKAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBREAK"


    // $ANTLR start "rule__Import__Alternatives"
    // InternalEldmDslParser.g:1113:1: rule__Import__Alternatives : ( ( ruleImportOperation ) | ( ruleImportDefinition ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1117:1: ( ( ruleImportOperation ) | ( ruleImportDefinition ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_PID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEldmDslParser.g:1118:2: ( ruleImportOperation )
                    {
                    // InternalEldmDslParser.g:1118:2: ( ruleImportOperation )
                    // InternalEldmDslParser.g:1119:3: ruleImportOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleImportOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getImportOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1124:2: ( ruleImportDefinition )
                    {
                    // InternalEldmDslParser.g:1124:2: ( ruleImportDefinition )
                    // InternalEldmDslParser.g:1125:3: ruleImportDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleImportDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getImportDefinitionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__ExternalDef__Alternatives"
    // InternalEldmDslParser.g:1134:1: rule__ExternalDef__Alternatives : ( ( ( rule__ExternalDef__Group_0__0 ) ) | ( ( rule__ExternalDef__NameAssignment_1 ) ) );
    public final void rule__ExternalDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1138:1: ( ( ( rule__ExternalDef__Group_0__0 ) ) | ( ( rule__ExternalDef__NameAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred4_InternalEldmDslParser()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEldmDslParser.g:1139:2: ( ( rule__ExternalDef__Group_0__0 ) )
                    {
                    // InternalEldmDslParser.g:1139:2: ( ( rule__ExternalDef__Group_0__0 ) )
                    // InternalEldmDslParser.g:1140:3: ( rule__ExternalDef__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExternalDefAccess().getGroup_0()); 
                    }
                    // InternalEldmDslParser.g:1141:3: ( rule__ExternalDef__Group_0__0 )
                    // InternalEldmDslParser.g:1141:4: rule__ExternalDef__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalDef__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExternalDefAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1145:2: ( ( rule__ExternalDef__NameAssignment_1 ) )
                    {
                    // InternalEldmDslParser.g:1145:2: ( ( rule__ExternalDef__NameAssignment_1 ) )
                    // InternalEldmDslParser.g:1146:3: ( rule__ExternalDef__NameAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExternalDefAccess().getNameAssignment_1()); 
                    }
                    // InternalEldmDslParser.g:1147:3: ( rule__ExternalDef__NameAssignment_1 )
                    // InternalEldmDslParser.g:1147:4: rule__ExternalDef__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalDef__NameAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExternalDefAccess().getNameAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Alternatives"


    // $ANTLR start "rule__ExternalModule__Alternatives"
    // InternalEldmDslParser.g:1155:1: rule__ExternalModule__Alternatives : ( ( ( rule__ExternalModule__RefAssignment_0 ) ) | ( ( rule__ExternalModule__Group_1__0 ) ) );
    public final void rule__ExternalModule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1159:1: ( ( ( rule__ExternalModule__RefAssignment_0 ) ) | ( ( rule__ExternalModule__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_PID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEldmDslParser.g:1160:2: ( ( rule__ExternalModule__RefAssignment_0 ) )
                    {
                    // InternalEldmDslParser.g:1160:2: ( ( rule__ExternalModule__RefAssignment_0 ) )
                    // InternalEldmDslParser.g:1161:3: ( rule__ExternalModule__RefAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExternalModuleAccess().getRefAssignment_0()); 
                    }
                    // InternalEldmDslParser.g:1162:3: ( rule__ExternalModule__RefAssignment_0 )
                    // InternalEldmDslParser.g:1162:4: rule__ExternalModule__RefAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalModule__RefAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExternalModuleAccess().getRefAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1166:2: ( ( rule__ExternalModule__Group_1__0 ) )
                    {
                    // InternalEldmDslParser.g:1166:2: ( ( rule__ExternalModule__Group_1__0 ) )
                    // InternalEldmDslParser.g:1167:3: ( rule__ExternalModule__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExternalModuleAccess().getGroup_1()); 
                    }
                    // InternalEldmDslParser.g:1168:3: ( rule__ExternalModule__Group_1__0 )
                    // InternalEldmDslParser.g:1168:4: rule__ExternalModule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalModule__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExternalModuleAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives_1"
    // InternalEldmDslParser.g:1176:1: rule__Operation__Alternatives_1 : ( ( ( rule__Operation__IsGetAssignment_1_0 ) ) | ( Set ) );
    public final void rule__Operation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1180:1: ( ( ( rule__Operation__IsGetAssignment_1_0 ) ) | ( Set ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Get) ) {
                alt6=1;
            }
            else if ( (LA6_0==Set) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEldmDslParser.g:1181:2: ( ( rule__Operation__IsGetAssignment_1_0 ) )
                    {
                    // InternalEldmDslParser.g:1181:2: ( ( rule__Operation__IsGetAssignment_1_0 ) )
                    // InternalEldmDslParser.g:1182:3: ( rule__Operation__IsGetAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getIsGetAssignment_1_0()); 
                    }
                    // InternalEldmDslParser.g:1183:3: ( rule__Operation__IsGetAssignment_1_0 )
                    // InternalEldmDslParser.g:1183:4: rule__Operation__IsGetAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__IsGetAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getIsGetAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1187:2: ( Set )
                    {
                    // InternalEldmDslParser.g:1187:2: ( Set )
                    // InternalEldmDslParser.g:1188:3: Set
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getSetKeyword_1_1()); 
                    }
                    match(input,Set,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getSetKeyword_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives_1"


    // $ANTLR start "rule__ParamDef__Alternatives"
    // InternalEldmDslParser.g:1197:1: rule__ParamDef__Alternatives : ( ( ( rule__ParamDef__DefAssignment_0 ) ) | ( ( rule__ParamDef__RefAssignment_1 ) ) );
    public final void rule__ParamDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1201:1: ( ( ( rule__ParamDef__DefAssignment_0 ) ) | ( ( rule__ParamDef__RefAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LeftCurlyBracket) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEldmDslParser.g:1202:2: ( ( rule__ParamDef__DefAssignment_0 ) )
                    {
                    // InternalEldmDslParser.g:1202:2: ( ( rule__ParamDef__DefAssignment_0 ) )
                    // InternalEldmDslParser.g:1203:3: ( rule__ParamDef__DefAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParamDefAccess().getDefAssignment_0()); 
                    }
                    // InternalEldmDslParser.g:1204:3: ( rule__ParamDef__DefAssignment_0 )
                    // InternalEldmDslParser.g:1204:4: rule__ParamDef__DefAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamDef__DefAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParamDefAccess().getDefAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1208:2: ( ( rule__ParamDef__RefAssignment_1 ) )
                    {
                    // InternalEldmDslParser.g:1208:2: ( ( rule__ParamDef__RefAssignment_1 ) )
                    // InternalEldmDslParser.g:1209:3: ( rule__ParamDef__RefAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParamDefAccess().getRefAssignment_1()); 
                    }
                    // InternalEldmDslParser.g:1210:3: ( rule__ParamDef__RefAssignment_1 )
                    // InternalEldmDslParser.g:1210:4: rule__ParamDef__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamDef__RefAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParamDefAccess().getRefAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDef__Alternatives"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalEldmDslParser.g:1218:1: rule__Definition__Alternatives : ( ( ruleTypeDef ) | ( ruleEnumDef ) | ( ruleExternalDef ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1222:1: ( ( ruleTypeDef ) | ( ruleEnumDef ) | ( ruleExternalDef ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case Typedef:
                {
                alt8=1;
                }
                break;
            case Enum:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEldmDslParser.g:1223:2: ( ruleTypeDef )
                    {
                    // InternalEldmDslParser.g:1223:2: ( ruleTypeDef )
                    // InternalEldmDslParser.g:1224:3: ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionAccess().getTypeDefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionAccess().getTypeDefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1229:2: ( ruleEnumDef )
                    {
                    // InternalEldmDslParser.g:1229:2: ( ruleEnumDef )
                    // InternalEldmDslParser.g:1230:3: ruleEnumDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionAccess().getEnumDefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnumDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionAccess().getEnumDefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:1235:2: ( ruleExternalDef )
                    {
                    // InternalEldmDslParser.g:1235:2: ( ruleExternalDef )
                    // InternalEldmDslParser.g:1236:3: ruleExternalDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionAccess().getExternalDefParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExternalDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionAccess().getExternalDefParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__TypeDef__Alternatives_2"
    // InternalEldmDslParser.g:1245:1: rule__TypeDef__Alternatives_2 : ( ( ( rule__TypeDef__Group_2_0__0 ) ) | ( ( rule__TypeDef__TypeAssignment_2_1 ) ) );
    public final void rule__TypeDef__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1249:1: ( ( ( rule__TypeDef__Group_2_0__0 ) ) | ( ( rule__TypeDef__TypeAssignment_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Return||LA9_0==Regex||LA9_0==Mask) ) {
                alt9=1;
            }
            else if ( (LA9_0==Bool||LA9_0==Path||LA9_0==Any||LA9_0==Flt||(LA9_0>=Int && LA9_0<=Ldt)||LA9_0==Ltm||LA9_0==Str||LA9_0==FullStopFullStop||LA9_0==LeftCurlyBracket) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEldmDslParser.g:1250:2: ( ( rule__TypeDef__Group_2_0__0 ) )
                    {
                    // InternalEldmDslParser.g:1250:2: ( ( rule__TypeDef__Group_2_0__0 ) )
                    // InternalEldmDslParser.g:1251:3: ( rule__TypeDef__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDefAccess().getGroup_2_0()); 
                    }
                    // InternalEldmDslParser.g:1252:3: ( rule__TypeDef__Group_2_0__0 )
                    // InternalEldmDslParser.g:1252:4: rule__TypeDef__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeDef__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDefAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1256:2: ( ( rule__TypeDef__TypeAssignment_2_1 ) )
                    {
                    // InternalEldmDslParser.g:1256:2: ( ( rule__TypeDef__TypeAssignment_2_1 ) )
                    // InternalEldmDslParser.g:1257:3: ( rule__TypeDef__TypeAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDefAccess().getTypeAssignment_2_1()); 
                    }
                    // InternalEldmDslParser.g:1258:3: ( rule__TypeDef__TypeAssignment_2_1 )
                    // InternalEldmDslParser.g:1258:4: rule__TypeDef__TypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeDef__TypeAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDefAccess().getTypeAssignment_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Alternatives_2"


    // $ANTLR start "rule__TypeDef__ParserAlternatives_2_0_0_0"
    // InternalEldmDslParser.g:1266:1: rule__TypeDef__ParserAlternatives_2_0_0_0 : ( ( Regex ) | ( Mask ) | ( Return ) );
    public final void rule__TypeDef__ParserAlternatives_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1270:1: ( ( Regex ) | ( Mask ) | ( Return ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Regex:
                {
                alt10=1;
                }
                break;
            case Mask:
                {
                alt10=2;
                }
                break;
            case Return:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalEldmDslParser.g:1271:2: ( Regex )
                    {
                    // InternalEldmDslParser.g:1271:2: ( Regex )
                    // InternalEldmDslParser.g:1272:3: Regex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDefAccess().getParserRegexKeyword_2_0_0_0_0()); 
                    }
                    match(input,Regex,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDefAccess().getParserRegexKeyword_2_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1277:2: ( Mask )
                    {
                    // InternalEldmDslParser.g:1277:2: ( Mask )
                    // InternalEldmDslParser.g:1278:3: Mask
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDefAccess().getParserMaskKeyword_2_0_0_0_1()); 
                    }
                    match(input,Mask,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDefAccess().getParserMaskKeyword_2_0_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:1283:2: ( Return )
                    {
                    // InternalEldmDslParser.g:1283:2: ( Return )
                    // InternalEldmDslParser.g:1284:3: Return
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDefAccess().getParserReturnKeyword_2_0_0_0_2()); 
                    }
                    match(input,Return,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDefAccess().getParserReturnKeyword_2_0_0_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__ParserAlternatives_2_0_0_0"


    // $ANTLR start "rule__ElementTypeDef__Alternatives"
    // InternalEldmDslParser.g:1293:1: rule__ElementTypeDef__Alternatives : ( ( ruleValueDef ) | ( ( rule__ElementTypeDef__RefAssignment_1 ) ) );
    public final void rule__ElementTypeDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1297:1: ( ( ruleValueDef ) | ( ( rule__ElementTypeDef__RefAssignment_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Bool||LA11_0==Path||LA11_0==Any||LA11_0==Flt||(LA11_0>=Int && LA11_0<=Ldt)||LA11_0==Ltm||LA11_0==Str||LA11_0==FullStopFullStop||LA11_0==LeftCurlyBracket) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEldmDslParser.g:1298:2: ( ruleValueDef )
                    {
                    // InternalEldmDslParser.g:1298:2: ( ruleValueDef )
                    // InternalEldmDslParser.g:1299:3: ruleValueDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeDefAccess().getValueDefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleValueDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeDefAccess().getValueDefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1304:2: ( ( rule__ElementTypeDef__RefAssignment_1 ) )
                    {
                    // InternalEldmDslParser.g:1304:2: ( ( rule__ElementTypeDef__RefAssignment_1 ) )
                    // InternalEldmDslParser.g:1305:3: ( rule__ElementTypeDef__RefAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeDefAccess().getRefAssignment_1()); 
                    }
                    // InternalEldmDslParser.g:1306:3: ( rule__ElementTypeDef__RefAssignment_1 )
                    // InternalEldmDslParser.g:1306:4: rule__ElementTypeDef__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementTypeDef__RefAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeDefAccess().getRefAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementTypeDef__Alternatives"


    // $ANTLR start "rule__ValueDef__Alternatives"
    // InternalEldmDslParser.g:1314:1: rule__ValueDef__Alternatives : ( ( ( rule__ValueDef__NativeAssignment_0 ) ) | ( ruleListDef ) | ( ruleMapDef ) );
    public final void rule__ValueDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1318:1: ( ( ( rule__ValueDef__NativeAssignment_0 ) ) | ( ruleListDef ) | ( ruleMapDef ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case Bool:
            case Path:
            case Any:
            case Flt:
            case Int:
            case Lda:
            case Ldt:
            case Ltm:
            case Str:
                {
                alt12=1;
                }
                break;
            case FullStopFullStop:
                {
                alt12=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalEldmDslParser.g:1319:2: ( ( rule__ValueDef__NativeAssignment_0 ) )
                    {
                    // InternalEldmDslParser.g:1319:2: ( ( rule__ValueDef__NativeAssignment_0 ) )
                    // InternalEldmDslParser.g:1320:3: ( rule__ValueDef__NativeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueDefAccess().getNativeAssignment_0()); 
                    }
                    // InternalEldmDslParser.g:1321:3: ( rule__ValueDef__NativeAssignment_0 )
                    // InternalEldmDslParser.g:1321:4: rule__ValueDef__NativeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueDef__NativeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueDefAccess().getNativeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1325:2: ( ruleListDef )
                    {
                    // InternalEldmDslParser.g:1325:2: ( ruleListDef )
                    // InternalEldmDslParser.g:1326:3: ruleListDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueDefAccess().getListDefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleListDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueDefAccess().getListDefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:1331:2: ( ruleMapDef )
                    {
                    // InternalEldmDslParser.g:1331:2: ( ruleMapDef )
                    // InternalEldmDslParser.g:1332:3: ruleMapDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueDefAccess().getMapDefParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMapDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueDefAccess().getMapDefParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueDef__Alternatives"


    // $ANTLR start "rule__MapDef__Alternatives"
    // InternalEldmDslParser.g:1341:1: rule__MapDef__Alternatives : ( ( ( rule__MapDef__Group_0__0 ) ) | ( ( rule__MapDef__Group_1__0 ) ) );
    public final void rule__MapDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1345:1: ( ( ( rule__MapDef__Group_0__0 ) ) | ( ( rule__MapDef__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RightCurlyBracket||LA13_1==RULE_ID) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_BEGIN) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEldmDslParser.g:1346:2: ( ( rule__MapDef__Group_0__0 ) )
                    {
                    // InternalEldmDslParser.g:1346:2: ( ( rule__MapDef__Group_0__0 ) )
                    // InternalEldmDslParser.g:1347:3: ( rule__MapDef__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMapDefAccess().getGroup_0()); 
                    }
                    // InternalEldmDslParser.g:1348:3: ( rule__MapDef__Group_0__0 )
                    // InternalEldmDslParser.g:1348:4: rule__MapDef__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapDef__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMapDefAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1352:2: ( ( rule__MapDef__Group_1__0 ) )
                    {
                    // InternalEldmDslParser.g:1352:2: ( ( rule__MapDef__Group_1__0 ) )
                    // InternalEldmDslParser.g:1353:3: ( rule__MapDef__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMapDefAccess().getGroup_1()); 
                    }
                    // InternalEldmDslParser.g:1354:3: ( rule__MapDef__Group_1__0 )
                    // InternalEldmDslParser.g:1354:4: rule__MapDef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapDef__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMapDefAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Alternatives"


    // $ANTLR start "rule__MapEntryDef__Alternatives_1"
    // InternalEldmDslParser.g:1362:1: rule__MapEntryDef__Alternatives_1 : ( ( ( rule__MapEntryDef__Group_1_0__0 ) ) | ( ( rule__MapEntryDef__Group_1_1__0 ) ) );
    public final void rule__MapEntryDef__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1366:1: ( ( ( rule__MapEntryDef__Group_1_0__0 ) ) | ( ( rule__MapEntryDef__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Colon||LA14_0==QuestionMark) ) {
                alt14=1;
            }
            else if ( (LA14_0==EqualsSign) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEldmDslParser.g:1367:2: ( ( rule__MapEntryDef__Group_1_0__0 ) )
                    {
                    // InternalEldmDslParser.g:1367:2: ( ( rule__MapEntryDef__Group_1_0__0 ) )
                    // InternalEldmDslParser.g:1368:3: ( rule__MapEntryDef__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMapEntryDefAccess().getGroup_1_0()); 
                    }
                    // InternalEldmDslParser.g:1369:3: ( rule__MapEntryDef__Group_1_0__0 )
                    // InternalEldmDslParser.g:1369:4: rule__MapEntryDef__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapEntryDef__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMapEntryDefAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1373:2: ( ( rule__MapEntryDef__Group_1_1__0 ) )
                    {
                    // InternalEldmDslParser.g:1373:2: ( ( rule__MapEntryDef__Group_1_1__0 ) )
                    // InternalEldmDslParser.g:1374:3: ( rule__MapEntryDef__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMapEntryDefAccess().getGroup_1_1()); 
                    }
                    // InternalEldmDslParser.g:1375:3: ( rule__MapEntryDef__Group_1_1__0 )
                    // InternalEldmDslParser.g:1375:4: rule__MapEntryDef__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapEntryDef__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMapEntryDefAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Alternatives_1"


    // $ANTLR start "rule__NativeDef__Alternatives"
    // InternalEldmDslParser.g:1383:1: rule__NativeDef__Alternatives : ( ( Any ) | ( Bool ) | ( Str ) | ( Int ) | ( Flt ) | ( Lda ) | ( Ltm ) | ( Ldt ) | ( Path ) );
    public final void rule__NativeDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1387:1: ( ( Any ) | ( Bool ) | ( Str ) | ( Int ) | ( Flt ) | ( Lda ) | ( Ltm ) | ( Ldt ) | ( Path ) )
            int alt15=9;
            switch ( input.LA(1) ) {
            case Any:
                {
                alt15=1;
                }
                break;
            case Bool:
                {
                alt15=2;
                }
                break;
            case Str:
                {
                alt15=3;
                }
                break;
            case Int:
                {
                alt15=4;
                }
                break;
            case Flt:
                {
                alt15=5;
                }
                break;
            case Lda:
                {
                alt15=6;
                }
                break;
            case Ltm:
                {
                alt15=7;
                }
                break;
            case Ldt:
                {
                alt15=8;
                }
                break;
            case Path:
                {
                alt15=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalEldmDslParser.g:1388:2: ( Any )
                    {
                    // InternalEldmDslParser.g:1388:2: ( Any )
                    // InternalEldmDslParser.g:1389:3: Any
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getAnyKeyword_0()); 
                    }
                    match(input,Any,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getAnyKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1394:2: ( Bool )
                    {
                    // InternalEldmDslParser.g:1394:2: ( Bool )
                    // InternalEldmDslParser.g:1395:3: Bool
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getBoolKeyword_1()); 
                    }
                    match(input,Bool,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getBoolKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:1400:2: ( Str )
                    {
                    // InternalEldmDslParser.g:1400:2: ( Str )
                    // InternalEldmDslParser.g:1401:3: Str
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getStrKeyword_2()); 
                    }
                    match(input,Str,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getStrKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:1406:2: ( Int )
                    {
                    // InternalEldmDslParser.g:1406:2: ( Int )
                    // InternalEldmDslParser.g:1407:3: Int
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getIntKeyword_3()); 
                    }
                    match(input,Int,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getIntKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:1412:2: ( Flt )
                    {
                    // InternalEldmDslParser.g:1412:2: ( Flt )
                    // InternalEldmDslParser.g:1413:3: Flt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getFltKeyword_4()); 
                    }
                    match(input,Flt,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getFltKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:1418:2: ( Lda )
                    {
                    // InternalEldmDslParser.g:1418:2: ( Lda )
                    // InternalEldmDslParser.g:1419:3: Lda
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getLdaKeyword_5()); 
                    }
                    match(input,Lda,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getLdaKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:1424:2: ( Ltm )
                    {
                    // InternalEldmDslParser.g:1424:2: ( Ltm )
                    // InternalEldmDslParser.g:1425:3: Ltm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getLtmKeyword_6()); 
                    }
                    match(input,Ltm,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getLtmKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:1430:2: ( Ldt )
                    {
                    // InternalEldmDslParser.g:1430:2: ( Ldt )
                    // InternalEldmDslParser.g:1431:3: Ldt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getLdtKeyword_7()); 
                    }
                    match(input,Ldt,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getLdtKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:1436:2: ( Path )
                    {
                    // InternalEldmDslParser.g:1436:2: ( Path )
                    // InternalEldmDslParser.g:1437:3: Path
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNativeDefAccess().getPathKeyword_8()); 
                    }
                    match(input,Path,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNativeDefAccess().getPathKeyword_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeDef__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalEldmDslParser.g:1446:1: rule__Literal__Alternatives : ( ( ruleNullLiteral ) | ( ruleBoolLiteral ) | ( ruleStrLiteral ) | ( ruleIntLiteral ) | ( ruleFltLiteral ) | ( ruleDateLiteral ) | ( ruleTimeLiteral ) | ( ruleDateTimeLiteral ) | ( ruleListLiteral ) | ( ruleMapLiteral ) | ( ruleEnumLiteral ) | ( rulePatternLiteral ) | ( ( rule__Literal__PathAssignment_12 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1450:1: ( ( ruleNullLiteral ) | ( ruleBoolLiteral ) | ( ruleStrLiteral ) | ( ruleIntLiteral ) | ( ruleFltLiteral ) | ( ruleDateLiteral ) | ( ruleTimeLiteral ) | ( ruleDateTimeLiteral ) | ( ruleListLiteral ) | ( ruleMapLiteral ) | ( ruleEnumLiteral ) | ( rulePatternLiteral ) | ( ( rule__Literal__PathAssignment_12 ) ) )
            int alt16=13;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalEldmDslParser.g:1451:2: ( ruleNullLiteral )
                    {
                    // InternalEldmDslParser.g:1451:2: ( ruleNullLiteral )
                    // InternalEldmDslParser.g:1452:3: ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1457:2: ( ruleBoolLiteral )
                    {
                    // InternalEldmDslParser.g:1457:2: ( ruleBoolLiteral )
                    // InternalEldmDslParser.g:1458:3: ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:1463:2: ( ruleStrLiteral )
                    {
                    // InternalEldmDslParser.g:1463:2: ( ruleStrLiteral )
                    // InternalEldmDslParser.g:1464:3: ruleStrLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStrLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStrLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStrLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:1469:2: ( ruleIntLiteral )
                    {
                    // InternalEldmDslParser.g:1469:2: ( ruleIntLiteral )
                    // InternalEldmDslParser.g:1470:3: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:1475:2: ( ruleFltLiteral )
                    {
                    // InternalEldmDslParser.g:1475:2: ( ruleFltLiteral )
                    // InternalEldmDslParser.g:1476:3: ruleFltLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFltLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFltLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFltLiteralParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:1481:2: ( ruleDateLiteral )
                    {
                    // InternalEldmDslParser.g:1481:2: ( ruleDateLiteral )
                    // InternalEldmDslParser.g:1482:3: ruleDateLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getDateLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDateLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getDateLiteralParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:1487:2: ( ruleTimeLiteral )
                    {
                    // InternalEldmDslParser.g:1487:2: ( ruleTimeLiteral )
                    // InternalEldmDslParser.g:1488:3: ruleTimeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getTimeLiteralParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTimeLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getTimeLiteralParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:1493:2: ( ruleDateTimeLiteral )
                    {
                    // InternalEldmDslParser.g:1493:2: ( ruleDateTimeLiteral )
                    // InternalEldmDslParser.g:1494:3: ruleDateTimeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getDateTimeLiteralParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDateTimeLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getDateTimeLiteralParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:1499:2: ( ruleListLiteral )
                    {
                    // InternalEldmDslParser.g:1499:2: ( ruleListLiteral )
                    // InternalEldmDslParser.g:1500:3: ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEldmDslParser.g:1505:2: ( ruleMapLiteral )
                    {
                    // InternalEldmDslParser.g:1505:2: ( ruleMapLiteral )
                    // InternalEldmDslParser.g:1506:3: ruleMapLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMapLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEldmDslParser.g:1511:2: ( ruleEnumLiteral )
                    {
                    // InternalEldmDslParser.g:1511:2: ( ruleEnumLiteral )
                    // InternalEldmDslParser.g:1512:3: ruleEnumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getEnumLiteralParserRuleCall_10()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnumLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getEnumLiteralParserRuleCall_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalEldmDslParser.g:1517:2: ( rulePatternLiteral )
                    {
                    // InternalEldmDslParser.g:1517:2: ( rulePatternLiteral )
                    // InternalEldmDslParser.g:1518:3: rulePatternLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getPatternLiteralParserRuleCall_11()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getPatternLiteralParserRuleCall_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalEldmDslParser.g:1523:2: ( ( rule__Literal__PathAssignment_12 ) )
                    {
                    // InternalEldmDslParser.g:1523:2: ( ( rule__Literal__PathAssignment_12 ) )
                    // InternalEldmDslParser.g:1524:3: ( rule__Literal__PathAssignment_12 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getPathAssignment_12()); 
                    }
                    // InternalEldmDslParser.g:1525:3: ( rule__Literal__PathAssignment_12 )
                    // InternalEldmDslParser.g:1525:4: rule__Literal__PathAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__PathAssignment_12();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getPathAssignment_12()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BoolLiteral__Alternatives_1"
    // InternalEldmDslParser.g:1533:1: rule__BoolLiteral__Alternatives_1 : ( ( False ) | ( ( rule__BoolLiteral__IsTrueAssignment_1_1 ) ) );
    public final void rule__BoolLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1537:1: ( ( False ) | ( ( rule__BoolLiteral__IsTrueAssignment_1_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==False) ) {
                alt17=1;
            }
            else if ( (LA17_0==True) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEldmDslParser.g:1538:2: ( False )
                    {
                    // InternalEldmDslParser.g:1538:2: ( False )
                    // InternalEldmDslParser.g:1539:3: False
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0()); 
                    }
                    match(input,False,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1544:2: ( ( rule__BoolLiteral__IsTrueAssignment_1_1 ) )
                    {
                    // InternalEldmDslParser.g:1544:2: ( ( rule__BoolLiteral__IsTrueAssignment_1_1 ) )
                    // InternalEldmDslParser.g:1545:3: ( rule__BoolLiteral__IsTrueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolLiteralAccess().getIsTrueAssignment_1_1()); 
                    }
                    // InternalEldmDslParser.g:1546:3: ( rule__BoolLiteral__IsTrueAssignment_1_1 )
                    // InternalEldmDslParser.g:1546:4: rule__BoolLiteral__IsTrueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolLiteral__IsTrueAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolLiteralAccess().getIsTrueAssignment_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Alternatives_1"


    // $ANTLR start "rule__BREAK__Alternatives"
    // InternalEldmDslParser.g:1554:1: rule__BREAK__Alternatives : ( ( LineFeed ) | ( CarriageReturn ) );
    public final void rule__BREAK__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1558:1: ( ( LineFeed ) | ( CarriageReturn ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LineFeed) ) {
                alt18=1;
            }
            else if ( (LA18_0==CarriageReturn) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEldmDslParser.g:1559:2: ( LineFeed )
                    {
                    // InternalEldmDslParser.g:1559:2: ( LineFeed )
                    // InternalEldmDslParser.g:1560:3: LineFeed
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBREAKAccess().getLineFeedKeyword_0()); 
                    }
                    match(input,LineFeed,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBREAKAccess().getLineFeedKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1565:2: ( CarriageReturn )
                    {
                    // InternalEldmDslParser.g:1565:2: ( CarriageReturn )
                    // InternalEldmDslParser.g:1566:3: CarriageReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1()); 
                    }
                    match(input,CarriageReturn,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BREAK__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // InternalEldmDslParser.g:1575:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1579:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalEldmDslParser.g:1580:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalEldmDslParser.g:1587:1: rule__Module__Group__0__Impl : ( Module ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1591:1: ( ( Module ) )
            // InternalEldmDslParser.g:1592:1: ( Module )
            {
            // InternalEldmDslParser.g:1592:1: ( Module )
            // InternalEldmDslParser.g:1593:2: Module
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            }
            match(input,Module,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalEldmDslParser.g:1602:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1606:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalEldmDslParser.g:1607:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalEldmDslParser.g:1614:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1618:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalEldmDslParser.g:1619:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalEldmDslParser.g:1619:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalEldmDslParser.g:1620:2: ( rule__Module__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            }
            // InternalEldmDslParser.g:1621:2: ( rule__Module__NameAssignment_1 )
            // InternalEldmDslParser.g:1621:3: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Module__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalEldmDslParser.g:1629:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1633:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalEldmDslParser.g:1634:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalEldmDslParser.g:1641:1: rule__Module__Group__2__Impl : ( ( rule__Module__ImportsAssignment_2 )* ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1645:1: ( ( ( rule__Module__ImportsAssignment_2 )* ) )
            // InternalEldmDslParser.g:1646:1: ( ( rule__Module__ImportsAssignment_2 )* )
            {
            // InternalEldmDslParser.g:1646:1: ( ( rule__Module__ImportsAssignment_2 )* )
            // InternalEldmDslParser.g:1647:2: ( rule__Module__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getImportsAssignment_2()); 
            }
            // InternalEldmDslParser.g:1648:2: ( rule__Module__ImportsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_PID && LA19_0<=RULE_ID)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEldmDslParser.g:1648:3: rule__Module__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Module__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getImportsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalEldmDslParser.g:1656:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1660:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalEldmDslParser.g:1661:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalEldmDslParser.g:1668:1: rule__Module__Group__3__Impl : ( ( rule__Module__PlugsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1672:1: ( ( ( rule__Module__PlugsAssignment_3 )* ) )
            // InternalEldmDslParser.g:1673:1: ( ( rule__Module__PlugsAssignment_3 )* )
            {
            // InternalEldmDslParser.g:1673:1: ( ( rule__Module__PlugsAssignment_3 )* )
            // InternalEldmDslParser.g:1674:2: ( rule__Module__PlugsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPlugsAssignment_3()); 
            }
            // InternalEldmDslParser.g:1675:2: ( rule__Module__PlugsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==PlugDsl) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEldmDslParser.g:1675:3: rule__Module__PlugsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Module__PlugsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getPlugsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // InternalEldmDslParser.g:1683:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1687:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalEldmDslParser.g:1688:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // InternalEldmDslParser.g:1695:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1699:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // InternalEldmDslParser.g:1700:1: ( ( rule__Module__Group_4__0 )? )
            {
            // InternalEldmDslParser.g:1700:1: ( ( rule__Module__Group_4__0 )? )
            // InternalEldmDslParser.g:1701:2: ( rule__Module__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getGroup_4()); 
            }
            // InternalEldmDslParser.g:1702:2: ( rule__Module__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Defs) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEldmDslParser.g:1702:3: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Module__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // InternalEldmDslParser.g:1710:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1714:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // InternalEldmDslParser.g:1715:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // InternalEldmDslParser.g:1722:1: rule__Module__Group__5__Impl : ( ( rule__Module__OpersAssignment_5 )* ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1726:1: ( ( ( rule__Module__OpersAssignment_5 )* ) )
            // InternalEldmDslParser.g:1727:1: ( ( rule__Module__OpersAssignment_5 )* )
            {
            // InternalEldmDslParser.g:1727:1: ( ( rule__Module__OpersAssignment_5 )* )
            // InternalEldmDslParser.g:1728:2: ( rule__Module__OpersAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getOpersAssignment_5()); 
            }
            // InternalEldmDslParser.g:1729:2: ( rule__Module__OpersAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Def) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==Get||LA22_1==Set) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalEldmDslParser.g:1729:3: rule__Module__OpersAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Module__OpersAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getOpersAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // InternalEldmDslParser.g:1737:1: rule__Module__Group__6 : rule__Module__Group__6__Impl ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1741:1: ( rule__Module__Group__6__Impl )
            // InternalEldmDslParser.g:1742:2: rule__Module__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // InternalEldmDslParser.g:1748:1: rule__Module__Group__6__Impl : ( ( rule__Module__PathsAssignment_6 )* ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1752:1: ( ( ( rule__Module__PathsAssignment_6 )* ) )
            // InternalEldmDslParser.g:1753:1: ( ( rule__Module__PathsAssignment_6 )* )
            {
            // InternalEldmDslParser.g:1753:1: ( ( rule__Module__PathsAssignment_6 )* )
            // InternalEldmDslParser.g:1754:2: ( rule__Module__PathsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPathsAssignment_6()); 
            }
            // InternalEldmDslParser.g:1755:2: ( rule__Module__PathsAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Def) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEldmDslParser.g:1755:3: rule__Module__PathsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Module__PathsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getPathsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group_4__0"
    // InternalEldmDslParser.g:1764:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1768:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // InternalEldmDslParser.g:1769:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Module__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0"


    // $ANTLR start "rule__Module__Group_4__0__Impl"
    // InternalEldmDslParser.g:1776:1: rule__Module__Group_4__0__Impl : ( Defs ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1780:1: ( ( Defs ) )
            // InternalEldmDslParser.g:1781:1: ( Defs )
            {
            // InternalEldmDslParser.g:1781:1: ( Defs )
            // InternalEldmDslParser.g:1782:2: Defs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getDefsKeyword_4_0()); 
            }
            match(input,Defs,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getDefsKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0__Impl"


    // $ANTLR start "rule__Module__Group_4__1"
    // InternalEldmDslParser.g:1791:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl rule__Module__Group_4__2 ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1795:1: ( rule__Module__Group_4__1__Impl rule__Module__Group_4__2 )
            // InternalEldmDslParser.g:1796:2: rule__Module__Group_4__1__Impl rule__Module__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Module__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1"


    // $ANTLR start "rule__Module__Group_4__1__Impl"
    // InternalEldmDslParser.g:1803:1: rule__Module__Group_4__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1807:1: ( ( RULE_BEGIN ) )
            // InternalEldmDslParser.g:1808:1: ( RULE_BEGIN )
            {
            // InternalEldmDslParser.g:1808:1: ( RULE_BEGIN )
            // InternalEldmDslParser.g:1809:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getBEGINTerminalRuleCall_4_1()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getBEGINTerminalRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1__Impl"


    // $ANTLR start "rule__Module__Group_4__2"
    // InternalEldmDslParser.g:1818:1: rule__Module__Group_4__2 : rule__Module__Group_4__2__Impl rule__Module__Group_4__3 ;
    public final void rule__Module__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1822:1: ( rule__Module__Group_4__2__Impl rule__Module__Group_4__3 )
            // InternalEldmDslParser.g:1823:2: rule__Module__Group_4__2__Impl rule__Module__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Module__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__2"


    // $ANTLR start "rule__Module__Group_4__2__Impl"
    // InternalEldmDslParser.g:1830:1: rule__Module__Group_4__2__Impl : ( ( ( rule__Module__DefsAssignment_4_2 ) ) ( ( rule__Module__DefsAssignment_4_2 )* ) ) ;
    public final void rule__Module__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1834:1: ( ( ( ( rule__Module__DefsAssignment_4_2 ) ) ( ( rule__Module__DefsAssignment_4_2 )* ) ) )
            // InternalEldmDslParser.g:1835:1: ( ( ( rule__Module__DefsAssignment_4_2 ) ) ( ( rule__Module__DefsAssignment_4_2 )* ) )
            {
            // InternalEldmDslParser.g:1835:1: ( ( ( rule__Module__DefsAssignment_4_2 ) ) ( ( rule__Module__DefsAssignment_4_2 )* ) )
            // InternalEldmDslParser.g:1836:2: ( ( rule__Module__DefsAssignment_4_2 ) ) ( ( rule__Module__DefsAssignment_4_2 )* )
            {
            // InternalEldmDslParser.g:1836:2: ( ( rule__Module__DefsAssignment_4_2 ) )
            // InternalEldmDslParser.g:1837:3: ( rule__Module__DefsAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getDefsAssignment_4_2()); 
            }
            // InternalEldmDslParser.g:1838:3: ( rule__Module__DefsAssignment_4_2 )
            // InternalEldmDslParser.g:1838:4: rule__Module__DefsAssignment_4_2
            {
            pushFollow(FOLLOW_13);
            rule__Module__DefsAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getDefsAssignment_4_2()); 
            }

            }

            // InternalEldmDslParser.g:1841:2: ( ( rule__Module__DefsAssignment_4_2 )* )
            // InternalEldmDslParser.g:1842:3: ( rule__Module__DefsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getDefsAssignment_4_2()); 
            }
            // InternalEldmDslParser.g:1843:3: ( rule__Module__DefsAssignment_4_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Typedef||LA24_0==Enum||LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEldmDslParser.g:1843:4: rule__Module__DefsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Module__DefsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getDefsAssignment_4_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__2__Impl"


    // $ANTLR start "rule__Module__Group_4__3"
    // InternalEldmDslParser.g:1852:1: rule__Module__Group_4__3 : rule__Module__Group_4__3__Impl ;
    public final void rule__Module__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1856:1: ( rule__Module__Group_4__3__Impl )
            // InternalEldmDslParser.g:1857:2: rule__Module__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__3"


    // $ANTLR start "rule__Module__Group_4__3__Impl"
    // InternalEldmDslParser.g:1863:1: rule__Module__Group_4__3__Impl : ( RULE_END ) ;
    public final void rule__Module__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1867:1: ( ( RULE_END ) )
            // InternalEldmDslParser.g:1868:1: ( RULE_END )
            {
            // InternalEldmDslParser.g:1868:1: ( RULE_END )
            // InternalEldmDslParser.g:1869:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getENDTerminalRuleCall_4_3()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getENDTerminalRuleCall_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__3__Impl"


    // $ANTLR start "rule__PlugDsl__Group__0"
    // InternalEldmDslParser.g:1879:1: rule__PlugDsl__Group__0 : rule__PlugDsl__Group__0__Impl rule__PlugDsl__Group__1 ;
    public final void rule__PlugDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1883:1: ( rule__PlugDsl__Group__0__Impl rule__PlugDsl__Group__1 )
            // InternalEldmDslParser.g:1884:2: rule__PlugDsl__Group__0__Impl rule__PlugDsl__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PlugDsl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlugDsl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__Group__0"


    // $ANTLR start "rule__PlugDsl__Group__0__Impl"
    // InternalEldmDslParser.g:1891:1: rule__PlugDsl__Group__0__Impl : ( PlugDsl ) ;
    public final void rule__PlugDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1895:1: ( ( PlugDsl ) )
            // InternalEldmDslParser.g:1896:1: ( PlugDsl )
            {
            // InternalEldmDslParser.g:1896:1: ( PlugDsl )
            // InternalEldmDslParser.g:1897:2: PlugDsl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlugDslAccess().getPlugDslKeyword_0()); 
            }
            match(input,PlugDsl,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlugDslAccess().getPlugDslKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__Group__0__Impl"


    // $ANTLR start "rule__PlugDsl__Group__1"
    // InternalEldmDslParser.g:1906:1: rule__PlugDsl__Group__1 : rule__PlugDsl__Group__1__Impl rule__PlugDsl__Group__2 ;
    public final void rule__PlugDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1910:1: ( rule__PlugDsl__Group__1__Impl rule__PlugDsl__Group__2 )
            // InternalEldmDslParser.g:1911:2: rule__PlugDsl__Group__1__Impl rule__PlugDsl__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__PlugDsl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlugDsl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__Group__1"


    // $ANTLR start "rule__PlugDsl__Group__1__Impl"
    // InternalEldmDslParser.g:1918:1: rule__PlugDsl__Group__1__Impl : ( ( rule__PlugDsl__NameAssignment_1 ) ) ;
    public final void rule__PlugDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1922:1: ( ( ( rule__PlugDsl__NameAssignment_1 ) ) )
            // InternalEldmDslParser.g:1923:1: ( ( rule__PlugDsl__NameAssignment_1 ) )
            {
            // InternalEldmDslParser.g:1923:1: ( ( rule__PlugDsl__NameAssignment_1 ) )
            // InternalEldmDslParser.g:1924:2: ( rule__PlugDsl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlugDslAccess().getNameAssignment_1()); 
            }
            // InternalEldmDslParser.g:1925:2: ( rule__PlugDsl__NameAssignment_1 )
            // InternalEldmDslParser.g:1925:3: rule__PlugDsl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PlugDsl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlugDslAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__Group__1__Impl"


    // $ANTLR start "rule__PlugDsl__Group__2"
    // InternalEldmDslParser.g:1933:1: rule__PlugDsl__Group__2 : rule__PlugDsl__Group__2__Impl ;
    public final void rule__PlugDsl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1937:1: ( rule__PlugDsl__Group__2__Impl )
            // InternalEldmDslParser.g:1938:2: rule__PlugDsl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlugDsl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__Group__2"


    // $ANTLR start "rule__PlugDsl__Group__2__Impl"
    // InternalEldmDslParser.g:1944:1: rule__PlugDsl__Group__2__Impl : ( ( rule__PlugDsl__AdaptorAssignment_2 ) ) ;
    public final void rule__PlugDsl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1948:1: ( ( ( rule__PlugDsl__AdaptorAssignment_2 ) ) )
            // InternalEldmDslParser.g:1949:1: ( ( rule__PlugDsl__AdaptorAssignment_2 ) )
            {
            // InternalEldmDslParser.g:1949:1: ( ( rule__PlugDsl__AdaptorAssignment_2 ) )
            // InternalEldmDslParser.g:1950:2: ( rule__PlugDsl__AdaptorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlugDslAccess().getAdaptorAssignment_2()); 
            }
            // InternalEldmDslParser.g:1951:2: ( rule__PlugDsl__AdaptorAssignment_2 )
            // InternalEldmDslParser.g:1951:3: rule__PlugDsl__AdaptorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PlugDsl__AdaptorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlugDslAccess().getAdaptorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__Group__2__Impl"


    // $ANTLR start "rule__ImportOperation__Group__0"
    // InternalEldmDslParser.g:1960:1: rule__ImportOperation__Group__0 : rule__ImportOperation__Group__0__Impl rule__ImportOperation__Group__1 ;
    public final void rule__ImportOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1964:1: ( rule__ImportOperation__Group__0__Impl rule__ImportOperation__Group__1 )
            // InternalEldmDslParser.g:1965:2: rule__ImportOperation__Group__0__Impl rule__ImportOperation__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ImportOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__Group__0"


    // $ANTLR start "rule__ImportOperation__Group__0__Impl"
    // InternalEldmDslParser.g:1972:1: rule__ImportOperation__Group__0__Impl : ( ( rule__ImportOperation__NameAssignment_0 ) ) ;
    public final void rule__ImportOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1976:1: ( ( ( rule__ImportOperation__NameAssignment_0 ) ) )
            // InternalEldmDslParser.g:1977:1: ( ( rule__ImportOperation__NameAssignment_0 ) )
            {
            // InternalEldmDslParser.g:1977:1: ( ( rule__ImportOperation__NameAssignment_0 ) )
            // InternalEldmDslParser.g:1978:2: ( rule__ImportOperation__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportOperationAccess().getNameAssignment_0()); 
            }
            // InternalEldmDslParser.g:1979:2: ( rule__ImportOperation__NameAssignment_0 )
            // InternalEldmDslParser.g:1979:3: rule__ImportOperation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportOperation__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportOperationAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__Group__0__Impl"


    // $ANTLR start "rule__ImportOperation__Group__1"
    // InternalEldmDslParser.g:1987:1: rule__ImportOperation__Group__1 : rule__ImportOperation__Group__1__Impl rule__ImportOperation__Group__2 ;
    public final void rule__ImportOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:1991:1: ( rule__ImportOperation__Group__1__Impl rule__ImportOperation__Group__2 )
            // InternalEldmDslParser.g:1992:2: rule__ImportOperation__Group__1__Impl rule__ImportOperation__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ImportOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportOperation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__Group__1"


    // $ANTLR start "rule__ImportOperation__Group__1__Impl"
    // InternalEldmDslParser.g:1999:1: rule__ImportOperation__Group__1__Impl : ( From ) ;
    public final void rule__ImportOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2003:1: ( ( From ) )
            // InternalEldmDslParser.g:2004:1: ( From )
            {
            // InternalEldmDslParser.g:2004:1: ( From )
            // InternalEldmDslParser.g:2005:2: From
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportOperationAccess().getFromKeyword_1()); 
            }
            match(input,From,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportOperationAccess().getFromKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__Group__1__Impl"


    // $ANTLR start "rule__ImportOperation__Group__2"
    // InternalEldmDslParser.g:2014:1: rule__ImportOperation__Group__2 : rule__ImportOperation__Group__2__Impl ;
    public final void rule__ImportOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2018:1: ( rule__ImportOperation__Group__2__Impl )
            // InternalEldmDslParser.g:2019:2: rule__ImportOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportOperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__Group__2"


    // $ANTLR start "rule__ImportOperation__Group__2__Impl"
    // InternalEldmDslParser.g:2025:1: rule__ImportOperation__Group__2__Impl : ( ( rule__ImportOperation__ModuleAssignment_2 ) ) ;
    public final void rule__ImportOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2029:1: ( ( ( rule__ImportOperation__ModuleAssignment_2 ) ) )
            // InternalEldmDslParser.g:2030:1: ( ( rule__ImportOperation__ModuleAssignment_2 ) )
            {
            // InternalEldmDslParser.g:2030:1: ( ( rule__ImportOperation__ModuleAssignment_2 ) )
            // InternalEldmDslParser.g:2031:2: ( rule__ImportOperation__ModuleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportOperationAccess().getModuleAssignment_2()); 
            }
            // InternalEldmDslParser.g:2032:2: ( rule__ImportOperation__ModuleAssignment_2 )
            // InternalEldmDslParser.g:2032:3: rule__ImportOperation__ModuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImportOperation__ModuleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportOperationAccess().getModuleAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__Group__2__Impl"


    // $ANTLR start "rule__ImportDefinition__Group__0"
    // InternalEldmDslParser.g:2041:1: rule__ImportDefinition__Group__0 : rule__ImportDefinition__Group__0__Impl rule__ImportDefinition__Group__1 ;
    public final void rule__ImportDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2045:1: ( rule__ImportDefinition__Group__0__Impl rule__ImportDefinition__Group__1 )
            // InternalEldmDslParser.g:2046:2: rule__ImportDefinition__Group__0__Impl rule__ImportDefinition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ImportDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group__0"


    // $ANTLR start "rule__ImportDefinition__Group__0__Impl"
    // InternalEldmDslParser.g:2053:1: rule__ImportDefinition__Group__0__Impl : ( ( rule__ImportDefinition__Group_0__0 ) ) ;
    public final void rule__ImportDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2057:1: ( ( ( rule__ImportDefinition__Group_0__0 ) ) )
            // InternalEldmDslParser.g:2058:1: ( ( rule__ImportDefinition__Group_0__0 ) )
            {
            // InternalEldmDslParser.g:2058:1: ( ( rule__ImportDefinition__Group_0__0 ) )
            // InternalEldmDslParser.g:2059:2: ( rule__ImportDefinition__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getGroup_0()); 
            }
            // InternalEldmDslParser.g:2060:2: ( rule__ImportDefinition__Group_0__0 )
            // InternalEldmDslParser.g:2060:3: rule__ImportDefinition__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group__0__Impl"


    // $ANTLR start "rule__ImportDefinition__Group__1"
    // InternalEldmDslParser.g:2068:1: rule__ImportDefinition__Group__1 : rule__ImportDefinition__Group__1__Impl rule__ImportDefinition__Group__2 ;
    public final void rule__ImportDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2072:1: ( rule__ImportDefinition__Group__1__Impl rule__ImportDefinition__Group__2 )
            // InternalEldmDslParser.g:2073:2: rule__ImportDefinition__Group__1__Impl rule__ImportDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ImportDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group__1"


    // $ANTLR start "rule__ImportDefinition__Group__1__Impl"
    // InternalEldmDslParser.g:2080:1: rule__ImportDefinition__Group__1__Impl : ( From ) ;
    public final void rule__ImportDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2084:1: ( ( From ) )
            // InternalEldmDslParser.g:2085:1: ( From )
            {
            // InternalEldmDslParser.g:2085:1: ( From )
            // InternalEldmDslParser.g:2086:2: From
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getFromKeyword_1()); 
            }
            match(input,From,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getFromKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group__1__Impl"


    // $ANTLR start "rule__ImportDefinition__Group__2"
    // InternalEldmDslParser.g:2095:1: rule__ImportDefinition__Group__2 : rule__ImportDefinition__Group__2__Impl ;
    public final void rule__ImportDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2099:1: ( rule__ImportDefinition__Group__2__Impl )
            // InternalEldmDslParser.g:2100:2: rule__ImportDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group__2"


    // $ANTLR start "rule__ImportDefinition__Group__2__Impl"
    // InternalEldmDslParser.g:2106:1: rule__ImportDefinition__Group__2__Impl : ( ( rule__ImportDefinition__ModuleAssignment_2 ) ) ;
    public final void rule__ImportDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2110:1: ( ( ( rule__ImportDefinition__ModuleAssignment_2 ) ) )
            // InternalEldmDslParser.g:2111:1: ( ( rule__ImportDefinition__ModuleAssignment_2 ) )
            {
            // InternalEldmDslParser.g:2111:1: ( ( rule__ImportDefinition__ModuleAssignment_2 ) )
            // InternalEldmDslParser.g:2112:2: ( rule__ImportDefinition__ModuleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getModuleAssignment_2()); 
            }
            // InternalEldmDslParser.g:2113:2: ( rule__ImportDefinition__ModuleAssignment_2 )
            // InternalEldmDslParser.g:2113:3: rule__ImportDefinition__ModuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__ModuleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getModuleAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group__2__Impl"


    // $ANTLR start "rule__ImportDefinition__Group_0__0"
    // InternalEldmDslParser.g:2122:1: rule__ImportDefinition__Group_0__0 : rule__ImportDefinition__Group_0__0__Impl rule__ImportDefinition__Group_0__1 ;
    public final void rule__ImportDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2126:1: ( rule__ImportDefinition__Group_0__0__Impl rule__ImportDefinition__Group_0__1 )
            // InternalEldmDslParser.g:2127:2: rule__ImportDefinition__Group_0__0__Impl rule__ImportDefinition__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__ImportDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0__0"


    // $ANTLR start "rule__ImportDefinition__Group_0__0__Impl"
    // InternalEldmDslParser.g:2134:1: rule__ImportDefinition__Group_0__0__Impl : ( ( rule__ImportDefinition__DefsAssignment_0_0 ) ) ;
    public final void rule__ImportDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2138:1: ( ( ( rule__ImportDefinition__DefsAssignment_0_0 ) ) )
            // InternalEldmDslParser.g:2139:1: ( ( rule__ImportDefinition__DefsAssignment_0_0 ) )
            {
            // InternalEldmDslParser.g:2139:1: ( ( rule__ImportDefinition__DefsAssignment_0_0 ) )
            // InternalEldmDslParser.g:2140:2: ( rule__ImportDefinition__DefsAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getDefsAssignment_0_0()); 
            }
            // InternalEldmDslParser.g:2141:2: ( rule__ImportDefinition__DefsAssignment_0_0 )
            // InternalEldmDslParser.g:2141:3: rule__ImportDefinition__DefsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__DefsAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getDefsAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__ImportDefinition__Group_0__1"
    // InternalEldmDslParser.g:2149:1: rule__ImportDefinition__Group_0__1 : rule__ImportDefinition__Group_0__1__Impl ;
    public final void rule__ImportDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2153:1: ( rule__ImportDefinition__Group_0__1__Impl )
            // InternalEldmDslParser.g:2154:2: rule__ImportDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0__1"


    // $ANTLR start "rule__ImportDefinition__Group_0__1__Impl"
    // InternalEldmDslParser.g:2160:1: rule__ImportDefinition__Group_0__1__Impl : ( ( rule__ImportDefinition__Group_0_1__0 )* ) ;
    public final void rule__ImportDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2164:1: ( ( ( rule__ImportDefinition__Group_0_1__0 )* ) )
            // InternalEldmDslParser.g:2165:1: ( ( rule__ImportDefinition__Group_0_1__0 )* )
            {
            // InternalEldmDslParser.g:2165:1: ( ( rule__ImportDefinition__Group_0_1__0 )* )
            // InternalEldmDslParser.g:2166:2: ( rule__ImportDefinition__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getGroup_0_1()); 
            }
            // InternalEldmDslParser.g:2167:2: ( rule__ImportDefinition__Group_0_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEldmDslParser.g:2167:3: rule__ImportDefinition__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ImportDefinition__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__ImportDefinition__Group_0_1__0"
    // InternalEldmDslParser.g:2176:1: rule__ImportDefinition__Group_0_1__0 : rule__ImportDefinition__Group_0_1__0__Impl rule__ImportDefinition__Group_0_1__1 ;
    public final void rule__ImportDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2180:1: ( rule__ImportDefinition__Group_0_1__0__Impl rule__ImportDefinition__Group_0_1__1 )
            // InternalEldmDslParser.g:2181:2: rule__ImportDefinition__Group_0_1__0__Impl rule__ImportDefinition__Group_0_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ImportDefinition__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0_1__0"


    // $ANTLR start "rule__ImportDefinition__Group_0_1__0__Impl"
    // InternalEldmDslParser.g:2188:1: rule__ImportDefinition__Group_0_1__0__Impl : ( Comma ) ;
    public final void rule__ImportDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2192:1: ( ( Comma ) )
            // InternalEldmDslParser.g:2193:1: ( Comma )
            {
            // InternalEldmDslParser.g:2193:1: ( Comma )
            // InternalEldmDslParser.g:2194:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getCommaKeyword_0_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getCommaKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0_1__0__Impl"


    // $ANTLR start "rule__ImportDefinition__Group_0_1__1"
    // InternalEldmDslParser.g:2203:1: rule__ImportDefinition__Group_0_1__1 : rule__ImportDefinition__Group_0_1__1__Impl ;
    public final void rule__ImportDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2207:1: ( rule__ImportDefinition__Group_0_1__1__Impl )
            // InternalEldmDslParser.g:2208:2: rule__ImportDefinition__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0_1__1"


    // $ANTLR start "rule__ImportDefinition__Group_0_1__1__Impl"
    // InternalEldmDslParser.g:2214:1: rule__ImportDefinition__Group_0_1__1__Impl : ( ( rule__ImportDefinition__DefsAssignment_0_1_1 ) ) ;
    public final void rule__ImportDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2218:1: ( ( ( rule__ImportDefinition__DefsAssignment_0_1_1 ) ) )
            // InternalEldmDslParser.g:2219:1: ( ( rule__ImportDefinition__DefsAssignment_0_1_1 ) )
            {
            // InternalEldmDslParser.g:2219:1: ( ( rule__ImportDefinition__DefsAssignment_0_1_1 ) )
            // InternalEldmDslParser.g:2220:2: ( rule__ImportDefinition__DefsAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getDefsAssignment_0_1_1()); 
            }
            // InternalEldmDslParser.g:2221:2: ( rule__ImportDefinition__DefsAssignment_0_1_1 )
            // InternalEldmDslParser.g:2221:3: rule__ImportDefinition__DefsAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportDefinition__DefsAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getDefsAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__Group_0_1__1__Impl"


    // $ANTLR start "rule__ExternalDef__Group_0__0"
    // InternalEldmDslParser.g:2230:1: rule__ExternalDef__Group_0__0 : rule__ExternalDef__Group_0__0__Impl rule__ExternalDef__Group_0__1 ;
    public final void rule__ExternalDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2234:1: ( rule__ExternalDef__Group_0__0__Impl rule__ExternalDef__Group_0__1 )
            // InternalEldmDslParser.g:2235:2: rule__ExternalDef__Group_0__0__Impl rule__ExternalDef__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__ExternalDef__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0__0"


    // $ANTLR start "rule__ExternalDef__Group_0__0__Impl"
    // InternalEldmDslParser.g:2242:1: rule__ExternalDef__Group_0__0__Impl : ( ( rule__ExternalDef__RefAssignment_0_0 ) ) ;
    public final void rule__ExternalDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2246:1: ( ( ( rule__ExternalDef__RefAssignment_0_0 ) ) )
            // InternalEldmDslParser.g:2247:1: ( ( rule__ExternalDef__RefAssignment_0_0 ) )
            {
            // InternalEldmDslParser.g:2247:1: ( ( rule__ExternalDef__RefAssignment_0_0 ) )
            // InternalEldmDslParser.g:2248:2: ( rule__ExternalDef__RefAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getRefAssignment_0_0()); 
            }
            // InternalEldmDslParser.g:2249:2: ( rule__ExternalDef__RefAssignment_0_0 )
            // InternalEldmDslParser.g:2249:3: rule__ExternalDef__RefAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__RefAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getRefAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0__0__Impl"


    // $ANTLR start "rule__ExternalDef__Group_0__1"
    // InternalEldmDslParser.g:2257:1: rule__ExternalDef__Group_0__1 : rule__ExternalDef__Group_0__1__Impl ;
    public final void rule__ExternalDef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2261:1: ( rule__ExternalDef__Group_0__1__Impl )
            // InternalEldmDslParser.g:2262:2: rule__ExternalDef__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0__1"


    // $ANTLR start "rule__ExternalDef__Group_0__1__Impl"
    // InternalEldmDslParser.g:2268:1: rule__ExternalDef__Group_0__1__Impl : ( ( rule__ExternalDef__Group_0_1__0 )? ) ;
    public final void rule__ExternalDef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2272:1: ( ( ( rule__ExternalDef__Group_0_1__0 )? ) )
            // InternalEldmDslParser.g:2273:1: ( ( rule__ExternalDef__Group_0_1__0 )? )
            {
            // InternalEldmDslParser.g:2273:1: ( ( rule__ExternalDef__Group_0_1__0 )? )
            // InternalEldmDslParser.g:2274:2: ( rule__ExternalDef__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getGroup_0_1()); 
            }
            // InternalEldmDslParser.g:2275:2: ( rule__ExternalDef__Group_0_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==As) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEldmDslParser.g:2275:3: rule__ExternalDef__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalDef__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0__1__Impl"


    // $ANTLR start "rule__ExternalDef__Group_0_1__0"
    // InternalEldmDslParser.g:2284:1: rule__ExternalDef__Group_0_1__0 : rule__ExternalDef__Group_0_1__0__Impl rule__ExternalDef__Group_0_1__1 ;
    public final void rule__ExternalDef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2288:1: ( rule__ExternalDef__Group_0_1__0__Impl rule__ExternalDef__Group_0_1__1 )
            // InternalEldmDslParser.g:2289:2: rule__ExternalDef__Group_0_1__0__Impl rule__ExternalDef__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ExternalDef__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0_1__0"


    // $ANTLR start "rule__ExternalDef__Group_0_1__0__Impl"
    // InternalEldmDslParser.g:2296:1: rule__ExternalDef__Group_0_1__0__Impl : ( As ) ;
    public final void rule__ExternalDef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2300:1: ( ( As ) )
            // InternalEldmDslParser.g:2301:1: ( As )
            {
            // InternalEldmDslParser.g:2301:1: ( As )
            // InternalEldmDslParser.g:2302:2: As
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getAsKeyword_0_1_0()); 
            }
            match(input,As,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getAsKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0_1__0__Impl"


    // $ANTLR start "rule__ExternalDef__Group_0_1__1"
    // InternalEldmDslParser.g:2311:1: rule__ExternalDef__Group_0_1__1 : rule__ExternalDef__Group_0_1__1__Impl ;
    public final void rule__ExternalDef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2315:1: ( rule__ExternalDef__Group_0_1__1__Impl )
            // InternalEldmDslParser.g:2316:2: rule__ExternalDef__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0_1__1"


    // $ANTLR start "rule__ExternalDef__Group_0_1__1__Impl"
    // InternalEldmDslParser.g:2322:1: rule__ExternalDef__Group_0_1__1__Impl : ( ( rule__ExternalDef__NameAssignment_0_1_1 ) ) ;
    public final void rule__ExternalDef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2326:1: ( ( ( rule__ExternalDef__NameAssignment_0_1_1 ) ) )
            // InternalEldmDslParser.g:2327:1: ( ( rule__ExternalDef__NameAssignment_0_1_1 ) )
            {
            // InternalEldmDslParser.g:2327:1: ( ( rule__ExternalDef__NameAssignment_0_1_1 ) )
            // InternalEldmDslParser.g:2328:2: ( rule__ExternalDef__NameAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getNameAssignment_0_1_1()); 
            }
            // InternalEldmDslParser.g:2329:2: ( rule__ExternalDef__NameAssignment_0_1_1 )
            // InternalEldmDslParser.g:2329:3: rule__ExternalDef__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__NameAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getNameAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_0_1__1__Impl"


    // $ANTLR start "rule__ExternalModule__Group_1__0"
    // InternalEldmDslParser.g:2338:1: rule__ExternalModule__Group_1__0 : rule__ExternalModule__Group_1__0__Impl rule__ExternalModule__Group_1__1 ;
    public final void rule__ExternalModule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2342:1: ( rule__ExternalModule__Group_1__0__Impl rule__ExternalModule__Group_1__1 )
            // InternalEldmDslParser.g:2343:2: rule__ExternalModule__Group_1__0__Impl rule__ExternalModule__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ExternalModule__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalModule__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_1__0"


    // $ANTLR start "rule__ExternalModule__Group_1__0__Impl"
    // InternalEldmDslParser.g:2350:1: rule__ExternalModule__Group_1__0__Impl : ( ( rule__ExternalModule__JavaRefAssignment_1_0 ) ) ;
    public final void rule__ExternalModule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2354:1: ( ( ( rule__ExternalModule__JavaRefAssignment_1_0 ) ) )
            // InternalEldmDslParser.g:2355:1: ( ( rule__ExternalModule__JavaRefAssignment_1_0 ) )
            {
            // InternalEldmDslParser.g:2355:1: ( ( rule__ExternalModule__JavaRefAssignment_1_0 ) )
            // InternalEldmDslParser.g:2356:2: ( rule__ExternalModule__JavaRefAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalModuleAccess().getJavaRefAssignment_1_0()); 
            }
            // InternalEldmDslParser.g:2357:2: ( rule__ExternalModule__JavaRefAssignment_1_0 )
            // InternalEldmDslParser.g:2357:3: rule__ExternalModule__JavaRefAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModule__JavaRefAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalModuleAccess().getJavaRefAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_1__0__Impl"


    // $ANTLR start "rule__ExternalModule__Group_1__1"
    // InternalEldmDslParser.g:2365:1: rule__ExternalModule__Group_1__1 : rule__ExternalModule__Group_1__1__Impl ;
    public final void rule__ExternalModule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2369:1: ( rule__ExternalModule__Group_1__1__Impl )
            // InternalEldmDslParser.g:2370:2: rule__ExternalModule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModule__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_1__1"


    // $ANTLR start "rule__ExternalModule__Group_1__1__Impl"
    // InternalEldmDslParser.g:2376:1: rule__ExternalModule__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__ExternalModule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2380:1: ( ( Asterisk ) )
            // InternalEldmDslParser.g:2381:1: ( Asterisk )
            {
            // InternalEldmDslParser.g:2381:1: ( Asterisk )
            // InternalEldmDslParser.g:2382:2: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalModuleAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalModuleAccess().getAsteriskKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_1__1__Impl"


    // $ANTLR start "rule__SubPath__Group__0"
    // InternalEldmDslParser.g:2392:1: rule__SubPath__Group__0 : rule__SubPath__Group__0__Impl rule__SubPath__Group__1 ;
    public final void rule__SubPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2396:1: ( rule__SubPath__Group__0__Impl rule__SubPath__Group__1 )
            // InternalEldmDslParser.g:2397:2: rule__SubPath__Group__0__Impl rule__SubPath__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SubPath__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubPath__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__0"


    // $ANTLR start "rule__SubPath__Group__0__Impl"
    // InternalEldmDslParser.g:2404:1: rule__SubPath__Group__0__Impl : ( Def ) ;
    public final void rule__SubPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2408:1: ( ( Def ) )
            // InternalEldmDslParser.g:2409:1: ( Def )
            {
            // InternalEldmDslParser.g:2409:1: ( Def )
            // InternalEldmDslParser.g:2410:2: Def
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getDefKeyword_0()); 
            }
            match(input,Def,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getDefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__0__Impl"


    // $ANTLR start "rule__SubPath__Group__1"
    // InternalEldmDslParser.g:2419:1: rule__SubPath__Group__1 : rule__SubPath__Group__1__Impl rule__SubPath__Group__2 ;
    public final void rule__SubPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2423:1: ( rule__SubPath__Group__1__Impl rule__SubPath__Group__2 )
            // InternalEldmDslParser.g:2424:2: rule__SubPath__Group__1__Impl rule__SubPath__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SubPath__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubPath__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__1"


    // $ANTLR start "rule__SubPath__Group__1__Impl"
    // InternalEldmDslParser.g:2431:1: rule__SubPath__Group__1__Impl : ( ( rule__SubPath__NameAssignment_1 ) ) ;
    public final void rule__SubPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2435:1: ( ( ( rule__SubPath__NameAssignment_1 ) ) )
            // InternalEldmDslParser.g:2436:1: ( ( rule__SubPath__NameAssignment_1 ) )
            {
            // InternalEldmDslParser.g:2436:1: ( ( rule__SubPath__NameAssignment_1 ) )
            // InternalEldmDslParser.g:2437:2: ( rule__SubPath__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getNameAssignment_1()); 
            }
            // InternalEldmDslParser.g:2438:2: ( rule__SubPath__NameAssignment_1 )
            // InternalEldmDslParser.g:2438:3: rule__SubPath__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubPath__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__1__Impl"


    // $ANTLR start "rule__SubPath__Group__2"
    // InternalEldmDslParser.g:2446:1: rule__SubPath__Group__2 : rule__SubPath__Group__2__Impl rule__SubPath__Group__3 ;
    public final void rule__SubPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2450:1: ( rule__SubPath__Group__2__Impl rule__SubPath__Group__3 )
            // InternalEldmDslParser.g:2451:2: rule__SubPath__Group__2__Impl rule__SubPath__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SubPath__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubPath__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__2"


    // $ANTLR start "rule__SubPath__Group__2__Impl"
    // InternalEldmDslParser.g:2458:1: rule__SubPath__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__SubPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2462:1: ( ( RULE_BEGIN ) )
            // InternalEldmDslParser.g:2463:1: ( RULE_BEGIN )
            {
            // InternalEldmDslParser.g:2463:1: ( RULE_BEGIN )
            // InternalEldmDslParser.g:2464:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__2__Impl"


    // $ANTLR start "rule__SubPath__Group__3"
    // InternalEldmDslParser.g:2473:1: rule__SubPath__Group__3 : rule__SubPath__Group__3__Impl rule__SubPath__Group__4 ;
    public final void rule__SubPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2477:1: ( rule__SubPath__Group__3__Impl rule__SubPath__Group__4 )
            // InternalEldmDslParser.g:2478:2: rule__SubPath__Group__3__Impl rule__SubPath__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SubPath__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubPath__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__3"


    // $ANTLR start "rule__SubPath__Group__3__Impl"
    // InternalEldmDslParser.g:2485:1: rule__SubPath__Group__3__Impl : ( ( ( rule__SubPath__OpersAssignment_3 ) ) ( ( rule__SubPath__OpersAssignment_3 )* ) ) ;
    public final void rule__SubPath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2489:1: ( ( ( ( rule__SubPath__OpersAssignment_3 ) ) ( ( rule__SubPath__OpersAssignment_3 )* ) ) )
            // InternalEldmDslParser.g:2490:1: ( ( ( rule__SubPath__OpersAssignment_3 ) ) ( ( rule__SubPath__OpersAssignment_3 )* ) )
            {
            // InternalEldmDslParser.g:2490:1: ( ( ( rule__SubPath__OpersAssignment_3 ) ) ( ( rule__SubPath__OpersAssignment_3 )* ) )
            // InternalEldmDslParser.g:2491:2: ( ( rule__SubPath__OpersAssignment_3 ) ) ( ( rule__SubPath__OpersAssignment_3 )* )
            {
            // InternalEldmDslParser.g:2491:2: ( ( rule__SubPath__OpersAssignment_3 ) )
            // InternalEldmDslParser.g:2492:3: ( rule__SubPath__OpersAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getOpersAssignment_3()); 
            }
            // InternalEldmDslParser.g:2493:3: ( rule__SubPath__OpersAssignment_3 )
            // InternalEldmDslParser.g:2493:4: rule__SubPath__OpersAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__SubPath__OpersAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getOpersAssignment_3()); 
            }

            }

            // InternalEldmDslParser.g:2496:2: ( ( rule__SubPath__OpersAssignment_3 )* )
            // InternalEldmDslParser.g:2497:3: ( rule__SubPath__OpersAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getOpersAssignment_3()); 
            }
            // InternalEldmDslParser.g:2498:3: ( rule__SubPath__OpersAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Def) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEldmDslParser.g:2498:4: rule__SubPath__OpersAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SubPath__OpersAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getOpersAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__3__Impl"


    // $ANTLR start "rule__SubPath__Group__4"
    // InternalEldmDslParser.g:2507:1: rule__SubPath__Group__4 : rule__SubPath__Group__4__Impl ;
    public final void rule__SubPath__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2511:1: ( rule__SubPath__Group__4__Impl )
            // InternalEldmDslParser.g:2512:2: rule__SubPath__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubPath__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__4"


    // $ANTLR start "rule__SubPath__Group__4__Impl"
    // InternalEldmDslParser.g:2518:1: rule__SubPath__Group__4__Impl : ( RULE_END ) ;
    public final void rule__SubPath__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2522:1: ( ( RULE_END ) )
            // InternalEldmDslParser.g:2523:1: ( RULE_END )
            {
            // InternalEldmDslParser.g:2523:1: ( RULE_END )
            // InternalEldmDslParser.g:2524:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getENDTerminalRuleCall_4()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getENDTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalEldmDslParser.g:2534:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2538:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalEldmDslParser.g:2539:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalEldmDslParser.g:2546:1: rule__Operation__Group__0__Impl : ( Def ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2550:1: ( ( Def ) )
            // InternalEldmDslParser.g:2551:1: ( Def )
            {
            // InternalEldmDslParser.g:2551:1: ( Def )
            // InternalEldmDslParser.g:2552:2: Def
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getDefKeyword_0()); 
            }
            match(input,Def,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getDefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalEldmDslParser.g:2561:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2565:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalEldmDslParser.g:2566:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalEldmDslParser.g:2573:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__Alternatives_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2577:1: ( ( ( rule__Operation__Alternatives_1 ) ) )
            // InternalEldmDslParser.g:2578:1: ( ( rule__Operation__Alternatives_1 ) )
            {
            // InternalEldmDslParser.g:2578:1: ( ( rule__Operation__Alternatives_1 ) )
            // InternalEldmDslParser.g:2579:2: ( rule__Operation__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getAlternatives_1()); 
            }
            // InternalEldmDslParser.g:2580:2: ( rule__Operation__Alternatives_1 )
            // InternalEldmDslParser.g:2580:3: rule__Operation__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalEldmDslParser.g:2588:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2592:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalEldmDslParser.g:2593:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalEldmDslParser.g:2600:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 )? ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2604:1: ( ( ( rule__Operation__NameAssignment_2 )? ) )
            // InternalEldmDslParser.g:2605:1: ( ( rule__Operation__NameAssignment_2 )? )
            {
            // InternalEldmDslParser.g:2605:1: ( ( rule__Operation__NameAssignment_2 )? )
            // InternalEldmDslParser.g:2606:2: ( rule__Operation__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            }
            // InternalEldmDslParser.g:2607:2: ( rule__Operation__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_PID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEldmDslParser.g:2607:3: rule__Operation__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalEldmDslParser.g:2615:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2619:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalEldmDslParser.g:2620:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Operation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalEldmDslParser.g:2627:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__ParamAssignment_3 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2631:1: ( ( ( rule__Operation__ParamAssignment_3 )? ) )
            // InternalEldmDslParser.g:2632:1: ( ( rule__Operation__ParamAssignment_3 )? )
            {
            // InternalEldmDslParser.g:2632:1: ( ( rule__Operation__ParamAssignment_3 )? )
            // InternalEldmDslParser.g:2633:2: ( rule__Operation__ParamAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParamAssignment_3()); 
            }
            // InternalEldmDslParser.g:2634:2: ( rule__Operation__ParamAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftCurlyBracket||LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEldmDslParser.g:2634:3: rule__Operation__ParamAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__ParamAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParamAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalEldmDslParser.g:2642:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2646:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalEldmDslParser.g:2647:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Operation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalEldmDslParser.g:2654:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2658:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // InternalEldmDslParser.g:2659:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // InternalEldmDslParser.g:2659:1: ( ( rule__Operation__Group_4__0 )? )
            // InternalEldmDslParser.g:2660:2: ( rule__Operation__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_4()); 
            }
            // InternalEldmDslParser.g:2661:2: ( rule__Operation__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==HyphenMinusGreaterThanSign) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEldmDslParser.g:2661:3: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalEldmDslParser.g:2669:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2673:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalEldmDslParser.g:2674:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Operation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalEldmDslParser.g:2681:1: rule__Operation__Group__5__Impl : ( Colon ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2685:1: ( ( Colon ) )
            // InternalEldmDslParser.g:2686:1: ( Colon )
            {
            // InternalEldmDslParser.g:2686:1: ( Colon )
            // InternalEldmDslParser.g:2687:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalEldmDslParser.g:2696:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2700:1: ( rule__Operation__Group__6__Impl )
            // InternalEldmDslParser.g:2701:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalEldmDslParser.g:2707:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__BodyAssignment_6 ) ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2711:1: ( ( ( rule__Operation__BodyAssignment_6 ) ) )
            // InternalEldmDslParser.g:2712:1: ( ( rule__Operation__BodyAssignment_6 ) )
            {
            // InternalEldmDslParser.g:2712:1: ( ( rule__Operation__BodyAssignment_6 ) )
            // InternalEldmDslParser.g:2713:2: ( rule__Operation__BodyAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getBodyAssignment_6()); 
            }
            // InternalEldmDslParser.g:2714:2: ( rule__Operation__BodyAssignment_6 )
            // InternalEldmDslParser.g:2714:3: rule__Operation__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Operation__BodyAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getBodyAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // InternalEldmDslParser.g:2723:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2727:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // InternalEldmDslParser.g:2728:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // InternalEldmDslParser.g:2735:1: rule__Operation__Group_4__0__Impl : ( HyphenMinusGreaterThanSign ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2739:1: ( ( HyphenMinusGreaterThanSign ) )
            // InternalEldmDslParser.g:2740:1: ( HyphenMinusGreaterThanSign )
            {
            // InternalEldmDslParser.g:2740:1: ( HyphenMinusGreaterThanSign )
            // InternalEldmDslParser.g:2741:2: HyphenMinusGreaterThanSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            }
            match(input,HyphenMinusGreaterThanSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // InternalEldmDslParser.g:2750:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2754:1: ( rule__Operation__Group_4__1__Impl )
            // InternalEldmDslParser.g:2755:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // InternalEldmDslParser.g:2761:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__ResultAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2765:1: ( ( ( rule__Operation__ResultAssignment_4_1 ) ) )
            // InternalEldmDslParser.g:2766:1: ( ( rule__Operation__ResultAssignment_4_1 ) )
            {
            // InternalEldmDslParser.g:2766:1: ( ( rule__Operation__ResultAssignment_4_1 ) )
            // InternalEldmDslParser.g:2767:2: ( rule__Operation__ResultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getResultAssignment_4_1()); 
            }
            // InternalEldmDslParser.g:2768:2: ( rule__Operation__ResultAssignment_4_1 )
            // InternalEldmDslParser.g:2768:3: rule__Operation__ResultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ResultAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getResultAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__BlockExpression__Group__0"
    // InternalEldmDslParser.g:2777:1: rule__BlockExpression__Group__0 : rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 ;
    public final void rule__BlockExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2781:1: ( rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 )
            // InternalEldmDslParser.g:2782:2: rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__BlockExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0"


    // $ANTLR start "rule__BlockExpression__Group__0__Impl"
    // InternalEldmDslParser.g:2789:1: rule__BlockExpression__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__BlockExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2793:1: ( ( RULE_BEGIN ) )
            // InternalEldmDslParser.g:2794:1: ( RULE_BEGIN )
            {
            // InternalEldmDslParser.g:2794:1: ( RULE_BEGIN )
            // InternalEldmDslParser.g:2795:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBEGINTerminalRuleCall_0()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getBEGINTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0__Impl"


    // $ANTLR start "rule__BlockExpression__Group__1"
    // InternalEldmDslParser.g:2804:1: rule__BlockExpression__Group__1 : rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 ;
    public final void rule__BlockExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2808:1: ( rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 )
            // InternalEldmDslParser.g:2809:2: rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BlockExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__1"


    // $ANTLR start "rule__BlockExpression__Group__1__Impl"
    // InternalEldmDslParser.g:2816:1: rule__BlockExpression__Group__1__Impl : ( Block ) ;
    public final void rule__BlockExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2820:1: ( ( Block ) )
            // InternalEldmDslParser.g:2821:1: ( Block )
            {
            // InternalEldmDslParser.g:2821:1: ( Block )
            // InternalEldmDslParser.g:2822:2: Block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getBlockKeyword_1()); 
            }
            match(input,Block,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getBlockKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__1__Impl"


    // $ANTLR start "rule__BlockExpression__Group__2"
    // InternalEldmDslParser.g:2831:1: rule__BlockExpression__Group__2 : rule__BlockExpression__Group__2__Impl ;
    public final void rule__BlockExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2835:1: ( rule__BlockExpression__Group__2__Impl )
            // InternalEldmDslParser.g:2836:2: rule__BlockExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__2"


    // $ANTLR start "rule__BlockExpression__Group__2__Impl"
    // InternalEldmDslParser.g:2842:1: rule__BlockExpression__Group__2__Impl : ( RULE_END ) ;
    public final void rule__BlockExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2846:1: ( ( RULE_END ) )
            // InternalEldmDslParser.g:2847:1: ( RULE_END )
            {
            // InternalEldmDslParser.g:2847:1: ( RULE_END )
            // InternalEldmDslParser.g:2848:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockExpressionAccess().getENDTerminalRuleCall_2()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockExpressionAccess().getENDTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__2__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // InternalEldmDslParser.g:2858:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2862:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // InternalEldmDslParser.g:2863:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // InternalEldmDslParser.g:2870:1: rule__TypeDef__Group__0__Impl : ( Typedef ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2874:1: ( ( Typedef ) )
            // InternalEldmDslParser.g:2875:1: ( Typedef )
            {
            // InternalEldmDslParser.g:2875:1: ( Typedef )
            // InternalEldmDslParser.g:2876:2: Typedef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 
            }
            match(input,Typedef,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // InternalEldmDslParser.g:2885:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2889:1: ( rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 )
            // InternalEldmDslParser.g:2890:2: rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // InternalEldmDslParser.g:2897:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__NameAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2901:1: ( ( ( rule__TypeDef__NameAssignment_1 ) ) )
            // InternalEldmDslParser.g:2902:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            {
            // InternalEldmDslParser.g:2902:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            // InternalEldmDslParser.g:2903:2: ( rule__TypeDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 
            }
            // InternalEldmDslParser.g:2904:2: ( rule__TypeDef__NameAssignment_1 )
            // InternalEldmDslParser.g:2904:3: rule__TypeDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__2"
    // InternalEldmDslParser.g:2912:1: rule__TypeDef__Group__2 : rule__TypeDef__Group__2__Impl ;
    public final void rule__TypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2916:1: ( rule__TypeDef__Group__2__Impl )
            // InternalEldmDslParser.g:2917:2: rule__TypeDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2"


    // $ANTLR start "rule__TypeDef__Group__2__Impl"
    // InternalEldmDslParser.g:2923:1: rule__TypeDef__Group__2__Impl : ( ( rule__TypeDef__Alternatives_2 ) ) ;
    public final void rule__TypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2927:1: ( ( ( rule__TypeDef__Alternatives_2 ) ) )
            // InternalEldmDslParser.g:2928:1: ( ( rule__TypeDef__Alternatives_2 ) )
            {
            // InternalEldmDslParser.g:2928:1: ( ( rule__TypeDef__Alternatives_2 ) )
            // InternalEldmDslParser.g:2929:2: ( rule__TypeDef__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getAlternatives_2()); 
            }
            // InternalEldmDslParser.g:2930:2: ( rule__TypeDef__Alternatives_2 )
            // InternalEldmDslParser.g:2930:3: rule__TypeDef__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0__0"
    // InternalEldmDslParser.g:2939:1: rule__TypeDef__Group_2_0__0 : rule__TypeDef__Group_2_0__0__Impl rule__TypeDef__Group_2_0__1 ;
    public final void rule__TypeDef__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2943:1: ( rule__TypeDef__Group_2_0__0__Impl rule__TypeDef__Group_2_0__1 )
            // InternalEldmDslParser.g:2944:2: rule__TypeDef__Group_2_0__0__Impl rule__TypeDef__Group_2_0__1
            {
            pushFollow(FOLLOW_28);
            rule__TypeDef__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__0"


    // $ANTLR start "rule__TypeDef__Group_2_0__0__Impl"
    // InternalEldmDslParser.g:2951:1: rule__TypeDef__Group_2_0__0__Impl : ( ( rule__TypeDef__ParserAssignment_2_0_0 ) ) ;
    public final void rule__TypeDef__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2955:1: ( ( ( rule__TypeDef__ParserAssignment_2_0_0 ) ) )
            // InternalEldmDslParser.g:2956:1: ( ( rule__TypeDef__ParserAssignment_2_0_0 ) )
            {
            // InternalEldmDslParser.g:2956:1: ( ( rule__TypeDef__ParserAssignment_2_0_0 ) )
            // InternalEldmDslParser.g:2957:2: ( rule__TypeDef__ParserAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getParserAssignment_2_0_0()); 
            }
            // InternalEldmDslParser.g:2958:2: ( rule__TypeDef__ParserAssignment_2_0_0 )
            // InternalEldmDslParser.g:2958:3: rule__TypeDef__ParserAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__ParserAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getParserAssignment_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0__1"
    // InternalEldmDslParser.g:2966:1: rule__TypeDef__Group_2_0__1 : rule__TypeDef__Group_2_0__1__Impl ;
    public final void rule__TypeDef__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2970:1: ( rule__TypeDef__Group_2_0__1__Impl )
            // InternalEldmDslParser.g:2971:2: rule__TypeDef__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__1"


    // $ANTLR start "rule__TypeDef__Group_2_0__1__Impl"
    // InternalEldmDslParser.g:2977:1: rule__TypeDef__Group_2_0__1__Impl : ( ( rule__TypeDef__CodeAssignment_2_0_1 ) ) ;
    public final void rule__TypeDef__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2981:1: ( ( ( rule__TypeDef__CodeAssignment_2_0_1 ) ) )
            // InternalEldmDslParser.g:2982:1: ( ( rule__TypeDef__CodeAssignment_2_0_1 ) )
            {
            // InternalEldmDslParser.g:2982:1: ( ( rule__TypeDef__CodeAssignment_2_0_1 ) )
            // InternalEldmDslParser.g:2983:2: ( rule__TypeDef__CodeAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getCodeAssignment_2_0_1()); 
            }
            // InternalEldmDslParser.g:2984:2: ( rule__TypeDef__CodeAssignment_2_0_1 )
            // InternalEldmDslParser.g:2984:3: rule__TypeDef__CodeAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__CodeAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getCodeAssignment_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__1__Impl"


    // $ANTLR start "rule__EnumDef__Group__0"
    // InternalEldmDslParser.g:2993:1: rule__EnumDef__Group__0 : rule__EnumDef__Group__0__Impl rule__EnumDef__Group__1 ;
    public final void rule__EnumDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:2997:1: ( rule__EnumDef__Group__0__Impl rule__EnumDef__Group__1 )
            // InternalEldmDslParser.g:2998:2: rule__EnumDef__Group__0__Impl rule__EnumDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EnumDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__0"


    // $ANTLR start "rule__EnumDef__Group__0__Impl"
    // InternalEldmDslParser.g:3005:1: rule__EnumDef__Group__0__Impl : ( Enum ) ;
    public final void rule__EnumDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3009:1: ( ( Enum ) )
            // InternalEldmDslParser.g:3010:1: ( Enum )
            {
            // InternalEldmDslParser.g:3010:1: ( Enum )
            // InternalEldmDslParser.g:3011:2: Enum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getEnumKeyword_0()); 
            }
            match(input,Enum,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__0__Impl"


    // $ANTLR start "rule__EnumDef__Group__1"
    // InternalEldmDslParser.g:3020:1: rule__EnumDef__Group__1 : rule__EnumDef__Group__1__Impl rule__EnumDef__Group__2 ;
    public final void rule__EnumDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3024:1: ( rule__EnumDef__Group__1__Impl rule__EnumDef__Group__2 )
            // InternalEldmDslParser.g:3025:2: rule__EnumDef__Group__1__Impl rule__EnumDef__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__EnumDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__1"


    // $ANTLR start "rule__EnumDef__Group__1__Impl"
    // InternalEldmDslParser.g:3032:1: rule__EnumDef__Group__1__Impl : ( ( rule__EnumDef__NameAssignment_1 ) ) ;
    public final void rule__EnumDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3036:1: ( ( ( rule__EnumDef__NameAssignment_1 ) ) )
            // InternalEldmDslParser.g:3037:1: ( ( rule__EnumDef__NameAssignment_1 ) )
            {
            // InternalEldmDslParser.g:3037:1: ( ( rule__EnumDef__NameAssignment_1 ) )
            // InternalEldmDslParser.g:3038:2: ( rule__EnumDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getNameAssignment_1()); 
            }
            // InternalEldmDslParser.g:3039:2: ( rule__EnumDef__NameAssignment_1 )
            // InternalEldmDslParser.g:3039:3: rule__EnumDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumDef__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__1__Impl"


    // $ANTLR start "rule__EnumDef__Group__2"
    // InternalEldmDslParser.g:3047:1: rule__EnumDef__Group__2 : rule__EnumDef__Group__2__Impl rule__EnumDef__Group__3 ;
    public final void rule__EnumDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3051:1: ( rule__EnumDef__Group__2__Impl rule__EnumDef__Group__3 )
            // InternalEldmDslParser.g:3052:2: rule__EnumDef__Group__2__Impl rule__EnumDef__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__EnumDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__2"


    // $ANTLR start "rule__EnumDef__Group__2__Impl"
    // InternalEldmDslParser.g:3059:1: rule__EnumDef__Group__2__Impl : ( ( rule__EnumDef__TypeAssignment_2 ) ) ;
    public final void rule__EnumDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3063:1: ( ( ( rule__EnumDef__TypeAssignment_2 ) ) )
            // InternalEldmDslParser.g:3064:1: ( ( rule__EnumDef__TypeAssignment_2 ) )
            {
            // InternalEldmDslParser.g:3064:1: ( ( rule__EnumDef__TypeAssignment_2 ) )
            // InternalEldmDslParser.g:3065:2: ( rule__EnumDef__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getTypeAssignment_2()); 
            }
            // InternalEldmDslParser.g:3066:2: ( rule__EnumDef__TypeAssignment_2 )
            // InternalEldmDslParser.g:3066:3: rule__EnumDef__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumDef__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__2__Impl"


    // $ANTLR start "rule__EnumDef__Group__3"
    // InternalEldmDslParser.g:3074:1: rule__EnumDef__Group__3 : rule__EnumDef__Group__3__Impl rule__EnumDef__Group__4 ;
    public final void rule__EnumDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3078:1: ( rule__EnumDef__Group__3__Impl rule__EnumDef__Group__4 )
            // InternalEldmDslParser.g:3079:2: rule__EnumDef__Group__3__Impl rule__EnumDef__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__EnumDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__3"


    // $ANTLR start "rule__EnumDef__Group__3__Impl"
    // InternalEldmDslParser.g:3086:1: rule__EnumDef__Group__3__Impl : ( Colon ) ;
    public final void rule__EnumDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3090:1: ( ( Colon ) )
            // InternalEldmDslParser.g:3091:1: ( Colon )
            {
            // InternalEldmDslParser.g:3091:1: ( Colon )
            // InternalEldmDslParser.g:3092:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getColonKeyword_3()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__3__Impl"


    // $ANTLR start "rule__EnumDef__Group__4"
    // InternalEldmDslParser.g:3101:1: rule__EnumDef__Group__4 : rule__EnumDef__Group__4__Impl rule__EnumDef__Group__5 ;
    public final void rule__EnumDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3105:1: ( rule__EnumDef__Group__4__Impl rule__EnumDef__Group__5 )
            // InternalEldmDslParser.g:3106:2: rule__EnumDef__Group__4__Impl rule__EnumDef__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__EnumDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__4"


    // $ANTLR start "rule__EnumDef__Group__4__Impl"
    // InternalEldmDslParser.g:3113:1: rule__EnumDef__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__EnumDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3117:1: ( ( RULE_BEGIN ) )
            // InternalEldmDslParser.g:3118:1: ( RULE_BEGIN )
            {
            // InternalEldmDslParser.g:3118:1: ( RULE_BEGIN )
            // InternalEldmDslParser.g:3119:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getBEGINTerminalRuleCall_4()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getBEGINTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__4__Impl"


    // $ANTLR start "rule__EnumDef__Group__5"
    // InternalEldmDslParser.g:3128:1: rule__EnumDef__Group__5 : rule__EnumDef__Group__5__Impl rule__EnumDef__Group__6 ;
    public final void rule__EnumDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3132:1: ( rule__EnumDef__Group__5__Impl rule__EnumDef__Group__6 )
            // InternalEldmDslParser.g:3133:2: rule__EnumDef__Group__5__Impl rule__EnumDef__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__EnumDef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__5"


    // $ANTLR start "rule__EnumDef__Group__5__Impl"
    // InternalEldmDslParser.g:3140:1: rule__EnumDef__Group__5__Impl : ( ( ( rule__EnumDef__DefsAssignment_5 ) ) ( ( rule__EnumDef__DefsAssignment_5 )* ) ) ;
    public final void rule__EnumDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3144:1: ( ( ( ( rule__EnumDef__DefsAssignment_5 ) ) ( ( rule__EnumDef__DefsAssignment_5 )* ) ) )
            // InternalEldmDslParser.g:3145:1: ( ( ( rule__EnumDef__DefsAssignment_5 ) ) ( ( rule__EnumDef__DefsAssignment_5 )* ) )
            {
            // InternalEldmDslParser.g:3145:1: ( ( ( rule__EnumDef__DefsAssignment_5 ) ) ( ( rule__EnumDef__DefsAssignment_5 )* ) )
            // InternalEldmDslParser.g:3146:2: ( ( rule__EnumDef__DefsAssignment_5 ) ) ( ( rule__EnumDef__DefsAssignment_5 )* )
            {
            // InternalEldmDslParser.g:3146:2: ( ( rule__EnumDef__DefsAssignment_5 ) )
            // InternalEldmDslParser.g:3147:3: ( rule__EnumDef__DefsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getDefsAssignment_5()); 
            }
            // InternalEldmDslParser.g:3148:3: ( rule__EnumDef__DefsAssignment_5 )
            // InternalEldmDslParser.g:3148:4: rule__EnumDef__DefsAssignment_5
            {
            pushFollow(FOLLOW_3);
            rule__EnumDef__DefsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getDefsAssignment_5()); 
            }

            }

            // InternalEldmDslParser.g:3151:2: ( ( rule__EnumDef__DefsAssignment_5 )* )
            // InternalEldmDslParser.g:3152:3: ( rule__EnumDef__DefsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getDefsAssignment_5()); 
            }
            // InternalEldmDslParser.g:3153:3: ( rule__EnumDef__DefsAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEldmDslParser.g:3153:4: rule__EnumDef__DefsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EnumDef__DefsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getDefsAssignment_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__5__Impl"


    // $ANTLR start "rule__EnumDef__Group__6"
    // InternalEldmDslParser.g:3162:1: rule__EnumDef__Group__6 : rule__EnumDef__Group__6__Impl ;
    public final void rule__EnumDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3166:1: ( rule__EnumDef__Group__6__Impl )
            // InternalEldmDslParser.g:3167:2: rule__EnumDef__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDef__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__6"


    // $ANTLR start "rule__EnumDef__Group__6__Impl"
    // InternalEldmDslParser.g:3173:1: rule__EnumDef__Group__6__Impl : ( RULE_END ) ;
    public final void rule__EnumDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3177:1: ( ( RULE_END ) )
            // InternalEldmDslParser.g:3178:1: ( RULE_END )
            {
            // InternalEldmDslParser.g:3178:1: ( RULE_END )
            // InternalEldmDslParser.g:3179:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getENDTerminalRuleCall_6()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getENDTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__6__Impl"


    // $ANTLR start "rule__EnumItemDef__Group__0"
    // InternalEldmDslParser.g:3189:1: rule__EnumItemDef__Group__0 : rule__EnumItemDef__Group__0__Impl rule__EnumItemDef__Group__1 ;
    public final void rule__EnumItemDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3193:1: ( rule__EnumItemDef__Group__0__Impl rule__EnumItemDef__Group__1 )
            // InternalEldmDslParser.g:3194:2: rule__EnumItemDef__Group__0__Impl rule__EnumItemDef__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EnumItemDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumItemDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumItemDef__Group__0"


    // $ANTLR start "rule__EnumItemDef__Group__0__Impl"
    // InternalEldmDslParser.g:3201:1: rule__EnumItemDef__Group__0__Impl : ( ( rule__EnumItemDef__NameAssignment_0 ) ) ;
    public final void rule__EnumItemDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3205:1: ( ( ( rule__EnumItemDef__NameAssignment_0 ) ) )
            // InternalEldmDslParser.g:3206:1: ( ( rule__EnumItemDef__NameAssignment_0 ) )
            {
            // InternalEldmDslParser.g:3206:1: ( ( rule__EnumItemDef__NameAssignment_0 ) )
            // InternalEldmDslParser.g:3207:2: ( rule__EnumItemDef__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemDefAccess().getNameAssignment_0()); 
            }
            // InternalEldmDslParser.g:3208:2: ( rule__EnumItemDef__NameAssignment_0 )
            // InternalEldmDslParser.g:3208:3: rule__EnumItemDef__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumItemDef__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemDefAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumItemDef__Group__0__Impl"


    // $ANTLR start "rule__EnumItemDef__Group__1"
    // InternalEldmDslParser.g:3216:1: rule__EnumItemDef__Group__1 : rule__EnumItemDef__Group__1__Impl ;
    public final void rule__EnumItemDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3220:1: ( rule__EnumItemDef__Group__1__Impl )
            // InternalEldmDslParser.g:3221:2: rule__EnumItemDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumItemDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumItemDef__Group__1"


    // $ANTLR start "rule__EnumItemDef__Group__1__Impl"
    // InternalEldmDslParser.g:3227:1: rule__EnumItemDef__Group__1__Impl : ( ( rule__EnumItemDef__ValueAssignment_1 ) ) ;
    public final void rule__EnumItemDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3231:1: ( ( ( rule__EnumItemDef__ValueAssignment_1 ) ) )
            // InternalEldmDslParser.g:3232:1: ( ( rule__EnumItemDef__ValueAssignment_1 ) )
            {
            // InternalEldmDslParser.g:3232:1: ( ( rule__EnumItemDef__ValueAssignment_1 ) )
            // InternalEldmDslParser.g:3233:2: ( rule__EnumItemDef__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemDefAccess().getValueAssignment_1()); 
            }
            // InternalEldmDslParser.g:3234:2: ( rule__EnumItemDef__ValueAssignment_1 )
            // InternalEldmDslParser.g:3234:3: rule__EnumItemDef__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumItemDef__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemDefAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumItemDef__Group__1__Impl"


    // $ANTLR start "rule__MapDef__Group_0__0"
    // InternalEldmDslParser.g:3243:1: rule__MapDef__Group_0__0 : rule__MapDef__Group_0__0__Impl ;
    public final void rule__MapDef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3247:1: ( rule__MapDef__Group_0__0__Impl )
            // InternalEldmDslParser.g:3248:2: rule__MapDef__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0__0"


    // $ANTLR start "rule__MapDef__Group_0__0__Impl"
    // InternalEldmDslParser.g:3254:1: rule__MapDef__Group_0__0__Impl : ( ( rule__MapDef__Group_0_0__0 ) ) ;
    public final void rule__MapDef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3258:1: ( ( ( rule__MapDef__Group_0_0__0 ) ) )
            // InternalEldmDslParser.g:3259:1: ( ( rule__MapDef__Group_0_0__0 ) )
            {
            // InternalEldmDslParser.g:3259:1: ( ( rule__MapDef__Group_0_0__0 ) )
            // InternalEldmDslParser.g:3260:2: ( rule__MapDef__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getGroup_0_0()); 
            }
            // InternalEldmDslParser.g:3261:2: ( rule__MapDef__Group_0_0__0 )
            // InternalEldmDslParser.g:3261:3: rule__MapDef__Group_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getGroup_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0__0__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0__0"
    // InternalEldmDslParser.g:3270:1: rule__MapDef__Group_0_0__0 : rule__MapDef__Group_0_0__0__Impl rule__MapDef__Group_0_0__1 ;
    public final void rule__MapDef__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3274:1: ( rule__MapDef__Group_0_0__0__Impl rule__MapDef__Group_0_0__1 )
            // InternalEldmDslParser.g:3275:2: rule__MapDef__Group_0_0__0__Impl rule__MapDef__Group_0_0__1
            {
            pushFollow(FOLLOW_29);
            rule__MapDef__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__0"


    // $ANTLR start "rule__MapDef__Group_0_0__0__Impl"
    // InternalEldmDslParser.g:3282:1: rule__MapDef__Group_0_0__0__Impl : ( () ) ;
    public final void rule__MapDef__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3286:1: ( ( () ) )
            // InternalEldmDslParser.g:3287:1: ( () )
            {
            // InternalEldmDslParser.g:3287:1: ( () )
            // InternalEldmDslParser.g:3288:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getMapDefAction_0_0_0()); 
            }
            // InternalEldmDslParser.g:3289:2: ()
            // InternalEldmDslParser.g:3289:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getMapDefAction_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__0__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0__1"
    // InternalEldmDslParser.g:3297:1: rule__MapDef__Group_0_0__1 : rule__MapDef__Group_0_0__1__Impl rule__MapDef__Group_0_0__2 ;
    public final void rule__MapDef__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3301:1: ( rule__MapDef__Group_0_0__1__Impl rule__MapDef__Group_0_0__2 )
            // InternalEldmDslParser.g:3302:2: rule__MapDef__Group_0_0__1__Impl rule__MapDef__Group_0_0__2
            {
            pushFollow(FOLLOW_31);
            rule__MapDef__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__1"


    // $ANTLR start "rule__MapDef__Group_0_0__1__Impl"
    // InternalEldmDslParser.g:3309:1: rule__MapDef__Group_0_0__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__MapDef__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3313:1: ( ( LeftCurlyBracket ) )
            // InternalEldmDslParser.g:3314:1: ( LeftCurlyBracket )
            {
            // InternalEldmDslParser.g:3314:1: ( LeftCurlyBracket )
            // InternalEldmDslParser.g:3315:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__1__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0__2"
    // InternalEldmDslParser.g:3324:1: rule__MapDef__Group_0_0__2 : rule__MapDef__Group_0_0__2__Impl rule__MapDef__Group_0_0__3 ;
    public final void rule__MapDef__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3328:1: ( rule__MapDef__Group_0_0__2__Impl rule__MapDef__Group_0_0__3 )
            // InternalEldmDslParser.g:3329:2: rule__MapDef__Group_0_0__2__Impl rule__MapDef__Group_0_0__3
            {
            pushFollow(FOLLOW_31);
            rule__MapDef__Group_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__2"


    // $ANTLR start "rule__MapDef__Group_0_0__2__Impl"
    // InternalEldmDslParser.g:3336:1: rule__MapDef__Group_0_0__2__Impl : ( ( rule__MapDef__Group_0_0_2__0 )? ) ;
    public final void rule__MapDef__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3340:1: ( ( ( rule__MapDef__Group_0_0_2__0 )? ) )
            // InternalEldmDslParser.g:3341:1: ( ( rule__MapDef__Group_0_0_2__0 )? )
            {
            // InternalEldmDslParser.g:3341:1: ( ( rule__MapDef__Group_0_0_2__0 )? )
            // InternalEldmDslParser.g:3342:2: ( rule__MapDef__Group_0_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getGroup_0_0_2()); 
            }
            // InternalEldmDslParser.g:3343:2: ( rule__MapDef__Group_0_0_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEldmDslParser.g:3343:3: rule__MapDef__Group_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapDef__Group_0_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getGroup_0_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__2__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0__3"
    // InternalEldmDslParser.g:3351:1: rule__MapDef__Group_0_0__3 : rule__MapDef__Group_0_0__3__Impl ;
    public final void rule__MapDef__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3355:1: ( rule__MapDef__Group_0_0__3__Impl )
            // InternalEldmDslParser.g:3356:2: rule__MapDef__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__3"


    // $ANTLR start "rule__MapDef__Group_0_0__3__Impl"
    // InternalEldmDslParser.g:3362:1: rule__MapDef__Group_0_0__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__MapDef__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3366:1: ( ( RightCurlyBracket ) )
            // InternalEldmDslParser.g:3367:1: ( RightCurlyBracket )
            {
            // InternalEldmDslParser.g:3367:1: ( RightCurlyBracket )
            // InternalEldmDslParser.g:3368:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_0_0_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_0_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0__3__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0_2__0"
    // InternalEldmDslParser.g:3378:1: rule__MapDef__Group_0_0_2__0 : rule__MapDef__Group_0_0_2__0__Impl rule__MapDef__Group_0_0_2__1 ;
    public final void rule__MapDef__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3382:1: ( rule__MapDef__Group_0_0_2__0__Impl rule__MapDef__Group_0_0_2__1 )
            // InternalEldmDslParser.g:3383:2: rule__MapDef__Group_0_0_2__0__Impl rule__MapDef__Group_0_0_2__1
            {
            pushFollow(FOLLOW_18);
            rule__MapDef__Group_0_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2__0"


    // $ANTLR start "rule__MapDef__Group_0_0_2__0__Impl"
    // InternalEldmDslParser.g:3390:1: rule__MapDef__Group_0_0_2__0__Impl : ( ( rule__MapDef__DefsAssignment_0_0_2_0 ) ) ;
    public final void rule__MapDef__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3394:1: ( ( ( rule__MapDef__DefsAssignment_0_0_2_0 ) ) )
            // InternalEldmDslParser.g:3395:1: ( ( rule__MapDef__DefsAssignment_0_0_2_0 ) )
            {
            // InternalEldmDslParser.g:3395:1: ( ( rule__MapDef__DefsAssignment_0_0_2_0 ) )
            // InternalEldmDslParser.g:3396:2: ( rule__MapDef__DefsAssignment_0_0_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsAssignment_0_0_2_0()); 
            }
            // InternalEldmDslParser.g:3397:2: ( rule__MapDef__DefsAssignment_0_0_2_0 )
            // InternalEldmDslParser.g:3397:3: rule__MapDef__DefsAssignment_0_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__DefsAssignment_0_0_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsAssignment_0_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0_2__1"
    // InternalEldmDslParser.g:3405:1: rule__MapDef__Group_0_0_2__1 : rule__MapDef__Group_0_0_2__1__Impl ;
    public final void rule__MapDef__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3409:1: ( rule__MapDef__Group_0_0_2__1__Impl )
            // InternalEldmDslParser.g:3410:2: rule__MapDef__Group_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2__1"


    // $ANTLR start "rule__MapDef__Group_0_0_2__1__Impl"
    // InternalEldmDslParser.g:3416:1: rule__MapDef__Group_0_0_2__1__Impl : ( ( rule__MapDef__Group_0_0_2_1__0 )* ) ;
    public final void rule__MapDef__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3420:1: ( ( ( rule__MapDef__Group_0_0_2_1__0 )* ) )
            // InternalEldmDslParser.g:3421:1: ( ( rule__MapDef__Group_0_0_2_1__0 )* )
            {
            // InternalEldmDslParser.g:3421:1: ( ( rule__MapDef__Group_0_0_2_1__0 )* )
            // InternalEldmDslParser.g:3422:2: ( rule__MapDef__Group_0_0_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getGroup_0_0_2_1()); 
            }
            // InternalEldmDslParser.g:3423:2: ( rule__MapDef__Group_0_0_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEldmDslParser.g:3423:3: rule__MapDef__Group_0_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MapDef__Group_0_0_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getGroup_0_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0_2_1__0"
    // InternalEldmDslParser.g:3432:1: rule__MapDef__Group_0_0_2_1__0 : rule__MapDef__Group_0_0_2_1__0__Impl rule__MapDef__Group_0_0_2_1__1 ;
    public final void rule__MapDef__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3436:1: ( rule__MapDef__Group_0_0_2_1__0__Impl rule__MapDef__Group_0_0_2_1__1 )
            // InternalEldmDslParser.g:3437:2: rule__MapDef__Group_0_0_2_1__0__Impl rule__MapDef__Group_0_0_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MapDef__Group_0_0_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2_1__0"


    // $ANTLR start "rule__MapDef__Group_0_0_2_1__0__Impl"
    // InternalEldmDslParser.g:3444:1: rule__MapDef__Group_0_0_2_1__0__Impl : ( Comma ) ;
    public final void rule__MapDef__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3448:1: ( ( Comma ) )
            // InternalEldmDslParser.g:3449:1: ( Comma )
            {
            // InternalEldmDslParser.g:3449:1: ( Comma )
            // InternalEldmDslParser.g:3450:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2_1__0__Impl"


    // $ANTLR start "rule__MapDef__Group_0_0_2_1__1"
    // InternalEldmDslParser.g:3459:1: rule__MapDef__Group_0_0_2_1__1 : rule__MapDef__Group_0_0_2_1__1__Impl ;
    public final void rule__MapDef__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3463:1: ( rule__MapDef__Group_0_0_2_1__1__Impl )
            // InternalEldmDslParser.g:3464:2: rule__MapDef__Group_0_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_0_0_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2_1__1"


    // $ANTLR start "rule__MapDef__Group_0_0_2_1__1__Impl"
    // InternalEldmDslParser.g:3470:1: rule__MapDef__Group_0_0_2_1__1__Impl : ( ( rule__MapDef__DefsAssignment_0_0_2_1_1 ) ) ;
    public final void rule__MapDef__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3474:1: ( ( ( rule__MapDef__DefsAssignment_0_0_2_1_1 ) ) )
            // InternalEldmDslParser.g:3475:1: ( ( rule__MapDef__DefsAssignment_0_0_2_1_1 ) )
            {
            // InternalEldmDslParser.g:3475:1: ( ( rule__MapDef__DefsAssignment_0_0_2_1_1 ) )
            // InternalEldmDslParser.g:3476:2: ( rule__MapDef__DefsAssignment_0_0_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsAssignment_0_0_2_1_1()); 
            }
            // InternalEldmDslParser.g:3477:2: ( rule__MapDef__DefsAssignment_0_0_2_1_1 )
            // InternalEldmDslParser.g:3477:3: rule__MapDef__DefsAssignment_0_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__DefsAssignment_0_0_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsAssignment_0_0_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_0_0_2_1__1__Impl"


    // $ANTLR start "rule__MapDef__Group_1__0"
    // InternalEldmDslParser.g:3486:1: rule__MapDef__Group_1__0 : rule__MapDef__Group_1__0__Impl rule__MapDef__Group_1__1 ;
    public final void rule__MapDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3490:1: ( rule__MapDef__Group_1__0__Impl rule__MapDef__Group_1__1 )
            // InternalEldmDslParser.g:3491:2: rule__MapDef__Group_1__0__Impl rule__MapDef__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__MapDef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__0"


    // $ANTLR start "rule__MapDef__Group_1__0__Impl"
    // InternalEldmDslParser.g:3498:1: rule__MapDef__Group_1__0__Impl : ( () ) ;
    public final void rule__MapDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3502:1: ( ( () ) )
            // InternalEldmDslParser.g:3503:1: ( () )
            {
            // InternalEldmDslParser.g:3503:1: ( () )
            // InternalEldmDslParser.g:3504:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getMapDefAction_1_0()); 
            }
            // InternalEldmDslParser.g:3505:2: ()
            // InternalEldmDslParser.g:3505:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getMapDefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__0__Impl"


    // $ANTLR start "rule__MapDef__Group_1__1"
    // InternalEldmDslParser.g:3513:1: rule__MapDef__Group_1__1 : rule__MapDef__Group_1__1__Impl rule__MapDef__Group_1__2 ;
    public final void rule__MapDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3517:1: ( rule__MapDef__Group_1__1__Impl rule__MapDef__Group_1__2 )
            // InternalEldmDslParser.g:3518:2: rule__MapDef__Group_1__1__Impl rule__MapDef__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__MapDef__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__1"


    // $ANTLR start "rule__MapDef__Group_1__1__Impl"
    // InternalEldmDslParser.g:3525:1: rule__MapDef__Group_1__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__MapDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3529:1: ( ( LeftCurlyBracket ) )
            // InternalEldmDslParser.g:3530:1: ( LeftCurlyBracket )
            {
            // InternalEldmDslParser.g:3530:1: ( LeftCurlyBracket )
            // InternalEldmDslParser.g:3531:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_1_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__1__Impl"


    // $ANTLR start "rule__MapDef__Group_1__2"
    // InternalEldmDslParser.g:3540:1: rule__MapDef__Group_1__2 : rule__MapDef__Group_1__2__Impl rule__MapDef__Group_1__3 ;
    public final void rule__MapDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3544:1: ( rule__MapDef__Group_1__2__Impl rule__MapDef__Group_1__3 )
            // InternalEldmDslParser.g:3545:2: rule__MapDef__Group_1__2__Impl rule__MapDef__Group_1__3
            {
            pushFollow(FOLLOW_32);
            rule__MapDef__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__2"


    // $ANTLR start "rule__MapDef__Group_1__2__Impl"
    // InternalEldmDslParser.g:3552:1: rule__MapDef__Group_1__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__MapDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3556:1: ( ( RULE_BEGIN ) )
            // InternalEldmDslParser.g:3557:1: ( RULE_BEGIN )
            {
            // InternalEldmDslParser.g:3557:1: ( RULE_BEGIN )
            // InternalEldmDslParser.g:3558:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__2__Impl"


    // $ANTLR start "rule__MapDef__Group_1__3"
    // InternalEldmDslParser.g:3567:1: rule__MapDef__Group_1__3 : rule__MapDef__Group_1__3__Impl rule__MapDef__Group_1__4 ;
    public final void rule__MapDef__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3571:1: ( rule__MapDef__Group_1__3__Impl rule__MapDef__Group_1__4 )
            // InternalEldmDslParser.g:3572:2: rule__MapDef__Group_1__3__Impl rule__MapDef__Group_1__4
            {
            pushFollow(FOLLOW_32);
            rule__MapDef__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__3"


    // $ANTLR start "rule__MapDef__Group_1__3__Impl"
    // InternalEldmDslParser.g:3579:1: rule__MapDef__Group_1__3__Impl : ( ( rule__MapDef__Group_1_3__0 )? ) ;
    public final void rule__MapDef__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3583:1: ( ( ( rule__MapDef__Group_1_3__0 )? ) )
            // InternalEldmDslParser.g:3584:1: ( ( rule__MapDef__Group_1_3__0 )? )
            {
            // InternalEldmDslParser.g:3584:1: ( ( rule__MapDef__Group_1_3__0 )? )
            // InternalEldmDslParser.g:3585:2: ( rule__MapDef__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getGroup_1_3()); 
            }
            // InternalEldmDslParser.g:3586:2: ( rule__MapDef__Group_1_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEldmDslParser.g:3586:3: rule__MapDef__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapDef__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__3__Impl"


    // $ANTLR start "rule__MapDef__Group_1__4"
    // InternalEldmDslParser.g:3594:1: rule__MapDef__Group_1__4 : rule__MapDef__Group_1__4__Impl rule__MapDef__Group_1__5 ;
    public final void rule__MapDef__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3598:1: ( rule__MapDef__Group_1__4__Impl rule__MapDef__Group_1__5 )
            // InternalEldmDslParser.g:3599:2: rule__MapDef__Group_1__4__Impl rule__MapDef__Group_1__5
            {
            pushFollow(FOLLOW_33);
            rule__MapDef__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__4"


    // $ANTLR start "rule__MapDef__Group_1__4__Impl"
    // InternalEldmDslParser.g:3606:1: rule__MapDef__Group_1__4__Impl : ( RULE_END ) ;
    public final void rule__MapDef__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3610:1: ( ( RULE_END ) )
            // InternalEldmDslParser.g:3611:1: ( RULE_END )
            {
            // InternalEldmDslParser.g:3611:1: ( RULE_END )
            // InternalEldmDslParser.g:3612:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getENDTerminalRuleCall_1_4()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getENDTerminalRuleCall_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__4__Impl"


    // $ANTLR start "rule__MapDef__Group_1__5"
    // InternalEldmDslParser.g:3621:1: rule__MapDef__Group_1__5 : rule__MapDef__Group_1__5__Impl ;
    public final void rule__MapDef__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3625:1: ( rule__MapDef__Group_1__5__Impl )
            // InternalEldmDslParser.g:3626:2: rule__MapDef__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__5"


    // $ANTLR start "rule__MapDef__Group_1__5__Impl"
    // InternalEldmDslParser.g:3632:1: rule__MapDef__Group_1__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__MapDef__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3636:1: ( ( RightCurlyBracket ) )
            // InternalEldmDslParser.g:3637:1: ( RightCurlyBracket )
            {
            // InternalEldmDslParser.g:3637:1: ( RightCurlyBracket )
            // InternalEldmDslParser.g:3638:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_1_5()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1__5__Impl"


    // $ANTLR start "rule__MapDef__Group_1_3__0"
    // InternalEldmDslParser.g:3648:1: rule__MapDef__Group_1_3__0 : rule__MapDef__Group_1_3__0__Impl rule__MapDef__Group_1_3__1 ;
    public final void rule__MapDef__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3652:1: ( rule__MapDef__Group_1_3__0__Impl rule__MapDef__Group_1_3__1 )
            // InternalEldmDslParser.g:3653:2: rule__MapDef__Group_1_3__0__Impl rule__MapDef__Group_1_3__1
            {
            pushFollow(FOLLOW_34);
            rule__MapDef__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3__0"


    // $ANTLR start "rule__MapDef__Group_1_3__0__Impl"
    // InternalEldmDslParser.g:3660:1: rule__MapDef__Group_1_3__0__Impl : ( ( rule__MapDef__DefsAssignment_1_3_0 ) ) ;
    public final void rule__MapDef__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3664:1: ( ( ( rule__MapDef__DefsAssignment_1_3_0 ) ) )
            // InternalEldmDslParser.g:3665:1: ( ( rule__MapDef__DefsAssignment_1_3_0 ) )
            {
            // InternalEldmDslParser.g:3665:1: ( ( rule__MapDef__DefsAssignment_1_3_0 ) )
            // InternalEldmDslParser.g:3666:2: ( rule__MapDef__DefsAssignment_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsAssignment_1_3_0()); 
            }
            // InternalEldmDslParser.g:3667:2: ( rule__MapDef__DefsAssignment_1_3_0 )
            // InternalEldmDslParser.g:3667:3: rule__MapDef__DefsAssignment_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__DefsAssignment_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsAssignment_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3__0__Impl"


    // $ANTLR start "rule__MapDef__Group_1_3__1"
    // InternalEldmDslParser.g:3675:1: rule__MapDef__Group_1_3__1 : rule__MapDef__Group_1_3__1__Impl ;
    public final void rule__MapDef__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3679:1: ( rule__MapDef__Group_1_3__1__Impl )
            // InternalEldmDslParser.g:3680:2: rule__MapDef__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3__1"


    // $ANTLR start "rule__MapDef__Group_1_3__1__Impl"
    // InternalEldmDslParser.g:3686:1: rule__MapDef__Group_1_3__1__Impl : ( ( rule__MapDef__Group_1_3_1__0 )* ) ;
    public final void rule__MapDef__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3690:1: ( ( ( rule__MapDef__Group_1_3_1__0 )* ) )
            // InternalEldmDslParser.g:3691:1: ( ( rule__MapDef__Group_1_3_1__0 )* )
            {
            // InternalEldmDslParser.g:3691:1: ( ( rule__MapDef__Group_1_3_1__0 )* )
            // InternalEldmDslParser.g:3692:2: ( rule__MapDef__Group_1_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getGroup_1_3_1()); 
            }
            // InternalEldmDslParser.g:3693:2: ( rule__MapDef__Group_1_3_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=LineFeed && LA35_0<=CarriageReturn)||LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEldmDslParser.g:3693:3: rule__MapDef__Group_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MapDef__Group_1_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getGroup_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3__1__Impl"


    // $ANTLR start "rule__MapDef__Group_1_3_1__0"
    // InternalEldmDslParser.g:3702:1: rule__MapDef__Group_1_3_1__0 : rule__MapDef__Group_1_3_1__0__Impl rule__MapDef__Group_1_3_1__1 ;
    public final void rule__MapDef__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3706:1: ( rule__MapDef__Group_1_3_1__0__Impl rule__MapDef__Group_1_3_1__1 )
            // InternalEldmDslParser.g:3707:2: rule__MapDef__Group_1_3_1__0__Impl rule__MapDef__Group_1_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MapDef__Group_1_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3_1__0"


    // $ANTLR start "rule__MapDef__Group_1_3_1__0__Impl"
    // InternalEldmDslParser.g:3714:1: rule__MapDef__Group_1_3_1__0__Impl : ( ruleBREAK ) ;
    public final void rule__MapDef__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3718:1: ( ( ruleBREAK ) )
            // InternalEldmDslParser.g:3719:1: ( ruleBREAK )
            {
            // InternalEldmDslParser.g:3719:1: ( ruleBREAK )
            // InternalEldmDslParser.g:3720:2: ruleBREAK
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getBREAKParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBREAK();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getBREAKParserRuleCall_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__MapDef__Group_1_3_1__1"
    // InternalEldmDslParser.g:3729:1: rule__MapDef__Group_1_3_1__1 : rule__MapDef__Group_1_3_1__1__Impl ;
    public final void rule__MapDef__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3733:1: ( rule__MapDef__Group_1_3_1__1__Impl )
            // InternalEldmDslParser.g:3734:2: rule__MapDef__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__Group_1_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3_1__1"


    // $ANTLR start "rule__MapDef__Group_1_3_1__1__Impl"
    // InternalEldmDslParser.g:3740:1: rule__MapDef__Group_1_3_1__1__Impl : ( ( rule__MapDef__DefsAssignment_1_3_1_1 ) ) ;
    public final void rule__MapDef__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3744:1: ( ( ( rule__MapDef__DefsAssignment_1_3_1_1 ) ) )
            // InternalEldmDslParser.g:3745:1: ( ( rule__MapDef__DefsAssignment_1_3_1_1 ) )
            {
            // InternalEldmDslParser.g:3745:1: ( ( rule__MapDef__DefsAssignment_1_3_1_1 ) )
            // InternalEldmDslParser.g:3746:2: ( rule__MapDef__DefsAssignment_1_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsAssignment_1_3_1_1()); 
            }
            // InternalEldmDslParser.g:3747:2: ( rule__MapDef__DefsAssignment_1_3_1_1 )
            // InternalEldmDslParser.g:3747:3: rule__MapDef__DefsAssignment_1_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MapDef__DefsAssignment_1_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsAssignment_1_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__MapEntryDef__Group__0"
    // InternalEldmDslParser.g:3756:1: rule__MapEntryDef__Group__0 : rule__MapEntryDef__Group__0__Impl rule__MapEntryDef__Group__1 ;
    public final void rule__MapEntryDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3760:1: ( rule__MapEntryDef__Group__0__Impl rule__MapEntryDef__Group__1 )
            // InternalEldmDslParser.g:3761:2: rule__MapEntryDef__Group__0__Impl rule__MapEntryDef__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__MapEntryDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group__0"


    // $ANTLR start "rule__MapEntryDef__Group__0__Impl"
    // InternalEldmDslParser.g:3768:1: rule__MapEntryDef__Group__0__Impl : ( ( rule__MapEntryDef__NameAssignment_0 ) ) ;
    public final void rule__MapEntryDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3772:1: ( ( ( rule__MapEntryDef__NameAssignment_0 ) ) )
            // InternalEldmDslParser.g:3773:1: ( ( rule__MapEntryDef__NameAssignment_0 ) )
            {
            // InternalEldmDslParser.g:3773:1: ( ( rule__MapEntryDef__NameAssignment_0 ) )
            // InternalEldmDslParser.g:3774:2: ( rule__MapEntryDef__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getNameAssignment_0()); 
            }
            // InternalEldmDslParser.g:3775:2: ( rule__MapEntryDef__NameAssignment_0 )
            // InternalEldmDslParser.g:3775:3: rule__MapEntryDef__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group__0__Impl"


    // $ANTLR start "rule__MapEntryDef__Group__1"
    // InternalEldmDslParser.g:3783:1: rule__MapEntryDef__Group__1 : rule__MapEntryDef__Group__1__Impl ;
    public final void rule__MapEntryDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3787:1: ( rule__MapEntryDef__Group__1__Impl )
            // InternalEldmDslParser.g:3788:2: rule__MapEntryDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group__1"


    // $ANTLR start "rule__MapEntryDef__Group__1__Impl"
    // InternalEldmDslParser.g:3794:1: rule__MapEntryDef__Group__1__Impl : ( ( rule__MapEntryDef__Alternatives_1 ) ) ;
    public final void rule__MapEntryDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3798:1: ( ( ( rule__MapEntryDef__Alternatives_1 ) ) )
            // InternalEldmDslParser.g:3799:1: ( ( rule__MapEntryDef__Alternatives_1 ) )
            {
            // InternalEldmDslParser.g:3799:1: ( ( rule__MapEntryDef__Alternatives_1 ) )
            // InternalEldmDslParser.g:3800:2: ( rule__MapEntryDef__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getAlternatives_1()); 
            }
            // InternalEldmDslParser.g:3801:2: ( rule__MapEntryDef__Alternatives_1 )
            // InternalEldmDslParser.g:3801:3: rule__MapEntryDef__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group__1__Impl"


    // $ANTLR start "rule__MapEntryDef__Group_1_0__0"
    // InternalEldmDslParser.g:3810:1: rule__MapEntryDef__Group_1_0__0 : rule__MapEntryDef__Group_1_0__0__Impl rule__MapEntryDef__Group_1_0__1 ;
    public final void rule__MapEntryDef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3814:1: ( rule__MapEntryDef__Group_1_0__0__Impl rule__MapEntryDef__Group_1_0__1 )
            // InternalEldmDslParser.g:3815:2: rule__MapEntryDef__Group_1_0__0__Impl rule__MapEntryDef__Group_1_0__1
            {
            pushFollow(FOLLOW_36);
            rule__MapEntryDef__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_0__0"


    // $ANTLR start "rule__MapEntryDef__Group_1_0__0__Impl"
    // InternalEldmDslParser.g:3822:1: rule__MapEntryDef__Group_1_0__0__Impl : ( ( rule__MapEntryDef__OptAssignment_1_0_0 )? ) ;
    public final void rule__MapEntryDef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3826:1: ( ( ( rule__MapEntryDef__OptAssignment_1_0_0 )? ) )
            // InternalEldmDslParser.g:3827:1: ( ( rule__MapEntryDef__OptAssignment_1_0_0 )? )
            {
            // InternalEldmDslParser.g:3827:1: ( ( rule__MapEntryDef__OptAssignment_1_0_0 )? )
            // InternalEldmDslParser.g:3828:2: ( rule__MapEntryDef__OptAssignment_1_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getOptAssignment_1_0_0()); 
            }
            // InternalEldmDslParser.g:3829:2: ( rule__MapEntryDef__OptAssignment_1_0_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==QuestionMark) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEldmDslParser.g:3829:3: rule__MapEntryDef__OptAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapEntryDef__OptAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getOptAssignment_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_0__0__Impl"


    // $ANTLR start "rule__MapEntryDef__Group_1_0__1"
    // InternalEldmDslParser.g:3837:1: rule__MapEntryDef__Group_1_0__1 : rule__MapEntryDef__Group_1_0__1__Impl rule__MapEntryDef__Group_1_0__2 ;
    public final void rule__MapEntryDef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3841:1: ( rule__MapEntryDef__Group_1_0__1__Impl rule__MapEntryDef__Group_1_0__2 )
            // InternalEldmDslParser.g:3842:2: rule__MapEntryDef__Group_1_0__1__Impl rule__MapEntryDef__Group_1_0__2
            {
            pushFollow(FOLLOW_25);
            rule__MapEntryDef__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_0__1"


    // $ANTLR start "rule__MapEntryDef__Group_1_0__1__Impl"
    // InternalEldmDslParser.g:3849:1: rule__MapEntryDef__Group_1_0__1__Impl : ( Colon ) ;
    public final void rule__MapEntryDef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3853:1: ( ( Colon ) )
            // InternalEldmDslParser.g:3854:1: ( Colon )
            {
            // InternalEldmDslParser.g:3854:1: ( Colon )
            // InternalEldmDslParser.g:3855:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getColonKeyword_1_0_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getColonKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_0__1__Impl"


    // $ANTLR start "rule__MapEntryDef__Group_1_0__2"
    // InternalEldmDslParser.g:3864:1: rule__MapEntryDef__Group_1_0__2 : rule__MapEntryDef__Group_1_0__2__Impl ;
    public final void rule__MapEntryDef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3868:1: ( rule__MapEntryDef__Group_1_0__2__Impl )
            // InternalEldmDslParser.g:3869:2: rule__MapEntryDef__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_0__2"


    // $ANTLR start "rule__MapEntryDef__Group_1_0__2__Impl"
    // InternalEldmDslParser.g:3875:1: rule__MapEntryDef__Group_1_0__2__Impl : ( ( rule__MapEntryDef__TypeAssignment_1_0_2 ) ) ;
    public final void rule__MapEntryDef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3879:1: ( ( ( rule__MapEntryDef__TypeAssignment_1_0_2 ) ) )
            // InternalEldmDslParser.g:3880:1: ( ( rule__MapEntryDef__TypeAssignment_1_0_2 ) )
            {
            // InternalEldmDslParser.g:3880:1: ( ( rule__MapEntryDef__TypeAssignment_1_0_2 ) )
            // InternalEldmDslParser.g:3881:2: ( rule__MapEntryDef__TypeAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getTypeAssignment_1_0_2()); 
            }
            // InternalEldmDslParser.g:3882:2: ( rule__MapEntryDef__TypeAssignment_1_0_2 )
            // InternalEldmDslParser.g:3882:3: rule__MapEntryDef__TypeAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__TypeAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getTypeAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_0__2__Impl"


    // $ANTLR start "rule__MapEntryDef__Group_1_1__0"
    // InternalEldmDslParser.g:3891:1: rule__MapEntryDef__Group_1_1__0 : rule__MapEntryDef__Group_1_1__0__Impl rule__MapEntryDef__Group_1_1__1 ;
    public final void rule__MapEntryDef__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3895:1: ( rule__MapEntryDef__Group_1_1__0__Impl rule__MapEntryDef__Group_1_1__1 )
            // InternalEldmDslParser.g:3896:2: rule__MapEntryDef__Group_1_1__0__Impl rule__MapEntryDef__Group_1_1__1
            {
            pushFollow(FOLLOW_37);
            rule__MapEntryDef__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_1__0"


    // $ANTLR start "rule__MapEntryDef__Group_1_1__0__Impl"
    // InternalEldmDslParser.g:3903:1: rule__MapEntryDef__Group_1_1__0__Impl : ( EqualsSign ) ;
    public final void rule__MapEntryDef__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3907:1: ( ( EqualsSign ) )
            // InternalEldmDslParser.g:3908:1: ( EqualsSign )
            {
            // InternalEldmDslParser.g:3908:1: ( EqualsSign )
            // InternalEldmDslParser.g:3909:2: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getEqualsSignKeyword_1_1_0()); 
            }
            match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getEqualsSignKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_1__0__Impl"


    // $ANTLR start "rule__MapEntryDef__Group_1_1__1"
    // InternalEldmDslParser.g:3918:1: rule__MapEntryDef__Group_1_1__1 : rule__MapEntryDef__Group_1_1__1__Impl ;
    public final void rule__MapEntryDef__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3922:1: ( rule__MapEntryDef__Group_1_1__1__Impl )
            // InternalEldmDslParser.g:3923:2: rule__MapEntryDef__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_1__1"


    // $ANTLR start "rule__MapEntryDef__Group_1_1__1__Impl"
    // InternalEldmDslParser.g:3929:1: rule__MapEntryDef__Group_1_1__1__Impl : ( ( rule__MapEntryDef__ValueAssignment_1_1_1 ) ) ;
    public final void rule__MapEntryDef__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3933:1: ( ( ( rule__MapEntryDef__ValueAssignment_1_1_1 ) ) )
            // InternalEldmDslParser.g:3934:1: ( ( rule__MapEntryDef__ValueAssignment_1_1_1 ) )
            {
            // InternalEldmDslParser.g:3934:1: ( ( rule__MapEntryDef__ValueAssignment_1_1_1 ) )
            // InternalEldmDslParser.g:3935:2: ( rule__MapEntryDef__ValueAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getValueAssignment_1_1_1()); 
            }
            // InternalEldmDslParser.g:3936:2: ( rule__MapEntryDef__ValueAssignment_1_1_1 )
            // InternalEldmDslParser.g:3936:3: rule__MapEntryDef__ValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryDef__ValueAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getValueAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__Group_1_1__1__Impl"


    // $ANTLR start "rule__ListDef__Group__0"
    // InternalEldmDslParser.g:3945:1: rule__ListDef__Group__0 : rule__ListDef__Group__0__Impl rule__ListDef__Group__1 ;
    public final void rule__ListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3949:1: ( rule__ListDef__Group__0__Impl rule__ListDef__Group__1 )
            // InternalEldmDslParser.g:3950:2: rule__ListDef__Group__0__Impl rule__ListDef__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ListDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__0"


    // $ANTLR start "rule__ListDef__Group__0__Impl"
    // InternalEldmDslParser.g:3957:1: rule__ListDef__Group__0__Impl : ( () ) ;
    public final void rule__ListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3961:1: ( ( () ) )
            // InternalEldmDslParser.g:3962:1: ( () )
            {
            // InternalEldmDslParser.g:3962:1: ( () )
            // InternalEldmDslParser.g:3963:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getListDefAction_0()); 
            }
            // InternalEldmDslParser.g:3964:2: ()
            // InternalEldmDslParser.g:3964:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getListDefAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__0__Impl"


    // $ANTLR start "rule__ListDef__Group__1"
    // InternalEldmDslParser.g:3972:1: rule__ListDef__Group__1 : rule__ListDef__Group__1__Impl rule__ListDef__Group__2 ;
    public final void rule__ListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3976:1: ( rule__ListDef__Group__1__Impl rule__ListDef__Group__2 )
            // InternalEldmDslParser.g:3977:2: rule__ListDef__Group__1__Impl rule__ListDef__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ListDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__1"


    // $ANTLR start "rule__ListDef__Group__1__Impl"
    // InternalEldmDslParser.g:3984:1: rule__ListDef__Group__1__Impl : ( FullStopFullStop ) ;
    public final void rule__ListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:3988:1: ( ( FullStopFullStop ) )
            // InternalEldmDslParser.g:3989:1: ( FullStopFullStop )
            {
            // InternalEldmDslParser.g:3989:1: ( FullStopFullStop )
            // InternalEldmDslParser.g:3990:2: FullStopFullStop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getFullStopFullStopKeyword_1()); 
            }
            match(input,FullStopFullStop,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getFullStopFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__1__Impl"


    // $ANTLR start "rule__ListDef__Group__2"
    // InternalEldmDslParser.g:3999:1: rule__ListDef__Group__2 : rule__ListDef__Group__2__Impl ;
    public final void rule__ListDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4003:1: ( rule__ListDef__Group__2__Impl )
            // InternalEldmDslParser.g:4004:2: rule__ListDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__2"


    // $ANTLR start "rule__ListDef__Group__2__Impl"
    // InternalEldmDslParser.g:4010:1: rule__ListDef__Group__2__Impl : ( ( rule__ListDef__TypeAssignment_2 ) ) ;
    public final void rule__ListDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4014:1: ( ( ( rule__ListDef__TypeAssignment_2 ) ) )
            // InternalEldmDslParser.g:4015:1: ( ( rule__ListDef__TypeAssignment_2 ) )
            {
            // InternalEldmDslParser.g:4015:1: ( ( rule__ListDef__TypeAssignment_2 ) )
            // InternalEldmDslParser.g:4016:2: ( rule__ListDef__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTypeAssignment_2()); 
            }
            // InternalEldmDslParser.g:4017:2: ( rule__ListDef__TypeAssignment_2 )
            // InternalEldmDslParser.g:4017:3: rule__ListDef__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__2__Impl"


    // $ANTLR start "rule__NullLiteral__Group__0"
    // InternalEldmDslParser.g:4026:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4030:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // InternalEldmDslParser.g:4031:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__NullLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NullLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0"


    // $ANTLR start "rule__NullLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4038:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4042:1: ( ( () ) )
            // InternalEldmDslParser.g:4043:1: ( () )
            {
            // InternalEldmDslParser.g:4043:1: ( () )
            // InternalEldmDslParser.g:4044:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            }
            // InternalEldmDslParser.g:4045:2: ()
            // InternalEldmDslParser.g:4045:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0__Impl"


    // $ANTLR start "rule__NullLiteral__Group__1"
    // InternalEldmDslParser.g:4053:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4057:1: ( rule__NullLiteral__Group__1__Impl )
            // InternalEldmDslParser.g:4058:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1"


    // $ANTLR start "rule__NullLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4064:1: rule__NullLiteral__Group__1__Impl : ( Null ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4068:1: ( ( Null ) )
            // InternalEldmDslParser.g:4069:1: ( Null )
            {
            // InternalEldmDslParser.g:4069:1: ( Null )
            // InternalEldmDslParser.g:4070:2: Null
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 
            }
            match(input,Null,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__0"
    // InternalEldmDslParser.g:4080:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4084:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // InternalEldmDslParser.g:4085:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoolLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__0"


    // $ANTLR start "rule__BoolLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4092:1: rule__BoolLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4096:1: ( ( () ) )
            // InternalEldmDslParser.g:4097:1: ( () )
            {
            // InternalEldmDslParser.g:4097:1: ( () )
            // InternalEldmDslParser.g:4098:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 
            }
            // InternalEldmDslParser.g:4099:2: ()
            // InternalEldmDslParser.g:4099:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__0__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__1"
    // InternalEldmDslParser.g:4107:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4111:1: ( rule__BoolLiteral__Group__1__Impl )
            // InternalEldmDslParser.g:4112:2: rule__BoolLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__1"


    // $ANTLR start "rule__BoolLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4118:1: rule__BoolLiteral__Group__1__Impl : ( ( rule__BoolLiteral__Alternatives_1 ) ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4122:1: ( ( ( rule__BoolLiteral__Alternatives_1 ) ) )
            // InternalEldmDslParser.g:4123:1: ( ( rule__BoolLiteral__Alternatives_1 ) )
            {
            // InternalEldmDslParser.g:4123:1: ( ( rule__BoolLiteral__Alternatives_1 ) )
            // InternalEldmDslParser.g:4124:2: ( rule__BoolLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralAccess().getAlternatives_1()); 
            }
            // InternalEldmDslParser.g:4125:2: ( rule__BoolLiteral__Alternatives_1 )
            // InternalEldmDslParser.g:4125:3: rule__BoolLiteral__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolLiteral__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__1__Impl"


    // $ANTLR start "rule__DateLiteral__Group__0"
    // InternalEldmDslParser.g:4134:1: rule__DateLiteral__Group__0 : rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1 ;
    public final void rule__DateLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4138:1: ( rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1 )
            // InternalEldmDslParser.g:4139:2: rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DateLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__0"


    // $ANTLR start "rule__DateLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4146:1: rule__DateLiteral__Group__0__Impl : ( Lda_1 ) ;
    public final void rule__DateLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4150:1: ( ( Lda_1 ) )
            // InternalEldmDslParser.g:4151:1: ( Lda_1 )
            {
            // InternalEldmDslParser.g:4151:1: ( Lda_1 )
            // InternalEldmDslParser.g:4152:2: Lda_1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateLiteralAccess().getLdaKeyword_0()); 
            }
            match(input,Lda_1,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateLiteralAccess().getLdaKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__0__Impl"


    // $ANTLR start "rule__DateLiteral__Group__1"
    // InternalEldmDslParser.g:4161:1: rule__DateLiteral__Group__1 : rule__DateLiteral__Group__1__Impl ;
    public final void rule__DateLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4165:1: ( rule__DateLiteral__Group__1__Impl )
            // InternalEldmDslParser.g:4166:2: rule__DateLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__1"


    // $ANTLR start "rule__DateLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4172:1: rule__DateLiteral__Group__1__Impl : ( ( rule__DateLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DateLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4176:1: ( ( ( rule__DateLiteral__ValueAssignment_1 ) ) )
            // InternalEldmDslParser.g:4177:1: ( ( rule__DateLiteral__ValueAssignment_1 ) )
            {
            // InternalEldmDslParser.g:4177:1: ( ( rule__DateLiteral__ValueAssignment_1 ) )
            // InternalEldmDslParser.g:4178:2: ( rule__DateLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateLiteralAccess().getValueAssignment_1()); 
            }
            // InternalEldmDslParser.g:4179:2: ( rule__DateLiteral__ValueAssignment_1 )
            // InternalEldmDslParser.g:4179:3: rule__DateLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DateLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateLiteralAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__1__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__0"
    // InternalEldmDslParser.g:4188:1: rule__TimeLiteral__Group__0 : rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 ;
    public final void rule__TimeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4192:1: ( rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 )
            // InternalEldmDslParser.g:4193:2: rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TimeLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__0"


    // $ANTLR start "rule__TimeLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4200:1: rule__TimeLiteral__Group__0__Impl : ( Ltm_1 ) ;
    public final void rule__TimeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4204:1: ( ( Ltm_1 ) )
            // InternalEldmDslParser.g:4205:1: ( Ltm_1 )
            {
            // InternalEldmDslParser.g:4205:1: ( Ltm_1 )
            // InternalEldmDslParser.g:4206:2: Ltm_1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeLiteralAccess().getLtmKeyword_0()); 
            }
            match(input,Ltm_1,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeLiteralAccess().getLtmKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__0__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__1"
    // InternalEldmDslParser.g:4215:1: rule__TimeLiteral__Group__1 : rule__TimeLiteral__Group__1__Impl ;
    public final void rule__TimeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4219:1: ( rule__TimeLiteral__Group__1__Impl )
            // InternalEldmDslParser.g:4220:2: rule__TimeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__1"


    // $ANTLR start "rule__TimeLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4226:1: rule__TimeLiteral__Group__1__Impl : ( ( rule__TimeLiteral__ValueAssignment_1 ) ) ;
    public final void rule__TimeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4230:1: ( ( ( rule__TimeLiteral__ValueAssignment_1 ) ) )
            // InternalEldmDslParser.g:4231:1: ( ( rule__TimeLiteral__ValueAssignment_1 ) )
            {
            // InternalEldmDslParser.g:4231:1: ( ( rule__TimeLiteral__ValueAssignment_1 ) )
            // InternalEldmDslParser.g:4232:2: ( rule__TimeLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeLiteralAccess().getValueAssignment_1()); 
            }
            // InternalEldmDslParser.g:4233:2: ( rule__TimeLiteral__ValueAssignment_1 )
            // InternalEldmDslParser.g:4233:3: rule__TimeLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeLiteralAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__1__Impl"


    // $ANTLR start "rule__DateTimeLiteral__Group__0"
    // InternalEldmDslParser.g:4242:1: rule__DateTimeLiteral__Group__0 : rule__DateTimeLiteral__Group__0__Impl rule__DateTimeLiteral__Group__1 ;
    public final void rule__DateTimeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4246:1: ( rule__DateTimeLiteral__Group__0__Impl rule__DateTimeLiteral__Group__1 )
            // InternalEldmDslParser.g:4247:2: rule__DateTimeLiteral__Group__0__Impl rule__DateTimeLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DateTimeLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTimeLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeLiteral__Group__0"


    // $ANTLR start "rule__DateTimeLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4254:1: rule__DateTimeLiteral__Group__0__Impl : ( Ldt_1 ) ;
    public final void rule__DateTimeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4258:1: ( ( Ldt_1 ) )
            // InternalEldmDslParser.g:4259:1: ( Ldt_1 )
            {
            // InternalEldmDslParser.g:4259:1: ( Ldt_1 )
            // InternalEldmDslParser.g:4260:2: Ldt_1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeLiteralAccess().getLdtKeyword_0()); 
            }
            match(input,Ldt_1,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeLiteralAccess().getLdtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeLiteral__Group__0__Impl"


    // $ANTLR start "rule__DateTimeLiteral__Group__1"
    // InternalEldmDslParser.g:4269:1: rule__DateTimeLiteral__Group__1 : rule__DateTimeLiteral__Group__1__Impl ;
    public final void rule__DateTimeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4273:1: ( rule__DateTimeLiteral__Group__1__Impl )
            // InternalEldmDslParser.g:4274:2: rule__DateTimeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeLiteral__Group__1"


    // $ANTLR start "rule__DateTimeLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4280:1: rule__DateTimeLiteral__Group__1__Impl : ( ( rule__DateTimeLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DateTimeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4284:1: ( ( ( rule__DateTimeLiteral__ValueAssignment_1 ) ) )
            // InternalEldmDslParser.g:4285:1: ( ( rule__DateTimeLiteral__ValueAssignment_1 ) )
            {
            // InternalEldmDslParser.g:4285:1: ( ( rule__DateTimeLiteral__ValueAssignment_1 ) )
            // InternalEldmDslParser.g:4286:2: ( rule__DateTimeLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeLiteralAccess().getValueAssignment_1()); 
            }
            // InternalEldmDslParser.g:4287:2: ( rule__DateTimeLiteral__ValueAssignment_1 )
            // InternalEldmDslParser.g:4287:3: rule__DateTimeLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeLiteralAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeLiteral__Group__1__Impl"


    // $ANTLR start "rule__ListLiteral__Group__0"
    // InternalEldmDslParser.g:4296:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4300:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // InternalEldmDslParser.g:4301:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ListLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__0"


    // $ANTLR start "rule__ListLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4308:1: rule__ListLiteral__Group__0__Impl : ( () ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4312:1: ( ( () ) )
            // InternalEldmDslParser.g:4313:1: ( () )
            {
            // InternalEldmDslParser.g:4313:1: ( () )
            // InternalEldmDslParser.g:4314:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getListLiteralAction_0()); 
            }
            // InternalEldmDslParser.g:4315:2: ()
            // InternalEldmDslParser.g:4315:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getListLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__0__Impl"


    // $ANTLR start "rule__ListLiteral__Group__1"
    // InternalEldmDslParser.g:4323:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4327:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // InternalEldmDslParser.g:4328:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ListLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__1"


    // $ANTLR start "rule__ListLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4335:1: rule__ListLiteral__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4339:1: ( ( LeftSquareBracket ) )
            // InternalEldmDslParser.g:4340:1: ( LeftSquareBracket )
            {
            // InternalEldmDslParser.g:4340:1: ( LeftSquareBracket )
            // InternalEldmDslParser.g:4341:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__1__Impl"


    // $ANTLR start "rule__ListLiteral__Group__2"
    // InternalEldmDslParser.g:4350:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4354:1: ( rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 )
            // InternalEldmDslParser.g:4355:2: rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__ListLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__2"


    // $ANTLR start "rule__ListLiteral__Group__2__Impl"
    // InternalEldmDslParser.g:4362:1: rule__ListLiteral__Group__2__Impl : ( ( rule__ListLiteral__Group_2__0 )? ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4366:1: ( ( ( rule__ListLiteral__Group_2__0 )? ) )
            // InternalEldmDslParser.g:4367:1: ( ( rule__ListLiteral__Group_2__0 )? )
            {
            // InternalEldmDslParser.g:4367:1: ( ( rule__ListLiteral__Group_2__0 )? )
            // InternalEldmDslParser.g:4368:2: ( rule__ListLiteral__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getGroup_2()); 
            }
            // InternalEldmDslParser.g:4369:2: ( rule__ListLiteral__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==False||(LA37_0>=Lda_1 && LA37_0<=Ltm_1)||LA37_0==Null||LA37_0==True||(LA37_0>=CommercialAt && LA37_0<=LeftSquareBracket)||LA37_0==LeftCurlyBracket||(LA37_0>=RULE_PID && LA37_0<=RULE_ID)||(LA37_0>=RULE_NATURAL && LA37_0<=RULE_TEXT)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEldmDslParser.g:4369:3: rule__ListLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListLiteral__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__2__Impl"


    // $ANTLR start "rule__ListLiteral__Group__3"
    // InternalEldmDslParser.g:4377:1: rule__ListLiteral__Group__3 : rule__ListLiteral__Group__3__Impl ;
    public final void rule__ListLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4381:1: ( rule__ListLiteral__Group__3__Impl )
            // InternalEldmDslParser.g:4382:2: rule__ListLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__3"


    // $ANTLR start "rule__ListLiteral__Group__3__Impl"
    // InternalEldmDslParser.g:4388:1: rule__ListLiteral__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ListLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4392:1: ( ( RightSquareBracket ) )
            // InternalEldmDslParser.g:4393:1: ( RightSquareBracket )
            {
            // InternalEldmDslParser.g:4393:1: ( RightSquareBracket )
            // InternalEldmDslParser.g:4394:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group__3__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2__0"
    // InternalEldmDslParser.g:4404:1: rule__ListLiteral__Group_2__0 : rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 ;
    public final void rule__ListLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4408:1: ( rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 )
            // InternalEldmDslParser.g:4409:2: rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__ListLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__0"


    // $ANTLR start "rule__ListLiteral__Group_2__0__Impl"
    // InternalEldmDslParser.g:4416:1: rule__ListLiteral__Group_2__0__Impl : ( ( rule__ListLiteral__ValsAssignment_2_0 ) ) ;
    public final void rule__ListLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4420:1: ( ( ( rule__ListLiteral__ValsAssignment_2_0 ) ) )
            // InternalEldmDslParser.g:4421:1: ( ( rule__ListLiteral__ValsAssignment_2_0 ) )
            {
            // InternalEldmDslParser.g:4421:1: ( ( rule__ListLiteral__ValsAssignment_2_0 ) )
            // InternalEldmDslParser.g:4422:2: ( rule__ListLiteral__ValsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getValsAssignment_2_0()); 
            }
            // InternalEldmDslParser.g:4423:2: ( rule__ListLiteral__ValsAssignment_2_0 )
            // InternalEldmDslParser.g:4423:3: rule__ListLiteral__ValsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ListLiteral__ValsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getValsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2__1"
    // InternalEldmDslParser.g:4431:1: rule__ListLiteral__Group_2__1 : rule__ListLiteral__Group_2__1__Impl ;
    public final void rule__ListLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4435:1: ( rule__ListLiteral__Group_2__1__Impl )
            // InternalEldmDslParser.g:4436:2: rule__ListLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__1"


    // $ANTLR start "rule__ListLiteral__Group_2__1__Impl"
    // InternalEldmDslParser.g:4442:1: rule__ListLiteral__Group_2__1__Impl : ( ( rule__ListLiteral__Group_2_1__0 )* ) ;
    public final void rule__ListLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4446:1: ( ( ( rule__ListLiteral__Group_2_1__0 )* ) )
            // InternalEldmDslParser.g:4447:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            {
            // InternalEldmDslParser.g:4447:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            // InternalEldmDslParser.g:4448:2: ( rule__ListLiteral__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getGroup_2_1()); 
            }
            // InternalEldmDslParser.g:4449:2: ( rule__ListLiteral__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Comma) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEldmDslParser.g:4449:3: rule__ListLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ListLiteral__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2_1__0"
    // InternalEldmDslParser.g:4458:1: rule__ListLiteral__Group_2_1__0 : rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 ;
    public final void rule__ListLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4462:1: ( rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 )
            // InternalEldmDslParser.g:4463:2: rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_37);
            rule__ListLiteral__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__0"


    // $ANTLR start "rule__ListLiteral__Group_2_1__0__Impl"
    // InternalEldmDslParser.g:4470:1: rule__ListLiteral__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ListLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4474:1: ( ( Comma ) )
            // InternalEldmDslParser.g:4475:1: ( Comma )
            {
            // InternalEldmDslParser.g:4475:1: ( Comma )
            // InternalEldmDslParser.g:4476:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__0__Impl"


    // $ANTLR start "rule__ListLiteral__Group_2_1__1"
    // InternalEldmDslParser.g:4485:1: rule__ListLiteral__Group_2_1__1 : rule__ListLiteral__Group_2_1__1__Impl ;
    public final void rule__ListLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4489:1: ( rule__ListLiteral__Group_2_1__1__Impl )
            // InternalEldmDslParser.g:4490:2: rule__ListLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListLiteral__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__1"


    // $ANTLR start "rule__ListLiteral__Group_2_1__1__Impl"
    // InternalEldmDslParser.g:4496:1: rule__ListLiteral__Group_2_1__1__Impl : ( ( rule__ListLiteral__ValsAssignment_2_1_1 ) ) ;
    public final void rule__ListLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4500:1: ( ( ( rule__ListLiteral__ValsAssignment_2_1_1 ) ) )
            // InternalEldmDslParser.g:4501:1: ( ( rule__ListLiteral__ValsAssignment_2_1_1 ) )
            {
            // InternalEldmDslParser.g:4501:1: ( ( rule__ListLiteral__ValsAssignment_2_1_1 ) )
            // InternalEldmDslParser.g:4502:2: ( rule__ListLiteral__ValsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getValsAssignment_2_1_1()); 
            }
            // InternalEldmDslParser.g:4503:2: ( rule__ListLiteral__ValsAssignment_2_1_1 )
            // InternalEldmDslParser.g:4503:3: rule__ListLiteral__ValsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListLiteral__ValsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getValsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__Group_2_1__1__Impl"


    // $ANTLR start "rule__MapLiteral__Group__0"
    // InternalEldmDslParser.g:4512:1: rule__MapLiteral__Group__0 : rule__MapLiteral__Group__0__Impl rule__MapLiteral__Group__1 ;
    public final void rule__MapLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4516:1: ( rule__MapLiteral__Group__0__Impl rule__MapLiteral__Group__1 )
            // InternalEldmDslParser.g:4517:2: rule__MapLiteral__Group__0__Impl rule__MapLiteral__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MapLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__0"


    // $ANTLR start "rule__MapLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4524:1: rule__MapLiteral__Group__0__Impl : ( () ) ;
    public final void rule__MapLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4528:1: ( ( () ) )
            // InternalEldmDslParser.g:4529:1: ( () )
            {
            // InternalEldmDslParser.g:4529:1: ( () )
            // InternalEldmDslParser.g:4530:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getMapLiteralAction_0()); 
            }
            // InternalEldmDslParser.g:4531:2: ()
            // InternalEldmDslParser.g:4531:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getMapLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__0__Impl"


    // $ANTLR start "rule__MapLiteral__Group__1"
    // InternalEldmDslParser.g:4539:1: rule__MapLiteral__Group__1 : rule__MapLiteral__Group__1__Impl rule__MapLiteral__Group__2 ;
    public final void rule__MapLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4543:1: ( rule__MapLiteral__Group__1__Impl rule__MapLiteral__Group__2 )
            // InternalEldmDslParser.g:4544:2: rule__MapLiteral__Group__1__Impl rule__MapLiteral__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__MapLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__1"


    // $ANTLR start "rule__MapLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4551:1: rule__MapLiteral__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__MapLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4555:1: ( ( LeftCurlyBracket ) )
            // InternalEldmDslParser.g:4556:1: ( LeftCurlyBracket )
            {
            // InternalEldmDslParser.g:4556:1: ( LeftCurlyBracket )
            // InternalEldmDslParser.g:4557:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__1__Impl"


    // $ANTLR start "rule__MapLiteral__Group__2"
    // InternalEldmDslParser.g:4566:1: rule__MapLiteral__Group__2 : rule__MapLiteral__Group__2__Impl rule__MapLiteral__Group__3 ;
    public final void rule__MapLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4570:1: ( rule__MapLiteral__Group__2__Impl rule__MapLiteral__Group__3 )
            // InternalEldmDslParser.g:4571:2: rule__MapLiteral__Group__2__Impl rule__MapLiteral__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__MapLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__2"


    // $ANTLR start "rule__MapLiteral__Group__2__Impl"
    // InternalEldmDslParser.g:4578:1: rule__MapLiteral__Group__2__Impl : ( ( rule__MapLiteral__Group_2__0 )? ) ;
    public final void rule__MapLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4582:1: ( ( ( rule__MapLiteral__Group_2__0 )? ) )
            // InternalEldmDslParser.g:4583:1: ( ( rule__MapLiteral__Group_2__0 )? )
            {
            // InternalEldmDslParser.g:4583:1: ( ( rule__MapLiteral__Group_2__0 )? )
            // InternalEldmDslParser.g:4584:2: ( rule__MapLiteral__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getGroup_2()); 
            }
            // InternalEldmDslParser.g:4585:2: ( rule__MapLiteral__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalEldmDslParser.g:4585:3: rule__MapLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapLiteral__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__2__Impl"


    // $ANTLR start "rule__MapLiteral__Group__3"
    // InternalEldmDslParser.g:4593:1: rule__MapLiteral__Group__3 : rule__MapLiteral__Group__3__Impl ;
    public final void rule__MapLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4597:1: ( rule__MapLiteral__Group__3__Impl )
            // InternalEldmDslParser.g:4598:2: rule__MapLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__3"


    // $ANTLR start "rule__MapLiteral__Group__3__Impl"
    // InternalEldmDslParser.g:4604:1: rule__MapLiteral__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__MapLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4608:1: ( ( RightCurlyBracket ) )
            // InternalEldmDslParser.g:4609:1: ( RightCurlyBracket )
            {
            // InternalEldmDslParser.g:4609:1: ( RightCurlyBracket )
            // InternalEldmDslParser.g:4610:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group__3__Impl"


    // $ANTLR start "rule__MapLiteral__Group_2__0"
    // InternalEldmDslParser.g:4620:1: rule__MapLiteral__Group_2__0 : rule__MapLiteral__Group_2__0__Impl rule__MapLiteral__Group_2__1 ;
    public final void rule__MapLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4624:1: ( rule__MapLiteral__Group_2__0__Impl rule__MapLiteral__Group_2__1 )
            // InternalEldmDslParser.g:4625:2: rule__MapLiteral__Group_2__0__Impl rule__MapLiteral__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__MapLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2__0"


    // $ANTLR start "rule__MapLiteral__Group_2__0__Impl"
    // InternalEldmDslParser.g:4632:1: rule__MapLiteral__Group_2__0__Impl : ( ( rule__MapLiteral__EntriesAssignment_2_0 ) ) ;
    public final void rule__MapLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4636:1: ( ( ( rule__MapLiteral__EntriesAssignment_2_0 ) ) )
            // InternalEldmDslParser.g:4637:1: ( ( rule__MapLiteral__EntriesAssignment_2_0 ) )
            {
            // InternalEldmDslParser.g:4637:1: ( ( rule__MapLiteral__EntriesAssignment_2_0 ) )
            // InternalEldmDslParser.g:4638:2: ( rule__MapLiteral__EntriesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getEntriesAssignment_2_0()); 
            }
            // InternalEldmDslParser.g:4639:2: ( rule__MapLiteral__EntriesAssignment_2_0 )
            // InternalEldmDslParser.g:4639:3: rule__MapLiteral__EntriesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MapLiteral__EntriesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getEntriesAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__MapLiteral__Group_2__1"
    // InternalEldmDslParser.g:4647:1: rule__MapLiteral__Group_2__1 : rule__MapLiteral__Group_2__1__Impl ;
    public final void rule__MapLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4651:1: ( rule__MapLiteral__Group_2__1__Impl )
            // InternalEldmDslParser.g:4652:2: rule__MapLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2__1"


    // $ANTLR start "rule__MapLiteral__Group_2__1__Impl"
    // InternalEldmDslParser.g:4658:1: rule__MapLiteral__Group_2__1__Impl : ( ( rule__MapLiteral__Group_2_1__0 )* ) ;
    public final void rule__MapLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4662:1: ( ( ( rule__MapLiteral__Group_2_1__0 )* ) )
            // InternalEldmDslParser.g:4663:1: ( ( rule__MapLiteral__Group_2_1__0 )* )
            {
            // InternalEldmDslParser.g:4663:1: ( ( rule__MapLiteral__Group_2_1__0 )* )
            // InternalEldmDslParser.g:4664:2: ( rule__MapLiteral__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getGroup_2_1()); 
            }
            // InternalEldmDslParser.g:4665:2: ( rule__MapLiteral__Group_2_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalEldmDslParser.g:4665:3: rule__MapLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MapLiteral__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__MapLiteral__Group_2_1__0"
    // InternalEldmDslParser.g:4674:1: rule__MapLiteral__Group_2_1__0 : rule__MapLiteral__Group_2_1__0__Impl rule__MapLiteral__Group_2_1__1 ;
    public final void rule__MapLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4678:1: ( rule__MapLiteral__Group_2_1__0__Impl rule__MapLiteral__Group_2_1__1 )
            // InternalEldmDslParser.g:4679:2: rule__MapLiteral__Group_2_1__0__Impl rule__MapLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MapLiteral__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2_1__0"


    // $ANTLR start "rule__MapLiteral__Group_2_1__0__Impl"
    // InternalEldmDslParser.g:4686:1: rule__MapLiteral__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__MapLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4690:1: ( ( Comma ) )
            // InternalEldmDslParser.g:4691:1: ( Comma )
            {
            // InternalEldmDslParser.g:4691:1: ( Comma )
            // InternalEldmDslParser.g:4692:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2_1__0__Impl"


    // $ANTLR start "rule__MapLiteral__Group_2_1__1"
    // InternalEldmDslParser.g:4701:1: rule__MapLiteral__Group_2_1__1 : rule__MapLiteral__Group_2_1__1__Impl ;
    public final void rule__MapLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4705:1: ( rule__MapLiteral__Group_2_1__1__Impl )
            // InternalEldmDslParser.g:4706:2: rule__MapLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapLiteral__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2_1__1"


    // $ANTLR start "rule__MapLiteral__Group_2_1__1__Impl"
    // InternalEldmDslParser.g:4712:1: rule__MapLiteral__Group_2_1__1__Impl : ( ( rule__MapLiteral__EntriesAssignment_2_1_1 ) ) ;
    public final void rule__MapLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4716:1: ( ( ( rule__MapLiteral__EntriesAssignment_2_1_1 ) ) )
            // InternalEldmDslParser.g:4717:1: ( ( rule__MapLiteral__EntriesAssignment_2_1_1 ) )
            {
            // InternalEldmDslParser.g:4717:1: ( ( rule__MapLiteral__EntriesAssignment_2_1_1 ) )
            // InternalEldmDslParser.g:4718:2: ( rule__MapLiteral__EntriesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getEntriesAssignment_2_1_1()); 
            }
            // InternalEldmDslParser.g:4719:2: ( rule__MapLiteral__EntriesAssignment_2_1_1 )
            // InternalEldmDslParser.g:4719:3: rule__MapLiteral__EntriesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MapLiteral__EntriesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getEntriesAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__Group_2_1__1__Impl"


    // $ANTLR start "rule__MapEntryLiteral__Group__0"
    // InternalEldmDslParser.g:4728:1: rule__MapEntryLiteral__Group__0 : rule__MapEntryLiteral__Group__0__Impl rule__MapEntryLiteral__Group__1 ;
    public final void rule__MapEntryLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4732:1: ( rule__MapEntryLiteral__Group__0__Impl rule__MapEntryLiteral__Group__1 )
            // InternalEldmDslParser.g:4733:2: rule__MapEntryLiteral__Group__0__Impl rule__MapEntryLiteral__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__MapEntryLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapEntryLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__Group__0"


    // $ANTLR start "rule__MapEntryLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4740:1: rule__MapEntryLiteral__Group__0__Impl : ( ( rule__MapEntryLiteral__NameAssignment_0 ) ) ;
    public final void rule__MapEntryLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4744:1: ( ( ( rule__MapEntryLiteral__NameAssignment_0 ) ) )
            // InternalEldmDslParser.g:4745:1: ( ( rule__MapEntryLiteral__NameAssignment_0 ) )
            {
            // InternalEldmDslParser.g:4745:1: ( ( rule__MapEntryLiteral__NameAssignment_0 ) )
            // InternalEldmDslParser.g:4746:2: ( rule__MapEntryLiteral__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryLiteralAccess().getNameAssignment_0()); 
            }
            // InternalEldmDslParser.g:4747:2: ( rule__MapEntryLiteral__NameAssignment_0 )
            // InternalEldmDslParser.g:4747:3: rule__MapEntryLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryLiteral__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryLiteralAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__Group__0__Impl"


    // $ANTLR start "rule__MapEntryLiteral__Group__1"
    // InternalEldmDslParser.g:4755:1: rule__MapEntryLiteral__Group__1 : rule__MapEntryLiteral__Group__1__Impl rule__MapEntryLiteral__Group__2 ;
    public final void rule__MapEntryLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4759:1: ( rule__MapEntryLiteral__Group__1__Impl rule__MapEntryLiteral__Group__2 )
            // InternalEldmDslParser.g:4760:2: rule__MapEntryLiteral__Group__1__Impl rule__MapEntryLiteral__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__MapEntryLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapEntryLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__Group__1"


    // $ANTLR start "rule__MapEntryLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4767:1: rule__MapEntryLiteral__Group__1__Impl : ( Colon ) ;
    public final void rule__MapEntryLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4771:1: ( ( Colon ) )
            // InternalEldmDslParser.g:4772:1: ( Colon )
            {
            // InternalEldmDslParser.g:4772:1: ( Colon )
            // InternalEldmDslParser.g:4773:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__Group__1__Impl"


    // $ANTLR start "rule__MapEntryLiteral__Group__2"
    // InternalEldmDslParser.g:4782:1: rule__MapEntryLiteral__Group__2 : rule__MapEntryLiteral__Group__2__Impl ;
    public final void rule__MapEntryLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4786:1: ( rule__MapEntryLiteral__Group__2__Impl )
            // InternalEldmDslParser.g:4787:2: rule__MapEntryLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__Group__2"


    // $ANTLR start "rule__MapEntryLiteral__Group__2__Impl"
    // InternalEldmDslParser.g:4793:1: rule__MapEntryLiteral__Group__2__Impl : ( ( rule__MapEntryLiteral__ValueAssignment_2 ) ) ;
    public final void rule__MapEntryLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4797:1: ( ( ( rule__MapEntryLiteral__ValueAssignment_2 ) ) )
            // InternalEldmDslParser.g:4798:1: ( ( rule__MapEntryLiteral__ValueAssignment_2 ) )
            {
            // InternalEldmDslParser.g:4798:1: ( ( rule__MapEntryLiteral__ValueAssignment_2 ) )
            // InternalEldmDslParser.g:4799:2: ( rule__MapEntryLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryLiteralAccess().getValueAssignment_2()); 
            }
            // InternalEldmDslParser.g:4800:2: ( rule__MapEntryLiteral__ValueAssignment_2 )
            // InternalEldmDslParser.g:4800:3: rule__MapEntryLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MapEntryLiteral__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryLiteralAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__Group__2__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__0"
    // InternalEldmDslParser.g:4809:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4813:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalEldmDslParser.g:4814:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EnumLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__0"


    // $ANTLR start "rule__EnumLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4821:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4825:1: ( ( () ) )
            // InternalEldmDslParser.g:4826:1: ( () )
            {
            // InternalEldmDslParser.g:4826:1: ( () )
            // InternalEldmDslParser.g:4827:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            }
            // InternalEldmDslParser.g:4828:2: ()
            // InternalEldmDslParser.g:4828:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__1"
    // InternalEldmDslParser.g:4836:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4840:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalEldmDslParser.g:4841:2: rule__EnumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__1"


    // $ANTLR start "rule__EnumLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4847:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__RefAssignment_1 ) ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4851:1: ( ( ( rule__EnumLiteral__RefAssignment_1 ) ) )
            // InternalEldmDslParser.g:4852:1: ( ( rule__EnumLiteral__RefAssignment_1 ) )
            {
            // InternalEldmDslParser.g:4852:1: ( ( rule__EnumLiteral__RefAssignment_1 ) )
            // InternalEldmDslParser.g:4853:2: ( rule__EnumLiteral__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getRefAssignment_1()); 
            }
            // InternalEldmDslParser.g:4854:2: ( rule__EnumLiteral__RefAssignment_1 )
            // InternalEldmDslParser.g:4854:3: rule__EnumLiteral__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getRefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__PatternLiteral__Group__0"
    // InternalEldmDslParser.g:4863:1: rule__PatternLiteral__Group__0 : rule__PatternLiteral__Group__0__Impl rule__PatternLiteral__Group__1 ;
    public final void rule__PatternLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4867:1: ( rule__PatternLiteral__Group__0__Impl rule__PatternLiteral__Group__1 )
            // InternalEldmDslParser.g:4868:2: rule__PatternLiteral__Group__0__Impl rule__PatternLiteral__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__PatternLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__0"


    // $ANTLR start "rule__PatternLiteral__Group__0__Impl"
    // InternalEldmDslParser.g:4875:1: rule__PatternLiteral__Group__0__Impl : ( () ) ;
    public final void rule__PatternLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4879:1: ( ( () ) )
            // InternalEldmDslParser.g:4880:1: ( () )
            {
            // InternalEldmDslParser.g:4880:1: ( () )
            // InternalEldmDslParser.g:4881:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0()); 
            }
            // InternalEldmDslParser.g:4882:2: ()
            // InternalEldmDslParser.g:4882:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__0__Impl"


    // $ANTLR start "rule__PatternLiteral__Group__1"
    // InternalEldmDslParser.g:4890:1: rule__PatternLiteral__Group__1 : rule__PatternLiteral__Group__1__Impl rule__PatternLiteral__Group__2 ;
    public final void rule__PatternLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4894:1: ( rule__PatternLiteral__Group__1__Impl rule__PatternLiteral__Group__2 )
            // InternalEldmDslParser.g:4895:2: rule__PatternLiteral__Group__1__Impl rule__PatternLiteral__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__PatternLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__1"


    // $ANTLR start "rule__PatternLiteral__Group__1__Impl"
    // InternalEldmDslParser.g:4902:1: rule__PatternLiteral__Group__1__Impl : ( ( rule__PatternLiteral__RefAssignment_1 )? ) ;
    public final void rule__PatternLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4906:1: ( ( ( rule__PatternLiteral__RefAssignment_1 )? ) )
            // InternalEldmDslParser.g:4907:1: ( ( rule__PatternLiteral__RefAssignment_1 )? )
            {
            // InternalEldmDslParser.g:4907:1: ( ( rule__PatternLiteral__RefAssignment_1 )? )
            // InternalEldmDslParser.g:4908:2: ( rule__PatternLiteral__RefAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralAccess().getRefAssignment_1()); 
            }
            // InternalEldmDslParser.g:4909:2: ( rule__PatternLiteral__RefAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEldmDslParser.g:4909:3: rule__PatternLiteral__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternLiteral__RefAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralAccess().getRefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__1__Impl"


    // $ANTLR start "rule__PatternLiteral__Group__2"
    // InternalEldmDslParser.g:4917:1: rule__PatternLiteral__Group__2 : rule__PatternLiteral__Group__2__Impl rule__PatternLiteral__Group__3 ;
    public final void rule__PatternLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4921:1: ( rule__PatternLiteral__Group__2__Impl rule__PatternLiteral__Group__3 )
            // InternalEldmDslParser.g:4922:2: rule__PatternLiteral__Group__2__Impl rule__PatternLiteral__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__PatternLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__2"


    // $ANTLR start "rule__PatternLiteral__Group__2__Impl"
    // InternalEldmDslParser.g:4929:1: rule__PatternLiteral__Group__2__Impl : ( CommercialAt ) ;
    public final void rule__PatternLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4933:1: ( ( CommercialAt ) )
            // InternalEldmDslParser.g:4934:1: ( CommercialAt )
            {
            // InternalEldmDslParser.g:4934:1: ( CommercialAt )
            // InternalEldmDslParser.g:4935:2: CommercialAt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2()); 
            }
            match(input,CommercialAt,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__2__Impl"


    // $ANTLR start "rule__PatternLiteral__Group__3"
    // InternalEldmDslParser.g:4944:1: rule__PatternLiteral__Group__3 : rule__PatternLiteral__Group__3__Impl ;
    public final void rule__PatternLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4948:1: ( rule__PatternLiteral__Group__3__Impl )
            // InternalEldmDslParser.g:4949:2: rule__PatternLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__3"


    // $ANTLR start "rule__PatternLiteral__Group__3__Impl"
    // InternalEldmDslParser.g:4955:1: rule__PatternLiteral__Group__3__Impl : ( RULE_TEXT ) ;
    public final void rule__PatternLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4959:1: ( ( RULE_TEXT ) )
            // InternalEldmDslParser.g:4960:1: ( RULE_TEXT )
            {
            // InternalEldmDslParser.g:4960:1: ( RULE_TEXT )
            // InternalEldmDslParser.g:4961:2: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralAccess().getTEXTTerminalRuleCall_3()); 
            }
            match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralAccess().getTEXTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__Group__3__Impl"


    // $ANTLR start "rule__Path__Group__0"
    // InternalEldmDslParser.g:4971:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4975:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // InternalEldmDslParser.g:4976:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Path__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Path__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // InternalEldmDslParser.g:4983:1: rule__Path__Group__0__Impl : ( RULE_PID ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:4987:1: ( ( RULE_PID ) )
            // InternalEldmDslParser.g:4988:1: ( RULE_PID )
            {
            // InternalEldmDslParser.g:4988:1: ( RULE_PID )
            // InternalEldmDslParser.g:4989:2: RULE_PID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getPIDTerminalRuleCall_0()); 
            }
            match(input,RULE_PID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getPIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // InternalEldmDslParser.g:4998:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5002:1: ( rule__Path__Group__1__Impl )
            // InternalEldmDslParser.g:5003:2: rule__Path__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // InternalEldmDslParser.g:5009:1: rule__Path__Group__1__Impl : ( ( RULE_PID )* ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5013:1: ( ( ( RULE_PID )* ) )
            // InternalEldmDslParser.g:5014:1: ( ( RULE_PID )* )
            {
            // InternalEldmDslParser.g:5014:1: ( ( RULE_PID )* )
            // InternalEldmDslParser.g:5015:2: ( RULE_PID )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getPIDTerminalRuleCall_1()); 
            }
            // InternalEldmDslParser.g:5016:2: ( RULE_PID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_PID) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred63_InternalEldmDslParser()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalEldmDslParser.g:5016:3: RULE_PID
            	    {
            	    match(input,RULE_PID,FOLLOW_43); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getPIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__0"
    // InternalEldmDslParser.g:5025:1: rule__QualifiedNameInStaticImport__Group__0 : rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 ;
    public final void rule__QualifiedNameInStaticImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5029:1: ( rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 )
            // InternalEldmDslParser.g:5030:2: rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__QualifiedNameInStaticImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameInStaticImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__0"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__0__Impl"
    // InternalEldmDslParser.g:5037:1: rule__QualifiedNameInStaticImport__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedNameInStaticImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5041:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5042:1: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5042:1: ( RULE_ID )
            // InternalEldmDslParser.g:5043:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__1"
    // InternalEldmDslParser.g:5052:1: rule__QualifiedNameInStaticImport__Group__1 : rule__QualifiedNameInStaticImport__Group__1__Impl ;
    public final void rule__QualifiedNameInStaticImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5056:1: ( rule__QualifiedNameInStaticImport__Group__1__Impl )
            // InternalEldmDslParser.g:5057:2: rule__QualifiedNameInStaticImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameInStaticImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__1"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__1__Impl"
    // InternalEldmDslParser.g:5063:1: rule__QualifiedNameInStaticImport__Group__1__Impl : ( FullStop ) ;
    public final void rule__QualifiedNameInStaticImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5067:1: ( ( FullStop ) )
            // InternalEldmDslParser.g:5068:1: ( FullStop )
            {
            // InternalEldmDslParser.g:5068:1: ( FullStop )
            // InternalEldmDslParser.g:5069:2: FullStop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }
            match(input,FullStop,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalEldmDslParser.g:5079:1: rule__Module__NameAssignment_1 : ( rulePath ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5083:1: ( ( rulePath ) )
            // InternalEldmDslParser.g:5084:2: ( rulePath )
            {
            // InternalEldmDslParser.g:5084:2: ( rulePath )
            // InternalEldmDslParser.g:5085:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getNamePathParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getNamePathParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__ImportsAssignment_2"
    // InternalEldmDslParser.g:5094:1: rule__Module__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5098:1: ( ( ruleImport ) )
            // InternalEldmDslParser.g:5099:2: ( ruleImport )
            {
            // InternalEldmDslParser.g:5099:2: ( ruleImport )
            // InternalEldmDslParser.g:5100:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ImportsAssignment_2"


    // $ANTLR start "rule__Module__PlugsAssignment_3"
    // InternalEldmDslParser.g:5109:1: rule__Module__PlugsAssignment_3 : ( rulePlugDsl ) ;
    public final void rule__Module__PlugsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5113:1: ( ( rulePlugDsl ) )
            // InternalEldmDslParser.g:5114:2: ( rulePlugDsl )
            {
            // InternalEldmDslParser.g:5114:2: ( rulePlugDsl )
            // InternalEldmDslParser.g:5115:3: rulePlugDsl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPlugsPlugDslParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlugDsl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getPlugsPlugDslParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__PlugsAssignment_3"


    // $ANTLR start "rule__Module__DefsAssignment_4_2"
    // InternalEldmDslParser.g:5124:1: rule__Module__DefsAssignment_4_2 : ( ruleDefinition ) ;
    public final void rule__Module__DefsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5128:1: ( ( ruleDefinition ) )
            // InternalEldmDslParser.g:5129:2: ( ruleDefinition )
            {
            // InternalEldmDslParser.g:5129:2: ( ruleDefinition )
            // InternalEldmDslParser.g:5130:3: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getDefsDefinitionParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getDefsDefinitionParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__DefsAssignment_4_2"


    // $ANTLR start "rule__Module__OpersAssignment_5"
    // InternalEldmDslParser.g:5139:1: rule__Module__OpersAssignment_5 : ( ruleOperation ) ;
    public final void rule__Module__OpersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5143:1: ( ( ruleOperation ) )
            // InternalEldmDslParser.g:5144:2: ( ruleOperation )
            {
            // InternalEldmDslParser.g:5144:2: ( ruleOperation )
            // InternalEldmDslParser.g:5145:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getOpersOperationParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getOpersOperationParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__OpersAssignment_5"


    // $ANTLR start "rule__Module__PathsAssignment_6"
    // InternalEldmDslParser.g:5154:1: rule__Module__PathsAssignment_6 : ( ruleSubPath ) ;
    public final void rule__Module__PathsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5158:1: ( ( ruleSubPath ) )
            // InternalEldmDslParser.g:5159:2: ( ruleSubPath )
            {
            // InternalEldmDslParser.g:5159:2: ( ruleSubPath )
            // InternalEldmDslParser.g:5160:3: ruleSubPath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPathsSubPathParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubPath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getPathsSubPathParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__PathsAssignment_6"


    // $ANTLR start "rule__PlugDsl__NameAssignment_1"
    // InternalEldmDslParser.g:5169:1: rule__PlugDsl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PlugDsl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5173:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5174:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5174:2: ( RULE_ID )
            // InternalEldmDslParser.g:5175:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlugDslAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlugDslAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__NameAssignment_1"


    // $ANTLR start "rule__PlugDsl__AdaptorAssignment_2"
    // InternalEldmDslParser.g:5184:1: rule__PlugDsl__AdaptorAssignment_2 : ( rulePatternLiteral ) ;
    public final void rule__PlugDsl__AdaptorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5188:1: ( ( rulePatternLiteral ) )
            // InternalEldmDslParser.g:5189:2: ( rulePatternLiteral )
            {
            // InternalEldmDslParser.g:5189:2: ( rulePatternLiteral )
            // InternalEldmDslParser.g:5190:3: rulePatternLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlugDslAccess().getAdaptorPatternLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePatternLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlugDslAccess().getAdaptorPatternLiteralParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlugDsl__AdaptorAssignment_2"


    // $ANTLR start "rule__ImportOperation__NameAssignment_0"
    // InternalEldmDslParser.g:5199:1: rule__ImportOperation__NameAssignment_0 : ( rulePath ) ;
    public final void rule__ImportOperation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5203:1: ( ( rulePath ) )
            // InternalEldmDslParser.g:5204:2: ( rulePath )
            {
            // InternalEldmDslParser.g:5204:2: ( rulePath )
            // InternalEldmDslParser.g:5205:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportOperationAccess().getNamePathParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportOperationAccess().getNamePathParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__NameAssignment_0"


    // $ANTLR start "rule__ImportOperation__ModuleAssignment_2"
    // InternalEldmDslParser.g:5214:1: rule__ImportOperation__ModuleAssignment_2 : ( ruleExternalModule ) ;
    public final void rule__ImportOperation__ModuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5218:1: ( ( ruleExternalModule ) )
            // InternalEldmDslParser.g:5219:2: ( ruleExternalModule )
            {
            // InternalEldmDslParser.g:5219:2: ( ruleExternalModule )
            // InternalEldmDslParser.g:5220:3: ruleExternalModule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportOperationAccess().getModuleExternalModuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExternalModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportOperationAccess().getModuleExternalModuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportOperation__ModuleAssignment_2"


    // $ANTLR start "rule__ImportDefinition__DefsAssignment_0_0"
    // InternalEldmDslParser.g:5229:1: rule__ImportDefinition__DefsAssignment_0_0 : ( ruleExternalDef ) ;
    public final void rule__ImportDefinition__DefsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5233:1: ( ( ruleExternalDef ) )
            // InternalEldmDslParser.g:5234:2: ( ruleExternalDef )
            {
            // InternalEldmDslParser.g:5234:2: ( ruleExternalDef )
            // InternalEldmDslParser.g:5235:3: ruleExternalDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getDefsExternalDefParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExternalDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getDefsExternalDefParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__DefsAssignment_0_0"


    // $ANTLR start "rule__ImportDefinition__DefsAssignment_0_1_1"
    // InternalEldmDslParser.g:5244:1: rule__ImportDefinition__DefsAssignment_0_1_1 : ( ruleExternalDef ) ;
    public final void rule__ImportDefinition__DefsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5248:1: ( ( ruleExternalDef ) )
            // InternalEldmDslParser.g:5249:2: ( ruleExternalDef )
            {
            // InternalEldmDslParser.g:5249:2: ( ruleExternalDef )
            // InternalEldmDslParser.g:5250:3: ruleExternalDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getDefsExternalDefParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExternalDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getDefsExternalDefParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__DefsAssignment_0_1_1"


    // $ANTLR start "rule__ImportDefinition__ModuleAssignment_2"
    // InternalEldmDslParser.g:5259:1: rule__ImportDefinition__ModuleAssignment_2 : ( ruleExternalModule ) ;
    public final void rule__ImportDefinition__ModuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5263:1: ( ( ruleExternalModule ) )
            // InternalEldmDslParser.g:5264:2: ( ruleExternalModule )
            {
            // InternalEldmDslParser.g:5264:2: ( ruleExternalModule )
            // InternalEldmDslParser.g:5265:3: ruleExternalModule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportDefinitionAccess().getModuleExternalModuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExternalModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportDefinitionAccess().getModuleExternalModuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDefinition__ModuleAssignment_2"


    // $ANTLR start "rule__ExternalDef__RefAssignment_0_0"
    // InternalEldmDslParser.g:5274:1: rule__ExternalDef__RefAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ExternalDef__RefAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5278:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5279:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5279:2: ( RULE_ID )
            // InternalEldmDslParser.g:5280:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getRefIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getRefIDTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__RefAssignment_0_0"


    // $ANTLR start "rule__ExternalDef__NameAssignment_0_1_1"
    // InternalEldmDslParser.g:5289:1: rule__ExternalDef__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__ExternalDef__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5293:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5294:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5294:2: ( RULE_ID )
            // InternalEldmDslParser.g:5295:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__NameAssignment_0_1_1"


    // $ANTLR start "rule__ExternalDef__NameAssignment_1"
    // InternalEldmDslParser.g:5304:1: rule__ExternalDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5308:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5309:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5309:2: ( RULE_ID )
            // InternalEldmDslParser.g:5310:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__NameAssignment_1"


    // $ANTLR start "rule__ExternalModule__RefAssignment_0"
    // InternalEldmDslParser.g:5319:1: rule__ExternalModule__RefAssignment_0 : ( rulePath ) ;
    public final void rule__ExternalModule__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5323:1: ( ( rulePath ) )
            // InternalEldmDslParser.g:5324:2: ( rulePath )
            {
            // InternalEldmDslParser.g:5324:2: ( rulePath )
            // InternalEldmDslParser.g:5325:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalModuleAccess().getRefPathParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalModuleAccess().getRefPathParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__RefAssignment_0"


    // $ANTLR start "rule__ExternalModule__JavaRefAssignment_1_0"
    // InternalEldmDslParser.g:5334:1: rule__ExternalModule__JavaRefAssignment_1_0 : ( ( ruleQualifiedNameInStaticImport ) ) ;
    public final void rule__ExternalModule__JavaRefAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5338:1: ( ( ( ruleQualifiedNameInStaticImport ) ) )
            // InternalEldmDslParser.g:5339:2: ( ( ruleQualifiedNameInStaticImport ) )
            {
            // InternalEldmDslParser.g:5339:2: ( ( ruleQualifiedNameInStaticImport ) )
            // InternalEldmDslParser.g:5340:3: ( ruleQualifiedNameInStaticImport )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalModuleAccess().getJavaRefJvmDeclaredTypeCrossReference_1_0_0()); 
            }
            // InternalEldmDslParser.g:5341:3: ( ruleQualifiedNameInStaticImport )
            // InternalEldmDslParser.g:5342:4: ruleQualifiedNameInStaticImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalModuleAccess().getJavaRefJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_1_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalModuleAccess().getJavaRefJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalModuleAccess().getJavaRefJvmDeclaredTypeCrossReference_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__JavaRefAssignment_1_0"


    // $ANTLR start "rule__SubPath__NameAssignment_1"
    // InternalEldmDslParser.g:5353:1: rule__SubPath__NameAssignment_1 : ( rulePath ) ;
    public final void rule__SubPath__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5357:1: ( ( rulePath ) )
            // InternalEldmDslParser.g:5358:2: ( rulePath )
            {
            // InternalEldmDslParser.g:5358:2: ( rulePath )
            // InternalEldmDslParser.g:5359:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getNamePathParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getNamePathParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__NameAssignment_1"


    // $ANTLR start "rule__SubPath__OpersAssignment_3"
    // InternalEldmDslParser.g:5368:1: rule__SubPath__OpersAssignment_3 : ( ruleOperation ) ;
    public final void rule__SubPath__OpersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5372:1: ( ( ruleOperation ) )
            // InternalEldmDslParser.g:5373:2: ( ruleOperation )
            {
            // InternalEldmDslParser.g:5373:2: ( ruleOperation )
            // InternalEldmDslParser.g:5374:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathAccess().getOpersOperationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathAccess().getOpersOperationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPath__OpersAssignment_3"


    // $ANTLR start "rule__Operation__IsGetAssignment_1_0"
    // InternalEldmDslParser.g:5383:1: rule__Operation__IsGetAssignment_1_0 : ( ( Get ) ) ;
    public final void rule__Operation__IsGetAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5387:1: ( ( ( Get ) ) )
            // InternalEldmDslParser.g:5388:2: ( ( Get ) )
            {
            // InternalEldmDslParser.g:5388:2: ( ( Get ) )
            // InternalEldmDslParser.g:5389:3: ( Get )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getIsGetGetKeyword_1_0_0()); 
            }
            // InternalEldmDslParser.g:5390:3: ( Get )
            // InternalEldmDslParser.g:5391:4: Get
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getIsGetGetKeyword_1_0_0()); 
            }
            match(input,Get,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getIsGetGetKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getIsGetGetKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__IsGetAssignment_1_0"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // InternalEldmDslParser.g:5402:1: rule__Operation__NameAssignment_2 : ( rulePath ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5406:1: ( ( rulePath ) )
            // InternalEldmDslParser.g:5407:2: ( rulePath )
            {
            // InternalEldmDslParser.g:5407:2: ( rulePath )
            // InternalEldmDslParser.g:5408:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNamePathParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNamePathParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ParamAssignment_3"
    // InternalEldmDslParser.g:5417:1: rule__Operation__ParamAssignment_3 : ( ruleParamDef ) ;
    public final void rule__Operation__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5421:1: ( ( ruleParamDef ) )
            // InternalEldmDslParser.g:5422:2: ( ruleParamDef )
            {
            // InternalEldmDslParser.g:5422:2: ( ruleParamDef )
            // InternalEldmDslParser.g:5423:3: ruleParamDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParamParamDefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParamParamDefParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParamAssignment_3"


    // $ANTLR start "rule__Operation__ResultAssignment_4_1"
    // InternalEldmDslParser.g:5432:1: rule__Operation__ResultAssignment_4_1 : ( ruleElementTypeDef ) ;
    public final void rule__Operation__ResultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5436:1: ( ( ruleElementTypeDef ) )
            // InternalEldmDslParser.g:5437:2: ( ruleElementTypeDef )
            {
            // InternalEldmDslParser.g:5437:2: ( ruleElementTypeDef )
            // InternalEldmDslParser.g:5438:3: ruleElementTypeDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getResultElementTypeDefParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementTypeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getResultElementTypeDefParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ResultAssignment_4_1"


    // $ANTLR start "rule__Operation__BodyAssignment_6"
    // InternalEldmDslParser.g:5447:1: rule__Operation__BodyAssignment_6 : ( ruleBlockExpression ) ;
    public final void rule__Operation__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5451:1: ( ( ruleBlockExpression ) )
            // InternalEldmDslParser.g:5452:2: ( ruleBlockExpression )
            {
            // InternalEldmDslParser.g:5452:2: ( ruleBlockExpression )
            // InternalEldmDslParser.g:5453:3: ruleBlockExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getBodyBlockExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getBodyBlockExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__BodyAssignment_6"


    // $ANTLR start "rule__ParamDef__DefAssignment_0"
    // InternalEldmDslParser.g:5462:1: rule__ParamDef__DefAssignment_0 : ( ruleMapDef ) ;
    public final void rule__ParamDef__DefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5466:1: ( ( ruleMapDef ) )
            // InternalEldmDslParser.g:5467:2: ( ruleMapDef )
            {
            // InternalEldmDslParser.g:5467:2: ( ruleMapDef )
            // InternalEldmDslParser.g:5468:3: ruleMapDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamDefAccess().getDefMapDefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamDefAccess().getDefMapDefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDef__DefAssignment_0"


    // $ANTLR start "rule__ParamDef__RefAssignment_1"
    // InternalEldmDslParser.g:5477:1: rule__ParamDef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParamDef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5481:1: ( ( ( RULE_ID ) ) )
            // InternalEldmDslParser.g:5482:2: ( ( RULE_ID ) )
            {
            // InternalEldmDslParser.g:5482:2: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5483:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamDefAccess().getRefMapDefCrossReference_1_0()); 
            }
            // InternalEldmDslParser.g:5484:3: ( RULE_ID )
            // InternalEldmDslParser.g:5485:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamDefAccess().getRefMapDefIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamDefAccess().getRefMapDefIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamDefAccess().getRefMapDefCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDef__RefAssignment_1"


    // $ANTLR start "rule__TypeDef__NameAssignment_1"
    // InternalEldmDslParser.g:5496:1: rule__TypeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5500:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5501:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5501:2: ( RULE_ID )
            // InternalEldmDslParser.g:5502:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__NameAssignment_1"


    // $ANTLR start "rule__TypeDef__ParserAssignment_2_0_0"
    // InternalEldmDslParser.g:5511:1: rule__TypeDef__ParserAssignment_2_0_0 : ( ( rule__TypeDef__ParserAlternatives_2_0_0_0 ) ) ;
    public final void rule__TypeDef__ParserAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5515:1: ( ( ( rule__TypeDef__ParserAlternatives_2_0_0_0 ) ) )
            // InternalEldmDslParser.g:5516:2: ( ( rule__TypeDef__ParserAlternatives_2_0_0_0 ) )
            {
            // InternalEldmDslParser.g:5516:2: ( ( rule__TypeDef__ParserAlternatives_2_0_0_0 ) )
            // InternalEldmDslParser.g:5517:3: ( rule__TypeDef__ParserAlternatives_2_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getParserAlternatives_2_0_0_0()); 
            }
            // InternalEldmDslParser.g:5518:3: ( rule__TypeDef__ParserAlternatives_2_0_0_0 )
            // InternalEldmDslParser.g:5518:4: rule__TypeDef__ParserAlternatives_2_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__ParserAlternatives_2_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getParserAlternatives_2_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__ParserAssignment_2_0_0"


    // $ANTLR start "rule__TypeDef__CodeAssignment_2_0_1"
    // InternalEldmDslParser.g:5526:1: rule__TypeDef__CodeAssignment_2_0_1 : ( RULE_TEXT ) ;
    public final void rule__TypeDef__CodeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5530:1: ( ( RULE_TEXT ) )
            // InternalEldmDslParser.g:5531:2: ( RULE_TEXT )
            {
            // InternalEldmDslParser.g:5531:2: ( RULE_TEXT )
            // InternalEldmDslParser.g:5532:3: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getCodeTEXTTerminalRuleCall_2_0_1_0()); 
            }
            match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getCodeTEXTTerminalRuleCall_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__CodeAssignment_2_0_1"


    // $ANTLR start "rule__TypeDef__TypeAssignment_2_1"
    // InternalEldmDslParser.g:5541:1: rule__TypeDef__TypeAssignment_2_1 : ( ruleValueDef ) ;
    public final void rule__TypeDef__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5545:1: ( ( ruleValueDef ) )
            // InternalEldmDslParser.g:5546:2: ( ruleValueDef )
            {
            // InternalEldmDslParser.g:5546:2: ( ruleValueDef )
            // InternalEldmDslParser.g:5547:3: ruleValueDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDefAccess().getTypeValueDefParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDefAccess().getTypeValueDefParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__TypeAssignment_2_1"


    // $ANTLR start "rule__EnumDef__NameAssignment_1"
    // InternalEldmDslParser.g:5556:1: rule__EnumDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5560:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5561:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5561:2: ( RULE_ID )
            // InternalEldmDslParser.g:5562:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__NameAssignment_1"


    // $ANTLR start "rule__EnumDef__TypeAssignment_2"
    // InternalEldmDslParser.g:5571:1: rule__EnumDef__TypeAssignment_2 : ( ruleMapDef ) ;
    public final void rule__EnumDef__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5575:1: ( ( ruleMapDef ) )
            // InternalEldmDslParser.g:5576:2: ( ruleMapDef )
            {
            // InternalEldmDslParser.g:5576:2: ( ruleMapDef )
            // InternalEldmDslParser.g:5577:3: ruleMapDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getTypeMapDefParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getTypeMapDefParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__TypeAssignment_2"


    // $ANTLR start "rule__EnumDef__DefsAssignment_5"
    // InternalEldmDslParser.g:5586:1: rule__EnumDef__DefsAssignment_5 : ( ruleEnumItemDef ) ;
    public final void rule__EnumDef__DefsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5590:1: ( ( ruleEnumItemDef ) )
            // InternalEldmDslParser.g:5591:2: ( ruleEnumItemDef )
            {
            // InternalEldmDslParser.g:5591:2: ( ruleEnumItemDef )
            // InternalEldmDslParser.g:5592:3: ruleEnumItemDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumItemDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__DefsAssignment_5"


    // $ANTLR start "rule__EnumItemDef__NameAssignment_0"
    // InternalEldmDslParser.g:5601:1: rule__EnumItemDef__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumItemDef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5605:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5606:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5606:2: ( RULE_ID )
            // InternalEldmDslParser.g:5607:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemDefAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemDefAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumItemDef__NameAssignment_0"


    // $ANTLR start "rule__EnumItemDef__ValueAssignment_1"
    // InternalEldmDslParser.g:5616:1: rule__EnumItemDef__ValueAssignment_1 : ( ruleMapLiteral ) ;
    public final void rule__EnumItemDef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5620:1: ( ( ruleMapLiteral ) )
            // InternalEldmDslParser.g:5621:2: ( ruleMapLiteral )
            {
            // InternalEldmDslParser.g:5621:2: ( ruleMapLiteral )
            // InternalEldmDslParser.g:5622:3: ruleMapLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumItemDefAccess().getValueMapLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumItemDefAccess().getValueMapLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumItemDef__ValueAssignment_1"


    // $ANTLR start "rule__ElementTypeDef__RefAssignment_1"
    // InternalEldmDslParser.g:5631:1: rule__ElementTypeDef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ElementTypeDef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5635:1: ( ( ( RULE_ID ) ) )
            // InternalEldmDslParser.g:5636:2: ( ( RULE_ID ) )
            {
            // InternalEldmDslParser.g:5636:2: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5637:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeDefAccess().getRefDefinitionCrossReference_1_0()); 
            }
            // InternalEldmDslParser.g:5638:3: ( RULE_ID )
            // InternalEldmDslParser.g:5639:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeDefAccess().getRefDefinitionIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeDefAccess().getRefDefinitionIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeDefAccess().getRefDefinitionCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementTypeDef__RefAssignment_1"


    // $ANTLR start "rule__ValueDef__NativeAssignment_0"
    // InternalEldmDslParser.g:5650:1: rule__ValueDef__NativeAssignment_0 : ( ruleNativeDef ) ;
    public final void rule__ValueDef__NativeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5654:1: ( ( ruleNativeDef ) )
            // InternalEldmDslParser.g:5655:2: ( ruleNativeDef )
            {
            // InternalEldmDslParser.g:5655:2: ( ruleNativeDef )
            // InternalEldmDslParser.g:5656:3: ruleNativeDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueDefAccess().getNativeNativeDefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNativeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueDefAccess().getNativeNativeDefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueDef__NativeAssignment_0"


    // $ANTLR start "rule__MapDef__DefsAssignment_0_0_2_0"
    // InternalEldmDslParser.g:5665:1: rule__MapDef__DefsAssignment_0_0_2_0 : ( ruleMapEntryDef ) ;
    public final void rule__MapDef__DefsAssignment_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5669:1: ( ( ruleMapEntryDef ) )
            // InternalEldmDslParser.g:5670:2: ( ruleMapEntryDef )
            {
            // InternalEldmDslParser.g:5670:2: ( ruleMapEntryDef )
            // InternalEldmDslParser.g:5671:3: ruleMapEntryDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapEntryDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__DefsAssignment_0_0_2_0"


    // $ANTLR start "rule__MapDef__DefsAssignment_0_0_2_1_1"
    // InternalEldmDslParser.g:5680:1: rule__MapDef__DefsAssignment_0_0_2_1_1 : ( ruleMapEntryDef ) ;
    public final void rule__MapDef__DefsAssignment_0_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5684:1: ( ( ruleMapEntryDef ) )
            // InternalEldmDslParser.g:5685:2: ( ruleMapEntryDef )
            {
            // InternalEldmDslParser.g:5685:2: ( ruleMapEntryDef )
            // InternalEldmDslParser.g:5686:3: ruleMapEntryDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapEntryDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__DefsAssignment_0_0_2_1_1"


    // $ANTLR start "rule__MapDef__DefsAssignment_1_3_0"
    // InternalEldmDslParser.g:5695:1: rule__MapDef__DefsAssignment_1_3_0 : ( ruleMapEntryDef ) ;
    public final void rule__MapDef__DefsAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5699:1: ( ( ruleMapEntryDef ) )
            // InternalEldmDslParser.g:5700:2: ( ruleMapEntryDef )
            {
            // InternalEldmDslParser.g:5700:2: ( ruleMapEntryDef )
            // InternalEldmDslParser.g:5701:3: ruleMapEntryDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapEntryDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__DefsAssignment_1_3_0"


    // $ANTLR start "rule__MapDef__DefsAssignment_1_3_1_1"
    // InternalEldmDslParser.g:5710:1: rule__MapDef__DefsAssignment_1_3_1_1 : ( ruleMapEntryDef ) ;
    public final void rule__MapDef__DefsAssignment_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5714:1: ( ( ruleMapEntryDef ) )
            // InternalEldmDslParser.g:5715:2: ( ruleMapEntryDef )
            {
            // InternalEldmDslParser.g:5715:2: ( ruleMapEntryDef )
            // InternalEldmDslParser.g:5716:3: ruleMapEntryDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapEntryDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapDef__DefsAssignment_1_3_1_1"


    // $ANTLR start "rule__MapEntryDef__NameAssignment_0"
    // InternalEldmDslParser.g:5725:1: rule__MapEntryDef__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MapEntryDef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5729:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5730:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5730:2: ( RULE_ID )
            // InternalEldmDslParser.g:5731:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__NameAssignment_0"


    // $ANTLR start "rule__MapEntryDef__OptAssignment_1_0_0"
    // InternalEldmDslParser.g:5740:1: rule__MapEntryDef__OptAssignment_1_0_0 : ( ( QuestionMark ) ) ;
    public final void rule__MapEntryDef__OptAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5744:1: ( ( ( QuestionMark ) ) )
            // InternalEldmDslParser.g:5745:2: ( ( QuestionMark ) )
            {
            // InternalEldmDslParser.g:5745:2: ( ( QuestionMark ) )
            // InternalEldmDslParser.g:5746:3: ( QuestionMark )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getOptQuestionMarkKeyword_1_0_0_0()); 
            }
            // InternalEldmDslParser.g:5747:3: ( QuestionMark )
            // InternalEldmDslParser.g:5748:4: QuestionMark
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getOptQuestionMarkKeyword_1_0_0_0()); 
            }
            match(input,QuestionMark,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getOptQuestionMarkKeyword_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getOptQuestionMarkKeyword_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__OptAssignment_1_0_0"


    // $ANTLR start "rule__MapEntryDef__TypeAssignment_1_0_2"
    // InternalEldmDslParser.g:5759:1: rule__MapEntryDef__TypeAssignment_1_0_2 : ( ruleElementTypeDef ) ;
    public final void rule__MapEntryDef__TypeAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5763:1: ( ( ruleElementTypeDef ) )
            // InternalEldmDslParser.g:5764:2: ( ruleElementTypeDef )
            {
            // InternalEldmDslParser.g:5764:2: ( ruleElementTypeDef )
            // InternalEldmDslParser.g:5765:3: ruleElementTypeDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getTypeElementTypeDefParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementTypeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getTypeElementTypeDefParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__TypeAssignment_1_0_2"


    // $ANTLR start "rule__MapEntryDef__ValueAssignment_1_1_1"
    // InternalEldmDslParser.g:5774:1: rule__MapEntryDef__ValueAssignment_1_1_1 : ( ruleLiteral ) ;
    public final void rule__MapEntryDef__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5778:1: ( ( ruleLiteral ) )
            // InternalEldmDslParser.g:5779:2: ( ruleLiteral )
            {
            // InternalEldmDslParser.g:5779:2: ( ruleLiteral )
            // InternalEldmDslParser.g:5780:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryDefAccess().getValueLiteralParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryDefAccess().getValueLiteralParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryDef__ValueAssignment_1_1_1"


    // $ANTLR start "rule__ListDef__TypeAssignment_2"
    // InternalEldmDslParser.g:5789:1: rule__ListDef__TypeAssignment_2 : ( ruleElementTypeDef ) ;
    public final void rule__ListDef__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5793:1: ( ( ruleElementTypeDef ) )
            // InternalEldmDslParser.g:5794:2: ( ruleElementTypeDef )
            {
            // InternalEldmDslParser.g:5794:2: ( ruleElementTypeDef )
            // InternalEldmDslParser.g:5795:3: ruleElementTypeDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTypeElementTypeDefParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementTypeDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getTypeElementTypeDefParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__TypeAssignment_2"


    // $ANTLR start "rule__Literal__PathAssignment_12"
    // InternalEldmDslParser.g:5804:1: rule__Literal__PathAssignment_12 : ( rulePath ) ;
    public final void rule__Literal__PathAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5808:1: ( ( rulePath ) )
            // InternalEldmDslParser.g:5809:2: ( rulePath )
            {
            // InternalEldmDslParser.g:5809:2: ( rulePath )
            // InternalEldmDslParser.g:5810:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getPathPathParserRuleCall_12_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getPathPathParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__PathAssignment_12"


    // $ANTLR start "rule__BoolLiteral__IsTrueAssignment_1_1"
    // InternalEldmDslParser.g:5819:1: rule__BoolLiteral__IsTrueAssignment_1_1 : ( ( True ) ) ;
    public final void rule__BoolLiteral__IsTrueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5823:1: ( ( ( True ) ) )
            // InternalEldmDslParser.g:5824:2: ( ( True ) )
            {
            // InternalEldmDslParser.g:5824:2: ( ( True ) )
            // InternalEldmDslParser.g:5825:3: ( True )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            // InternalEldmDslParser.g:5826:3: ( True )
            // InternalEldmDslParser.g:5827:4: True
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }
            match(input,True,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralAccess().getIsTrueTrueKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__IsTrueAssignment_1_1"


    // $ANTLR start "rule__StrLiteral__ValueAssignment"
    // InternalEldmDslParser.g:5838:1: rule__StrLiteral__ValueAssignment : ( RULE_TEXT ) ;
    public final void rule__StrLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5842:1: ( ( RULE_TEXT ) )
            // InternalEldmDslParser.g:5843:2: ( RULE_TEXT )
            {
            // InternalEldmDslParser.g:5843:2: ( RULE_TEXT )
            // InternalEldmDslParser.g:5844:3: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrLiteralAccess().getValueTEXTTerminalRuleCall_0()); 
            }
            match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrLiteralAccess().getValueTEXTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrLiteral__ValueAssignment"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalEldmDslParser.g:5853:1: rule__IntLiteral__ValueAssignment : ( RULE_NATURAL ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5857:1: ( ( RULE_NATURAL ) )
            // InternalEldmDslParser.g:5858:2: ( RULE_NATURAL )
            {
            // InternalEldmDslParser.g:5858:2: ( RULE_NATURAL )
            // InternalEldmDslParser.g:5859:3: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueNATURALTerminalRuleCall_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueNATURALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__FltLiteral__ValueAssignment"
    // InternalEldmDslParser.g:5868:1: rule__FltLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FltLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5872:1: ( ( RULE_FLOAT ) )
            // InternalEldmDslParser.g:5873:2: ( RULE_FLOAT )
            {
            // InternalEldmDslParser.g:5873:2: ( RULE_FLOAT )
            // InternalEldmDslParser.g:5874:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFltLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFltLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FltLiteral__ValueAssignment"


    // $ANTLR start "rule__DateLiteral__ValueAssignment_1"
    // InternalEldmDslParser.g:5883:1: rule__DateLiteral__ValueAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__DateLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5887:1: ( ( RULE_TEXT ) )
            // InternalEldmDslParser.g:5888:2: ( RULE_TEXT )
            {
            // InternalEldmDslParser.g:5888:2: ( RULE_TEXT )
            // InternalEldmDslParser.g:5889:3: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateLiteralAccess().getValueTEXTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateLiteralAccess().getValueTEXTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__ValueAssignment_1"


    // $ANTLR start "rule__TimeLiteral__ValueAssignment_1"
    // InternalEldmDslParser.g:5898:1: rule__TimeLiteral__ValueAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__TimeLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5902:1: ( ( RULE_TEXT ) )
            // InternalEldmDslParser.g:5903:2: ( RULE_TEXT )
            {
            // InternalEldmDslParser.g:5903:2: ( RULE_TEXT )
            // InternalEldmDslParser.g:5904:3: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeLiteralAccess().getValueTEXTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeLiteralAccess().getValueTEXTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__ValueAssignment_1"


    // $ANTLR start "rule__DateTimeLiteral__ValueAssignment_1"
    // InternalEldmDslParser.g:5913:1: rule__DateTimeLiteral__ValueAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__DateTimeLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5917:1: ( ( RULE_TEXT ) )
            // InternalEldmDslParser.g:5918:2: ( RULE_TEXT )
            {
            // InternalEldmDslParser.g:5918:2: ( RULE_TEXT )
            // InternalEldmDslParser.g:5919:3: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeLiteralAccess().getValueTEXTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeLiteralAccess().getValueTEXTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeLiteral__ValueAssignment_1"


    // $ANTLR start "rule__ListLiteral__ValsAssignment_2_0"
    // InternalEldmDslParser.g:5928:1: rule__ListLiteral__ValsAssignment_2_0 : ( ruleLiteral ) ;
    public final void rule__ListLiteral__ValsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5932:1: ( ( ruleLiteral ) )
            // InternalEldmDslParser.g:5933:2: ( ruleLiteral )
            {
            // InternalEldmDslParser.g:5933:2: ( ruleLiteral )
            // InternalEldmDslParser.g:5934:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__ValsAssignment_2_0"


    // $ANTLR start "rule__ListLiteral__ValsAssignment_2_1_1"
    // InternalEldmDslParser.g:5943:1: rule__ListLiteral__ValsAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__ListLiteral__ValsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5947:1: ( ( ruleLiteral ) )
            // InternalEldmDslParser.g:5948:2: ( ruleLiteral )
            {
            // InternalEldmDslParser.g:5948:2: ( ruleLiteral )
            // InternalEldmDslParser.g:5949:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLiteral__ValsAssignment_2_1_1"


    // $ANTLR start "rule__MapLiteral__EntriesAssignment_2_0"
    // InternalEldmDslParser.g:5958:1: rule__MapLiteral__EntriesAssignment_2_0 : ( ruleMapEntryLiteral ) ;
    public final void rule__MapLiteral__EntriesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5962:1: ( ( ruleMapEntryLiteral ) )
            // InternalEldmDslParser.g:5963:2: ( ruleMapEntryLiteral )
            {
            // InternalEldmDslParser.g:5963:2: ( ruleMapEntryLiteral )
            // InternalEldmDslParser.g:5964:3: ruleMapEntryLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapEntryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__EntriesAssignment_2_0"


    // $ANTLR start "rule__MapLiteral__EntriesAssignment_2_1_1"
    // InternalEldmDslParser.g:5973:1: rule__MapLiteral__EntriesAssignment_2_1_1 : ( ruleMapEntryLiteral ) ;
    public final void rule__MapLiteral__EntriesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5977:1: ( ( ruleMapEntryLiteral ) )
            // InternalEldmDslParser.g:5978:2: ( ruleMapEntryLiteral )
            {
            // InternalEldmDslParser.g:5978:2: ( ruleMapEntryLiteral )
            // InternalEldmDslParser.g:5979:3: ruleMapEntryLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapEntryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapLiteral__EntriesAssignment_2_1_1"


    // $ANTLR start "rule__MapEntryLiteral__NameAssignment_0"
    // InternalEldmDslParser.g:5988:1: rule__MapEntryLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MapEntryLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:5992:1: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:5993:2: ( RULE_ID )
            {
            // InternalEldmDslParser.g:5993:2: ( RULE_ID )
            // InternalEldmDslParser.g:5994:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__NameAssignment_0"


    // $ANTLR start "rule__MapEntryLiteral__ValueAssignment_2"
    // InternalEldmDslParser.g:6003:1: rule__MapEntryLiteral__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__MapEntryLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:6007:1: ( ( ruleLiteral ) )
            // InternalEldmDslParser.g:6008:2: ( ruleLiteral )
            {
            // InternalEldmDslParser.g:6008:2: ( ruleLiteral )
            // InternalEldmDslParser.g:6009:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapEntryLiteralAccess().getValueLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapEntryLiteralAccess().getValueLiteralParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntryLiteral__ValueAssignment_2"


    // $ANTLR start "rule__EnumLiteral__RefAssignment_1"
    // InternalEldmDslParser.g:6018:1: rule__EnumLiteral__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumLiteral__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:6022:1: ( ( ( RULE_ID ) ) )
            // InternalEldmDslParser.g:6023:2: ( ( RULE_ID ) )
            {
            // InternalEldmDslParser.g:6023:2: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:6024:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getRefEnumItemDefCrossReference_1_0()); 
            }
            // InternalEldmDslParser.g:6025:3: ( RULE_ID )
            // InternalEldmDslParser.g:6026:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumLiteralAccess().getRefEnumItemDefIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getRefEnumItemDefIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumLiteralAccess().getRefEnumItemDefCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__RefAssignment_1"


    // $ANTLR start "rule__PatternLiteral__RefAssignment_1"
    // InternalEldmDslParser.g:6037:1: rule__PatternLiteral__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternLiteral__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEldmDslParser.g:6041:1: ( ( ( RULE_ID ) ) )
            // InternalEldmDslParser.g:6042:2: ( ( RULE_ID ) )
            {
            // InternalEldmDslParser.g:6042:2: ( ( RULE_ID ) )
            // InternalEldmDslParser.g:6043:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralAccess().getRefValueDefCrossReference_1_0()); 
            }
            // InternalEldmDslParser.g:6044:3: ( RULE_ID )
            // InternalEldmDslParser.g:6045:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternLiteralAccess().getRefValueDefIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralAccess().getRefValueDefIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternLiteralAccess().getRefValueDefCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternLiteral__RefAssignment_1"

    // $ANTLR start synpred4_InternalEldmDslParser
    public final void synpred4_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1139:2: ( ( ( rule__ExternalDef__Group_0__0 ) ) )
        // InternalEldmDslParser.g:1139:2: ( ( rule__ExternalDef__Group_0__0 ) )
        {
        // InternalEldmDslParser.g:1139:2: ( ( rule__ExternalDef__Group_0__0 ) )
        // InternalEldmDslParser.g:1140:3: ( rule__ExternalDef__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExternalDefAccess().getGroup_0()); 
        }
        // InternalEldmDslParser.g:1141:3: ( rule__ExternalDef__Group_0__0 )
        // InternalEldmDslParser.g:1141:4: rule__ExternalDef__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__ExternalDef__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalEldmDslParser

    // $ANTLR start synpred63_InternalEldmDslParser
    public final void synpred63_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:5016:3: ( RULE_PID )
        // InternalEldmDslParser.g:5016:3: RULE_PID
        {
        match(input,RULE_PID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalEldmDslParser

    // Delegated rules

    public final boolean synpred63_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\13\uffff\1\16\3\uffff";
    static final String dfa_3s = "\1\14\12\uffff\1\51\3\uffff";
    static final String dfa_4s = "\1\76\12\uffff\1\72\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\1\15\1\13";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\5\uffff\1\6\1\10\1\7\1\uffff\1\1\1\uffff\1\2\31\uffff\1\14\1\11\1\uffff\1\12\3\uffff\1\15\1\13\1\uffff\1\4\1\5\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\16\2\uffff\1\16\4\uffff\1\14\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1446:1: rule__Literal__Alternatives : ( ( ruleNullLiteral ) | ( ruleBoolLiteral ) | ( ruleStrLiteral ) | ( ruleIntLiteral ) | ( ruleFltLiteral ) | ( ruleDateLiteral ) | ( ruleTimeLiteral ) | ( ruleDateTimeLiteral ) | ( ruleListLiteral ) | ( ruleMapLiteral ) | ( ruleEnumLiteral ) | ( rulePatternLiteral ) | ( ( rule__Literal__PathAssignment_12 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0600000004008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0600000000010080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0600000000010082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0620804000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x04200092EA804000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00200092EAA06200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x762C0000015C1000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x763C0000015C1000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});

}