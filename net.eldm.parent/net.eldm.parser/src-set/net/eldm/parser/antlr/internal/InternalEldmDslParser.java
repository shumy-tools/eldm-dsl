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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Definitions", "PlugDsl", "Service", "Typedef", "Module", "False", "Match", "Bool", "Enum", "From", "Mask", "Path", "True", "And", "Any", "Def", "Flt", "Get", "Int", "Lda", "Ldt", "Let", "Lst", "Ltm", "Map", "Set", "Str", "Var", "ExclamationMarkEqualsSign", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "FullStopFullStop", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "QuestionMarkFullStop", "As", "Is", "Or", "LineFeed", "CarriageReturn", "ExclamationMark", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_PATH", "RULE_ID", "RULE_INT", "RULE_NATURAL", "RULE_FLOAT", "RULE_DATE", "RULE_TIME", "RULE_DATETIME", "RULE_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=12;
    public static final int Or=42;
    public static final int RULE_BEGIN=65;
    public static final int Var=31;
    public static final int True=16;
    public static final int False=9;
    public static final int LessThanSign=56;
    public static final int Str=30;
    public static final int PercentSign=46;
    public static final int LeftParenthesis=47;
    public static final int Bool=11;
    public static final int FullStopFullStop=35;
    public static final int RULE_TIME=73;
    public static final int RightSquareBracket=62;
    public static final int ExclamationMark=45;
    public static final int GreaterThanSign=58;
    public static final int RULE_ID=68;
    public static final int Mask=14;
    public static final int RightParenthesis=48;
    public static final int Lst=26;
    public static final int GreaterThanSignEqualsSign=38;
    public static final int RULE_PATH=67;
    public static final int EqualsSignEqualsSign=37;
    public static final int RULE_DATE=72;
    public static final int Typedef=7;
    public static final int And=17;
    public static final int PlusSign=50;
    public static final int RULE_INT=69;
    public static final int Get=21;
    public static final int AsteriskAsterisk=33;
    public static final int RULE_NATURAL=70;
    public static final int RULE_ML_COMMENT=76;
    public static final int RULE_TEXT=75;
    public static final int LeftSquareBracket=61;
    public static final int Module=8;
    public static final int Map=28;
    public static final int RULE_END=66;
    public static final int Set=29;
    public static final int Ltm=27;
    public static final int RULE_DATETIME=74;
    public static final int Lda=23;
    public static final int Is=41;
    public static final int Any=18;
    public static final int Int=22;
    public static final int Match=10;
    public static final int Flt=20;
    public static final int RULE_SL_COMMENT=77;
    public static final int QuestionMarkFullStop=39;
    public static final int Comma=51;
    public static final int EqualsSign=57;
    public static final int As=40;
    public static final int HyphenMinus=52;
    public static final int CarriageReturn=44;
    public static final int LessThanSignEqualsSign=36;
    public static final int Solidus=54;
    public static final int Colon=55;
    public static final int RightCurlyBracket=64;
    public static final int EOF=-1;
    public static final int Ldt=24;
    public static final int Asterisk=49;
    public static final int Path=15;
    public static final int FullStop=53;
    public static final int Def=19;
    public static final int RULE_WS=78;
    public static final int Definitions=4;
    public static final int LeftCurlyBracket=63;
    public static final int Service=6;
    public static final int From=13;
    public static final int RULE_ANY_OTHER=79;
    public static final int CommercialAt=60;
    public static final int PlugDsl=5;
    public static final int QuestionMark=59;
    public static final int RULE_FLOAT=71;
    public static final int Let=25;
    public static final int ExclamationMarkEqualsSign=32;
    public static final int HyphenMinusGreaterThanSign=34;
    public static final int LineFeed=43;

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
    // InternalEldmDslParser.g:64:1: ruleModule returns [EObject current=null] : (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) ;
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

        EObject lv_vals_7_0 = null;

        EObject lv_opers_9_0 = null;

        EObject lv_paths_10_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:70:2: ( (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) )
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            {
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            // InternalEldmDslParser.g:72:3: otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )*
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

                if ( ((LA1_0>=RULE_PATH && LA1_0<=RULE_ID)) ) {
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

            // InternalEldmDslParser.g:133:3: (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleValue ) )* this_END_8= RULE_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Definitions) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEldmDslParser.g:134:4: otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleValue ) )* this_END_8= RULE_END
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

                    // InternalEldmDslParser.g:161:4: ( (lv_vals_7_0= ruleValue ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Let) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:162:5: (lv_vals_7_0= ruleValue )
                    	    {
                    	    // InternalEldmDslParser.g:162:5: (lv_vals_7_0= ruleValue )
                    	    // InternalEldmDslParser.g:163:6: lv_vals_7_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModuleAccess().getValsValueParserRuleCall_4_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_vals_7_0=ruleValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"vals",
                    	      							lv_vals_7_0,
                    	      							"net.eldm.EldmDsl.Value");
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
            	    pushFollow(FOLLOW_9);
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


    // $ANTLR start "entryRulePlugDsl"
    // InternalEldmDslParser.g:227:1: entryRulePlugDsl returns [EObject current=null] : iv_rulePlugDsl= rulePlugDsl EOF ;
    public final EObject entryRulePlugDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugDsl = null;


        try {
            // InternalEldmDslParser.g:227:48: (iv_rulePlugDsl= rulePlugDsl EOF )
            // InternalEldmDslParser.g:228:2: iv_rulePlugDsl= rulePlugDsl EOF
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
    // InternalEldmDslParser.g:234:1: rulePlugDsl returns [EObject current=null] : (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) ) ;
    public final EObject rulePlugDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_adaptor_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:240:2: ( (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) ) )
            // InternalEldmDslParser.g:241:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) )
            {
            // InternalEldmDslParser.g:241:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) )
            // InternalEldmDslParser.g:242:3: otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) )
            {
            otherlv_0=(Token)match(input,PlugDsl,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlugDslAccess().getPlugDslKeyword_0());
              		
            }
            // InternalEldmDslParser.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // InternalEldmDslParser.g:264:3: ( (lv_adaptor_2_0= rulePatternLiteral ) )
            // InternalEldmDslParser.g:265:4: (lv_adaptor_2_0= rulePatternLiteral )
            {
            // InternalEldmDslParser.g:265:4: (lv_adaptor_2_0= rulePatternLiteral )
            // InternalEldmDslParser.g:266:5: lv_adaptor_2_0= rulePatternLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlugDslAccess().getAdaptorPatternLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_adaptor_2_0=rulePatternLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPlugDslRule());
              					}
              					set(
              						current,
              						"adaptor",
              						lv_adaptor_2_0,
              						"net.eldm.EldmDsl.PatternLiteral");
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
    // $ANTLR end "rulePlugDsl"


    // $ANTLR start "entryRuleImport"
    // InternalEldmDslParser.g:287:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEldmDslParser.g:287:47: (iv_ruleImport= ruleImport EOF )
            // InternalEldmDslParser.g:288:2: iv_ruleImport= ruleImport EOF
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
    // InternalEldmDslParser.g:294:1: ruleImport returns [EObject current=null] : (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_ImportOperation_0 = null;

        EObject this_ImportDefinition_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:300:2: ( (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition ) )
            // InternalEldmDslParser.g:301:2: (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition )
            {
            // InternalEldmDslParser.g:301:2: (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_PATH) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEldmDslParser.g:302:3: this_ImportOperation_0= ruleImportOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImportAccess().getImportOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportOperation_0=ruleImportOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ImportOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:311:3: this_ImportDefinition_1= ruleImportDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImportAccess().getImportDefinitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportDefinition_1=ruleImportDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ImportDefinition_1;
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportOperation"
    // InternalEldmDslParser.g:323:1: entryRuleImportOperation returns [EObject current=null] : iv_ruleImportOperation= ruleImportOperation EOF ;
    public final EObject entryRuleImportOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportOperation = null;


        try {
            // InternalEldmDslParser.g:323:56: (iv_ruleImportOperation= ruleImportOperation EOF )
            // InternalEldmDslParser.g:324:2: iv_ruleImportOperation= ruleImportOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportOperation=ruleImportOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportOperation; 
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
    // $ANTLR end "entryRuleImportOperation"


    // $ANTLR start "ruleImportOperation"
    // InternalEldmDslParser.g:330:1: ruleImportOperation returns [EObject current=null] : ( ( (lv_name_0_0= rulePathLiteral ) ) otherlv_1= From ( (lv_ref_2_0= rulePathLiteral ) ) ) ;
    public final EObject ruleImportOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:336:2: ( ( ( (lv_name_0_0= rulePathLiteral ) ) otherlv_1= From ( (lv_ref_2_0= rulePathLiteral ) ) ) )
            // InternalEldmDslParser.g:337:2: ( ( (lv_name_0_0= rulePathLiteral ) ) otherlv_1= From ( (lv_ref_2_0= rulePathLiteral ) ) )
            {
            // InternalEldmDslParser.g:337:2: ( ( (lv_name_0_0= rulePathLiteral ) ) otherlv_1= From ( (lv_ref_2_0= rulePathLiteral ) ) )
            // InternalEldmDslParser.g:338:3: ( (lv_name_0_0= rulePathLiteral ) ) otherlv_1= From ( (lv_ref_2_0= rulePathLiteral ) )
            {
            // InternalEldmDslParser.g:338:3: ( (lv_name_0_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:339:4: (lv_name_0_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:339:4: (lv_name_0_0= rulePathLiteral )
            // InternalEldmDslParser.g:340:5: lv_name_0_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportOperationAccess().getNamePathLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_name_0_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportOperationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"net.eldm.EldmDsl.PathLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,From,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImportOperationAccess().getFromKeyword_1());
              		
            }
            // InternalEldmDslParser.g:361:3: ( (lv_ref_2_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:362:4: (lv_ref_2_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:362:4: (lv_ref_2_0= rulePathLiteral )
            // InternalEldmDslParser.g:363:5: lv_ref_2_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportOperationAccess().getRefPathLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ref_2_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportOperationRule());
              					}
              					set(
              						current,
              						"ref",
              						lv_ref_2_0,
              						"net.eldm.EldmDsl.PathLiteral");
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
    // $ANTLR end "ruleImportOperation"


    // $ANTLR start "entryRuleImportDefinition"
    // InternalEldmDslParser.g:384:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // InternalEldmDslParser.g:384:57: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // InternalEldmDslParser.g:385:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportDefinition=ruleImportDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDefinition; 
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
    // $ANTLR end "entryRuleImportDefinition"


    // $ANTLR start "ruleImportDefinition"
    // InternalEldmDslParser.g:391:1: ruleImportDefinition returns [EObject current=null] : ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePathLiteral ) ) ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_defs_0_0 = null;

        EObject lv_defs_2_0 = null;

        EObject lv_ref_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:397:2: ( ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePathLiteral ) ) ) )
            // InternalEldmDslParser.g:398:2: ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePathLiteral ) ) )
            {
            // InternalEldmDslParser.g:398:2: ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePathLiteral ) ) )
            // InternalEldmDslParser.g:399:3: ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePathLiteral ) )
            {
            // InternalEldmDslParser.g:399:3: ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* )
            // InternalEldmDslParser.g:400:4: ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )*
            {
            // InternalEldmDslParser.g:400:4: ( (lv_defs_0_0= ruleExternalDef ) )
            // InternalEldmDslParser.g:401:5: (lv_defs_0_0= ruleExternalDef )
            {
            // InternalEldmDslParser.g:401:5: (lv_defs_0_0= ruleExternalDef )
            // InternalEldmDslParser.g:402:6: lv_defs_0_0= ruleExternalDef
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getImportDefinitionAccess().getDefsExternalDefParserRuleCall_0_0_0());
              					
            }
            pushFollow(FOLLOW_13);
            lv_defs_0_0=ruleExternalDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
              						}
              						add(
              							current,
              							"defs",
              							lv_defs_0_0,
              							"net.eldm.EldmDsl.ExternalDef");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalEldmDslParser.g:419:4: (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEldmDslParser.g:420:5: otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_1, grammarAccess.getImportDefinitionAccess().getCommaKeyword_0_1_0());
            	      				
            	    }
            	    // InternalEldmDslParser.g:424:5: ( (lv_defs_2_0= ruleExternalDef ) )
            	    // InternalEldmDslParser.g:425:6: (lv_defs_2_0= ruleExternalDef )
            	    {
            	    // InternalEldmDslParser.g:425:6: (lv_defs_2_0= ruleExternalDef )
            	    // InternalEldmDslParser.g:426:7: lv_defs_2_0= ruleExternalDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getImportDefinitionAccess().getDefsExternalDefParserRuleCall_0_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_defs_2_0=ruleExternalDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
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


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            otherlv_3=(Token)match(input,From,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getImportDefinitionAccess().getFromKeyword_1());
              		
            }
            // InternalEldmDslParser.g:449:3: ( (lv_ref_4_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:450:4: (lv_ref_4_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:450:4: (lv_ref_4_0= rulePathLiteral )
            // InternalEldmDslParser.g:451:5: lv_ref_4_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportDefinitionAccess().getRefPathLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ref_4_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
              					}
              					set(
              						current,
              						"ref",
              						lv_ref_4_0,
              						"net.eldm.EldmDsl.PathLiteral");
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
    // $ANTLR end "ruleImportDefinition"


    // $ANTLR start "entryRuleExternalDef"
    // InternalEldmDslParser.g:472:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalEldmDslParser.g:472:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalEldmDslParser.g:473:2: iv_ruleExternalDef= ruleExternalDef EOF
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
    // InternalEldmDslParser.g:479:1: ruleExternalDef returns [EObject current=null] : ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:485:2: ( ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:486:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:486:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
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
                    // InternalEldmDslParser.g:487:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    {
                    // InternalEldmDslParser.g:487:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    // InternalEldmDslParser.g:488:4: ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    {
                    // InternalEldmDslParser.g:488:4: ( (lv_ref_0_0= RULE_ID ) )
                    // InternalEldmDslParser.g:489:5: (lv_ref_0_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:489:5: (lv_ref_0_0= RULE_ID )
                    // InternalEldmDslParser.g:490:6: lv_ref_0_0= RULE_ID
                    {
                    lv_ref_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:506:4: (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==As) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalEldmDslParser.g:507:5: otherlv_1= As ( (lv_name_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,As,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getExternalDefAccess().getAsKeyword_0_1_0());
                              				
                            }
                            // InternalEldmDslParser.g:511:5: ( (lv_name_2_0= RULE_ID ) )
                            // InternalEldmDslParser.g:512:6: (lv_name_2_0= RULE_ID )
                            {
                            // InternalEldmDslParser.g:512:6: (lv_name_2_0= RULE_ID )
                            // InternalEldmDslParser.g:513:7: lv_name_2_0= RULE_ID
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
                    // InternalEldmDslParser.g:532:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:532:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    // InternalEldmDslParser.g:533:4: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:537:4: (lv_name_3_0= RULE_ID )
                    // InternalEldmDslParser.g:538:5: lv_name_3_0= RULE_ID
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


    // $ANTLR start "entryRuleOperation"
    // InternalEldmDslParser.g:558:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalEldmDslParser.g:558:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalEldmDslParser.g:559:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalEldmDslParser.g:565:1: ruleOperation returns [EObject current=null] : (otherlv_0= Def ( (lv_srv_1_0= Service ) )? ( ( (lv_get_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParam ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_srv_1_0=null;
        Token lv_get_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_name_4_0 = null;

        EObject lv_param_5_0 = null;

        EObject lv_result_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:571:2: ( (otherlv_0= Def ( (lv_srv_1_0= Service ) )? ( ( (lv_get_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParam ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) ) )
            // InternalEldmDslParser.g:572:2: (otherlv_0= Def ( (lv_srv_1_0= Service ) )? ( ( (lv_get_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParam ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) )
            {
            // InternalEldmDslParser.g:572:2: (otherlv_0= Def ( (lv_srv_1_0= Service ) )? ( ( (lv_get_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParam ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) )
            // InternalEldmDslParser.g:573:3: otherlv_0= Def ( (lv_srv_1_0= Service ) )? ( ( (lv_get_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParam ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) )
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:577:3: ( (lv_srv_1_0= Service ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Service) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEldmDslParser.g:578:4: (lv_srv_1_0= Service )
                    {
                    // InternalEldmDslParser.g:578:4: (lv_srv_1_0= Service )
                    // InternalEldmDslParser.g:579:5: lv_srv_1_0= Service
                    {
                    lv_srv_1_0=(Token)match(input,Service,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_srv_1_0, grammarAccess.getOperationAccess().getSrvServiceKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOperationRule());
                      					}
                      					setWithLastConsumed(current, "srv", true, "service");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:591:3: ( ( (lv_get_2_0= Get ) ) | otherlv_3= Set )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Get) ) {
                alt13=1;
            }
            else if ( (LA13_0==Set) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEldmDslParser.g:592:4: ( (lv_get_2_0= Get ) )
                    {
                    // InternalEldmDslParser.g:592:4: ( (lv_get_2_0= Get ) )
                    // InternalEldmDslParser.g:593:5: (lv_get_2_0= Get )
                    {
                    // InternalEldmDslParser.g:593:5: (lv_get_2_0= Get )
                    // InternalEldmDslParser.g:594:6: lv_get_2_0= Get
                    {
                    lv_get_2_0=(Token)match(input,Get,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_get_2_0, grammarAccess.getOperationAccess().getGetGetKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOperationRule());
                      						}
                      						setWithLastConsumed(current, "get", true, "get");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:607:4: otherlv_3= Set
                    {
                    otherlv_3=(Token)match(input,Set,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getSetKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:612:3: ( (lv_name_4_0= rulePathLiteral ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_PATH) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEldmDslParser.g:613:4: (lv_name_4_0= rulePathLiteral )
                    {
                    // InternalEldmDslParser.g:613:4: (lv_name_4_0= rulePathLiteral )
                    // InternalEldmDslParser.g:614:5: lv_name_4_0= rulePathLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationAccess().getNamePathLiteralParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_name_4_0=rulePathLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_4_0,
                      						"net.eldm.EldmDsl.PathLiteral");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:631:3: ( (lv_param_5_0= ruleParam ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftCurlyBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEldmDslParser.g:632:4: (lv_param_5_0= ruleParam )
                    {
                    // InternalEldmDslParser.g:632:4: (lv_param_5_0= ruleParam )
                    // InternalEldmDslParser.g:633:5: lv_param_5_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationAccess().getParamParamParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_param_5_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationRule());
                      					}
                      					set(
                      						current,
                      						"param",
                      						lv_param_5_0,
                      						"net.eldm.EldmDsl.Param");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:650:3: (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HyphenMinusGreaterThanSign) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEldmDslParser.g:651:4: otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) )
                    {
                    otherlv_6=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                      			
                    }
                    // InternalEldmDslParser.g:655:4: ( (lv_result_7_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:656:5: (lv_result_7_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:656:5: (lv_result_7_0= ruleElementDef )
                    // InternalEldmDslParser.g:657:6: lv_result_7_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationAccess().getResultElementDefParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_result_7_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationRule());
                      						}
                      						set(
                      							current,
                      							"result",
                      							lv_result_7_0,
                      							"net.eldm.EldmDsl.ElementDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getColonKeyword_6());
              		
            }
            // InternalEldmDslParser.g:679:3: ( (lv_body_9_0= ruleBlockExpression ) )
            // InternalEldmDslParser.g:680:4: (lv_body_9_0= ruleBlockExpression )
            {
            // InternalEldmDslParser.g:680:4: (lv_body_9_0= ruleBlockExpression )
            // InternalEldmDslParser.g:681:5: lv_body_9_0= ruleBlockExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getBodyBlockExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_9_0=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_9_0,
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


    // $ANTLR start "entryRuleParam"
    // InternalEldmDslParser.g:702:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalEldmDslParser.g:702:46: (iv_ruleParam= ruleParam EOF )
            // InternalEldmDslParser.g:703:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalEldmDslParser.g:709:1: ruleParam returns [EObject current=null] : ( (lv_def_0_0= ruleMapDef ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject lv_def_0_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:715:2: ( ( (lv_def_0_0= ruleMapDef ) ) )
            // InternalEldmDslParser.g:716:2: ( (lv_def_0_0= ruleMapDef ) )
            {
            // InternalEldmDslParser.g:716:2: ( (lv_def_0_0= ruleMapDef ) )
            // InternalEldmDslParser.g:717:3: (lv_def_0_0= ruleMapDef )
            {
            // InternalEldmDslParser.g:717:3: (lv_def_0_0= ruleMapDef )
            // InternalEldmDslParser.g:718:4: lv_def_0_0= ruleMapDef
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParamAccess().getDefMapDefParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_def_0_0=ruleMapDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParamRule());
              				}
              				set(
              					current,
              					"def",
              					lv_def_0_0,
              					"net.eldm.EldmDsl.MapDef");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleSubPath"
    // InternalEldmDslParser.g:738:1: entryRuleSubPath returns [EObject current=null] : iv_ruleSubPath= ruleSubPath EOF ;
    public final EObject entryRuleSubPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPath = null;


        try {
            // InternalEldmDslParser.g:738:48: (iv_ruleSubPath= ruleSubPath EOF )
            // InternalEldmDslParser.g:739:2: iv_ruleSubPath= ruleSubPath EOF
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
    // InternalEldmDslParser.g:745:1: ruleSubPath returns [EObject current=null] : (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleSubPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_opers_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:751:2: ( (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END ) )
            // InternalEldmDslParser.g:752:2: (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            {
            // InternalEldmDslParser.g:752:2: (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            // InternalEldmDslParser.g:753:3: otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubPathAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:757:3: ( (lv_name_1_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:758:4: (lv_name_1_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:758:4: (lv_name_1_0= rulePathLiteral )
            // InternalEldmDslParser.g:759:5: lv_name_1_0= rulePathLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubPathAccess().getNamePathLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePathLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubPathRule());
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalEldmDslParser.g:780:3: ( (lv_opers_3_0= ruleOperation ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Def) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEldmDslParser.g:781:4: (lv_opers_3_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:781:4: (lv_opers_3_0= ruleOperation )
            	    // InternalEldmDslParser.g:782:5: lv_opers_3_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubPathAccess().getOpersOperationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_opers_3_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSubPathRule());
            	      					}
            	      					add(
            	      						current,
            	      						"opers",
            	      						lv_opers_3_0,
            	      						"net.eldm.EldmDsl.Operation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalEldmDslParser.g:807:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // InternalEldmDslParser.g:807:56: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // InternalEldmDslParser.g:808:2: iv_ruleBlockExpression= ruleBlockExpression EOF
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
    // InternalEldmDslParser.g:814:1: ruleBlockExpression returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:820:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) )
            // InternalEldmDslParser.g:821:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            {
            // InternalEldmDslParser.g:821:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            // InternalEldmDslParser.g:822:3: () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END
            {
            // InternalEldmDslParser.g:822:3: ()
            // InternalEldmDslParser.g:823:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockExpressionAccess().getBlockExpressionAction_0(),
              					current);
              			
            }

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_1, grammarAccess.getBlockExpressionAccess().getBEGINTerminalRuleCall_1());
              		
            }
            // InternalEldmDslParser.g:833:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Let||LA18_0==Var) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEldmDslParser.g:834:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalEldmDslParser.g:834:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalEldmDslParser.g:835:5: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop18;
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
    // InternalEldmDslParser.g:860:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEldmDslParser.g:860:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEldmDslParser.g:861:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEldmDslParser.g:867:1: ruleExpression returns [EObject current=null] : this_Identifier_0= ruleIdentifier ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:873:2: (this_Identifier_0= ruleIdentifier )
            // InternalEldmDslParser.g:874:2: this_Identifier_0= ruleIdentifier
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
    // InternalEldmDslParser.g:885:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalEldmDslParser.g:885:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalEldmDslParser.g:886:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalEldmDslParser.g:892:1: ruleIdentifier returns [EObject current=null] : (this_Value_0= ruleValue | this_Var_1= ruleVar ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        EObject this_Var_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:898:2: ( (this_Value_0= ruleValue | this_Var_1= ruleVar ) )
            // InternalEldmDslParser.g:899:2: (this_Value_0= ruleValue | this_Var_1= ruleVar )
            {
            // InternalEldmDslParser.g:899:2: (this_Value_0= ruleValue | this_Var_1= ruleVar )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Let) ) {
                alt19=1;
            }
            else if ( (LA19_0==Var) ) {
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
                    // InternalEldmDslParser.g:900:3: this_Value_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdentifierAccess().getValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Value_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Value_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:909:3: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdentifierAccess().getVarParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Var_1=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Var_1;
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleValue"
    // InternalEldmDslParser.g:921:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalEldmDslParser.g:921:46: (iv_ruleValue= ruleValue EOF )
            // InternalEldmDslParser.g:922:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalEldmDslParser.g:928:1: ruleValue returns [EObject current=null] : (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleValueExpression ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_typeExplicit_2_0=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_result_5_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:934:2: ( (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleValueExpression ) ) ) )
            // InternalEldmDslParser.g:935:2: (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleValueExpression ) ) )
            {
            // InternalEldmDslParser.g:935:2: (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleValueExpression ) ) )
            // InternalEldmDslParser.g:936:3: otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleValueExpression ) )
            {
            otherlv_0=(Token)match(input,Let,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getValueAccess().getLetKeyword_0());
              		
            }
            // InternalEldmDslParser.g:940:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:941:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:941:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:942:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:958:3: ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Colon) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEldmDslParser.g:959:4: ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:959:4: ( (lv_typeExplicit_2_0= Colon ) )
                    // InternalEldmDslParser.g:960:5: (lv_typeExplicit_2_0= Colon )
                    {
                    // InternalEldmDslParser.g:960:5: (lv_typeExplicit_2_0= Colon )
                    // InternalEldmDslParser.g:961:6: lv_typeExplicit_2_0= Colon
                    {
                    lv_typeExplicit_2_0=(Token)match(input,Colon,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_typeExplicit_2_0, grammarAccess.getValueAccess().getTypeExplicitColonKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getValueRule());
                      						}
                      						setWithLastConsumed(current, "typeExplicit", true, ":");
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:973:4: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:974:5: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:974:5: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:975:6: lv_type_3_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValueAccess().getTypeElementDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_type_3_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValueRule());
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
                    break;

            }

            otherlv_4=(Token)match(input,EqualsSign,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getValueAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalEldmDslParser.g:997:3: ( (lv_result_5_0= ruleValueExpression ) )
            // InternalEldmDslParser.g:998:4: (lv_result_5_0= ruleValueExpression )
            {
            // InternalEldmDslParser.g:998:4: (lv_result_5_0= ruleValueExpression )
            // InternalEldmDslParser.g:999:5: lv_result_5_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValueAccess().getResultValueExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_result_5_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValueRule());
              					}
              					set(
              						current,
              						"result",
              						lv_result_5_0,
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVar"
    // InternalEldmDslParser.g:1020:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalEldmDslParser.g:1020:44: (iv_ruleVar= ruleVar EOF )
            // InternalEldmDslParser.g:1021:2: iv_ruleVar= ruleVar EOF
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
    // InternalEldmDslParser.g:1027:1: ruleVar returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleVarExpression ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_typeExplicit_2_0=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_result_5_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1033:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleVarExpression ) ) ) )
            // InternalEldmDslParser.g:1034:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleVarExpression ) ) )
            {
            // InternalEldmDslParser.g:1034:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleVarExpression ) ) )
            // InternalEldmDslParser.g:1035:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleVarExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVarKeyword_0());
              		
            }
            // InternalEldmDslParser.g:1039:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:1040:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1040:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:1041:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:1057:3: ( ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Colon) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEldmDslParser.g:1058:4: ( (lv_typeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:1058:4: ( (lv_typeExplicit_2_0= Colon ) )
                    // InternalEldmDslParser.g:1059:5: (lv_typeExplicit_2_0= Colon )
                    {
                    // InternalEldmDslParser.g:1059:5: (lv_typeExplicit_2_0= Colon )
                    // InternalEldmDslParser.g:1060:6: lv_typeExplicit_2_0= Colon
                    {
                    lv_typeExplicit_2_0=(Token)match(input,Colon,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_typeExplicit_2_0, grammarAccess.getVarAccess().getTypeExplicitColonKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarRule());
                      						}
                      						setWithLastConsumed(current, "typeExplicit", true, ":");
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:1072:4: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:1073:5: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:1073:5: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:1074:6: lv_type_3_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAccess().getTypeElementDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_type_3_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarRule());
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
                    break;

            }

            otherlv_4=(Token)match(input,EqualsSign,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVarAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalEldmDslParser.g:1096:3: ( (lv_result_5_0= ruleVarExpression ) )
            // InternalEldmDslParser.g:1097:4: (lv_result_5_0= ruleVarExpression )
            {
            // InternalEldmDslParser.g:1097:4: (lv_result_5_0= ruleVarExpression )
            // InternalEldmDslParser.g:1098:5: lv_result_5_0= ruleVarExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarAccess().getResultVarExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_result_5_0=ruleVarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarRule());
              					}
              					set(
              						current,
              						"result",
              						lv_result_5_0,
              						"net.eldm.EldmDsl.VarExpression");
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
    // InternalEldmDslParser.g:1119:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // InternalEldmDslParser.g:1119:56: (iv_ruleValueExpression= ruleValueExpression EOF )
            // InternalEldmDslParser.g:1120:2: iv_ruleValueExpression= ruleValueExpression EOF
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
    // InternalEldmDslParser.g:1126:1: ruleValueExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1132:2: (this_OrExpression_0= ruleOrExpression )
            // InternalEldmDslParser.g:1133:2: this_OrExpression_0= ruleOrExpression
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
    // InternalEldmDslParser.g:1144:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalEldmDslParser.g:1144:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalEldmDslParser.g:1145:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalEldmDslParser.g:1151:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1157:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEldmDslParser.g:1158:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1158:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEldmDslParser.g:1159:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1167:3: ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Or) && (synpred2_InternalEldmDslParser())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEldmDslParser.g:1168:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1168:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) )
            	    // InternalEldmDslParser.g:1169:5: ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) )
            	    {
            	    // InternalEldmDslParser.g:1179:5: ( () ( (lv_feature_2_0= Or ) ) )
            	    // InternalEldmDslParser.g:1180:6: () ( (lv_feature_2_0= Or ) )
            	    {
            	    // InternalEldmDslParser.g:1180:6: ()
            	    // InternalEldmDslParser.g:1181:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1187:6: ( (lv_feature_2_0= Or ) )
            	    // InternalEldmDslParser.g:1188:7: (lv_feature_2_0= Or )
            	    {
            	    // InternalEldmDslParser.g:1188:7: (lv_feature_2_0= Or )
            	    // InternalEldmDslParser.g:1189:8: lv_feature_2_0= Or
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

            	    // InternalEldmDslParser.g:1203:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEldmDslParser.g:1204:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEldmDslParser.g:1204:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEldmDslParser.g:1205:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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
            	    break loop22;
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
    // InternalEldmDslParser.g:1227:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEldmDslParser.g:1227:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEldmDslParser.g:1228:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalEldmDslParser.g:1234:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1240:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalEldmDslParser.g:1241:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1241:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalEldmDslParser.g:1242:3: this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1250:3: ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==And) && (synpred3_InternalEldmDslParser())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEldmDslParser.g:1251:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1251:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) )
            	    // InternalEldmDslParser.g:1252:5: ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) )
            	    {
            	    // InternalEldmDslParser.g:1262:5: ( () ( (lv_feature_2_0= And ) ) )
            	    // InternalEldmDslParser.g:1263:6: () ( (lv_feature_2_0= And ) )
            	    {
            	    // InternalEldmDslParser.g:1263:6: ()
            	    // InternalEldmDslParser.g:1264:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1270:6: ( (lv_feature_2_0= And ) )
            	    // InternalEldmDslParser.g:1271:7: (lv_feature_2_0= And )
            	    {
            	    // InternalEldmDslParser.g:1271:7: (lv_feature_2_0= And )
            	    // InternalEldmDslParser.g:1272:8: lv_feature_2_0= And
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

            	    // InternalEldmDslParser.g:1286:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalEldmDslParser.g:1287:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalEldmDslParser.g:1287:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalEldmDslParser.g:1288:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalEldmDslParser.g:1310:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalEldmDslParser.g:1310:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalEldmDslParser.g:1311:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalEldmDslParser.g:1317:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1323:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalEldmDslParser.g:1324:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1324:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalEldmDslParser.g:1325:3: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1333:3: ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EqualsSignEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt25=1;
                }
                else if ( (LA25_0==ExclamationMarkEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEldmDslParser.g:1334:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1334:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1335:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1349:5: ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalEldmDslParser.g:1350:6: () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1350:6: ()
            	    // InternalEldmDslParser.g:1351:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEqualityExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1357:6: ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalEldmDslParser.g:1358:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalEldmDslParser.g:1358:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalEldmDslParser.g:1359:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalEldmDslParser.g:1359:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==EqualsSignEqualsSign) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==ExclamationMarkEqualsSign) ) {
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
            	            // InternalEldmDslParser.g:1360:9: lv_feature_2_1= EqualsSignEqualsSign
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
            	            // InternalEldmDslParser.g:1371:9: lv_feature_2_2= ExclamationMarkEqualsSign
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

            	    // InternalEldmDslParser.g:1386:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalEldmDslParser.g:1387:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalEldmDslParser.g:1387:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalEldmDslParser.g:1388:6: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    break loop25;
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
    // InternalEldmDslParser.g:1410:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalEldmDslParser.g:1410:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalEldmDslParser.g:1411:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalEldmDslParser.g:1417:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) ;
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
            // InternalEldmDslParser.g:1423:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) )
            // InternalEldmDslParser.g:1424:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            {
            // InternalEldmDslParser.g:1424:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            // InternalEldmDslParser.g:1425:3: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1433:3: ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Is) && (synpred5_InternalEldmDslParser())) {
                    alt27=1;
                }
                else if ( (LA27_0==GreaterThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt27=2;
                }
                else if ( (LA27_0==LessThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt27=2;
                }
                else if ( (LA27_0==GreaterThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt27=2;
                }
                else if ( (LA27_0==LessThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEldmDslParser.g:1434:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    {
            	    // InternalEldmDslParser.g:1434:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    // InternalEldmDslParser.g:1435:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) )
            	    {
            	    // InternalEldmDslParser.g:1435:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) )
            	    // InternalEldmDslParser.g:1436:6: ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) )
            	    {
            	    // InternalEldmDslParser.g:1446:6: ( () ( (lv_feature_2_0= Is ) ) )
            	    // InternalEldmDslParser.g:1447:7: () ( (lv_feature_2_0= Is ) )
            	    {
            	    // InternalEldmDslParser.g:1447:7: ()
            	    // InternalEldmDslParser.g:1448:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getIsExpressionLeftAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1454:7: ( (lv_feature_2_0= Is ) )
            	    // InternalEldmDslParser.g:1455:8: (lv_feature_2_0= Is )
            	    {
            	    // InternalEldmDslParser.g:1455:8: (lv_feature_2_0= Is )
            	    // InternalEldmDslParser.g:1456:9: lv_feature_2_0= Is
            	    {
            	    lv_feature_2_0=(Token)match(input,Is,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1470:5: ( (lv_type_3_0= ruleElementDef ) )
            	    // InternalEldmDslParser.g:1471:6: (lv_type_3_0= ruleElementDef )
            	    {
            	    // InternalEldmDslParser.g:1471:6: (lv_type_3_0= ruleElementDef )
            	    // InternalEldmDslParser.g:1472:7: lv_type_3_0= ruleElementDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getTypeElementDefParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    // InternalEldmDslParser.g:1491:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    {
            	    // InternalEldmDslParser.g:1491:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    // InternalEldmDslParser.g:1492:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1492:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1493:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1511:6: ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    // InternalEldmDslParser.g:1512:7: () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1512:7: ()
            	    // InternalEldmDslParser.g:1513:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getValueExpressionLeftAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1519:7: ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    // InternalEldmDslParser.g:1520:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    {
            	    // InternalEldmDslParser.g:1520:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    // InternalEldmDslParser.g:1521:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    {
            	    // InternalEldmDslParser.g:1521:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    int alt26=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1522:10: lv_feature_5_1= GreaterThanSignEqualsSign
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
            	            // InternalEldmDslParser.g:1533:10: lv_feature_5_2= LessThanSignEqualsSign
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
            	            // InternalEldmDslParser.g:1544:10: lv_feature_5_3= GreaterThanSign
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
            	            // InternalEldmDslParser.g:1555:10: lv_feature_5_4= LessThanSign
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

            	    // InternalEldmDslParser.g:1570:5: ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    // InternalEldmDslParser.g:1571:6: (lv_right_6_0= ruleAdditiveExpression )
            	    {
            	    // InternalEldmDslParser.g:1571:6: (lv_right_6_0= ruleAdditiveExpression )
            	    // InternalEldmDslParser.g:1572:7: lv_right_6_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalEldmDslParser.g:1595:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalEldmDslParser.g:1595:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalEldmDslParser.g:1596:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalEldmDslParser.g:1602:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1608:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalEldmDslParser.g:1609:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1609:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalEldmDslParser.g:1610:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1618:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==PlusSign) && (synpred7_InternalEldmDslParser())) {
                    alt29=1;
                }
                else if ( (LA29_0==HyphenMinus) && (synpred7_InternalEldmDslParser())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEldmDslParser.g:1619:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1619:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) )
            	    // InternalEldmDslParser.g:1620:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1634:5: ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) )
            	    // InternalEldmDslParser.g:1635:6: () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) )
            	    {
            	    // InternalEldmDslParser.g:1635:6: ()
            	    // InternalEldmDslParser.g:1636:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAdditiveExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1642:6: ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) )
            	    // InternalEldmDslParser.g:1643:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) )
            	    {
            	    // InternalEldmDslParser.g:1643:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) )
            	    // InternalEldmDslParser.g:1644:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus )
            	    {
            	    // InternalEldmDslParser.g:1644:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==PlusSign) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==HyphenMinus) ) {
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
            	            // InternalEldmDslParser.g:1645:9: lv_feature_2_1= PlusSign
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
            	            // InternalEldmDslParser.g:1656:9: lv_feature_2_2= HyphenMinus
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

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalEldmDslParser.g:1671:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalEldmDslParser.g:1672:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalEldmDslParser.g:1672:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalEldmDslParser.g:1673:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalEldmDslParser.g:1695:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalEldmDslParser.g:1695:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalEldmDslParser.g:1696:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalEldmDslParser.g:1702:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
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
            // InternalEldmDslParser.g:1708:2: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // InternalEldmDslParser.g:1709:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // InternalEldmDslParser.g:1709:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // InternalEldmDslParser.g:1710:3: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1718:3: ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Asterisk) && (synpred8_InternalEldmDslParser())) {
                    alt31=1;
                }
                else if ( (LA31_0==AsteriskAsterisk) && (synpred8_InternalEldmDslParser())) {
                    alt31=1;
                }
                else if ( (LA31_0==Solidus) && (synpred8_InternalEldmDslParser())) {
                    alt31=1;
                }
                else if ( (LA31_0==PercentSign) && (synpred8_InternalEldmDslParser())) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEldmDslParser.g:1719:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // InternalEldmDslParser.g:1719:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1720:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1738:5: ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    // InternalEldmDslParser.g:1739:6: () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1739:6: ()
            	    // InternalEldmDslParser.g:1740:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getValueExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1746:6: ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    // InternalEldmDslParser.g:1747:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    {
            	    // InternalEldmDslParser.g:1747:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    // InternalEldmDslParser.g:1748:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    {
            	    // InternalEldmDslParser.g:1748:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    int alt30=4;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case AsteriskAsterisk:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    case PercentSign:
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
            	            // InternalEldmDslParser.g:1749:9: lv_feature_2_1= Asterisk
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
            	            // InternalEldmDslParser.g:1760:9: lv_feature_2_2= AsteriskAsterisk
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
            	            // InternalEldmDslParser.g:1771:9: lv_feature_2_3= Solidus
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
            	            // InternalEldmDslParser.g:1782:9: lv_feature_2_4= PercentSign
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

            	    // InternalEldmDslParser.g:1797:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // InternalEldmDslParser.g:1798:5: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // InternalEldmDslParser.g:1798:5: (lv_right_3_0= ruleUnaryOperation )
            	    // InternalEldmDslParser.g:1799:6: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalEldmDslParser.g:1821:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalEldmDslParser.g:1821:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalEldmDslParser.g:1822:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
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
    // InternalEldmDslParser.g:1828:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_BaseExpression_3 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1834:2: ( ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression ) )
            // InternalEldmDslParser.g:1835:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression )
            {
            // InternalEldmDslParser.g:1835:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ExclamationMark) ) {
                alt32=1;
            }
            else if ( (LA32_0==False||(LA32_0>=Bool && LA32_0<=Enum)||(LA32_0>=Path && LA32_0<=True)||LA32_0==Any||LA32_0==Flt||(LA32_0>=Int && LA32_0<=Ldt)||(LA32_0>=Lst && LA32_0<=Map)||LA32_0==Str||LA32_0==LeftParenthesis||(LA32_0>=CommercialAt && LA32_0<=LeftSquareBracket)||LA32_0==LeftCurlyBracket||(LA32_0>=RULE_PATH && LA32_0<=RULE_ID)||(LA32_0>=RULE_NATURAL && LA32_0<=RULE_TEXT)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalEldmDslParser.g:1836:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // InternalEldmDslParser.g:1836:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // InternalEldmDslParser.g:1837:4: () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // InternalEldmDslParser.g:1837:4: ()
                    // InternalEldmDslParser.g:1838:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEldmDslParser.g:1844:4: ( (lv_feature_1_0= ExclamationMark ) )
                    // InternalEldmDslParser.g:1845:5: (lv_feature_1_0= ExclamationMark )
                    {
                    // InternalEldmDslParser.g:1845:5: (lv_feature_1_0= ExclamationMark )
                    // InternalEldmDslParser.g:1846:6: lv_feature_1_0= ExclamationMark
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

                    // InternalEldmDslParser.g:1858:4: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // InternalEldmDslParser.g:1859:5: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // InternalEldmDslParser.g:1859:5: (lv_operand_2_0= ruleUnaryOperation )
                    // InternalEldmDslParser.g:1860:6: lv_operand_2_0= ruleUnaryOperation
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
                    // InternalEldmDslParser.g:1879:3: this_BaseExpression_3= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryOperationAccess().getBaseExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BaseExpression_3=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BaseExpression_3;
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


    // $ANTLR start "entryRuleBaseExpression"
    // InternalEldmDslParser.g:1891:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalEldmDslParser.g:1891:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalEldmDslParser.g:1892:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseExpression; 
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
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // InternalEldmDslParser.g:1898:1: ruleBaseExpression returns [EObject current=null] : (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ValueExpression_2= ruleValueExpression otherlv_3= RightParenthesis ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject this_ValueExpression_2 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1904:2: ( (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ValueExpression_2= ruleValueExpression otherlv_3= RightParenthesis ) ) )
            // InternalEldmDslParser.g:1905:2: (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ValueExpression_2= ruleValueExpression otherlv_3= RightParenthesis ) )
            {
            // InternalEldmDslParser.g:1905:2: (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ValueExpression_2= ruleValueExpression otherlv_3= RightParenthesis ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==False||(LA33_0>=Bool && LA33_0<=Enum)||(LA33_0>=Path && LA33_0<=True)||LA33_0==Any||LA33_0==Flt||(LA33_0>=Int && LA33_0<=Ldt)||(LA33_0>=Lst && LA33_0<=Map)||LA33_0==Str||(LA33_0>=CommercialAt && LA33_0<=LeftSquareBracket)||LA33_0==LeftCurlyBracket||(LA33_0>=RULE_PATH && LA33_0<=RULE_ID)||(LA33_0>=RULE_NATURAL && LA33_0<=RULE_TEXT)) ) {
                alt33=1;
            }
            else if ( (LA33_0==LeftParenthesis) ) {
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
                    // InternalEldmDslParser.g:1906:3: this_Primary_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExpressionAccess().getPrimaryParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Primary_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Primary_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1915:3: (otherlv_1= LeftParenthesis this_ValueExpression_2= ruleValueExpression otherlv_3= RightParenthesis )
                    {
                    // InternalEldmDslParser.g:1915:3: (otherlv_1= LeftParenthesis this_ValueExpression_2= ruleValueExpression otherlv_3= RightParenthesis )
                    // InternalEldmDslParser.g:1916:4: otherlv_1= LeftParenthesis this_ValueExpression_2= ruleValueExpression otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBaseExpressionAccess().getValueExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_ValueExpression_2=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ValueExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
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
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRulePrimary"
    // InternalEldmDslParser.g:1937:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEldmDslParser.g:1937:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEldmDslParser.g:1938:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalEldmDslParser.g:1944:1: rulePrimary returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_calls_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1950:2: ( ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) ) )
            // InternalEldmDslParser.g:1951:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) )
            {
            // InternalEldmDslParser.g:1951:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalEldmDslParser.g:1952:3: ( (lv_value_0_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:1952:3: ( (lv_value_0_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:1953:4: (lv_value_0_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:1953:4: (lv_value_0_0= ruleLiteral )
                    // InternalEldmDslParser.g:1954:5: lv_value_0_0= ruleLiteral
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
                    // InternalEldmDslParser.g:1972:3: ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* )
                    {
                    // InternalEldmDslParser.g:1972:3: ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* )
                    // InternalEldmDslParser.g:1973:4: ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )*
                    {
                    // InternalEldmDslParser.g:1973:4: ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:1974:5: ( ( RULE_ID ) )=> (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:1978:5: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:1979:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getRefIdentifierCrossReference_1_0_0());
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:1990:4: ( (lv_calls_2_0= ruleMemberCall ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==QuestionMarkFullStop||LA34_0==FullStop) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:1991:5: (lv_calls_2_0= ruleMemberCall )
                    	    {
                    	    // InternalEldmDslParser.g:1991:5: (lv_calls_2_0= ruleMemberCall )
                    	    // InternalEldmDslParser.g:1992:6: lv_calls_2_0= ruleMemberCall
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPrimaryAccess().getCallsMemberCallParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_calls_2_0=ruleMemberCall();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"calls",
                    	      							lv_calls_2_0,
                    	      							"net.eldm.EldmDsl.MemberCall");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
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
    // InternalEldmDslParser.g:2014:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalEldmDslParser.g:2014:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalEldmDslParser.g:2015:2: iv_ruleMemberCall= ruleMemberCall EOF
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
    // InternalEldmDslParser.g:2021:1: ruleMemberCall returns [EObject current=null] : ( (otherlv_0= FullStop | ( (lv_nullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nullSafe_1_0=null;
        Token lv_member_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2027:2: ( ( (otherlv_0= FullStop | ( (lv_nullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:2028:2: ( (otherlv_0= FullStop | ( (lv_nullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:2028:2: ( (otherlv_0= FullStop | ( (lv_nullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) )
            // InternalEldmDslParser.g:2029:3: (otherlv_0= FullStop | ( (lv_nullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) )
            {
            // InternalEldmDslParser.g:2029:3: (otherlv_0= FullStop | ( (lv_nullSafe_1_0= QuestionMarkFullStop ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==FullStop) ) {
                alt36=1;
            }
            else if ( (LA36_0==QuestionMarkFullStop) ) {
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
                    // InternalEldmDslParser.g:2030:4: otherlv_0= FullStop
                    {
                    otherlv_0=(Token)match(input,FullStop,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMemberCallAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2035:4: ( (lv_nullSafe_1_0= QuestionMarkFullStop ) )
                    {
                    // InternalEldmDslParser.g:2035:4: ( (lv_nullSafe_1_0= QuestionMarkFullStop ) )
                    // InternalEldmDslParser.g:2036:5: (lv_nullSafe_1_0= QuestionMarkFullStop )
                    {
                    // InternalEldmDslParser.g:2036:5: (lv_nullSafe_1_0= QuestionMarkFullStop )
                    // InternalEldmDslParser.g:2037:6: lv_nullSafe_1_0= QuestionMarkFullStop
                    {
                    lv_nullSafe_1_0=(Token)match(input,QuestionMarkFullStop,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_nullSafe_1_0, grammarAccess.getMemberCallAccess().getNullSafeQuestionMarkFullStopKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMemberCallRule());
                      						}
                      						setWithLastConsumed(current, "nullSafe", true, "?.");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:2050:3: ( (lv_member_2_0= RULE_ID ) )
            // InternalEldmDslParser.g:2051:4: (lv_member_2_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2051:4: (lv_member_2_0= RULE_ID )
            // InternalEldmDslParser.g:2052:5: lv_member_2_0= RULE_ID
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


    // $ANTLR start "entryRuleVarExpression"
    // InternalEldmDslParser.g:2072:1: entryRuleVarExpression returns [EObject current=null] : iv_ruleVarExpression= ruleVarExpression EOF ;
    public final EObject entryRuleVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpression = null;


        try {
            // InternalEldmDslParser.g:2072:54: (iv_ruleVarExpression= ruleVarExpression EOF )
            // InternalEldmDslParser.g:2073:2: iv_ruleVarExpression= ruleVarExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarExpression=ruleVarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarExpression; 
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
    // $ANTLR end "entryRuleVarExpression"


    // $ANTLR start "ruleVarExpression"
    // InternalEldmDslParser.g:2079:1: ruleVarExpression returns [EObject current=null] : ( (lv_value_0_0= ruleLiteral ) ) ;
    public final EObject ruleVarExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2085:2: ( ( (lv_value_0_0= ruleLiteral ) ) )
            // InternalEldmDslParser.g:2086:2: ( (lv_value_0_0= ruleLiteral ) )
            {
            // InternalEldmDslParser.g:2086:2: ( (lv_value_0_0= ruleLiteral ) )
            // InternalEldmDslParser.g:2087:3: (lv_value_0_0= ruleLiteral )
            {
            // InternalEldmDslParser.g:2087:3: (lv_value_0_0= ruleLiteral )
            // InternalEldmDslParser.g:2088:4: lv_value_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getVarExpressionAccess().getValueLiteralParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getVarExpressionRule());
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
    // $ANTLR end "ruleVarExpression"


    // $ANTLR start "entryRuleDefinition"
    // InternalEldmDslParser.g:2108:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalEldmDslParser.g:2108:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalEldmDslParser.g:2109:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalEldmDslParser.g:2115:1: ruleDefinition returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_ExternalDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2121:2: ( (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) )
            // InternalEldmDslParser.g:2122:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            {
            // InternalEldmDslParser.g:2122:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Typedef) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalEldmDslParser.g:2123:3: this_TypeDef_0= ruleTypeDef
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
                    // InternalEldmDslParser.g:2132:3: this_ExternalDef_1= ruleExternalDef
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
    // InternalEldmDslParser.g:2144:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEldmDslParser.g:2144:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEldmDslParser.g:2145:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalEldmDslParser.g:2151:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) ) ;
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
            // InternalEldmDslParser.g:2157:2: ( (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) ) )
            // InternalEldmDslParser.g:2158:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) )
            {
            // InternalEldmDslParser.g:2158:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) )
            // InternalEldmDslParser.g:2159:3: otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) )
            {
            otherlv_0=(Token)match(input,Typedef,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2163:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:2164:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2164:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:2165:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2181:3: ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Match||LA39_0==Mask) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=Bool && LA39_0<=Enum)||LA39_0==Path||LA39_0==Any||LA39_0==Flt||(LA39_0>=Int && LA39_0<=Ldt)||(LA39_0>=Lst && LA39_0<=Map)||LA39_0==Str||LA39_0==FullStopFullStop||LA39_0==LeftCurlyBracket||LA39_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:2182:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    {
                    // InternalEldmDslParser.g:2182:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    // InternalEldmDslParser.g:2183:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) )
                    {
                    // InternalEldmDslParser.g:2183:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) )
                    // InternalEldmDslParser.g:2184:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    {
                    // InternalEldmDslParser.g:2184:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    // InternalEldmDslParser.g:2185:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    {
                    // InternalEldmDslParser.g:2185:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==Match) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==Mask) ) {
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
                            // InternalEldmDslParser.g:2186:8: lv_parser_2_1= Match
                            {
                            lv_parser_2_1=(Token)match(input,Match,FOLLOW_39); if (state.failed) return current;
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
                            // InternalEldmDslParser.g:2197:8: lv_parser_2_2= Mask
                            {
                            lv_parser_2_2=(Token)match(input,Mask,FOLLOW_39); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2210:5: ( (lv_code_3_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:2211:6: (lv_code_3_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:2211:6: (lv_code_3_0= RULE_TEXT )
                    // InternalEldmDslParser.g:2212:7: lv_code_3_0= RULE_TEXT
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
                    // InternalEldmDslParser.g:2230:4: ( (lv_type_4_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:2230:4: ( (lv_type_4_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:2231:5: (lv_type_4_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:2231:5: (lv_type_4_0= ruleElementDef )
                    // InternalEldmDslParser.g:2232:6: lv_type_4_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getTypeElementDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleElementDef();

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


    // $ANTLR start "entryRuleElementDef"
    // InternalEldmDslParser.g:2254:1: entryRuleElementDef returns [EObject current=null] : iv_ruleElementDef= ruleElementDef EOF ;
    public final EObject entryRuleElementDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDef = null;


        try {
            // InternalEldmDslParser.g:2254:51: (iv_ruleElementDef= ruleElementDef EOF )
            // InternalEldmDslParser.g:2255:2: iv_ruleElementDef= ruleElementDef EOF
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
    // InternalEldmDslParser.g:2261:1: ruleElementDef returns [EObject current=null] : ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef ) ;
    public final EObject ruleElementDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_native_0_0 = null;

        EObject this_ListDef_2 = null;

        EObject this_MapDef_3 = null;

        EObject this_EnumDef_4 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2267:2: ( ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef ) )
            // InternalEldmDslParser.g:2268:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef )
            {
            // InternalEldmDslParser.g:2268:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef )
            int alt40=5;
            switch ( input.LA(1) ) {
            case Bool:
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
                alt40=1;
                }
                break;
            case Enum:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    int LA40_6 = input.LA(3);

                    if ( (LA40_6==RULE_BEGIN) ) {
                        int LA40_8 = input.LA(4);

                        if ( (LA40_8==Let||LA40_8==Var||LA40_8==RULE_END) ) {
                            alt40=1;
                        }
                        else if ( (LA40_8==RULE_ID) ) {
                            alt40=5;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case Typedef:
                case And:
                case Let:
                case Var:
                case ExclamationMarkEqualsSign:
                case LessThanSignEqualsSign:
                case EqualsSignEqualsSign:
                case GreaterThanSignEqualsSign:
                case Is:
                case Or:
                case LineFeed:
                case CarriageReturn:
                case RightParenthesis:
                case Asterisk:
                case Comma:
                case LessThanSign:
                case EqualsSign:
                case GreaterThanSign:
                case RightCurlyBracket:
                case RULE_END:
                case RULE_ID:
                    {
                    alt40=1;
                    }
                    break;
                case LeftCurlyBracket:
                    {
                    alt40=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt40=2;
                }
                break;
            case FullStopFullStop:
                {
                alt40=3;
                }
                break;
            case LeftCurlyBracket:
                {
                alt40=4;
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
                    // InternalEldmDslParser.g:2269:3: ( (lv_native_0_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:2269:3: ( (lv_native_0_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:2270:4: (lv_native_0_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:2270:4: (lv_native_0_0= ruleNativeDef )
                    // InternalEldmDslParser.g:2271:5: lv_native_0_0= ruleNativeDef
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
                    // InternalEldmDslParser.g:2289:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:2289:3: ( (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:2290:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2290:4: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:2291:5: otherlv_1= RULE_ID
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
                    // InternalEldmDslParser.g:2303:3: this_ListDef_2= ruleListDef
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
                    // InternalEldmDslParser.g:2312:3: this_MapDef_3= ruleMapDef
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
                case 5 :
                    // InternalEldmDslParser.g:2321:3: this_EnumDef_4= ruleEnumDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementDefAccess().getEnumDefParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumDef_4=ruleEnumDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumDef_4;
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
    // InternalEldmDslParser.g:2333:1: entryRuleMapDef returns [EObject current=null] : iv_ruleMapDef= ruleMapDef EOF ;
    public final EObject entryRuleMapDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapDef = null;


        try {
            // InternalEldmDslParser.g:2333:47: (iv_ruleMapDef= ruleMapDef EOF )
            // InternalEldmDslParser.g:2334:2: iv_ruleMapDef= ruleMapDef EOF
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
    // InternalEldmDslParser.g:2340:1: ruleMapDef returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) ) ;
    public final EObject ruleMapDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_ext_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token lv_ext_14_0=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        EObject lv_defs_2_0 = null;

        EObject lv_defs_4_0 = null;

        EObject lv_defs_11_0 = null;

        EObject lv_defs_13_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2346:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:2347:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:2347:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==LeftCurlyBracket) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_BEGIN) ) {
                    alt47=2;
                }
                else if ( (LA47_1==RULE_ID) && (synpred10_InternalEldmDslParser())) {
                    alt47=1;
                }
                else if ( (LA47_1==Comma) && (synpred10_InternalEldmDslParser())) {
                    alt47=1;
                }
                else if ( (LA47_1==RightCurlyBracket) && (synpred10_InternalEldmDslParser())) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalEldmDslParser.g:2348:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:2348:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:2349:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2379:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket )
                    // InternalEldmDslParser.g:2380:5: () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2380:5: ()
                    // InternalEldmDslParser.g:2381:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapDefAccess().getMapDefAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2391:5: ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalEldmDslParser.g:2392:6: ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2392:6: ( (lv_defs_2_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2393:7: (lv_defs_2_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2393:7: (lv_defs_2_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2394:8: lv_defs_2_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_41);
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

                            // InternalEldmDslParser.g:2411:6: (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==Comma) ) {
                                    int LA41_1 = input.LA(2);

                                    if ( (LA41_1==RULE_ID) ) {
                                        alt41=1;
                                    }


                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2412:7: otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:2416:7: ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2417:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2417:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2418:9: lv_defs_4_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_41);
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
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:2437:5: (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==Comma) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalEldmDslParser.g:2438:6: otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) )
                            {
                            otherlv_5=(Token)match(input,Comma,FOLLOW_42); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_3_0());
                              					
                            }
                            // InternalEldmDslParser.g:2442:6: ( (lv_ext_6_0= Asterisk ) )
                            // InternalEldmDslParser.g:2443:7: (lv_ext_6_0= Asterisk )
                            {
                            // InternalEldmDslParser.g:2443:7: (lv_ext_6_0= Asterisk )
                            // InternalEldmDslParser.g:2444:8: lv_ext_6_0= Asterisk
                            {
                            lv_ext_6_0=(Token)match(input,Asterisk,FOLLOW_43); if (state.failed) return current;
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
                    // InternalEldmDslParser.g:2464:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2464:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket )
                    // InternalEldmDslParser.g:2465:4: () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2465:4: ()
                    // InternalEldmDslParser.g:2466:5: 
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
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_10, grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:2480:4: ( ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalEldmDslParser.g:2481:5: ( (lv_defs_11_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2481:5: ( (lv_defs_11_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2482:6: (lv_defs_11_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2482:6: (lv_defs_11_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2483:7: lv_defs_11_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_45);
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

                            // InternalEldmDslParser.g:2500:5: ( ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==EOF||(LA44_0>=LineFeed && LA44_0<=CarriageReturn)||LA44_0==RULE_ID) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2501:6: ruleBREAK ( (lv_defs_13_0= ruleMapEntryDef ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapDefAccess().getBREAKParserRuleCall_1_3_1_0());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_10);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:2508:6: ( (lv_defs_13_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2509:7: (lv_defs_13_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2509:7: (lv_defs_13_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2510:8: lv_defs_13_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_45);
                            	    lv_defs_13_0=ruleMapEntryDef();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getMapDefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"defs",
                            	      									lv_defs_13_0,
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

                    // InternalEldmDslParser.g:2529:4: ( (lv_ext_14_0= Asterisk ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==Asterisk) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalEldmDslParser.g:2530:5: (lv_ext_14_0= Asterisk )
                            {
                            // InternalEldmDslParser.g:2530:5: (lv_ext_14_0= Asterisk )
                            // InternalEldmDslParser.g:2531:6: lv_ext_14_0= Asterisk
                            {
                            lv_ext_14_0=(Token)match(input,Asterisk,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_ext_14_0, grammarAccess.getMapDefAccess().getExtAsteriskKeyword_1_4_0());
                              					
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

                    this_END_15=(Token)match(input,RULE_END,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_15, grammarAccess.getMapDefAccess().getENDTerminalRuleCall_1_5());
                      			
                    }
                    otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_1_6());
                      			
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
    // InternalEldmDslParser.g:2556:1: entryRuleMapEntryDef returns [EObject current=null] : iv_ruleMapEntryDef= ruleMapEntryDef EOF ;
    public final EObject entryRuleMapEntryDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryDef = null;


        try {
            // InternalEldmDslParser.g:2556:52: (iv_ruleMapEntryDef= ruleMapEntryDef EOF )
            // InternalEldmDslParser.g:2557:2: iv_ruleMapEntryDef= ruleMapEntryDef EOF
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
    // InternalEldmDslParser.g:2563:1: ruleMapEntryDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) ;
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
            // InternalEldmDslParser.g:2569:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? ) )
            // InternalEldmDslParser.g:2570:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            {
            // InternalEldmDslParser.g:2570:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )? )
            // InternalEldmDslParser.g:2571:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            {
            // InternalEldmDslParser.g:2571:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2572:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2572:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2573:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2589:3: ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Colon||LA49_0==QuestionMark) ) {
                alt49=1;
            }
            else if ( (LA49_0==EqualsSign) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // InternalEldmDslParser.g:2590:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    {
                    // InternalEldmDslParser.g:2590:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    // InternalEldmDslParser.g:2591:5: ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:2591:5: ( (lv_opt_1_0= QuestionMark ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==QuestionMark) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalEldmDslParser.g:2592:6: (lv_opt_1_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:2592:6: (lv_opt_1_0= QuestionMark )
                            // InternalEldmDslParser.g:2593:7: lv_opt_1_0= QuestionMark
                            {
                            lv_opt_1_0=(Token)match(input,QuestionMark,FOLLOW_22); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,Colon,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMapEntryDefAccess().getColonKeyword_1_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2609:5: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:2610:6: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:2610:6: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:2611:7: lv_type_3_0= ruleElementDef
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
                    // InternalEldmDslParser.g:2630:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    {
                    // InternalEldmDslParser.g:2630:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    // InternalEldmDslParser.g:2631:5: ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:2631:5: ( (lv_opt_4_0= EqualsSign ) )
                    // InternalEldmDslParser.g:2632:6: (lv_opt_4_0= EqualsSign )
                    {
                    // InternalEldmDslParser.g:2632:6: (lv_opt_4_0= EqualsSign )
                    // InternalEldmDslParser.g:2633:7: lv_opt_4_0= EqualsSign
                    {
                    lv_opt_4_0=(Token)match(input,EqualsSign,FOLLOW_29); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2645:5: ( (lv_value_5_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:2646:6: (lv_value_5_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:2646:6: (lv_value_5_0= ruleLiteral )
                    // InternalEldmDslParser.g:2647:7: lv_value_5_0= ruleLiteral
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
    // InternalEldmDslParser.g:2670:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalEldmDslParser.g:2670:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalEldmDslParser.g:2671:2: iv_ruleListDef= ruleListDef EOF
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
    // InternalEldmDslParser.g:2677:1: ruleListDef returns [EObject current=null] : ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2683:2: ( ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) )
            // InternalEldmDslParser.g:2684:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            {
            // InternalEldmDslParser.g:2684:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            // InternalEldmDslParser.g:2685:3: () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) )
            {
            // InternalEldmDslParser.g:2685:3: ()
            // InternalEldmDslParser.g:2686:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListDefAccess().getListDefAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListDefAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalEldmDslParser.g:2696:3: ( (lv_type_2_0= ruleElementDef ) )
            // InternalEldmDslParser.g:2697:4: (lv_type_2_0= ruleElementDef )
            {
            // InternalEldmDslParser.g:2697:4: (lv_type_2_0= ruleElementDef )
            // InternalEldmDslParser.g:2698:5: lv_type_2_0= ruleElementDef
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
    // InternalEldmDslParser.g:2719:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // InternalEldmDslParser.g:2719:48: (iv_ruleEnumDef= ruleEnumDef EOF )
            // InternalEldmDslParser.g:2720:2: iv_ruleEnumDef= ruleEnumDef EOF
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
    // InternalEldmDslParser.g:2726:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) ;
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
            // InternalEldmDslParser.g:2732:2: ( (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) )
            // InternalEldmDslParser.g:2733:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            {
            // InternalEldmDslParser.g:2733:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            // InternalEldmDslParser.g:2734:3: otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Enum,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2738:3: ( (lv_type_1_0= ruleMapDef ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LeftCurlyBracket) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEldmDslParser.g:2739:4: (lv_type_1_0= ruleMapDef )
                    {
                    // InternalEldmDslParser.g:2739:4: (lv_type_1_0= ruleMapDef )
                    // InternalEldmDslParser.g:2740:5: lv_type_1_0= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefAccess().getTypeMapDefParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
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
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getEnumDefAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalEldmDslParser.g:2765:3: ( (lv_defs_4_0= ruleEnumItemDef ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalEldmDslParser.g:2766:4: (lv_defs_4_0= ruleEnumItemDef )
            	    {
            	    // InternalEldmDslParser.g:2766:4: (lv_defs_4_0= ruleEnumItemDef )
            	    // InternalEldmDslParser.g:2767:5: lv_defs_4_0= ruleEnumItemDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_49);
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
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // InternalEldmDslParser.g:2792:1: entryRuleEnumItemDef returns [EObject current=null] : iv_ruleEnumItemDef= ruleEnumItemDef EOF ;
    public final EObject entryRuleEnumItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItemDef = null;


        try {
            // InternalEldmDslParser.g:2792:52: (iv_ruleEnumItemDef= ruleEnumItemDef EOF )
            // InternalEldmDslParser.g:2793:2: iv_ruleEnumItemDef= ruleEnumItemDef EOF
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
    // InternalEldmDslParser.g:2799:1: ruleEnumItemDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) ;
    public final EObject ruleEnumItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2805:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) )
            // InternalEldmDslParser.g:2806:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            {
            // InternalEldmDslParser.g:2806:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            // InternalEldmDslParser.g:2807:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )?
            {
            // InternalEldmDslParser.g:2807:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2808:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2808:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2809:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2825:3: ( (lv_value_1_0= ruleMapLiteral ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LeftCurlyBracket) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEldmDslParser.g:2826:4: (lv_value_1_0= ruleMapLiteral )
                    {
                    // InternalEldmDslParser.g:2826:4: (lv_value_1_0= ruleMapLiteral )
                    // InternalEldmDslParser.g:2827:5: lv_value_1_0= ruleMapLiteral
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
    // InternalEldmDslParser.g:2848:1: entryRuleNativeDef returns [String current=null] : iv_ruleNativeDef= ruleNativeDef EOF ;
    public final String entryRuleNativeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNativeDef = null;


        try {
            // InternalEldmDslParser.g:2848:49: (iv_ruleNativeDef= ruleNativeDef EOF )
            // InternalEldmDslParser.g:2849:2: iv_ruleNativeDef= ruleNativeDef EOF
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
    // InternalEldmDslParser.g:2855:1: ruleNativeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) ;
    public final AntlrDatatypeRuleToken ruleNativeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2861:2: ( (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) )
            // InternalEldmDslParser.g:2862:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            {
            // InternalEldmDslParser.g:2862:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            int alt53=12;
            switch ( input.LA(1) ) {
            case Any:
                {
                alt53=1;
                }
                break;
            case Path:
                {
                alt53=2;
                }
                break;
            case Bool:
                {
                alt53=3;
                }
                break;
            case Str:
                {
                alt53=4;
                }
                break;
            case Int:
                {
                alt53=5;
                }
                break;
            case Flt:
                {
                alt53=6;
                }
                break;
            case Lda:
                {
                alt53=7;
                }
                break;
            case Ltm:
                {
                alt53=8;
                }
                break;
            case Ldt:
                {
                alt53=9;
                }
                break;
            case Map:
                {
                alt53=10;
                }
                break;
            case Lst:
                {
                alt53=11;
                }
                break;
            case Enum:
                {
                alt53=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalEldmDslParser.g:2863:3: kw= Any
                    {
                    kw=(Token)match(input,Any,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getAnyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2869:3: kw= Path
                    {
                    kw=(Token)match(input,Path,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getPathKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:2875:3: kw= Bool
                    {
                    kw=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getBoolKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:2881:3: kw= Str
                    {
                    kw=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getStrKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:2887:3: kw= Int
                    {
                    kw=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getIntKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:2893:3: kw= Flt
                    {
                    kw=(Token)match(input,Flt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getFltKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:2899:3: kw= Lda
                    {
                    kw=(Token)match(input,Lda,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdaKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:2905:3: kw= Ltm
                    {
                    kw=(Token)match(input,Ltm,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLtmKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:2911:3: kw= Ldt
                    {
                    kw=(Token)match(input,Ldt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdtKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEldmDslParser.g:2917:3: kw= Map
                    {
                    kw=(Token)match(input,Map,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getMapKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEldmDslParser.g:2923:3: kw= Lst
                    {
                    kw=(Token)match(input,Lst,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLstKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEldmDslParser.g:2929:3: kw= Enum
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
    // InternalEldmDslParser.g:2938:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEldmDslParser.g:2938:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEldmDslParser.g:2939:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEldmDslParser.g:2945:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral ) ;
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
            // InternalEldmDslParser.g:2951:2: ( (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral ) )
            // InternalEldmDslParser.g:2952:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )
            {
            // InternalEldmDslParser.g:2952:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )
            int alt54=12;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalEldmDslParser.g:2953:3: this_BoolLiteral_0= ruleBoolLiteral
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
                    // InternalEldmDslParser.g:2962:3: this_StrLiteral_1= ruleStrLiteral
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
                    // InternalEldmDslParser.g:2971:3: this_IntLiteral_2= ruleIntLiteral
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
                    // InternalEldmDslParser.g:2980:3: this_FltLiteral_3= ruleFltLiteral
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
                    // InternalEldmDslParser.g:2989:3: this_DateLiteral_4= ruleDateLiteral
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
                    // InternalEldmDslParser.g:2998:3: this_TimeLiteral_5= ruleTimeLiteral
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
                    // InternalEldmDslParser.g:3007:3: this_DateTimeLiteral_6= ruleDateTimeLiteral
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
                    // InternalEldmDslParser.g:3016:3: this_PathLiteral_7= rulePathLiteral
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
                    // InternalEldmDslParser.g:3025:3: this_ListLiteral_8= ruleListLiteral
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
                    // InternalEldmDslParser.g:3034:3: this_MapLiteral_9= ruleMapLiteral
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
                    // InternalEldmDslParser.g:3043:3: this_EnumLiteral_10= ruleEnumLiteral
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
                    // InternalEldmDslParser.g:3052:3: this_PatternLiteral_11= rulePatternLiteral
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
    // InternalEldmDslParser.g:3064:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalEldmDslParser.g:3064:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalEldmDslParser.g:3065:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
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
    // InternalEldmDslParser.g:3071:1: ruleBoolLiteral returns [EObject current=null] : ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3077:2: ( ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) ) )
            // InternalEldmDslParser.g:3078:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            {
            // InternalEldmDslParser.g:3078:2: ( () (otherlv_1= False | ( (lv_value_2_0= True ) ) ) )
            // InternalEldmDslParser.g:3079:3: () (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            {
            // InternalEldmDslParser.g:3079:3: ()
            // InternalEldmDslParser.g:3080:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3086:3: (otherlv_1= False | ( (lv_value_2_0= True ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==False) ) {
                alt55=1;
            }
            else if ( (LA55_0==True) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalEldmDslParser.g:3087:4: otherlv_1= False
                    {
                    otherlv_1=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3092:4: ( (lv_value_2_0= True ) )
                    {
                    // InternalEldmDslParser.g:3092:4: ( (lv_value_2_0= True ) )
                    // InternalEldmDslParser.g:3093:5: (lv_value_2_0= True )
                    {
                    // InternalEldmDslParser.g:3093:5: (lv_value_2_0= True )
                    // InternalEldmDslParser.g:3094:6: lv_value_2_0= True
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
    // InternalEldmDslParser.g:3111:1: entryRuleStrLiteral returns [EObject current=null] : iv_ruleStrLiteral= ruleStrLiteral EOF ;
    public final EObject entryRuleStrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrLiteral = null;


        try {
            // InternalEldmDslParser.g:3111:51: (iv_ruleStrLiteral= ruleStrLiteral EOF )
            // InternalEldmDslParser.g:3112:2: iv_ruleStrLiteral= ruleStrLiteral EOF
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
    // InternalEldmDslParser.g:3118:1: ruleStrLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT ) ) ;
    public final EObject ruleStrLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3124:2: ( ( (lv_value_0_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3125:2: ( (lv_value_0_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3125:2: ( (lv_value_0_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3126:3: (lv_value_0_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3126:3: (lv_value_0_0= RULE_TEXT )
            // InternalEldmDslParser.g:3127:4: lv_value_0_0= RULE_TEXT
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
    // InternalEldmDslParser.g:3146:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalEldmDslParser.g:3146:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalEldmDslParser.g:3147:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalEldmDslParser.g:3153:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3159:2: ( ( (lv_value_0_0= RULE_NATURAL ) ) )
            // InternalEldmDslParser.g:3160:2: ( (lv_value_0_0= RULE_NATURAL ) )
            {
            // InternalEldmDslParser.g:3160:2: ( (lv_value_0_0= RULE_NATURAL ) )
            // InternalEldmDslParser.g:3161:3: (lv_value_0_0= RULE_NATURAL )
            {
            // InternalEldmDslParser.g:3161:3: (lv_value_0_0= RULE_NATURAL )
            // InternalEldmDslParser.g:3162:4: lv_value_0_0= RULE_NATURAL
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
    // InternalEldmDslParser.g:3181:1: entryRuleFltLiteral returns [EObject current=null] : iv_ruleFltLiteral= ruleFltLiteral EOF ;
    public final EObject entryRuleFltLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFltLiteral = null;


        try {
            // InternalEldmDslParser.g:3181:51: (iv_ruleFltLiteral= ruleFltLiteral EOF )
            // InternalEldmDslParser.g:3182:2: iv_ruleFltLiteral= ruleFltLiteral EOF
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
    // InternalEldmDslParser.g:3188:1: ruleFltLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFltLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3194:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalEldmDslParser.g:3195:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalEldmDslParser.g:3195:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalEldmDslParser.g:3196:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalEldmDslParser.g:3196:3: (lv_value_0_0= RULE_FLOAT )
            // InternalEldmDslParser.g:3197:4: lv_value_0_0= RULE_FLOAT
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
    // InternalEldmDslParser.g:3216:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // InternalEldmDslParser.g:3216:52: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // InternalEldmDslParser.g:3217:2: iv_ruleDateLiteral= ruleDateLiteral EOF
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
    // InternalEldmDslParser.g:3223:1: ruleDateLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE ) ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3229:2: ( ( (lv_value_0_0= RULE_DATE ) ) )
            // InternalEldmDslParser.g:3230:2: ( (lv_value_0_0= RULE_DATE ) )
            {
            // InternalEldmDslParser.g:3230:2: ( (lv_value_0_0= RULE_DATE ) )
            // InternalEldmDslParser.g:3231:3: (lv_value_0_0= RULE_DATE )
            {
            // InternalEldmDslParser.g:3231:3: (lv_value_0_0= RULE_DATE )
            // InternalEldmDslParser.g:3232:4: lv_value_0_0= RULE_DATE
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
    // InternalEldmDslParser.g:3251:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3251:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEldmDslParser.g:3252:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
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
    // InternalEldmDslParser.g:3258:1: ruleTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TIME ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3264:2: ( ( (lv_value_0_0= RULE_TIME ) ) )
            // InternalEldmDslParser.g:3265:2: ( (lv_value_0_0= RULE_TIME ) )
            {
            // InternalEldmDslParser.g:3265:2: ( (lv_value_0_0= RULE_TIME ) )
            // InternalEldmDslParser.g:3266:3: (lv_value_0_0= RULE_TIME )
            {
            // InternalEldmDslParser.g:3266:3: (lv_value_0_0= RULE_TIME )
            // InternalEldmDslParser.g:3267:4: lv_value_0_0= RULE_TIME
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
    // InternalEldmDslParser.g:3286:1: entryRuleDateTimeLiteral returns [EObject current=null] : iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF ;
    public final EObject entryRuleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3286:56: (iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF )
            // InternalEldmDslParser.g:3287:2: iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF
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
    // InternalEldmDslParser.g:3293:1: ruleDateTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATETIME ) ) ;
    public final EObject ruleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3299:2: ( ( (lv_value_0_0= RULE_DATETIME ) ) )
            // InternalEldmDslParser.g:3300:2: ( (lv_value_0_0= RULE_DATETIME ) )
            {
            // InternalEldmDslParser.g:3300:2: ( (lv_value_0_0= RULE_DATETIME ) )
            // InternalEldmDslParser.g:3301:3: (lv_value_0_0= RULE_DATETIME )
            {
            // InternalEldmDslParser.g:3301:3: (lv_value_0_0= RULE_DATETIME )
            // InternalEldmDslParser.g:3302:4: lv_value_0_0= RULE_DATETIME
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
    // InternalEldmDslParser.g:3321:1: entryRulePathLiteral returns [EObject current=null] : iv_rulePathLiteral= rulePathLiteral EOF ;
    public final EObject entryRulePathLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathLiteral = null;


        try {
            // InternalEldmDslParser.g:3321:52: (iv_rulePathLiteral= rulePathLiteral EOF )
            // InternalEldmDslParser.g:3322:2: iv_rulePathLiteral= rulePathLiteral EOF
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
    // InternalEldmDslParser.g:3328:1: rulePathLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_PATH ) ) ;
    public final EObject rulePathLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3334:2: ( ( (lv_value_0_0= RULE_PATH ) ) )
            // InternalEldmDslParser.g:3335:2: ( (lv_value_0_0= RULE_PATH ) )
            {
            // InternalEldmDslParser.g:3335:2: ( (lv_value_0_0= RULE_PATH ) )
            // InternalEldmDslParser.g:3336:3: (lv_value_0_0= RULE_PATH )
            {
            // InternalEldmDslParser.g:3336:3: (lv_value_0_0= RULE_PATH )
            // InternalEldmDslParser.g:3337:4: lv_value_0_0= RULE_PATH
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
    // InternalEldmDslParser.g:3356:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalEldmDslParser.g:3356:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalEldmDslParser.g:3357:2: iv_ruleListLiteral= ruleListLiteral EOF
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
    // InternalEldmDslParser.g:3363:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vals_2_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3369:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEldmDslParser.g:3370:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEldmDslParser.g:3370:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEldmDslParser.g:3371:3: () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEldmDslParser.g:3371:3: ()
            // InternalEldmDslParser.g:3372:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3382:3: ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==False||(LA57_0>=Bool && LA57_0<=Enum)||(LA57_0>=Path && LA57_0<=True)||LA57_0==Any||LA57_0==Flt||(LA57_0>=Int && LA57_0<=Ldt)||(LA57_0>=Lst && LA57_0<=Map)||LA57_0==Str||(LA57_0>=CommercialAt && LA57_0<=LeftSquareBracket)||LA57_0==LeftCurlyBracket||(LA57_0>=RULE_PATH && LA57_0<=RULE_ID)||(LA57_0>=RULE_NATURAL && LA57_0<=RULE_TEXT)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalEldmDslParser.g:3383:4: ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    {
                    // InternalEldmDslParser.g:3383:4: ( (lv_vals_2_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:3384:5: (lv_vals_2_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:3384:5: (lv_vals_2_0= ruleLiteral )
                    // InternalEldmDslParser.g:3385:6: lv_vals_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
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

                    // InternalEldmDslParser.g:3402:4: (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==Comma) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:3403:5: otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEldmDslParser.g:3407:5: ( (lv_vals_4_0= ruleLiteral ) )
                    	    // InternalEldmDslParser.g:3408:6: (lv_vals_4_0= ruleLiteral )
                    	    {
                    	    // InternalEldmDslParser.g:3408:6: (lv_vals_4_0= ruleLiteral )
                    	    // InternalEldmDslParser.g:3409:7: lv_vals_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_52);
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
                    	    break loop56;
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
    // InternalEldmDslParser.g:3436:1: entryRuleMapLiteral returns [EObject current=null] : iv_ruleMapLiteral= ruleMapLiteral EOF ;
    public final EObject entryRuleMapLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteral = null;


        try {
            // InternalEldmDslParser.g:3436:51: (iv_ruleMapLiteral= ruleMapLiteral EOF )
            // InternalEldmDslParser.g:3437:2: iv_ruleMapLiteral= ruleMapLiteral EOF
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
    // InternalEldmDslParser.g:3443:1: ruleMapLiteral returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) ) ;
    public final EObject ruleMapLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_ext_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token lv_ext_14_0=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;

        EObject lv_entries_11_0 = null;

        EObject lv_entries_13_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3449:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:3450:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:3450:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) ) | ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LeftCurlyBracket) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==RULE_BEGIN) ) {
                    alt64=2;
                }
                else if ( (LA64_1==RULE_ID) && (synpred11_InternalEldmDslParser())) {
                    alt64=1;
                }
                else if ( (LA64_1==Comma) && (synpred11_InternalEldmDslParser())) {
                    alt64=1;
                }
                else if ( (LA64_1==RightCurlyBracket) && (synpred11_InternalEldmDslParser())) {
                    alt64=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalEldmDslParser.g:3451:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:3451:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:3452:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3482:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket )
                    // InternalEldmDslParser.g:3483:5: () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )? otherlv_7= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3483:5: ()
                    // InternalEldmDslParser.g:3484:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapLiteralAccess().getMapLiteralAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:3494:5: ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_ID) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalEldmDslParser.g:3495:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3495:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3496:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3496:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3497:8: lv_entries_2_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_41);
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

                            // InternalEldmDslParser.g:3514:6: (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
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
                            	    // InternalEldmDslParser.g:3515:7: otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:3519:7: ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3520:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3520:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3521:9: lv_entries_4_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_41);
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
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:3540:5: (otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==Comma) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalEldmDslParser.g:3541:6: otherlv_5= Comma ( (lv_ext_6_0= Asterisk ) )
                            {
                            otherlv_5=(Token)match(input,Comma,FOLLOW_42); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_0_3_0());
                              					
                            }
                            // InternalEldmDslParser.g:3545:6: ( (lv_ext_6_0= Asterisk ) )
                            // InternalEldmDslParser.g:3546:7: (lv_ext_6_0= Asterisk )
                            {
                            // InternalEldmDslParser.g:3546:7: (lv_ext_6_0= Asterisk )
                            // InternalEldmDslParser.g:3547:8: lv_ext_6_0= Asterisk
                            {
                            lv_ext_6_0=(Token)match(input,Asterisk,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_ext_6_0, grammarAccess.getMapLiteralAccess().getExtAsteriskKeyword_0_0_3_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getMapLiteralRule());
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

                      					newLeafNode(otherlv_7, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_0_0_4());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:3567:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3567:3: ( () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket )
                    // InternalEldmDslParser.g:3568:4: () otherlv_9= LeftCurlyBracket this_BEGIN_10= RULE_BEGIN ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )? ( (lv_ext_14_0= Asterisk ) )? this_END_15= RULE_END otherlv_16= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3568:4: ()
                    // InternalEldmDslParser.g:3569:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMapLiteralAccess().getMapLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,LeftCurlyBracket,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_10, grammarAccess.getMapLiteralAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:3583:4: ( ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )* )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_ID) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalEldmDslParser.g:3584:5: ( (lv_entries_11_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3584:5: ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3585:6: (lv_entries_11_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3585:6: (lv_entries_11_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3586:7: lv_entries_11_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_45);
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

                            // InternalEldmDslParser.g:3603:5: ( ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==EOF||(LA61_0>=LineFeed && LA61_0<=CarriageReturn)||LA61_0==RULE_ID) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3604:6: ruleBREAK ( (lv_entries_13_0= ruleMapEntryLiteral ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapLiteralAccess().getBREAKParserRuleCall_1_3_1_0());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_10);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:3611:6: ( (lv_entries_13_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3612:7: (lv_entries_13_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3612:7: (lv_entries_13_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3613:8: lv_entries_13_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_45);
                            	    lv_entries_13_0=ruleMapEntryLiteral();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getMapLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"entries",
                            	      									lv_entries_13_0,
                            	      									"net.eldm.EldmDsl.MapEntryLiteral");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop61;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalEldmDslParser.g:3632:4: ( (lv_ext_14_0= Asterisk ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==Asterisk) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalEldmDslParser.g:3633:5: (lv_ext_14_0= Asterisk )
                            {
                            // InternalEldmDslParser.g:3633:5: (lv_ext_14_0= Asterisk )
                            // InternalEldmDslParser.g:3634:6: lv_ext_14_0= Asterisk
                            {
                            lv_ext_14_0=(Token)match(input,Asterisk,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_ext_14_0, grammarAccess.getMapLiteralAccess().getExtAsteriskKeyword_1_4_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMapLiteralRule());
                              						}
                              						setWithLastConsumed(current, "ext", true, "*");
                              					
                            }

                            }


                            }
                            break;

                    }

                    this_END_15=(Token)match(input,RULE_END,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_15, grammarAccess.getMapLiteralAccess().getENDTerminalRuleCall_1_5());
                      			
                    }
                    otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getMapLiteralAccess().getRightCurlyBracketKeyword_1_6());
                      			
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
    // InternalEldmDslParser.g:3659:1: entryRuleMapEntryLiteral returns [EObject current=null] : iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF ;
    public final EObject entryRuleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryLiteral = null;


        try {
            // InternalEldmDslParser.g:3659:56: (iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF )
            // InternalEldmDslParser.g:3660:2: iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF
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
    // InternalEldmDslParser.g:3666:1: ruleMapEntryLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3672:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalEldmDslParser.g:3673:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalEldmDslParser.g:3673:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalEldmDslParser.g:3674:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalEldmDslParser.g:3674:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:3675:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:3675:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:3676:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3696:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalEldmDslParser.g:3697:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalEldmDslParser.g:3697:4: (lv_value_2_0= ruleLiteral )
            // InternalEldmDslParser.g:3698:5: lv_value_2_0= ruleLiteral
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
    // InternalEldmDslParser.g:3719:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalEldmDslParser.g:3719:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalEldmDslParser.g:3720:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalEldmDslParser.g:3726:1: ruleEnumLiteral returns [EObject current=null] : ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3732:2: ( ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:3733:2: ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:3733:2: ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) )
            // InternalEldmDslParser.g:3734:3: () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) )
            {
            // InternalEldmDslParser.g:3734:3: ()
            // InternalEldmDslParser.g:3735:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,CommercialAt,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getCommercialAtKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3745:3: ( (otherlv_2= RULE_ID ) )
            // InternalEldmDslParser.g:3746:4: (otherlv_2= RULE_ID )
            {
            // InternalEldmDslParser.g:3746:4: (otherlv_2= RULE_ID )
            // InternalEldmDslParser.g:3747:5: otherlv_2= RULE_ID
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
    // InternalEldmDslParser.g:3762:1: entryRulePatternLiteral returns [EObject current=null] : iv_rulePatternLiteral= rulePatternLiteral EOF ;
    public final EObject entryRulePatternLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternLiteral = null;


        try {
            // InternalEldmDslParser.g:3762:55: (iv_rulePatternLiteral= rulePatternLiteral EOF )
            // InternalEldmDslParser.g:3763:2: iv_rulePatternLiteral= rulePatternLiteral EOF
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
    // InternalEldmDslParser.g:3769:1: rulePatternLiteral returns [EObject current=null] : ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) ;
    public final EObject rulePatternLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        AntlrDatatypeRuleToken lv_native_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3775:2: ( ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) )
            // InternalEldmDslParser.g:3776:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            {
            // InternalEldmDslParser.g:3776:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3777:3: () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3777:3: ()
            // InternalEldmDslParser.g:3778:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3784:3: ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=Bool && LA65_0<=Enum)||LA65_0==Path||LA65_0==Any||LA65_0==Flt||(LA65_0>=Int && LA65_0<=Ldt)||(LA65_0>=Lst && LA65_0<=Map)||LA65_0==Str) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalEldmDslParser.g:3785:4: ( (lv_native_1_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:3785:4: ( (lv_native_1_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:3786:5: (lv_native_1_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:3786:5: (lv_native_1_0= ruleNativeDef )
                    // InternalEldmDslParser.g:3787:6: lv_native_1_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternLiteralAccess().getNativeNativeDefParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
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
                    // InternalEldmDslParser.g:3805:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:3805:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEldmDslParser.g:3806:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEldmDslParser.g:3806:5: (otherlv_2= RULE_ID )
                    // InternalEldmDslParser.g:3807:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternLiteralRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPatternLiteralAccess().getRefDefinitionCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,CommercialAt,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2());
              		
            }
            // InternalEldmDslParser.g:3823:3: ( (lv_text_4_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3824:4: (lv_text_4_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3824:4: (lv_text_4_0= RULE_TEXT )
            // InternalEldmDslParser.g:3825:5: lv_text_4_0= RULE_TEXT
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
    // InternalEldmDslParser.g:3845:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalEldmDslParser.g:3845:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalEldmDslParser.g:3846:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalEldmDslParser.g:3852:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LineFeed | kw= CarriageReturn )* ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3858:2: ( (kw= LineFeed | kw= CarriageReturn )* )
            // InternalEldmDslParser.g:3859:2: (kw= LineFeed | kw= CarriageReturn )*
            {
            // InternalEldmDslParser.g:3859:2: (kw= LineFeed | kw= CarriageReturn )*
            loop66:
            do {
                int alt66=3;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==LineFeed) ) {
                    alt66=1;
                }
                else if ( (LA66_0==CarriageReturn) ) {
                    alt66=2;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalEldmDslParser.g:3860:3: kw= LineFeed
            	    {
            	    kw=(Token)match(input,LineFeed,FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getLineFeedKeyword_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEldmDslParser.g:3866:3: kw= CarriageReturn
            	    {
            	    kw=(Token)match(input,CarriageReturn,FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
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
        // InternalEldmDslParser.g:533:4: ( ( RULE_ID ) )
        // InternalEldmDslParser.g:533:5: ( RULE_ID )
        {
        // InternalEldmDslParser.g:533:5: ( RULE_ID )
        // InternalEldmDslParser.g:534:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEldmDslParser

    // $ANTLR start synpred2_InternalEldmDslParser
    public final void synpred2_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1169:5: ( ( () ( ( Or ) ) ) )
        // InternalEldmDslParser.g:1169:6: ( () ( ( Or ) ) )
        {
        // InternalEldmDslParser.g:1169:6: ( () ( ( Or ) ) )
        // InternalEldmDslParser.g:1170:6: () ( ( Or ) )
        {
        // InternalEldmDslParser.g:1170:6: ()
        // InternalEldmDslParser.g:1171:6: 
        {
        }

        // InternalEldmDslParser.g:1172:6: ( ( Or ) )
        // InternalEldmDslParser.g:1173:7: ( Or )
        {
        // InternalEldmDslParser.g:1173:7: ( Or )
        // InternalEldmDslParser.g:1174:8: Or
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
        // InternalEldmDslParser.g:1252:5: ( ( () ( ( And ) ) ) )
        // InternalEldmDslParser.g:1252:6: ( () ( ( And ) ) )
        {
        // InternalEldmDslParser.g:1252:6: ( () ( ( And ) ) )
        // InternalEldmDslParser.g:1253:6: () ( ( And ) )
        {
        // InternalEldmDslParser.g:1253:6: ()
        // InternalEldmDslParser.g:1254:6: 
        {
        }

        // InternalEldmDslParser.g:1255:6: ( ( And ) )
        // InternalEldmDslParser.g:1256:7: ( And )
        {
        // InternalEldmDslParser.g:1256:7: ( And )
        // InternalEldmDslParser.g:1257:8: And
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
        // InternalEldmDslParser.g:1335:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )
        // InternalEldmDslParser.g:1335:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        {
        // InternalEldmDslParser.g:1335:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        // InternalEldmDslParser.g:1336:6: () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        {
        // InternalEldmDslParser.g:1336:6: ()
        // InternalEldmDslParser.g:1337:6: 
        {
        }

        // InternalEldmDslParser.g:1338:6: ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        // InternalEldmDslParser.g:1339:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        {
        // InternalEldmDslParser.g:1339:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        // InternalEldmDslParser.g:1340:8: ( EqualsSignEqualsSign | ExclamationMarkEqualsSign )
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
        // InternalEldmDslParser.g:1436:6: ( ( () ( ( Is ) ) ) )
        // InternalEldmDslParser.g:1436:7: ( () ( ( Is ) ) )
        {
        // InternalEldmDslParser.g:1436:7: ( () ( ( Is ) ) )
        // InternalEldmDslParser.g:1437:7: () ( ( Is ) )
        {
        // InternalEldmDslParser.g:1437:7: ()
        // InternalEldmDslParser.g:1438:7: 
        {
        }

        // InternalEldmDslParser.g:1439:7: ( ( Is ) )
        // InternalEldmDslParser.g:1440:8: ( Is )
        {
        // InternalEldmDslParser.g:1440:8: ( Is )
        // InternalEldmDslParser.g:1441:9: Is
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
        // InternalEldmDslParser.g:1493:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )
        // InternalEldmDslParser.g:1493:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        {
        // InternalEldmDslParser.g:1493:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        // InternalEldmDslParser.g:1494:7: () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        {
        // InternalEldmDslParser.g:1494:7: ()
        // InternalEldmDslParser.g:1495:7: 
        {
        }

        // InternalEldmDslParser.g:1496:7: ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        // InternalEldmDslParser.g:1497:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        {
        // InternalEldmDslParser.g:1497:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        // InternalEldmDslParser.g:1498:9: ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign )
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
        // InternalEldmDslParser.g:1620:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )
        // InternalEldmDslParser.g:1620:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        {
        // InternalEldmDslParser.g:1620:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        // InternalEldmDslParser.g:1621:6: () ( ( ( PlusSign | HyphenMinus ) ) )
        {
        // InternalEldmDslParser.g:1621:6: ()
        // InternalEldmDslParser.g:1622:6: 
        {
        }

        // InternalEldmDslParser.g:1623:6: ( ( ( PlusSign | HyphenMinus ) ) )
        // InternalEldmDslParser.g:1624:7: ( ( PlusSign | HyphenMinus ) )
        {
        // InternalEldmDslParser.g:1624:7: ( ( PlusSign | HyphenMinus ) )
        // InternalEldmDslParser.g:1625:8: ( PlusSign | HyphenMinus )
        {
        if ( input.LA(1)==PlusSign||input.LA(1)==HyphenMinus ) {
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
        // InternalEldmDslParser.g:1720:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )
        // InternalEldmDslParser.g:1720:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalEldmDslParser.g:1720:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        // InternalEldmDslParser.g:1721:6: () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        {
        // InternalEldmDslParser.g:1721:6: ()
        // InternalEldmDslParser.g:1722:6: 
        {
        }

        // InternalEldmDslParser.g:1723:6: ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        // InternalEldmDslParser.g:1724:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        {
        // InternalEldmDslParser.g:1724:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        // InternalEldmDslParser.g:1725:8: ( Asterisk | AsteriskAsterisk | Solidus | PercentSign )
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
        // InternalEldmDslParser.g:1974:5: ( ( RULE_ID ) )
        // InternalEldmDslParser.g:1974:6: ( RULE_ID )
        {
        // InternalEldmDslParser.g:1974:6: ( RULE_ID )
        // InternalEldmDslParser.g:1975:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalEldmDslParser

    // $ANTLR start synpred10_InternalEldmDslParser
    public final void synpred10_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:2349:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:2349:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:2349:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket )
        // InternalEldmDslParser.g:2350:5: () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:2350:5: ()
        // InternalEldmDslParser.g:2351:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_40); if (state.failed) return ;
        // InternalEldmDslParser.g:2353:5: ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )?
        int alt68=2;
        int LA68_0 = input.LA(1);

        if ( (LA68_0==RULE_ID) ) {
            alt68=1;
        }
        switch (alt68) {
            case 1 :
                // InternalEldmDslParser.g:2354:6: ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )*
                {
                // InternalEldmDslParser.g:2354:6: ( ( ruleMapEntryDef ) )
                // InternalEldmDslParser.g:2355:7: ( ruleMapEntryDef )
                {
                // InternalEldmDslParser.g:2355:7: ( ruleMapEntryDef )
                // InternalEldmDslParser.g:2356:8: ruleMapEntryDef
                {
                pushFollow(FOLLOW_41);
                ruleMapEntryDef();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:2359:6: ( Comma ( ( ruleMapEntryDef ) ) )*
                loop67:
                do {
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==Comma) ) {
                        int LA67_1 = input.LA(2);

                        if ( (LA67_1==RULE_ID) ) {
                            alt67=1;
                        }


                    }


                    switch (alt67) {
                	case 1 :
                	    // InternalEldmDslParser.g:2360:7: Comma ( ( ruleMapEntryDef ) )
                	    {
                	    match(input,Comma,FOLLOW_10); if (state.failed) return ;
                	    // InternalEldmDslParser.g:2361:7: ( ( ruleMapEntryDef ) )
                	    // InternalEldmDslParser.g:2362:8: ( ruleMapEntryDef )
                	    {
                	    // InternalEldmDslParser.g:2362:8: ( ruleMapEntryDef )
                	    // InternalEldmDslParser.g:2363:9: ruleMapEntryDef
                	    {
                	    pushFollow(FOLLOW_41);
                	    ruleMapEntryDef();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        // InternalEldmDslParser.g:2368:5: ( Comma ( ( Asterisk ) ) )?
        int alt69=2;
        int LA69_0 = input.LA(1);

        if ( (LA69_0==Comma) ) {
            alt69=1;
        }
        switch (alt69) {
            case 1 :
                // InternalEldmDslParser.g:2369:6: Comma ( ( Asterisk ) )
                {
                match(input,Comma,FOLLOW_42); if (state.failed) return ;
                // InternalEldmDslParser.g:2370:6: ( ( Asterisk ) )
                // InternalEldmDslParser.g:2371:7: ( Asterisk )
                {
                // InternalEldmDslParser.g:2371:7: ( Asterisk )
                // InternalEldmDslParser.g:2372:8: Asterisk
                {
                match(input,Asterisk,FOLLOW_43); if (state.failed) return ;

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
        // InternalEldmDslParser.g:3452:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:3452:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:3452:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket )
        // InternalEldmDslParser.g:3453:5: () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? ( Comma ( ( Asterisk ) ) )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:3453:5: ()
        // InternalEldmDslParser.g:3454:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_40); if (state.failed) return ;
        // InternalEldmDslParser.g:3456:5: ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==RULE_ID) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // InternalEldmDslParser.g:3457:6: ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )*
                {
                // InternalEldmDslParser.g:3457:6: ( ( ruleMapEntryLiteral ) )
                // InternalEldmDslParser.g:3458:7: ( ruleMapEntryLiteral )
                {
                // InternalEldmDslParser.g:3458:7: ( ruleMapEntryLiteral )
                // InternalEldmDslParser.g:3459:8: ruleMapEntryLiteral
                {
                pushFollow(FOLLOW_41);
                ruleMapEntryLiteral();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:3462:6: ( Comma ( ( ruleMapEntryLiteral ) ) )*
                loop70:
                do {
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==Comma) ) {
                        int LA70_1 = input.LA(2);

                        if ( (LA70_1==RULE_ID) ) {
                            alt70=1;
                        }


                    }


                    switch (alt70) {
                	case 1 :
                	    // InternalEldmDslParser.g:3463:7: Comma ( ( ruleMapEntryLiteral ) )
                	    {
                	    match(input,Comma,FOLLOW_10); if (state.failed) return ;
                	    // InternalEldmDslParser.g:3464:7: ( ( ruleMapEntryLiteral ) )
                	    // InternalEldmDslParser.g:3465:8: ( ruleMapEntryLiteral )
                	    {
                	    // InternalEldmDslParser.g:3465:8: ( ruleMapEntryLiteral )
                	    // InternalEldmDslParser.g:3466:9: ruleMapEntryLiteral
                	    {
                	    pushFollow(FOLLOW_41);
                	    ruleMapEntryLiteral();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop70;
                    }
                } while (true);


                }
                break;

        }

        // InternalEldmDslParser.g:3471:5: ( Comma ( ( Asterisk ) ) )?
        int alt72=2;
        int LA72_0 = input.LA(1);

        if ( (LA72_0==Comma) ) {
            alt72=1;
        }
        switch (alt72) {
            case 1 :
                // InternalEldmDslParser.g:3472:6: Comma ( ( Asterisk ) )
                {
                match(input,Comma,FOLLOW_42); if (state.failed) return ;
                // InternalEldmDslParser.g:3473:6: ( ( Asterisk ) )
                // InternalEldmDslParser.g:3474:7: ( Asterisk )
                {
                // InternalEldmDslParser.g:3474:7: ( Asterisk )
                // InternalEldmDslParser.g:3475:8: Asterisk
                {
                match(input,Asterisk,FOLLOW_43); if (state.failed) return ;

                }


                }


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


    protected DFA35 dfa35 = new DFA35(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\2\uffff\1\27\26\uffff";
    static final String dfa_3s = "\1\11\1\uffff\1\21\26\uffff";
    static final String dfa_4s = "\1\113\1\uffff\1\102\26\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\26\2";
    static final String dfa_6s = "\2\uffff\1\0\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\3\1\1\uffff\1\1\35\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\2\1\uffff\6\1",
            "",
            "\1\22\7\uffff\1\25\5\uffff\1\26\1\21\1\6\2\uffff\1\15\1\20\1\14\1\4\1\uffff\1\13\1\23\3\uffff\1\10\1\uffff\1\30\1\5\1\11\1\uffff\1\12\1\3\1\7\1\uffff\1\17\1\uffff\1\16\1\uffff\1\1\5\uffff\1\24",
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
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1951:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_2==FullStop) && (synpred9_InternalEldmDslParser())) {s = 3;}

                        else if ( (LA35_2==QuestionMarkFullStop) && (synpred9_InternalEldmDslParser())) {s = 4;}

                        else if ( (LA35_2==Asterisk) && (synpred9_InternalEldmDslParser())) {s = 5;}

                        else if ( (LA35_2==AsteriskAsterisk) && (synpred9_InternalEldmDslParser())) {s = 6;}

                        else if ( (LA35_2==Solidus) && (synpred9_InternalEldmDslParser())) {s = 7;}

                        else if ( (LA35_2==PercentSign) && (synpred9_InternalEldmDslParser())) {s = 8;}

                        else if ( (LA35_2==PlusSign) && (synpred9_InternalEldmDslParser())) {s = 9;}

                        else if ( (LA35_2==HyphenMinus) && (synpred9_InternalEldmDslParser())) {s = 10;}

                        else if ( (LA35_2==Is) && (synpred9_InternalEldmDslParser())) {s = 11;}

                        else if ( (LA35_2==GreaterThanSignEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 12;}

                        else if ( (LA35_2==LessThanSignEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 13;}

                        else if ( (LA35_2==GreaterThanSign) && (synpred9_InternalEldmDslParser())) {s = 14;}

                        else if ( (LA35_2==LessThanSign) && (synpred9_InternalEldmDslParser())) {s = 15;}

                        else if ( (LA35_2==EqualsSignEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 16;}

                        else if ( (LA35_2==ExclamationMarkEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 17;}

                        else if ( (LA35_2==And) && (synpred9_InternalEldmDslParser())) {s = 18;}

                        else if ( (LA35_2==Or) && (synpred9_InternalEldmDslParser())) {s = 19;}

                        else if ( (LA35_2==RULE_END) && (synpred9_InternalEldmDslParser())) {s = 20;}

                        else if ( (LA35_2==Let) && (synpred9_InternalEldmDslParser())) {s = 21;}

                        else if ( (LA35_2==Var) && (synpred9_InternalEldmDslParser())) {s = 22;}

                        else if ( (LA35_2==EOF) && (synpred9_InternalEldmDslParser())) {s = 23;}

                        else if ( (LA35_2==RightParenthesis) && (synpred9_InternalEldmDslParser())) {s = 24;}

                        else if ( (LA35_2==CommercialAt) ) {s = 1;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\11\14\uffff";
    static final String dfa_10s = "\1\113\14\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\2\14\2\uffff\1\14\1\1\1\uffff\1\14\1\uffff\1\14\1\uffff\3\14\1\uffff\3\14\1\uffff\1\14\35\uffff\1\13\1\11\1\uffff\1\12\3\uffff\1\10\1\14\1\uffff\1\3\1\4\1\5\1\6\1\7\1\2",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2952:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080032L,0x0000000000000018L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000080L,0x000000000000001CL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000005DD49800L,0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020200040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x8080000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8080000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x800000085DD49800L,0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000082000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xB000A0005DD59A00L,0x0000000000000FD8L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xB00000005DD59A00L,0x0000000000000FD8L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002100000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0500025000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0042400200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x800000085DD4DC00L,0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002180000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0A80000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xF00000005DD59A00L,0x0000000000000FD8L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000180000000002L});

}