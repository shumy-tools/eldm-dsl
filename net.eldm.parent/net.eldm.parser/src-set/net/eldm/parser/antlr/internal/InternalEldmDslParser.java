package net.eldm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.eldm.services.EldmDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEldmDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Definitions", "PlugDsl", "Service", "Typedef", "Import", "Module", "Catch", "False", "Match", "Bool", "Else", "Enum", "From", "Func", "Mask", "None", "Path", "Then", "True", "And", "Any", "Def", "Del", "Flt", "For", "Get", "Int", "Lda", "Ldt", "Let", "Lst", "Ltm", "Map", "Out", "Set", "Str", "Use", "Var", "ExclamationMarkEqualsSign", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "FullStopFullStop", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "QuestionMarkFullStop", "As", "If", "In", "Is", "Or", "LineFeed", "CarriageReturn", "ExclamationMark", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "LeftPointingDoubleAngleQuotationMark", "RightPointingDoubleAngleQuotationMark", "RULE_BEGIN", "RULE_END", "RULE_PATH", "RULE_ID", "RULE_INT", "RULE_NATURAL", "RULE_FLOAT", "RULE_DATE", "RULE_TIME", "RULE_DATETIME", "RULE_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=15;
    public static final int Import=8;
    public static final int Or=54;
    public static final int Var=41;
    public static final int False=11;
    public static final int LessThanSign=68;
    public static final int Str=39;
    public static final int LeftParenthesis=59;
    public static final int Bool=13;
    public static final int RULE_TIME=87;
    public static final int Then=21;
    public static final int ExclamationMark=57;
    public static final int GreaterThanSign=70;
    public static final int RULE_ID=82;
    public static final int Mask=18;
    public static final int Out=37;
    public static final int GreaterThanSignEqualsSign=48;
    public static final int EqualsSignEqualsSign=47;
    public static final int RULE_DATE=86;
    public static final int Typedef=7;
    public static final int PlusSign=62;
    public static final int RULE_INT=83;
    public static final int Get=29;
    public static final int RULE_ML_COMMENT=90;
    public static final int LeftSquareBracket=73;
    public static final int Module=9;
    public static final int Map=36;
    public static final int If=51;
    public static final int Set=38;
    public static final int In=52;
    public static final int Catch=10;
    public static final int Is=53;
    public static final int LeftPointingDoubleAngleQuotationMark=77;
    public static final int Flt=27;
    public static final int QuestionMarkFullStop=49;
    public static final int Comma=63;
    public static final int As=50;
    public static final int HyphenMinus=64;
    public static final int CarriageReturn=56;
    public static final int LessThanSignEqualsSign=46;
    public static final int Solidus=66;
    public static final int RightCurlyBracket=76;
    public static final int Path=20;
    public static final int FullStop=65;
    public static final int Use=40;
    public static final int Definitions=4;
    public static final int CommercialAt=72;
    public static final int QuestionMark=71;
    public static final int Else=14;
    public static final int RULE_FLOAT=85;
    public static final int ExclamationMarkEqualsSign=42;
    public static final int HyphenMinusGreaterThanSign=44;
    public static final int None=19;
    public static final int LineFeed=55;
    public static final int RULE_BEGIN=79;
    public static final int True=22;
    public static final int PercentSign=58;
    public static final int FullStopFullStop=45;
    public static final int RightSquareBracket=74;
    public static final int For=28;
    public static final int RightParenthesis=60;
    public static final int Lst=34;
    public static final int RULE_PATH=81;
    public static final int And=23;
    public static final int AsteriskAsterisk=43;
    public static final int RULE_NATURAL=84;
    public static final int RULE_TEXT=89;
    public static final int RULE_END=80;
    public static final int Ltm=35;
    public static final int Func=17;
    public static final int RULE_DATETIME=88;
    public static final int Lda=31;
    public static final int Any=24;
    public static final int Int=30;
    public static final int Match=12;
    public static final int RULE_SL_COMMENT=91;
    public static final int EqualsSign=69;
    public static final int RightPointingDoubleAngleQuotationMark=78;
    public static final int Colon=67;
    public static final int EOF=-1;
    public static final int Ldt=32;
    public static final int Asterisk=61;
    public static final int Def=25;
    public static final int RULE_WS=92;
    public static final int LeftCurlyBracket=75;
    public static final int Service=6;
    public static final int Del=26;
    public static final int From=16;
    public static final int RULE_ANY_OTHER=93;
    public static final int PlugDsl=5;
    public static final int Let=33;

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

        public InternalEldmDslParser(TokenStream input, EldmDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected EldmDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalEldmDslParser.g:57:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalEldmDslParser.g:57:47: (iv_ruleModule= ruleModule EOF )
            // InternalEldmDslParser.g:58:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalEldmDslParser.g:64:1: ruleModule returns [EObject current=null] : (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* ( (lv_funcs_8_0= ruleFunction ) )* this_END_9= RULE_END )? ( (lv_opers_10_0= ruleOperation ) )* ( (lv_paths_11_0= ruleSubPath ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_9=null;
        EObject lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_plugs_3_0 = null;

        EObject lv_defs_6_0 = null;

        EObject lv_vars_7_0 = null;

        EObject lv_funcs_8_0 = null;

        EObject lv_opers_10_0 = null;

        EObject lv_paths_11_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:70:2: ( (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* ( (lv_funcs_8_0= ruleFunction ) )* this_END_9= RULE_END )? ( (lv_opers_10_0= ruleOperation ) )* ( (lv_paths_11_0= ruleSubPath ) )* ) )
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* ( (lv_funcs_8_0= ruleFunction ) )* this_END_9= RULE_END )? ( (lv_opers_10_0= ruleOperation ) )* ( (lv_paths_11_0= ruleSubPath ) )* )
            {
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* ( (lv_funcs_8_0= ruleFunction ) )* this_END_9= RULE_END )? ( (lv_opers_10_0= ruleOperation ) )* ( (lv_paths_11_0= ruleSubPath ) )* )
            // InternalEldmDslParser.g:72:3: otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* ( (lv_funcs_8_0= ruleFunction ) )* this_END_9= RULE_END )? ( (lv_opers_10_0= ruleOperation ) )* ( (lv_paths_11_0= ruleSubPath ) )*
            {
            otherlv_0=(Token)match(input,Module,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
              		
            }
            // InternalEldmDslParser.g:76:3: ( (lv_name_1_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:77:4: (lv_name_1_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:77:4: (lv_name_1_0= rulePathLiteral )
            // InternalEldmDslParser.g:78:5: lv_name_1_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleAccess().getNamePathLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.PathLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEldmDslParser.g:95:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Import) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEldmDslParser.g:96:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalEldmDslParser.g:96:4: (lv_imports_2_0= ruleImport )
            	    // InternalEldmDslParser.g:97:5: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_2_0,
            	      						"net.eldm.EldmDsl.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEldmDslParser.g:114:3: ( (lv_plugs_3_0= rulePlugDsl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==PlugDsl) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEldmDslParser.g:115:4: (lv_plugs_3_0= rulePlugDsl )
            	    {
            	    // InternalEldmDslParser.g:115:4: (lv_plugs_3_0= rulePlugDsl )
            	    // InternalEldmDslParser.g:116:5: lv_plugs_3_0= rulePlugDsl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getPlugsPlugDslParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_plugs_3_0=rulePlugDsl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"plugs",
            	      						lv_plugs_3_0,
            	      						"net.eldm.EldmDsl.PlugDsl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalEldmDslParser.g:133:3: (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* ( (lv_funcs_8_0= ruleFunction ) )* this_END_9= RULE_END )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Definitions) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEldmDslParser.g:134:4: otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* ( (lv_funcs_8_0= ruleFunction ) )* this_END_9= RULE_END
                    {
                    otherlv_4=(Token)match(input,Definitions,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getDefinitionsKeyword_4_0());
                      			
                    }
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_5, grammarAccess.getModuleAccess().getBEGINTerminalRuleCall_4_1());
                      			
                    }
                    // InternalEldmDslParser.g:142:4: ( (lv_defs_6_0= ruleDefinition ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Typedef||LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:143:5: (lv_defs_6_0= ruleDefinition )
                    	    {
                    	    // InternalEldmDslParser.g:143:5: (lv_defs_6_0= ruleDefinition )
                    	    // InternalEldmDslParser.g:144:6: lv_defs_6_0= ruleDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModuleAccess().getDefsDefinitionParserRuleCall_4_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_defs_6_0=ruleDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"defs",
                    	      							lv_defs_6_0,
                    	      							"net.eldm.EldmDsl.Definition");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalEldmDslParser.g:161:4: ( (lv_vars_7_0= ruleVar ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Let||LA4_0==Var) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:162:5: (lv_vars_7_0= ruleVar )
                    	    {
                    	    // InternalEldmDslParser.g:162:5: (lv_vars_7_0= ruleVar )
                    	    // InternalEldmDslParser.g:163:6: lv_vars_7_0= ruleVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModuleAccess().getVarsVarParserRuleCall_4_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_vars_7_0=ruleVar();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"vars",
                    	      							lv_vars_7_0,
                    	      							"net.eldm.EldmDsl.Var");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalEldmDslParser.g:180:4: ( (lv_funcs_8_0= ruleFunction ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Func) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:181:5: (lv_funcs_8_0= ruleFunction )
                    	    {
                    	    // InternalEldmDslParser.g:181:5: (lv_funcs_8_0= ruleFunction )
                    	    // InternalEldmDslParser.g:182:6: lv_funcs_8_0= ruleFunction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModuleAccess().getFuncsFunctionParserRuleCall_4_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_funcs_8_0=ruleFunction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"funcs",
                    	      							lv_funcs_8_0,
                    	      							"net.eldm.EldmDsl.Function");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_9, grammarAccess.getModuleAccess().getENDTerminalRuleCall_4_5());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:204:3: ( (lv_opers_10_0= ruleOperation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Def) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==Service||LA7_1==Get||LA7_1==Set) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==Catch||LA7_0==Out||LA7_0==In) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEldmDslParser.g:205:4: (lv_opers_10_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:205:4: (lv_opers_10_0= ruleOperation )
            	    // InternalEldmDslParser.g:206:5: lv_opers_10_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getOpersOperationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_opers_10_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"opers",
            	      						lv_opers_10_0,
            	      						"net.eldm.EldmDsl.Operation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalEldmDslParser.g:223:3: ( (lv_paths_11_0= ruleSubPath ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Def) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEldmDslParser.g:224:4: (lv_paths_11_0= ruleSubPath )
            	    {
            	    // InternalEldmDslParser.g:224:4: (lv_paths_11_0= ruleSubPath )
            	    // InternalEldmDslParser.g:225:5: lv_paths_11_0= ruleSubPath
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getPathsSubPathParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_paths_11_0=ruleSubPath();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paths",
            	      						lv_paths_11_0,
            	      						"net.eldm.EldmDsl.SubPath");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImport"
    // InternalEldmDslParser.g:246:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEldmDslParser.g:246:47: (iv_ruleImport= ruleImport EOF )
            // InternalEldmDslParser.g:247:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEldmDslParser.g:253:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_path_1_0 = null;

        EObject lv_defs_2_0 = null;

        EObject lv_defs_4_0 = null;

        EObject lv_ref_6_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:259:2: ( (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK ) )
            // InternalEldmDslParser.g:260:2: (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK )
            {
            // InternalEldmDslParser.g:260:2: (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK )
            // InternalEldmDslParser.g:261:3: otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalEldmDslParser.g:265:3: ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PATH) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEldmDslParser.g:266:4: ( (lv_path_1_0= rulePathLiteral ) )
                    {
                    // InternalEldmDslParser.g:266:4: ( (lv_path_1_0= rulePathLiteral ) )
                    // InternalEldmDslParser.g:267:5: (lv_path_1_0= rulePathLiteral )
                    {
                    // InternalEldmDslParser.g:267:5: (lv_path_1_0= rulePathLiteral )
                    // InternalEldmDslParser.g:268:6: lv_path_1_0= rulePathLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getPathPathLiteralParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_path_1_0=rulePathLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportRule());
                      						}
                      						set(
                      							current,
                      							"path",
                      							lv_path_1_0,
                      							"net.eldm.EldmDsl.PathLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:286:4: ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* )
                    {
                    // InternalEldmDslParser.g:286:4: ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* )
                    // InternalEldmDslParser.g:287:5: ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )*
                    {
                    // InternalEldmDslParser.g:287:5: ( (lv_defs_2_0= ruleExternalDef ) )
                    // InternalEldmDslParser.g:288:6: (lv_defs_2_0= ruleExternalDef )
                    {
                    // InternalEldmDslParser.g:288:6: (lv_defs_2_0= ruleExternalDef )
                    // InternalEldmDslParser.g:289:7: lv_defs_2_0= ruleExternalDef
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportAccess().getDefsExternalDefParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_14);
                    lv_defs_2_0=ruleExternalDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getImportRule());
                      							}
                      							add(
                      								current,
                      								"defs",
                      								lv_defs_2_0,
                      								"net.eldm.EldmDsl.ExternalDef");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalEldmDslParser.g:306:5: (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:307:6: otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getImportAccess().getCommaKeyword_1_1_1_0());
                    	      					
                    	    }
                    	    // InternalEldmDslParser.g:311:6: ( (lv_defs_4_0= ruleExternalDef ) )
                    	    // InternalEldmDslParser.g:312:7: (lv_defs_4_0= ruleExternalDef )
                    	    {
                    	    // InternalEldmDslParser.g:312:7: (lv_defs_4_0= ruleExternalDef )
                    	    // InternalEldmDslParser.g:313:8: lv_defs_4_0= ruleExternalDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getImportAccess().getDefsExternalDefParserRuleCall_1_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_defs_4_0=ruleExternalDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getImportRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"defs",
                    	      									lv_defs_4_0,
                    	      									"net.eldm.EldmDsl.ExternalDef");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,From,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getImportAccess().getFromKeyword_2());
              		
            }
            // InternalEldmDslParser.g:337:3: ( (lv_ref_6_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:338:4: (lv_ref_6_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:338:4: (lv_ref_6_0= rulePathLiteral )
            // InternalEldmDslParser.g:339:5: lv_ref_6_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getRefPathLiteralParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_ref_6_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"ref",
              						lv_ref_6_0,
              						"net.eldm.EldmDsl.PathLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImportAccess().getBREAKParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            ruleBREAK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleExternalDef"
    // InternalEldmDslParser.g:367:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalEldmDslParser.g:367:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalEldmDslParser.g:368:2: iv_ruleExternalDef= ruleExternalDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalDef=ruleExternalDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalEldmDslParser.g:374:1: ruleExternalDef returns [EObject current=null] : ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:380:2: ( ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:381:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:381:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (true) ) {
                    alt12=1;
                }
                else if ( (synpred1_InternalEldmDslParser()) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEldmDslParser.g:382:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    {
                    // InternalEldmDslParser.g:382:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    // InternalEldmDslParser.g:383:4: ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    {
                    // InternalEldmDslParser.g:383:4: ( (lv_ref_0_0= RULE_ID ) )
                    // InternalEldmDslParser.g:384:5: (lv_ref_0_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:384:5: (lv_ref_0_0= RULE_ID )
                    // InternalEldmDslParser.g:385:6: lv_ref_0_0= RULE_ID
                    {
                    lv_ref_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ref_0_0, grammarAccess.getExternalDefAccess().getRefIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExternalDefRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"ref",
                      							lv_ref_0_0,
                      							"net.eldm.EldmDsl.ID");
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:401:4: (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==As) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEldmDslParser.g:402:5: otherlv_1= As ( (lv_name_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,As,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getExternalDefAccess().getAsKeyword_0_1_0());
                              				
                            }
                            // InternalEldmDslParser.g:406:5: ( (lv_name_2_0= RULE_ID ) )
                            // InternalEldmDslParser.g:407:6: (lv_name_2_0= RULE_ID )
                            {
                            // InternalEldmDslParser.g:407:6: (lv_name_2_0= RULE_ID )
                            // InternalEldmDslParser.g:408:7: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_name_2_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_0_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExternalDefRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"name",
                              								lv_name_2_0,
                              								"net.eldm.EldmDsl.ID");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:427:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:427:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    // InternalEldmDslParser.g:428:4: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:432:4: (lv_name_3_0= RULE_ID )
                    // InternalEldmDslParser.g:433:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_3_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExternalDefRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_3_0,
                      						"net.eldm.EldmDsl.ID");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRulePlugDsl"
    // InternalEldmDslParser.g:453:1: entryRulePlugDsl returns [EObject current=null] : iv_rulePlugDsl= rulePlugDsl EOF ;
    public final EObject entryRulePlugDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugDsl = null;


        try {
            // InternalEldmDslParser.g:453:48: (iv_rulePlugDsl= rulePlugDsl EOF )
            // InternalEldmDslParser.g:454:2: iv_rulePlugDsl= rulePlugDsl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlugDslRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlugDsl=rulePlugDsl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlugDsl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlugDsl"


    // $ANTLR start "rulePlugDsl"
    // InternalEldmDslParser.g:460:1: rulePlugDsl returns [EObject current=null] : (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK ) ;
    public final EObject rulePlugDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_ref_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:466:2: ( (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK ) )
            // InternalEldmDslParser.g:467:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK )
            {
            // InternalEldmDslParser.g:467:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK )
            // InternalEldmDslParser.g:468:3: otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK
            {
            otherlv_0=(Token)match(input,PlugDsl,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlugDslAccess().getPlugDslKeyword_0());
              		
            }
            // InternalEldmDslParser.g:472:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:473:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:473:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:474:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPlugDslAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPlugDslRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,From,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPlugDslAccess().getFromKeyword_2());
              		
            }
            // InternalEldmDslParser.g:494:3: ( (lv_ref_3_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:495:4: (lv_ref_3_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:495:4: (lv_ref_3_0= rulePathLiteral )
            // InternalEldmDslParser.g:496:5: lv_ref_3_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlugDslAccess().getRefPathLiteralParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_ref_3_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPlugDslRule());
              					}
              					set(
              						current,
              						"ref",
              						lv_ref_3_0,
              						"net.eldm.EldmDsl.PathLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlugDslAccess().getBREAKParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            ruleBREAK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlugDsl"


    // $ANTLR start "entryRuleOperation"
    // InternalEldmDslParser.g:524:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalEldmDslParser.g:524:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalEldmDslParser.g:525:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalEldmDslParser.g:531:1: ruleOperation returns [EObject current=null] : ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:537:2: ( ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) ) )
            // InternalEldmDslParser.g:538:2: ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) )
            {
            // InternalEldmDslParser.g:538:2: ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) )
            // InternalEldmDslParser.g:539:3: ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) )
            {
            // InternalEldmDslParser.g:539:3: ( (lv_decl_0_0= ruleOperationDecl ) )
            // InternalEldmDslParser.g:540:4: (lv_decl_0_0= ruleOperationDecl )
            {
            // InternalEldmDslParser.g:540:4: (lv_decl_0_0= ruleOperationDecl )
            // InternalEldmDslParser.g:541:5: lv_decl_0_0= ruleOperationDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getDeclOperationDeclParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_decl_0_0=ruleOperationDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"decl",
              						lv_decl_0_0,
              						"net.eldm.EldmDsl.OperationDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEldmDslParser.g:558:3: ( (lv_body_1_0= ruleBlockExpression ) )
            // InternalEldmDslParser.g:559:4: (lv_body_1_0= ruleBlockExpression )
            {
            // InternalEldmDslParser.g:559:4: (lv_body_1_0= ruleBlockExpression )
            // InternalEldmDslParser.g:560:5: lv_body_1_0= ruleBlockExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getBodyBlockExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_1_0,
              						"net.eldm.EldmDsl.BlockExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationDecl"
    // InternalEldmDslParser.g:581:1: entryRuleOperationDecl returns [EObject current=null] : iv_ruleOperationDecl= ruleOperationDecl EOF ;
    public final EObject entryRuleOperationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDecl = null;


        try {
            // InternalEldmDslParser.g:581:54: (iv_ruleOperationDecl= ruleOperationDecl EOF )
            // InternalEldmDslParser.g:582:2: iv_ruleOperationDecl= ruleOperationDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationDecl=ruleOperationDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDecl"


    // $ANTLR start "ruleOperationDecl"
    // InternalEldmDslParser.g:588:1: ruleOperationDecl returns [EObject current=null] : ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon ) ;
    public final EObject ruleOperationDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_3_0=null;
        Token lv_srv_4_0=null;
        Token lv_get_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_param_1_0 = null;

        EObject lv_contracts_2_0 = null;

        EObject lv_path_7_0 = null;

        EObject lv_param_8_0 = null;

        EObject lv_result_10_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:594:2: ( ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon ) )
            // InternalEldmDslParser.g:595:2: ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon )
            {
            // InternalEldmDslParser.g:595:2: ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon )
            // InternalEldmDslParser.g:596:3: ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon
            {
            // InternalEldmDslParser.g:596:3: ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Catch) ) {
                alt20=1;
            }
            else if ( (LA20_0==Def||LA20_0==Out||LA20_0==In) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEldmDslParser.g:597:4: ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? )
                    {
                    // InternalEldmDslParser.g:597:4: ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? )
                    // InternalEldmDslParser.g:598:5: ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )?
                    {
                    // InternalEldmDslParser.g:598:5: ( (lv_type_0_0= Catch ) )
                    // InternalEldmDslParser.g:599:6: (lv_type_0_0= Catch )
                    {
                    // InternalEldmDslParser.g:599:6: (lv_type_0_0= Catch )
                    // InternalEldmDslParser.g:600:7: lv_type_0_0= Catch
                    {
                    lv_type_0_0=(Token)match(input,Catch,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_type_0_0, grammarAccess.getOperationDeclAccess().getTypeCatchKeyword_0_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getOperationDeclRule());
                      							}
                      							setWithLastConsumed(current, "type", lv_type_0_0, "catch");
                      						
                    }

                    }


                    }

                    // InternalEldmDslParser.g:612:5: ( (lv_param_1_0= ruleElementDef ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Bool||LA13_0==Enum||(LA13_0>=None && LA13_0<=Path)||LA13_0==Any||LA13_0==Flt||(LA13_0>=Int && LA13_0<=Ldt)||(LA13_0>=Lst && LA13_0<=Map)||LA13_0==Str||LA13_0==FullStopFullStop||LA13_0==LeftCurlyBracket||LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalEldmDslParser.g:613:6: (lv_param_1_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:613:6: (lv_param_1_0= ruleElementDef )
                            // InternalEldmDslParser.g:614:7: lv_param_1_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOperationDeclAccess().getParamElementDefParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
                            lv_param_1_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOperationDeclRule());
                              							}
                              							set(
                              								current,
                              								"param",
                              								lv_param_1_0,
                              								"net.eldm.EldmDsl.ElementDef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:633:4: ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? )
                    {
                    // InternalEldmDslParser.g:633:4: ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? )
                    // InternalEldmDslParser.g:634:5: ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )?
                    {
                    // InternalEldmDslParser.g:634:5: ( (lv_contracts_2_0= ruleContract ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Out||LA14_0==In) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:635:6: (lv_contracts_2_0= ruleContract )
                    	    {
                    	    // InternalEldmDslParser.g:635:6: (lv_contracts_2_0= ruleContract )
                    	    // InternalEldmDslParser.g:636:7: lv_contracts_2_0= ruleContract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationDeclAccess().getContractsContractParserRuleCall_0_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_contracts_2_0=ruleContract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperationDeclRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"contracts",
                    	      								lv_contracts_2_0,
                    	      								"net.eldm.EldmDsl.Contract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // InternalEldmDslParser.g:653:5: ( (lv_type_3_0= Def ) )
                    // InternalEldmDslParser.g:654:6: (lv_type_3_0= Def )
                    {
                    // InternalEldmDslParser.g:654:6: (lv_type_3_0= Def )
                    // InternalEldmDslParser.g:655:7: lv_type_3_0= Def
                    {
                    lv_type_3_0=(Token)match(input,Def,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_type_3_0, grammarAccess.getOperationDeclAccess().getTypeDefKeyword_0_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getOperationDeclRule());
                      							}
                      							setWithLastConsumed(current, "type", lv_type_3_0, "def");
                      						
                    }

                    }


                    }

                    // InternalEldmDslParser.g:667:5: ( (lv_srv_4_0= Service ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Service) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEldmDslParser.g:668:6: (lv_srv_4_0= Service )
                            {
                            // InternalEldmDslParser.g:668:6: (lv_srv_4_0= Service )
                            // InternalEldmDslParser.g:669:7: lv_srv_4_0= Service
                            {
                            lv_srv_4_0=(Token)match(input,Service,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_srv_4_0, grammarAccess.getOperationDeclAccess().getSrvServiceKeyword_0_1_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getOperationDeclRule());
                              							}
                              							setWithLastConsumed(current, "srv", true, "service");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:681:5: ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==Get) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==Set) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEldmDslParser.g:682:6: ( (lv_get_5_0= Get ) )
                            {
                            // InternalEldmDslParser.g:682:6: ( (lv_get_5_0= Get ) )
                            // InternalEldmDslParser.g:683:7: (lv_get_5_0= Get )
                            {
                            // InternalEldmDslParser.g:683:7: (lv_get_5_0= Get )
                            // InternalEldmDslParser.g:684:8: lv_get_5_0= Get
                            {
                            lv_get_5_0=(Token)match(input,Get,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_get_5_0, grammarAccess.getOperationDeclAccess().getGetGetKeyword_0_1_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getOperationDeclRule());
                              								}
                              								setWithLastConsumed(current, "get", true, "get");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalEldmDslParser.g:697:6: otherlv_6= Set
                            {
                            otherlv_6=(Token)match(input,Set,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getOperationDeclAccess().getSetKeyword_0_1_3_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalEldmDslParser.g:702:5: ( (lv_path_7_0= rulePathLiteral ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_PATH) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalEldmDslParser.g:703:6: (lv_path_7_0= rulePathLiteral )
                            {
                            // InternalEldmDslParser.g:703:6: (lv_path_7_0= rulePathLiteral )
                            // InternalEldmDslParser.g:704:7: lv_path_7_0= rulePathLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOperationDeclAccess().getPathPathLiteralParserRuleCall_0_1_4_0());
                              						
                            }
                            pushFollow(FOLLOW_25);
                            lv_path_7_0=rulePathLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOperationDeclRule());
                              							}
                              							set(
                              								current,
                              								"path",
                              								lv_path_7_0,
                              								"net.eldm.EldmDsl.PathLiteral");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:721:5: ( (lv_param_8_0= ruleElementDef ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Bool||LA18_0==Enum||(LA18_0>=None && LA18_0<=Path)||LA18_0==Any||LA18_0==Flt||(LA18_0>=Int && LA18_0<=Ldt)||(LA18_0>=Lst && LA18_0<=Map)||LA18_0==Str||LA18_0==FullStopFullStop||LA18_0==LeftCurlyBracket||LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEldmDslParser.g:722:6: (lv_param_8_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:722:6: (lv_param_8_0= ruleElementDef )
                            // InternalEldmDslParser.g:723:7: lv_param_8_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOperationDeclAccess().getParamElementDefParserRuleCall_0_1_5_0());
                              						
                            }
                            pushFollow(FOLLOW_26);
                            lv_param_8_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOperationDeclRule());
                              							}
                              							set(
                              								current,
                              								"param",
                              								lv_param_8_0,
                              								"net.eldm.EldmDsl.ElementDef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:740:5: (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==HyphenMinusGreaterThanSign) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalEldmDslParser.g:741:6: otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) )
                            {
                            otherlv_9=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getOperationDeclAccess().getHyphenMinusGreaterThanSignKeyword_0_1_6_0());
                              					
                            }
                            // InternalEldmDslParser.g:745:6: ( (lv_result_10_0= ruleElementDef ) )
                            // InternalEldmDslParser.g:746:7: (lv_result_10_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:746:7: (lv_result_10_0= ruleElementDef )
                            // InternalEldmDslParser.g:747:8: lv_result_10_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getOperationDeclAccess().getResultElementDefParserRuleCall_0_1_6_1_0());
                              							
                            }
                            pushFollow(FOLLOW_20);
                            lv_result_10_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getOperationDeclRule());
                              								}
                              								set(
                              									current,
                              									"result",
                              									lv_result_10_0,
                              									"net.eldm.EldmDsl.ElementDef");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,Colon,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getOperationDeclAccess().getColonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDecl"


    // $ANTLR start "entryRuleContract"
    // InternalEldmDslParser.g:775:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalEldmDslParser.g:775:49: (iv_ruleContract= ruleContract EOF )
            // InternalEldmDslParser.g:776:2: iv_ruleContract= ruleContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalEldmDslParser.g:782:1: ruleContract returns [EObject current=null] : ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token lv_flow_0_1=null;
        Token lv_flow_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_msg_5_0=null;
        EObject lv_cond_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:788:2: ( ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK ) )
            // InternalEldmDslParser.g:789:2: ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK )
            {
            // InternalEldmDslParser.g:789:2: ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK )
            // InternalEldmDslParser.g:790:3: ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK
            {
            // InternalEldmDslParser.g:790:3: ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) )
            // InternalEldmDslParser.g:791:4: ( (lv_flow_0_1= In | lv_flow_0_2= Out ) )
            {
            // InternalEldmDslParser.g:791:4: ( (lv_flow_0_1= In | lv_flow_0_2= Out ) )
            // InternalEldmDslParser.g:792:5: (lv_flow_0_1= In | lv_flow_0_2= Out )
            {
            // InternalEldmDslParser.g:792:5: (lv_flow_0_1= In | lv_flow_0_2= Out )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==In) ) {
                alt21=1;
            }
            else if ( (LA21_0==Out) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEldmDslParser.g:793:6: lv_flow_0_1= In
                    {
                    lv_flow_0_1=(Token)match(input,In,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_flow_0_1, grammarAccess.getContractAccess().getFlowInKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContractRule());
                      						}
                      						setWithLastConsumed(current, "flow", lv_flow_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:804:6: lv_flow_0_2= Out
                    {
                    lv_flow_0_2=(Token)match(input,Out,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_flow_0_2, grammarAccess.getContractAccess().getFlowOutKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContractRule());
                      						}
                      						setWithLastConsumed(current, "flow", lv_flow_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContractAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEldmDslParser.g:821:3: ( (lv_cond_2_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:822:4: (lv_cond_2_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:822:4: (lv_cond_2_0= ruleValueExpression )
            // InternalEldmDslParser.g:823:5: lv_cond_2_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContractAccess().getCondValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_cond_2_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContractRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_2_0,
              						"net.eldm.EldmDsl.ValueExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalEldmDslParser.g:844:3: (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==HyphenMinusGreaterThanSign) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEldmDslParser.g:845:4: otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) )
                    {
                    otherlv_4=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getContractAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                      			
                    }
                    // InternalEldmDslParser.g:849:4: ( (lv_msg_5_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:850:5: (lv_msg_5_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:850:5: (lv_msg_5_0= RULE_TEXT )
                    // InternalEldmDslParser.g:851:6: lv_msg_5_0= RULE_TEXT
                    {
                    lv_msg_5_0=(Token)match(input,RULE_TEXT,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_msg_5_0, grammarAccess.getContractAccess().getMsgTEXTTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContractRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"msg",
                      							lv_msg_5_0,
                      							"net.eldm.EldmDsl.TEXT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getContractAccess().getBREAKParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            ruleBREAK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleFunction"
    // InternalEldmDslParser.g:879:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalEldmDslParser.g:879:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalEldmDslParser.g:880:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalEldmDslParser.g:886:1: ruleFunction returns [EObject current=null] : (otherlv_0= Func ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambdaDef ) ) otherlv_3= Colon ( (lv_body_4_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_lambda_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:892:2: ( (otherlv_0= Func ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambdaDef ) ) otherlv_3= Colon ( (lv_body_4_0= ruleBlockExpression ) ) ) )
            // InternalEldmDslParser.g:893:2: (otherlv_0= Func ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambdaDef ) ) otherlv_3= Colon ( (lv_body_4_0= ruleBlockExpression ) ) )
            {
            // InternalEldmDslParser.g:893:2: (otherlv_0= Func ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambdaDef ) ) otherlv_3= Colon ( (lv_body_4_0= ruleBlockExpression ) ) )
            // InternalEldmDslParser.g:894:3: otherlv_0= Func ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambdaDef ) ) otherlv_3= Colon ( (lv_body_4_0= ruleBlockExpression ) )
            {
            otherlv_0=(Token)match(input,Func,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFuncKeyword_0());
              		
            }
            // InternalEldmDslParser.g:898:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:899:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:899:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:900:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:916:3: ( (lv_lambda_2_0= ruleLambdaDef ) )
            // InternalEldmDslParser.g:917:4: (lv_lambda_2_0= ruleLambdaDef )
            {
            // InternalEldmDslParser.g:917:4: (lv_lambda_2_0= ruleLambdaDef )
            // InternalEldmDslParser.g:918:5: lv_lambda_2_0= ruleLambdaDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getLambdaLambdaDefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_lambda_2_0=ruleLambdaDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"lambda",
              						lv_lambda_2_0,
              						"net.eldm.EldmDsl.LambdaDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getColonKeyword_3());
              		
            }
            // InternalEldmDslParser.g:939:3: ( (lv_body_4_0= ruleBlockExpression ) )
            // InternalEldmDslParser.g:940:4: (lv_body_4_0= ruleBlockExpression )
            {
            // InternalEldmDslParser.g:940:4: (lv_body_4_0= ruleBlockExpression )
            // InternalEldmDslParser.g:941:5: lv_body_4_0= ruleBlockExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getBodyBlockExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_4_0,
              						"net.eldm.EldmDsl.BlockExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleSubPath"
    // InternalEldmDslParser.g:962:1: entryRuleSubPath returns [EObject current=null] : iv_ruleSubPath= ruleSubPath EOF ;
    public final EObject entryRuleSubPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPath = null;


        try {
            // InternalEldmDslParser.g:962:48: (iv_ruleSubPath= ruleSubPath EOF )
            // InternalEldmDslParser.g:963:2: iv_ruleSubPath= ruleSubPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubPath=ruleSubPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubPath; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubPath"


    // $ANTLR start "ruleSubPath"
    // InternalEldmDslParser.g:969:1: ruleSubPath returns [EObject current=null] : (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleSubPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_path_1_0 = null;

        EObject lv_funcs_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:975:2: ( (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END ) )
            // InternalEldmDslParser.g:976:2: (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            {
            // InternalEldmDslParser.g:976:2: (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            // InternalEldmDslParser.g:977:3: otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubPathAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:981:3: ( (lv_path_1_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:982:4: (lv_path_1_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:982:4: (lv_path_1_0= rulePathLiteral )
            // InternalEldmDslParser.g:983:5: lv_path_1_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubPathAccess().getPathPathLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_path_1_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubPathRule());
              					}
              					set(
              						current,
              						"path",
              						lv_path_1_0,
              						"net.eldm.EldmDsl.PathLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalEldmDslParser.g:1004:3: ( (lv_funcs_3_0= ruleOperation ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Catch||LA23_0==Def||LA23_0==Out||LA23_0==In) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEldmDslParser.g:1005:4: (lv_funcs_3_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:1005:4: (lv_funcs_3_0= ruleOperation )
            	    // InternalEldmDslParser.g:1006:5: lv_funcs_3_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubPathAccess().getFuncsOperationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_funcs_3_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSubPathRule());
            	      					}
            	      					add(
            	      						current,
            	      						"funcs",
            	      						lv_funcs_3_0,
            	      						"net.eldm.EldmDsl.Operation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_4, grammarAccess.getSubPathAccess().getENDTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubPath"


    // $ANTLR start "entryRuleBlockExpression"
    // InternalEldmDslParser.g:1031:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // InternalEldmDslParser.g:1031:56: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // InternalEldmDslParser.g:1032:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // InternalEldmDslParser.g:1038:1: ruleBlockExpression returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1044:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) )
            // InternalEldmDslParser.g:1045:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            {
            // InternalEldmDslParser.g:1045:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            // InternalEldmDslParser.g:1046:3: () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END
            {
            // InternalEldmDslParser.g:1046:3: ()
            // InternalEldmDslParser.g:1047:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0(),
              					current);
              			
            }

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_1, grammarAccess.getBlockExpressionAccess().getBEGINTerminalRuleCall_1());
              		
            }
            // InternalEldmDslParser.g:1057:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Let||(LA24_0>=Use && LA24_0<=Var)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEldmDslParser.g:1058:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalEldmDslParser.g:1058:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalEldmDslParser.g:1059:5: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_2_0,
            	      						"net.eldm.EldmDsl.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_3, grammarAccess.getBlockExpressionAccess().getENDTerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalEldmDslParser.g:1084:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEldmDslParser.g:1084:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEldmDslParser.g:1085:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEldmDslParser.g:1091:1: ruleExpression returns [EObject current=null] : (this_Var_0= ruleVar | this_Use_1= ruleUse ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;

        EObject this_Use_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1097:2: ( (this_Var_0= ruleVar | this_Use_1= ruleUse ) )
            // InternalEldmDslParser.g:1098:2: (this_Var_0= ruleVar | this_Use_1= ruleUse )
            {
            // InternalEldmDslParser.g:1098:2: (this_Var_0= ruleVar | this_Use_1= ruleUse )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Let||LA25_0==Var) ) {
                alt25=1;
            }
            else if ( (LA25_0==Use) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEldmDslParser.g:1099:3: this_Var_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVarParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Var_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Var_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1108:3: this_Use_1= ruleUse
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getUseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Use_1=ruleUse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Use_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVar"
    // InternalEldmDslParser.g:1120:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalEldmDslParser.g:1120:44: (iv_ruleVar= ruleVar EOF )
            // InternalEldmDslParser.g:1121:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalEldmDslParser.g:1127:1: ruleVar returns [EObject current=null] : ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_let_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_4_0 = null;

        EObject lv_result_6_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1133:2: ( ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) ) )
            // InternalEldmDslParser.g:1134:2: ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) )
            {
            // InternalEldmDslParser.g:1134:2: ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) )
            // InternalEldmDslParser.g:1135:3: ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) )
            {
            // InternalEldmDslParser.g:1135:3: ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Let) ) {
                alt26=1;
            }
            else if ( (LA26_0==Var) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalEldmDslParser.g:1136:4: ( (lv_let_0_0= Let ) )
                    {
                    // InternalEldmDslParser.g:1136:4: ( (lv_let_0_0= Let ) )
                    // InternalEldmDslParser.g:1137:5: (lv_let_0_0= Let )
                    {
                    // InternalEldmDslParser.g:1137:5: (lv_let_0_0= Let )
                    // InternalEldmDslParser.g:1138:6: lv_let_0_0= Let
                    {
                    lv_let_0_0=(Token)match(input,Let,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_let_0_0, grammarAccess.getVarAccess().getLetLetKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarRule());
                      						}
                      						setWithLastConsumed(current, "let", true, "let");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1151:4: otherlv_1= Var
                    {
                    otherlv_1=(Token)match(input,Var,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVarAccess().getVarKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:1156:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEldmDslParser.g:1157:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1157:4: (lv_name_2_0= RULE_ID )
            // InternalEldmDslParser.g:1158:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:1174:3: (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Colon) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEldmDslParser.g:1175:4: otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) )
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVarAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalEldmDslParser.g:1179:4: ( (lv_type_4_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:1180:5: (lv_type_4_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:1180:5: (lv_type_4_0= ruleElementDef )
                    // InternalEldmDslParser.g:1181:6: lv_type_4_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAccess().getTypeElementDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_type_4_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_4_0,
                      							"net.eldm.EldmDsl.ElementDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,EqualsSign,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVarAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalEldmDslParser.g:1203:3: ( (lv_result_6_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:1204:4: (lv_result_6_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:1204:4: (lv_result_6_0= ruleValueExpression )
            // InternalEldmDslParser.g:1205:5: lv_result_6_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarAccess().getResultValueExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_result_6_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarRule());
              					}
              					set(
              						current,
              						"result",
              						lv_result_6_0,
              						"net.eldm.EldmDsl.ValueExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleUse"
    // InternalEldmDslParser.g:1226:1: entryRuleUse returns [EObject current=null] : iv_ruleUse= ruleUse EOF ;
    public final EObject entryRuleUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUse = null;


        try {
            // InternalEldmDslParser.g:1226:44: (iv_ruleUse= ruleUse EOF )
            // InternalEldmDslParser.g:1227:2: iv_ruleUse= ruleUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUse=ruleUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUse"


    // $ANTLR start "ruleUse"
    // InternalEldmDslParser.g:1233:1: ruleUse returns [EObject current=null] : (otherlv_0= Use ( (lv_use_1_0= ruleValueExpression ) ) ) ;
    public final EObject ruleUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_use_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1239:2: ( (otherlv_0= Use ( (lv_use_1_0= ruleValueExpression ) ) ) )
            // InternalEldmDslParser.g:1240:2: (otherlv_0= Use ( (lv_use_1_0= ruleValueExpression ) ) )
            {
            // InternalEldmDslParser.g:1240:2: (otherlv_0= Use ( (lv_use_1_0= ruleValueExpression ) ) )
            // InternalEldmDslParser.g:1241:3: otherlv_0= Use ( (lv_use_1_0= ruleValueExpression ) )
            {
            otherlv_0=(Token)match(input,Use,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUseAccess().getUseKeyword_0());
              		
            }
            // InternalEldmDslParser.g:1245:3: ( (lv_use_1_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:1246:4: (lv_use_1_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:1246:4: (lv_use_1_0= ruleValueExpression )
            // InternalEldmDslParser.g:1247:5: lv_use_1_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUseAccess().getUseValueExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_use_1_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUseRule());
              					}
              					set(
              						current,
              						"use",
              						lv_use_1_0,
              						"net.eldm.EldmDsl.ValueExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUse"


    // $ANTLR start "entryRuleValueExpression"
    // InternalEldmDslParser.g:1268:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // InternalEldmDslParser.g:1268:56: (iv_ruleValueExpression= ruleValueExpression EOF )
            // InternalEldmDslParser.g:1269:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValueExpression=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueExpression"


    // $ANTLR start "ruleValueExpression"
    // InternalEldmDslParser.g:1275:1: ruleValueExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1281:2: (this_OrExpression_0= ruleOrExpression )
            // InternalEldmDslParser.g:1282:2: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getValueExpressionAccess().getOrExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalEldmDslParser.g:1293:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalEldmDslParser.g:1293:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalEldmDslParser.g:1294:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalEldmDslParser.g:1300:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1306:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEldmDslParser.g:1307:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1307:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEldmDslParser.g:1308:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1316:3: ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Or) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred2_InternalEldmDslParser()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalEldmDslParser.g:1317:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1317:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) )
            	    // InternalEldmDslParser.g:1318:5: ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) )
            	    {
            	    // InternalEldmDslParser.g:1328:5: ( () ( (lv_feature_2_0= Or ) ) )
            	    // InternalEldmDslParser.g:1329:6: () ( (lv_feature_2_0= Or ) )
            	    {
            	    // InternalEldmDslParser.g:1329:6: ()
            	    // InternalEldmDslParser.g:1330:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1336:6: ( (lv_feature_2_0= Or ) )
            	    // InternalEldmDslParser.g:1337:7: (lv_feature_2_0= Or )
            	    {
            	    // InternalEldmDslParser.g:1337:7: (lv_feature_2_0= Or )
            	    // InternalEldmDslParser.g:1338:8: lv_feature_2_0= Or
            	    {
            	    lv_feature_2_0=(Token)match(input,Or,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_feature_2_0, grammarAccess.getOrExpressionAccess().getFeatureOrKeyword_1_0_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getOrExpressionRule());
            	      								}
            	      								setWithLastConsumed(current, "feature", lv_feature_2_0, "or");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1352:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEldmDslParser.g:1353:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEldmDslParser.g:1353:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEldmDslParser.g:1354:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"net.eldm.EldmDsl.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalEldmDslParser.g:1376:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEldmDslParser.g:1376:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEldmDslParser.g:1377:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalEldmDslParser.g:1383:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1389:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalEldmDslParser.g:1390:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1390:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalEldmDslParser.g:1391:3: this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1399:3: ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==And) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred3_InternalEldmDslParser()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalEldmDslParser.g:1400:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1400:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) )
            	    // InternalEldmDslParser.g:1401:5: ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) )
            	    {
            	    // InternalEldmDslParser.g:1411:5: ( () ( (lv_feature_2_0= And ) ) )
            	    // InternalEldmDslParser.g:1412:6: () ( (lv_feature_2_0= And ) )
            	    {
            	    // InternalEldmDslParser.g:1412:6: ()
            	    // InternalEldmDslParser.g:1413:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1419:6: ( (lv_feature_2_0= And ) )
            	    // InternalEldmDslParser.g:1420:7: (lv_feature_2_0= And )
            	    {
            	    // InternalEldmDslParser.g:1420:7: (lv_feature_2_0= And )
            	    // InternalEldmDslParser.g:1421:8: lv_feature_2_0= And
            	    {
            	    lv_feature_2_0=(Token)match(input,And,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_feature_2_0, grammarAccess.getAndExpressionAccess().getFeatureAndKeyword_1_0_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getAndExpressionRule());
            	      								}
            	      								setWithLastConsumed(current, "feature", lv_feature_2_0, "and");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1435:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalEldmDslParser.g:1436:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalEldmDslParser.g:1436:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalEldmDslParser.g:1437:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"net.eldm.EldmDsl.EqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalEldmDslParser.g:1459:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalEldmDslParser.g:1459:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalEldmDslParser.g:1460:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalEldmDslParser.g:1466:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1472:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalEldmDslParser.g:1473:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1473:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalEldmDslParser.g:1474:3: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1482:3: ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==EqualsSignEqualsSign) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred4_InternalEldmDslParser()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==ExclamationMarkEqualsSign) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred4_InternalEldmDslParser()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalEldmDslParser.g:1483:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1483:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1484:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1498:5: ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalEldmDslParser.g:1499:6: () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1499:6: ()
            	    // InternalEldmDslParser.g:1500:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEqualityExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1506:6: ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalEldmDslParser.g:1507:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalEldmDslParser.g:1507:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalEldmDslParser.g:1508:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalEldmDslParser.g:1508:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==EqualsSignEqualsSign) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==ExclamationMarkEqualsSign) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1509:9: lv_feature_2_1= EqualsSignEqualsSign
            	            {
            	            lv_feature_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_1, grammarAccess.getEqualityExpressionAccess().getFeatureEqualsSignEqualsSignKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEldmDslParser.g:1520:9: lv_feature_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_feature_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_2, grammarAccess.getEqualityExpressionAccess().getFeatureExclamationMarkEqualsSignKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_2, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1535:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalEldmDslParser.g:1536:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalEldmDslParser.g:1536:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalEldmDslParser.g:1537:6: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"net.eldm.EldmDsl.RelationalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalEldmDslParser.g:1559:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalEldmDslParser.g:1559:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalEldmDslParser.g:1560:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalEldmDslParser.g:1566:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        Token lv_feature_5_1=null;
        Token lv_feature_5_2=null;
        Token lv_feature_5_3=null;
        Token lv_feature_5_4=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1572:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) )
            // InternalEldmDslParser.g:1573:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            {
            // InternalEldmDslParser.g:1573:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            // InternalEldmDslParser.g:1574:3: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1582:3: ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case Is:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred5_InternalEldmDslParser()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred6_InternalEldmDslParser()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred6_InternalEldmDslParser()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case GreaterThanSign:
                    {
                    int LA33_5 = input.LA(2);

                    if ( (synpred6_InternalEldmDslParser()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case LessThanSign:
                    {
                    int LA33_6 = input.LA(2);

                    if ( (synpred6_InternalEldmDslParser()) ) {
                        alt33=2;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // InternalEldmDslParser.g:1583:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    {
            	    // InternalEldmDslParser.g:1583:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    // InternalEldmDslParser.g:1584:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) )
            	    {
            	    // InternalEldmDslParser.g:1584:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) )
            	    // InternalEldmDslParser.g:1585:6: ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) )
            	    {
            	    // InternalEldmDslParser.g:1595:6: ( () ( (lv_feature_2_0= Is ) ) )
            	    // InternalEldmDslParser.g:1596:7: () ( (lv_feature_2_0= Is ) )
            	    {
            	    // InternalEldmDslParser.g:1596:7: ()
            	    // InternalEldmDslParser.g:1597:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getIsExpressionLeftAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1603:7: ( (lv_feature_2_0= Is ) )
            	    // InternalEldmDslParser.g:1604:8: (lv_feature_2_0= Is )
            	    {
            	    // InternalEldmDslParser.g:1604:8: (lv_feature_2_0= Is )
            	    // InternalEldmDslParser.g:1605:9: lv_feature_2_0= Is
            	    {
            	    lv_feature_2_0=(Token)match(input,Is,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(lv_feature_2_0, grammarAccess.getRelationalExpressionAccess().getFeatureIsKeyword_1_0_0_0_1_0());
            	      								
            	    }
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	      									}
            	      									setWithLastConsumed(current, "feature", lv_feature_2_0, "is");
            	      								
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1619:5: ( (lv_type_3_0= ruleElementDef ) )
            	    // InternalEldmDslParser.g:1620:6: (lv_type_3_0= ruleElementDef )
            	    {
            	    // InternalEldmDslParser.g:1620:6: (lv_type_3_0= ruleElementDef )
            	    // InternalEldmDslParser.g:1621:7: lv_type_3_0= ruleElementDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getTypeElementDefParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_type_3_0=ruleElementDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"type",
            	      								lv_type_3_0,
            	      								"net.eldm.EldmDsl.ElementDef");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEldmDslParser.g:1640:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    {
            	    // InternalEldmDslParser.g:1640:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    // InternalEldmDslParser.g:1641:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1641:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1642:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1660:6: ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    // InternalEldmDslParser.g:1661:7: () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1661:7: ()
            	    // InternalEldmDslParser.g:1662:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getValueExpressionLeftAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1668:7: ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    // InternalEldmDslParser.g:1669:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    {
            	    // InternalEldmDslParser.g:1669:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    // InternalEldmDslParser.g:1670:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    {
            	    // InternalEldmDslParser.g:1670:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    int alt32=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt32=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1671:10: lv_feature_5_1= GreaterThanSignEqualsSign
            	            {
            	            lv_feature_5_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_feature_5_1, grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignEqualsSignKeyword_1_1_0_0_1_0_0());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              										}
            	              										setWithLastConsumed(current, "feature", lv_feature_5_1, null);
            	              									
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEldmDslParser.g:1682:10: lv_feature_5_2= LessThanSignEqualsSign
            	            {
            	            lv_feature_5_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_feature_5_2, grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignEqualsSignKeyword_1_1_0_0_1_0_1());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              										}
            	              										setWithLastConsumed(current, "feature", lv_feature_5_2, null);
            	              									
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalEldmDslParser.g:1693:10: lv_feature_5_3= GreaterThanSign
            	            {
            	            lv_feature_5_3=(Token)match(input,GreaterThanSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_feature_5_3, grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignKeyword_1_1_0_0_1_0_2());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              										}
            	              										setWithLastConsumed(current, "feature", lv_feature_5_3, null);
            	              									
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalEldmDslParser.g:1704:10: lv_feature_5_4= LessThanSign
            	            {
            	            lv_feature_5_4=(Token)match(input,LessThanSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_feature_5_4, grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignKeyword_1_1_0_0_1_0_3());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              										}
            	              										setWithLastConsumed(current, "feature", lv_feature_5_4, null);
            	              									
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1719:5: ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    // InternalEldmDslParser.g:1720:6: (lv_right_6_0= ruleAdditiveExpression )
            	    {
            	    // InternalEldmDslParser.g:1720:6: (lv_right_6_0= ruleAdditiveExpression )
            	    // InternalEldmDslParser.g:1721:7: lv_right_6_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_6_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"net.eldm.EldmDsl.AdditiveExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalEldmDslParser.g:1744:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalEldmDslParser.g:1744:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalEldmDslParser.g:1745:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalEldmDslParser.g:1751:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        Token lv_feature_2_3=null;
        Token lv_feature_2_4=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1757:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalEldmDslParser.g:1758:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1758:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalEldmDslParser.g:1759:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1767:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case PlusSign:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred7_InternalEldmDslParser()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case HyphenMinus:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred7_InternalEldmDslParser()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case Set:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred7_InternalEldmDslParser()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case Del:
                    {
                    int LA35_5 = input.LA(2);

                    if ( (synpred7_InternalEldmDslParser()) ) {
                        alt35=1;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // InternalEldmDslParser.g:1768:4: ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1768:4: ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) )
            	    // InternalEldmDslParser.g:1769:5: ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1787:5: ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) )
            	    // InternalEldmDslParser.g:1788:6: () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) )
            	    {
            	    // InternalEldmDslParser.g:1788:6: ()
            	    // InternalEldmDslParser.g:1789:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAdditiveExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1795:6: ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) )
            	    // InternalEldmDslParser.g:1796:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) )
            	    {
            	    // InternalEldmDslParser.g:1796:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) )
            	    // InternalEldmDslParser.g:1797:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del )
            	    {
            	    // InternalEldmDslParser.g:1797:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case PlusSign:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case HyphenMinus:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case Set:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case Del:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1798:9: lv_feature_2_1= PlusSign
            	            {
            	            lv_feature_2_1=(Token)match(input,PlusSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_1, grammarAccess.getAdditiveExpressionAccess().getFeaturePlusSignKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEldmDslParser.g:1809:9: lv_feature_2_2= HyphenMinus
            	            {
            	            lv_feature_2_2=(Token)match(input,HyphenMinus,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_2, grammarAccess.getAdditiveExpressionAccess().getFeatureHyphenMinusKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_2, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalEldmDslParser.g:1820:9: lv_feature_2_3= Set
            	            {
            	            lv_feature_2_3=(Token)match(input,Set,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_3, grammarAccess.getAdditiveExpressionAccess().getFeatureSetKeyword_1_0_0_1_0_2());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_3, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalEldmDslParser.g:1831:9: lv_feature_2_4= Del
            	            {
            	            lv_feature_2_4=(Token)match(input,Del,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_4, grammarAccess.getAdditiveExpressionAccess().getFeatureDelKeyword_1_0_0_1_0_3());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_4, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1846:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalEldmDslParser.g:1847:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalEldmDslParser.g:1847:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalEldmDslParser.g:1848:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"net.eldm.EldmDsl.MultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalEldmDslParser.g:1870:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalEldmDslParser.g:1870:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalEldmDslParser.g:1871:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalEldmDslParser.g:1877:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        Token lv_feature_2_3=null;
        Token lv_feature_2_4=null;
        EObject this_UnaryOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1883:2: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // InternalEldmDslParser.g:1884:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // InternalEldmDslParser.g:1884:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // InternalEldmDslParser.g:1885:3: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1893:3: ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case Asterisk:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred8_InternalEldmDslParser()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case AsteriskAsterisk:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred8_InternalEldmDslParser()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case Solidus:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred8_InternalEldmDslParser()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case PercentSign:
                    {
                    int LA37_5 = input.LA(2);

                    if ( (synpred8_InternalEldmDslParser()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // InternalEldmDslParser.g:1894:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // InternalEldmDslParser.g:1894:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1895:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1913:5: ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    // InternalEldmDslParser.g:1914:6: () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1914:6: ()
            	    // InternalEldmDslParser.g:1915:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1921:6: ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    // InternalEldmDslParser.g:1922:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    {
            	    // InternalEldmDslParser.g:1922:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    // InternalEldmDslParser.g:1923:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    {
            	    // InternalEldmDslParser.g:1923:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    int alt36=4;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case AsteriskAsterisk:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt36=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1924:9: lv_feature_2_1= Asterisk
            	            {
            	            lv_feature_2_1=(Token)match(input,Asterisk,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_1, grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEldmDslParser.g:1935:9: lv_feature_2_2= AsteriskAsterisk
            	            {
            	            lv_feature_2_2=(Token)match(input,AsteriskAsterisk,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_2, grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskAsteriskKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_2, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalEldmDslParser.g:1946:9: lv_feature_2_3= Solidus
            	            {
            	            lv_feature_2_3=(Token)match(input,Solidus,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_3, grammarAccess.getMultiplicativeExpressionAccess().getFeatureSolidusKeyword_1_0_0_1_0_2());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_3, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalEldmDslParser.g:1957:9: lv_feature_2_4= PercentSign
            	            {
            	            lv_feature_2_4=(Token)match(input,PercentSign,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_feature_2_4, grammarAccess.getMultiplicativeExpressionAccess().getFeaturePercentSignKeyword_1_0_0_1_0_3());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "feature", lv_feature_2_4, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1972:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // InternalEldmDslParser.g:1973:5: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // InternalEldmDslParser.g:1973:5: (lv_right_3_0= ruleUnaryOperation )
            	    // InternalEldmDslParser.g:1974:6: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=ruleUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"net.eldm.EldmDsl.UnaryOperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalEldmDslParser.g:1996:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalEldmDslParser.g:1996:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalEldmDslParser.g:1997:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // InternalEldmDslParser.g:2003:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary | this_FlowExpression_4= ruleFlowExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_Primary_3 = null;

        EObject this_FlowExpression_4 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2009:2: ( ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary | this_FlowExpression_4= ruleFlowExpression ) )
            // InternalEldmDslParser.g:2010:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary | this_FlowExpression_4= ruleFlowExpression )
            {
            // InternalEldmDslParser.g:2010:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary | this_FlowExpression_4= ruleFlowExpression )
            int alt38=3;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt38=1;
                }
                break;
            case False:
            case Bool:
            case Enum:
            case None:
            case Path:
            case True:
            case Any:
            case Flt:
            case Int:
            case Lda:
            case Ldt:
            case Lst:
            case Ltm:
            case Map:
            case Str:
            case LeftParenthesis:
            case LeftSquareBracket:
            case LeftCurlyBracket:
            case LeftPointingDoubleAngleQuotationMark:
            case RULE_PATH:
            case RULE_ID:
            case RULE_NATURAL:
            case RULE_FLOAT:
            case RULE_DATE:
            case RULE_TIME:
            case RULE_DATETIME:
            case RULE_TEXT:
                {
                alt38=2;
                }
                break;
            case For:
            case If:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalEldmDslParser.g:2011:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // InternalEldmDslParser.g:2011:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // InternalEldmDslParser.g:2012:4: () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // InternalEldmDslParser.g:2012:4: ()
                    // InternalEldmDslParser.g:2013:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEldmDslParser.g:2019:4: ( (lv_feature_1_0= ExclamationMark ) )
                    // InternalEldmDslParser.g:2020:5: (lv_feature_1_0= ExclamationMark )
                    {
                    // InternalEldmDslParser.g:2020:5: (lv_feature_1_0= ExclamationMark )
                    // InternalEldmDslParser.g:2021:6: lv_feature_1_0= ExclamationMark
                    {
                    lv_feature_1_0=(Token)match(input,ExclamationMark,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_feature_1_0, grammarAccess.getUnaryOperationAccess().getFeatureExclamationMarkKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryOperationRule());
                      						}
                      						setWithLastConsumed(current, "feature", lv_feature_1_0, "!");
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:2033:4: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // InternalEldmDslParser.g:2034:5: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // InternalEldmDslParser.g:2034:5: (lv_operand_2_0= ruleUnaryOperation )
                    // InternalEldmDslParser.g:2035:6: lv_operand_2_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"net.eldm.EldmDsl.UnaryOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2054:3: this_Primary_3= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryOperationAccess().getPrimaryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Primary_3=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Primary_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:2063:3: this_FlowExpression_4= ruleFlowExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryOperationAccess().getFlowExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowExpression_4=ruleFlowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FlowExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRulePrimary"
    // InternalEldmDslParser.g:2075:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEldmDslParser.g:2075:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEldmDslParser.g:2076:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalEldmDslParser.g:2082:1: rulePrimary returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_cast_1_0=null;
        Token otherlv_3=null;
        Token lv_ref_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_value_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_calls_8_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2088:2: ( ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) ) )
            // InternalEldmDslParser.g:2089:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) )
            {
            // InternalEldmDslParser.g:2089:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) )
            int alt42=2;
            switch ( input.LA(1) ) {
            case False:
            case Bool:
            case Enum:
            case None:
            case Path:
            case True:
            case Any:
            case Flt:
            case Int:
            case Lda:
            case Ldt:
            case Lst:
            case Ltm:
            case Map:
            case Str:
            case LeftSquareBracket:
            case LeftCurlyBracket:
            case RULE_PATH:
            case RULE_NATURAL:
            case RULE_FLOAT:
            case RULE_DATE:
            case RULE_TIME:
            case RULE_DATETIME:
            case RULE_TEXT:
                {
                alt42=1;
                }
                break;
            case RULE_ID:
                {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==EOF||LA42_2==Else||LA42_2==Func||LA42_2==Then||LA42_2==And||LA42_2==Del||LA42_2==Let||LA42_2==Map||LA42_2==Set||(LA42_2>=Use && LA42_2<=AsteriskAsterisk)||(LA42_2>=LessThanSignEqualsSign && LA42_2<=QuestionMarkFullStop)||(LA42_2>=Is && LA42_2<=Or)||LA42_2==PercentSign||(LA42_2>=RightParenthesis && LA42_2<=PlusSign)||(LA42_2>=HyphenMinus && LA42_2<=LessThanSign)||LA42_2==GreaterThanSign||(LA42_2>=LeftSquareBracket && LA42_2<=RightSquareBracket)||LA42_2==RULE_END) ) {
                    alt42=2;
                }
                else if ( (LA42_2==CommercialAt) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
            case LeftPointingDoubleAngleQuotationMark:
                {
                alt42=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalEldmDslParser.g:2090:3: ( (lv_value_0_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:2090:3: ( (lv_value_0_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:2091:4: (lv_value_0_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:2091:4: (lv_value_0_0= ruleLiteral )
                    // InternalEldmDslParser.g:2092:5: lv_value_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryAccess().getValueLiteralParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_0_0,
                      						"net.eldm.EldmDsl.Literal");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2110:3: ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* )
                    {
                    // InternalEldmDslParser.g:2110:3: ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* )
                    // InternalEldmDslParser.g:2111:4: ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )*
                    {
                    // InternalEldmDslParser.g:2111:4: ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==LeftPointingDoubleAngleQuotationMark) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalEldmDslParser.g:2112:5: ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark
                            {
                            // InternalEldmDslParser.g:2112:5: ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) )
                            // InternalEldmDslParser.g:2113:6: (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark )
                            {
                            // InternalEldmDslParser.g:2113:6: (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark )
                            // InternalEldmDslParser.g:2114:7: lv_cast_1_0= LeftPointingDoubleAngleQuotationMark
                            {
                            lv_cast_1_0=(Token)match(input,LeftPointingDoubleAngleQuotationMark,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_cast_1_0, grammarAccess.getPrimaryAccess().getCastLeftPointingDoubleAngleQuotationMarkKeyword_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryRule());
                              							}
                              							setWithLastConsumed(current, "cast", true, "\u00AB");
                              						
                            }

                            }


                            }

                            // InternalEldmDslParser.g:2126:5: ( (lv_type_2_0= ruleElementDef ) )
                            // InternalEldmDslParser.g:2127:6: (lv_type_2_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:2127:6: (lv_type_2_0= ruleElementDef )
                            // InternalEldmDslParser.g:2128:7: lv_type_2_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimaryAccess().getTypeElementDefParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_44);
                            lv_type_2_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_2_0,
                              								"net.eldm.EldmDsl.ElementDef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,RightPointingDoubleAngleQuotationMark,FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightPointingDoubleAngleQuotationMarkKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2150:4: ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==LeftParenthesis) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalEldmDslParser.g:2151:5: ( (lv_ref_4_0= RULE_ID ) )
                            {
                            // InternalEldmDslParser.g:2151:5: ( (lv_ref_4_0= RULE_ID ) )
                            // InternalEldmDslParser.g:2152:6: (lv_ref_4_0= RULE_ID )
                            {
                            // InternalEldmDslParser.g:2152:6: (lv_ref_4_0= RULE_ID )
                            // InternalEldmDslParser.g:2153:7: lv_ref_4_0= RULE_ID
                            {
                            lv_ref_4_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_ref_4_0, grammarAccess.getPrimaryAccess().getRefIDTerminalRuleCall_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"ref",
                              								lv_ref_4_0,
                              								"net.eldm.EldmDsl.ID");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalEldmDslParser.g:2170:5: (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis )
                            {
                            // InternalEldmDslParser.g:2170:5: (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis )
                            // InternalEldmDslParser.g:2171:6: otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis
                            {
                            otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1_1_0());
                              					
                            }
                            // InternalEldmDslParser.g:2175:6: ( (lv_exp_6_0= ruleValueExpression ) )
                            // InternalEldmDslParser.g:2176:7: (lv_exp_6_0= ruleValueExpression )
                            {
                            // InternalEldmDslParser.g:2176:7: (lv_exp_6_0= ruleValueExpression )
                            // InternalEldmDslParser.g:2177:8: lv_exp_6_0= ruleValueExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPrimaryAccess().getExpValueExpressionParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_30);
                            lv_exp_6_0=ruleValueExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPrimaryRule());
                              								}
                              								set(
                              									current,
                              									"exp",
                              									lv_exp_6_0,
                              									"net.eldm.EldmDsl.ValueExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_1_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2200:4: ( (lv_calls_8_0= ruleMemberCall ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==QuestionMarkFullStop||LA41_0==FullStop||LA41_0==LeftSquareBracket) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:2201:5: (lv_calls_8_0= ruleMemberCall )
                    	    {
                    	    // InternalEldmDslParser.g:2201:5: (lv_calls_8_0= ruleMemberCall )
                    	    // InternalEldmDslParser.g:2202:6: lv_calls_8_0= ruleMemberCall
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPrimaryAccess().getCallsMemberCallParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_calls_8_0=ruleMemberCall();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"calls",
                    	      							lv_calls_8_0,
                    	      							"net.eldm.EldmDsl.MemberCall");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleMemberCall"
    // InternalEldmDslParser.g:2224:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalEldmDslParser.g:2224:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalEldmDslParser.g:2225:2: iv_ruleMemberCall= ruleMemberCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMemberCall=ruleMemberCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberCall"


    // $ANTLR start "ruleMemberCall"
    // InternalEldmDslParser.g:2231:1: ruleMemberCall returns [EObject current=null] : ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambdaCall ) )? ) | (otherlv_4= LeftSquareBracket ( (lv_key_5_0= ruleValueExpression ) ) otherlv_6= RightSquareBracket ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unknown_1_0=null;
        Token lv_member_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lambda_3_0 = null;

        EObject lv_key_5_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2237:2: ( ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambdaCall ) )? ) | (otherlv_4= LeftSquareBracket ( (lv_key_5_0= ruleValueExpression ) ) otherlv_6= RightSquareBracket ) ) )
            // InternalEldmDslParser.g:2238:2: ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambdaCall ) )? ) | (otherlv_4= LeftSquareBracket ( (lv_key_5_0= ruleValueExpression ) ) otherlv_6= RightSquareBracket ) )
            {
            // InternalEldmDslParser.g:2238:2: ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambdaCall ) )? ) | (otherlv_4= LeftSquareBracket ( (lv_key_5_0= ruleValueExpression ) ) otherlv_6= RightSquareBracket ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==QuestionMarkFullStop||LA45_0==FullStop) ) {
                alt45=1;
            }
            else if ( (LA45_0==LeftSquareBracket) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalEldmDslParser.g:2239:3: ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambdaCall ) )? )
                    {
                    // InternalEldmDslParser.g:2239:3: ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambdaCall ) )? )
                    // InternalEldmDslParser.g:2240:4: (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambdaCall ) )?
                    {
                    // InternalEldmDslParser.g:2240:4: (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==FullStop) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==QuestionMarkFullStop) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalEldmDslParser.g:2241:5: otherlv_0= FullStop
                            {
                            otherlv_0=(Token)match(input,FullStop,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getMemberCallAccess().getFullStopKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalEldmDslParser.g:2246:5: ( (lv_unknown_1_0= QuestionMarkFullStop ) )
                            {
                            // InternalEldmDslParser.g:2246:5: ( (lv_unknown_1_0= QuestionMarkFullStop ) )
                            // InternalEldmDslParser.g:2247:6: (lv_unknown_1_0= QuestionMarkFullStop )
                            {
                            // InternalEldmDslParser.g:2247:6: (lv_unknown_1_0= QuestionMarkFullStop )
                            // InternalEldmDslParser.g:2248:7: lv_unknown_1_0= QuestionMarkFullStop
                            {
                            lv_unknown_1_0=(Token)match(input,QuestionMarkFullStop,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_unknown_1_0, grammarAccess.getMemberCallAccess().getUnknownQuestionMarkFullStopKeyword_0_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMemberCallRule());
                              							}
                              							setWithLastConsumed(current, "unknown", true, "?.");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2261:4: ( (lv_member_2_0= RULE_ID ) )
                    // InternalEldmDslParser.g:2262:5: (lv_member_2_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2262:5: (lv_member_2_0= RULE_ID )
                    // InternalEldmDslParser.g:2263:6: lv_member_2_0= RULE_ID
                    {
                    lv_member_2_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_member_2_0, grammarAccess.getMemberCallAccess().getMemberIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMemberCallRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"member",
                      							lv_member_2_0,
                      							"net.eldm.EldmDsl.ID");
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:2279:4: ( (lv_lambda_3_0= ruleLambdaCall ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==LeftParenthesis) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalEldmDslParser.g:2280:5: (lv_lambda_3_0= ruleLambdaCall )
                            {
                            // InternalEldmDslParser.g:2280:5: (lv_lambda_3_0= ruleLambdaCall )
                            // InternalEldmDslParser.g:2281:6: lv_lambda_3_0= ruleLambdaCall
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getMemberCallAccess().getLambdaLambdaCallParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_lambda_3_0=ruleLambdaCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getMemberCallRule());
                              						}
                              						set(
                              							current,
                              							"lambda",
                              							lv_lambda_3_0,
                              							"net.eldm.EldmDsl.LambdaCall");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2300:3: (otherlv_4= LeftSquareBracket ( (lv_key_5_0= ruleValueExpression ) ) otherlv_6= RightSquareBracket )
                    {
                    // InternalEldmDslParser.g:2300:3: (otherlv_4= LeftSquareBracket ( (lv_key_5_0= ruleValueExpression ) ) otherlv_6= RightSquareBracket )
                    // InternalEldmDslParser.g:2301:4: otherlv_4= LeftSquareBracket ( (lv_key_5_0= ruleValueExpression ) ) otherlv_6= RightSquareBracket
                    {
                    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMemberCallAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalEldmDslParser.g:2305:4: ( (lv_key_5_0= ruleValueExpression ) )
                    // InternalEldmDslParser.g:2306:5: (lv_key_5_0= ruleValueExpression )
                    {
                    // InternalEldmDslParser.g:2306:5: (lv_key_5_0= ruleValueExpression )
                    // InternalEldmDslParser.g:2307:6: lv_key_5_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberCallAccess().getKeyValueExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_key_5_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberCallRule());
                      						}
                      						set(
                      							current,
                      							"key",
                      							lv_key_5_0,
                      							"net.eldm.EldmDsl.ValueExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMemberCallAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberCall"


    // $ANTLR start "entryRuleLambdaCall"
    // InternalEldmDslParser.g:2333:1: entryRuleLambdaCall returns [EObject current=null] : iv_ruleLambdaCall= ruleLambdaCall EOF ;
    public final EObject entryRuleLambdaCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaCall = null;


        try {
            // InternalEldmDslParser.g:2333:51: (iv_ruleLambdaCall= ruleLambdaCall EOF )
            // InternalEldmDslParser.g:2334:2: iv_ruleLambdaCall= ruleLambdaCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLambdaCall=ruleLambdaCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLambdaCall"


    // $ANTLR start "ruleLambdaCall"
    // InternalEldmDslParser.g:2340:1: ruleLambdaCall returns [EObject current=null] : (otherlv_0= LeftParenthesis ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= HyphenMinusGreaterThanSign )? ( (lv_exp_3_0= ruleValueExpression ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleLambdaCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_param_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2346:2: ( (otherlv_0= LeftParenthesis ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= HyphenMinusGreaterThanSign )? ( (lv_exp_3_0= ruleValueExpression ) ) otherlv_4= RightParenthesis ) )
            // InternalEldmDslParser.g:2347:2: (otherlv_0= LeftParenthesis ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= HyphenMinusGreaterThanSign )? ( (lv_exp_3_0= ruleValueExpression ) ) otherlv_4= RightParenthesis )
            {
            // InternalEldmDslParser.g:2347:2: (otherlv_0= LeftParenthesis ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= HyphenMinusGreaterThanSign )? ( (lv_exp_3_0= ruleValueExpression ) ) otherlv_4= RightParenthesis )
            // InternalEldmDslParser.g:2348:3: otherlv_0= LeftParenthesis ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= HyphenMinusGreaterThanSign )? ( (lv_exp_3_0= ruleValueExpression ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaCallAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2352:3: ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= HyphenMinusGreaterThanSign )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==HyphenMinusGreaterThanSign) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalEldmDslParser.g:2353:4: ( (lv_param_1_0= RULE_ID ) ) otherlv_2= HyphenMinusGreaterThanSign
                    {
                    // InternalEldmDslParser.g:2353:4: ( (lv_param_1_0= RULE_ID ) )
                    // InternalEldmDslParser.g:2354:5: (lv_param_1_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2354:5: (lv_param_1_0= RULE_ID )
                    // InternalEldmDslParser.g:2355:6: lv_param_1_0= RULE_ID
                    {
                    lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_param_1_0, grammarAccess.getLambdaCallAccess().getParamIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLambdaCallRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"param",
                      							lv_param_1_0,
                      							"net.eldm.EldmDsl.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLambdaCallAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:2376:3: ( (lv_exp_3_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:2377:4: (lv_exp_3_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:2377:4: (lv_exp_3_0= ruleValueExpression )
            // InternalEldmDslParser.g:2378:5: lv_exp_3_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLambdaCallAccess().getExpValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_exp_3_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLambdaCallRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_3_0,
              						"net.eldm.EldmDsl.ValueExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLambdaCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLambdaCall"


    // $ANTLR start "entryRuleFlowExpression"
    // InternalEldmDslParser.g:2403:1: entryRuleFlowExpression returns [EObject current=null] : iv_ruleFlowExpression= ruleFlowExpression EOF ;
    public final EObject entryRuleFlowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowExpression = null;


        try {
            // InternalEldmDslParser.g:2403:55: (iv_ruleFlowExpression= ruleFlowExpression EOF )
            // InternalEldmDslParser.g:2404:2: iv_ruleFlowExpression= ruleFlowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowExpression=ruleFlowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowExpression"


    // $ANTLR start "ruleFlowExpression"
    // InternalEldmDslParser.g:2410:1: ruleFlowExpression returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression ) ;
    public final EObject ruleFlowExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_ForExpression_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2416:2: ( (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression ) )
            // InternalEldmDslParser.g:2417:2: (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression )
            {
            // InternalEldmDslParser.g:2417:2: (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==If) ) {
                alt47=1;
            }
            else if ( (LA47_0==For) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalEldmDslParser.g:2418:3: this_IfExpression_0= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFlowExpressionAccess().getIfExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpression_0=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2427:3: this_ForExpression_1= ruleForExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFlowExpressionAccess().getForExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForExpression_1=ruleForExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowExpression"


    // $ANTLR start "entryRuleIfExpression"
    // InternalEldmDslParser.g:2439:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalEldmDslParser.g:2439:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalEldmDslParser.g:2440:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalEldmDslParser.g:2446:1: ruleIfExpression returns [EObject current=null] : ( ( (lv_flow_0_0= If ) ) ( (lv_cond_1_0= ruleValueExpression ) ) otherlv_2= Then ( ( (lv_then_3_0= ruleValueExpression ) ) | (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) ) ) ( ( ( Else )=>otherlv_6= Else ) ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) ) )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token lv_flow_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;

        EObject lv_else_9_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2452:2: ( ( ( (lv_flow_0_0= If ) ) ( (lv_cond_1_0= ruleValueExpression ) ) otherlv_2= Then ( ( (lv_then_3_0= ruleValueExpression ) ) | (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) ) ) ( ( ( Else )=>otherlv_6= Else ) ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) ) )? ) )
            // InternalEldmDslParser.g:2453:2: ( ( (lv_flow_0_0= If ) ) ( (lv_cond_1_0= ruleValueExpression ) ) otherlv_2= Then ( ( (lv_then_3_0= ruleValueExpression ) ) | (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) ) ) ( ( ( Else )=>otherlv_6= Else ) ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) ) )? )
            {
            // InternalEldmDslParser.g:2453:2: ( ( (lv_flow_0_0= If ) ) ( (lv_cond_1_0= ruleValueExpression ) ) otherlv_2= Then ( ( (lv_then_3_0= ruleValueExpression ) ) | (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) ) ) ( ( ( Else )=>otherlv_6= Else ) ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) ) )? )
            // InternalEldmDslParser.g:2454:3: ( (lv_flow_0_0= If ) ) ( (lv_cond_1_0= ruleValueExpression ) ) otherlv_2= Then ( ( (lv_then_3_0= ruleValueExpression ) ) | (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) ) ) ( ( ( Else )=>otherlv_6= Else ) ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) ) )?
            {
            // InternalEldmDslParser.g:2454:3: ( (lv_flow_0_0= If ) )
            // InternalEldmDslParser.g:2455:4: (lv_flow_0_0= If )
            {
            // InternalEldmDslParser.g:2455:4: (lv_flow_0_0= If )
            // InternalEldmDslParser.g:2456:5: lv_flow_0_0= If
            {
            lv_flow_0_0=(Token)match(input,If,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_flow_0_0, grammarAccess.getIfExpressionAccess().getFlowIfKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIfExpressionRule());
              					}
              					setWithLastConsumed(current, "flow", lv_flow_0_0, "if");
              				
            }

            }


            }

            // InternalEldmDslParser.g:2468:3: ( (lv_cond_1_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:2469:4: (lv_cond_1_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:2469:4: (lv_cond_1_0= ruleValueExpression )
            // InternalEldmDslParser.g:2470:5: lv_cond_1_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getCondValueExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_cond_1_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"net.eldm.EldmDsl.ValueExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Then,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
              		
            }
            // InternalEldmDslParser.g:2491:3: ( ( (lv_then_3_0= ruleValueExpression ) ) | (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==False||LA48_0==Bool||LA48_0==Enum||(LA48_0>=None && LA48_0<=Path)||LA48_0==True||LA48_0==Any||(LA48_0>=Flt && LA48_0<=For)||(LA48_0>=Int && LA48_0<=Ldt)||(LA48_0>=Lst && LA48_0<=Map)||LA48_0==Str||LA48_0==If||LA48_0==ExclamationMark||LA48_0==LeftParenthesis||LA48_0==LeftSquareBracket||LA48_0==LeftCurlyBracket||LA48_0==LeftPointingDoubleAngleQuotationMark||(LA48_0>=RULE_PATH && LA48_0<=RULE_ID)||(LA48_0>=RULE_NATURAL && LA48_0<=RULE_TEXT)) ) {
                alt48=1;
            }
            else if ( (LA48_0==Colon) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalEldmDslParser.g:2492:4: ( (lv_then_3_0= ruleValueExpression ) )
                    {
                    // InternalEldmDslParser.g:2492:4: ( (lv_then_3_0= ruleValueExpression ) )
                    // InternalEldmDslParser.g:2493:5: (lv_then_3_0= ruleValueExpression )
                    {
                    // InternalEldmDslParser.g:2493:5: (lv_then_3_0= ruleValueExpression )
                    // InternalEldmDslParser.g:2494:6: lv_then_3_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpressionAccess().getThenValueExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_then_3_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                      						}
                      						set(
                      							current,
                      							"then",
                      							lv_then_3_0,
                      							"net.eldm.EldmDsl.ValueExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2512:4: (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) )
                    {
                    // InternalEldmDslParser.g:2512:4: (otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) ) )
                    // InternalEldmDslParser.g:2513:5: otherlv_4= Colon ( (lv_then_5_0= ruleBlockExpression ) )
                    {
                    otherlv_4=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getColonKeyword_3_1_0());
                      				
                    }
                    // InternalEldmDslParser.g:2517:5: ( (lv_then_5_0= ruleBlockExpression ) )
                    // InternalEldmDslParser.g:2518:6: (lv_then_5_0= ruleBlockExpression )
                    {
                    // InternalEldmDslParser.g:2518:6: (lv_then_5_0= ruleBlockExpression )
                    // InternalEldmDslParser.g:2519:7: lv_then_5_0= ruleBlockExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getIfExpressionAccess().getThenBlockExpressionParserRuleCall_3_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_52);
                    lv_then_5_0=ruleBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                      							}
                      							set(
                      								current,
                      								"then",
                      								lv_then_5_0,
                      								"net.eldm.EldmDsl.BlockExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:2538:3: ( ( ( Else )=>otherlv_6= Else ) ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Else) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred9_InternalEldmDslParser()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalEldmDslParser.g:2539:4: ( ( Else )=>otherlv_6= Else ) ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) )
                    {
                    // InternalEldmDslParser.g:2539:4: ( ( Else )=>otherlv_6= Else )
                    // InternalEldmDslParser.g:2540:5: ( Else )=>otherlv_6= Else
                    {
                    otherlv_6=(Token)match(input,Else,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getElseKeyword_4_0());
                      				
                    }

                    }

                    // InternalEldmDslParser.g:2546:4: ( ( (lv_else_7_0= ruleValueExpression ) ) | (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==False||LA49_0==Bool||LA49_0==Enum||(LA49_0>=None && LA49_0<=Path)||LA49_0==True||LA49_0==Any||(LA49_0>=Flt && LA49_0<=For)||(LA49_0>=Int && LA49_0<=Ldt)||(LA49_0>=Lst && LA49_0<=Map)||LA49_0==Str||LA49_0==If||LA49_0==ExclamationMark||LA49_0==LeftParenthesis||LA49_0==LeftSquareBracket||LA49_0==LeftCurlyBracket||LA49_0==LeftPointingDoubleAngleQuotationMark||(LA49_0>=RULE_PATH && LA49_0<=RULE_ID)||(LA49_0>=RULE_NATURAL && LA49_0<=RULE_TEXT)) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==Colon) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalEldmDslParser.g:2547:5: ( (lv_else_7_0= ruleValueExpression ) )
                            {
                            // InternalEldmDslParser.g:2547:5: ( (lv_else_7_0= ruleValueExpression ) )
                            // InternalEldmDslParser.g:2548:6: (lv_else_7_0= ruleValueExpression )
                            {
                            // InternalEldmDslParser.g:2548:6: (lv_else_7_0= ruleValueExpression )
                            // InternalEldmDslParser.g:2549:7: lv_else_7_0= ruleValueExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIfExpressionAccess().getElseValueExpressionParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_7_0=ruleValueExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                              							}
                              							set(
                              								current,
                              								"else",
                              								lv_else_7_0,
                              								"net.eldm.EldmDsl.ValueExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalEldmDslParser.g:2567:5: (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) )
                            {
                            // InternalEldmDslParser.g:2567:5: (otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) ) )
                            // InternalEldmDslParser.g:2568:6: otherlv_8= Colon ( (lv_else_9_0= ruleBlockExpression ) )
                            {
                            otherlv_8=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getIfExpressionAccess().getColonKeyword_4_1_1_0());
                              					
                            }
                            // InternalEldmDslParser.g:2572:6: ( (lv_else_9_0= ruleBlockExpression ) )
                            // InternalEldmDslParser.g:2573:7: (lv_else_9_0= ruleBlockExpression )
                            {
                            // InternalEldmDslParser.g:2573:7: (lv_else_9_0= ruleBlockExpression )
                            // InternalEldmDslParser.g:2574:8: lv_else_9_0= ruleBlockExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getIfExpressionAccess().getElseBlockExpressionParserRuleCall_4_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_9_0=ruleBlockExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                              								}
                              								set(
                              									current,
                              									"else",
                              									lv_else_9_0,
                              									"net.eldm.EldmDsl.BlockExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleForExpression"
    // InternalEldmDslParser.g:2598:1: entryRuleForExpression returns [EObject current=null] : iv_ruleForExpression= ruleForExpression EOF ;
    public final EObject entryRuleForExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpression = null;


        try {
            // InternalEldmDslParser.g:2598:54: (iv_ruleForExpression= ruleForExpression EOF )
            // InternalEldmDslParser.g:2599:2: iv_ruleForExpression= ruleForExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForExpression=ruleForExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForExpression"


    // $ANTLR start "ruleForExpression"
    // InternalEldmDslParser.g:2605:1: ruleForExpression returns [EObject current=null] : ( ( (lv_flow_0_0= For ) ) ( (lv_param_1_0= RULE_ID ) ) otherlv_2= In ( (lv_for_3_0= ruleValueExpression ) ) ( (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) ) | (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) ) ) ) ;
    public final EObject ruleForExpression() throws RecognitionException {
        EObject current = null;

        Token lv_flow_0_0=null;
        Token lv_param_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_for_3_0 = null;

        EObject lv_each_5_0 = null;

        EObject lv_each_7_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2611:2: ( ( ( (lv_flow_0_0= For ) ) ( (lv_param_1_0= RULE_ID ) ) otherlv_2= In ( (lv_for_3_0= ruleValueExpression ) ) ( (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) ) | (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) ) ) ) )
            // InternalEldmDslParser.g:2612:2: ( ( (lv_flow_0_0= For ) ) ( (lv_param_1_0= RULE_ID ) ) otherlv_2= In ( (lv_for_3_0= ruleValueExpression ) ) ( (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) ) | (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) ) ) )
            {
            // InternalEldmDslParser.g:2612:2: ( ( (lv_flow_0_0= For ) ) ( (lv_param_1_0= RULE_ID ) ) otherlv_2= In ( (lv_for_3_0= ruleValueExpression ) ) ( (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) ) | (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) ) ) )
            // InternalEldmDslParser.g:2613:3: ( (lv_flow_0_0= For ) ) ( (lv_param_1_0= RULE_ID ) ) otherlv_2= In ( (lv_for_3_0= ruleValueExpression ) ) ( (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) ) | (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) ) )
            {
            // InternalEldmDslParser.g:2613:3: ( (lv_flow_0_0= For ) )
            // InternalEldmDslParser.g:2614:4: (lv_flow_0_0= For )
            {
            // InternalEldmDslParser.g:2614:4: (lv_flow_0_0= For )
            // InternalEldmDslParser.g:2615:5: lv_flow_0_0= For
            {
            lv_flow_0_0=(Token)match(input,For,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_flow_0_0, grammarAccess.getForExpressionAccess().getFlowForKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForExpressionRule());
              					}
              					setWithLastConsumed(current, "flow", lv_flow_0_0, "for");
              				
            }

            }


            }

            // InternalEldmDslParser.g:2627:3: ( (lv_param_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:2628:4: (lv_param_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2628:4: (lv_param_1_0= RULE_ID )
            // InternalEldmDslParser.g:2629:5: lv_param_1_0= RULE_ID
            {
            lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_param_1_0, grammarAccess.getForExpressionAccess().getParamIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForExpressionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"param",
              						lv_param_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,In,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForExpressionAccess().getInKeyword_2());
              		
            }
            // InternalEldmDslParser.g:2649:3: ( (lv_for_3_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:2650:4: (lv_for_3_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:2650:4: (lv_for_3_0= ruleValueExpression )
            // InternalEldmDslParser.g:2651:5: lv_for_3_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForExpressionAccess().getForValueExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_54);
            lv_for_3_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForExpressionRule());
              					}
              					set(
              						current,
              						"for",
              						lv_for_3_0,
              						"net.eldm.EldmDsl.ValueExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEldmDslParser.g:2668:3: ( (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) ) | (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Map) ) {
                alt51=1;
            }
            else if ( (LA51_0==Colon) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalEldmDslParser.g:2669:4: (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) )
                    {
                    // InternalEldmDslParser.g:2669:4: (otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) ) )
                    // InternalEldmDslParser.g:2670:5: otherlv_4= Map ( (lv_each_5_0= ruleValueExpression ) )
                    {
                    otherlv_4=(Token)match(input,Map,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getForExpressionAccess().getMapKeyword_4_0_0());
                      				
                    }
                    // InternalEldmDslParser.g:2674:5: ( (lv_each_5_0= ruleValueExpression ) )
                    // InternalEldmDslParser.g:2675:6: (lv_each_5_0= ruleValueExpression )
                    {
                    // InternalEldmDslParser.g:2675:6: (lv_each_5_0= ruleValueExpression )
                    // InternalEldmDslParser.g:2676:7: lv_each_5_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getForExpressionAccess().getEachValueExpressionParserRuleCall_4_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_each_5_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getForExpressionRule());
                      							}
                      							set(
                      								current,
                      								"each",
                      								lv_each_5_0,
                      								"net.eldm.EldmDsl.ValueExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2695:4: (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) )
                    {
                    // InternalEldmDslParser.g:2695:4: (otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) ) )
                    // InternalEldmDslParser.g:2696:5: otherlv_6= Colon ( (lv_each_7_0= ruleBlockExpression ) )
                    {
                    otherlv_6=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getForExpressionAccess().getColonKeyword_4_1_0());
                      				
                    }
                    // InternalEldmDslParser.g:2700:5: ( (lv_each_7_0= ruleBlockExpression ) )
                    // InternalEldmDslParser.g:2701:6: (lv_each_7_0= ruleBlockExpression )
                    {
                    // InternalEldmDslParser.g:2701:6: (lv_each_7_0= ruleBlockExpression )
                    // InternalEldmDslParser.g:2702:7: lv_each_7_0= ruleBlockExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getForExpressionAccess().getEachBlockExpressionParserRuleCall_4_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_each_7_0=ruleBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getForExpressionRule());
                      							}
                      							set(
                      								current,
                      								"each",
                      								lv_each_7_0,
                      								"net.eldm.EldmDsl.BlockExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForExpression"


    // $ANTLR start "entryRuleDefinition"
    // InternalEldmDslParser.g:2725:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalEldmDslParser.g:2725:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalEldmDslParser.g:2726:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalEldmDslParser.g:2732:1: ruleDefinition returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_ExternalDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2738:2: ( (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) )
            // InternalEldmDslParser.g:2739:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            {
            // InternalEldmDslParser.g:2739:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Typedef) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalEldmDslParser.g:2740:3: this_TypeDef_0= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getTypeDefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDef_0=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeDef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2749:3: this_ExternalDef_1= ruleExternalDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getExternalDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternalDef_1=ruleExternalDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternalDef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleTypeDef"
    // InternalEldmDslParser.g:2761:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEldmDslParser.g:2761:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEldmDslParser.g:2762:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalEldmDslParser.g:2768:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_parser_2_1=null;
        Token lv_parser_2_2=null;
        Token lv_code_3_0=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2774:2: ( (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) ) )
            // InternalEldmDslParser.g:2775:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) )
            {
            // InternalEldmDslParser.g:2775:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) )
            // InternalEldmDslParser.g:2776:3: otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) )
            {
            otherlv_0=(Token)match(input,Typedef,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:2781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2781:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:2782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:2798:3: ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Match||LA54_0==Mask) ) {
                alt54=1;
            }
            else if ( (LA54_0==Bool||LA54_0==Enum||(LA54_0>=None && LA54_0<=Path)||LA54_0==Any||LA54_0==Flt||(LA54_0>=Int && LA54_0<=Ldt)||(LA54_0>=Lst && LA54_0<=Map)||LA54_0==Str||LA54_0==FullStopFullStop||LA54_0==LeftParenthesis||LA54_0==LeftCurlyBracket||LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalEldmDslParser.g:2799:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    {
                    // InternalEldmDslParser.g:2799:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    // InternalEldmDslParser.g:2800:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) )
                    {
                    // InternalEldmDslParser.g:2800:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) )
                    // InternalEldmDslParser.g:2801:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    {
                    // InternalEldmDslParser.g:2801:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    // InternalEldmDslParser.g:2802:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    {
                    // InternalEldmDslParser.g:2802:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==Match) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==Mask) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalEldmDslParser.g:2803:8: lv_parser_2_1= Match
                            {
                            lv_parser_2_1=(Token)match(input,Match,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_parser_2_1, grammarAccess.getTypeDefAccess().getParserMatchKeyword_2_0_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTypeDefRule());
                              								}
                              								setWithLastConsumed(current, "parser", lv_parser_2_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalEldmDslParser.g:2814:8: lv_parser_2_2= Mask
                            {
                            lv_parser_2_2=(Token)match(input,Mask,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_parser_2_2, grammarAccess.getTypeDefAccess().getParserMaskKeyword_2_0_0_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTypeDefRule());
                              								}
                              								setWithLastConsumed(current, "parser", lv_parser_2_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalEldmDslParser.g:2827:5: ( (lv_code_3_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:2828:6: (lv_code_3_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:2828:6: (lv_code_3_0= RULE_TEXT )
                    // InternalEldmDslParser.g:2829:7: lv_code_3_0= RULE_TEXT
                    {
                    lv_code_3_0=(Token)match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_code_3_0, grammarAccess.getTypeDefAccess().getCodeTEXTTerminalRuleCall_2_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTypeDefRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"code",
                      								lv_code_3_0,
                      								"net.eldm.EldmDsl.TEXT");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2847:4: ( (lv_type_4_0= ruleTopDef ) )
                    {
                    // InternalEldmDslParser.g:2847:4: ( (lv_type_4_0= ruleTopDef ) )
                    // InternalEldmDslParser.g:2848:5: (lv_type_4_0= ruleTopDef )
                    {
                    // InternalEldmDslParser.g:2848:5: (lv_type_4_0= ruleTopDef )
                    // InternalEldmDslParser.g:2849:6: lv_type_4_0= ruleTopDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTopDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleTopDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_4_0,
                      							"net.eldm.EldmDsl.TopDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleTopDef"
    // InternalEldmDslParser.g:2871:1: entryRuleTopDef returns [EObject current=null] : iv_ruleTopDef= ruleTopDef EOF ;
    public final EObject entryRuleTopDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopDef = null;


        try {
            // InternalEldmDslParser.g:2871:47: (iv_ruleTopDef= ruleTopDef EOF )
            // InternalEldmDslParser.g:2872:2: iv_ruleTopDef= ruleTopDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopDef=ruleTopDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopDef"


    // $ANTLR start "ruleTopDef"
    // InternalEldmDslParser.g:2878:1: ruleTopDef returns [EObject current=null] : (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef | this_LambdaDef_2= ruleLambdaDef ) ;
    public final EObject ruleTopDef() throws RecognitionException {
        EObject current = null;

        EObject this_ElementDef_0 = null;

        EObject this_EnumDef_1 = null;

        EObject this_LambdaDef_2 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2884:2: ( (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef | this_LambdaDef_2= ruleLambdaDef ) )
            // InternalEldmDslParser.g:2885:2: (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef | this_LambdaDef_2= ruleLambdaDef )
            {
            // InternalEldmDslParser.g:2885:2: (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef | this_LambdaDef_2= ruleLambdaDef )
            int alt55=3;
            switch ( input.LA(1) ) {
            case Bool:
            case None:
            case Path:
            case Any:
            case Flt:
            case Int:
            case Lda:
            case Ldt:
            case Lst:
            case Ltm:
            case Map:
            case Str:
            case FullStopFullStop:
            case LeftCurlyBracket:
            case RULE_ID:
                {
                alt55=1;
                }
                break;
            case Enum:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==Colon||LA55_2==LeftCurlyBracket) ) {
                    alt55=2;
                }
                else if ( (LA55_2==EOF||LA55_2==Typedef||LA55_2==Func||LA55_2==Let||LA55_2==Var||LA55_2==RULE_END||LA55_2==RULE_ID) ) {
                    alt55=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalEldmDslParser.g:2886:3: this_ElementDef_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopDefAccess().getElementDefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementDef_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElementDef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2895:3: this_EnumDef_1= ruleEnumDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopDefAccess().getEnumDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumDef_1=ruleEnumDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumDef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:2904:3: this_LambdaDef_2= ruleLambdaDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopDefAccess().getLambdaDefParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LambdaDef_2=ruleLambdaDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LambdaDef_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopDef"


    // $ANTLR start "entryRuleElementDef"
    // InternalEldmDslParser.g:2916:1: entryRuleElementDef returns [EObject current=null] : iv_ruleElementDef= ruleElementDef EOF ;
    public final EObject entryRuleElementDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDef = null;


        try {
            // InternalEldmDslParser.g:2916:51: (iv_ruleElementDef= ruleElementDef EOF )
            // InternalEldmDslParser.g:2917:2: iv_ruleElementDef= ruleElementDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementDef=ruleElementDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDef"


    // $ANTLR start "ruleElementDef"
    // InternalEldmDslParser.g:2923:1: ruleElementDef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef ) ;
    public final EObject ruleElementDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_InferredDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2929:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef ) )
            // InternalEldmDslParser.g:2930:2: ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef )
            {
            // InternalEldmDslParser.g:2930:2: ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==Bool||LA56_0==Enum||(LA56_0>=None && LA56_0<=Path)||LA56_0==Any||LA56_0==Flt||(LA56_0>=Int && LA56_0<=Ldt)||(LA56_0>=Lst && LA56_0<=Map)||LA56_0==Str||LA56_0==FullStopFullStop||LA56_0==LeftCurlyBracket) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalEldmDslParser.g:2931:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:2931:3: ( (otherlv_0= RULE_ID ) )
                    // InternalEldmDslParser.g:2932:4: (otherlv_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2932:4: (otherlv_0= RULE_ID )
                    // InternalEldmDslParser.g:2933:5: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementDefRule());
                      					}
                      				
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getElementDefAccess().getRefDefinitionCrossReference_0_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2945:3: this_InferredDef_1= ruleInferredDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementDefAccess().getInferredDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InferredDef_1=ruleInferredDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InferredDef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementDef"


    // $ANTLR start "entryRuleInferredDef"
    // InternalEldmDslParser.g:2957:1: entryRuleInferredDef returns [EObject current=null] : iv_ruleInferredDef= ruleInferredDef EOF ;
    public final EObject entryRuleInferredDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInferredDef = null;


        try {
            // InternalEldmDslParser.g:2957:52: (iv_ruleInferredDef= ruleInferredDef EOF )
            // InternalEldmDslParser.g:2958:2: iv_ruleInferredDef= ruleInferredDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInferredDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInferredDef=ruleInferredDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInferredDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInferredDef"


    // $ANTLR start "ruleInferredDef"
    // InternalEldmDslParser.g:2964:1: ruleInferredDef returns [EObject current=null] : ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef ) ;
    public final EObject ruleInferredDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_native_0_0 = null;

        EObject this_ListDef_1 = null;

        EObject this_MapDef_2 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2970:2: ( ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef ) )
            // InternalEldmDslParser.g:2971:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef )
            {
            // InternalEldmDslParser.g:2971:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef )
            int alt57=3;
            switch ( input.LA(1) ) {
            case Bool:
            case Enum:
            case None:
            case Path:
            case Any:
            case Flt:
            case Int:
            case Lda:
            case Ldt:
            case Lst:
            case Ltm:
            case Map:
            case Str:
                {
                alt57=1;
                }
                break;
            case FullStopFullStop:
                {
                alt57=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalEldmDslParser.g:2972:3: ( (lv_native_0_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:2972:3: ( (lv_native_0_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:2973:4: (lv_native_0_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:2973:4: (lv_native_0_0= ruleNativeDef )
                    // InternalEldmDslParser.g:2974:5: lv_native_0_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInferredDefAccess().getNativeNativeDefParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_native_0_0=ruleNativeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInferredDefRule());
                      					}
                      					set(
                      						current,
                      						"native",
                      						lv_native_0_0,
                      						"net.eldm.EldmDsl.NativeDef");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2992:3: this_ListDef_1= ruleListDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInferredDefAccess().getListDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListDef_1=ruleListDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListDef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:3001:3: this_MapDef_2= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInferredDefAccess().getMapDefParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapDef_2=ruleMapDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapDef_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInferredDef"


    // $ANTLR start "entryRuleListDef"
    // InternalEldmDslParser.g:3013:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalEldmDslParser.g:3013:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalEldmDslParser.g:3014:2: iv_ruleListDef= ruleListDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListDef=ruleListDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListDef"


    // $ANTLR start "ruleListDef"
    // InternalEldmDslParser.g:3020:1: ruleListDef returns [EObject current=null] : ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3026:2: ( ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) )
            // InternalEldmDslParser.g:3027:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            {
            // InternalEldmDslParser.g:3027:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            // InternalEldmDslParser.g:3028:3: () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) )
            {
            // InternalEldmDslParser.g:3028:3: ()
            // InternalEldmDslParser.g:3029:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListDefAccess().getListDefAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListDefAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3039:3: ( (lv_type_2_0= ruleElementDef ) )
            // InternalEldmDslParser.g:3040:4: (lv_type_2_0= ruleElementDef )
            {
            // InternalEldmDslParser.g:3040:4: (lv_type_2_0= ruleElementDef )
            // InternalEldmDslParser.g:3041:5: lv_type_2_0= ruleElementDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getTypeElementDefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleElementDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListDefRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"net.eldm.EldmDsl.ElementDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListDef"


    // $ANTLR start "entryRuleMapDef"
    // InternalEldmDslParser.g:3062:1: entryRuleMapDef returns [EObject current=null] : iv_ruleMapDef= ruleMapDef EOF ;
    public final EObject entryRuleMapDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapDef = null;


        try {
            // InternalEldmDslParser.g:3062:47: (iv_ruleMapDef= ruleMapDef EOF )
            // InternalEldmDslParser.g:3063:2: iv_ruleMapDef= ruleMapDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapDef=ruleMapDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapDef"


    // $ANTLR start "ruleMapDef"
    // InternalEldmDslParser.g:3069:1: ruleMapDef returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) ) ;
    public final EObject ruleMapDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_ext_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token otherlv_12=null;
        Token lv_ext_15_0=null;
        Token this_END_16=null;
        Token otherlv_17=null;
        EObject lv_defs_2_0 = null;

        EObject lv_defs_4_0 = null;

        EObject lv_defs_11_0 = null;

        EObject lv_defs_14_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3075:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:3076:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:3076:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LeftCurlyBracket) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==RULE_ID) && (synpred10_InternalEldmDslParser())) {
                    alt65=1;
                }
                else if ( (LA65_1==Comma) && (synpred10_InternalEldmDslParser())) {
                    alt65=1;
                }
                else if ( (LA65_1==RightCurlyBracket) && (synpred10_InternalEldmDslParser())) {
                    alt65=1;
                }
                else if ( (LA65_1==RULE_BEGIN) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalEldmDslParser.g:3077:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:3077:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:3078:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3108:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket )
                    // InternalEldmDslParser.g:3109:5: () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3109:5: ()
                    // InternalEldmDslParser.g:3110:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapDefAccess().getMapDefAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:3120:5: ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_ID) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalEldmDslParser.g:3121:6: ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:3121:6: ( (lv_defs_2_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:3122:7: (lv_defs_2_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:3122:7: (lv_defs_2_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:3123:8: lv_defs_2_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_57);
                            lv_defs_2_0=ruleMapEntryDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getMapDefRule());
                              								}
                              								add(
                              									current,
                              									"defs",
                              									lv_defs_2_0,
                              									"net.eldm.EldmDsl.MapEntryDef");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalEldmDslParser.g:3140:6: (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==Comma) ) {
                                    int LA58_1 = input.LA(2);

                                    if ( (LA58_1==RULE_ID) ) {
                                        alt58=1;
                                    }


                                }


                                switch (alt58) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3141:7: otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:3145:7: ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:3146:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:3146:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:3147:9: lv_defs_4_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_57);
                            	    lv_defs_4_0=ruleMapEntryDef();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getMapDefRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"defs",
                            	      										lv_defs_4_0,
                            	      										"net.eldm.EldmDsl.MapEntryDef");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:3166:5: (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==Comma) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalEldmDslParser.g:3167:6: otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) )
                            {
                            otherlv_5=(Token)match(input,Comma,FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_3_0());
                              					
                            }
                            // InternalEldmDslParser.g:3171:6: ( (lv_ext_6_0= QuestionMark ) )
                            // InternalEldmDslParser.g:3172:7: (lv_ext_6_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:3172:7: (lv_ext_6_0= QuestionMark )
                            // InternalEldmDslParser.g:3173:8: lv_ext_6_0= QuestionMark
                            {
                            lv_ext_6_0=(Token)match(input,QuestionMark,FOLLOW_59); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_ext_6_0, grammarAccess.getMapDefAccess().getExtQuestionMarkKeyword_0_0_3_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getMapDefRule());
                              								}
                              								setWithLastConsumed(current, "ext", true, "?");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_0_0_4());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3193:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3193:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket )
                    // InternalEldmDslParser.g:3194:4: () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3194:4: ()
                    // InternalEldmDslParser.g:3195:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMapDefAccess().getMapDefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,LeftCurlyBracket,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_10, grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:3209:4: ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalEldmDslParser.g:3210:5: ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:3210:5: ( (lv_defs_11_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:3211:6: (lv_defs_11_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:3211:6: (lv_defs_11_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:3212:7: lv_defs_11_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_61);
                            lv_defs_11_0=ruleMapEntryDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMapDefRule());
                              							}
                              							add(
                              								current,
                              								"defs",
                              								lv_defs_11_0,
                              								"net.eldm.EldmDsl.MapEntryDef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalEldmDslParser.g:3229:5: ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==EOF||(LA62_0>=Definitions && LA62_0<=PlugDsl)||LA62_0==Import||LA62_0==Catch||LA62_0==Def||LA62_0==Out||LA62_0==In||(LA62_0>=LineFeed && LA62_0<=CarriageReturn)||LA62_0==Comma||LA62_0==RULE_ID) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3230:6: (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) )
                            	    {
                            	    // InternalEldmDslParser.g:3230:6: (otherlv_12= Comma )?
                            	    int alt61=2;
                            	    int LA61_0 = input.LA(1);

                            	    if ( (LA61_0==Comma) ) {
                            	        alt61=1;
                            	    }
                            	    switch (alt61) {
                            	        case 1 :
                            	            // InternalEldmDslParser.g:3231:7: otherlv_12= Comma
                            	            {
                            	            otherlv_12=(Token)match(input,Comma,FOLLOW_62); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(otherlv_12, grammarAccess.getMapDefAccess().getCommaKeyword_1_3_1_0());
                            	              						
                            	            }

                            	            }
                            	            break;

                            	    }

                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapDefAccess().getBREAKParserRuleCall_1_3_1_1());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_18);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:3243:6: ( (lv_defs_14_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:3244:7: (lv_defs_14_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:3244:7: (lv_defs_14_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:3245:8: lv_defs_14_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_2_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_61);
                            	    lv_defs_14_0=ruleMapEntryDef();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getMapDefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"defs",
                            	      									lv_defs_14_0,
                            	      									"net.eldm.EldmDsl.MapEntryDef");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop62;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:3264:4: ( (lv_ext_15_0= QuestionMark ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==QuestionMark) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalEldmDslParser.g:3265:5: (lv_ext_15_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:3265:5: (lv_ext_15_0= QuestionMark )
                            // InternalEldmDslParser.g:3266:6: lv_ext_15_0= QuestionMark
                            {
                            lv_ext_15_0=(Token)match(input,QuestionMark,FOLLOW_63); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_ext_15_0, grammarAccess.getMapDefAccess().getExtQuestionMarkKeyword_1_4_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMapDefRule());
                              						}
                              						setWithLastConsumed(current, "ext", true, "?");
                              					
                            }

                            }


                            }
                            break;

                    }

                    this_END_16=(Token)match(input,RULE_END,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_16, grammarAccess.getMapDefAccess().getENDTerminalRuleCall_1_5());
                      			
                    }
                    otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapDef"


    // $ANTLR start "entryRuleMapEntryDef"
    // InternalEldmDslParser.g:3291:1: entryRuleMapEntryDef returns [EObject current=null] : iv_ruleMapEntryDef= ruleMapEntryDef EOF ;
    public final EObject entryRuleMapEntryDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryDef = null;


        try {
            // InternalEldmDslParser.g:3291:52: (iv_ruleMapEntryDef= ruleMapEntryDef EOF )
            // InternalEldmDslParser.g:3292:2: iv_ruleMapEntryDef= ruleMapEntryDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapEntryDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapEntryDef=ruleMapEntryDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapEntryDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapEntryDef"


    // $ANTLR start "ruleMapEntryDef"
    // InternalEldmDslParser.g:3298:1: ruleMapEntryDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) ;
    public final EObject ruleMapEntryDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_opt_1_0=null;
        Token otherlv_2=null;
        Token lv_opt_4_0=null;
        EObject lv_type_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3304:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) )
            // InternalEldmDslParser.g:3305:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            {
            // InternalEldmDslParser.g:3305:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            // InternalEldmDslParser.g:3306:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            {
            // InternalEldmDslParser.g:3306:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:3307:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:3307:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:3308:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMapEntryDefAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapEntryDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:3324:3: ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            int alt67=3;
            switch ( input.LA(1) ) {
                case QuestionMark:
                    {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==Colon) ) {
                        alt67=1;
                    }
                    }
                    break;
                case Colon:
                    {
                    alt67=1;
                    }
                    break;
                case EqualsSign:
                    {
                    alt67=2;
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // InternalEldmDslParser.g:3325:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    {
                    // InternalEldmDslParser.g:3325:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    // InternalEldmDslParser.g:3326:5: ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:3326:5: ( (lv_opt_1_0= QuestionMark ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==QuestionMark) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalEldmDslParser.g:3327:6: (lv_opt_1_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:3327:6: (lv_opt_1_0= QuestionMark )
                            // InternalEldmDslParser.g:3328:7: lv_opt_1_0= QuestionMark
                            {
                            lv_opt_1_0=(Token)match(input,QuestionMark,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_opt_1_0, grammarAccess.getMapEntryDefAccess().getOptQuestionMarkKeyword_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMapEntryDefRule());
                              							}
                              							setWithLastConsumed(current, "opt", true, "?");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,Colon,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMapEntryDefAccess().getColonKeyword_1_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:3344:5: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:3345:6: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:3345:6: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:3346:7: lv_type_3_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMapEntryDefAccess().getTypeElementDefParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMapEntryDefRule());
                      							}
                      							set(
                      								current,
                      								"type",
                      								lv_type_3_0,
                      								"net.eldm.EldmDsl.ElementDef");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3365:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    {
                    // InternalEldmDslParser.g:3365:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    // InternalEldmDslParser.g:3366:5: ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:3366:5: ( (lv_opt_4_0= EqualsSign ) )
                    // InternalEldmDslParser.g:3367:6: (lv_opt_4_0= EqualsSign )
                    {
                    // InternalEldmDslParser.g:3367:6: (lv_opt_4_0= EqualsSign )
                    // InternalEldmDslParser.g:3368:7: lv_opt_4_0= EqualsSign
                    {
                    lv_opt_4_0=(Token)match(input,EqualsSign,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_opt_4_0, grammarAccess.getMapEntryDefAccess().getOptEqualsSignKeyword_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMapEntryDefRule());
                      							}
                      							setWithLastConsumed(current, "opt", true, "=");
                      						
                    }

                    }


                    }

                    // InternalEldmDslParser.g:3380:5: ( (lv_value_5_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:3381:6: (lv_value_5_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:3381:6: (lv_value_5_0= ruleLiteral )
                    // InternalEldmDslParser.g:3382:7: lv_value_5_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMapEntryDefAccess().getValueLiteralParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMapEntryDefRule());
                      							}
                      							set(
                      								current,
                      								"value",
                      								lv_value_5_0,
                      								"net.eldm.EldmDsl.Literal");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapEntryDef"


    // $ANTLR start "entryRuleEnumDef"
    // InternalEldmDslParser.g:3405:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // InternalEldmDslParser.g:3405:48: (iv_ruleEnumDef= ruleEnumDef EOF )
            // InternalEldmDslParser.g:3406:2: iv_ruleEnumDef= ruleEnumDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumDef=ruleEnumDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumDef"


    // $ANTLR start "ruleEnumDef"
    // InternalEldmDslParser.g:3412:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleEnumDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_type_1_0 = null;

        EObject lv_defs_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3418:2: ( (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) )
            // InternalEldmDslParser.g:3419:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            {
            // InternalEldmDslParser.g:3419:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            // InternalEldmDslParser.g:3420:3: otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Enum,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
              		
            }
            // InternalEldmDslParser.g:3424:3: ( (lv_type_1_0= ruleMapDef ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LeftCurlyBracket) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEldmDslParser.g:3425:4: (lv_type_1_0= ruleMapDef )
                    {
                    // InternalEldmDslParser.g:3425:4: (lv_type_1_0= ruleMapDef )
                    // InternalEldmDslParser.g:3426:5: lv_type_1_0= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefAccess().getTypeMapDefParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_type_1_0=ruleMapDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEnumDefRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_1_0,
                      						"net.eldm.EldmDsl.MapDef");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumDefAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getEnumDefAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalEldmDslParser.g:3451:3: ( (lv_defs_4_0= ruleEnumItemDef ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalEldmDslParser.g:3452:4: (lv_defs_4_0= ruleEnumItemDef )
            	    {
            	    // InternalEldmDslParser.g:3452:4: (lv_defs_4_0= ruleEnumItemDef )
            	    // InternalEldmDslParser.g:3453:5: lv_defs_4_0= ruleEnumItemDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_66);
            	    lv_defs_4_0=ruleEnumItemDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumDefRule());
            	      					}
            	      					add(
            	      						current,
            	      						"defs",
            	      						lv_defs_4_0,
            	      						"net.eldm.EldmDsl.EnumItemDef");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_5, grammarAccess.getEnumDefAccess().getENDTerminalRuleCall_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumDef"


    // $ANTLR start "entryRuleEnumItemDef"
    // InternalEldmDslParser.g:3478:1: entryRuleEnumItemDef returns [EObject current=null] : iv_ruleEnumItemDef= ruleEnumItemDef EOF ;
    public final EObject entryRuleEnumItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItemDef = null;


        try {
            // InternalEldmDslParser.g:3478:52: (iv_ruleEnumItemDef= ruleEnumItemDef EOF )
            // InternalEldmDslParser.g:3479:2: iv_ruleEnumItemDef= ruleEnumItemDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumItemDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumItemDef=ruleEnumItemDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumItemDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumItemDef"


    // $ANTLR start "ruleEnumItemDef"
    // InternalEldmDslParser.g:3485:1: ruleEnumItemDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) ;
    public final EObject ruleEnumItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3491:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) )
            // InternalEldmDslParser.g:3492:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            {
            // InternalEldmDslParser.g:3492:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            // InternalEldmDslParser.g:3493:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )?
            {
            // InternalEldmDslParser.g:3493:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:3494:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:3494:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:3495:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getEnumItemDefAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumItemDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:3511:3: ( (lv_value_1_0= ruleMapLiteral ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LeftCurlyBracket) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalEldmDslParser.g:3512:4: (lv_value_1_0= ruleMapLiteral )
                    {
                    // InternalEldmDslParser.g:3512:4: (lv_value_1_0= ruleMapLiteral )
                    // InternalEldmDslParser.g:3513:5: lv_value_1_0= ruleMapLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumItemDefAccess().getValueMapLiteralParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleMapLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEnumItemDefRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_1_0,
                      						"net.eldm.EldmDsl.MapLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumItemDef"


    // $ANTLR start "entryRuleLambdaDef"
    // InternalEldmDslParser.g:3534:1: entryRuleLambdaDef returns [EObject current=null] : iv_ruleLambdaDef= ruleLambdaDef EOF ;
    public final EObject entryRuleLambdaDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaDef = null;


        try {
            // InternalEldmDslParser.g:3534:50: (iv_ruleLambdaDef= ruleLambdaDef EOF )
            // InternalEldmDslParser.g:3535:2: iv_ruleLambdaDef= ruleLambdaDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLambdaDef=ruleLambdaDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLambdaDef"


    // $ANTLR start "ruleLambdaDef"
    // InternalEldmDslParser.g:3541:1: ruleLambdaDef returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_param_2_0= ruleElementDef ) ) (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )? )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleLambdaDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_2_0 = null;

        EObject lv_result_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3547:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_param_2_0= ruleElementDef ) ) (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )? )? otherlv_5= RightParenthesis ) )
            // InternalEldmDslParser.g:3548:2: ( () otherlv_1= LeftParenthesis ( ( (lv_param_2_0= ruleElementDef ) ) (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )? )? otherlv_5= RightParenthesis )
            {
            // InternalEldmDslParser.g:3548:2: ( () otherlv_1= LeftParenthesis ( ( (lv_param_2_0= ruleElementDef ) ) (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )? )? otherlv_5= RightParenthesis )
            // InternalEldmDslParser.g:3549:3: () otherlv_1= LeftParenthesis ( ( (lv_param_2_0= ruleElementDef ) ) (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )? )? otherlv_5= RightParenthesis
            {
            // InternalEldmDslParser.g:3549:3: ()
            // InternalEldmDslParser.g:3550:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLambdaDefAccess().getLambdaDefAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaDefAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3560:3: ( ( (lv_param_2_0= ruleElementDef ) ) (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )? )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Bool||LA72_0==Enum||(LA72_0>=None && LA72_0<=Path)||LA72_0==Any||LA72_0==Flt||(LA72_0>=Int && LA72_0<=Ldt)||(LA72_0>=Lst && LA72_0<=Map)||LA72_0==Str||LA72_0==FullStopFullStop||LA72_0==LeftCurlyBracket||LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalEldmDslParser.g:3561:4: ( (lv_param_2_0= ruleElementDef ) ) (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )?
                    {
                    // InternalEldmDslParser.g:3561:4: ( (lv_param_2_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:3562:5: (lv_param_2_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:3562:5: (lv_param_2_0= ruleElementDef )
                    // InternalEldmDslParser.g:3563:6: lv_param_2_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLambdaDefAccess().getParamElementDefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_param_2_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLambdaDefRule());
                      						}
                      						set(
                      							current,
                      							"param",
                      							lv_param_2_0,
                      							"net.eldm.EldmDsl.ElementDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:3580:4: (otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==HyphenMinusGreaterThanSign) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalEldmDslParser.g:3581:5: otherlv_3= HyphenMinusGreaterThanSign ( (lv_result_4_0= ruleElementDef ) )
                            {
                            otherlv_3=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getLambdaDefAccess().getHyphenMinusGreaterThanSignKeyword_2_1_0());
                              				
                            }
                            // InternalEldmDslParser.g:3585:5: ( (lv_result_4_0= ruleElementDef ) )
                            // InternalEldmDslParser.g:3586:6: (lv_result_4_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:3586:6: (lv_result_4_0= ruleElementDef )
                            // InternalEldmDslParser.g:3587:7: lv_result_4_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLambdaDefAccess().getResultElementDefParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_30);
                            lv_result_4_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLambdaDefRule());
                              							}
                              							set(
                              								current,
                              								"result",
                              								lv_result_4_0,
                              								"net.eldm.EldmDsl.ElementDef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLambdaDefAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLambdaDef"


    // $ANTLR start "entryRuleNativeDef"
    // InternalEldmDslParser.g:3614:1: entryRuleNativeDef returns [String current=null] : iv_ruleNativeDef= ruleNativeDef EOF ;
    public final String entryRuleNativeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNativeDef = null;


        try {
            // InternalEldmDslParser.g:3614:49: (iv_ruleNativeDef= ruleNativeDef EOF )
            // InternalEldmDslParser.g:3615:2: iv_ruleNativeDef= ruleNativeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNativeDef=ruleNativeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeDef.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNativeDef"


    // $ANTLR start "ruleNativeDef"
    // InternalEldmDslParser.g:3621:1: ruleNativeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= None | kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) ;
    public final AntlrDatatypeRuleToken ruleNativeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3627:2: ( (kw= None | kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) )
            // InternalEldmDslParser.g:3628:2: (kw= None | kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            {
            // InternalEldmDslParser.g:3628:2: (kw= None | kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            int alt73=13;
            switch ( input.LA(1) ) {
            case None:
                {
                alt73=1;
                }
                break;
            case Any:
                {
                alt73=2;
                }
                break;
            case Path:
                {
                alt73=3;
                }
                break;
            case Bool:
                {
                alt73=4;
                }
                break;
            case Str:
                {
                alt73=5;
                }
                break;
            case Int:
                {
                alt73=6;
                }
                break;
            case Flt:
                {
                alt73=7;
                }
                break;
            case Lda:
                {
                alt73=8;
                }
                break;
            case Ltm:
                {
                alt73=9;
                }
                break;
            case Ldt:
                {
                alt73=10;
                }
                break;
            case Map:
                {
                alt73=11;
                }
                break;
            case Lst:
                {
                alt73=12;
                }
                break;
            case Enum:
                {
                alt73=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalEldmDslParser.g:3629:3: kw= None
                    {
                    kw=(Token)match(input,None,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getNoneKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3635:3: kw= Any
                    {
                    kw=(Token)match(input,Any,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getAnyKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:3641:3: kw= Path
                    {
                    kw=(Token)match(input,Path,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getPathKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:3647:3: kw= Bool
                    {
                    kw=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getBoolKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:3653:3: kw= Str
                    {
                    kw=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getStrKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:3659:3: kw= Int
                    {
                    kw=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getIntKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:3665:3: kw= Flt
                    {
                    kw=(Token)match(input,Flt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getFltKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:3671:3: kw= Lda
                    {
                    kw=(Token)match(input,Lda,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdaKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:3677:3: kw= Ltm
                    {
                    kw=(Token)match(input,Ltm,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLtmKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEldmDslParser.g:3683:3: kw= Ldt
                    {
                    kw=(Token)match(input,Ldt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdtKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEldmDslParser.g:3689:3: kw= Map
                    {
                    kw=(Token)match(input,Map,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getMapKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEldmDslParser.g:3695:3: kw= Lst
                    {
                    kw=(Token)match(input,Lst,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLstKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEldmDslParser.g:3701:3: kw= Enum
                    {
                    kw=(Token)match(input,Enum,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getEnumKeyword_12());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeDef"


    // $ANTLR start "entryRuleLiteral"
    // InternalEldmDslParser.g:3710:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEldmDslParser.g:3710:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEldmDslParser.g:3711:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalEldmDslParser.g:3717:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_StrLiteral_1 = null;

        EObject this_IntLiteral_2 = null;

        EObject this_FltLiteral_3 = null;

        EObject this_DateLiteral_4 = null;

        EObject this_TimeLiteral_5 = null;

        EObject this_DateTimeLiteral_6 = null;

        EObject this_PathLiteral_7 = null;

        EObject this_ListLiteral_8 = null;

        EObject this_MapLiteral_9 = null;

        EObject this_PatternLiteral_10 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3723:2: ( (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral ) )
            // InternalEldmDslParser.g:3724:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral )
            {
            // InternalEldmDslParser.g:3724:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral )
            int alt74=11;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // InternalEldmDslParser.g:3725:3: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3734:3: this_StrLiteral_1= ruleStrLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStrLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StrLiteral_1=ruleStrLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StrLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:3743:3: this_IntLiteral_2= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_2=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:3752:3: this_FltLiteral_3= ruleFltLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getFltLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FltLiteral_3=ruleFltLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FltLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:3761:3: this_DateLiteral_4= ruleDateLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getDateLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DateLiteral_4=ruleDateLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DateLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:3770:3: this_TimeLiteral_5= ruleTimeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getTimeLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TimeLiteral_5=ruleTimeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TimeLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:3779:3: this_DateTimeLiteral_6= ruleDateTimeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getDateTimeLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DateTimeLiteral_6=ruleDateTimeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DateTimeLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:3788:3: this_PathLiteral_7= rulePathLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getPathLiteralParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PathLiteral_7=rulePathLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PathLiteral_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:3797:3: this_ListLiteral_8= ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListLiteral_8=ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListLiteral_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEldmDslParser.g:3806:3: this_MapLiteral_9= ruleMapLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapLiteral_9=ruleMapLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteral_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEldmDslParser.g:3815:3: this_PatternLiteral_10= rulePatternLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getPatternLiteralParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PatternLiteral_10=rulePatternLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PatternLiteral_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalEldmDslParser.g:3827:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalEldmDslParser.g:3827:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalEldmDslParser.g:3828:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalEldmDslParser.g:3834:1: ruleBoolLiteral returns [EObject current=null] : ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3840:2: ( ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) )
            // InternalEldmDslParser.g:3841:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            {
            // InternalEldmDslParser.g:3841:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            // InternalEldmDslParser.g:3842:3: () (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            {
            // InternalEldmDslParser.g:3842:3: ()
            // InternalEldmDslParser.g:3843:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3849:3: (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==False) ) {
                alt75=1;
            }
            else if ( (LA75_0==True) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalEldmDslParser.g:3850:4: otherlv_1= False
                    {
                    otherlv_1=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3855:4: ( (lv_value_2_0= True ) )
                    {
                    // InternalEldmDslParser.g:3855:4: ( (lv_value_2_0= True ) )
                    // InternalEldmDslParser.g:3856:5: (lv_value_2_0= True )
                    {
                    // InternalEldmDslParser.g:3856:5: (lv_value_2_0= True )
                    // InternalEldmDslParser.g:3857:6: lv_value_2_0= True
                    {
                    lv_value_2_0=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getBoolLiteralAccess().getValueTrueKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBoolLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStrLiteral"
    // InternalEldmDslParser.g:3874:1: entryRuleStrLiteral returns [EObject current=null] : iv_ruleStrLiteral= ruleStrLiteral EOF ;
    public final EObject entryRuleStrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrLiteral = null;


        try {
            // InternalEldmDslParser.g:3874:51: (iv_ruleStrLiteral= ruleStrLiteral EOF )
            // InternalEldmDslParser.g:3875:2: iv_ruleStrLiteral= ruleStrLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStrLiteral=ruleStrLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrLiteral"


    // $ANTLR start "ruleStrLiteral"
    // InternalEldmDslParser.g:3881:1: ruleStrLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT ) ) ;
    public final EObject ruleStrLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3887:2: ( ( (lv_value_0_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3888:2: ( (lv_value_0_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3888:2: ( (lv_value_0_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3889:3: (lv_value_0_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3889:3: (lv_value_0_0= RULE_TEXT )
            // InternalEldmDslParser.g:3890:4: lv_value_0_0= RULE_TEXT
            {
            lv_value_0_0=(Token)match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStrLiteralAccess().getValueTEXTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStrLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"net.eldm.EldmDsl.TEXT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalEldmDslParser.g:3909:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalEldmDslParser.g:3909:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalEldmDslParser.g:3910:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalEldmDslParser.g:3916:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3922:2: ( ( (lv_value_0_0= RULE_NATURAL ) ) )
            // InternalEldmDslParser.g:3923:2: ( (lv_value_0_0= RULE_NATURAL ) )
            {
            // InternalEldmDslParser.g:3923:2: ( (lv_value_0_0= RULE_NATURAL ) )
            // InternalEldmDslParser.g:3924:3: (lv_value_0_0= RULE_NATURAL )
            {
            // InternalEldmDslParser.g:3924:3: (lv_value_0_0= RULE_NATURAL )
            // InternalEldmDslParser.g:3925:4: lv_value_0_0= RULE_NATURAL
            {
            lv_value_0_0=(Token)match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueNATURALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"net.eldm.EldmDsl.NATURAL");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFltLiteral"
    // InternalEldmDslParser.g:3944:1: entryRuleFltLiteral returns [EObject current=null] : iv_ruleFltLiteral= ruleFltLiteral EOF ;
    public final EObject entryRuleFltLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFltLiteral = null;


        try {
            // InternalEldmDslParser.g:3944:51: (iv_ruleFltLiteral= ruleFltLiteral EOF )
            // InternalEldmDslParser.g:3945:2: iv_ruleFltLiteral= ruleFltLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFltLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFltLiteral=ruleFltLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFltLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFltLiteral"


    // $ANTLR start "ruleFltLiteral"
    // InternalEldmDslParser.g:3951:1: ruleFltLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFltLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3957:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalEldmDslParser.g:3958:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalEldmDslParser.g:3958:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalEldmDslParser.g:3959:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalEldmDslParser.g:3959:3: (lv_value_0_0= RULE_FLOAT )
            // InternalEldmDslParser.g:3960:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getFltLiteralAccess().getValueFLOATTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFltLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"net.eldm.EldmDsl.FLOAT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFltLiteral"


    // $ANTLR start "entryRuleDateLiteral"
    // InternalEldmDslParser.g:3979:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // InternalEldmDslParser.g:3979:52: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // InternalEldmDslParser.g:3980:2: iv_ruleDateLiteral= ruleDateLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDateLiteral=ruleDateLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // InternalEldmDslParser.g:3986:1: ruleDateLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE ) ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3992:2: ( ( (lv_value_0_0= RULE_DATE ) ) )
            // InternalEldmDslParser.g:3993:2: ( (lv_value_0_0= RULE_DATE ) )
            {
            // InternalEldmDslParser.g:3993:2: ( (lv_value_0_0= RULE_DATE ) )
            // InternalEldmDslParser.g:3994:3: (lv_value_0_0= RULE_DATE )
            {
            // InternalEldmDslParser.g:3994:3: (lv_value_0_0= RULE_DATE )
            // InternalEldmDslParser.g:3995:4: lv_value_0_0= RULE_DATE
            {
            lv_value_0_0=(Token)match(input,RULE_DATE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDateLiteralAccess().getValueDATETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDateLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"net.eldm.EldmDsl.DATE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalEldmDslParser.g:4014:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:4014:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEldmDslParser.g:4015:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeLiteral=ruleTimeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalEldmDslParser.g:4021:1: ruleTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TIME ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:4027:2: ( ( (lv_value_0_0= RULE_TIME ) ) )
            // InternalEldmDslParser.g:4028:2: ( (lv_value_0_0= RULE_TIME ) )
            {
            // InternalEldmDslParser.g:4028:2: ( (lv_value_0_0= RULE_TIME ) )
            // InternalEldmDslParser.g:4029:3: (lv_value_0_0= RULE_TIME )
            {
            // InternalEldmDslParser.g:4029:3: (lv_value_0_0= RULE_TIME )
            // InternalEldmDslParser.g:4030:4: lv_value_0_0= RULE_TIME
            {
            lv_value_0_0=(Token)match(input,RULE_TIME,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getTimeLiteralAccess().getValueTIMETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTimeLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"net.eldm.EldmDsl.TIME");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleDateTimeLiteral"
    // InternalEldmDslParser.g:4049:1: entryRuleDateTimeLiteral returns [EObject current=null] : iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF ;
    public final EObject entryRuleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:4049:56: (iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF )
            // InternalEldmDslParser.g:4050:2: iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTimeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDateTimeLiteral=ruleDateTimeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTimeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTimeLiteral"


    // $ANTLR start "ruleDateTimeLiteral"
    // InternalEldmDslParser.g:4056:1: ruleDateTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATETIME ) ) ;
    public final EObject ruleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:4062:2: ( ( (lv_value_0_0= RULE_DATETIME ) ) )
            // InternalEldmDslParser.g:4063:2: ( (lv_value_0_0= RULE_DATETIME ) )
            {
            // InternalEldmDslParser.g:4063:2: ( (lv_value_0_0= RULE_DATETIME ) )
            // InternalEldmDslParser.g:4064:3: (lv_value_0_0= RULE_DATETIME )
            {
            // InternalEldmDslParser.g:4064:3: (lv_value_0_0= RULE_DATETIME )
            // InternalEldmDslParser.g:4065:4: lv_value_0_0= RULE_DATETIME
            {
            lv_value_0_0=(Token)match(input,RULE_DATETIME,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDateTimeLiteralAccess().getValueDATETIMETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDateTimeLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"net.eldm.EldmDsl.DATETIME");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTimeLiteral"


    // $ANTLR start "entryRulePathLiteral"
    // InternalEldmDslParser.g:4084:1: entryRulePathLiteral returns [EObject current=null] : iv_rulePathLiteral= rulePathLiteral EOF ;
    public final EObject entryRulePathLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathLiteral = null;


        try {
            // InternalEldmDslParser.g:4084:52: (iv_rulePathLiteral= rulePathLiteral EOF )
            // InternalEldmDslParser.g:4085:2: iv_rulePathLiteral= rulePathLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathLiteral=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathLiteral"


    // $ANTLR start "rulePathLiteral"
    // InternalEldmDslParser.g:4091:1: rulePathLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_PATH ) ) ;
    public final EObject rulePathLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:4097:2: ( ( (lv_value_0_0= RULE_PATH ) ) )
            // InternalEldmDslParser.g:4098:2: ( (lv_value_0_0= RULE_PATH ) )
            {
            // InternalEldmDslParser.g:4098:2: ( (lv_value_0_0= RULE_PATH ) )
            // InternalEldmDslParser.g:4099:3: (lv_value_0_0= RULE_PATH )
            {
            // InternalEldmDslParser.g:4099:3: (lv_value_0_0= RULE_PATH )
            // InternalEldmDslParser.g:4100:4: lv_value_0_0= RULE_PATH
            {
            lv_value_0_0=(Token)match(input,RULE_PATH,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getPathLiteralAccess().getValuePATHTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPathLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"net.eldm.EldmDsl.PATH");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathLiteral"


    // $ANTLR start "entryRuleListLiteral"
    // InternalEldmDslParser.g:4119:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalEldmDslParser.g:4119:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalEldmDslParser.g:4120:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListLiteral"


    // $ANTLR start "ruleListLiteral"
    // InternalEldmDslParser.g:4126:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vals_2_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:4132:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEldmDslParser.g:4133:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEldmDslParser.g:4133:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEldmDslParser.g:4134:3: () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEldmDslParser.g:4134:3: ()
            // InternalEldmDslParser.g:4135:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEldmDslParser.g:4145:3: ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==False||LA77_0==Bool||LA77_0==Enum||(LA77_0>=None && LA77_0<=Path)||LA77_0==True||LA77_0==Any||LA77_0==Flt||(LA77_0>=Int && LA77_0<=Ldt)||(LA77_0>=Lst && LA77_0<=Map)||LA77_0==Str||LA77_0==LeftSquareBracket||LA77_0==LeftCurlyBracket||(LA77_0>=RULE_PATH && LA77_0<=RULE_ID)||(LA77_0>=RULE_NATURAL && LA77_0<=RULE_TEXT)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalEldmDslParser.g:4146:4: ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    {
                    // InternalEldmDslParser.g:4146:4: ( (lv_vals_2_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:4147:5: (lv_vals_2_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:4147:5: (lv_vals_2_0= ruleLiteral )
                    // InternalEldmDslParser.g:4148:6: lv_vals_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_71);
                    lv_vals_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListLiteralRule());
                      						}
                      						add(
                      							current,
                      							"vals",
                      							lv_vals_2_0,
                      							"net.eldm.EldmDsl.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:4165:4: (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==Comma) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:4166:5: otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEldmDslParser.g:4170:5: ( (lv_vals_4_0= ruleLiteral ) )
                    	    // InternalEldmDslParser.g:4171:6: (lv_vals_4_0= ruleLiteral )
                    	    {
                    	    // InternalEldmDslParser.g:4171:6: (lv_vals_4_0= ruleLiteral )
                    	    // InternalEldmDslParser.g:4172:7: lv_vals_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_71);
                    	    lv_vals_4_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"vals",
                    	      								lv_vals_4_0,
                    	      								"net.eldm.EldmDsl.Literal");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListLiteral"


    // $ANTLR start "entryRuleMapLiteral"
    // InternalEldmDslParser.g:4199:1: entryRuleMapLiteral returns [EObject current=null] : iv_ruleMapLiteral= ruleMapLiteral EOF ;
    public final EObject entryRuleMapLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteral = null;


        try {
            // InternalEldmDslParser.g:4199:51: (iv_ruleMapLiteral= ruleMapLiteral EOF )
            // InternalEldmDslParser.g:4200:2: iv_ruleMapLiteral= ruleMapLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapLiteral=ruleMapLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLiteral"


    // $ANTLR start "ruleMapLiteral"
    // InternalEldmDslParser.g:4206:1: ruleMapLiteral returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) ;
    public final EObject ruleMapLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;

        EObject lv_entries_9_0 = null;

        EObject lv_entries_11_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:4212:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:4213:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:4213:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==LeftCurlyBracket) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==RULE_ID) && (synpred11_InternalEldmDslParser())) {
                    alt82=1;
                }
                else if ( (LA82_1==RightCurlyBracket) && (synpred11_InternalEldmDslParser())) {
                    alt82=1;
                }
                else if ( (LA82_1==RULE_BEGIN) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalEldmDslParser.g:4214:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:4214:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:4215:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:4237:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    // InternalEldmDslParser.g:4238:5: () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:4238:5: ()
                    // InternalEldmDslParser.g:4239:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapLiteralAccess().getMapLiteralAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:4249:5: ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_ID) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalEldmDslParser.g:4250:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:4250:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:4251:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:4251:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:4252:8: lv_entries_2_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_57);
                            lv_entries_2_0=ruleMapEntryLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                              								}
                              								add(
                              									current,
                              									"entries",
                              									lv_entries_2_0,
                              									"net.eldm.EldmDsl.MapEntryLiteral");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalEldmDslParser.g:4269:6: (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==Comma) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:4270:7: otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:4274:7: ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:4275:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:4275:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:4276:9: lv_entries_4_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_57);
                            	    lv_entries_4_0=ruleMapEntryLiteral();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"entries",
                            	      										lv_entries_4_0,
                            	      										"net.eldm.EldmDsl.MapEntryLiteral");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop78;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_0_0_3());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:4302:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:4302:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    // InternalEldmDslParser.g:4303:4: () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:4303:4: ()
                    // InternalEldmDslParser.g:4304:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMapLiteralAccess().getMapLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getMapLiteralAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:4318:4: ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_ID) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalEldmDslParser.g:4319:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:4319:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:4320:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:4320:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:4321:7: lv_entries_9_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_73);
                            lv_entries_9_0=ruleMapEntryLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                              							}
                              							add(
                              								current,
                              								"entries",
                              								lv_entries_9_0,
                              								"net.eldm.EldmDsl.MapEntryLiteral");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalEldmDslParser.g:4338:5: ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==EOF||(LA80_0>=Definitions && LA80_0<=PlugDsl)||LA80_0==Import||LA80_0==Catch||LA80_0==Def||LA80_0==Out||LA80_0==In||(LA80_0>=LineFeed && LA80_0<=CarriageReturn)||LA80_0==RULE_ID) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:4339:6: ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapLiteralAccess().getBREAKParserRuleCall_1_3_1_0());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_18);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:4346:6: ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:4347:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:4347:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:4348:8: lv_entries_11_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_73);
                            	    lv_entries_11_0=ruleMapEntryLiteral();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"entries",
                            	      									lv_entries_11_0,
                            	      									"net.eldm.EldmDsl.MapEntryLiteral");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop80;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_12, grammarAccess.getMapLiteralAccess().getENDTerminalRuleCall_1_4());
                      			
                    }
                    otherlv_13=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_1_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLiteral"


    // $ANTLR start "entryRuleMapEntryLiteral"
    // InternalEldmDslParser.g:4380:1: entryRuleMapEntryLiteral returns [EObject current=null] : iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF ;
    public final EObject entryRuleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryLiteral = null;


        try {
            // InternalEldmDslParser.g:4380:56: (iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF )
            // InternalEldmDslParser.g:4381:2: iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapEntryLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapEntryLiteral=ruleMapEntryLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapEntryLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapEntryLiteral"


    // $ANTLR start "ruleMapEntryLiteral"
    // InternalEldmDslParser.g:4387:1: ruleMapEntryLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:4393:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalEldmDslParser.g:4394:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalEldmDslParser.g:4394:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalEldmDslParser.g:4395:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalEldmDslParser.g:4395:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:4396:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:4396:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:4397:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMapEntryLiteralAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapEntryLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1());
              		
            }
            // InternalEldmDslParser.g:4417:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalEldmDslParser.g:4418:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalEldmDslParser.g:4418:4: (lv_value_2_0= ruleLiteral )
            // InternalEldmDslParser.g:4419:5: lv_value_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapEntryLiteralAccess().getValueLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapEntryLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"net.eldm.EldmDsl.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapEntryLiteral"


    // $ANTLR start "entryRulePatternLiteral"
    // InternalEldmDslParser.g:4440:1: entryRulePatternLiteral returns [EObject current=null] : iv_rulePatternLiteral= rulePatternLiteral EOF ;
    public final EObject entryRulePatternLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternLiteral = null;


        try {
            // InternalEldmDslParser.g:4440:55: (iv_rulePatternLiteral= rulePatternLiteral EOF )
            // InternalEldmDslParser.g:4441:2: iv_rulePatternLiteral= rulePatternLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternLiteral=rulePatternLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternLiteral"


    // $ANTLR start "rulePatternLiteral"
    // InternalEldmDslParser.g:4447:1: rulePatternLiteral returns [EObject current=null] : ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) ;
    public final EObject rulePatternLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        AntlrDatatypeRuleToken lv_native_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:4453:2: ( ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) )
            // InternalEldmDslParser.g:4454:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            {
            // InternalEldmDslParser.g:4454:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:4455:3: () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:4455:3: ()
            // InternalEldmDslParser.g:4456:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:4462:3: ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Bool||LA83_0==Enum||(LA83_0>=None && LA83_0<=Path)||LA83_0==Any||LA83_0==Flt||(LA83_0>=Int && LA83_0<=Ldt)||(LA83_0>=Lst && LA83_0<=Map)||LA83_0==Str) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_ID) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalEldmDslParser.g:4463:4: ( (lv_native_1_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:4463:4: ( (lv_native_1_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:4464:5: (lv_native_1_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:4464:5: (lv_native_1_0= ruleNativeDef )
                    // InternalEldmDslParser.g:4465:6: lv_native_1_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternLiteralAccess().getNativeNativeDefParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
                    lv_native_1_0=ruleNativeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPatternLiteralRule());
                      						}
                      						set(
                      							current,
                      							"native",
                      							lv_native_1_0,
                      							"net.eldm.EldmDsl.NativeDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:4483:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:4483:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEldmDslParser.g:4484:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEldmDslParser.g:4484:5: (otherlv_2= RULE_ID )
                    // InternalEldmDslParser.g:4485:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternLiteralRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPatternLiteralAccess().getRefDefinitionCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,CommercialAt,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2());
              		
            }
            // InternalEldmDslParser.g:4501:3: ( (lv_text_4_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:4502:4: (lv_text_4_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:4502:4: (lv_text_4_0= RULE_TEXT )
            // InternalEldmDslParser.g:4503:5: lv_text_4_0= RULE_TEXT
            {
            lv_text_4_0=(Token)match(input,RULE_TEXT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_4_0, grammarAccess.getPatternLiteralAccess().getTextTEXTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_4_0,
              						"net.eldm.EldmDsl.TEXT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternLiteral"


    // $ANTLR start "entryRuleBREAK"
    // InternalEldmDslParser.g:4523:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalEldmDslParser.g:4523:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalEldmDslParser.g:4524:2: iv_ruleBREAK= ruleBREAK EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBREAKRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBREAK=ruleBREAK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBREAK.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBREAK"


    // $ANTLR start "ruleBREAK"
    // InternalEldmDslParser.g:4530:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LineFeed | kw= CarriageReturn )* ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:4536:2: ( (kw= LineFeed | kw= CarriageReturn )* )
            // InternalEldmDslParser.g:4537:2: (kw= LineFeed | kw= CarriageReturn )*
            {
            // InternalEldmDslParser.g:4537:2: (kw= LineFeed | kw= CarriageReturn )*
            loop84:
            do {
                int alt84=3;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==LineFeed) ) {
                    alt84=1;
                }
                else if ( (LA84_0==CarriageReturn) ) {
                    alt84=2;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalEldmDslParser.g:4538:3: kw= LineFeed
            	    {
            	    kw=(Token)match(input,LineFeed,FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getLineFeedKeyword_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEldmDslParser.g:4544:3: kw= CarriageReturn
            	    {
            	    kw=(Token)match(input,CarriageReturn,FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBREAK"

    // $ANTLR start synpred1_InternalEldmDslParser
    public final void synpred1_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:428:4: ( ( RULE_ID ) )
        // InternalEldmDslParser.g:428:5: ( RULE_ID )
        {
        // InternalEldmDslParser.g:428:5: ( RULE_ID )
        // InternalEldmDslParser.g:429:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEldmDslParser

    // $ANTLR start synpred2_InternalEldmDslParser
    public final void synpred2_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1318:5: ( ( () ( ( Or ) ) ) )
        // InternalEldmDslParser.g:1318:6: ( () ( ( Or ) ) )
        {
        // InternalEldmDslParser.g:1318:6: ( () ( ( Or ) ) )
        // InternalEldmDslParser.g:1319:6: () ( ( Or ) )
        {
        // InternalEldmDslParser.g:1319:6: ()
        // InternalEldmDslParser.g:1320:6: 
        {
        }

        // InternalEldmDslParser.g:1321:6: ( ( Or ) )
        // InternalEldmDslParser.g:1322:7: ( Or )
        {
        // InternalEldmDslParser.g:1322:7: ( Or )
        // InternalEldmDslParser.g:1323:8: Or
        {
        match(input,Or,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEldmDslParser

    // $ANTLR start synpred3_InternalEldmDslParser
    public final void synpred3_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1401:5: ( ( () ( ( And ) ) ) )
        // InternalEldmDslParser.g:1401:6: ( () ( ( And ) ) )
        {
        // InternalEldmDslParser.g:1401:6: ( () ( ( And ) ) )
        // InternalEldmDslParser.g:1402:6: () ( ( And ) )
        {
        // InternalEldmDslParser.g:1402:6: ()
        // InternalEldmDslParser.g:1403:6: 
        {
        }

        // InternalEldmDslParser.g:1404:6: ( ( And ) )
        // InternalEldmDslParser.g:1405:7: ( And )
        {
        // InternalEldmDslParser.g:1405:7: ( And )
        // InternalEldmDslParser.g:1406:8: And
        {
        match(input,And,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEldmDslParser

    // $ANTLR start synpred4_InternalEldmDslParser
    public final void synpred4_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1484:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )
        // InternalEldmDslParser.g:1484:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        {
        // InternalEldmDslParser.g:1484:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        // InternalEldmDslParser.g:1485:6: () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        {
        // InternalEldmDslParser.g:1485:6: ()
        // InternalEldmDslParser.g:1486:6: 
        {
        }

        // InternalEldmDslParser.g:1487:6: ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        // InternalEldmDslParser.g:1488:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        {
        // InternalEldmDslParser.g:1488:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        // InternalEldmDslParser.g:1489:8: ( EqualsSignEqualsSign | ExclamationMarkEqualsSign )
        {
        if ( input.LA(1)==ExclamationMarkEqualsSign||input.LA(1)==EqualsSignEqualsSign ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalEldmDslParser

    // $ANTLR start synpred5_InternalEldmDslParser
    public final void synpred5_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1585:6: ( ( () ( ( Is ) ) ) )
        // InternalEldmDslParser.g:1585:7: ( () ( ( Is ) ) )
        {
        // InternalEldmDslParser.g:1585:7: ( () ( ( Is ) ) )
        // InternalEldmDslParser.g:1586:7: () ( ( Is ) )
        {
        // InternalEldmDslParser.g:1586:7: ()
        // InternalEldmDslParser.g:1587:7: 
        {
        }

        // InternalEldmDslParser.g:1588:7: ( ( Is ) )
        // InternalEldmDslParser.g:1589:8: ( Is )
        {
        // InternalEldmDslParser.g:1589:8: ( Is )
        // InternalEldmDslParser.g:1590:9: Is
        {
        match(input,Is,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalEldmDslParser

    // $ANTLR start synpred6_InternalEldmDslParser
    public final void synpred6_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1642:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )
        // InternalEldmDslParser.g:1642:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        {
        // InternalEldmDslParser.g:1642:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        // InternalEldmDslParser.g:1643:7: () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        {
        // InternalEldmDslParser.g:1643:7: ()
        // InternalEldmDslParser.g:1644:7: 
        {
        }

        // InternalEldmDslParser.g:1645:7: ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        // InternalEldmDslParser.g:1646:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        {
        // InternalEldmDslParser.g:1646:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        // InternalEldmDslParser.g:1647:9: ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign )
        {
        if ( input.LA(1)==LessThanSignEqualsSign||input.LA(1)==GreaterThanSignEqualsSign||input.LA(1)==LessThanSign||input.LA(1)==GreaterThanSign ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalEldmDslParser

    // $ANTLR start synpred7_InternalEldmDslParser
    public final void synpred7_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1769:5: ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )
        // InternalEldmDslParser.g:1769:6: ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) )
        {
        // InternalEldmDslParser.g:1769:6: ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) )
        // InternalEldmDslParser.g:1770:6: () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) )
        {
        // InternalEldmDslParser.g:1770:6: ()
        // InternalEldmDslParser.g:1771:6: 
        {
        }

        // InternalEldmDslParser.g:1772:6: ( ( ( PlusSign | HyphenMinus | Set | Del ) ) )
        // InternalEldmDslParser.g:1773:7: ( ( PlusSign | HyphenMinus | Set | Del ) )
        {
        // InternalEldmDslParser.g:1773:7: ( ( PlusSign | HyphenMinus | Set | Del ) )
        // InternalEldmDslParser.g:1774:8: ( PlusSign | HyphenMinus | Set | Del )
        {
        if ( input.LA(1)==Del||input.LA(1)==Set||input.LA(1)==PlusSign||input.LA(1)==HyphenMinus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalEldmDslParser

    // $ANTLR start synpred8_InternalEldmDslParser
    public final void synpred8_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1895:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )
        // InternalEldmDslParser.g:1895:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalEldmDslParser.g:1895:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        // InternalEldmDslParser.g:1896:6: () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        {
        // InternalEldmDslParser.g:1896:6: ()
        // InternalEldmDslParser.g:1897:6: 
        {
        }

        // InternalEldmDslParser.g:1898:6: ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        // InternalEldmDslParser.g:1899:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        {
        // InternalEldmDslParser.g:1899:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        // InternalEldmDslParser.g:1900:8: ( Asterisk | AsteriskAsterisk | Solidus | PercentSign )
        {
        if ( input.LA(1)==AsteriskAsterisk||input.LA(1)==PercentSign||input.LA(1)==Asterisk||input.LA(1)==Solidus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalEldmDslParser

    // $ANTLR start synpred9_InternalEldmDslParser
    public final void synpred9_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:2540:5: ( Else )
        // InternalEldmDslParser.g:2540:6: Else
        {
        match(input,Else,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalEldmDslParser

    // $ANTLR start synpred10_InternalEldmDslParser
    public final void synpred10_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:3078:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:3078:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:3078:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket )
        // InternalEldmDslParser.g:3079:5: () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:3079:5: ()
        // InternalEldmDslParser.g:3080:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_56); if (state.failed) return ;
        // InternalEldmDslParser.g:3082:5: ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // InternalEldmDslParser.g:3083:6: ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )*
                {
                // InternalEldmDslParser.g:3083:6: ( ( ruleMapEntryDef ) )
                // InternalEldmDslParser.g:3084:7: ( ruleMapEntryDef )
                {
                // InternalEldmDslParser.g:3084:7: ( ruleMapEntryDef )
                // InternalEldmDslParser.g:3085:8: ruleMapEntryDef
                {
                pushFollow(FOLLOW_57);
                ruleMapEntryDef();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:3088:6: ( Comma ( ( ruleMapEntryDef ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==Comma) ) {
                        int LA85_1 = input.LA(2);

                        if ( (LA85_1==RULE_ID) ) {
                            alt85=1;
                        }


                    }


                    switch (alt85) {
                	case 1 :
                	    // InternalEldmDslParser.g:3089:7: Comma ( ( ruleMapEntryDef ) )
                	    {
                	    match(input,Comma,FOLLOW_18); if (state.failed) return ;
                	    // InternalEldmDslParser.g:3090:7: ( ( ruleMapEntryDef ) )
                	    // InternalEldmDslParser.g:3091:8: ( ruleMapEntryDef )
                	    {
                	    // InternalEldmDslParser.g:3091:8: ( ruleMapEntryDef )
                	    // InternalEldmDslParser.g:3092:9: ruleMapEntryDef
                	    {
                	    pushFollow(FOLLOW_57);
                	    ruleMapEntryDef();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop85;
                    }
                } while (true);


                }
                break;

        }

        // InternalEldmDslParser.g:3097:5: ( Comma ( ( QuestionMark ) ) )?
        int alt87=2;
        int LA87_0 = input.LA(1);

        if ( (LA87_0==Comma) ) {
            alt87=1;
        }
        switch (alt87) {
            case 1 :
                // InternalEldmDslParser.g:3098:6: Comma ( ( QuestionMark ) )
                {
                match(input,Comma,FOLLOW_58); if (state.failed) return ;
                // InternalEldmDslParser.g:3099:6: ( ( QuestionMark ) )
                // InternalEldmDslParser.g:3100:7: ( QuestionMark )
                {
                // InternalEldmDslParser.g:3100:7: ( QuestionMark )
                // InternalEldmDslParser.g:3101:8: QuestionMark
                {
                match(input,QuestionMark,FOLLOW_59); if (state.failed) return ;

                }


                }


                }
                break;

        }

        match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalEldmDslParser

    // $ANTLR start synpred11_InternalEldmDslParser
    public final void synpred11_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:4215:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:4215:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:4215:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        // InternalEldmDslParser.g:4216:5: () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:4216:5: ()
        // InternalEldmDslParser.g:4217:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_72); if (state.failed) return ;
        // InternalEldmDslParser.g:4219:5: ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // InternalEldmDslParser.g:4220:6: ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )*
                {
                // InternalEldmDslParser.g:4220:6: ( ( ruleMapEntryLiteral ) )
                // InternalEldmDslParser.g:4221:7: ( ruleMapEntryLiteral )
                {
                // InternalEldmDslParser.g:4221:7: ( ruleMapEntryLiteral )
                // InternalEldmDslParser.g:4222:8: ruleMapEntryLiteral
                {
                pushFollow(FOLLOW_57);
                ruleMapEntryLiteral();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:4225:6: ( Comma ( ( ruleMapEntryLiteral ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==Comma) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // InternalEldmDslParser.g:4226:7: Comma ( ( ruleMapEntryLiteral ) )
                	    {
                	    match(input,Comma,FOLLOW_18); if (state.failed) return ;
                	    // InternalEldmDslParser.g:4227:7: ( ( ruleMapEntryLiteral ) )
                	    // InternalEldmDslParser.g:4228:8: ( ruleMapEntryLiteral )
                	    {
                	    // InternalEldmDslParser.g:4228:8: ( ruleMapEntryLiteral )
                	    // InternalEldmDslParser.g:4229:9: ruleMapEntryLiteral
                	    {
                	    pushFollow(FOLLOW_57);
                	    ruleMapEntryLiteral();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                }
                break;

        }

        match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalEldmDslParser

    // Delegated rules

    public final boolean synpred10_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalEldmDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEldmDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEldmDslParser_fragment(); // can never throw exception
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


    protected DFA74 dfa74 = new DFA74(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\13\13\uffff";
    static final String dfa_3s = "\1\131\13\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\13\1\uffff\1\13\3\uffff\2\13\1\uffff\1\1\1\uffff\1\13\2\uffff\1\13\2\uffff\3\13\1\uffff\3\13\2\uffff\1\13\41\uffff\1\11\1\uffff\1\12\5\uffff\1\10\1\13\1\uffff\1\3\1\4\1\5\1\6\1\7\1\2",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3724:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0010002002000532L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010002002000432L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020200020080L,0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020200020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010002002000402L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L,0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x8000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L,0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000209DC918A000L,0x0000000000040808L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010002002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004020000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000309DC918A000L,0x0000000000060808L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000309DC918A000L,0x0000000000040808L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000209DC918A000L,0x0000000000040800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0A08009DD958A800L,0x0000000003F62A00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0180100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010002002000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010002002000400L,0x0000000000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000030200000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000840000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0021400000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000004004000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2400080000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0A08009DD958A800L,0x0000000003F62A08L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800209DC91CB000L,0x0000000000040800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050080L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8180000000000000L,0x0000000000050080L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0180000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000A8L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000009DC958A800L,0x0000000003F60A00L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000209DC918A000L,0x0000000000040800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000009DC958A800L,0x0000000003F60E00L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0180000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0180000000000002L});

}