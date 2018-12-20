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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Definitions", "PlugDsl", "Service", "Typedef", "Import", "Module", "Catch", "False", "Match", "Bool", "Enum", "From", "Mask", "Path", "True", "And", "Any", "Def", "Del", "Flt", "Get", "Int", "Lda", "Ldt", "Let", "Lst", "Ltm", "Map", "Out", "Set", "Str", "Var", "ExclamationMarkEqualsSign", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "FullStopFullStop", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "QuestionMarkFullStop", "As", "In", "Is", "Or", "LineFeed", "CarriageReturn", "ExclamationMark", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "LeftPointingDoubleAngleQuotationMark", "RightPointingDoubleAngleQuotationMark", "RULE_BEGIN", "RULE_END", "RULE_PATH", "RULE_ID", "RULE_INT", "RULE_NATURAL", "RULE_FLOAT", "RULE_DATE", "RULE_TIME", "RULE_DATETIME", "RULE_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=14;
    public static final int Import=8;
    public static final int Or=47;
    public static final int RULE_BEGIN=72;
    public static final int Var=35;
    public static final int True=18;
    public static final int False=11;
    public static final int LessThanSign=61;
    public static final int Str=34;
    public static final int PercentSign=51;
    public static final int LeftParenthesis=52;
    public static final int Bool=13;
    public static final int FullStopFullStop=39;
    public static final int RULE_TIME=80;
    public static final int RightSquareBracket=67;
    public static final int ExclamationMark=50;
    public static final int GreaterThanSign=63;
    public static final int RULE_ID=75;
    public static final int Mask=16;
    public static final int RightParenthesis=53;
    public static final int Lst=29;
    public static final int Out=32;
    public static final int GreaterThanSignEqualsSign=42;
    public static final int RULE_PATH=74;
    public static final int EqualsSignEqualsSign=41;
    public static final int RULE_DATE=79;
    public static final int Typedef=7;
    public static final int And=19;
    public static final int PlusSign=55;
    public static final int RULE_INT=76;
    public static final int Get=24;
    public static final int AsteriskAsterisk=37;
    public static final int RULE_NATURAL=77;
    public static final int RULE_ML_COMMENT=83;
    public static final int RULE_TEXT=82;
    public static final int LeftSquareBracket=66;
    public static final int Module=9;
    public static final int Map=31;
    public static final int RULE_END=73;
    public static final int Set=33;
    public static final int Ltm=30;
    public static final int In=45;
    public static final int Catch=10;
    public static final int RULE_DATETIME=81;
    public static final int Lda=26;
    public static final int Is=46;
    public static final int LeftPointingDoubleAngleQuotationMark=70;
    public static final int Any=20;
    public static final int Int=25;
    public static final int Match=12;
    public static final int Flt=23;
    public static final int RULE_SL_COMMENT=84;
    public static final int QuestionMarkFullStop=43;
    public static final int Comma=56;
    public static final int EqualsSign=62;
    public static final int As=44;
    public static final int HyphenMinus=57;
    public static final int RightPointingDoubleAngleQuotationMark=71;
    public static final int CarriageReturn=49;
    public static final int LessThanSignEqualsSign=40;
    public static final int Solidus=59;
    public static final int Colon=60;
    public static final int RightCurlyBracket=69;
    public static final int EOF=-1;
    public static final int Ldt=27;
    public static final int Asterisk=54;
    public static final int Path=17;
    public static final int FullStop=58;
    public static final int Def=21;
    public static final int RULE_WS=85;
    public static final int Definitions=4;
    public static final int LeftCurlyBracket=68;
    public static final int Service=6;
    public static final int Del=22;
    public static final int From=15;
    public static final int RULE_ANY_OTHER=86;
    public static final int CommercialAt=65;
    public static final int PlugDsl=5;
    public static final int QuestionMark=64;
    public static final int RULE_FLOAT=78;
    public static final int Let=28;
    public static final int ExclamationMarkEqualsSign=36;
    public static final int HyphenMinusGreaterThanSign=38;
    public static final int LineFeed=48;

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
    // InternalEldmDslParser.g:64:1: ruleModule returns [EObject current=null] : (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) ;
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

        EObject lv_opers_9_0 = null;

        EObject lv_paths_10_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:70:2: ( (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) )
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            {
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            // InternalEldmDslParser.g:72:3: otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vars_7_0= ruleVar ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )*
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

            // InternalEldmDslParser.g:185:3: ( (lv_opers_9_0= ruleOperation ) )*
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
                else if ( (LA6_0==Catch||LA6_0==Out||LA6_0==In) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEldmDslParser.g:186:4: (lv_opers_9_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:186:4: (lv_opers_9_0= ruleOperation )
            	    // InternalEldmDslParser.g:187:5: lv_opers_9_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getOpersOperationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_opers_9_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"opers",
            	      						lv_opers_9_0,
            	      						"net.eldm.EldmDsl.Operation");
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


    // $ANTLR start "entryRuleOperation"
    // InternalEldmDslParser.g:505:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalEldmDslParser.g:505:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalEldmDslParser.g:506:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalEldmDslParser.g:512:1: ruleOperation returns [EObject current=null] : ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:518:2: ( ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) ) )
            // InternalEldmDslParser.g:519:2: ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) )
            {
            // InternalEldmDslParser.g:519:2: ( ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) ) )
            // InternalEldmDslParser.g:520:3: ( (lv_decl_0_0= ruleOperationDecl ) ) ( (lv_body_1_0= ruleBlockExpression ) )
            {
            // InternalEldmDslParser.g:520:3: ( (lv_decl_0_0= ruleOperationDecl ) )
            // InternalEldmDslParser.g:521:4: (lv_decl_0_0= ruleOperationDecl )
            {
            // InternalEldmDslParser.g:521:4: (lv_decl_0_0= ruleOperationDecl )
            // InternalEldmDslParser.g:522:5: lv_decl_0_0= ruleOperationDecl
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

            // InternalEldmDslParser.g:539:3: ( (lv_body_1_0= ruleBlockExpression ) )
            // InternalEldmDslParser.g:540:4: (lv_body_1_0= ruleBlockExpression )
            {
            // InternalEldmDslParser.g:540:4: (lv_body_1_0= ruleBlockExpression )
            // InternalEldmDslParser.g:541:5: lv_body_1_0= ruleBlockExpression
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
    // InternalEldmDslParser.g:562:1: entryRuleOperationDecl returns [EObject current=null] : iv_ruleOperationDecl= ruleOperationDecl EOF ;
    public final EObject entryRuleOperationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDecl = null;


        try {
            // InternalEldmDslParser.g:562:54: (iv_ruleOperationDecl= ruleOperationDecl EOF )
            // InternalEldmDslParser.g:563:2: iv_ruleOperationDecl= ruleOperationDecl EOF
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
    // InternalEldmDslParser.g:569:1: ruleOperationDecl returns [EObject current=null] : ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon ) ;
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
            // InternalEldmDslParser.g:575:2: ( ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon ) )
            // InternalEldmDslParser.g:576:2: ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon )
            {
            // InternalEldmDslParser.g:576:2: ( ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon )
            // InternalEldmDslParser.g:577:3: ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) ) otherlv_11= Colon
            {
            // InternalEldmDslParser.g:577:3: ( ( ( (lv_type_0_0= Catch ) ) ( (lv_param_1_0= ruleElementDef ) )? ) | ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Catch) ) {
                alt19=1;
            }
            else if ( (LA19_0==Def||LA19_0==Out||LA19_0==In) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
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

                              							newCompositeNode(grammarAccess.getOperationDeclAccess().getParamElementDefParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
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
                    // InternalEldmDslParser.g:614:4: ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? )
                    {
                    // InternalEldmDslParser.g:614:4: ( ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )? )
                    // InternalEldmDslParser.g:615:5: ( (lv_contracts_2_0= ruleContract ) )* ( (lv_type_3_0= Def ) ) ( (lv_srv_4_0= Service ) )? ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set ) ( (lv_path_7_0= rulePathLiteral ) )? ( (lv_param_8_0= ruleElementDef ) )? (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )?
                    {
                    // InternalEldmDslParser.g:615:5: ( (lv_contracts_2_0= ruleContract ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Out||LA13_0==In) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:616:6: (lv_contracts_2_0= ruleContract )
                    	    {
                    	    // InternalEldmDslParser.g:616:6: (lv_contracts_2_0= ruleContract )
                    	    // InternalEldmDslParser.g:617:7: lv_contracts_2_0= ruleContract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationDeclAccess().getContractsContractParserRuleCall_0_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop13;
                        }
                    } while (true);

                    // InternalEldmDslParser.g:634:5: ( (lv_type_3_0= Def ) )
                    // InternalEldmDslParser.g:635:6: (lv_type_3_0= Def )
                    {
                    // InternalEldmDslParser.g:635:6: (lv_type_3_0= Def )
                    // InternalEldmDslParser.g:636:7: lv_type_3_0= Def
                    {
                    lv_type_3_0=(Token)match(input,Def,FOLLOW_21); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:648:5: ( (lv_srv_4_0= Service ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Service) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEldmDslParser.g:649:6: (lv_srv_4_0= Service )
                            {
                            // InternalEldmDslParser.g:649:6: (lv_srv_4_0= Service )
                            // InternalEldmDslParser.g:650:7: lv_srv_4_0= Service
                            {
                            lv_srv_4_0=(Token)match(input,Service,FOLLOW_22); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:662:5: ( ( (lv_get_5_0= Get ) ) | otherlv_6= Set )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Get) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==Set) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEldmDslParser.g:663:6: ( (lv_get_5_0= Get ) )
                            {
                            // InternalEldmDslParser.g:663:6: ( (lv_get_5_0= Get ) )
                            // InternalEldmDslParser.g:664:7: (lv_get_5_0= Get )
                            {
                            // InternalEldmDslParser.g:664:7: (lv_get_5_0= Get )
                            // InternalEldmDslParser.g:665:8: lv_get_5_0= Get
                            {
                            lv_get_5_0=(Token)match(input,Get,FOLLOW_23); if (state.failed) return current;
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
                            // InternalEldmDslParser.g:678:6: otherlv_6= Set
                            {
                            otherlv_6=(Token)match(input,Set,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getOperationDeclAccess().getSetKeyword_0_1_3_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalEldmDslParser.g:683:5: ( (lv_path_7_0= rulePathLiteral ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_PATH) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEldmDslParser.g:684:6: (lv_path_7_0= rulePathLiteral )
                            {
                            // InternalEldmDslParser.g:684:6: (lv_path_7_0= rulePathLiteral )
                            // InternalEldmDslParser.g:685:7: lv_path_7_0= rulePathLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOperationDeclAccess().getPathPathLiteralParserRuleCall_0_1_4_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
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

                    // InternalEldmDslParser.g:702:5: ( (lv_param_8_0= ruleElementDef ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=Bool && LA17_0<=Enum)||LA17_0==Path||LA17_0==Any||LA17_0==Flt||(LA17_0>=Int && LA17_0<=Ldt)||(LA17_0>=Lst && LA17_0<=Map)||LA17_0==Str||LA17_0==FullStopFullStop||LA17_0==LeftCurlyBracket||LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalEldmDslParser.g:703:6: (lv_param_8_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:703:6: (lv_param_8_0= ruleElementDef )
                            // InternalEldmDslParser.g:704:7: lv_param_8_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOperationDeclAccess().getParamElementDefParserRuleCall_0_1_5_0());
                              						
                            }
                            pushFollow(FOLLOW_25);
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

                    // InternalEldmDslParser.g:721:5: (otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==HyphenMinusGreaterThanSign) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEldmDslParser.g:722:6: otherlv_9= HyphenMinusGreaterThanSign ( (lv_result_10_0= ruleElementDef ) )
                            {
                            otherlv_9=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getOperationDeclAccess().getHyphenMinusGreaterThanSignKeyword_0_1_6_0());
                              					
                            }
                            // InternalEldmDslParser.g:726:6: ( (lv_result_10_0= ruleElementDef ) )
                            // InternalEldmDslParser.g:727:7: (lv_result_10_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:727:7: (lv_result_10_0= ruleElementDef )
                            // InternalEldmDslParser.g:728:8: lv_result_10_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getOperationDeclAccess().getResultElementDefParserRuleCall_0_1_6_1_0());
                              							
                            }
                            pushFollow(FOLLOW_19);
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
    // InternalEldmDslParser.g:756:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalEldmDslParser.g:756:49: (iv_ruleContract= ruleContract EOF )
            // InternalEldmDslParser.g:757:2: iv_ruleContract= ruleContract EOF
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
    // InternalEldmDslParser.g:763:1: ruleContract returns [EObject current=null] : ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK ) ;
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
            // InternalEldmDslParser.g:769:2: ( ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK ) )
            // InternalEldmDslParser.g:770:2: ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK )
            {
            // InternalEldmDslParser.g:770:2: ( ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK )
            // InternalEldmDslParser.g:771:3: ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) ) otherlv_1= LeftParenthesis ( (lv_cond_2_0= ruleValueExpression ) ) otherlv_3= RightParenthesis (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )? ruleBREAK
            {
            // InternalEldmDslParser.g:771:3: ( ( (lv_flow_0_1= In | lv_flow_0_2= Out ) ) )
            // InternalEldmDslParser.g:772:4: ( (lv_flow_0_1= In | lv_flow_0_2= Out ) )
            {
            // InternalEldmDslParser.g:772:4: ( (lv_flow_0_1= In | lv_flow_0_2= Out ) )
            // InternalEldmDslParser.g:773:5: (lv_flow_0_1= In | lv_flow_0_2= Out )
            {
            // InternalEldmDslParser.g:773:5: (lv_flow_0_1= In | lv_flow_0_2= Out )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==In) ) {
                alt20=1;
            }
            else if ( (LA20_0==Out) ) {
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
                    // InternalEldmDslParser.g:774:6: lv_flow_0_1= In
                    {
                    lv_flow_0_1=(Token)match(input,In,FOLLOW_27); if (state.failed) return current;
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
                    // InternalEldmDslParser.g:785:6: lv_flow_0_2= Out
                    {
                    lv_flow_0_2=(Token)match(input,Out,FOLLOW_27); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContractAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEldmDslParser.g:802:3: ( (lv_cond_2_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:803:4: (lv_cond_2_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:803:4: (lv_cond_2_0= ruleValueExpression )
            // InternalEldmDslParser.g:804:5: lv_cond_2_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContractAccess().getCondValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalEldmDslParser.g:825:3: (otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==HyphenMinusGreaterThanSign) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEldmDslParser.g:826:4: otherlv_4= HyphenMinusGreaterThanSign ( (lv_msg_5_0= RULE_TEXT ) )
                    {
                    otherlv_4=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getContractAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                      			
                    }
                    // InternalEldmDslParser.g:830:4: ( (lv_msg_5_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:831:5: (lv_msg_5_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:831:5: (lv_msg_5_0= RULE_TEXT )
                    // InternalEldmDslParser.g:832:6: lv_msg_5_0= RULE_TEXT
                    {
                    lv_msg_5_0=(Token)match(input,RULE_TEXT,FOLLOW_15); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSubPath"
    // InternalEldmDslParser.g:860:1: entryRuleSubPath returns [EObject current=null] : iv_ruleSubPath= ruleSubPath EOF ;
    public final EObject entryRuleSubPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPath = null;


        try {
            // InternalEldmDslParser.g:860:48: (iv_ruleSubPath= ruleSubPath EOF )
            // InternalEldmDslParser.g:861:2: iv_ruleSubPath= ruleSubPath EOF
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
    // InternalEldmDslParser.g:867:1: ruleSubPath returns [EObject current=null] : (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleSubPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_path_1_0 = null;

        EObject lv_funcs_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:873:2: ( (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END ) )
            // InternalEldmDslParser.g:874:2: (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            {
            // InternalEldmDslParser.g:874:2: (otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            // InternalEldmDslParser.g:875:3: otherlv_0= Def ( (lv_path_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_funcs_3_0= ruleOperation ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubPathAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:879:3: ( (lv_path_1_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:880:4: (lv_path_1_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:880:4: (lv_path_1_0= rulePathLiteral )
            // InternalEldmDslParser.g:881:5: lv_path_1_0= rulePathLiteral
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalEldmDslParser.g:902:3: ( (lv_funcs_3_0= ruleOperation ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Catch||LA22_0==Def||LA22_0==Out||LA22_0==In) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEldmDslParser.g:903:4: (lv_funcs_3_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:903:4: (lv_funcs_3_0= ruleOperation )
            	    // InternalEldmDslParser.g:904:5: lv_funcs_3_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubPathAccess().getFuncsOperationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalEldmDslParser.g:929:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // InternalEldmDslParser.g:929:56: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // InternalEldmDslParser.g:930:2: iv_ruleBlockExpression= ruleBlockExpression EOF
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
    // InternalEldmDslParser.g:936:1: ruleBlockExpression returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:942:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) )
            // InternalEldmDslParser.g:943:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            {
            // InternalEldmDslParser.g:943:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            // InternalEldmDslParser.g:944:3: () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END
            {
            // InternalEldmDslParser.g:944:3: ()
            // InternalEldmDslParser.g:945:4: 
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
            // InternalEldmDslParser.g:955:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Let||LA23_0==Var) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEldmDslParser.g:956:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalEldmDslParser.g:956:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalEldmDslParser.g:957:5: lv_expressions_2_0= ruleExpression
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
            	    break loop23;
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
    // InternalEldmDslParser.g:982:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEldmDslParser.g:982:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEldmDslParser.g:983:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEldmDslParser.g:989:1: ruleExpression returns [EObject current=null] : this_Identifier_0= ruleIdentifier ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:995:2: (this_Identifier_0= ruleIdentifier )
            // InternalEldmDslParser.g:996:2: this_Identifier_0= ruleIdentifier
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
    // InternalEldmDslParser.g:1007:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalEldmDslParser.g:1007:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalEldmDslParser.g:1008:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalEldmDslParser.g:1014:1: ruleIdentifier returns [EObject current=null] : this_Var_0= ruleVar ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1020:2: (this_Var_0= ruleVar )
            // InternalEldmDslParser.g:1021:2: this_Var_0= ruleVar
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
    // InternalEldmDslParser.g:1032:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalEldmDslParser.g:1032:44: (iv_ruleVar= ruleVar EOF )
            // InternalEldmDslParser.g:1033:2: iv_ruleVar= ruleVar EOF
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
    // InternalEldmDslParser.g:1039:1: ruleVar returns [EObject current=null] : ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) ) ;
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
            // InternalEldmDslParser.g:1045:2: ( ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) ) )
            // InternalEldmDslParser.g:1046:2: ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) )
            {
            // InternalEldmDslParser.g:1046:2: ( ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) ) )
            // InternalEldmDslParser.g:1047:3: ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )? otherlv_5= EqualsSign ( (lv_result_6_0= ruleValueExpression ) )
            {
            // InternalEldmDslParser.g:1047:3: ( ( (lv_let_0_0= Let ) ) | otherlv_1= Var )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Let) ) {
                alt24=1;
            }
            else if ( (LA24_0==Var) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEldmDslParser.g:1048:4: ( (lv_let_0_0= Let ) )
                    {
                    // InternalEldmDslParser.g:1048:4: ( (lv_let_0_0= Let ) )
                    // InternalEldmDslParser.g:1049:5: (lv_let_0_0= Let )
                    {
                    // InternalEldmDslParser.g:1049:5: (lv_let_0_0= Let )
                    // InternalEldmDslParser.g:1050:6: lv_let_0_0= Let
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
                    // InternalEldmDslParser.g:1063:4: otherlv_1= Var
                    {
                    otherlv_1=(Token)match(input,Var,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVarAccess().getVarKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:1068:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEldmDslParser.g:1069:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1069:4: (lv_name_2_0= RULE_ID )
            // InternalEldmDslParser.g:1070:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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

            // InternalEldmDslParser.g:1086:3: (otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Colon) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEldmDslParser.g:1087:4: otherlv_3= Colon ( (lv_type_4_0= ruleElementDef ) )
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVarAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalEldmDslParser.g:1091:4: ( (lv_type_4_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:1092:5: (lv_type_4_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:1092:5: (lv_type_4_0= ruleElementDef )
                    // InternalEldmDslParser.g:1093:6: lv_type_4_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAccess().getTypeElementDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

            otherlv_5=(Token)match(input,EqualsSign,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVarAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalEldmDslParser.g:1115:3: ( (lv_result_6_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:1116:4: (lv_result_6_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:1116:4: (lv_result_6_0= ruleValueExpression )
            // InternalEldmDslParser.g:1117:5: lv_result_6_0= ruleValueExpression
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
    // InternalEldmDslParser.g:1138:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // InternalEldmDslParser.g:1138:56: (iv_ruleValueExpression= ruleValueExpression EOF )
            // InternalEldmDslParser.g:1139:2: iv_ruleValueExpression= ruleValueExpression EOF
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
    // InternalEldmDslParser.g:1145:1: ruleValueExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1151:2: (this_OrExpression_0= ruleOrExpression )
            // InternalEldmDslParser.g:1152:2: this_OrExpression_0= ruleOrExpression
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
    // InternalEldmDslParser.g:1163:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalEldmDslParser.g:1163:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalEldmDslParser.g:1164:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalEldmDslParser.g:1170:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1176:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEldmDslParser.g:1177:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1177:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEldmDslParser.g:1178:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1186:3: ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Or) && (synpred2_InternalEldmDslParser())) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEldmDslParser.g:1187:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1187:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) )
            	    // InternalEldmDslParser.g:1188:5: ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) )
            	    {
            	    // InternalEldmDslParser.g:1198:5: ( () ( (lv_feature_2_0= Or ) ) )
            	    // InternalEldmDslParser.g:1199:6: () ( (lv_feature_2_0= Or ) )
            	    {
            	    // InternalEldmDslParser.g:1199:6: ()
            	    // InternalEldmDslParser.g:1200:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1206:6: ( (lv_feature_2_0= Or ) )
            	    // InternalEldmDslParser.g:1207:7: (lv_feature_2_0= Or )
            	    {
            	    // InternalEldmDslParser.g:1207:7: (lv_feature_2_0= Or )
            	    // InternalEldmDslParser.g:1208:8: lv_feature_2_0= Or
            	    {
            	    lv_feature_2_0=(Token)match(input,Or,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1222:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEldmDslParser.g:1223:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEldmDslParser.g:1223:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEldmDslParser.g:1224:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalEldmDslParser.g:1246:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEldmDslParser.g:1246:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEldmDslParser.g:1247:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalEldmDslParser.g:1253:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1259:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalEldmDslParser.g:1260:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1260:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalEldmDslParser.g:1261:3: this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1269:3: ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==And) && (synpred3_InternalEldmDslParser())) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEldmDslParser.g:1270:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1270:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) )
            	    // InternalEldmDslParser.g:1271:5: ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) )
            	    {
            	    // InternalEldmDslParser.g:1281:5: ( () ( (lv_feature_2_0= And ) ) )
            	    // InternalEldmDslParser.g:1282:6: () ( (lv_feature_2_0= And ) )
            	    {
            	    // InternalEldmDslParser.g:1282:6: ()
            	    // InternalEldmDslParser.g:1283:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1289:6: ( (lv_feature_2_0= And ) )
            	    // InternalEldmDslParser.g:1290:7: (lv_feature_2_0= And )
            	    {
            	    // InternalEldmDslParser.g:1290:7: (lv_feature_2_0= And )
            	    // InternalEldmDslParser.g:1291:8: lv_feature_2_0= And
            	    {
            	    lv_feature_2_0=(Token)match(input,And,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1305:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalEldmDslParser.g:1306:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalEldmDslParser.g:1306:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalEldmDslParser.g:1307:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop27;
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
    // InternalEldmDslParser.g:1329:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalEldmDslParser.g:1329:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalEldmDslParser.g:1330:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalEldmDslParser.g:1336:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1342:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalEldmDslParser.g:1343:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1343:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalEldmDslParser.g:1344:3: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1352:3: ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==EqualsSignEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt29=1;
                }
                else if ( (LA29_0==ExclamationMarkEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEldmDslParser.g:1353:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1353:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1354:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1368:5: ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalEldmDslParser.g:1369:6: () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1369:6: ()
            	    // InternalEldmDslParser.g:1370:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEqualityExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1376:6: ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalEldmDslParser.g:1377:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalEldmDslParser.g:1377:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalEldmDslParser.g:1378:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalEldmDslParser.g:1378:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==EqualsSignEqualsSign) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==ExclamationMarkEqualsSign) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1379:9: lv_feature_2_1= EqualsSignEqualsSign
            	            {
            	            lv_feature_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1390:9: lv_feature_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_feature_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1405:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalEldmDslParser.g:1406:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalEldmDslParser.g:1406:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalEldmDslParser.g:1407:6: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalEldmDslParser.g:1429:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalEldmDslParser.g:1429:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalEldmDslParser.g:1430:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalEldmDslParser.g:1436:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) ;
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
            // InternalEldmDslParser.g:1442:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) )
            // InternalEldmDslParser.g:1443:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            {
            // InternalEldmDslParser.g:1443:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            // InternalEldmDslParser.g:1444:3: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1452:3: ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Is) && (synpred5_InternalEldmDslParser())) {
                    alt31=1;
                }
                else if ( (LA31_0==GreaterThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt31=2;
                }
                else if ( (LA31_0==LessThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt31=2;
                }
                else if ( (LA31_0==GreaterThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt31=2;
                }
                else if ( (LA31_0==LessThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEldmDslParser.g:1453:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    {
            	    // InternalEldmDslParser.g:1453:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    // InternalEldmDslParser.g:1454:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) )
            	    {
            	    // InternalEldmDslParser.g:1454:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) )
            	    // InternalEldmDslParser.g:1455:6: ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) )
            	    {
            	    // InternalEldmDslParser.g:1465:6: ( () ( (lv_feature_2_0= Is ) ) )
            	    // InternalEldmDslParser.g:1466:7: () ( (lv_feature_2_0= Is ) )
            	    {
            	    // InternalEldmDslParser.g:1466:7: ()
            	    // InternalEldmDslParser.g:1467:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getIsExpressionLeftAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1473:7: ( (lv_feature_2_0= Is ) )
            	    // InternalEldmDslParser.g:1474:8: (lv_feature_2_0= Is )
            	    {
            	    // InternalEldmDslParser.g:1474:8: (lv_feature_2_0= Is )
            	    // InternalEldmDslParser.g:1475:9: lv_feature_2_0= Is
            	    {
            	    lv_feature_2_0=(Token)match(input,Is,FOLLOW_26); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1489:5: ( (lv_type_3_0= ruleElementDef ) )
            	    // InternalEldmDslParser.g:1490:6: (lv_type_3_0= ruleElementDef )
            	    {
            	    // InternalEldmDslParser.g:1490:6: (lv_type_3_0= ruleElementDef )
            	    // InternalEldmDslParser.g:1491:7: lv_type_3_0= ruleElementDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getTypeElementDefParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    // InternalEldmDslParser.g:1510:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    {
            	    // InternalEldmDslParser.g:1510:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    // InternalEldmDslParser.g:1511:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1511:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1512:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1530:6: ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    // InternalEldmDslParser.g:1531:7: () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1531:7: ()
            	    // InternalEldmDslParser.g:1532:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getValueExpressionLeftAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1538:7: ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    // InternalEldmDslParser.g:1539:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    {
            	    // InternalEldmDslParser.g:1539:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    // InternalEldmDslParser.g:1540:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    {
            	    // InternalEldmDslParser.g:1540:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    int alt30=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt30=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1541:10: lv_feature_5_1= GreaterThanSignEqualsSign
            	            {
            	            lv_feature_5_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1552:10: lv_feature_5_2= LessThanSignEqualsSign
            	            {
            	            lv_feature_5_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1563:10: lv_feature_5_3= GreaterThanSign
            	            {
            	            lv_feature_5_3=(Token)match(input,GreaterThanSign,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1574:10: lv_feature_5_4= LessThanSign
            	            {
            	            lv_feature_5_4=(Token)match(input,LessThanSign,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1589:5: ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    // InternalEldmDslParser.g:1590:6: (lv_right_6_0= ruleAdditiveExpression )
            	    {
            	    // InternalEldmDslParser.g:1590:6: (lv_right_6_0= ruleAdditiveExpression )
            	    // InternalEldmDslParser.g:1591:7: lv_right_6_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalEldmDslParser.g:1614:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalEldmDslParser.g:1614:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalEldmDslParser.g:1615:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalEldmDslParser.g:1621:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
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
            // InternalEldmDslParser.g:1627:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalEldmDslParser.g:1628:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1628:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalEldmDslParser.g:1629:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1637:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==PlusSign) && (synpred7_InternalEldmDslParser())) {
                    alt33=1;
                }
                else if ( (LA33_0==HyphenMinus) && (synpred7_InternalEldmDslParser())) {
                    alt33=1;
                }
                else if ( (LA33_0==Set) && (synpred7_InternalEldmDslParser())) {
                    alt33=1;
                }
                else if ( (LA33_0==Del) && (synpred7_InternalEldmDslParser())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEldmDslParser.g:1638:4: ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1638:4: ( ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) ) )
            	    // InternalEldmDslParser.g:1639:5: ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1657:5: ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) ) )
            	    // InternalEldmDslParser.g:1658:6: () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) )
            	    {
            	    // InternalEldmDslParser.g:1658:6: ()
            	    // InternalEldmDslParser.g:1659:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAdditiveExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1665:6: ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) ) )
            	    // InternalEldmDslParser.g:1666:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) )
            	    {
            	    // InternalEldmDslParser.g:1666:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del ) )
            	    // InternalEldmDslParser.g:1667:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del )
            	    {
            	    // InternalEldmDslParser.g:1667:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus | lv_feature_2_3= Set | lv_feature_2_4= Del )
            	    int alt32=4;
            	    switch ( input.LA(1) ) {
            	    case PlusSign:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case HyphenMinus:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case Set:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    case Del:
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
            	            // InternalEldmDslParser.g:1668:9: lv_feature_2_1= PlusSign
            	            {
            	            lv_feature_2_1=(Token)match(input,PlusSign,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1679:9: lv_feature_2_2= HyphenMinus
            	            {
            	            lv_feature_2_2=(Token)match(input,HyphenMinus,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1690:9: lv_feature_2_3= Set
            	            {
            	            lv_feature_2_3=(Token)match(input,Set,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1701:9: lv_feature_2_4= Del
            	            {
            	            lv_feature_2_4=(Token)match(input,Del,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1716:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalEldmDslParser.g:1717:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalEldmDslParser.g:1717:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalEldmDslParser.g:1718:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalEldmDslParser.g:1740:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalEldmDslParser.g:1740:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalEldmDslParser.g:1741:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalEldmDslParser.g:1747:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
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
            // InternalEldmDslParser.g:1753:2: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // InternalEldmDslParser.g:1754:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // InternalEldmDslParser.g:1754:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // InternalEldmDslParser.g:1755:3: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1763:3: ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Asterisk) && (synpred8_InternalEldmDslParser())) {
                    alt35=1;
                }
                else if ( (LA35_0==AsteriskAsterisk) && (synpred8_InternalEldmDslParser())) {
                    alt35=1;
                }
                else if ( (LA35_0==Solidus) && (synpred8_InternalEldmDslParser())) {
                    alt35=1;
                }
                else if ( (LA35_0==PercentSign) && (synpred8_InternalEldmDslParser())) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEldmDslParser.g:1764:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // InternalEldmDslParser.g:1764:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1765:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1783:5: ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    // InternalEldmDslParser.g:1784:6: () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1784:6: ()
            	    // InternalEldmDslParser.g:1785:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1791:6: ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    // InternalEldmDslParser.g:1792:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    {
            	    // InternalEldmDslParser.g:1792:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    // InternalEldmDslParser.g:1793:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    {
            	    // InternalEldmDslParser.g:1793:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case AsteriskAsterisk:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case PercentSign:
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
            	            // InternalEldmDslParser.g:1794:9: lv_feature_2_1= Asterisk
            	            {
            	            lv_feature_2_1=(Token)match(input,Asterisk,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1805:9: lv_feature_2_2= AsteriskAsterisk
            	            {
            	            lv_feature_2_2=(Token)match(input,AsteriskAsterisk,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1816:9: lv_feature_2_3= Solidus
            	            {
            	            lv_feature_2_3=(Token)match(input,Solidus,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalEldmDslParser.g:1827:9: lv_feature_2_4= PercentSign
            	            {
            	            lv_feature_2_4=(Token)match(input,PercentSign,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1842:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // InternalEldmDslParser.g:1843:5: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // InternalEldmDslParser.g:1843:5: (lv_right_3_0= ruleUnaryOperation )
            	    // InternalEldmDslParser.g:1844:6: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalEldmDslParser.g:1866:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalEldmDslParser.g:1866:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalEldmDslParser.g:1867:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
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
    // InternalEldmDslParser.g:1873:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_Primary_3 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1879:2: ( ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary ) )
            // InternalEldmDslParser.g:1880:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary )
            {
            // InternalEldmDslParser.g:1880:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_Primary_3= rulePrimary )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ExclamationMark) ) {
                alt36=1;
            }
            else if ( (LA36_0==False||(LA36_0>=Bool && LA36_0<=Enum)||(LA36_0>=Path && LA36_0<=True)||LA36_0==Any||LA36_0==Flt||(LA36_0>=Int && LA36_0<=Ldt)||(LA36_0>=Lst && LA36_0<=Map)||LA36_0==Str||LA36_0==LeftParenthesis||LA36_0==LeftSquareBracket||LA36_0==LeftCurlyBracket||LA36_0==LeftPointingDoubleAngleQuotationMark||(LA36_0>=RULE_PATH && LA36_0<=RULE_ID)||(LA36_0>=RULE_NATURAL && LA36_0<=RULE_TEXT)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalEldmDslParser.g:1881:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // InternalEldmDslParser.g:1881:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // InternalEldmDslParser.g:1882:4: () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // InternalEldmDslParser.g:1882:4: ()
                    // InternalEldmDslParser.g:1883:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEldmDslParser.g:1889:4: ( (lv_feature_1_0= ExclamationMark ) )
                    // InternalEldmDslParser.g:1890:5: (lv_feature_1_0= ExclamationMark )
                    {
                    // InternalEldmDslParser.g:1890:5: (lv_feature_1_0= ExclamationMark )
                    // InternalEldmDslParser.g:1891:6: lv_feature_1_0= ExclamationMark
                    {
                    lv_feature_1_0=(Token)match(input,ExclamationMark,FOLLOW_28); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:1903:4: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // InternalEldmDslParser.g:1904:5: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // InternalEldmDslParser.g:1904:5: (lv_operand_2_0= ruleUnaryOperation )
                    // InternalEldmDslParser.g:1905:6: lv_operand_2_0= ruleUnaryOperation
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
                    // InternalEldmDslParser.g:1924:3: this_Primary_3= rulePrimary
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
    // InternalEldmDslParser.g:1936:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEldmDslParser.g:1936:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEldmDslParser.g:1937:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalEldmDslParser.g:1943:1: rulePrimary returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) ) ;
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
            // InternalEldmDslParser.g:1949:2: ( ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) ) )
            // InternalEldmDslParser.g:1950:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) )
            {
            // InternalEldmDslParser.g:1950:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* ) )
            int alt40=2;
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
                alt40=1;
                }
                break;
            case RULE_ID:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==CommercialAt) ) {
                    alt40=1;
                }
                else if ( (LA40_2==EOF||LA40_2==And||LA40_2==Del||LA40_2==Let||LA40_2==Set||(LA40_2>=Var && LA40_2<=AsteriskAsterisk)||(LA40_2>=LessThanSignEqualsSign && LA40_2<=QuestionMarkFullStop)||(LA40_2>=Is && LA40_2<=Or)||LA40_2==PercentSign||(LA40_2>=RightParenthesis && LA40_2<=Solidus)||LA40_2==LessThanSign||LA40_2==GreaterThanSign||(LA40_2>=LeftSquareBracket && LA40_2<=RightSquareBracket)||LA40_2==RULE_END) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
            case LeftPointingDoubleAngleQuotationMark:
                {
                alt40=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalEldmDslParser.g:1951:3: ( (lv_value_0_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:1951:3: ( (lv_value_0_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:1952:4: (lv_value_0_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:1952:4: (lv_value_0_0= ruleLiteral )
                    // InternalEldmDslParser.g:1953:5: lv_value_0_0= ruleLiteral
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
                    // InternalEldmDslParser.g:1971:3: ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* )
                    {
                    // InternalEldmDslParser.g:1971:3: ( ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )* )
                    // InternalEldmDslParser.g:1972:4: ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )? ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) ) ( (lv_calls_8_0= ruleMemberCall ) )*
                    {
                    // InternalEldmDslParser.g:1972:4: ( ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==LeftPointingDoubleAngleQuotationMark) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalEldmDslParser.g:1973:5: ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) ) ( (lv_type_2_0= ruleElementDef ) ) otherlv_3= RightPointingDoubleAngleQuotationMark
                            {
                            // InternalEldmDslParser.g:1973:5: ( (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark ) )
                            // InternalEldmDslParser.g:1974:6: (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark )
                            {
                            // InternalEldmDslParser.g:1974:6: (lv_cast_1_0= LeftPointingDoubleAngleQuotationMark )
                            // InternalEldmDslParser.g:1975:7: lv_cast_1_0= LeftPointingDoubleAngleQuotationMark
                            {
                            lv_cast_1_0=(Token)match(input,LeftPointingDoubleAngleQuotationMark,FOLLOW_26); if (state.failed) return current;
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

                            // InternalEldmDslParser.g:1987:5: ( (lv_type_2_0= ruleElementDef ) )
                            // InternalEldmDslParser.g:1988:6: (lv_type_2_0= ruleElementDef )
                            {
                            // InternalEldmDslParser.g:1988:6: (lv_type_2_0= ruleElementDef )
                            // InternalEldmDslParser.g:1989:7: lv_type_2_0= ruleElementDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPrimaryAccess().getTypeElementDefParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
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

                            otherlv_3=(Token)match(input,RightPointingDoubleAngleQuotationMark,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightPointingDoubleAngleQuotationMarkKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2011:4: ( ( (lv_ref_4_0= RULE_ID ) ) | (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==LeftParenthesis) ) {
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
                            // InternalEldmDslParser.g:2012:5: ( (lv_ref_4_0= RULE_ID ) )
                            {
                            // InternalEldmDslParser.g:2012:5: ( (lv_ref_4_0= RULE_ID ) )
                            // InternalEldmDslParser.g:2013:6: (lv_ref_4_0= RULE_ID )
                            {
                            // InternalEldmDslParser.g:2013:6: (lv_ref_4_0= RULE_ID )
                            // InternalEldmDslParser.g:2014:7: lv_ref_4_0= RULE_ID
                            {
                            lv_ref_4_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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
                            // InternalEldmDslParser.g:2031:5: (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis )
                            {
                            // InternalEldmDslParser.g:2031:5: (otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis )
                            // InternalEldmDslParser.g:2032:6: otherlv_5= LeftParenthesis ( (lv_exp_6_0= ruleValueExpression ) ) otherlv_7= RightParenthesis
                            {
                            otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1_1_0());
                              					
                            }
                            // InternalEldmDslParser.g:2036:6: ( (lv_exp_6_0= ruleValueExpression ) )
                            // InternalEldmDslParser.g:2037:7: (lv_exp_6_0= ruleValueExpression )
                            {
                            // InternalEldmDslParser.g:2037:7: (lv_exp_6_0= ruleValueExpression )
                            // InternalEldmDslParser.g:2038:8: lv_exp_6_0= ruleValueExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPrimaryAccess().getExpValueExpressionParserRuleCall_1_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_29);
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

                            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_1_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2061:4: ( (lv_calls_8_0= ruleMemberCall ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==QuestionMarkFullStop||LA39_0==FullStop||LA39_0==LeftSquareBracket) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:2062:5: (lv_calls_8_0= ruleMemberCall )
                    	    {
                    	    // InternalEldmDslParser.g:2062:5: (lv_calls_8_0= ruleMemberCall )
                    	    // InternalEldmDslParser.g:2063:6: lv_calls_8_0= ruleMemberCall
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPrimaryAccess().getCallsMemberCallParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop39;
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
    // InternalEldmDslParser.g:2085:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalEldmDslParser.g:2085:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalEldmDslParser.g:2086:2: iv_ruleMemberCall= ruleMemberCall EOF
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
    // InternalEldmDslParser.g:2092:1: ruleMemberCall returns [EObject current=null] : ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )? ) | (otherlv_8= LeftSquareBracket ( (lv_key_9_0= ruleValueExpression ) ) otherlv_10= RightSquareBracket ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unknown_1_0=null;
        Token lv_member_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_key_9_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2098:2: ( ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )? ) | (otherlv_8= LeftSquareBracket ( (lv_key_9_0= ruleValueExpression ) ) otherlv_10= RightSquareBracket ) ) )
            // InternalEldmDslParser.g:2099:2: ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )? ) | (otherlv_8= LeftSquareBracket ( (lv_key_9_0= ruleValueExpression ) ) otherlv_10= RightSquareBracket ) )
            {
            // InternalEldmDslParser.g:2099:2: ( ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )? ) | (otherlv_8= LeftSquareBracket ( (lv_key_9_0= ruleValueExpression ) ) otherlv_10= RightSquareBracket ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QuestionMarkFullStop||LA44_0==FullStop) ) {
                alt44=1;
            }
            else if ( (LA44_0==LeftSquareBracket) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalEldmDslParser.g:2100:3: ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )? )
                    {
                    // InternalEldmDslParser.g:2100:3: ( (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )? )
                    // InternalEldmDslParser.g:2101:4: (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )?
                    {
                    // InternalEldmDslParser.g:2101:4: (otherlv_0= FullStop | ( (lv_unknown_1_0= QuestionMarkFullStop ) ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==FullStop) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==QuestionMarkFullStop) ) {
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
                            // InternalEldmDslParser.g:2102:5: otherlv_0= FullStop
                            {
                            otherlv_0=(Token)match(input,FullStop,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getMemberCallAccess().getFullStopKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalEldmDslParser.g:2107:5: ( (lv_unknown_1_0= QuestionMarkFullStop ) )
                            {
                            // InternalEldmDslParser.g:2107:5: ( (lv_unknown_1_0= QuestionMarkFullStop ) )
                            // InternalEldmDslParser.g:2108:6: (lv_unknown_1_0= QuestionMarkFullStop )
                            {
                            // InternalEldmDslParser.g:2108:6: (lv_unknown_1_0= QuestionMarkFullStop )
                            // InternalEldmDslParser.g:2109:7: lv_unknown_1_0= QuestionMarkFullStop
                            {
                            lv_unknown_1_0=(Token)match(input,QuestionMarkFullStop,FOLLOW_17); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2122:4: ( (lv_member_2_0= RULE_ID ) )
                    // InternalEldmDslParser.g:2123:5: (lv_member_2_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2123:5: (lv_member_2_0= RULE_ID )
                    // InternalEldmDslParser.g:2124:6: lv_member_2_0= RULE_ID
                    {
                    lv_member_2_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2140:4: (otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==LeftParenthesis) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalEldmDslParser.g:2141:5: otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleValueExpression ) ) (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )* otherlv_7= RightParenthesis
                            {
                            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getMemberCallAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalEldmDslParser.g:2145:5: ( (lv_params_4_0= ruleValueExpression ) )
                            // InternalEldmDslParser.g:2146:6: (lv_params_4_0= ruleValueExpression )
                            {
                            // InternalEldmDslParser.g:2146:6: (lv_params_4_0= ruleValueExpression )
                            // InternalEldmDslParser.g:2147:7: lv_params_4_0= ruleValueExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMemberCallAccess().getParamsValueExpressionParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_46);
                            lv_params_4_0=ruleValueExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMemberCallRule());
                              							}
                              							add(
                              								current,
                              								"params",
                              								lv_params_4_0,
                              								"net.eldm.EldmDsl.ValueExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalEldmDslParser.g:2164:5: (otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==Comma) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2165:6: otherlv_5= Comma ( (lv_params_6_0= ruleValueExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,Comma,FOLLOW_28); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getMemberCallAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:2169:6: ( (lv_params_6_0= ruleValueExpression ) )
                            	    // InternalEldmDslParser.g:2170:7: (lv_params_6_0= ruleValueExpression )
                            	    {
                            	    // InternalEldmDslParser.g:2170:7: (lv_params_6_0= ruleValueExpression )
                            	    // InternalEldmDslParser.g:2171:8: lv_params_6_0= ruleValueExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMemberCallAccess().getParamsValueExpressionParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_46);
                            	    lv_params_6_0=ruleValueExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getMemberCallRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"params",
                            	      									lv_params_6_0,
                            	      									"net.eldm.EldmDsl.ValueExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getMemberCallAccess().getRightParenthesisKeyword_0_2_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2196:3: (otherlv_8= LeftSquareBracket ( (lv_key_9_0= ruleValueExpression ) ) otherlv_10= RightSquareBracket )
                    {
                    // InternalEldmDslParser.g:2196:3: (otherlv_8= LeftSquareBracket ( (lv_key_9_0= ruleValueExpression ) ) otherlv_10= RightSquareBracket )
                    // InternalEldmDslParser.g:2197:4: otherlv_8= LeftSquareBracket ( (lv_key_9_0= ruleValueExpression ) ) otherlv_10= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,LeftSquareBracket,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMemberCallAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalEldmDslParser.g:2201:4: ( (lv_key_9_0= ruleValueExpression ) )
                    // InternalEldmDslParser.g:2202:5: (lv_key_9_0= ruleValueExpression )
                    {
                    // InternalEldmDslParser.g:2202:5: (lv_key_9_0= ruleValueExpression )
                    // InternalEldmDslParser.g:2203:6: lv_key_9_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberCallAccess().getKeyValueExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
                    lv_key_9_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberCallRule());
                      						}
                      						set(
                      							current,
                      							"key",
                      							lv_key_9_0,
                      							"net.eldm.EldmDsl.ValueExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getMemberCallAccess().getRightSquareBracketKeyword_1_2());
                      			
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


    // $ANTLR start "entryRuleDefinition"
    // InternalEldmDslParser.g:2229:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalEldmDslParser.g:2229:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalEldmDslParser.g:2230:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalEldmDslParser.g:2236:1: ruleDefinition returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_ExternalDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2242:2: ( (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) )
            // InternalEldmDslParser.g:2243:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            {
            // InternalEldmDslParser.g:2243:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Typedef) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:2244:3: this_TypeDef_0= ruleTypeDef
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
                    // InternalEldmDslParser.g:2253:3: this_ExternalDef_1= ruleExternalDef
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
    // InternalEldmDslParser.g:2265:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEldmDslParser.g:2265:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEldmDslParser.g:2266:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalEldmDslParser.g:2272:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) ) ;
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
            // InternalEldmDslParser.g:2278:2: ( (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) ) )
            // InternalEldmDslParser.g:2279:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) )
            {
            // InternalEldmDslParser.g:2279:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) ) )
            // InternalEldmDslParser.g:2280:3: otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) )
            {
            otherlv_0=(Token)match(input,Typedef,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2284:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:2285:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2285:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:2286:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2302:3: ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleTopDef ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Match||LA47_0==Mask) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=Bool && LA47_0<=Enum)||LA47_0==Path||LA47_0==Any||LA47_0==Flt||(LA47_0>=Int && LA47_0<=Ldt)||(LA47_0>=Lst && LA47_0<=Map)||LA47_0==Str||LA47_0==FullStopFullStop||LA47_0==LeftCurlyBracket||LA47_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:2303:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    {
                    // InternalEldmDslParser.g:2303:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    // InternalEldmDslParser.g:2304:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) )
                    {
                    // InternalEldmDslParser.g:2304:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) )
                    // InternalEldmDslParser.g:2305:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    {
                    // InternalEldmDslParser.g:2305:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    // InternalEldmDslParser.g:2306:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    {
                    // InternalEldmDslParser.g:2306:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==Match) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==Mask) ) {
                        alt46=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalEldmDslParser.g:2307:8: lv_parser_2_1= Match
                            {
                            lv_parser_2_1=(Token)match(input,Match,FOLLOW_31); if (state.failed) return current;
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
                            // InternalEldmDslParser.g:2318:8: lv_parser_2_2= Mask
                            {
                            lv_parser_2_2=(Token)match(input,Mask,FOLLOW_31); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2331:5: ( (lv_code_3_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:2332:6: (lv_code_3_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:2332:6: (lv_code_3_0= RULE_TEXT )
                    // InternalEldmDslParser.g:2333:7: lv_code_3_0= RULE_TEXT
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
                    // InternalEldmDslParser.g:2351:4: ( (lv_type_4_0= ruleTopDef ) )
                    {
                    // InternalEldmDslParser.g:2351:4: ( (lv_type_4_0= ruleTopDef ) )
                    // InternalEldmDslParser.g:2352:5: (lv_type_4_0= ruleTopDef )
                    {
                    // InternalEldmDslParser.g:2352:5: (lv_type_4_0= ruleTopDef )
                    // InternalEldmDslParser.g:2353:6: lv_type_4_0= ruleTopDef
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
    // InternalEldmDslParser.g:2375:1: entryRuleTopDef returns [EObject current=null] : iv_ruleTopDef= ruleTopDef EOF ;
    public final EObject entryRuleTopDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopDef = null;


        try {
            // InternalEldmDslParser.g:2375:47: (iv_ruleTopDef= ruleTopDef EOF )
            // InternalEldmDslParser.g:2376:2: iv_ruleTopDef= ruleTopDef EOF
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
    // InternalEldmDslParser.g:2382:1: ruleTopDef returns [EObject current=null] : (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef ) ;
    public final EObject ruleTopDef() throws RecognitionException {
        EObject current = null;

        EObject this_ElementDef_0 = null;

        EObject this_EnumDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2388:2: ( (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef ) )
            // InternalEldmDslParser.g:2389:2: (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef )
            {
            // InternalEldmDslParser.g:2389:2: (this_ElementDef_0= ruleElementDef | this_EnumDef_1= ruleEnumDef )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Bool||LA48_0==Path||LA48_0==Any||LA48_0==Flt||(LA48_0>=Int && LA48_0<=Ldt)||(LA48_0>=Lst && LA48_0<=Map)||LA48_0==Str||LA48_0==FullStopFullStop||LA48_0==LeftCurlyBracket||LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==Enum) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==Colon||LA48_2==LeftCurlyBracket) ) {
                    alt48=2;
                }
                else if ( (LA48_2==EOF||LA48_2==Typedef||LA48_2==Let||LA48_2==Var||LA48_2==RULE_END||LA48_2==RULE_ID) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalEldmDslParser.g:2390:3: this_ElementDef_0= ruleElementDef
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
                    // InternalEldmDslParser.g:2399:3: this_EnumDef_1= ruleEnumDef
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
    // InternalEldmDslParser.g:2411:1: entryRuleElementDef returns [EObject current=null] : iv_ruleElementDef= ruleElementDef EOF ;
    public final EObject entryRuleElementDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDef = null;


        try {
            // InternalEldmDslParser.g:2411:51: (iv_ruleElementDef= ruleElementDef EOF )
            // InternalEldmDslParser.g:2412:2: iv_ruleElementDef= ruleElementDef EOF
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
    // InternalEldmDslParser.g:2418:1: ruleElementDef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef ) ;
    public final EObject ruleElementDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_InferredDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2424:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef ) )
            // InternalEldmDslParser.g:2425:2: ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef )
            {
            // InternalEldmDslParser.g:2425:2: ( ( (otherlv_0= RULE_ID ) ) | this_InferredDef_1= ruleInferredDef )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=Bool && LA49_0<=Enum)||LA49_0==Path||LA49_0==Any||LA49_0==Flt||(LA49_0>=Int && LA49_0<=Ldt)||(LA49_0>=Lst && LA49_0<=Map)||LA49_0==Str||LA49_0==FullStopFullStop||LA49_0==LeftCurlyBracket) ) {
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
                    // InternalEldmDslParser.g:2426:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:2426:3: ( (otherlv_0= RULE_ID ) )
                    // InternalEldmDslParser.g:2427:4: (otherlv_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2427:4: (otherlv_0= RULE_ID )
                    // InternalEldmDslParser.g:2428:5: otherlv_0= RULE_ID
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
                    // InternalEldmDslParser.g:2440:3: this_InferredDef_1= ruleInferredDef
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
    // InternalEldmDslParser.g:2452:1: entryRuleInferredDef returns [EObject current=null] : iv_ruleInferredDef= ruleInferredDef EOF ;
    public final EObject entryRuleInferredDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInferredDef = null;


        try {
            // InternalEldmDslParser.g:2452:52: (iv_ruleInferredDef= ruleInferredDef EOF )
            // InternalEldmDslParser.g:2453:2: iv_ruleInferredDef= ruleInferredDef EOF
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
    // InternalEldmDslParser.g:2459:1: ruleInferredDef returns [EObject current=null] : ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef ) ;
    public final EObject ruleInferredDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_native_0_0 = null;

        EObject this_ListDef_1 = null;

        EObject this_MapDef_2 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2465:2: ( ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef ) )
            // InternalEldmDslParser.g:2466:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef )
            {
            // InternalEldmDslParser.g:2466:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef )
            int alt50=3;
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
                alt50=1;
                }
                break;
            case FullStopFullStop:
                {
                alt50=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalEldmDslParser.g:2467:3: ( (lv_native_0_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:2467:3: ( (lv_native_0_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:2468:4: (lv_native_0_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:2468:4: (lv_native_0_0= ruleNativeDef )
                    // InternalEldmDslParser.g:2469:5: lv_native_0_0= ruleNativeDef
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
                    // InternalEldmDslParser.g:2487:3: this_ListDef_1= ruleListDef
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
                    // InternalEldmDslParser.g:2496:3: this_MapDef_2= ruleMapDef
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


    // $ANTLR start "entryRuleMapDef"
    // InternalEldmDslParser.g:2508:1: entryRuleMapDef returns [EObject current=null] : iv_ruleMapDef= ruleMapDef EOF ;
    public final EObject entryRuleMapDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapDef = null;


        try {
            // InternalEldmDslParser.g:2508:47: (iv_ruleMapDef= ruleMapDef EOF )
            // InternalEldmDslParser.g:2509:2: iv_ruleMapDef= ruleMapDef EOF
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
    // InternalEldmDslParser.g:2515:1: ruleMapDef returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) ) ;
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
            // InternalEldmDslParser.g:2521:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:2522:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:2522:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LeftCurlyBracket) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_ID) && (synpred9_InternalEldmDslParser())) {
                    alt58=1;
                }
                else if ( (LA58_1==Comma) && (synpred9_InternalEldmDslParser())) {
                    alt58=1;
                }
                else if ( (LA58_1==RightCurlyBracket) && (synpred9_InternalEldmDslParser())) {
                    alt58=1;
                }
                else if ( (LA58_1==RULE_BEGIN) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalEldmDslParser.g:2523:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:2523:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:2524:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2554:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket )
                    // InternalEldmDslParser.g:2555:5: () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )? otherlv_7= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2555:5: ()
                    // InternalEldmDslParser.g:2556:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapDefAccess().getMapDefAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2566:5: ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalEldmDslParser.g:2567:6: ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2567:6: ( (lv_defs_2_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2568:7: (lv_defs_2_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2568:7: (lv_defs_2_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2569:8: lv_defs_2_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_50);
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

                            // InternalEldmDslParser.g:2586:6: (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==Comma) ) {
                                    int LA51_1 = input.LA(2);

                                    if ( (LA51_1==RULE_ID) ) {
                                        alt51=1;
                                    }


                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2587:7: otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:2591:7: ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2592:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2592:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2593:9: lv_defs_4_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_50);
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
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2612:5: (otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==Comma) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalEldmDslParser.g:2613:6: otherlv_5= Comma ( (lv_ext_6_0= QuestionMark ) )
                            {
                            otherlv_5=(Token)match(input,Comma,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_3_0());
                              					
                            }
                            // InternalEldmDslParser.g:2617:6: ( (lv_ext_6_0= QuestionMark ) )
                            // InternalEldmDslParser.g:2618:7: (lv_ext_6_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:2618:7: (lv_ext_6_0= QuestionMark )
                            // InternalEldmDslParser.g:2619:8: lv_ext_6_0= QuestionMark
                            {
                            lv_ext_6_0=(Token)match(input,QuestionMark,FOLLOW_52); if (state.failed) return current;
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
                    // InternalEldmDslParser.g:2639:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2639:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket )
                    // InternalEldmDslParser.g:2640:4: () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_15_0= QuestionMark ) )? this_END_16= RULE_END otherlv_17= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2640:4: ()
                    // InternalEldmDslParser.g:2641:5: 
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
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_10, grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:2655:4: ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_ID) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalEldmDslParser.g:2656:5: ( (lv_defs_11_0= ruleMapEntryDef ) ) ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2656:5: ( (lv_defs_11_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2657:6: (lv_defs_11_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2657:6: (lv_defs_11_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2658:7: lv_defs_11_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_54);
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

                            // InternalEldmDslParser.g:2675:5: ( (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==EOF||(LA55_0>=Definitions && LA55_0<=PlugDsl)||LA55_0==Import||LA55_0==Catch||LA55_0==Def||LA55_0==Out||LA55_0==In||(LA55_0>=LineFeed && LA55_0<=CarriageReturn)||LA55_0==Comma||LA55_0==RULE_ID) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2676:6: (otherlv_12= Comma )? ruleBREAK ( (lv_defs_14_0= ruleMapEntryDef ) )
                            	    {
                            	    // InternalEldmDslParser.g:2676:6: (otherlv_12= Comma )?
                            	    int alt54=2;
                            	    int LA54_0 = input.LA(1);

                            	    if ( (LA54_0==Comma) ) {
                            	        alt54=1;
                            	    }
                            	    switch (alt54) {
                            	        case 1 :
                            	            // InternalEldmDslParser.g:2677:7: otherlv_12= Comma
                            	            {
                            	            otherlv_12=(Token)match(input,Comma,FOLLOW_55); if (state.failed) return current;
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
                            	    // InternalEldmDslParser.g:2689:6: ( (lv_defs_14_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2690:7: (lv_defs_14_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2690:7: (lv_defs_14_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2691:8: lv_defs_14_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_2_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_54);
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
                            	    break loop55;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2710:4: ( (lv_ext_15_0= QuestionMark ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==QuestionMark) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalEldmDslParser.g:2711:5: (lv_ext_15_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:2711:5: (lv_ext_15_0= QuestionMark )
                            // InternalEldmDslParser.g:2712:6: lv_ext_15_0= QuestionMark
                            {
                            lv_ext_15_0=(Token)match(input,QuestionMark,FOLLOW_56); if (state.failed) return current;
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

                    this_END_16=(Token)match(input,RULE_END,FOLLOW_52); if (state.failed) return current;
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
    // InternalEldmDslParser.g:2737:1: entryRuleMapEntryDef returns [EObject current=null] : iv_ruleMapEntryDef= ruleMapEntryDef EOF ;
    public final EObject entryRuleMapEntryDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryDef = null;


        try {
            // InternalEldmDslParser.g:2737:52: (iv_ruleMapEntryDef= ruleMapEntryDef EOF )
            // InternalEldmDslParser.g:2738:2: iv_ruleMapEntryDef= ruleMapEntryDef EOF
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
    // InternalEldmDslParser.g:2744:1: ruleMapEntryDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) ;
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
            // InternalEldmDslParser.g:2750:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) )
            // InternalEldmDslParser.g:2751:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            {
            // InternalEldmDslParser.g:2751:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            // InternalEldmDslParser.g:2752:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            {
            // InternalEldmDslParser.g:2752:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2753:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2753:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2754:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2770:3: ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            int alt60=3;
            switch ( input.LA(1) ) {
                case QuestionMark:
                    {
                    int LA60_1 = input.LA(2);

                    if ( (LA60_1==Colon) ) {
                        alt60=1;
                    }
                    }
                    break;
                case Colon:
                    {
                    alt60=1;
                    }
                    break;
                case EqualsSign:
                    {
                    alt60=2;
                    }
                    break;
            }

            switch (alt60) {
                case 1 :
                    // InternalEldmDslParser.g:2771:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    {
                    // InternalEldmDslParser.g:2771:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    // InternalEldmDslParser.g:2772:5: ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:2772:5: ( (lv_opt_1_0= QuestionMark ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==QuestionMark) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalEldmDslParser.g:2773:6: (lv_opt_1_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:2773:6: (lv_opt_1_0= QuestionMark )
                            // InternalEldmDslParser.g:2774:7: lv_opt_1_0= QuestionMark
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

                    otherlv_2=(Token)match(input,Colon,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMapEntryDefAccess().getColonKeyword_1_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2790:5: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:2791:6: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:2791:6: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:2792:7: lv_type_3_0= ruleElementDef
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
                    // InternalEldmDslParser.g:2811:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    {
                    // InternalEldmDslParser.g:2811:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    // InternalEldmDslParser.g:2812:5: ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:2812:5: ( (lv_opt_4_0= EqualsSign ) )
                    // InternalEldmDslParser.g:2813:6: (lv_opt_4_0= EqualsSign )
                    {
                    // InternalEldmDslParser.g:2813:6: (lv_opt_4_0= EqualsSign )
                    // InternalEldmDslParser.g:2814:7: lv_opt_4_0= EqualsSign
                    {
                    lv_opt_4_0=(Token)match(input,EqualsSign,FOLLOW_58); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2826:5: ( (lv_value_5_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:2827:6: (lv_value_5_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:2827:6: (lv_value_5_0= ruleLiteral )
                    // InternalEldmDslParser.g:2828:7: lv_value_5_0= ruleLiteral
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
    // InternalEldmDslParser.g:2851:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalEldmDslParser.g:2851:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalEldmDslParser.g:2852:2: iv_ruleListDef= ruleListDef EOF
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
    // InternalEldmDslParser.g:2858:1: ruleListDef returns [EObject current=null] : ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2864:2: ( ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) )
            // InternalEldmDslParser.g:2865:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            {
            // InternalEldmDslParser.g:2865:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            // InternalEldmDslParser.g:2866:3: () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) )
            {
            // InternalEldmDslParser.g:2866:3: ()
            // InternalEldmDslParser.g:2867:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListDefAccess().getListDefAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListDefAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalEldmDslParser.g:2877:3: ( (lv_type_2_0= ruleElementDef ) )
            // InternalEldmDslParser.g:2878:4: (lv_type_2_0= ruleElementDef )
            {
            // InternalEldmDslParser.g:2878:4: (lv_type_2_0= ruleElementDef )
            // InternalEldmDslParser.g:2879:5: lv_type_2_0= ruleElementDef
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
    // InternalEldmDslParser.g:2900:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // InternalEldmDslParser.g:2900:48: (iv_ruleEnumDef= ruleEnumDef EOF )
            // InternalEldmDslParser.g:2901:2: iv_ruleEnumDef= ruleEnumDef EOF
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
    // InternalEldmDslParser.g:2907:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) ;
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
            // InternalEldmDslParser.g:2913:2: ( (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) )
            // InternalEldmDslParser.g:2914:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            {
            // InternalEldmDslParser.g:2914:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            // InternalEldmDslParser.g:2915:3: otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Enum,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2919:3: ( (lv_type_1_0= ruleMapDef ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LeftCurlyBracket) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEldmDslParser.g:2920:4: (lv_type_1_0= ruleMapDef )
                    {
                    // InternalEldmDslParser.g:2920:4: (lv_type_1_0= ruleMapDef )
                    // InternalEldmDslParser.g:2921:5: lv_type_1_0= ruleMapDef
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
            // InternalEldmDslParser.g:2946:3: ( (lv_defs_4_0= ruleEnumItemDef ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalEldmDslParser.g:2947:4: (lv_defs_4_0= ruleEnumItemDef )
            	    {
            	    // InternalEldmDslParser.g:2947:4: (lv_defs_4_0= ruleEnumItemDef )
            	    // InternalEldmDslParser.g:2948:5: lv_defs_4_0= ruleEnumItemDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_59);
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
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // InternalEldmDslParser.g:2973:1: entryRuleEnumItemDef returns [EObject current=null] : iv_ruleEnumItemDef= ruleEnumItemDef EOF ;
    public final EObject entryRuleEnumItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItemDef = null;


        try {
            // InternalEldmDslParser.g:2973:52: (iv_ruleEnumItemDef= ruleEnumItemDef EOF )
            // InternalEldmDslParser.g:2974:2: iv_ruleEnumItemDef= ruleEnumItemDef EOF
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
    // InternalEldmDslParser.g:2980:1: ruleEnumItemDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) ;
    public final EObject ruleEnumItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2986:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) )
            // InternalEldmDslParser.g:2987:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            {
            // InternalEldmDslParser.g:2987:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            // InternalEldmDslParser.g:2988:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )?
            {
            // InternalEldmDslParser.g:2988:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2989:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2989:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2990:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
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

            // InternalEldmDslParser.g:3006:3: ( (lv_value_1_0= ruleMapLiteral ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LeftCurlyBracket) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalEldmDslParser.g:3007:4: (lv_value_1_0= ruleMapLiteral )
                    {
                    // InternalEldmDslParser.g:3007:4: (lv_value_1_0= ruleMapLiteral )
                    // InternalEldmDslParser.g:3008:5: lv_value_1_0= ruleMapLiteral
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
    // InternalEldmDslParser.g:3029:1: entryRuleNativeDef returns [String current=null] : iv_ruleNativeDef= ruleNativeDef EOF ;
    public final String entryRuleNativeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNativeDef = null;


        try {
            // InternalEldmDslParser.g:3029:49: (iv_ruleNativeDef= ruleNativeDef EOF )
            // InternalEldmDslParser.g:3030:2: iv_ruleNativeDef= ruleNativeDef EOF
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
    // InternalEldmDslParser.g:3036:1: ruleNativeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) ;
    public final AntlrDatatypeRuleToken ruleNativeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3042:2: ( (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) )
            // InternalEldmDslParser.g:3043:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            {
            // InternalEldmDslParser.g:3043:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            int alt64=12;
            switch ( input.LA(1) ) {
            case Any:
                {
                alt64=1;
                }
                break;
            case Path:
                {
                alt64=2;
                }
                break;
            case Bool:
                {
                alt64=3;
                }
                break;
            case Str:
                {
                alt64=4;
                }
                break;
            case Int:
                {
                alt64=5;
                }
                break;
            case Flt:
                {
                alt64=6;
                }
                break;
            case Lda:
                {
                alt64=7;
                }
                break;
            case Ltm:
                {
                alt64=8;
                }
                break;
            case Ldt:
                {
                alt64=9;
                }
                break;
            case Map:
                {
                alt64=10;
                }
                break;
            case Lst:
                {
                alt64=11;
                }
                break;
            case Enum:
                {
                alt64=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalEldmDslParser.g:3044:3: kw= Any
                    {
                    kw=(Token)match(input,Any,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getAnyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3050:3: kw= Path
                    {
                    kw=(Token)match(input,Path,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getPathKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:3056:3: kw= Bool
                    {
                    kw=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getBoolKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:3062:3: kw= Str
                    {
                    kw=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getStrKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:3068:3: kw= Int
                    {
                    kw=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getIntKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:3074:3: kw= Flt
                    {
                    kw=(Token)match(input,Flt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getFltKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:3080:3: kw= Lda
                    {
                    kw=(Token)match(input,Lda,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdaKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:3086:3: kw= Ltm
                    {
                    kw=(Token)match(input,Ltm,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLtmKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:3092:3: kw= Ldt
                    {
                    kw=(Token)match(input,Ldt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdtKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEldmDslParser.g:3098:3: kw= Map
                    {
                    kw=(Token)match(input,Map,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getMapKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEldmDslParser.g:3104:3: kw= Lst
                    {
                    kw=(Token)match(input,Lst,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLstKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEldmDslParser.g:3110:3: kw= Enum
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
    // InternalEldmDslParser.g:3119:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEldmDslParser.g:3119:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEldmDslParser.g:3120:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEldmDslParser.g:3126:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral ) ;
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
            // InternalEldmDslParser.g:3132:2: ( (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral ) )
            // InternalEldmDslParser.g:3133:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral )
            {
            // InternalEldmDslParser.g:3133:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral )
            int alt65=11;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalEldmDslParser.g:3134:3: this_BoolLiteral_0= ruleBoolLiteral
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
                    // InternalEldmDslParser.g:3143:3: this_StrLiteral_1= ruleStrLiteral
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
                    // InternalEldmDslParser.g:3152:3: this_IntLiteral_2= ruleIntLiteral
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
                    // InternalEldmDslParser.g:3161:3: this_FltLiteral_3= ruleFltLiteral
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
                    // InternalEldmDslParser.g:3170:3: this_DateLiteral_4= ruleDateLiteral
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
                    // InternalEldmDslParser.g:3179:3: this_TimeLiteral_5= ruleTimeLiteral
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
                    // InternalEldmDslParser.g:3188:3: this_DateTimeLiteral_6= ruleDateTimeLiteral
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
                    // InternalEldmDslParser.g:3197:3: this_PathLiteral_7= rulePathLiteral
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
                    // InternalEldmDslParser.g:3206:3: this_ListLiteral_8= ruleListLiteral
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
                    // InternalEldmDslParser.g:3215:3: this_MapLiteral_9= ruleMapLiteral
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
                    // InternalEldmDslParser.g:3224:3: this_PatternLiteral_10= rulePatternLiteral
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
    // InternalEldmDslParser.g:3236:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalEldmDslParser.g:3236:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalEldmDslParser.g:3237:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
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
    // InternalEldmDslParser.g:3243:1: ruleBoolLiteral returns [EObject current=null] : ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3249:2: ( ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) )
            // InternalEldmDslParser.g:3250:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            {
            // InternalEldmDslParser.g:3250:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            // InternalEldmDslParser.g:3251:3: () (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            {
            // InternalEldmDslParser.g:3251:3: ()
            // InternalEldmDslParser.g:3252:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3258:3: (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==False) ) {
                alt66=1;
            }
            else if ( (LA66_0==True) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalEldmDslParser.g:3259:4: otherlv_1= False
                    {
                    otherlv_1=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3264:4: ( (lv_value_2_0= True ) )
                    {
                    // InternalEldmDslParser.g:3264:4: ( (lv_value_2_0= True ) )
                    // InternalEldmDslParser.g:3265:5: (lv_value_2_0= True )
                    {
                    // InternalEldmDslParser.g:3265:5: (lv_value_2_0= True )
                    // InternalEldmDslParser.g:3266:6: lv_value_2_0= True
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
    // InternalEldmDslParser.g:3283:1: entryRuleStrLiteral returns [EObject current=null] : iv_ruleStrLiteral= ruleStrLiteral EOF ;
    public final EObject entryRuleStrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrLiteral = null;


        try {
            // InternalEldmDslParser.g:3283:51: (iv_ruleStrLiteral= ruleStrLiteral EOF )
            // InternalEldmDslParser.g:3284:2: iv_ruleStrLiteral= ruleStrLiteral EOF
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
    // InternalEldmDslParser.g:3290:1: ruleStrLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT ) ) ;
    public final EObject ruleStrLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3296:2: ( ( (lv_value_0_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3297:2: ( (lv_value_0_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3297:2: ( (lv_value_0_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3298:3: (lv_value_0_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3298:3: (lv_value_0_0= RULE_TEXT )
            // InternalEldmDslParser.g:3299:4: lv_value_0_0= RULE_TEXT
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
    // InternalEldmDslParser.g:3318:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalEldmDslParser.g:3318:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalEldmDslParser.g:3319:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalEldmDslParser.g:3325:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3331:2: ( ( (lv_value_0_0= RULE_NATURAL ) ) )
            // InternalEldmDslParser.g:3332:2: ( (lv_value_0_0= RULE_NATURAL ) )
            {
            // InternalEldmDslParser.g:3332:2: ( (lv_value_0_0= RULE_NATURAL ) )
            // InternalEldmDslParser.g:3333:3: (lv_value_0_0= RULE_NATURAL )
            {
            // InternalEldmDslParser.g:3333:3: (lv_value_0_0= RULE_NATURAL )
            // InternalEldmDslParser.g:3334:4: lv_value_0_0= RULE_NATURAL
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
    // InternalEldmDslParser.g:3353:1: entryRuleFltLiteral returns [EObject current=null] : iv_ruleFltLiteral= ruleFltLiteral EOF ;
    public final EObject entryRuleFltLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFltLiteral = null;


        try {
            // InternalEldmDslParser.g:3353:51: (iv_ruleFltLiteral= ruleFltLiteral EOF )
            // InternalEldmDslParser.g:3354:2: iv_ruleFltLiteral= ruleFltLiteral EOF
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
    // InternalEldmDslParser.g:3360:1: ruleFltLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFltLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3366:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalEldmDslParser.g:3367:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalEldmDslParser.g:3367:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalEldmDslParser.g:3368:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalEldmDslParser.g:3368:3: (lv_value_0_0= RULE_FLOAT )
            // InternalEldmDslParser.g:3369:4: lv_value_0_0= RULE_FLOAT
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
    // InternalEldmDslParser.g:3388:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // InternalEldmDslParser.g:3388:52: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // InternalEldmDslParser.g:3389:2: iv_ruleDateLiteral= ruleDateLiteral EOF
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
    // InternalEldmDslParser.g:3395:1: ruleDateLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE ) ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3401:2: ( ( (lv_value_0_0= RULE_DATE ) ) )
            // InternalEldmDslParser.g:3402:2: ( (lv_value_0_0= RULE_DATE ) )
            {
            // InternalEldmDslParser.g:3402:2: ( (lv_value_0_0= RULE_DATE ) )
            // InternalEldmDslParser.g:3403:3: (lv_value_0_0= RULE_DATE )
            {
            // InternalEldmDslParser.g:3403:3: (lv_value_0_0= RULE_DATE )
            // InternalEldmDslParser.g:3404:4: lv_value_0_0= RULE_DATE
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
    // InternalEldmDslParser.g:3423:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3423:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEldmDslParser.g:3424:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
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
    // InternalEldmDslParser.g:3430:1: ruleTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TIME ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3436:2: ( ( (lv_value_0_0= RULE_TIME ) ) )
            // InternalEldmDslParser.g:3437:2: ( (lv_value_0_0= RULE_TIME ) )
            {
            // InternalEldmDslParser.g:3437:2: ( (lv_value_0_0= RULE_TIME ) )
            // InternalEldmDslParser.g:3438:3: (lv_value_0_0= RULE_TIME )
            {
            // InternalEldmDslParser.g:3438:3: (lv_value_0_0= RULE_TIME )
            // InternalEldmDslParser.g:3439:4: lv_value_0_0= RULE_TIME
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
    // InternalEldmDslParser.g:3458:1: entryRuleDateTimeLiteral returns [EObject current=null] : iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF ;
    public final EObject entryRuleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3458:56: (iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF )
            // InternalEldmDslParser.g:3459:2: iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF
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
    // InternalEldmDslParser.g:3465:1: ruleDateTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATETIME ) ) ;
    public final EObject ruleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3471:2: ( ( (lv_value_0_0= RULE_DATETIME ) ) )
            // InternalEldmDslParser.g:3472:2: ( (lv_value_0_0= RULE_DATETIME ) )
            {
            // InternalEldmDslParser.g:3472:2: ( (lv_value_0_0= RULE_DATETIME ) )
            // InternalEldmDslParser.g:3473:3: (lv_value_0_0= RULE_DATETIME )
            {
            // InternalEldmDslParser.g:3473:3: (lv_value_0_0= RULE_DATETIME )
            // InternalEldmDslParser.g:3474:4: lv_value_0_0= RULE_DATETIME
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
    // InternalEldmDslParser.g:3493:1: entryRulePathLiteral returns [EObject current=null] : iv_rulePathLiteral= rulePathLiteral EOF ;
    public final EObject entryRulePathLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathLiteral = null;


        try {
            // InternalEldmDslParser.g:3493:52: (iv_rulePathLiteral= rulePathLiteral EOF )
            // InternalEldmDslParser.g:3494:2: iv_rulePathLiteral= rulePathLiteral EOF
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
    // InternalEldmDslParser.g:3500:1: rulePathLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_PATH ) ) ;
    public final EObject rulePathLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3506:2: ( ( (lv_value_0_0= RULE_PATH ) ) )
            // InternalEldmDslParser.g:3507:2: ( (lv_value_0_0= RULE_PATH ) )
            {
            // InternalEldmDslParser.g:3507:2: ( (lv_value_0_0= RULE_PATH ) )
            // InternalEldmDslParser.g:3508:3: (lv_value_0_0= RULE_PATH )
            {
            // InternalEldmDslParser.g:3508:3: (lv_value_0_0= RULE_PATH )
            // InternalEldmDslParser.g:3509:4: lv_value_0_0= RULE_PATH
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
    // InternalEldmDslParser.g:3528:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalEldmDslParser.g:3528:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalEldmDslParser.g:3529:2: iv_ruleListLiteral= ruleListLiteral EOF
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
    // InternalEldmDslParser.g:3535:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vals_2_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3541:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEldmDslParser.g:3542:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEldmDslParser.g:3542:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEldmDslParser.g:3543:3: () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEldmDslParser.g:3543:3: ()
            // InternalEldmDslParser.g:3544:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3554:3: ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==False||(LA68_0>=Bool && LA68_0<=Enum)||(LA68_0>=Path && LA68_0<=True)||LA68_0==Any||LA68_0==Flt||(LA68_0>=Int && LA68_0<=Ldt)||(LA68_0>=Lst && LA68_0<=Map)||LA68_0==Str||LA68_0==LeftSquareBracket||LA68_0==LeftCurlyBracket||(LA68_0>=RULE_PATH && LA68_0<=RULE_ID)||(LA68_0>=RULE_NATURAL && LA68_0<=RULE_TEXT)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalEldmDslParser.g:3555:4: ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    {
                    // InternalEldmDslParser.g:3555:4: ( (lv_vals_2_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:3556:5: (lv_vals_2_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:3556:5: (lv_vals_2_0= ruleLiteral )
                    // InternalEldmDslParser.g:3557:6: lv_vals_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
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

                    // InternalEldmDslParser.g:3574:4: (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==Comma) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:3575:5: otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_58); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEldmDslParser.g:3579:5: ( (lv_vals_4_0= ruleLiteral ) )
                    	    // InternalEldmDslParser.g:3580:6: (lv_vals_4_0= ruleLiteral )
                    	    {
                    	    // InternalEldmDslParser.g:3580:6: (lv_vals_4_0= ruleLiteral )
                    	    // InternalEldmDslParser.g:3581:7: lv_vals_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_62);
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
                    	    break loop67;
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
    // InternalEldmDslParser.g:3608:1: entryRuleMapLiteral returns [EObject current=null] : iv_ruleMapLiteral= ruleMapLiteral EOF ;
    public final EObject entryRuleMapLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteral = null;


        try {
            // InternalEldmDslParser.g:3608:51: (iv_ruleMapLiteral= ruleMapLiteral EOF )
            // InternalEldmDslParser.g:3609:2: iv_ruleMapLiteral= ruleMapLiteral EOF
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
    // InternalEldmDslParser.g:3615:1: ruleMapLiteral returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) ;
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
            // InternalEldmDslParser.g:3621:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:3622:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:3622:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==LeftCurlyBracket) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==RULE_BEGIN) ) {
                    alt73=2;
                }
                else if ( (LA73_1==RULE_ID) && (synpred10_InternalEldmDslParser())) {
                    alt73=1;
                }
                else if ( (LA73_1==RightCurlyBracket) && (synpred10_InternalEldmDslParser())) {
                    alt73=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalEldmDslParser.g:3623:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:3623:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:3624:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3646:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    // InternalEldmDslParser.g:3647:5: () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3647:5: ()
                    // InternalEldmDslParser.g:3648:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapLiteralAccess().getMapLiteralAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:3658:5: ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_ID) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalEldmDslParser.g:3659:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3659:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3660:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3660:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3661:8: lv_entries_2_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_50);
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

                            // InternalEldmDslParser.g:3678:6: (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==Comma) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3679:7: otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:3683:7: ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3684:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3684:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3685:9: lv_entries_4_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_50);
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
                            	    break loop69;
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
                    // InternalEldmDslParser.g:3711:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3711:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    // InternalEldmDslParser.g:3712:4: () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3712:4: ()
                    // InternalEldmDslParser.g:3713:5: 
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
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getMapLiteralAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:3727:4: ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==RULE_ID) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalEldmDslParser.g:3728:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3728:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3729:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3729:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3730:7: lv_entries_9_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_64);
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

                            // InternalEldmDslParser.g:3747:5: ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==EOF||(LA71_0>=Definitions && LA71_0<=PlugDsl)||LA71_0==Import||LA71_0==Catch||LA71_0==Def||LA71_0==Out||LA71_0==In||(LA71_0>=LineFeed && LA71_0<=CarriageReturn)||LA71_0==RULE_ID) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3748:6: ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) )
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
                            	    // InternalEldmDslParser.g:3755:6: ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3756:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3756:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3757:8: lv_entries_11_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_64);
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
                            	    break loop71;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_52); if (state.failed) return current;
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
    // InternalEldmDslParser.g:3789:1: entryRuleMapEntryLiteral returns [EObject current=null] : iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF ;
    public final EObject entryRuleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryLiteral = null;


        try {
            // InternalEldmDslParser.g:3789:56: (iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF )
            // InternalEldmDslParser.g:3790:2: iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF
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
    // InternalEldmDslParser.g:3796:1: ruleMapEntryLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3802:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalEldmDslParser.g:3803:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalEldmDslParser.g:3803:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalEldmDslParser.g:3804:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalEldmDslParser.g:3804:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:3805:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:3805:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:3806:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3826:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalEldmDslParser.g:3827:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalEldmDslParser.g:3827:4: (lv_value_2_0= ruleLiteral )
            // InternalEldmDslParser.g:3828:5: lv_value_2_0= ruleLiteral
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
    // InternalEldmDslParser.g:3849:1: entryRulePatternLiteral returns [EObject current=null] : iv_rulePatternLiteral= rulePatternLiteral EOF ;
    public final EObject entryRulePatternLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternLiteral = null;


        try {
            // InternalEldmDslParser.g:3849:55: (iv_rulePatternLiteral= rulePatternLiteral EOF )
            // InternalEldmDslParser.g:3850:2: iv_rulePatternLiteral= rulePatternLiteral EOF
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
    // InternalEldmDslParser.g:3856:1: rulePatternLiteral returns [EObject current=null] : ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) ;
    public final EObject rulePatternLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        AntlrDatatypeRuleToken lv_native_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3862:2: ( ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) )
            // InternalEldmDslParser.g:3863:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            {
            // InternalEldmDslParser.g:3863:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3864:3: () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3864:3: ()
            // InternalEldmDslParser.g:3865:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3871:3: ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=Bool && LA74_0<=Enum)||LA74_0==Path||LA74_0==Any||LA74_0==Flt||(LA74_0>=Int && LA74_0<=Ldt)||(LA74_0>=Lst && LA74_0<=Map)||LA74_0==Str) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalEldmDslParser.g:3872:4: ( (lv_native_1_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:3872:4: ( (lv_native_1_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:3873:5: (lv_native_1_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:3873:5: (lv_native_1_0= ruleNativeDef )
                    // InternalEldmDslParser.g:3874:6: lv_native_1_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternLiteralAccess().getNativeNativeDefParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_65);
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
                    // InternalEldmDslParser.g:3892:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:3892:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEldmDslParser.g:3893:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEldmDslParser.g:3893:5: (otherlv_2= RULE_ID )
                    // InternalEldmDslParser.g:3894:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternLiteralRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPatternLiteralAccess().getRefDefinitionCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,CommercialAt,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2());
              		
            }
            // InternalEldmDslParser.g:3910:3: ( (lv_text_4_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3911:4: (lv_text_4_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3911:4: (lv_text_4_0= RULE_TEXT )
            // InternalEldmDslParser.g:3912:5: lv_text_4_0= RULE_TEXT
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
    // InternalEldmDslParser.g:3932:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalEldmDslParser.g:3932:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalEldmDslParser.g:3933:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalEldmDslParser.g:3939:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LineFeed | kw= CarriageReturn )* ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3945:2: ( (kw= LineFeed | kw= CarriageReturn )* )
            // InternalEldmDslParser.g:3946:2: (kw= LineFeed | kw= CarriageReturn )*
            {
            // InternalEldmDslParser.g:3946:2: (kw= LineFeed | kw= CarriageReturn )*
            loop75:
            do {
                int alt75=3;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==LineFeed) ) {
                    alt75=1;
                }
                else if ( (LA75_0==CarriageReturn) ) {
                    alt75=2;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalEldmDslParser.g:3947:3: kw= LineFeed
            	    {
            	    kw=(Token)match(input,LineFeed,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getLineFeedKeyword_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEldmDslParser.g:3953:3: kw= CarriageReturn
            	    {
            	    kw=(Token)match(input,CarriageReturn,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
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
        // InternalEldmDslParser.g:1188:5: ( ( () ( ( Or ) ) ) )
        // InternalEldmDslParser.g:1188:6: ( () ( ( Or ) ) )
        {
        // InternalEldmDslParser.g:1188:6: ( () ( ( Or ) ) )
        // InternalEldmDslParser.g:1189:6: () ( ( Or ) )
        {
        // InternalEldmDslParser.g:1189:6: ()
        // InternalEldmDslParser.g:1190:6: 
        {
        }

        // InternalEldmDslParser.g:1191:6: ( ( Or ) )
        // InternalEldmDslParser.g:1192:7: ( Or )
        {
        // InternalEldmDslParser.g:1192:7: ( Or )
        // InternalEldmDslParser.g:1193:8: Or
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
        // InternalEldmDslParser.g:1271:5: ( ( () ( ( And ) ) ) )
        // InternalEldmDslParser.g:1271:6: ( () ( ( And ) ) )
        {
        // InternalEldmDslParser.g:1271:6: ( () ( ( And ) ) )
        // InternalEldmDslParser.g:1272:6: () ( ( And ) )
        {
        // InternalEldmDslParser.g:1272:6: ()
        // InternalEldmDslParser.g:1273:6: 
        {
        }

        // InternalEldmDslParser.g:1274:6: ( ( And ) )
        // InternalEldmDslParser.g:1275:7: ( And )
        {
        // InternalEldmDslParser.g:1275:7: ( And )
        // InternalEldmDslParser.g:1276:8: And
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
        // InternalEldmDslParser.g:1354:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )
        // InternalEldmDslParser.g:1354:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        {
        // InternalEldmDslParser.g:1354:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        // InternalEldmDslParser.g:1355:6: () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        {
        // InternalEldmDslParser.g:1355:6: ()
        // InternalEldmDslParser.g:1356:6: 
        {
        }

        // InternalEldmDslParser.g:1357:6: ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        // InternalEldmDslParser.g:1358:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        {
        // InternalEldmDslParser.g:1358:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        // InternalEldmDslParser.g:1359:8: ( EqualsSignEqualsSign | ExclamationMarkEqualsSign )
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
        // InternalEldmDslParser.g:1455:6: ( ( () ( ( Is ) ) ) )
        // InternalEldmDslParser.g:1455:7: ( () ( ( Is ) ) )
        {
        // InternalEldmDslParser.g:1455:7: ( () ( ( Is ) ) )
        // InternalEldmDslParser.g:1456:7: () ( ( Is ) )
        {
        // InternalEldmDslParser.g:1456:7: ()
        // InternalEldmDslParser.g:1457:7: 
        {
        }

        // InternalEldmDslParser.g:1458:7: ( ( Is ) )
        // InternalEldmDslParser.g:1459:8: ( Is )
        {
        // InternalEldmDslParser.g:1459:8: ( Is )
        // InternalEldmDslParser.g:1460:9: Is
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
        // InternalEldmDslParser.g:1512:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )
        // InternalEldmDslParser.g:1512:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        {
        // InternalEldmDslParser.g:1512:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        // InternalEldmDslParser.g:1513:7: () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        {
        // InternalEldmDslParser.g:1513:7: ()
        // InternalEldmDslParser.g:1514:7: 
        {
        }

        // InternalEldmDslParser.g:1515:7: ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        // InternalEldmDslParser.g:1516:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        {
        // InternalEldmDslParser.g:1516:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        // InternalEldmDslParser.g:1517:9: ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign )
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
        // InternalEldmDslParser.g:1639:5: ( ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) ) )
        // InternalEldmDslParser.g:1639:6: ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) )
        {
        // InternalEldmDslParser.g:1639:6: ( () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) ) )
        // InternalEldmDslParser.g:1640:6: () ( ( ( PlusSign | HyphenMinus | Set | Del ) ) )
        {
        // InternalEldmDslParser.g:1640:6: ()
        // InternalEldmDslParser.g:1641:6: 
        {
        }

        // InternalEldmDslParser.g:1642:6: ( ( ( PlusSign | HyphenMinus | Set | Del ) ) )
        // InternalEldmDslParser.g:1643:7: ( ( PlusSign | HyphenMinus | Set | Del ) )
        {
        // InternalEldmDslParser.g:1643:7: ( ( PlusSign | HyphenMinus | Set | Del ) )
        // InternalEldmDslParser.g:1644:8: ( PlusSign | HyphenMinus | Set | Del )
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
        // InternalEldmDslParser.g:1765:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )
        // InternalEldmDslParser.g:1765:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalEldmDslParser.g:1765:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        // InternalEldmDslParser.g:1766:6: () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        {
        // InternalEldmDslParser.g:1766:6: ()
        // InternalEldmDslParser.g:1767:6: 
        {
        }

        // InternalEldmDslParser.g:1768:6: ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        // InternalEldmDslParser.g:1769:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        {
        // InternalEldmDslParser.g:1769:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        // InternalEldmDslParser.g:1770:8: ( Asterisk | AsteriskAsterisk | Solidus | PercentSign )
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
        // InternalEldmDslParser.g:2524:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:2524:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:2524:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket )
        // InternalEldmDslParser.g:2525:5: () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( QuestionMark ) ) )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:2525:5: ()
        // InternalEldmDslParser.g:2526:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_49); if (state.failed) return ;
        // InternalEldmDslParser.g:2528:5: ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )?
        int alt77=2;
        int LA77_0 = input.LA(1);

        if ( (LA77_0==RULE_ID) ) {
            alt77=1;
        }
        switch (alt77) {
            case 1 :
                // InternalEldmDslParser.g:2529:6: ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )*
                {
                // InternalEldmDslParser.g:2529:6: ( ( ruleMapEntryDef ) )
                // InternalEldmDslParser.g:2530:7: ( ruleMapEntryDef )
                {
                // InternalEldmDslParser.g:2530:7: ( ruleMapEntryDef )
                // InternalEldmDslParser.g:2531:8: ruleMapEntryDef
                {
                pushFollow(FOLLOW_50);
                ruleMapEntryDef();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:2534:6: ( Comma ( ( ruleMapEntryDef ) ) )*
                loop76:
                do {
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==Comma) ) {
                        int LA76_1 = input.LA(2);

                        if ( (LA76_1==RULE_ID) ) {
                            alt76=1;
                        }


                    }


                    switch (alt76) {
                	case 1 :
                	    // InternalEldmDslParser.g:2535:7: Comma ( ( ruleMapEntryDef ) )
                	    {
                	    match(input,Comma,FOLLOW_17); if (state.failed) return ;
                	    // InternalEldmDslParser.g:2536:7: ( ( ruleMapEntryDef ) )
                	    // InternalEldmDslParser.g:2537:8: ( ruleMapEntryDef )
                	    {
                	    // InternalEldmDslParser.g:2537:8: ( ruleMapEntryDef )
                	    // InternalEldmDslParser.g:2538:9: ruleMapEntryDef
                	    {
                	    pushFollow(FOLLOW_50);
                	    ruleMapEntryDef();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        // InternalEldmDslParser.g:2543:5: ( Comma ( ( QuestionMark ) ) )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==Comma) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // InternalEldmDslParser.g:2544:6: Comma ( ( QuestionMark ) )
                {
                match(input,Comma,FOLLOW_51); if (state.failed) return ;
                // InternalEldmDslParser.g:2545:6: ( ( QuestionMark ) )
                // InternalEldmDslParser.g:2546:7: ( QuestionMark )
                {
                // InternalEldmDslParser.g:2546:7: ( QuestionMark )
                // InternalEldmDslParser.g:2547:8: QuestionMark
                {
                match(input,QuestionMark,FOLLOW_52); if (state.failed) return ;

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
        // InternalEldmDslParser.g:3624:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:3624:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:3624:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        // InternalEldmDslParser.g:3625:5: () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:3625:5: ()
        // InternalEldmDslParser.g:3626:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_63); if (state.failed) return ;
        // InternalEldmDslParser.g:3628:5: ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==RULE_ID) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // InternalEldmDslParser.g:3629:6: ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )*
                {
                // InternalEldmDslParser.g:3629:6: ( ( ruleMapEntryLiteral ) )
                // InternalEldmDslParser.g:3630:7: ( ruleMapEntryLiteral )
                {
                // InternalEldmDslParser.g:3630:7: ( ruleMapEntryLiteral )
                // InternalEldmDslParser.g:3631:8: ruleMapEntryLiteral
                {
                pushFollow(FOLLOW_50);
                ruleMapEntryLiteral();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:3634:6: ( Comma ( ( ruleMapEntryLiteral ) ) )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==Comma) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // InternalEldmDslParser.g:3635:7: Comma ( ( ruleMapEntryLiteral ) )
                	    {
                	    match(input,Comma,FOLLOW_17); if (state.failed) return ;
                	    // InternalEldmDslParser.g:3636:7: ( ( ruleMapEntryLiteral ) )
                	    // InternalEldmDslParser.g:3637:8: ( ruleMapEntryLiteral )
                	    {
                	    // InternalEldmDslParser.g:3637:8: ( ruleMapEntryLiteral )
                	    // InternalEldmDslParser.g:3638:9: ruleMapEntryLiteral
                	    {
                	    pushFollow(FOLLOW_50);
                	    ruleMapEntryLiteral();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop79;
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


    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\13\13\uffff";
    static final String dfa_3s = "\1\122\13\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\2\13\2\uffff\1\13\1\1\1\uffff\1\13\2\uffff\1\13\1\uffff\3\13\1\uffff\3\13\2\uffff\1\13\37\uffff\1\11\1\uffff\1\12\5\uffff\1\10\1\13\1\uffff\1\3\1\4\1\5\1\6\1\7\1\2",
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

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3133:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_PatternLiteral_10= rulePatternLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200100200532L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200100200432L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000810000080L,0x0000000000000A00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000810000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200100200402L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000C00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x10000084EE926000L,0x0000000000000810L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200100200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000201000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x100000C4EE926000L,0x0000000000000C10L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x100000C4EE926000L,0x0000000000000810L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000084EE926000L,0x0000000000000810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00140004EE966800L,0x000000000007EC54L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200100200400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200100200400L,0x0000000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000021000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xA000450000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0280000200400002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0848002000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400080000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000084EE937000L,0x0000000000000810L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000A01L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0103000000000000L,0x0000000000000A01L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x5000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000004EE966800L,0x000000000007EC14L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000004EE966800L,0x000000000007EC1CL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0003000000000002L});

}