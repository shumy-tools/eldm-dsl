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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Definitions", "PlugDsl", "Service", "Typedef", "Import", "Module", "Catch", "False", "Match", "Bool", "Enum", "From", "Mask", "Path", "True", "And", "Any", "Def", "Del", "Flt", "Get", "Int", "Lda", "Ldt", "Let", "Lst", "Ltm", "Map", "Set", "Str", "Var", "ExclamationMarkEqualsSign", "AsteriskAsterisk", "AsteriskFullStop", "HyphenMinusGreaterThanSign", "FullStopFullStop", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "As", "Is", "Or", "LineFeed", "CarriageReturn", "ExclamationMark", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "LeftPointingDoubleAngleQuotationMark", "RightPointingDoubleAngleQuotationMark", "RULE_BEGIN", "RULE_END", "RULE_PATH", "RULE_ID", "RULE_INT", "RULE_NATURAL", "RULE_FLOAT", "RULE_DATE", "RULE_TIME", "RULE_DATETIME", "RULE_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=14;
    public static final int Import=8;
    public static final int Or=45;
    public static final int RULE_BEGIN=70;
    public static final int Var=34;
    public static final int True=18;
    public static final int False=11;
    public static final int LessThanSign=59;
    public static final int Str=33;
    public static final int PercentSign=49;
    public static final int LeftParenthesis=50;
    public static final int Bool=13;
    public static final int FullStopFullStop=39;
    public static final int RULE_TIME=78;
    public static final int RightSquareBracket=65;
    public static final int AsteriskFullStop=37;
    public static final int ExclamationMark=48;
    public static final int GreaterThanSign=61;
    public static final int RULE_ID=73;
    public static final int Mask=16;
    public static final int RightParenthesis=51;
    public static final int Lst=29;
    public static final int GreaterThanSignEqualsSign=42;
    public static final int RULE_PATH=72;
    public static final int EqualsSignEqualsSign=41;
    public static final int RULE_DATE=77;
    public static final int Typedef=7;
    public static final int And=19;
    public static final int PlusSign=53;
    public static final int RULE_INT=74;
    public static final int Get=24;
    public static final int AsteriskAsterisk=36;
    public static final int RULE_NATURAL=75;
    public static final int RULE_ML_COMMENT=81;
    public static final int RULE_TEXT=80;
    public static final int LeftSquareBracket=64;
    public static final int Module=9;
    public static final int Map=31;
    public static final int RULE_END=71;
    public static final int Set=32;
    public static final int Ltm=30;
    public static final int Catch=10;
    public static final int RULE_DATETIME=79;
    public static final int Lda=26;
    public static final int Is=44;
    public static final int LeftPointingDoubleAngleQuotationMark=68;
    public static final int Any=20;
    public static final int Int=25;
    public static final int Match=12;
    public static final int Flt=23;
    public static final int RULE_SL_COMMENT=82;
    public static final int Comma=54;
    public static final int EqualsSign=60;
    public static final int As=43;
    public static final int HyphenMinus=55;
    public static final int RightPointingDoubleAngleQuotationMark=69;
    public static final int CarriageReturn=47;
    public static final int LessThanSignEqualsSign=40;
    public static final int Solidus=57;
    public static final int Colon=58;
    public static final int RightCurlyBracket=67;
    public static final int EOF=-1;
    public static final int Ldt=27;
    public static final int Asterisk=52;
    public static final int Path=17;
    public static final int FullStop=56;
    public static final int Def=21;
    public static final int RULE_WS=83;
    public static final int Definitions=4;
    public static final int LeftCurlyBracket=66;
    public static final int Service=6;
    public static final int Del=22;
    public static final int From=15;
    public static final int RULE_ANY_OTHER=84;
    public static final int CommercialAt=63;
    public static final int PlugDsl=5;
    public static final int QuestionMark=62;
    public static final int RULE_FLOAT=76;
    public static final int Let=28;
    public static final int ExclamationMarkEqualsSign=35;
    public static final int HyphenMinusGreaterThanSign=38;
    public static final int LineFeed=46;

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
    // InternalEldmDslParser.g:64:1: ruleModule returns [EObject current=null] : (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_funcs_9_0= ruleFunction ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_8=null;
        EObject lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_plugs_3_0 = null;

        EObject lv_defs_6_0 = null;

        EObject lv_vars_7_0 = null;

        EObject lv_funcs_9_0 = null;

        EObject lv_paths_10_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:70:2: ( (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_funcs_9_0= ruleFunction ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) )
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_funcs_9_0= ruleFunction ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            {
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_funcs_9_0= ruleFunction ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            // InternalEldmDslParser.g:72:3: otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_funcs_9_0= ruleFunction ) )* ( (lv_paths_10_0= ruleSubPath ) )*
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

            // InternalEldmDslParser.g:133:3: (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Definitions) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEldmDslParser.g:134:4: otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END
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

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_8, grammarAccess.getModuleAccess().getENDTerminalRuleCall_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:185:3: ( (lv_funcs_9_0= ruleFunction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Def) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==Service||LA6_1==Get||LA6_1==Set) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==Catch) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEldmDslParser.g:186:4: (lv_funcs_9_0= ruleFunction )
            	    {
            	    // InternalEldmDslParser.g:186:4: (lv_funcs_9_0= ruleFunction )
            	    // InternalEldmDslParser.g:187:5: lv_funcs_9_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getFuncsFunctionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_funcs_9_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"funcs",
            	      						lv_funcs_9_0,
            	      						"net.eldm.EldmDsl.Function");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalEldmDslParser.g:204:3: ( (lv_paths_10_0= ruleSubPath ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Def) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEldmDslParser.g:205:4: (lv_paths_10_0= ruleSubPath )
            	    {
            	    // InternalEldmDslParser.g:205:4: (lv_paths_10_0= ruleSubPath )
            	    // InternalEldmDslParser.g:206:5: lv_paths_10_0= ruleSubPath
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getPathsSubPathParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_paths_10_0=ruleSubPath();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paths",
            	      						lv_paths_10_0,
            	      						"net.eldm.EldmDsl.SubPath");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalEldmDslParser.g:227:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEldmDslParser.g:227:47: (iv_ruleImport= ruleImport EOF )
            // InternalEldmDslParser.g:228:2: iv_ruleImport= ruleImport EOF
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
    // InternalEldmDslParser.g:234:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK ) ;
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
            // InternalEldmDslParser.g:240:2: ( (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK ) )
            // InternalEldmDslParser.g:241:2: (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK )
            {
            // InternalEldmDslParser.g:241:2: (otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK )
            // InternalEldmDslParser.g:242:3: otherlv_0= Import ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) ) otherlv_5= From ( (lv_ref_6_0= rulePathLiteral ) ) ruleBREAK
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalEldmDslParser.g:246:3: ( ( (lv_path_1_0= rulePathLiteral ) ) | ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_PATH) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEldmDslParser.g:247:4: ( (lv_path_1_0= rulePathLiteral ) )
                    {
                    // InternalEldmDslParser.g:247:4: ( (lv_path_1_0= rulePathLiteral ) )
                    // InternalEldmDslParser.g:248:5: (lv_path_1_0= rulePathLiteral )
                    {
                    // InternalEldmDslParser.g:248:5: (lv_path_1_0= rulePathLiteral )
                    // InternalEldmDslParser.g:249:6: lv_path_1_0= rulePathLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getPathPathLiteralParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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
                    // InternalEldmDslParser.g:267:4: ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* )
                    {
                    // InternalEldmDslParser.g:267:4: ( ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )* )
                    // InternalEldmDslParser.g:268:5: ( (lv_defs_2_0= ruleExternalDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )*
                    {
                    // InternalEldmDslParser.g:268:5: ( (lv_defs_2_0= ruleExternalDef ) )
                    // InternalEldmDslParser.g:269:6: (lv_defs_2_0= ruleExternalDef )
                    {
                    // InternalEldmDslParser.g:269:6: (lv_defs_2_0= ruleExternalDef )
                    // InternalEldmDslParser.g:270:7: lv_defs_2_0= ruleExternalDef
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportAccess().getDefsExternalDefParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalEldmDslParser.g:287:5: (otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:288:6: otherlv_3= Comma ( (lv_defs_4_0= ruleExternalDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getImportAccess().getCommaKeyword_1_1_1_0());
                    	      					
                    	    }
                    	    // InternalEldmDslParser.g:292:6: ( (lv_defs_4_0= ruleExternalDef ) )
                    	    // InternalEldmDslParser.g:293:7: (lv_defs_4_0= ruleExternalDef )
                    	    {
                    	    // InternalEldmDslParser.g:293:7: (lv_defs_4_0= ruleExternalDef )
                    	    // InternalEldmDslParser.g:294:8: lv_defs_4_0= ruleExternalDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getImportAccess().getDefsExternalDefParserRuleCall_1_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop8;
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
            // InternalEldmDslParser.g:318:3: ( (lv_ref_6_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:319:4: (lv_ref_6_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:319:4: (lv_ref_6_0= rulePathLiteral )
            // InternalEldmDslParser.g:320:5: lv_ref_6_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getRefPathLiteralParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
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
    // InternalEldmDslParser.g:348:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalEldmDslParser.g:348:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalEldmDslParser.g:349:2: iv_ruleExternalDef= ruleExternalDef EOF
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
    // InternalEldmDslParser.g:355:1: ruleExternalDef returns [EObject current=null] : ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:361:2: ( ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:362:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:362:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (true) ) {
                    alt11=1;
                }
                else if ( (synpred1_InternalEldmDslParser()) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEldmDslParser.g:363:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    {
                    // InternalEldmDslParser.g:363:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    // InternalEldmDslParser.g:364:4: ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    {
                    // InternalEldmDslParser.g:364:4: ( (lv_ref_0_0= RULE_ID ) )
                    // InternalEldmDslParser.g:365:5: (lv_ref_0_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:365:5: (lv_ref_0_0= RULE_ID )
                    // InternalEldmDslParser.g:366:6: lv_ref_0_0= RULE_ID
                    {
                    lv_ref_0_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:382:4: (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==As) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalEldmDslParser.g:383:5: otherlv_1= As ( (lv_name_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,As,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getExternalDefAccess().getAsKeyword_0_1_0());
                              				
                            }
                            // InternalEldmDslParser.g:387:5: ( (lv_name_2_0= RULE_ID ) )
                            // InternalEldmDslParser.g:388:6: (lv_name_2_0= RULE_ID )
                            {
                            // InternalEldmDslParser.g:388:6: (lv_name_2_0= RULE_ID )
                            // InternalEldmDslParser.g:389:7: lv_name_2_0= RULE_ID
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
                    // InternalEldmDslParser.g:408:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:408:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    // InternalEldmDslParser.g:409:4: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:413:4: (lv_name_3_0= RULE_ID )
                    // InternalEldmDslParser.g:414:5: lv_name_3_0= RULE_ID
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
    // InternalEldmDslParser.g:434:1: entryRulePlugDsl returns [EObject current=null] : iv_rulePlugDsl= rulePlugDsl EOF ;
    public final EObject entryRulePlugDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugDsl = null;


        try {
            // InternalEldmDslParser.g:434:48: (iv_rulePlugDsl= rulePlugDsl EOF )
            // InternalEldmDslParser.g:435:2: iv_rulePlugDsl= rulePlugDsl EOF
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
    // InternalEldmDslParser.g:441:1: rulePlugDsl returns [EObject current=null] : (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK ) ;
    public final EObject rulePlugDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_ref_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:447:2: ( (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK ) )
            // InternalEldmDslParser.g:448:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK )
            {
            // InternalEldmDslParser.g:448:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK )
            // InternalEldmDslParser.g:449:3: otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) otherlv_2= From ( (lv_ref_3_0= rulePathLiteral ) ) ruleBREAK
            {
            otherlv_0=(Token)match(input,PlugDsl,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlugDslAccess().getPlugDslKeyword_0());
              		
            }
            // InternalEldmDslParser.g:453:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:454:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:454:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:455:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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
            // InternalEldmDslParser.g:475:3: ( (lv_ref_3_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:476:4: (lv_ref_3_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:476:4: (lv_ref_3_0= rulePathLiteral )
            // InternalEldmDslParser.g:477:5: lv_ref_3_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlugDslAccess().getRefPathLiteralParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
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


    // $ANTLR start "entryRuleFunction"
    // InternalEldmDslParser.g:505:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalEldmDslParser.g:505:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalEldmDslParser.g:506:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalEldmDslParser.g:512:1: ruleFunction returns [EObject current=null] : ( ( (lv_decl_0_0= ruleFuncDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:518:2: ( ( ( (lv_decl_0_0= ruleFuncDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) ) )
            // InternalEldmDslParser.g:519:2: ( ( (lv_decl_0_0= ruleFuncDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) )
            {
            // InternalEldmDslParser.g:519:2: ( ( (lv_decl_0_0= ruleFuncDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) )
            // InternalEldmDslParser.g:520:3: ( (lv_decl_0_0= ruleFuncDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) )
            {
            // InternalEldmDslParser.g:520:3: ( (lv_decl_0_0= ruleFuncDecl ) )
            // InternalEldmDslParser.g:521:4: (lv_decl_0_0= ruleFuncDecl )
            {
            // InternalEldmDslParser.g:521:4: (lv_decl_0_0= ruleFuncDecl )
            // InternalEldmDslParser.g:522:5: lv_decl_0_0= ruleFuncDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getDeclFuncDeclParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_decl_0_0=ruleFuncDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"decl",
              						lv_decl_0_0,
              						"net.eldm.EldmDsl.FuncDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEldmDslParser.g:539:3: ( (lv_body_1_0= ruleBlockExpression ) )
            // InternalEldmDslParser.g:540:4: (lv_body_1_0= ruleBlockExpression )
            {
            // InternalEldmDslParser.g:540:4: (lv_body_1_0= ruleBlockExpression )
            // InternalEldmDslParser.g:541:5: lv_body_1_0= ruleBlockExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getBodyBlockExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFuncDecl"
    // InternalEldmDslParser.g:562:1: entryRuleFuncDecl returns [EObject current=null] : iv_ruleFuncDecl= ruleFuncDecl EOF ;
    public final EObject entryRuleFuncDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDecl = null;


        try {
            // InternalEldmDslParser.g:562:49: (iv_ruleFuncDecl= ruleFuncDecl EOF )
            // InternalEldmDslParser.g:563:2: iv_ruleFuncDecl= ruleFuncDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFuncDecl=ruleFuncDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncDecl; 
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
    // $ANTLR end "entryRuleFuncDecl"


    // $ANTLR start "ruleFuncDecl"
    // InternalEldmDslParser.g:569:1: ruleFuncDecl returns [EObject current=null] : ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? ) ) otherlv_10= Colon ) ;
    public final EObject ruleFuncDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_2_0=null;
        Token lv_srv_3_0=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_param_1_0 = null;

        EObject lv_path_6_0 = null;

        EObject lv_param_7_0 = null;

        EObject lv_result_9_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:575:2: ( ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? ) ) otherlv_10= Colon ) )
            // InternalEldmDslParser.g:576:2: ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? ) ) otherlv_10= Colon )
            {
            // InternalEldmDslParser.g:576:2: ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? ) ) otherlv_10= Colon )
            // InternalEldmDslParser.g:577:3: ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? ) ) otherlv_10= Colon
            {
            // InternalEldmDslParser.g:577:3: ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Catch) ) {
                alt18=1;
            }
            else if ( (LA18_0==Def) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEldmDslParser.g:578:4: ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? )
                    {
                    // InternalEldmDslParser.g:578:4: ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? )
                    // InternalEldmDslParser.g:579:5: ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )?
                    {
                    // InternalEldmDslParser.g:579:5: ( (lv_type_0_0= Catch ) )
                    // InternalEldmDslParser.g:580:6: (lv_type_0_0= Catch )
                    {
                    // InternalEldmDslParser.g:580:6: (lv_type_0_0= Catch )
                    // InternalEldmDslParser.g:581:7: lv_type_0_0= Catch
                    {
                    lv_type_0_0=(Token)match(input,Catch,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_type_0_0, grammarAccess.getFuncDeclAccess().getTypeCatchKeyword_0_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFuncDeclRule());
                      							}
                      							setWithLastConsumed(current, "type", lv_type_0_0, "catch");
                      						
                    }

                    }


                    }

                    // InternalEldmDslParser.g:593:5: ( (lv_param_1_0= ruleElementDef ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=Bool && LA12_0<=Enum)||LA12_0==Path||LA12_0==Any||LA12_0==Flt||(LA12_0>=Int && LA12_0<=Ldt)||(LA12_0>=Lst && LA12_0<=Map)||LA12_0==Str||LA12_0==FullStopFullStop||LA12_0==LeftCurlyBracket||LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEldmDslParser.g:594:6: (lv_param_1_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:594:6: (lv_param_1_0= ruleElementDef )
                            // InternalEldmDslParser.g:595:7: lv_param_1_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFuncDeclAccess().getParamElementDefParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
                            lv_param_1_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFuncDeclRule());
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
                    // InternalEldmDslParser.g:614:4: ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? )
                    {
                    // InternalEldmDslParser.g:614:4: ( ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )? )
                    // InternalEldmDslParser.g:615:5: ( (lv_type_2_0= Def ) ) ( (lv_srv_3_0= Service ) )? ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set ) ( (lv_path_6_0= rulePathLiteral ) )? ( (lv_param_7_0= ruleElementDef ) )? (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )?
                    {
                    // InternalEldmDslParser.g:615:5: ( (lv_type_2_0= Def ) )
                    // InternalEldmDslParser.g:616:6: (lv_type_2_0= Def )
                    {
                    // InternalEldmDslParser.g:616:6: (lv_type_2_0= Def )
                    // InternalEldmDslParser.g:617:7: lv_type_2_0= Def
                    {
                    lv_type_2_0=(Token)match(input,Def,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_type_2_0, grammarAccess.getFuncDeclAccess().getTypeDefKeyword_0_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFuncDeclRule());
                      							}
                      							setWithLastConsumed(current, "type", lv_type_2_0, "def");
                      						
                    }

                    }


                    }

                    // InternalEldmDslParser.g:629:5: ( (lv_srv_3_0= Service ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Service) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalEldmDslParser.g:630:6: (lv_srv_3_0= Service )
                            {
                            // InternalEldmDslParser.g:630:6: (lv_srv_3_0= Service )
                            // InternalEldmDslParser.g:631:7: lv_srv_3_0= Service
                            {
                            lv_srv_3_0=(Token)match(input,Service,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_srv_3_0, grammarAccess.getFuncDeclAccess().getSrvServiceKeyword_0_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getFuncDeclRule());
                              							}
                              							setWithLastConsumed(current, "srv", true, "service");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:643:5: ( ( (lv_get_4_0= Get ) ) | otherlv_5= Set )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Get) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==Set) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEldmDslParser.g:644:6: ( (lv_get_4_0= Get ) )
                            {
                            // InternalEldmDslParser.g:644:6: ( (lv_get_4_0= Get ) )
                            // InternalEldmDslParser.g:645:7: (lv_get_4_0= Get )
                            {
                            // InternalEldmDslParser.g:645:7: (lv_get_4_0= Get )
                            // InternalEldmDslParser.g:646:8: lv_get_4_0= Get
                            {
                            lv_get_4_0=(Token)match(input,Get,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_get_4_0, grammarAccess.getFuncDeclAccess().getGetGetKeyword_0_1_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getFuncDeclRule());
                              								}
                              								setWithLastConsumed(current, "get", true, "get");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalEldmDslParser.g:659:6: otherlv_5= Set
                            {
                            otherlv_5=(Token)match(input,Set,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getFuncDeclAccess().getSetKeyword_0_1_2_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalEldmDslParser.g:664:5: ( (lv_path_6_0= rulePathLiteral ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_PATH) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEldmDslParser.g:665:6: (lv_path_6_0= rulePathLiteral )
                            {
                            // InternalEldmDslParser.g:665:6: (lv_path_6_0= rulePathLiteral )
                            // InternalEldmDslParser.g:666:7: lv_path_6_0= rulePathLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFuncDeclAccess().getPathPathLiteralParserRuleCall_0_1_3_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
                            lv_path_6_0=rulePathLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFuncDeclRule());
                              							}
                              							set(
                              								current,
                              								"path",
                              								lv_path_6_0,
                              								"net.eldm.EldmDsl.PathLiteral");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:683:5: ( (lv_param_7_0= ruleElementDef ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=Bool && LA16_0<=Enum)||LA16_0==Path||LA16_0==Any||LA16_0==Flt||(LA16_0>=Int && LA16_0<=Ldt)||(LA16_0>=Lst && LA16_0<=Map)||LA16_0==Str||LA16_0==FullStopFullStop||LA16_0==LeftCurlyBracket||LA16_0==RULE_ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEldmDslParser.g:684:6: (lv_param_7_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:684:6: (lv_param_7_0= ruleElementDef )
                            // InternalEldmDslParser.g:685:7: lv_param_7_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getFuncDeclAccess().getParamElementDefParserRuleCall_0_1_4_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
                            lv_param_7_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getFuncDeclRule());
                              							}
                              							set(
                              								current,
                              								"param",
                              								lv_param_7_0,
                              								"net.eldm.EldmDsl.ElementDef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:702:5: (otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==HyphenMinusGreaterThanSign) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalEldmDslParser.g:703:6: otherlv_8= HyphenMinusGreaterThanSign ( (lv_result_9_0= ruleElementDef ) )
                            {
                            otherlv_8=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getFuncDeclAccess().getHyphenMinusGreaterThanSignKeyword_0_1_5_0());
                              					
                            }
                            // InternalEldmDslParser.g:707:6: ( (lv_result_9_0= ruleElementDef ) )
                            // InternalEldmDslParser.g:708:7: (lv_result_9_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:708:7: (lv_result_9_0= ruleElementDef )
                            // InternalEldmDslParser.g:709:8: lv_result_9_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getFuncDeclAccess().getResultElementDefParserRuleCall_0_1_5_1_0());
                              							
                            }
                            pushFollow(FOLLOW_19);
                            lv_result_9_0=ruleElementDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getFuncDeclRule());
                              								}
                              								set(
                              									current,
                              									"result",
                              									lv_result_9_0,
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

            otherlv_10=(Token)match(input,Colon,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getFuncDeclAccess().getColonKeyword_1());
              		
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
    // $ANTLR end "ruleFuncDecl"


    // $ANTLR start "entryRuleSubPath"
    // InternalEldmDslParser.g:737:1: entryRuleSubPath returns [EObject current=null] : iv_ruleSubPath= ruleSubPath EOF ;
    public final EObject entryRuleSubPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPath = null;


        try {
            // InternalEldmDslParser.g:737:48: (iv_ruleSubPath= ruleSubPath EOF )
            // InternalEldmDslParser.g:738:2: iv_ruleSubPath= ruleSubPath EOF
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
    // InternalEldmDslParser.g:744:1: ruleSubPath returns [EObject current=null] : (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleFunction ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleSubPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_path_1_0 = null;

        EObject lv_funcs_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:750:2: ( (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleFunction ) )+ this_END_4= RULE_END ) )
            // InternalEldmDslParser.g:751:2: (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleFunction ) )+ this_END_4= RULE_END )
            {
            // InternalEldmDslParser.g:751:2: (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleFunction ) )+ this_END_4= RULE_END )
            // InternalEldmDslParser.g:752:3: otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleFunction ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubPathAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:756:3: ( (lv_path_1_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:757:4: (lv_path_1_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:757:4: (lv_path_1_0= rulePathLiteral )
            // InternalEldmDslParser.g:758:5: lv_path_1_0= rulePathLiteral
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalEldmDslParser.g:779:3: ( (lv_funcs_3_0= ruleFunction ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Catch||LA19_0==Def) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEldmDslParser.g:780:4: (lv_funcs_3_0= ruleFunction )
            	    {
            	    // InternalEldmDslParser.g:780:4: (lv_funcs_3_0= ruleFunction )
            	    // InternalEldmDslParser.g:781:5: lv_funcs_3_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubPathAccess().getFuncsFunctionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_funcs_3_0=ruleFunction();

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
            	      						"net.eldm.EldmDsl.Function");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalEldmDslParser.g:806:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // InternalEldmDslParser.g:806:56: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // InternalEldmDslParser.g:807:2: iv_ruleBlockExpression= ruleBlockExpression EOF
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
    // InternalEldmDslParser.g:813:1: ruleBlockExpression returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:819:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) )
            // InternalEldmDslParser.g:820:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            {
            // InternalEldmDslParser.g:820:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            // InternalEldmDslParser.g:821:3: () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END
            {
            // InternalEldmDslParser.g:821:3: ()
            // InternalEldmDslParser.g:822:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0(),
              					current);
              			
            }

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_1, grammarAccess.getBlockExpressionAccess().getBEGINTerminalRuleCall_1());
              		
            }
            // InternalEldmDslParser.g:832:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Let||LA20_0==Var) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEldmDslParser.g:833:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalEldmDslParser.g:833:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalEldmDslParser.g:834:5: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
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
            	    break loop20;
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
    // InternalEldmDslParser.g:859:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEldmDslParser.g:859:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEldmDslParser.g:860:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEldmDslParser.g:866:1: ruleExpression returns [EObject current=null] : this_Identifier_0= ruleIdentifier ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:872:2: (this_Identifier_0= ruleIdentifier )
            // InternalEldmDslParser.g:873:2: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Identifier_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIdentifier"
    // InternalEldmDslParser.g:884:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalEldmDslParser.g:884:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalEldmDslParser.g:885:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalEldmDslParser.g:891:1: ruleIdentifier returns [EObject current=null] : this_Var_0= ruleVar ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:897:2: (this_Var_0= ruleVar )
            // InternalEldmDslParser.g:898:2: this_Var_0= ruleVar
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIdentifierAccess().getVarParserRuleCall());
              	
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleVar"
    // InternalEldmDslParser.g:909:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalEldmDslParser.g:909:44: (iv_ruleVar= ruleVar EOF )
            // InternalEldmDslParser.g:910:2: iv_ruleVar= ruleVar EOF
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
    // InternalEldmDslParser.g:916:1: ruleVar returns [EObject current=null] : ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) ) ;
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
            // InternalEldmDslParser.g:922:2: ( ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) ) )
            // InternalEldmDslParser.g:923:2: ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) )
            {
            // InternalEldmDslParser.g:923:2: ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) )
            // InternalEldmDslParser.g:924:3: ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) )
            {
            // InternalEldmDslParser.g:924:3: ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Let) ) {
                alt21=1;
            }
            else if ( (LA21_0==Var) ) {
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
                    // InternalEldmDslParser.g:925:4: ( (lv_let_0_0= Let ) )
                    {
                    // InternalEldmDslParser.g:925:4: ( (lv_let_0_0= Let ) )
                    // InternalEldmDslParser.g:926:5: (lv_let_0_0= Let )
                    {
                    // InternalEldmDslParser.g:926:5: (lv_let_0_0= Let )
                    // InternalEldmDslParser.g:927:6: lv_let_0_0= Let
                    {
                    lv_let_0_0=(Token)match(input,Let,FOLLOW_17); if (state.failed) return current;
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
                    // InternalEldmDslParser.g:940:4: otherlv_1= Var
                    {
                    otherlv_1=(Token)match(input,Var,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVarAccess().getVarKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:945:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEldmDslParser.g:946:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEldmDslParser.g:946:4: (lv_name_2_0= RULE_ID )
            // InternalEldmDslParser.g:947:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            // InternalEldmDslParser.g:963:3: (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Colon) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEldmDslParser.g:964:4: otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) )
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVarAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalEldmDslParser.g:968:4: ( (lv_type_4_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:969:5: (lv_type_4_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:969:5: (lv_type_4_0= ruleElementDef )
                    // InternalEldmDslParser.g:970:6: lv_type_4_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAccess().getTypeElementDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
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

            otherlv_5=(Token)match(input,EqualsSign,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVarAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalEldmDslParser.g:992:3: ( (lv_result_6_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:993:4: (lv_result_6_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:993:4: (lv_result_6_0= ruleValueExpression )
            // InternalEldmDslParser.g:994:5: lv_result_6_0= ruleValueExpression
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


    // $ANTLR start "entryRuleValueExpression"
    // InternalEldmDslParser.g:1015:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // InternalEldmDslParser.g:1015:56: (iv_ruleValueExpression= ruleValueExpression EOF )
            // InternalEldmDslParser.g:1016:2: iv_ruleValueExpression= ruleValueExpression EOF
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
    // InternalEldmDslParser.g:1022:1: ruleValueExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1028:2: (this_OrExpression_0= ruleOrExpression )
            // InternalEldmDslParser.g:1029:2: this_OrExpression_0= ruleOrExpression
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
    // InternalEldmDslParser.g:1040:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalEldmDslParser.g:1040:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalEldmDslParser.g:1041:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalEldmDslParser.g:1047:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1053:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEldmDslParser.g:1054:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1054:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEldmDslParser.g:1055:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1063:3: ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Or) && (synpred2_InternalEldmDslParser())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEldmDslParser.g:1064:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1064:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) )
            	    // InternalEldmDslParser.g:1065:5: ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) )
            	    {
            	    // InternalEldmDslParser.g:1075:5: ( () ( (lv_feature_2_0= Or ) ) )
            	    // InternalEldmDslParser.g:1076:6: () ( (lv_feature_2_0= Or ) )
            	    {
            	    // InternalEldmDslParser.g:1076:6: ()
            	    // InternalEldmDslParser.g:1077:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1083:6: ( (lv_feature_2_0= Or ) )
            	    // InternalEldmDslParser.g:1084:7: (lv_feature_2_0= Or )
            	    {
            	    // InternalEldmDslParser.g:1084:7: (lv_feature_2_0= Or )
            	    // InternalEldmDslParser.g:1085:8: lv_feature_2_0= Or
            	    {
            	    lv_feature_2_0=(Token)match(input,Or,FOLLOW_30); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1099:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEldmDslParser.g:1100:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEldmDslParser.g:1100:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEldmDslParser.g:1101:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop23;
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
    // InternalEldmDslParser.g:1123:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEldmDslParser.g:1123:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEldmDslParser.g:1124:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalEldmDslParser.g:1130:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1136:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalEldmDslParser.g:1137:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1137:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalEldmDslParser.g:1138:3: this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1146:3: ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==And) && (synpred3_InternalEldmDslParser())) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEldmDslParser.g:1147:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1147:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) )
            	    // InternalEldmDslParser.g:1148:5: ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) )
            	    {
            	    // InternalEldmDslParser.g:1158:5: ( () ( (lv_feature_2_0= And ) ) )
            	    // InternalEldmDslParser.g:1159:6: () ( (lv_feature_2_0= And ) )
            	    {
            	    // InternalEldmDslParser.g:1159:6: ()
            	    // InternalEldmDslParser.g:1160:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1166:6: ( (lv_feature_2_0= And ) )
            	    // InternalEldmDslParser.g:1167:7: (lv_feature_2_0= And )
            	    {
            	    // InternalEldmDslParser.g:1167:7: (lv_feature_2_0= And )
            	    // InternalEldmDslParser.g:1168:8: lv_feature_2_0= And
            	    {
            	    lv_feature_2_0=(Token)match(input,And,FOLLOW_30); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1182:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalEldmDslParser.g:1183:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalEldmDslParser.g:1183:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalEldmDslParser.g:1184:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    break loop24;
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
    // InternalEldmDslParser.g:1206:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalEldmDslParser.g:1206:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalEldmDslParser.g:1207:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalEldmDslParser.g:1213:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1219:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalEldmDslParser.g:1220:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1220:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalEldmDslParser.g:1221:3: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1229:3: ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==EqualsSignEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt26=1;
                }
                else if ( (LA26_0==ExclamationMarkEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEldmDslParser.g:1230:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1230:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1231:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1245:5: ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalEldmDslParser.g:1246:6: () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1246:6: ()
            	    // InternalEldmDslParser.g:1247:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEqualityExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1253:6: ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalEldmDslParser.g:1254:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalEldmDslParser.g:1254:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalEldmDslParser.g:1255:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalEldmDslParser.g:1255:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==EqualsSignEqualsSign) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==ExclamationMarkEqualsSign) ) {
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
            	            // InternalEldmDslParser.g:1256:9: lv_feature_2_1= EqualsSignEqualsSign
            	            {
            	            lv_feature_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1267:9: lv_feature_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_feature_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_30); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1282:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalEldmDslParser.g:1283:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalEldmDslParser.g:1283:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalEldmDslParser.g:1284:6: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop26;
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
    // InternalEldmDslParser.g:1306:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalEldmDslParser.g:1306:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalEldmDslParser.g:1307:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalEldmDslParser.g:1313:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) ;
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
            // InternalEldmDslParser.g:1319:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) )
            // InternalEldmDslParser.g:1320:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            {
            // InternalEldmDslParser.g:1320:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            // InternalEldmDslParser.g:1321:3: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1329:3: ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Is) && (synpred5_InternalEldmDslParser())) {
                    alt28=1;
                }
                else if ( (LA28_0==GreaterThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt28=2;
                }
                else if ( (LA28_0==LessThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt28=2;
                }
                else if ( (LA28_0==GreaterThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt28=2;
                }
                else if ( (LA28_0==LessThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEldmDslParser.g:1330:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    {
            	    // InternalEldmDslParser.g:1330:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    // InternalEldmDslParser.g:1331:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) )
            	    {
            	    // InternalEldmDslParser.g:1331:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) )
            	    // InternalEldmDslParser.g:1332:6: ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) )
            	    {
            	    // InternalEldmDslParser.g:1342:6: ( () ( (lv_feature_2_0= Is ) ) )
            	    // InternalEldmDslParser.g:1343:7: () ( (lv_feature_2_0= Is ) )
            	    {
            	    // InternalEldmDslParser.g:1343:7: ()
            	    // InternalEldmDslParser.g:1344:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getIsExpressionLeftAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1350:7: ( (lv_feature_2_0= Is ) )
            	    // InternalEldmDslParser.g:1351:8: (lv_feature_2_0= Is )
            	    {
            	    // InternalEldmDslParser.g:1351:8: (lv_feature_2_0= Is )
            	    // InternalEldmDslParser.g:1352:9: lv_feature_2_0= Is
            	    {
            	    lv_feature_2_0=(Token)match(input,Is,FOLLOW_25); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1366:5: ( (lv_type_3_0= ruleElementDef ) )
            	    // InternalEldmDslParser.g:1367:6: (lv_type_3_0= ruleElementDef )
            	    {
            	    // InternalEldmDslParser.g:1367:6: (lv_type_3_0= ruleElementDef )
            	    // InternalEldmDslParser.g:1368:7: lv_type_3_0= ruleElementDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getTypeElementDefParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    // InternalEldmDslParser.g:1387:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    {
            	    // InternalEldmDslParser.g:1387:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    // InternalEldmDslParser.g:1388:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1388:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1389:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1407:6: ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    // InternalEldmDslParser.g:1408:7: () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1408:7: ()
            	    // InternalEldmDslParser.g:1409:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getValueExpressionLeftAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1415:7: ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    // InternalEldmDslParser.g:1416:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    {
            	    // InternalEldmDslParser.g:1416:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    // InternalEldmDslParser.g:1417:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    {
            	    // InternalEldmDslParser.g:1417:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    int alt27=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1418:10: lv_feature_5_1= GreaterThanSignEqualsSign
            	            {
            	            lv_feature_5_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1429:10: lv_feature_5_2= LessThanSignEqualsSign
            	            {
            	            lv_feature_5_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1440:10: lv_feature_5_3= GreaterThanSign
            	            {
            	            lv_feature_5_3=(Token)match(input,GreaterThanSign,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1451:10: lv_feature_5_4= LessThanSign
            	            {
            	            lv_feature_5_4=(Token)match(input,LessThanSign,FOLLOW_30); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1466:5: ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    // InternalEldmDslParser.g:1467:6: (lv_right_6_0= ruleAdditiveExpression )
            	    {
            	    // InternalEldmDslParser.g:1467:6: (lv_right_6_0= ruleAdditiveExpression )
            	    // InternalEldmDslParser.g:1468:7: lv_right_6_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_34);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalEldmDslParser.g:1491:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalEldmDslParser.g:1491:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalEldmDslParser.g:1492:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalEldmDslParser.g:1498:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
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
            // InternalEldmDslParser.g:1504:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalEldmDslParser.g:1505:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1505:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalEldmDslParser.g:1506:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1514:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==PlusSign) && (synpred7_InternalEldmDslParser())) {
                    alt30=1;
                }
                else if ( (LA30_0==HyphenMinus) && (synpred7_InternalEldmDslParser())) {
                    alt30=1;
                }
                else if ( (LA30_0==Set) && (synpred7_InternalEldmDslParser())) {
                    alt30=1;
                }
                else if ( (LA30_0==Del) && (synpred7_InternalEldmDslParser())) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEldmDslParser.g:1515:4: ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1515:4: ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) )
            	    // InternalEldmDslParser.g:1516:5: ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1534:5: ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) )
            	    // InternalEldmDslParser.g:1535:6: () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) )
            	    {
            	    // InternalEldmDslParser.g:1535:6: ()
            	    // InternalEldmDslParser.g:1536:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAdditiveExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1542:6: ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) )
            	    // InternalEldmDslParser.g:1543:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) )
            	    {
            	    // InternalEldmDslParser.g:1543:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) )
            	    // InternalEldmDslParser.g:1544:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del )
            	    {
            	    // InternalEldmDslParser.g:1544:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case PlusSign:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case HyphenMinus:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case Set:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case Del:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1545:9: lv_feature_2_1= PlusSign
            	            {
            	            lv_feature_2_1=(Token)match(input,PlusSign,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1556:9: lv_feature_2_2= HyphenMinus
            	            {
            	            lv_feature_2_2=(Token)match(input,HyphenMinus,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1567:9: lv_feature_2_3= Set
            	            {
            	            lv_feature_2_3=(Token)match(input,Set,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1578:9: lv_feature_2_4= Del
            	            {
            	            lv_feature_2_4=(Token)match(input,Del,FOLLOW_30); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1593:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalEldmDslParser.g:1594:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalEldmDslParser.g:1594:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalEldmDslParser.g:1595:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop30;
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
    // InternalEldmDslParser.g:1617:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalEldmDslParser.g:1617:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalEldmDslParser.g:1618:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalEldmDslParser.g:1624:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
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
            // InternalEldmDslParser.g:1630:2: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // InternalEldmDslParser.g:1631:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // InternalEldmDslParser.g:1631:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // InternalEldmDslParser.g:1632:3: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1640:3: ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Asterisk) && (synpred8_InternalEldmDslParser())) {
                    alt32=1;
                }
                else if ( (LA32_0==AsteriskAsterisk) && (synpred8_InternalEldmDslParser())) {
                    alt32=1;
                }
                else if ( (LA32_0==Solidus) && (synpred8_InternalEldmDslParser())) {
                    alt32=1;
                }
                else if ( (LA32_0==PercentSign) && (synpred8_InternalEldmDslParser())) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEldmDslParser.g:1641:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // InternalEldmDslParser.g:1641:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1642:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1660:5: ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    // InternalEldmDslParser.g:1661:6: () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1661:6: ()
            	    // InternalEldmDslParser.g:1662:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1668:6: ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    // InternalEldmDslParser.g:1669:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    {
            	    // InternalEldmDslParser.g:1669:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    // InternalEldmDslParser.g:1670:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    {
            	    // InternalEldmDslParser.g:1670:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    int alt31=4;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case AsteriskAsterisk:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt31=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1671:9: lv_feature_2_1= Asterisk
            	            {
            	            lv_feature_2_1=(Token)match(input,Asterisk,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1682:9: lv_feature_2_2= AsteriskAsterisk
            	            {
            	            lv_feature_2_2=(Token)match(input,AsteriskAsterisk,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1693:9: lv_feature_2_3= Solidus
            	            {
            	            lv_feature_2_3=(Token)match(input,Solidus,FOLLOW_30); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1704:9: lv_feature_2_4= PercentSign
            	            {
            	            lv_feature_2_4=(Token)match(input,PercentSign,FOLLOW_30); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1719:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // InternalEldmDslParser.g:1720:5: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // InternalEldmDslParser.g:1720:5: (lv_right_3_0= ruleUnaryOperation )
            	    // InternalEldmDslParser.g:1721:6: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop32;
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
    // InternalEldmDslParser.g:1743:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalEldmDslParser.g:1743:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalEldmDslParser.g:1744:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
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
    // InternalEldmDslParser.g:1750:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1756:2: ( ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalEldmDslParser.g:1757:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalEldmDslParser.g:1757:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ExclamationMark) ) {
                alt33=1;
            }
            else if ( (LA33_0==False||(LA33_0>=Bool && LA33_0<=Enum)||(LA33_0>=Path && LA33_0<=True)||LA33_0==Any||LA33_0==Flt||(LA33_0>=Int && LA33_0<=Ldt)||(LA33_0>=Lst && LA33_0<=Map)||LA33_0==Str||LA33_0==LeftParenthesis||(LA33_0>=CommercialAt && LA33_0<=LeftSquareBracket)||LA33_0==LeftCurlyBracket||LA33_0==LeftPointingDoubleAngleQuotationMark||(LA33_0>=RULE_PATH && LA33_0<=RULE_ID)||(LA33_0>=RULE_NATURAL && LA33_0<=RULE_TEXT)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalEldmDslParser.g:1758:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // InternalEldmDslParser.g:1758:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // InternalEldmDslParser.g:1759:4: () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // InternalEldmDslParser.g:1759:4: ()
                    // InternalEldmDslParser.g:1760:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEldmDslParser.g:1766:4: ( (lv_feature_1_0= ExclamationMark ) )
                    // InternalEldmDslParser.g:1767:5: (lv_feature_1_0= ExclamationMark )
                    {
                    // InternalEldmDslParser.g:1767:5: (lv_feature_1_0= ExclamationMark )
                    // InternalEldmDslParser.g:1768:6: lv_feature_1_0= ExclamationMark
                    {
                    lv_feature_1_0=(Token)match(input,ExclamationMark,FOLLOW_30); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:1780:4: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // InternalEldmDslParser.g:1781:5: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // InternalEldmDslParser.g:1781:5: (lv_operand_2_0= ruleUnaryOperation )
                    // InternalEldmDslParser.g:1782:6: lv_operand_2_0= ruleUnaryOperation
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
                    // InternalEldmDslParser.g:1801:3: this_Primary_3= rulePrimary
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
    // InternalEldmDslParser.g:1813:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEldmDslParser.g:1813:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEldmDslParser.g:1814:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalEldmDslParser.g:1820:1: rulePrimary returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) ) ;
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
            // InternalEldmDslParser.g:1826:2: ( ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) ) )
            // InternalEldmDslParser.g:1827:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) )
            {
            // InternalEldmDslParser.g:1827:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) )
            int alt37=2;
            switch ( input.LA(1) ) {
            case False:
            case Bool:
            case Enum:
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
            case CommercialAt:
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
                alt37=1;
                }
                break;
            case RULE_ID:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==EOF||LA37_2==And||LA37_2==Del||LA37_2==Let||LA37_2==Set||(LA37_2>=Var && LA37_2<=AsteriskFullStop)||(LA37_2>=LessThanSignEqualsSign && LA37_2<=GreaterThanSignEqualsSign)||(LA37_2>=Is && LA37_2<=Or)||LA37_2==PercentSign||(LA37_2>=RightParenthesis && LA37_2<=PlusSign)||(LA37_2>=HyphenMinus && LA37_2<=Solidus)||LA37_2==LessThanSign||LA37_2==GreaterThanSign||LA37_2==RULE_END) ) {
                    alt37=2;
                }
                else if ( (LA37_2==CommercialAt) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
            case LeftPointingDoubleAngleQuotationMark:
                {
                alt37=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalEldmDslParser.g:1828:3: ( (lv_value_0_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:1828:3: ( (lv_value_0_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:1829:4: (lv_value_0_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:1829:4: (lv_value_0_0= ruleLiteral )
                    // InternalEldmDslParser.g:1830:5: lv_value_0_0= ruleLiteral
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
                    // InternalEldmDslParser.g:1848:3: ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* )
                    {
                    // InternalEldmDslParser.g:1848:3: ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* )
                    // InternalEldmDslParser.g:1849:4: ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )*
                    {
                    // InternalEldmDslParser.g:1849:4: ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==LeftPointingDoubleAngleQuotationMark) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalEldmDslParser.g:1850:5: ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark
                            {
                            // InternalEldmDslParser.g:1850:5: ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) )
                            // InternalEldmDslParser.g:1851:6: (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark )
                            {
                            // InternalEldmDslParser.g:1851:6: (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark )
                            // InternalEldmDslParser.g:1852:7: lv_cast_1_0= LeftPointingDoubleAngleQuotationMark
                            {
                            lv_cast_1_0=(Token)match(input,LeftPointingDoubleAngleQuotationMark,FOLLOW_25); if (state.failed) return current;
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

                            // InternalEldmDslParser.g:1864:5: ( (lv_type_2_0= ruleElementDef ) )
                            // InternalEldmDslParser.g:1865:6: (lv_type_2_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:1865:6: (lv_type_2_0= ruleElementDef )
                            // InternalEldmDslParser.g:1866:7: lv_type_2_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimaryAccess().getTypeElementDefParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_37);
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

                            otherlv_3=(Token)match(input,RightPointingDoubleAngleQuotationMark,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightPointingDoubleAngleQuotationMarkKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEldmDslParser.g:1888:4: ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==LeftParenthesis) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalEldmDslParser.g:1889:5: ( (lv_ref_4_0= RULE_ID ) )
                            {
                            // InternalEldmDslParser.g:1889:5: ( (lv_ref_4_0= RULE_ID ) )
                            // InternalEldmDslParser.g:1890:6: (lv_ref_4_0= RULE_ID )
                            {
                            // InternalEldmDslParser.g:1890:6: (lv_ref_4_0= RULE_ID )
                            // InternalEldmDslParser.g:1891:7: lv_ref_4_0= RULE_ID
                            {
                            lv_ref_4_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
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
                            // InternalEldmDslParser.g:1908:5: (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis )
                            {
                            // InternalEldmDslParser.g:1908:5: (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis )
                            // InternalEldmDslParser.g:1909:6: otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis
                            {
                            otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1_1_0());
                              					
                            }
                            // InternalEldmDslParser.g:1913:6: ( (lv_exp_6_0= ruleValueExpression ) )
                            // InternalEldmDslParser.g:1914:7: (lv_exp_6_0= ruleValueExpression )
                            {
                            // InternalEldmDslParser.g:1914:7: (lv_exp_6_0= ruleValueExpression )
                            // InternalEldmDslParser.g:1915:8: lv_exp_6_0= ruleValueExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPrimaryAccess().getExpValueExpressionParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_40);
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

                            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_1_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:1938:4: ( (lv_calls_8_0= ruleMemberCall ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==AsteriskFullStop||LA36_0==FullStop) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:1939:5: (lv_calls_8_0= ruleMemberCall )
                    	    {
                    	    // InternalEldmDslParser.g:1939:5: (lv_calls_8_0= ruleMemberCall )
                    	    // InternalEldmDslParser.g:1940:6: lv_calls_8_0= ruleMemberCall
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPrimaryAccess().getCallsMemberCallParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop36;
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
    // InternalEldmDslParser.g:1962:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalEldmDslParser.g:1962:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalEldmDslParser.g:1963:2: iv_ruleMemberCall= ruleMemberCall EOF
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
    // InternalEldmDslParser.g:1969:1: ruleMemberCall returns [EObject current=null] : ( (otherlv_0= FullStop | ( (lv_unknown_1_0= AsteriskFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unknown_1_0=null;
        Token lv_member_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:1975:2: ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= AsteriskFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:1976:2: ( (otherlv_0= FullStop | ( (lv_unknown_1_0= AsteriskFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:1976:2: ( (otherlv_0= FullStop | ( (lv_unknown_1_0= AsteriskFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) )
            // InternalEldmDslParser.g:1977:3: (otherlv_0= FullStop | ( (lv_unknown_1_0= AsteriskFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) )
            {
            // InternalEldmDslParser.g:1977:3: (otherlv_0= FullStop | ( (lv_unknown_1_0= AsteriskFullStop ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==FullStop) ) {
                alt38=1;
            }
            else if ( (LA38_0==AsteriskFullStop) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalEldmDslParser.g:1978:4: otherlv_0= FullStop
                    {
                    otherlv_0=(Token)match(input,FullStop,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMemberCallAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1983:4: ( (lv_unknown_1_0= AsteriskFullStop ) )
                    {
                    // InternalEldmDslParser.g:1983:4: ( (lv_unknown_1_0= AsteriskFullStop ) )
                    // InternalEldmDslParser.g:1984:5: (lv_unknown_1_0= AsteriskFullStop )
                    {
                    // InternalEldmDslParser.g:1984:5: (lv_unknown_1_0= AsteriskFullStop )
                    // InternalEldmDslParser.g:1985:6: lv_unknown_1_0= AsteriskFullStop
                    {
                    lv_unknown_1_0=(Token)match(input,AsteriskFullStop,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unknown_1_0, grammarAccess.getMemberCallAccess().getUnknownAsteriskFullStopKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMemberCallRule());
                      						}
                      						setWithLastConsumed(current, "unknown", true, "*.");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:1998:3: ( (lv_member_2_0= RULE_ID ) )
            // InternalEldmDslParser.g:1999:4: (lv_member_2_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1999:4: (lv_member_2_0= RULE_ID )
            // InternalEldmDslParser.g:2000:5: lv_member_2_0= RULE_ID
            {
            lv_member_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_member_2_0, grammarAccess.getMemberCallAccess().getMemberIDTerminalRuleCall_1_0());
              				
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


    // $ANTLR start "entryRuleDefinition"
    // InternalEldmDslParser.g:2020:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalEldmDslParser.g:2020:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalEldmDslParser.g:2021:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalEldmDslParser.g:2027:1: ruleDefinition returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_ExternalDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2033:2: ( (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) )
            // InternalEldmDslParser.g:2034:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            {
            // InternalEldmDslParser.g:2034:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Typedef) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalEldmDslParser.g:2035:3: this_TypeDef_0= ruleTypeDef
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
                    // InternalEldmDslParser.g:2044:3: this_ExternalDef_1= ruleExternalDef
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
    // InternalEldmDslParser.g:2056:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEldmDslParser.g:2056:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEldmDslParser.g:2057:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalEldmDslParser.g:2063:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) ) ;
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
            // InternalEldmDslParser.g:2069:2: ( (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) ) )
            // InternalEldmDslParser.g:2070:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) )
            {
            // InternalEldmDslParser.g:2070:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) )
            // InternalEldmDslParser.g:2071:3: otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) )
            {
            otherlv_0=(Token)match(input,Typedef,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2075:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:2076:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2076:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:2077:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2093:3: ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Match||LA41_0==Mask) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=Bool && LA41_0<=Enum)||LA41_0==Path||LA41_0==Any||LA41_0==Flt||(LA41_0>=Int && LA41_0<=Ldt)||(LA41_0>=Lst && LA41_0<=Map)||LA41_0==Str||LA41_0==FullStopFullStop||LA41_0==LeftCurlyBracket||LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalEldmDslParser.g:2094:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    {
                    // InternalEldmDslParser.g:2094:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    // InternalEldmDslParser.g:2095:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) )
                    {
                    // InternalEldmDslParser.g:2095:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) )
                    // InternalEldmDslParser.g:2096:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    {
                    // InternalEldmDslParser.g:2096:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    // InternalEldmDslParser.g:2097:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    {
                    // InternalEldmDslParser.g:2097:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Match) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==Mask) ) {
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
                            // InternalEldmDslParser.g:2098:8: lv_parser_2_1= Match
                            {
                            lv_parser_2_1=(Token)match(input,Match,FOLLOW_42); if (state.failed) return current;
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
                            // InternalEldmDslParser.g:2109:8: lv_parser_2_2= Mask
                            {
                            lv_parser_2_2=(Token)match(input,Mask,FOLLOW_42); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2122:5: ( (lv_code_3_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:2123:6: (lv_code_3_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:2123:6: (lv_code_3_0= RULE_TEXT )
                    // InternalEldmDslParser.g:2124:7: lv_code_3_0= RULE_TEXT
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
                    // InternalEldmDslParser.g:2142:4: ( (lv_type_4_0= ruleTopDef ) )
                    {
                    // InternalEldmDslParser.g:2142:4: ( (lv_type_4_0= ruleTopDef ) )
                    // InternalEldmDslParser.g:2143:5: (lv_type_4_0= ruleTopDef )
                    {
                    // InternalEldmDslParser.g:2143:5: (lv_type_4_0= ruleTopDef )
                    // InternalEldmDslParser.g:2144:6: lv_type_4_0= ruleTopDef
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
    // InternalEldmDslParser.g:2166:1: entryRuleTopDef returns [EObject current=null] : iv_ruleTopDef= ruleTopDef EOF ;
    public final EObject entryRuleTopDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopDef = null;


        try {
            // InternalEldmDslParser.g:2166:47: (iv_ruleTopDef= ruleTopDef EOF )
            // InternalEldmDslParser.g:2167:2: iv_ruleTopDef= ruleTopDef EOF
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
    // InternalEldmDslParser.g:2173:1: ruleTopDef returns [EObject current=null] : (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef ) ;
    public final EObject ruleTopDef() throws RecognitionException {
        EObject current = null;

        EObject this_ElementDef_0 = null;

        EObject this_EnumDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2179:2: ( (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef ) )
            // InternalEldmDslParser.g:2180:2: (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef )
            {
            // InternalEldmDslParser.g:2180:2: (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Bool||LA42_0==Path||LA42_0==Any||LA42_0==Flt||(LA42_0>=Int && LA42_0<=Ldt)||(LA42_0>=Lst && LA42_0<=Map)||LA42_0==Str||LA42_0==FullStopFullStop||LA42_0==LeftCurlyBracket||LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==Enum) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==EOF||LA42_2==Typedef||LA42_2==Let||LA42_2==Var||LA42_2==RULE_END||LA42_2==RULE_ID) ) {
                    alt42=1;
                }
                else if ( (LA42_2==Colon||LA42_2==LeftCurlyBracket) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalEldmDslParser.g:2181:3: this_ElementDef_0= ruleElementDef
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
                    // InternalEldmDslParser.g:2190:3: this_EnumDef_1= ruleEnumDef
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
    // InternalEldmDslParser.g:2202:1: entryRuleElementDef returns [EObject current=null] : iv_ruleElementDef= ruleElementDef EOF ;
    public final EObject entryRuleElementDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDef = null;


        try {
            // InternalEldmDslParser.g:2202:51: (iv_ruleElementDef= ruleElementDef EOF )
            // InternalEldmDslParser.g:2203:2: iv_ruleElementDef= ruleElementDef EOF
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
    // InternalEldmDslParser.g:2209:1: ruleElementDef returns [EObject current=null] : ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef ) ;
    public final EObject ruleElementDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_native_0_0 = null;

        EObject this_ListDef_2 = null;

        EObject this_MapDef_3 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2215:2: ( ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef ) )
            // InternalEldmDslParser.g:2216:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef )
            {
            // InternalEldmDslParser.g:2216:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef )
            int alt43=4;
            switch ( input.LA(1) ) {
            case Bool:
            case Enum:
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
                alt43=1;
                }
                break;
            case RULE_ID:
                {
                alt43=2;
                }
                break;
            case FullStopFullStop:
                {
                alt43=3;
                }
                break;
            case LeftCurlyBracket:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalEldmDslParser.g:2217:3: ( (lv_native_0_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:2217:3: ( (lv_native_0_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:2218:4: (lv_native_0_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:2218:4: (lv_native_0_0= ruleNativeDef )
                    // InternalEldmDslParser.g:2219:5: lv_native_0_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getElementDefAccess().getNativeNativeDefParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_native_0_0=ruleNativeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getElementDefRule());
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
                    // InternalEldmDslParser.g:2237:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:2237:3: ( (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:2238:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2238:4: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:2239:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementDefRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getElementDefAccess().getRefDefinitionCrossReference_1_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:2251:3: this_ListDef_2= ruleListDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementDefAccess().getListDefParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListDef_2=ruleListDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListDef_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:2260:3: this_MapDef_3= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementDefAccess().getMapDefParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapDef_3=ruleMapDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapDef_3;
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


    // $ANTLR start "entryRuleMapDef"
    // InternalEldmDslParser.g:2272:1: entryRuleMapDef returns [EObject current=null] : iv_ruleMapDef= ruleMapDef EOF ;
    public final EObject entryRuleMapDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapDef = null;


        try {
            // InternalEldmDslParser.g:2272:47: (iv_ruleMapDef= ruleMapDef EOF )
            // InternalEldmDslParser.g:2273:2: iv_ruleMapDef= ruleMapDef EOF
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
    // InternalEldmDslParser.g:2279:1: ruleMapDef returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= Asterisk ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) ) ;
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
            // InternalEldmDslParser.g:2285:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= Asterisk ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:2286:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= Asterisk ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:2286:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= Asterisk ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==LeftCurlyBracket) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID) && (synpred9_InternalEldmDslParser())) {
                    alt51=1;
                }
                else if ( (LA51_1==Comma) && (synpred9_InternalEldmDslParser())) {
                    alt51=1;
                }
                else if ( (LA51_1==RightCurlyBracket) && (synpred9_InternalEldmDslParser())) {
                    alt51=1;
                }
                else if ( (LA51_1==RULE_BEGIN) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalEldmDslParser.g:2287:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:2287:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:2288:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2318:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket )
                    // InternalEldmDslParser.g:2319:5: () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2319:5: ()
                    // InternalEldmDslParser.g:2320:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapDefAccess().getMapDefAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2330:5: ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalEldmDslParser.g:2331:6: ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2331:6: ( (lv_defs_2_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2332:7: (lv_defs_2_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2332:7: (lv_defs_2_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2333:8: lv_defs_2_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_44);
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

                            // InternalEldmDslParser.g:2350:6: (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==Comma) ) {
                                    int LA44_1 = input.LA(2);

                                    if ( (LA44_1==RULE_ID) ) {
                                        alt44=1;
                                    }


                                }


                                switch (alt44) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2351:7: otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:2355:7: ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2356:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2356:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2357:9: lv_defs_4_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_44);
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
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2376:5: (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==Comma) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalEldmDslParser.g:2377:6: otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) )
                            {
                            otherlv_5=(Token)match(input,Comma,FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_3_0());
                              					
                            }
                            // InternalEldmDslParser.g:2381:6: ( (lv_ext_6_0= Asterisk ) )
                            // InternalEldmDslParser.g:2382:7: (lv_ext_6_0= Asterisk )
                            {
                            // InternalEldmDslParser.g:2382:7: (lv_ext_6_0= Asterisk )
                            // InternalEldmDslParser.g:2383:8: lv_ext_6_0= Asterisk
                            {
                            lv_ext_6_0=(Token)match(input,Asterisk,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_ext_6_0, grammarAccess.getMapDefAccess().getExtAsteriskKeyword_0_0_3_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getMapDefRule());
                              								}
                              								setWithLastConsumed(current, "ext", true, "*");
                              							
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
                    // InternalEldmDslParser.g:2403:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= Asterisk ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2403:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= Asterisk ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket )
                    // InternalEldmDslParser.g:2404:4: () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= Asterisk ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2404:4: ()
                    // InternalEldmDslParser.g:2405:5: 
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
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_10, grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:2419:4: ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalEldmDslParser.g:2420:5: ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2420:5: ( (lv_defs_11_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2421:6: (lv_defs_11_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2421:6: (lv_defs_11_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2422:7: lv_defs_11_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_48);
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

                            // InternalEldmDslParser.g:2439:5: ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==EOF||(LA48_0>=Definitions && LA48_0<=PlugDsl)||LA48_0==Import||LA48_0==Catch||LA48_0==Def||(LA48_0>=LineFeed && LA48_0<=CarriageReturn)||LA48_0==Comma||LA48_0==RULE_ID) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2440:6: (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) )
                            	    {
                            	    // InternalEldmDslParser.g:2440:6: (otherlv_12= Comma )?
                            	    int alt47=2;
                            	    int LA47_0 = input.LA(1);

                            	    if ( (LA47_0==Comma) ) {
                            	        alt47=1;
                            	    }
                            	    switch (alt47) {
                            	        case 1 :
                            	            // InternalEldmDslParser.g:2441:7: otherlv_12= Comma
                            	            {
                            	            otherlv_12=(Token)match(input,Comma,FOLLOW_49); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(otherlv_12, grammarAccess.getMapDefAccess().getCommaKeyword_1_3_1_0());
                            	              						
                            	            }

                            	            }
                            	            break;

                            	    }

                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapDefAccess().getBREAKParserRuleCall_1_3_1_1());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_17);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:2453:6: ( (lv_defs_14_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2454:7: (lv_defs_14_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2454:7: (lv_defs_14_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2455:8: lv_defs_14_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_2_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_48);
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
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2474:4: ( (lv_ext_15_0= Asterisk ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==Asterisk) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalEldmDslParser.g:2475:5: (lv_ext_15_0= Asterisk )
                            {
                            // InternalEldmDslParser.g:2475:5: (lv_ext_15_0= Asterisk )
                            // InternalEldmDslParser.g:2476:6: lv_ext_15_0= Asterisk
                            {
                            lv_ext_15_0=(Token)match(input,Asterisk,FOLLOW_50); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_ext_15_0, grammarAccess.getMapDefAccess().getExtAsteriskKeyword_1_4_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMapDefRule());
                              						}
                              						setWithLastConsumed(current, "ext", true, "*");
                              					
                            }

                            }


                            }
                            break;

                    }

                    this_END_16=(Token)match(input,RULE_END,FOLLOW_46); if (state.failed) return current;
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
    // InternalEldmDslParser.g:2501:1: entryRuleMapEntryDef returns [EObject current=null] : iv_ruleMapEntryDef= ruleMapEntryDef EOF ;
    public final EObject entryRuleMapEntryDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryDef = null;


        try {
            // InternalEldmDslParser.g:2501:52: (iv_ruleMapEntryDef= ruleMapEntryDef EOF )
            // InternalEldmDslParser.g:2502:2: iv_ruleMapEntryDef= ruleMapEntryDef EOF
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
    // InternalEldmDslParser.g:2508:1: ruleMapEntryDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) ;
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
            // InternalEldmDslParser.g:2514:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) )
            // InternalEldmDslParser.g:2515:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            {
            // InternalEldmDslParser.g:2515:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            // InternalEldmDslParser.g:2516:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            {
            // InternalEldmDslParser.g:2516:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2517:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2517:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2518:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2534:3: ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Colon||LA53_0==QuestionMark) ) {
                alt53=1;
            }
            else if ( (LA53_0==EqualsSign) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // InternalEldmDslParser.g:2535:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    {
                    // InternalEldmDslParser.g:2535:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    // InternalEldmDslParser.g:2536:5: ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:2536:5: ( (lv_opt_1_0= QuestionMark ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==QuestionMark) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalEldmDslParser.g:2537:6: (lv_opt_1_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:2537:6: (lv_opt_1_0= QuestionMark )
                            // InternalEldmDslParser.g:2538:7: lv_opt_1_0= QuestionMark
                            {
                            lv_opt_1_0=(Token)match(input,QuestionMark,FOLLOW_19); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,Colon,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMapEntryDefAccess().getColonKeyword_1_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2554:5: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:2555:6: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:2555:6: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:2556:7: lv_type_3_0= ruleElementDef
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
                    // InternalEldmDslParser.g:2575:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    {
                    // InternalEldmDslParser.g:2575:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    // InternalEldmDslParser.g:2576:5: ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:2576:5: ( (lv_opt_4_0= EqualsSign ) )
                    // InternalEldmDslParser.g:2577:6: (lv_opt_4_0= EqualsSign )
                    {
                    // InternalEldmDslParser.g:2577:6: (lv_opt_4_0= EqualsSign )
                    // InternalEldmDslParser.g:2578:7: lv_opt_4_0= EqualsSign
                    {
                    lv_opt_4_0=(Token)match(input,EqualsSign,FOLLOW_52); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2590:5: ( (lv_value_5_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:2591:6: (lv_value_5_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:2591:6: (lv_value_5_0= ruleLiteral )
                    // InternalEldmDslParser.g:2592:7: lv_value_5_0= ruleLiteral
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


    // $ANTLR start "entryRuleListDef"
    // InternalEldmDslParser.g:2615:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalEldmDslParser.g:2615:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalEldmDslParser.g:2616:2: iv_ruleListDef= ruleListDef EOF
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
    // InternalEldmDslParser.g:2622:1: ruleListDef returns [EObject current=null] : ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2628:2: ( ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) )
            // InternalEldmDslParser.g:2629:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            {
            // InternalEldmDslParser.g:2629:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            // InternalEldmDslParser.g:2630:3: () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) )
            {
            // InternalEldmDslParser.g:2630:3: ()
            // InternalEldmDslParser.g:2631:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListDefAccess().getListDefAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListDefAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalEldmDslParser.g:2641:3: ( (lv_type_2_0= ruleElementDef ) )
            // InternalEldmDslParser.g:2642:4: (lv_type_2_0= ruleElementDef )
            {
            // InternalEldmDslParser.g:2642:4: (lv_type_2_0= ruleElementDef )
            // InternalEldmDslParser.g:2643:5: lv_type_2_0= ruleElementDef
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


    // $ANTLR start "entryRuleEnumDef"
    // InternalEldmDslParser.g:2664:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // InternalEldmDslParser.g:2664:48: (iv_ruleEnumDef= ruleEnumDef EOF )
            // InternalEldmDslParser.g:2665:2: iv_ruleEnumDef= ruleEnumDef EOF
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
    // InternalEldmDslParser.g:2671:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) ;
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
            // InternalEldmDslParser.g:2677:2: ( (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) )
            // InternalEldmDslParser.g:2678:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            {
            // InternalEldmDslParser.g:2678:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            // InternalEldmDslParser.g:2679:3: otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Enum,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2683:3: ( (lv_type_1_0= ruleMapDef ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LeftCurlyBracket) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEldmDslParser.g:2684:4: (lv_type_1_0= ruleMapDef )
                    {
                    // InternalEldmDslParser.g:2684:4: (lv_type_1_0= ruleMapDef )
                    // InternalEldmDslParser.g:2685:5: lv_type_1_0= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefAccess().getTypeMapDefParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
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
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getEnumDefAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalEldmDslParser.g:2710:3: ( (lv_defs_4_0= ruleEnumItemDef ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalEldmDslParser.g:2711:4: (lv_defs_4_0= ruleEnumItemDef )
            	    {
            	    // InternalEldmDslParser.g:2711:4: (lv_defs_4_0= ruleEnumItemDef )
            	    // InternalEldmDslParser.g:2712:5: lv_defs_4_0= ruleEnumItemDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_53);
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
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
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
    // InternalEldmDslParser.g:2737:1: entryRuleEnumItemDef returns [EObject current=null] : iv_ruleEnumItemDef= ruleEnumItemDef EOF ;
    public final EObject entryRuleEnumItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItemDef = null;


        try {
            // InternalEldmDslParser.g:2737:52: (iv_ruleEnumItemDef= ruleEnumItemDef EOF )
            // InternalEldmDslParser.g:2738:2: iv_ruleEnumItemDef= ruleEnumItemDef EOF
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
    // InternalEldmDslParser.g:2744:1: ruleEnumItemDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) ;
    public final EObject ruleEnumItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2750:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) )
            // InternalEldmDslParser.g:2751:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            {
            // InternalEldmDslParser.g:2751:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            // InternalEldmDslParser.g:2752:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )?
            {
            // InternalEldmDslParser.g:2752:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2753:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2753:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2754:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2770:3: ( (lv_value_1_0= ruleMapLiteral ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LeftCurlyBracket) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalEldmDslParser.g:2771:4: (lv_value_1_0= ruleMapLiteral )
                    {
                    // InternalEldmDslParser.g:2771:4: (lv_value_1_0= ruleMapLiteral )
                    // InternalEldmDslParser.g:2772:5: lv_value_1_0= ruleMapLiteral
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


    // $ANTLR start "entryRuleNativeDef"
    // InternalEldmDslParser.g:2793:1: entryRuleNativeDef returns [String current=null] : iv_ruleNativeDef= ruleNativeDef EOF ;
    public final String entryRuleNativeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNativeDef = null;


        try {
            // InternalEldmDslParser.g:2793:49: (iv_ruleNativeDef= ruleNativeDef EOF )
            // InternalEldmDslParser.g:2794:2: iv_ruleNativeDef= ruleNativeDef EOF
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
    // InternalEldmDslParser.g:2800:1: ruleNativeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) ;
    public final AntlrDatatypeRuleToken ruleNativeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2806:2: ( (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) )
            // InternalEldmDslParser.g:2807:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            {
            // InternalEldmDslParser.g:2807:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            int alt57=12;
            switch ( input.LA(1) ) {
            case Any:
                {
                alt57=1;
                }
                break;
            case Path:
                {
                alt57=2;
                }
                break;
            case Bool:
                {
                alt57=3;
                }
                break;
            case Str:
                {
                alt57=4;
                }
                break;
            case Int:
                {
                alt57=5;
                }
                break;
            case Flt:
                {
                alt57=6;
                }
                break;
            case Lda:
                {
                alt57=7;
                }
                break;
            case Ltm:
                {
                alt57=8;
                }
                break;
            case Ldt:
                {
                alt57=9;
                }
                break;
            case Map:
                {
                alt57=10;
                }
                break;
            case Lst:
                {
                alt57=11;
                }
                break;
            case Enum:
                {
                alt57=12;
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
                    // InternalEldmDslParser.g:2808:3: kw= Any
                    {
                    kw=(Token)match(input,Any,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getAnyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2814:3: kw= Path
                    {
                    kw=(Token)match(input,Path,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getPathKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:2820:3: kw= Bool
                    {
                    kw=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getBoolKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:2826:3: kw= Str
                    {
                    kw=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getStrKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:2832:3: kw= Int
                    {
                    kw=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getIntKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:2838:3: kw= Flt
                    {
                    kw=(Token)match(input,Flt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getFltKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:2844:3: kw= Lda
                    {
                    kw=(Token)match(input,Lda,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdaKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:2850:3: kw= Ltm
                    {
                    kw=(Token)match(input,Ltm,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLtmKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:2856:3: kw= Ldt
                    {
                    kw=(Token)match(input,Ldt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdtKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEldmDslParser.g:2862:3: kw= Map
                    {
                    kw=(Token)match(input,Map,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getMapKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEldmDslParser.g:2868:3: kw= Lst
                    {
                    kw=(Token)match(input,Lst,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLstKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEldmDslParser.g:2874:3: kw= Enum
                    {
                    kw=(Token)match(input,Enum,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getEnumKeyword_11());
                      		
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
    // InternalEldmDslParser.g:2883:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEldmDslParser.g:2883:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEldmDslParser.g:2884:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEldmDslParser.g:2890:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral ) ;
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

        EObject this_EnumLiteral_10 = null;

        EObject this_PatternLiteral_11 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2896:2: ( (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral ) )
            // InternalEldmDslParser.g:2897:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )
            {
            // InternalEldmDslParser.g:2897:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )
            int alt58=12;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalEldmDslParser.g:2898:3: this_BoolLiteral_0= ruleBoolLiteral
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
                    // InternalEldmDslParser.g:2907:3: this_StrLiteral_1= ruleStrLiteral
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
                    // InternalEldmDslParser.g:2916:3: this_IntLiteral_2= ruleIntLiteral
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
                    // InternalEldmDslParser.g:2925:3: this_FltLiteral_3= ruleFltLiteral
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
                    // InternalEldmDslParser.g:2934:3: this_DateLiteral_4= ruleDateLiteral
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
                    // InternalEldmDslParser.g:2943:3: this_TimeLiteral_5= ruleTimeLiteral
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
                    // InternalEldmDslParser.g:2952:3: this_DateTimeLiteral_6= ruleDateTimeLiteral
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
                    // InternalEldmDslParser.g:2961:3: this_PathLiteral_7= rulePathLiteral
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
                    // InternalEldmDslParser.g:2970:3: this_ListLiteral_8= ruleListLiteral
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
                    // InternalEldmDslParser.g:2979:3: this_MapLiteral_9= ruleMapLiteral
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
                    // InternalEldmDslParser.g:2988:3: this_EnumLiteral_10= ruleEnumLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getEnumLiteralParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumLiteral_10=ruleEnumLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumLiteral_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEldmDslParser.g:2997:3: this_PatternLiteral_11= rulePatternLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getPatternLiteralParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PatternLiteral_11=rulePatternLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PatternLiteral_11;
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
    // InternalEldmDslParser.g:3009:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalEldmDslParser.g:3009:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalEldmDslParser.g:3010:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
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
    // InternalEldmDslParser.g:3016:1: ruleBoolLiteral returns [EObject current=null] : ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3022:2: ( ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) )
            // InternalEldmDslParser.g:3023:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            {
            // InternalEldmDslParser.g:3023:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            // InternalEldmDslParser.g:3024:3: () (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            {
            // InternalEldmDslParser.g:3024:3: ()
            // InternalEldmDslParser.g:3025:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3031:3: (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==False) ) {
                alt59=1;
            }
            else if ( (LA59_0==True) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalEldmDslParser.g:3032:4: otherlv_1= False
                    {
                    otherlv_1=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3037:4: ( (lv_value_2_0= True ) )
                    {
                    // InternalEldmDslParser.g:3037:4: ( (lv_value_2_0= True ) )
                    // InternalEldmDslParser.g:3038:5: (lv_value_2_0= True )
                    {
                    // InternalEldmDslParser.g:3038:5: (lv_value_2_0= True )
                    // InternalEldmDslParser.g:3039:6: lv_value_2_0= True
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
    // InternalEldmDslParser.g:3056:1: entryRuleStrLiteral returns [EObject current=null] : iv_ruleStrLiteral= ruleStrLiteral EOF ;
    public final EObject entryRuleStrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrLiteral = null;


        try {
            // InternalEldmDslParser.g:3056:51: (iv_ruleStrLiteral= ruleStrLiteral EOF )
            // InternalEldmDslParser.g:3057:2: iv_ruleStrLiteral= ruleStrLiteral EOF
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
    // InternalEldmDslParser.g:3063:1: ruleStrLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT ) ) ;
    public final EObject ruleStrLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3069:2: ( ( (lv_value_0_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3070:2: ( (lv_value_0_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3070:2: ( (lv_value_0_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3071:3: (lv_value_0_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3071:3: (lv_value_0_0= RULE_TEXT )
            // InternalEldmDslParser.g:3072:4: lv_value_0_0= RULE_TEXT
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
    // InternalEldmDslParser.g:3091:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalEldmDslParser.g:3091:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalEldmDslParser.g:3092:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalEldmDslParser.g:3098:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3104:2: ( ( (lv_value_0_0= RULE_NATURAL ) ) )
            // InternalEldmDslParser.g:3105:2: ( (lv_value_0_0= RULE_NATURAL ) )
            {
            // InternalEldmDslParser.g:3105:2: ( (lv_value_0_0= RULE_NATURAL ) )
            // InternalEldmDslParser.g:3106:3: (lv_value_0_0= RULE_NATURAL )
            {
            // InternalEldmDslParser.g:3106:3: (lv_value_0_0= RULE_NATURAL )
            // InternalEldmDslParser.g:3107:4: lv_value_0_0= RULE_NATURAL
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
    // InternalEldmDslParser.g:3126:1: entryRuleFltLiteral returns [EObject current=null] : iv_ruleFltLiteral= ruleFltLiteral EOF ;
    public final EObject entryRuleFltLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFltLiteral = null;


        try {
            // InternalEldmDslParser.g:3126:51: (iv_ruleFltLiteral= ruleFltLiteral EOF )
            // InternalEldmDslParser.g:3127:2: iv_ruleFltLiteral= ruleFltLiteral EOF
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
    // InternalEldmDslParser.g:3133:1: ruleFltLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFltLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3139:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalEldmDslParser.g:3140:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalEldmDslParser.g:3140:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalEldmDslParser.g:3141:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalEldmDslParser.g:3141:3: (lv_value_0_0= RULE_FLOAT )
            // InternalEldmDslParser.g:3142:4: lv_value_0_0= RULE_FLOAT
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
    // InternalEldmDslParser.g:3161:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // InternalEldmDslParser.g:3161:52: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // InternalEldmDslParser.g:3162:2: iv_ruleDateLiteral= ruleDateLiteral EOF
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
    // InternalEldmDslParser.g:3168:1: ruleDateLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE ) ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3174:2: ( ( (lv_value_0_0= RULE_DATE ) ) )
            // InternalEldmDslParser.g:3175:2: ( (lv_value_0_0= RULE_DATE ) )
            {
            // InternalEldmDslParser.g:3175:2: ( (lv_value_0_0= RULE_DATE ) )
            // InternalEldmDslParser.g:3176:3: (lv_value_0_0= RULE_DATE )
            {
            // InternalEldmDslParser.g:3176:3: (lv_value_0_0= RULE_DATE )
            // InternalEldmDslParser.g:3177:4: lv_value_0_0= RULE_DATE
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
    // InternalEldmDslParser.g:3196:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3196:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEldmDslParser.g:3197:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
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
    // InternalEldmDslParser.g:3203:1: ruleTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TIME ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3209:2: ( ( (lv_value_0_0= RULE_TIME ) ) )
            // InternalEldmDslParser.g:3210:2: ( (lv_value_0_0= RULE_TIME ) )
            {
            // InternalEldmDslParser.g:3210:2: ( (lv_value_0_0= RULE_TIME ) )
            // InternalEldmDslParser.g:3211:3: (lv_value_0_0= RULE_TIME )
            {
            // InternalEldmDslParser.g:3211:3: (lv_value_0_0= RULE_TIME )
            // InternalEldmDslParser.g:3212:4: lv_value_0_0= RULE_TIME
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
    // InternalEldmDslParser.g:3231:1: entryRuleDateTimeLiteral returns [EObject current=null] : iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF ;
    public final EObject entryRuleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3231:56: (iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF )
            // InternalEldmDslParser.g:3232:2: iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF
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
    // InternalEldmDslParser.g:3238:1: ruleDateTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATETIME ) ) ;
    public final EObject ruleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3244:2: ( ( (lv_value_0_0= RULE_DATETIME ) ) )
            // InternalEldmDslParser.g:3245:2: ( (lv_value_0_0= RULE_DATETIME ) )
            {
            // InternalEldmDslParser.g:3245:2: ( (lv_value_0_0= RULE_DATETIME ) )
            // InternalEldmDslParser.g:3246:3: (lv_value_0_0= RULE_DATETIME )
            {
            // InternalEldmDslParser.g:3246:3: (lv_value_0_0= RULE_DATETIME )
            // InternalEldmDslParser.g:3247:4: lv_value_0_0= RULE_DATETIME
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
    // InternalEldmDslParser.g:3266:1: entryRulePathLiteral returns [EObject current=null] : iv_rulePathLiteral= rulePathLiteral EOF ;
    public final EObject entryRulePathLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathLiteral = null;


        try {
            // InternalEldmDslParser.g:3266:52: (iv_rulePathLiteral= rulePathLiteral EOF )
            // InternalEldmDslParser.g:3267:2: iv_rulePathLiteral= rulePathLiteral EOF
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
    // InternalEldmDslParser.g:3273:1: rulePathLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_PATH ) ) ;
    public final EObject rulePathLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3279:2: ( ( (lv_value_0_0= RULE_PATH ) ) )
            // InternalEldmDslParser.g:3280:2: ( (lv_value_0_0= RULE_PATH ) )
            {
            // InternalEldmDslParser.g:3280:2: ( (lv_value_0_0= RULE_PATH ) )
            // InternalEldmDslParser.g:3281:3: (lv_value_0_0= RULE_PATH )
            {
            // InternalEldmDslParser.g:3281:3: (lv_value_0_0= RULE_PATH )
            // InternalEldmDslParser.g:3282:4: lv_value_0_0= RULE_PATH
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
    // InternalEldmDslParser.g:3301:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalEldmDslParser.g:3301:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalEldmDslParser.g:3302:2: iv_ruleListLiteral= ruleListLiteral EOF
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
    // InternalEldmDslParser.g:3308:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vals_2_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3314:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEldmDslParser.g:3315:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEldmDslParser.g:3315:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEldmDslParser.g:3316:3: () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEldmDslParser.g:3316:3: ()
            // InternalEldmDslParser.g:3317:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3327:3: ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==False||(LA61_0>=Bool && LA61_0<=Enum)||(LA61_0>=Path && LA61_0<=True)||LA61_0==Any||LA61_0==Flt||(LA61_0>=Int && LA61_0<=Ldt)||(LA61_0>=Lst && LA61_0<=Map)||LA61_0==Str||(LA61_0>=CommercialAt && LA61_0<=LeftSquareBracket)||LA61_0==LeftCurlyBracket||(LA61_0>=RULE_PATH && LA61_0<=RULE_ID)||(LA61_0>=RULE_NATURAL && LA61_0<=RULE_TEXT)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEldmDslParser.g:3328:4: ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    {
                    // InternalEldmDslParser.g:3328:4: ( (lv_vals_2_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:3329:5: (lv_vals_2_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:3329:5: (lv_vals_2_0= ruleLiteral )
                    // InternalEldmDslParser.g:3330:6: lv_vals_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_56);
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

                    // InternalEldmDslParser.g:3347:4: (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==Comma) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:3348:5: otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_52); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEldmDslParser.g:3352:5: ( (lv_vals_4_0= ruleLiteral ) )
                    	    // InternalEldmDslParser.g:3353:6: (lv_vals_4_0= ruleLiteral )
                    	    {
                    	    // InternalEldmDslParser.g:3353:6: (lv_vals_4_0= ruleLiteral )
                    	    // InternalEldmDslParser.g:3354:7: lv_vals_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_56);
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
                    	    break loop60;
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
    // InternalEldmDslParser.g:3381:1: entryRuleMapLiteral returns [EObject current=null] : iv_ruleMapLiteral= ruleMapLiteral EOF ;
    public final EObject entryRuleMapLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteral = null;


        try {
            // InternalEldmDslParser.g:3381:51: (iv_ruleMapLiteral= ruleMapLiteral EOF )
            // InternalEldmDslParser.g:3382:2: iv_ruleMapLiteral= ruleMapLiteral EOF
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
    // InternalEldmDslParser.g:3388:1: ruleMapLiteral returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) ;
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
            // InternalEldmDslParser.g:3394:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:3395:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:3395:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LeftCurlyBracket) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_ID) && (synpred10_InternalEldmDslParser())) {
                    alt66=1;
                }
                else if ( (LA66_1==RightCurlyBracket) && (synpred10_InternalEldmDslParser())) {
                    alt66=1;
                }
                else if ( (LA66_1==RULE_BEGIN) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalEldmDslParser.g:3396:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:3396:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:3397:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3419:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    // InternalEldmDslParser.g:3420:5: () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3420:5: ()
                    // InternalEldmDslParser.g:3421:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapLiteralAccess().getMapLiteralAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:3431:5: ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalEldmDslParser.g:3432:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3432:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3433:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3433:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3434:8: lv_entries_2_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_44);
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

                            // InternalEldmDslParser.g:3451:6: (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==Comma) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3452:7: otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:3456:7: ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3457:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3457:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3458:9: lv_entries_4_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_44);
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
                            	    break loop62;
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
                    // InternalEldmDslParser.g:3484:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3484:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    // InternalEldmDslParser.g:3485:4: () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3485:4: ()
                    // InternalEldmDslParser.g:3486:5: 
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
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getMapLiteralAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:3500:4: ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_ID) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalEldmDslParser.g:3501:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3501:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3502:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3502:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3503:7: lv_entries_9_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_58);
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

                            // InternalEldmDslParser.g:3520:5: ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==EOF||(LA64_0>=Definitions && LA64_0<=PlugDsl)||LA64_0==Import||LA64_0==Catch||LA64_0==Def||(LA64_0>=LineFeed && LA64_0<=CarriageReturn)||LA64_0==RULE_ID) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3521:6: ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapLiteralAccess().getBREAKParserRuleCall_1_3_1_0());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_17);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:3528:6: ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3529:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3529:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3530:8: lv_entries_11_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_58);
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
                            	    break loop64;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_46); if (state.failed) return current;
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
    // InternalEldmDslParser.g:3562:1: entryRuleMapEntryLiteral returns [EObject current=null] : iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF ;
    public final EObject entryRuleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryLiteral = null;


        try {
            // InternalEldmDslParser.g:3562:56: (iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF )
            // InternalEldmDslParser.g:3563:2: iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF
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
    // InternalEldmDslParser.g:3569:1: ruleMapEntryLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3575:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalEldmDslParser.g:3576:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalEldmDslParser.g:3576:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalEldmDslParser.g:3577:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalEldmDslParser.g:3577:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:3578:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:3578:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:3579:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3599:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalEldmDslParser.g:3600:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalEldmDslParser.g:3600:4: (lv_value_2_0= ruleLiteral )
            // InternalEldmDslParser.g:3601:5: lv_value_2_0= ruleLiteral
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


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalEldmDslParser.g:3622:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalEldmDslParser.g:3622:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalEldmDslParser.g:3623:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumLiteral; 
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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalEldmDslParser.g:3629:1: ruleEnumLiteral returns [EObject current=null] : ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3635:2: ( ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:3636:2: ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:3636:2: ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) )
            // InternalEldmDslParser.g:3637:3: () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) )
            {
            // InternalEldmDslParser.g:3637:3: ()
            // InternalEldmDslParser.g:3638:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,CommercialAt,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getCommercialAtKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3648:3: ( (otherlv_2= RULE_ID ) )
            // InternalEldmDslParser.g:3649:4: (otherlv_2= RULE_ID )
            {
            // InternalEldmDslParser.g:3649:4: (otherlv_2= RULE_ID )
            // InternalEldmDslParser.g:3650:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumLiteralRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getEnumLiteralAccess().getRefEnumItemDefCrossReference_2_0());
              				
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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRulePatternLiteral"
    // InternalEldmDslParser.g:3665:1: entryRulePatternLiteral returns [EObject current=null] : iv_rulePatternLiteral= rulePatternLiteral EOF ;
    public final EObject entryRulePatternLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternLiteral = null;


        try {
            // InternalEldmDslParser.g:3665:55: (iv_rulePatternLiteral= rulePatternLiteral EOF )
            // InternalEldmDslParser.g:3666:2: iv_rulePatternLiteral= rulePatternLiteral EOF
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
    // InternalEldmDslParser.g:3672:1: rulePatternLiteral returns [EObject current=null] : ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) ;
    public final EObject rulePatternLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        AntlrDatatypeRuleToken lv_native_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3678:2: ( ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) )
            // InternalEldmDslParser.g:3679:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            {
            // InternalEldmDslParser.g:3679:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3680:3: () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3680:3: ()
            // InternalEldmDslParser.g:3681:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3687:3: ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=Bool && LA67_0<=Enum)||LA67_0==Path||LA67_0==Any||LA67_0==Flt||(LA67_0>=Int && LA67_0<=Ldt)||(LA67_0>=Lst && LA67_0<=Map)||LA67_0==Str) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_ID) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalEldmDslParser.g:3688:4: ( (lv_native_1_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:3688:4: ( (lv_native_1_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:3689:5: (lv_native_1_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:3689:5: (lv_native_1_0= ruleNativeDef )
                    // InternalEldmDslParser.g:3690:6: lv_native_1_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternLiteralAccess().getNativeNativeDefParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_59);
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
                    // InternalEldmDslParser.g:3708:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:3708:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEldmDslParser.g:3709:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEldmDslParser.g:3709:5: (otherlv_2= RULE_ID )
                    // InternalEldmDslParser.g:3710:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternLiteralRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPatternLiteralAccess().getRefDefinitionCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,CommercialAt,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2());
              		
            }
            // InternalEldmDslParser.g:3726:3: ( (lv_text_4_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3727:4: (lv_text_4_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3727:4: (lv_text_4_0= RULE_TEXT )
            // InternalEldmDslParser.g:3728:5: lv_text_4_0= RULE_TEXT
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
    // InternalEldmDslParser.g:3748:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalEldmDslParser.g:3748:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalEldmDslParser.g:3749:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalEldmDslParser.g:3755:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LineFeed | kw= CarriageReturn )* ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3761:2: ( (kw= LineFeed | kw= CarriageReturn )* )
            // InternalEldmDslParser.g:3762:2: (kw= LineFeed | kw= CarriageReturn )*
            {
            // InternalEldmDslParser.g:3762:2: (kw= LineFeed | kw= CarriageReturn )*
            loop68:
            do {
                int alt68=3;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==LineFeed) ) {
                    alt68=1;
                }
                else if ( (LA68_0==CarriageReturn) ) {
                    alt68=2;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalEldmDslParser.g:3763:3: kw= LineFeed
            	    {
            	    kw=(Token)match(input,LineFeed,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getLineFeedKeyword_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEldmDslParser.g:3769:3: kw= CarriageReturn
            	    {
            	    kw=(Token)match(input,CarriageReturn,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
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
        // InternalEldmDslParser.g:409:4: ( ( RULE_ID ) )
        // InternalEldmDslParser.g:409:5: ( RULE_ID )
        {
        // InternalEldmDslParser.g:409:5: ( RULE_ID )
        // InternalEldmDslParser.g:410:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEldmDslParser

    // $ANTLR start synpred2_InternalEldmDslParser
    public final void synpred2_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1065:5: ( ( () ( ( Or ) ) ) )
        // InternalEldmDslParser.g:1065:6: ( () ( ( Or ) ) )
        {
        // InternalEldmDslParser.g:1065:6: ( () ( ( Or ) ) )
        // InternalEldmDslParser.g:1066:6: () ( ( Or ) )
        {
        // InternalEldmDslParser.g:1066:6: ()
        // InternalEldmDslParser.g:1067:6: 
        {
        }

        // InternalEldmDslParser.g:1068:6: ( ( Or ) )
        // InternalEldmDslParser.g:1069:7: ( Or )
        {
        // InternalEldmDslParser.g:1069:7: ( Or )
        // InternalEldmDslParser.g:1070:8: Or
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
        // InternalEldmDslParser.g:1148:5: ( ( () ( ( And ) ) ) )
        // InternalEldmDslParser.g:1148:6: ( () ( ( And ) ) )
        {
        // InternalEldmDslParser.g:1148:6: ( () ( ( And ) ) )
        // InternalEldmDslParser.g:1149:6: () ( ( And ) )
        {
        // InternalEldmDslParser.g:1149:6: ()
        // InternalEldmDslParser.g:1150:6: 
        {
        }

        // InternalEldmDslParser.g:1151:6: ( ( And ) )
        // InternalEldmDslParser.g:1152:7: ( And )
        {
        // InternalEldmDslParser.g:1152:7: ( And )
        // InternalEldmDslParser.g:1153:8: And
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
        // InternalEldmDslParser.g:1231:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )
        // InternalEldmDslParser.g:1231:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        {
        // InternalEldmDslParser.g:1231:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        // InternalEldmDslParser.g:1232:6: () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        {
        // InternalEldmDslParser.g:1232:6: ()
        // InternalEldmDslParser.g:1233:6: 
        {
        }

        // InternalEldmDslParser.g:1234:6: ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        // InternalEldmDslParser.g:1235:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        {
        // InternalEldmDslParser.g:1235:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        // InternalEldmDslParser.g:1236:8: ( EqualsSignEqualsSign | ExclamationMarkEqualsSign )
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
        // InternalEldmDslParser.g:1332:6: ( ( () ( ( Is ) ) ) )
        // InternalEldmDslParser.g:1332:7: ( () ( ( Is ) ) )
        {
        // InternalEldmDslParser.g:1332:7: ( () ( ( Is ) ) )
        // InternalEldmDslParser.g:1333:7: () ( ( Is ) )
        {
        // InternalEldmDslParser.g:1333:7: ()
        // InternalEldmDslParser.g:1334:7: 
        {
        }

        // InternalEldmDslParser.g:1335:7: ( ( Is ) )
        // InternalEldmDslParser.g:1336:8: ( Is )
        {
        // InternalEldmDslParser.g:1336:8: ( Is )
        // InternalEldmDslParser.g:1337:9: Is
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
        // InternalEldmDslParser.g:1389:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )
        // InternalEldmDslParser.g:1389:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        {
        // InternalEldmDslParser.g:1389:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        // InternalEldmDslParser.g:1390:7: () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        {
        // InternalEldmDslParser.g:1390:7: ()
        // InternalEldmDslParser.g:1391:7: 
        {
        }

        // InternalEldmDslParser.g:1392:7: ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        // InternalEldmDslParser.g:1393:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        {
        // InternalEldmDslParser.g:1393:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        // InternalEldmDslParser.g:1394:9: ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign )
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
        // InternalEldmDslParser.g:1516:5: ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )
        // InternalEldmDslParser.g:1516:6: ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) )
        {
        // InternalEldmDslParser.g:1516:6: ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) )
        // InternalEldmDslParser.g:1517:6: () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) )
        {
        // InternalEldmDslParser.g:1517:6: ()
        // InternalEldmDslParser.g:1518:6: 
        {
        }

        // InternalEldmDslParser.g:1519:6: ( ( ( PlusSign | HyphenMinus | Set | Del ) ) )
        // InternalEldmDslParser.g:1520:7: ( ( PlusSign | HyphenMinus | Set | Del ) )
        {
        // InternalEldmDslParser.g:1520:7: ( ( PlusSign | HyphenMinus | Set | Del ) )
        // InternalEldmDslParser.g:1521:8: ( PlusSign | HyphenMinus | Set | Del )
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
        // InternalEldmDslParser.g:1642:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )
        // InternalEldmDslParser.g:1642:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalEldmDslParser.g:1642:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        // InternalEldmDslParser.g:1643:6: () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        {
        // InternalEldmDslParser.g:1643:6: ()
        // InternalEldmDslParser.g:1644:6: 
        {
        }

        // InternalEldmDslParser.g:1645:6: ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        // InternalEldmDslParser.g:1646:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        {
        // InternalEldmDslParser.g:1646:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        // InternalEldmDslParser.g:1647:8: ( Asterisk | AsteriskAsterisk | Solidus | PercentSign )
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
        // InternalEldmDslParser.g:2288:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:2288:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:2288:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket )
        // InternalEldmDslParser.g:2289:5: () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:2289:5: ()
        // InternalEldmDslParser.g:2290:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_43); if (state.failed) return ;
        // InternalEldmDslParser.g:2292:5: ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )?
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( (LA70_0==RULE_ID) ) {
            alt70=1;
        }
        switch (alt70) {
            case 1 :
                // InternalEldmDslParser.g:2293:6: ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )*
                {
                // InternalEldmDslParser.g:2293:6: ( ( ruleMapEntryDef ) )
                // InternalEldmDslParser.g:2294:7: ( ruleMapEntryDef )
                {
                // InternalEldmDslParser.g:2294:7: ( ruleMapEntryDef )
                // InternalEldmDslParser.g:2295:8: ruleMapEntryDef
                {
                pushFollow(FOLLOW_44);
                ruleMapEntryDef();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:2298:6: ( Comma ( ( ruleMapEntryDef ) ) )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==Comma) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==RULE_ID) ) {
                            alt69=1;
                        }


                    }


                    switch (alt69) {
                	case 1 :
                	    // InternalEldmDslParser.g:2299:7: Comma ( ( ruleMapEntryDef ) )
                	    {
                	    match(input,Comma,FOLLOW_17); if (state.failed) return ;
                	    // InternalEldmDslParser.g:2300:7: ( ( ruleMapEntryDef ) )
                	    // InternalEldmDslParser.g:2301:8: ( ruleMapEntryDef )
                	    {
                	    // InternalEldmDslParser.g:2301:8: ( ruleMapEntryDef )
                	    // InternalEldmDslParser.g:2302:9: ruleMapEntryDef
                	    {
                	    pushFollow(FOLLOW_44);
                	    ruleMapEntryDef();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);


                }
                break;

        }

        // InternalEldmDslParser.g:2307:5: ( Comma ( ( Asterisk ) ) )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==Comma) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // InternalEldmDslParser.g:2308:6: Comma ( ( Asterisk ) )
                {
                match(input,Comma,FOLLOW_45); if (state.failed) return ;
                // InternalEldmDslParser.g:2309:6: ( ( Asterisk ) )
                // InternalEldmDslParser.g:2310:7: ( Asterisk )
                {
                // InternalEldmDslParser.g:2310:7: ( Asterisk )
                // InternalEldmDslParser.g:2311:8: Asterisk
                {
                match(input,Asterisk,FOLLOW_46); if (state.failed) return ;

                }


                }


                }
                break;

        }

        match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalEldmDslParser

    // $ANTLR start synpred10_InternalEldmDslParser
    public final void synpred10_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:3397:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:3397:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:3397:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        // InternalEldmDslParser.g:3398:5: () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:3398:5: ()
        // InternalEldmDslParser.g:3399:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_57); if (state.failed) return ;
        // InternalEldmDslParser.g:3401:5: ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )?
        int alt73=2;
        int LA73_0 = input.LA(1);

        if ( (LA73_0==RULE_ID) ) {
            alt73=1;
        }
        switch (alt73) {
            case 1 :
                // InternalEldmDslParser.g:3402:6: ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )*
                {
                // InternalEldmDslParser.g:3402:6: ( ( ruleMapEntryLiteral ) )
                // InternalEldmDslParser.g:3403:7: ( ruleMapEntryLiteral )
                {
                // InternalEldmDslParser.g:3403:7: ( ruleMapEntryLiteral )
                // InternalEldmDslParser.g:3404:8: ruleMapEntryLiteral
                {
                pushFollow(FOLLOW_44);
                ruleMapEntryLiteral();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:3407:6: ( Comma ( ( ruleMapEntryLiteral ) ) )*
                loop72:
                do {
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==Comma) ) {
                        alt72=1;
                    }


                    switch (alt72) {
                	case 1 :
                	    // InternalEldmDslParser.g:3408:7: Comma ( ( ruleMapEntryLiteral ) )
                	    {
                	    match(input,Comma,FOLLOW_17); if (state.failed) return ;
                	    // InternalEldmDslParser.g:3409:7: ( ( ruleMapEntryLiteral ) )
                	    // InternalEldmDslParser.g:3410:8: ( ruleMapEntryLiteral )
                	    {
                	    // InternalEldmDslParser.g:3410:8: ( ruleMapEntryLiteral )
                	    // InternalEldmDslParser.g:3411:9: ruleMapEntryLiteral
                	    {
                	    pushFollow(FOLLOW_44);
                	    ruleMapEntryLiteral();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop72;
                    }
                } while (true);


                }
                break;

        }

        match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalEldmDslParser

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


    protected DFA58 dfa58 = new DFA58(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\13\14\uffff";
    static final String dfa_3s = "\1\120\14\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\2\14\2\uffff\1\14\1\1\1\uffff\1\14\2\uffff\1\14\1\uffff\3\14\1\uffff\3\14\1\uffff\1\14\35\uffff\1\13\1\11\1\uffff\1\12\5\uffff\1\10\1\14\1\uffff\1\3\1\4\1\5\1\6\1\7\1\2",
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
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2897:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200532L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200432L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000410000080L,0x0000000000000280L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000410000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x04000082EE926000L,0x0000000000000204L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000101000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x040000C2EE926000L,0x0000000000000304L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x040000C2EE926000L,0x0000000000000204L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000082EE926000L,0x0000000000000204L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200400L,0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x80050002EE966800L,0x000000000001FB15L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2800150000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00A0000100400002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0212001000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100002000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000082EE937000L,0x0000000000000204L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000208L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0050C00000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000C00000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x5400000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x80000002EE966800L,0x000000000001FB05L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x80000002EE966800L,0x000000000001FB07L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000208L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000C00000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000C00000000002L});

}