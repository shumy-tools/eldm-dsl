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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Definitions", "PlugDsl", "Private", "Typedef", "Module", "False", "Match", "Bool", "Enum", "From", "Mask", "Path", "True", "And", "Any", "Def", "Flt", "Get", "Int", "Lda", "Ldt", "Let", "Lst", "Ltm", "Map", "Set", "Str", "ExclamationMarkEqualsSign", "AsteriskAsterisk", "HyphenMinusGreaterThanSign", "FullStopFullStop", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "QuestionMarkFullStop", "As", "Is", "Or", "LineFeed", "CarriageReturn", "ExclamationMark", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_PATH", "RULE_ID", "RULE_INT", "RULE_NATURAL", "RULE_FLOAT", "RULE_DATE", "RULE_TIME", "RULE_DATETIME", "RULE_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=12;
    public static final int Or=41;
    public static final int RULE_BEGIN=64;
    public static final int True=16;
    public static final int False=9;
    public static final int LessThanSign=55;
    public static final int Str=30;
    public static final int PercentSign=45;
    public static final int LeftParenthesis=46;
    public static final int Bool=11;
    public static final int FullStopFullStop=34;
    public static final int RULE_TIME=72;
    public static final int Private=6;
    public static final int RightSquareBracket=61;
    public static final int ExclamationMark=44;
    public static final int GreaterThanSign=57;
    public static final int RULE_ID=67;
    public static final int Mask=14;
    public static final int RightParenthesis=47;
    public static final int Lst=26;
    public static final int GreaterThanSignEqualsSign=37;
    public static final int RULE_PATH=66;
    public static final int EqualsSignEqualsSign=36;
    public static final int RULE_DATE=71;
    public static final int Typedef=7;
    public static final int And=17;
    public static final int PlusSign=49;
    public static final int RULE_INT=68;
    public static final int Get=21;
    public static final int AsteriskAsterisk=32;
    public static final int RULE_NATURAL=69;
    public static final int RULE_ML_COMMENT=75;
    public static final int RULE_TEXT=74;
    public static final int LeftSquareBracket=60;
    public static final int Module=8;
    public static final int Map=28;
    public static final int RULE_END=65;
    public static final int Set=29;
    public static final int Ltm=27;
    public static final int RULE_DATETIME=73;
    public static final int Lda=23;
    public static final int Is=40;
    public static final int Any=18;
    public static final int Int=22;
    public static final int Match=10;
    public static final int Flt=20;
    public static final int RULE_SL_COMMENT=76;
    public static final int QuestionMarkFullStop=38;
    public static final int Comma=50;
    public static final int EqualsSign=56;
    public static final int As=39;
    public static final int HyphenMinus=51;
    public static final int CarriageReturn=43;
    public static final int LessThanSignEqualsSign=35;
    public static final int Solidus=53;
    public static final int Colon=54;
    public static final int RightCurlyBracket=63;
    public static final int EOF=-1;
    public static final int Ldt=24;
    public static final int Asterisk=48;
    public static final int Path=15;
    public static final int FullStop=52;
    public static final int Def=19;
    public static final int RULE_WS=77;
    public static final int Definitions=4;
    public static final int LeftCurlyBracket=62;
    public static final int From=13;
    public static final int RULE_ANY_OTHER=78;
    public static final int CommercialAt=59;
    public static final int PlugDsl=5;
    public static final int QuestionMark=58;
    public static final int RULE_FLOAT=70;
    public static final int Let=25;
    public static final int ExclamationMarkEqualsSign=31;
    public static final int HyphenMinusGreaterThanSign=33;
    public static final int LineFeed=42;

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
    // InternalEldmDslParser.g:64:1: ruleModule returns [EObject current=null] : (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleLetValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) ;
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
            // InternalEldmDslParser.g:70:2: ( (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleLetValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* ) )
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleLetValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            {
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleLetValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )* )
            // InternalEldmDslParser.g:72:3: otherlv_0= Module ( (lv_name_1_0= rulePathLiteral ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleLetValue ) )* this_END_8= RULE_END )? ( (lv_opers_9_0= ruleOperation ) )* ( (lv_paths_10_0= ruleSubPath ) )*
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

            // InternalEldmDslParser.g:133:3: (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleLetValue ) )* this_END_8= RULE_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Definitions) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEldmDslParser.g:134:4: otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )* ( (lv_vals_7_0= ruleLetValue ) )* this_END_8= RULE_END
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

                    // InternalEldmDslParser.g:161:4: ( (lv_vals_7_0= ruleLetValue ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Let) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:162:5: (lv_vals_7_0= ruleLetValue )
                    	    {
                    	    // InternalEldmDslParser.g:162:5: (lv_vals_7_0= ruleLetValue )
                    	    // InternalEldmDslParser.g:163:6: lv_vals_7_0= ruleLetValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModuleAccess().getValsLetValueParserRuleCall_4_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_vals_7_0=ruleLetValue();

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
                    	      							"net.eldm.EldmDsl.LetValue");
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

                    if ( (LA6_1==Get||LA6_1==Set) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==Private) ) {
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
            otherlv_0=(Token)match(input,PlugDsl,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlugDslAccess().getPlugDslKeyword_0());
              		
            }
            // InternalEldmDslParser.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:248:5: lv_name_1_0= RULE_ID
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
            pushFollow(FOLLOW_13);
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
            pushFollow(FOLLOW_14);
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
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_15); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_14);
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
                            otherlv_1=(Token)match(input,As,FOLLOW_11); if (state.failed) return current;
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
    // InternalEldmDslParser.g:565:1: ruleOperation returns [EObject current=null] : ( ( (lv_isPrivate_0_0= Private ) )? otherlv_1= Def ( ( (lv_isGet_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParamDef ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_isPrivate_0_0=null;
        Token otherlv_1=null;
        Token lv_isGet_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_name_4_0 = null;

        EObject lv_param_5_0 = null;

        EObject lv_result_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:571:2: ( ( ( (lv_isPrivate_0_0= Private ) )? otherlv_1= Def ( ( (lv_isGet_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParamDef ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) ) )
            // InternalEldmDslParser.g:572:2: ( ( (lv_isPrivate_0_0= Private ) )? otherlv_1= Def ( ( (lv_isGet_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParamDef ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) )
            {
            // InternalEldmDslParser.g:572:2: ( ( (lv_isPrivate_0_0= Private ) )? otherlv_1= Def ( ( (lv_isGet_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParamDef ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) ) )
            // InternalEldmDslParser.g:573:3: ( (lv_isPrivate_0_0= Private ) )? otherlv_1= Def ( ( (lv_isGet_2_0= Get ) ) | otherlv_3= Set ) ( (lv_name_4_0= rulePathLiteral ) )? ( (lv_param_5_0= ruleParamDef ) )? (otherlv_6= HyphenMinusGreaterThanSign ( (lv_result_7_0= ruleElementDef ) ) )? otherlv_8= Colon ( (lv_body_9_0= ruleBlockExpression ) )
            {
            // InternalEldmDslParser.g:573:3: ( (lv_isPrivate_0_0= Private ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Private) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEldmDslParser.g:574:4: (lv_isPrivate_0_0= Private )
                    {
                    // InternalEldmDslParser.g:574:4: (lv_isPrivate_0_0= Private )
                    // InternalEldmDslParser.g:575:5: lv_isPrivate_0_0= Private
                    {
                    lv_isPrivate_0_0=(Token)match(input,Private,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isPrivate_0_0, grammarAccess.getOperationAccess().getIsPrivatePrivateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOperationRule());
                      					}
                      					setWithLastConsumed(current, "isPrivate", true, "private");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Def,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getDefKeyword_1());
              		
            }
            // InternalEldmDslParser.g:591:3: ( ( (lv_isGet_2_0= Get ) ) | otherlv_3= Set )
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
                    // InternalEldmDslParser.g:592:4: ( (lv_isGet_2_0= Get ) )
                    {
                    // InternalEldmDslParser.g:592:4: ( (lv_isGet_2_0= Get ) )
                    // InternalEldmDslParser.g:593:5: (lv_isGet_2_0= Get )
                    {
                    // InternalEldmDslParser.g:593:5: (lv_isGet_2_0= Get )
                    // InternalEldmDslParser.g:594:6: lv_isGet_2_0= Get
                    {
                    lv_isGet_2_0=(Token)match(input,Get,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isGet_2_0, grammarAccess.getOperationAccess().getIsGetGetKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOperationRule());
                      						}
                      						setWithLastConsumed(current, "isGet", true, "get");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:607:4: otherlv_3= Set
                    {
                    otherlv_3=(Token)match(input,Set,FOLLOW_19); if (state.failed) return current;
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
                    pushFollow(FOLLOW_20);
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

            // InternalEldmDslParser.g:631:3: ( (lv_param_5_0= ruleParamDef ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftCurlyBracket||LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEldmDslParser.g:632:4: (lv_param_5_0= ruleParamDef )
                    {
                    // InternalEldmDslParser.g:632:4: (lv_param_5_0= ruleParamDef )
                    // InternalEldmDslParser.g:633:5: lv_param_5_0= ruleParamDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationAccess().getParamParamDefParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_param_5_0=ruleParamDef();

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
                      						"net.eldm.EldmDsl.ParamDef");
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
                    otherlv_6=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_22); if (state.failed) return current;
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
                    pushFollow(FOLLOW_23);
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


    // $ANTLR start "entryRuleParamDef"
    // InternalEldmDslParser.g:702:1: entryRuleParamDef returns [EObject current=null] : iv_ruleParamDef= ruleParamDef EOF ;
    public final EObject entryRuleParamDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDef = null;


        try {
            // InternalEldmDslParser.g:702:49: (iv_ruleParamDef= ruleParamDef EOF )
            // InternalEldmDslParser.g:703:2: iv_ruleParamDef= ruleParamDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamDef=ruleParamDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamDef; 
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
    // $ANTLR end "entryRuleParamDef"


    // $ANTLR start "ruleParamDef"
    // InternalEldmDslParser.g:709:1: ruleParamDef returns [EObject current=null] : ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleParamDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_def_0_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:715:2: ( ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:716:2: ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:716:2: ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LeftCurlyBracket) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEldmDslParser.g:717:3: ( (lv_def_0_0= ruleMapDef ) )
                    {
                    // InternalEldmDslParser.g:717:3: ( (lv_def_0_0= ruleMapDef ) )
                    // InternalEldmDslParser.g:718:4: (lv_def_0_0= ruleMapDef )
                    {
                    // InternalEldmDslParser.g:718:4: (lv_def_0_0= ruleMapDef )
                    // InternalEldmDslParser.g:719:5: lv_def_0_0= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getParamDefAccess().getDefMapDefParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_def_0_0=ruleMapDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getParamDefRule());
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
                    break;
                case 2 :
                    // InternalEldmDslParser.g:737:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:737:3: ( (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:738:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:738:4: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:739:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getParamDefRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getParamDefAccess().getRefMapDefCrossReference_1_0());
                      				
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
    // $ANTLR end "ruleParamDef"


    // $ANTLR start "entryRuleSubPath"
    // InternalEldmDslParser.g:754:1: entryRuleSubPath returns [EObject current=null] : iv_ruleSubPath= ruleSubPath EOF ;
    public final EObject entryRuleSubPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPath = null;


        try {
            // InternalEldmDslParser.g:754:48: (iv_ruleSubPath= ruleSubPath EOF )
            // InternalEldmDslParser.g:755:2: iv_ruleSubPath= ruleSubPath EOF
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
    // InternalEldmDslParser.g:761:1: ruleSubPath returns [EObject current=null] : (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleSubPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_opers_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:767:2: ( (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END ) )
            // InternalEldmDslParser.g:768:2: (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            {
            // InternalEldmDslParser.g:768:2: (otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            // InternalEldmDslParser.g:769:3: otherlv_0= Def ( (lv_name_1_0= rulePathLiteral ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubPathAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:773:3: ( (lv_name_1_0= rulePathLiteral ) )
            // InternalEldmDslParser.g:774:4: (lv_name_1_0= rulePathLiteral )
            {
            // InternalEldmDslParser.g:774:4: (lv_name_1_0= rulePathLiteral )
            // InternalEldmDslParser.g:775:5: lv_name_1_0= rulePathLiteral
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalEldmDslParser.g:796:3: ( (lv_opers_3_0= ruleOperation ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Private||LA18_0==Def) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEldmDslParser.g:797:4: (lv_opers_3_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:797:4: (lv_opers_3_0= ruleOperation )
            	    // InternalEldmDslParser.g:798:5: lv_opers_3_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubPathAccess().getOpersOperationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalEldmDslParser.g:823:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // InternalEldmDslParser.g:823:56: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // InternalEldmDslParser.g:824:2: iv_ruleBlockExpression= ruleBlockExpression EOF
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
    // InternalEldmDslParser.g:830:1: ruleBlockExpression returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:836:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END ) )
            // InternalEldmDslParser.g:837:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            {
            // InternalEldmDslParser.g:837:2: ( () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END )
            // InternalEldmDslParser.g:838:3: () this_BEGIN_1= RULE_BEGIN ( (lv_expressions_2_0= ruleExpression ) )* this_END_3= RULE_END
            {
            // InternalEldmDslParser.g:838:3: ()
            // InternalEldmDslParser.g:839:4: 
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
            // InternalEldmDslParser.g:849:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Let) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEldmDslParser.g:850:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalEldmDslParser.g:850:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalEldmDslParser.g:851:5: lv_expressions_2_0= ruleExpression
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
            	    break loop19;
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
    // InternalEldmDslParser.g:876:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEldmDslParser.g:876:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEldmDslParser.g:877:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEldmDslParser.g:883:1: ruleExpression returns [EObject current=null] : this_LetValue_0= ruleLetValue ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LetValue_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:889:2: (this_LetValue_0= ruleLetValue )
            // InternalEldmDslParser.g:890:2: this_LetValue_0= ruleLetValue
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getLetValueParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_LetValue_0=ruleLetValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_LetValue_0;
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


    // $ANTLR start "entryRuleLetValue"
    // InternalEldmDslParser.g:901:1: entryRuleLetValue returns [EObject current=null] : iv_ruleLetValue= ruleLetValue EOF ;
    public final EObject entryRuleLetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetValue = null;


        try {
            // InternalEldmDslParser.g:901:49: (iv_ruleLetValue= ruleLetValue EOF )
            // InternalEldmDslParser.g:902:2: iv_ruleLetValue= ruleLetValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetValue=ruleLetValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetValue; 
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
    // $ANTLR end "entryRuleLetValue"


    // $ANTLR start "ruleLetValue"
    // InternalEldmDslParser.g:908:1: ruleLetValue returns [EObject current=null] : (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isTypeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleResultExpression ) ) ) ;
    public final EObject ruleLetValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isTypeExplicit_2_0=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_result_5_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:914:2: ( (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isTypeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleResultExpression ) ) ) )
            // InternalEldmDslParser.g:915:2: (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isTypeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleResultExpression ) ) )
            {
            // InternalEldmDslParser.g:915:2: (otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isTypeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleResultExpression ) ) )
            // InternalEldmDslParser.g:916:3: otherlv_0= Let ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isTypeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )? otherlv_4= EqualsSign ( (lv_result_5_0= ruleResultExpression ) )
            {
            otherlv_0=(Token)match(input,Let,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetValueAccess().getLetKeyword_0());
              		
            }
            // InternalEldmDslParser.g:920:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:921:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:921:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:922:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getLetValueAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLetValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:938:3: ( ( (lv_isTypeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Colon) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEldmDslParser.g:939:4: ( (lv_isTypeExplicit_2_0= Colon ) ) ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:939:4: ( (lv_isTypeExplicit_2_0= Colon ) )
                    // InternalEldmDslParser.g:940:5: (lv_isTypeExplicit_2_0= Colon )
                    {
                    // InternalEldmDslParser.g:940:5: (lv_isTypeExplicit_2_0= Colon )
                    // InternalEldmDslParser.g:941:6: lv_isTypeExplicit_2_0= Colon
                    {
                    lv_isTypeExplicit_2_0=(Token)match(input,Colon,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isTypeExplicit_2_0, grammarAccess.getLetValueAccess().getIsTypeExplicitColonKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLetValueRule());
                      						}
                      						setWithLastConsumed(current, "isTypeExplicit", true, ":");
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:953:4: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:954:5: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:954:5: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:955:6: lv_type_3_0= ruleElementDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetValueAccess().getTypeElementDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_type_3_0=ruleElementDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetValueRule());
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

              			newLeafNode(otherlv_4, grammarAccess.getLetValueAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalEldmDslParser.g:977:3: ( (lv_result_5_0= ruleResultExpression ) )
            // InternalEldmDslParser.g:978:4: (lv_result_5_0= ruleResultExpression )
            {
            // InternalEldmDslParser.g:978:4: (lv_result_5_0= ruleResultExpression )
            // InternalEldmDslParser.g:979:5: lv_result_5_0= ruleResultExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetValueAccess().getResultResultExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_result_5_0=ruleResultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetValueRule());
              					}
              					set(
              						current,
              						"result",
              						lv_result_5_0,
              						"net.eldm.EldmDsl.ResultExpression");
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
    // $ANTLR end "ruleLetValue"


    // $ANTLR start "entryRuleResultExpression"
    // InternalEldmDslParser.g:1000:1: entryRuleResultExpression returns [EObject current=null] : iv_ruleResultExpression= ruleResultExpression EOF ;
    public final EObject entryRuleResultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpression = null;


        try {
            // InternalEldmDslParser.g:1000:57: (iv_ruleResultExpression= ruleResultExpression EOF )
            // InternalEldmDslParser.g:1001:2: iv_ruleResultExpression= ruleResultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResultExpression=ruleResultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultExpression; 
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
    // $ANTLR end "entryRuleResultExpression"


    // $ANTLR start "ruleResultExpression"
    // InternalEldmDslParser.g:1007:1: ruleResultExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleResultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1013:2: (this_OrExpression_0= ruleOrExpression )
            // InternalEldmDslParser.g:1014:2: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getResultExpressionAccess().getOrExpressionParserRuleCall());
              	
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
    // $ANTLR end "ruleResultExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalEldmDslParser.g:1025:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalEldmDslParser.g:1025:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalEldmDslParser.g:1026:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalEldmDslParser.g:1032:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1038:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEldmDslParser.g:1039:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1039:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEldmDslParser.g:1040:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1048:3: ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Or) && (synpred2_InternalEldmDslParser())) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEldmDslParser.g:1049:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1049:4: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) ) )
            	    // InternalEldmDslParser.g:1050:5: ( ( () ( ( Or ) ) ) )=> ( () ( (lv_feature_2_0= Or ) ) )
            	    {
            	    // InternalEldmDslParser.g:1060:5: ( () ( (lv_feature_2_0= Or ) ) )
            	    // InternalEldmDslParser.g:1061:6: () ( (lv_feature_2_0= Or ) )
            	    {
            	    // InternalEldmDslParser.g:1061:6: ()
            	    // InternalEldmDslParser.g:1062:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getResultExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1068:6: ( (lv_feature_2_0= Or ) )
            	    // InternalEldmDslParser.g:1069:7: (lv_feature_2_0= Or )
            	    {
            	    // InternalEldmDslParser.g:1069:7: (lv_feature_2_0= Or )
            	    // InternalEldmDslParser.g:1070:8: lv_feature_2_0= Or
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

            	    // InternalEldmDslParser.g:1084:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEldmDslParser.g:1085:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEldmDslParser.g:1085:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEldmDslParser.g:1086:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop21;
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
    // InternalEldmDslParser.g:1108:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEldmDslParser.g:1108:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEldmDslParser.g:1109:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalEldmDslParser.g:1115:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1121:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalEldmDslParser.g:1122:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1122:2: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalEldmDslParser.g:1123:3: this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1131:3: ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==And) && (synpred3_InternalEldmDslParser())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEldmDslParser.g:1132:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1132:4: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) ) )
            	    // InternalEldmDslParser.g:1133:5: ( ( () ( ( And ) ) ) )=> ( () ( (lv_feature_2_0= And ) ) )
            	    {
            	    // InternalEldmDslParser.g:1143:5: ( () ( (lv_feature_2_0= And ) ) )
            	    // InternalEldmDslParser.g:1144:6: () ( (lv_feature_2_0= And ) )
            	    {
            	    // InternalEldmDslParser.g:1144:6: ()
            	    // InternalEldmDslParser.g:1145:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getResultExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1151:6: ( (lv_feature_2_0= And ) )
            	    // InternalEldmDslParser.g:1152:7: (lv_feature_2_0= And )
            	    {
            	    // InternalEldmDslParser.g:1152:7: (lv_feature_2_0= And )
            	    // InternalEldmDslParser.g:1153:8: lv_feature_2_0= And
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

            	    // InternalEldmDslParser.g:1167:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalEldmDslParser.g:1168:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalEldmDslParser.g:1168:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalEldmDslParser.g:1169:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalEldmDslParser.g:1191:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalEldmDslParser.g:1191:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalEldmDslParser.g:1192:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalEldmDslParser.g:1198:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1204:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalEldmDslParser.g:1205:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1205:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalEldmDslParser.g:1206:3: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1214:3: ( ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==EqualsSignEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt24=1;
                }
                else if ( (LA24_0==ExclamationMarkEqualsSign) && (synpred4_InternalEldmDslParser())) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEldmDslParser.g:1215:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1215:4: ( ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1216:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1230:5: ( () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalEldmDslParser.g:1231:6: () ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1231:6: ()
            	    // InternalEldmDslParser.g:1232:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEqualityExpressionAccess().getResultExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1238:6: ( ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalEldmDslParser.g:1239:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalEldmDslParser.g:1239:7: ( (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalEldmDslParser.g:1240:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalEldmDslParser.g:1240:8: (lv_feature_2_1= EqualsSignEqualsSign | lv_feature_2_2= ExclamationMarkEqualsSign )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==EqualsSignEqualsSign) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==ExclamationMarkEqualsSign) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1241:9: lv_feature_2_1= EqualsSignEqualsSign
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
            	            // InternalEldmDslParser.g:1252:9: lv_feature_2_2= ExclamationMarkEqualsSign
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

            	    // InternalEldmDslParser.g:1267:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalEldmDslParser.g:1268:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalEldmDslParser.g:1268:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalEldmDslParser.g:1269:6: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalEldmDslParser.g:1291:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalEldmDslParser.g:1291:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalEldmDslParser.g:1292:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalEldmDslParser.g:1298:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) ;
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
            // InternalEldmDslParser.g:1304:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* ) )
            // InternalEldmDslParser.g:1305:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            {
            // InternalEldmDslParser.g:1305:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )* )
            // InternalEldmDslParser.g:1306:3: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1314:3: ( ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Is) && (synpred5_InternalEldmDslParser())) {
                    alt26=1;
                }
                else if ( (LA26_0==GreaterThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt26=2;
                }
                else if ( (LA26_0==LessThanSignEqualsSign) && (synpred6_InternalEldmDslParser())) {
                    alt26=2;
                }
                else if ( (LA26_0==GreaterThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt26=2;
                }
                else if ( (LA26_0==LessThanSign) && (synpred6_InternalEldmDslParser())) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEldmDslParser.g:1315:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    {
            	    // InternalEldmDslParser.g:1315:4: ( ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) ) )
            	    // InternalEldmDslParser.g:1316:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) ) ( (lv_type_3_0= ruleElementDef ) )
            	    {
            	    // InternalEldmDslParser.g:1316:5: ( ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) ) )
            	    // InternalEldmDslParser.g:1317:6: ( ( () ( ( Is ) ) ) )=> ( () ( (lv_feature_2_0= Is ) ) )
            	    {
            	    // InternalEldmDslParser.g:1327:6: ( () ( (lv_feature_2_0= Is ) ) )
            	    // InternalEldmDslParser.g:1328:7: () ( (lv_feature_2_0= Is ) )
            	    {
            	    // InternalEldmDslParser.g:1328:7: ()
            	    // InternalEldmDslParser.g:1329:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getIsExpressionLeftAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1335:7: ( (lv_feature_2_0= Is ) )
            	    // InternalEldmDslParser.g:1336:8: (lv_feature_2_0= Is )
            	    {
            	    // InternalEldmDslParser.g:1336:8: (lv_feature_2_0= Is )
            	    // InternalEldmDslParser.g:1337:9: lv_feature_2_0= Is
            	    {
            	    lv_feature_2_0=(Token)match(input,Is,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalEldmDslParser.g:1351:5: ( (lv_type_3_0= ruleElementDef ) )
            	    // InternalEldmDslParser.g:1352:6: (lv_type_3_0= ruleElementDef )
            	    {
            	    // InternalEldmDslParser.g:1352:6: (lv_type_3_0= ruleElementDef )
            	    // InternalEldmDslParser.g:1353:7: lv_type_3_0= ruleElementDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getTypeElementDefParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    // InternalEldmDslParser.g:1372:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    {
            	    // InternalEldmDslParser.g:1372:4: ( ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) ) )
            	    // InternalEldmDslParser.g:1373:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) ) ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1373:5: ( ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1374:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )=> ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1392:6: ( () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) ) )
            	    // InternalEldmDslParser.g:1393:7: () ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1393:7: ()
            	    // InternalEldmDslParser.g:1394:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getRelationalExpressionAccess().getResultExpressionLeftAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalEldmDslParser.g:1400:7: ( ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) ) )
            	    // InternalEldmDslParser.g:1401:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    {
            	    // InternalEldmDslParser.g:1401:8: ( (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign ) )
            	    // InternalEldmDslParser.g:1402:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    {
            	    // InternalEldmDslParser.g:1402:9: (lv_feature_5_1= GreaterThanSignEqualsSign | lv_feature_5_2= LessThanSignEqualsSign | lv_feature_5_3= GreaterThanSign | lv_feature_5_4= LessThanSign )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1403:10: lv_feature_5_1= GreaterThanSignEqualsSign
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
            	            // InternalEldmDslParser.g:1414:10: lv_feature_5_2= LessThanSignEqualsSign
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
            	            // InternalEldmDslParser.g:1425:10: lv_feature_5_3= GreaterThanSign
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
            	            // InternalEldmDslParser.g:1436:10: lv_feature_5_4= LessThanSign
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

            	    // InternalEldmDslParser.g:1451:5: ( (lv_right_6_0= ruleAdditiveExpression ) )
            	    // InternalEldmDslParser.g:1452:6: (lv_right_6_0= ruleAdditiveExpression )
            	    {
            	    // InternalEldmDslParser.g:1452:6: (lv_right_6_0= ruleAdditiveExpression )
            	    // InternalEldmDslParser.g:1453:7: lv_right_6_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalEldmDslParser.g:1476:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalEldmDslParser.g:1476:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalEldmDslParser.g:1477:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalEldmDslParser.g:1483:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1489:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalEldmDslParser.g:1490:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalEldmDslParser.g:1490:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalEldmDslParser.g:1491:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1499:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==PlusSign) && (synpred7_InternalEldmDslParser())) {
                    alt28=1;
                }
                else if ( (LA28_0==HyphenMinus) && (synpred7_InternalEldmDslParser())) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEldmDslParser.g:1500:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalEldmDslParser.g:1500:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) ) )
            	    // InternalEldmDslParser.g:1501:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1515:5: ( () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) ) )
            	    // InternalEldmDslParser.g:1516:6: () ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) )
            	    {
            	    // InternalEldmDslParser.g:1516:6: ()
            	    // InternalEldmDslParser.g:1517:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAdditiveExpressionAccess().getResultExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1523:6: ( ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) ) )
            	    // InternalEldmDslParser.g:1524:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) )
            	    {
            	    // InternalEldmDslParser.g:1524:7: ( (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus ) )
            	    // InternalEldmDslParser.g:1525:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus )
            	    {
            	    // InternalEldmDslParser.g:1525:8: (lv_feature_2_1= PlusSign | lv_feature_2_2= HyphenMinus )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==PlusSign) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==HyphenMinus) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalEldmDslParser.g:1526:9: lv_feature_2_1= PlusSign
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
            	            // InternalEldmDslParser.g:1537:9: lv_feature_2_2= HyphenMinus
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

            	    // InternalEldmDslParser.g:1552:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalEldmDslParser.g:1553:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalEldmDslParser.g:1553:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalEldmDslParser.g:1554:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalEldmDslParser.g:1576:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalEldmDslParser.g:1576:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalEldmDslParser.g:1577:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalEldmDslParser.g:1583:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
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
            // InternalEldmDslParser.g:1589:2: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // InternalEldmDslParser.g:1590:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // InternalEldmDslParser.g:1590:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // InternalEldmDslParser.g:1591:3: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEldmDslParser.g:1599:3: ( ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Asterisk) && (synpred8_InternalEldmDslParser())) {
                    alt30=1;
                }
                else if ( (LA30_0==AsteriskAsterisk) && (synpred8_InternalEldmDslParser())) {
                    alt30=1;
                }
                else if ( (LA30_0==Solidus) && (synpred8_InternalEldmDslParser())) {
                    alt30=1;
                }
                else if ( (LA30_0==PercentSign) && (synpred8_InternalEldmDslParser())) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEldmDslParser.g:1600:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // InternalEldmDslParser.g:1600:4: ( ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) ) )
            	    // InternalEldmDslParser.g:1601:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    {
            	    // InternalEldmDslParser.g:1619:5: ( () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) ) )
            	    // InternalEldmDslParser.g:1620:6: () ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    {
            	    // InternalEldmDslParser.g:1620:6: ()
            	    // InternalEldmDslParser.g:1621:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getResultExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEldmDslParser.g:1627:6: ( ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) ) )
            	    // InternalEldmDslParser.g:1628:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    {
            	    // InternalEldmDslParser.g:1628:7: ( (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign ) )
            	    // InternalEldmDslParser.g:1629:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    {
            	    // InternalEldmDslParser.g:1629:8: (lv_feature_2_1= Asterisk | lv_feature_2_2= AsteriskAsterisk | lv_feature_2_3= Solidus | lv_feature_2_4= PercentSign )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case AsteriskAsterisk:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case PercentSign:
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
            	            // InternalEldmDslParser.g:1630:9: lv_feature_2_1= Asterisk
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
            	            // InternalEldmDslParser.g:1641:9: lv_feature_2_2= AsteriskAsterisk
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
            	            // InternalEldmDslParser.g:1652:9: lv_feature_2_3= Solidus
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
            	            // InternalEldmDslParser.g:1663:9: lv_feature_2_4= PercentSign
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

            	    // InternalEldmDslParser.g:1678:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // InternalEldmDslParser.g:1679:5: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // InternalEldmDslParser.g:1679:5: (lv_right_3_0= ruleUnaryOperation )
            	    // InternalEldmDslParser.g:1680:6: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalEldmDslParser.g:1702:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalEldmDslParser.g:1702:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalEldmDslParser.g:1703:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
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
    // InternalEldmDslParser.g:1709:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_BaseExpression_3 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1715:2: ( ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression ) )
            // InternalEldmDslParser.g:1716:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression )
            {
            // InternalEldmDslParser.g:1716:2: ( ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_BaseExpression_3= ruleBaseExpression )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ExclamationMark) ) {
                alt31=1;
            }
            else if ( (LA31_0==False||(LA31_0>=Bool && LA31_0<=Enum)||(LA31_0>=Path && LA31_0<=True)||LA31_0==Any||LA31_0==Flt||(LA31_0>=Int && LA31_0<=Ldt)||(LA31_0>=Lst && LA31_0<=Map)||LA31_0==Str||LA31_0==LeftParenthesis||(LA31_0>=CommercialAt && LA31_0<=LeftSquareBracket)||LA31_0==LeftCurlyBracket||(LA31_0>=RULE_PATH && LA31_0<=RULE_ID)||(LA31_0>=RULE_NATURAL && LA31_0<=RULE_TEXT)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEldmDslParser.g:1717:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // InternalEldmDslParser.g:1717:3: ( () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // InternalEldmDslParser.g:1718:4: () ( (lv_feature_1_0= ExclamationMark ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // InternalEldmDslParser.g:1718:4: ()
                    // InternalEldmDslParser.g:1719:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEldmDslParser.g:1725:4: ( (lv_feature_1_0= ExclamationMark ) )
                    // InternalEldmDslParser.g:1726:5: (lv_feature_1_0= ExclamationMark )
                    {
                    // InternalEldmDslParser.g:1726:5: (lv_feature_1_0= ExclamationMark )
                    // InternalEldmDslParser.g:1727:6: lv_feature_1_0= ExclamationMark
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

                    // InternalEldmDslParser.g:1739:4: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // InternalEldmDslParser.g:1740:5: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // InternalEldmDslParser.g:1740:5: (lv_operand_2_0= ruleUnaryOperation )
                    // InternalEldmDslParser.g:1741:6: lv_operand_2_0= ruleUnaryOperation
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
                    // InternalEldmDslParser.g:1760:3: this_BaseExpression_3= ruleBaseExpression
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
    // InternalEldmDslParser.g:1772:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalEldmDslParser.g:1772:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalEldmDslParser.g:1773:2: iv_ruleBaseExpression= ruleBaseExpression EOF
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
    // InternalEldmDslParser.g:1779:1: ruleBaseExpression returns [EObject current=null] : (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ResultExpression_2= ruleResultExpression otherlv_3= RightParenthesis ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject this_ResultExpression_2 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1785:2: ( (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ResultExpression_2= ruleResultExpression otherlv_3= RightParenthesis ) ) )
            // InternalEldmDslParser.g:1786:2: (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ResultExpression_2= ruleResultExpression otherlv_3= RightParenthesis ) )
            {
            // InternalEldmDslParser.g:1786:2: (this_Primary_0= rulePrimary | (otherlv_1= LeftParenthesis this_ResultExpression_2= ruleResultExpression otherlv_3= RightParenthesis ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==False||(LA32_0>=Bool && LA32_0<=Enum)||(LA32_0>=Path && LA32_0<=True)||LA32_0==Any||LA32_0==Flt||(LA32_0>=Int && LA32_0<=Ldt)||(LA32_0>=Lst && LA32_0<=Map)||LA32_0==Str||(LA32_0>=CommercialAt && LA32_0<=LeftSquareBracket)||LA32_0==LeftCurlyBracket||(LA32_0>=RULE_PATH && LA32_0<=RULE_ID)||(LA32_0>=RULE_NATURAL && LA32_0<=RULE_TEXT)) ) {
                alt32=1;
            }
            else if ( (LA32_0==LeftParenthesis) ) {
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
                    // InternalEldmDslParser.g:1787:3: this_Primary_0= rulePrimary
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
                    // InternalEldmDslParser.g:1796:3: (otherlv_1= LeftParenthesis this_ResultExpression_2= ruleResultExpression otherlv_3= RightParenthesis )
                    {
                    // InternalEldmDslParser.g:1796:3: (otherlv_1= LeftParenthesis this_ResultExpression_2= ruleResultExpression otherlv_3= RightParenthesis )
                    // InternalEldmDslParser.g:1797:4: otherlv_1= LeftParenthesis this_ResultExpression_2= ruleResultExpression otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBaseExpressionAccess().getResultExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_ResultExpression_2=ruleResultExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ResultExpression_2;
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
    // InternalEldmDslParser.g:1818:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEldmDslParser.g:1818:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEldmDslParser.g:1819:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalEldmDslParser.g:1825:1: rulePrimary returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_calls_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1831:2: ( ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) ) )
            // InternalEldmDslParser.g:1832:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) )
            {
            // InternalEldmDslParser.g:1832:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalEldmDslParser.g:1833:3: ( (lv_value_0_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:1833:3: ( (lv_value_0_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:1834:4: (lv_value_0_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:1834:4: (lv_value_0_0= ruleLiteral )
                    // InternalEldmDslParser.g:1835:5: lv_value_0_0= ruleLiteral
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
                    // InternalEldmDslParser.g:1853:3: ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* )
                    {
                    // InternalEldmDslParser.g:1853:3: ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* )
                    // InternalEldmDslParser.g:1854:4: ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )*
                    {
                    // InternalEldmDslParser.g:1854:4: ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:1855:5: ( ( RULE_ID ) )=> (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:1859:5: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:1860:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getRefLetValueCrossReference_1_0_0());
                      					
                    }

                    }


                    }

                    // InternalEldmDslParser.g:1871:4: ( (lv_calls_2_0= ruleMemberCall ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==QuestionMarkFullStop||LA33_0==FullStop) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:1872:5: (lv_calls_2_0= ruleMemberCall )
                    	    {
                    	    // InternalEldmDslParser.g:1872:5: (lv_calls_2_0= ruleMemberCall )
                    	    // InternalEldmDslParser.g:1873:6: lv_calls_2_0= ruleMemberCall
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPrimaryAccess().getCallsMemberCallParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_36);
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
                    	    break loop33;
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
    // InternalEldmDslParser.g:1895:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalEldmDslParser.g:1895:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalEldmDslParser.g:1896:2: iv_ruleMemberCall= ruleMemberCall EOF
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
    // InternalEldmDslParser.g:1902:1: ruleMemberCall returns [EObject current=null] : ( (otherlv_0= FullStop | ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isNullSafe_1_0=null;
        Token lv_member_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:1908:2: ( ( (otherlv_0= FullStop | ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:1909:2: ( (otherlv_0= FullStop | ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:1909:2: ( (otherlv_0= FullStop | ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) ) )
            // InternalEldmDslParser.g:1910:3: (otherlv_0= FullStop | ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) ) ) ( (lv_member_2_0= RULE_ID ) )
            {
            // InternalEldmDslParser.g:1910:3: (otherlv_0= FullStop | ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==FullStop) ) {
                alt35=1;
            }
            else if ( (LA35_0==QuestionMarkFullStop) ) {
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
                    // InternalEldmDslParser.g:1911:4: otherlv_0= FullStop
                    {
                    otherlv_0=(Token)match(input,FullStop,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMemberCallAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1916:4: ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) )
                    {
                    // InternalEldmDslParser.g:1916:4: ( (lv_isNullSafe_1_0= QuestionMarkFullStop ) )
                    // InternalEldmDslParser.g:1917:5: (lv_isNullSafe_1_0= QuestionMarkFullStop )
                    {
                    // InternalEldmDslParser.g:1917:5: (lv_isNullSafe_1_0= QuestionMarkFullStop )
                    // InternalEldmDslParser.g:1918:6: lv_isNullSafe_1_0= QuestionMarkFullStop
                    {
                    lv_isNullSafe_1_0=(Token)match(input,QuestionMarkFullStop,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isNullSafe_1_0, grammarAccess.getMemberCallAccess().getIsNullSafeQuestionMarkFullStopKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMemberCallRule());
                      						}
                      						setWithLastConsumed(current, "isNullSafe", true, "?.");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:1931:3: ( (lv_member_2_0= RULE_ID ) )
            // InternalEldmDslParser.g:1932:4: (lv_member_2_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1932:4: (lv_member_2_0= RULE_ID )
            // InternalEldmDslParser.g:1933:5: lv_member_2_0= RULE_ID
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
    // InternalEldmDslParser.g:1953:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalEldmDslParser.g:1953:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalEldmDslParser.g:1954:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalEldmDslParser.g:1960:1: ruleDefinition returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_ExternalDef_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1966:2: ( (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef ) )
            // InternalEldmDslParser.g:1967:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            {
            // InternalEldmDslParser.g:1967:2: (this_TypeDef_0= ruleTypeDef | this_ExternalDef_1= ruleExternalDef )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Typedef) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:1968:3: this_TypeDef_0= ruleTypeDef
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
                    // InternalEldmDslParser.g:1977:3: this_ExternalDef_1= ruleExternalDef
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
    // InternalEldmDslParser.g:1989:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEldmDslParser.g:1989:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEldmDslParser.g:1990:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalEldmDslParser.g:1996:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) ) ;
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
            // InternalEldmDslParser.g:2002:2: ( (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) ) )
            // InternalEldmDslParser.g:2003:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) )
            {
            // InternalEldmDslParser.g:2003:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) ) )
            // InternalEldmDslParser.g:2004:3: otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) )
            {
            otherlv_0=(Token)match(input,Typedef,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2008:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:2009:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2009:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:2010:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2026:3: ( ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleElementDef ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Match||LA38_0==Mask) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=Bool && LA38_0<=Enum)||LA38_0==Path||LA38_0==Any||LA38_0==Flt||(LA38_0>=Int && LA38_0<=Ldt)||(LA38_0>=Lst && LA38_0<=Map)||LA38_0==Str||LA38_0==FullStopFullStop||LA38_0==LeftCurlyBracket||LA38_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:2027:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    {
                    // InternalEldmDslParser.g:2027:4: ( ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    // InternalEldmDslParser.g:2028:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) ) ( (lv_code_3_0= RULE_TEXT ) )
                    {
                    // InternalEldmDslParser.g:2028:5: ( ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) ) )
                    // InternalEldmDslParser.g:2029:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    {
                    // InternalEldmDslParser.g:2029:6: ( (lv_parser_2_1= Match | lv_parser_2_2= Mask ) )
                    // InternalEldmDslParser.g:2030:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    {
                    // InternalEldmDslParser.g:2030:7: (lv_parser_2_1= Match | lv_parser_2_2= Mask )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==Match) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==Mask) ) {
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
                            // InternalEldmDslParser.g:2031:8: lv_parser_2_1= Match
                            {
                            lv_parser_2_1=(Token)match(input,Match,FOLLOW_38); if (state.failed) return current;
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
                            // InternalEldmDslParser.g:2042:8: lv_parser_2_2= Mask
                            {
                            lv_parser_2_2=(Token)match(input,Mask,FOLLOW_38); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2055:5: ( (lv_code_3_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:2056:6: (lv_code_3_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:2056:6: (lv_code_3_0= RULE_TEXT )
                    // InternalEldmDslParser.g:2057:7: lv_code_3_0= RULE_TEXT
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
                    // InternalEldmDslParser.g:2075:4: ( (lv_type_4_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:2075:4: ( (lv_type_4_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:2076:5: (lv_type_4_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:2076:5: (lv_type_4_0= ruleElementDef )
                    // InternalEldmDslParser.g:2077:6: lv_type_4_0= ruleElementDef
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
    // InternalEldmDslParser.g:2099:1: entryRuleElementDef returns [EObject current=null] : iv_ruleElementDef= ruleElementDef EOF ;
    public final EObject entryRuleElementDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDef = null;


        try {
            // InternalEldmDslParser.g:2099:51: (iv_ruleElementDef= ruleElementDef EOF )
            // InternalEldmDslParser.g:2100:2: iv_ruleElementDef= ruleElementDef EOF
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
    // InternalEldmDslParser.g:2106:1: ruleElementDef returns [EObject current=null] : ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef ) ;
    public final EObject ruleElementDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_native_0_0 = null;

        EObject this_ListDef_2 = null;

        EObject this_MapDef_3 = null;

        EObject this_EnumDef_4 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2112:2: ( ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef ) )
            // InternalEldmDslParser.g:2113:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef )
            {
            // InternalEldmDslParser.g:2113:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | ( (otherlv_1= RULE_ID ) ) | this_ListDef_2= ruleListDef | this_MapDef_3= ruleMapDef | this_EnumDef_4= ruleEnumDef )
            int alt39=5;
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
                alt39=1;
                }
                break;
            case Enum:
                {
                switch ( input.LA(2) ) {
                case LeftCurlyBracket:
                    {
                    alt39=5;
                    }
                    break;
                case Colon:
                    {
                    int LA39_7 = input.LA(3);

                    if ( (LA39_7==RULE_BEGIN) ) {
                        int LA39_8 = input.LA(4);

                        if ( (LA39_8==RULE_ID) ) {
                            alt39=5;
                        }
                        else if ( (LA39_8==Let||LA39_8==RULE_END) ) {
                            alt39=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case Typedef:
                case And:
                case Let:
                case ExclamationMarkEqualsSign:
                case LessThanSignEqualsSign:
                case EqualsSignEqualsSign:
                case GreaterThanSignEqualsSign:
                case Is:
                case Or:
                case LineFeed:
                case CarriageReturn:
                case RightParenthesis:
                case Comma:
                case LessThanSign:
                case EqualsSign:
                case GreaterThanSign:
                case RightCurlyBracket:
                case RULE_END:
                case RULE_ID:
                    {
                    alt39=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt39=2;
                }
                break;
            case FullStopFullStop:
                {
                alt39=3;
                }
                break;
            case LeftCurlyBracket:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalEldmDslParser.g:2114:3: ( (lv_native_0_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:2114:3: ( (lv_native_0_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:2115:4: (lv_native_0_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:2115:4: (lv_native_0_0= ruleNativeDef )
                    // InternalEldmDslParser.g:2116:5: lv_native_0_0= ruleNativeDef
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
                    // InternalEldmDslParser.g:2134:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:2134:3: ( (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:2135:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2135:4: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:2136:5: otherlv_1= RULE_ID
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
                    // InternalEldmDslParser.g:2148:3: this_ListDef_2= ruleListDef
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
                    // InternalEldmDslParser.g:2157:3: this_MapDef_3= ruleMapDef
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
                    // InternalEldmDslParser.g:2166:3: this_EnumDef_4= ruleEnumDef
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
    // InternalEldmDslParser.g:2178:1: entryRuleMapDef returns [EObject current=null] : iv_ruleMapDef= ruleMapDef EOF ;
    public final EObject entryRuleMapDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapDef = null;


        try {
            // InternalEldmDslParser.g:2178:47: (iv_ruleMapDef= ruleMapDef EOF )
            // InternalEldmDslParser.g:2179:2: iv_ruleMapDef= ruleMapDef EOF
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
    // InternalEldmDslParser.g:2185:1: ruleMapDef returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) ;
    public final EObject ruleMapDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        EObject lv_defs_2_0 = null;

        EObject lv_defs_4_0 = null;

        EObject lv_defs_9_0 = null;

        EObject lv_defs_11_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2191:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:2192:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:2192:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==LeftCurlyBracket) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_ID) && (synpred10_InternalEldmDslParser())) {
                    alt44=1;
                }
                else if ( (LA44_1==RightCurlyBracket) && (synpred10_InternalEldmDslParser())) {
                    alt44=1;
                }
                else if ( (LA44_1==RULE_BEGIN) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalEldmDslParser.g:2193:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:2193:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:2194:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2216:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket )
                    // InternalEldmDslParser.g:2217:5: () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2217:5: ()
                    // InternalEldmDslParser.g:2218:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapDefAccess().getMapDefAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2228:5: ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalEldmDslParser.g:2229:6: ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2229:6: ( (lv_defs_2_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2230:7: (lv_defs_2_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2230:7: (lv_defs_2_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2231:8: lv_defs_2_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_40);
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

                            // InternalEldmDslParser.g:2248:6: (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==Comma) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2249:7: otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:2253:7: ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2254:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2254:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2255:9: lv_defs_4_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_40);
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
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_0_0_3());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2281:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2281:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    // InternalEldmDslParser.g:2282:4: () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2282:4: ()
                    // InternalEldmDslParser.g:2283:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMapDefAccess().getMapDefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:2297:4: ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalEldmDslParser.g:2298:5: ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:2298:5: ( (lv_defs_9_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:2299:6: (lv_defs_9_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:2299:6: (lv_defs_9_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:2300:7: lv_defs_9_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
                            lv_defs_9_0=ruleMapEntryDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMapDefRule());
                              							}
                              							add(
                              								current,
                              								"defs",
                              								lv_defs_9_0,
                              								"net.eldm.EldmDsl.MapEntryDef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalEldmDslParser.g:2317:5: ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==EOF||(LA42_0>=LineFeed && LA42_0<=CarriageReturn)||LA42_0==RULE_ID) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2318:6: ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapDefAccess().getBREAKParserRuleCall_1_3_1_0());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_11);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:2325:6: ( (lv_defs_11_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:2326:7: (lv_defs_11_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:2326:7: (lv_defs_11_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:2327:8: lv_defs_11_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_42);
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


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_12, grammarAccess.getMapDefAccess().getENDTerminalRuleCall_1_4());
                      			
                    }
                    otherlv_13=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getMapDefAccess().getRightCurlyBracketKeyword_1_5());
                      			
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
    // InternalEldmDslParser.g:2359:1: entryRuleMapEntryDef returns [EObject current=null] : iv_ruleMapEntryDef= ruleMapEntryDef EOF ;
    public final EObject entryRuleMapEntryDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryDef = null;


        try {
            // InternalEldmDslParser.g:2359:52: (iv_ruleMapEntryDef= ruleMapEntryDef EOF )
            // InternalEldmDslParser.g:2360:2: iv_ruleMapEntryDef= ruleMapEntryDef EOF
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
    // InternalEldmDslParser.g:2366:1: ruleMapEntryDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) ) ) ;
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
            // InternalEldmDslParser.g:2372:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) ) ) )
            // InternalEldmDslParser.g:2373:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) ) )
            {
            // InternalEldmDslParser.g:2373:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) ) )
            // InternalEldmDslParser.g:2374:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )
            {
            // InternalEldmDslParser.g:2374:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2375:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2375:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2376:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2392:3: ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) ) | ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Colon||LA46_0==QuestionMark) ) {
                alt46=1;
            }
            else if ( (LA46_0==EqualsSign) ) {
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
                    // InternalEldmDslParser.g:2393:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    {
                    // InternalEldmDslParser.g:2393:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) ) )
                    // InternalEldmDslParser.g:2394:5: ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementDef ) )
                    {
                    // InternalEldmDslParser.g:2394:5: ( (lv_opt_1_0= QuestionMark ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==QuestionMark) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalEldmDslParser.g:2395:6: (lv_opt_1_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:2395:6: (lv_opt_1_0= QuestionMark )
                            // InternalEldmDslParser.g:2396:7: lv_opt_1_0= QuestionMark
                            {
                            lv_opt_1_0=(Token)match(input,QuestionMark,FOLLOW_23); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,Colon,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMapEntryDefAccess().getColonKeyword_1_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2412:5: ( (lv_type_3_0= ruleElementDef ) )
                    // InternalEldmDslParser.g:2413:6: (lv_type_3_0= ruleElementDef )
                    {
                    // InternalEldmDslParser.g:2413:6: (lv_type_3_0= ruleElementDef )
                    // InternalEldmDslParser.g:2414:7: lv_type_3_0= ruleElementDef
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
                    // InternalEldmDslParser.g:2433:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    {
                    // InternalEldmDslParser.g:2433:4: ( ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) ) )
                    // InternalEldmDslParser.g:2434:5: ( (lv_opt_4_0= EqualsSign ) ) ( (lv_value_5_0= ruleLiteral ) )
                    {
                    // InternalEldmDslParser.g:2434:5: ( (lv_opt_4_0= EqualsSign ) )
                    // InternalEldmDslParser.g:2435:6: (lv_opt_4_0= EqualsSign )
                    {
                    // InternalEldmDslParser.g:2435:6: (lv_opt_4_0= EqualsSign )
                    // InternalEldmDslParser.g:2436:7: lv_opt_4_0= EqualsSign
                    {
                    lv_opt_4_0=(Token)match(input,EqualsSign,FOLLOW_45); if (state.failed) return current;
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

                    // InternalEldmDslParser.g:2448:5: ( (lv_value_5_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:2449:6: (lv_value_5_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:2449:6: (lv_value_5_0= ruleLiteral )
                    // InternalEldmDslParser.g:2450:7: lv_value_5_0= ruleLiteral
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
    // InternalEldmDslParser.g:2473:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalEldmDslParser.g:2473:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalEldmDslParser.g:2474:2: iv_ruleListDef= ruleListDef EOF
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
    // InternalEldmDslParser.g:2480:1: ruleListDef returns [EObject current=null] : ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2486:2: ( ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) ) )
            // InternalEldmDslParser.g:2487:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            {
            // InternalEldmDslParser.g:2487:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) ) )
            // InternalEldmDslParser.g:2488:3: () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementDef ) )
            {
            // InternalEldmDslParser.g:2488:3: ()
            // InternalEldmDslParser.g:2489:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListDefAccess().getListDefAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListDefAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalEldmDslParser.g:2499:3: ( (lv_type_2_0= ruleElementDef ) )
            // InternalEldmDslParser.g:2500:4: (lv_type_2_0= ruleElementDef )
            {
            // InternalEldmDslParser.g:2500:4: (lv_type_2_0= ruleElementDef )
            // InternalEldmDslParser.g:2501:5: lv_type_2_0= ruleElementDef
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
    // InternalEldmDslParser.g:2522:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // InternalEldmDslParser.g:2522:48: (iv_ruleEnumDef= ruleEnumDef EOF )
            // InternalEldmDslParser.g:2523:2: iv_ruleEnumDef= ruleEnumDef EOF
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
    // InternalEldmDslParser.g:2529:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) ;
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
            // InternalEldmDslParser.g:2535:2: ( (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END ) )
            // InternalEldmDslParser.g:2536:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            {
            // InternalEldmDslParser.g:2536:2: (otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END )
            // InternalEldmDslParser.g:2537:3: otherlv_0= Enum ( (lv_type_1_0= ruleMapDef ) )? otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_defs_4_0= ruleEnumItemDef ) )+ this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Enum,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
              		
            }
            // InternalEldmDslParser.g:2541:3: ( (lv_type_1_0= ruleMapDef ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==LeftCurlyBracket) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEldmDslParser.g:2542:4: (lv_type_1_0= ruleMapDef )
                    {
                    // InternalEldmDslParser.g:2542:4: (lv_type_1_0= ruleMapDef )
                    // InternalEldmDslParser.g:2543:5: lv_type_1_0= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEnumDefAccess().getTypeMapDefParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getEnumDefAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalEldmDslParser.g:2568:3: ( (lv_defs_4_0= ruleEnumItemDef ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalEldmDslParser.g:2569:4: (lv_defs_4_0= ruleEnumItemDef )
            	    {
            	    // InternalEldmDslParser.g:2569:4: (lv_defs_4_0= ruleEnumItemDef )
            	    // InternalEldmDslParser.g:2570:5: lv_defs_4_0= ruleEnumItemDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
    // InternalEldmDslParser.g:2595:1: entryRuleEnumItemDef returns [EObject current=null] : iv_ruleEnumItemDef= ruleEnumItemDef EOF ;
    public final EObject entryRuleEnumItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItemDef = null;


        try {
            // InternalEldmDslParser.g:2595:52: (iv_ruleEnumItemDef= ruleEnumItemDef EOF )
            // InternalEldmDslParser.g:2596:2: iv_ruleEnumItemDef= ruleEnumItemDef EOF
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
    // InternalEldmDslParser.g:2602:1: ruleEnumItemDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) ;
    public final EObject ruleEnumItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2608:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? ) )
            // InternalEldmDslParser.g:2609:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            {
            // InternalEldmDslParser.g:2609:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )? )
            // InternalEldmDslParser.g:2610:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )?
            {
            // InternalEldmDslParser.g:2610:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2611:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2611:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2612:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
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

            // InternalEldmDslParser.g:2628:3: ( (lv_value_1_0= ruleMapLiteral ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LeftCurlyBracket) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalEldmDslParser.g:2629:4: (lv_value_1_0= ruleMapLiteral )
                    {
                    // InternalEldmDslParser.g:2629:4: (lv_value_1_0= ruleMapLiteral )
                    // InternalEldmDslParser.g:2630:5: lv_value_1_0= ruleMapLiteral
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
    // InternalEldmDslParser.g:2651:1: entryRuleNativeDef returns [String current=null] : iv_ruleNativeDef= ruleNativeDef EOF ;
    public final String entryRuleNativeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNativeDef = null;


        try {
            // InternalEldmDslParser.g:2651:49: (iv_ruleNativeDef= ruleNativeDef EOF )
            // InternalEldmDslParser.g:2652:2: iv_ruleNativeDef= ruleNativeDef EOF
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
    // InternalEldmDslParser.g:2658:1: ruleNativeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) ;
    public final AntlrDatatypeRuleToken ruleNativeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2664:2: ( (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum ) )
            // InternalEldmDslParser.g:2665:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            {
            // InternalEldmDslParser.g:2665:2: (kw= Any | kw= Path | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Map | kw= Lst | kw= Enum )
            int alt50=12;
            switch ( input.LA(1) ) {
            case Any:
                {
                alt50=1;
                }
                break;
            case Path:
                {
                alt50=2;
                }
                break;
            case Bool:
                {
                alt50=3;
                }
                break;
            case Str:
                {
                alt50=4;
                }
                break;
            case Int:
                {
                alt50=5;
                }
                break;
            case Flt:
                {
                alt50=6;
                }
                break;
            case Lda:
                {
                alt50=7;
                }
                break;
            case Ltm:
                {
                alt50=8;
                }
                break;
            case Ldt:
                {
                alt50=9;
                }
                break;
            case Map:
                {
                alt50=10;
                }
                break;
            case Lst:
                {
                alt50=11;
                }
                break;
            case Enum:
                {
                alt50=12;
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
                    // InternalEldmDslParser.g:2666:3: kw= Any
                    {
                    kw=(Token)match(input,Any,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getAnyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2672:3: kw= Path
                    {
                    kw=(Token)match(input,Path,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getPathKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:2678:3: kw= Bool
                    {
                    kw=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getBoolKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:2684:3: kw= Str
                    {
                    kw=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getStrKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:2690:3: kw= Int
                    {
                    kw=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getIntKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:2696:3: kw= Flt
                    {
                    kw=(Token)match(input,Flt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getFltKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:2702:3: kw= Lda
                    {
                    kw=(Token)match(input,Lda,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdaKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:2708:3: kw= Ltm
                    {
                    kw=(Token)match(input,Ltm,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLtmKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:2714:3: kw= Ldt
                    {
                    kw=(Token)match(input,Ldt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdtKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEldmDslParser.g:2720:3: kw= Map
                    {
                    kw=(Token)match(input,Map,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getMapKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEldmDslParser.g:2726:3: kw= Lst
                    {
                    kw=(Token)match(input,Lst,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLstKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEldmDslParser.g:2732:3: kw= Enum
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
    // InternalEldmDslParser.g:2741:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEldmDslParser.g:2741:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEldmDslParser.g:2742:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEldmDslParser.g:2748:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral ) ;
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
            // InternalEldmDslParser.g:2754:2: ( (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral ) )
            // InternalEldmDslParser.g:2755:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )
            {
            // InternalEldmDslParser.g:2755:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )
            int alt51=12;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalEldmDslParser.g:2756:3: this_BoolLiteral_0= ruleBoolLiteral
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
                    // InternalEldmDslParser.g:2765:3: this_StrLiteral_1= ruleStrLiteral
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
                    // InternalEldmDslParser.g:2774:3: this_IntLiteral_2= ruleIntLiteral
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
                    // InternalEldmDslParser.g:2783:3: this_FltLiteral_3= ruleFltLiteral
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
                    // InternalEldmDslParser.g:2792:3: this_DateLiteral_4= ruleDateLiteral
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
                    // InternalEldmDslParser.g:2801:3: this_TimeLiteral_5= ruleTimeLiteral
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
                    // InternalEldmDslParser.g:2810:3: this_DateTimeLiteral_6= ruleDateTimeLiteral
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
                    // InternalEldmDslParser.g:2819:3: this_PathLiteral_7= rulePathLiteral
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
                    // InternalEldmDslParser.g:2828:3: this_ListLiteral_8= ruleListLiteral
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
                    // InternalEldmDslParser.g:2837:3: this_MapLiteral_9= ruleMapLiteral
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
                    // InternalEldmDslParser.g:2846:3: this_EnumLiteral_10= ruleEnumLiteral
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
                    // InternalEldmDslParser.g:2855:3: this_PatternLiteral_11= rulePatternLiteral
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
    // InternalEldmDslParser.g:2867:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalEldmDslParser.g:2867:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalEldmDslParser.g:2868:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
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
    // InternalEldmDslParser.g:2874:1: ruleBoolLiteral returns [EObject current=null] : ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2880:2: ( ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) ) )
            // InternalEldmDslParser.g:2881:2: ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) )
            {
            // InternalEldmDslParser.g:2881:2: ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) )
            // InternalEldmDslParser.g:2882:3: () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) )
            {
            // InternalEldmDslParser.g:2882:3: ()
            // InternalEldmDslParser.g:2883:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:2889:3: (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==False) ) {
                alt52=1;
            }
            else if ( (LA52_0==True) ) {
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
                    // InternalEldmDslParser.g:2890:4: otherlv_1= False
                    {
                    otherlv_1=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:2895:4: ( (lv_isTrue_2_0= True ) )
                    {
                    // InternalEldmDslParser.g:2895:4: ( (lv_isTrue_2_0= True ) )
                    // InternalEldmDslParser.g:2896:5: (lv_isTrue_2_0= True )
                    {
                    // InternalEldmDslParser.g:2896:5: (lv_isTrue_2_0= True )
                    // InternalEldmDslParser.g:2897:6: lv_isTrue_2_0= True
                    {
                    lv_isTrue_2_0=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isTrue_2_0, grammarAccess.getBoolLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBoolLiteralRule());
                      						}
                      						setWithLastConsumed(current, "isTrue", true, "true");
                      					
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
    // InternalEldmDslParser.g:2914:1: entryRuleStrLiteral returns [EObject current=null] : iv_ruleStrLiteral= ruleStrLiteral EOF ;
    public final EObject entryRuleStrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrLiteral = null;


        try {
            // InternalEldmDslParser.g:2914:51: (iv_ruleStrLiteral= ruleStrLiteral EOF )
            // InternalEldmDslParser.g:2915:2: iv_ruleStrLiteral= ruleStrLiteral EOF
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
    // InternalEldmDslParser.g:2921:1: ruleStrLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT ) ) ;
    public final EObject ruleStrLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2927:2: ( ( (lv_value_0_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:2928:2: ( (lv_value_0_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:2928:2: ( (lv_value_0_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:2929:3: (lv_value_0_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:2929:3: (lv_value_0_0= RULE_TEXT )
            // InternalEldmDslParser.g:2930:4: lv_value_0_0= RULE_TEXT
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
    // InternalEldmDslParser.g:2949:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalEldmDslParser.g:2949:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalEldmDslParser.g:2950:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalEldmDslParser.g:2956:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2962:2: ( ( (lv_value_0_0= RULE_NATURAL ) ) )
            // InternalEldmDslParser.g:2963:2: ( (lv_value_0_0= RULE_NATURAL ) )
            {
            // InternalEldmDslParser.g:2963:2: ( (lv_value_0_0= RULE_NATURAL ) )
            // InternalEldmDslParser.g:2964:3: (lv_value_0_0= RULE_NATURAL )
            {
            // InternalEldmDslParser.g:2964:3: (lv_value_0_0= RULE_NATURAL )
            // InternalEldmDslParser.g:2965:4: lv_value_0_0= RULE_NATURAL
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
    // InternalEldmDslParser.g:2984:1: entryRuleFltLiteral returns [EObject current=null] : iv_ruleFltLiteral= ruleFltLiteral EOF ;
    public final EObject entryRuleFltLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFltLiteral = null;


        try {
            // InternalEldmDslParser.g:2984:51: (iv_ruleFltLiteral= ruleFltLiteral EOF )
            // InternalEldmDslParser.g:2985:2: iv_ruleFltLiteral= ruleFltLiteral EOF
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
    // InternalEldmDslParser.g:2991:1: ruleFltLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFltLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2997:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalEldmDslParser.g:2998:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalEldmDslParser.g:2998:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalEldmDslParser.g:2999:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalEldmDslParser.g:2999:3: (lv_value_0_0= RULE_FLOAT )
            // InternalEldmDslParser.g:3000:4: lv_value_0_0= RULE_FLOAT
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
    // InternalEldmDslParser.g:3019:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // InternalEldmDslParser.g:3019:52: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // InternalEldmDslParser.g:3020:2: iv_ruleDateLiteral= ruleDateLiteral EOF
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
    // InternalEldmDslParser.g:3026:1: ruleDateLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATE ) ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3032:2: ( ( (lv_value_0_0= RULE_DATE ) ) )
            // InternalEldmDslParser.g:3033:2: ( (lv_value_0_0= RULE_DATE ) )
            {
            // InternalEldmDslParser.g:3033:2: ( (lv_value_0_0= RULE_DATE ) )
            // InternalEldmDslParser.g:3034:3: (lv_value_0_0= RULE_DATE )
            {
            // InternalEldmDslParser.g:3034:3: (lv_value_0_0= RULE_DATE )
            // InternalEldmDslParser.g:3035:4: lv_value_0_0= RULE_DATE
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
    // InternalEldmDslParser.g:3054:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3054:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEldmDslParser.g:3055:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
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
    // InternalEldmDslParser.g:3061:1: ruleTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TIME ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3067:2: ( ( (lv_value_0_0= RULE_TIME ) ) )
            // InternalEldmDslParser.g:3068:2: ( (lv_value_0_0= RULE_TIME ) )
            {
            // InternalEldmDslParser.g:3068:2: ( (lv_value_0_0= RULE_TIME ) )
            // InternalEldmDslParser.g:3069:3: (lv_value_0_0= RULE_TIME )
            {
            // InternalEldmDslParser.g:3069:3: (lv_value_0_0= RULE_TIME )
            // InternalEldmDslParser.g:3070:4: lv_value_0_0= RULE_TIME
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
    // InternalEldmDslParser.g:3089:1: entryRuleDateTimeLiteral returns [EObject current=null] : iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF ;
    public final EObject entryRuleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeLiteral = null;


        try {
            // InternalEldmDslParser.g:3089:56: (iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF )
            // InternalEldmDslParser.g:3090:2: iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF
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
    // InternalEldmDslParser.g:3096:1: ruleDateTimeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DATETIME ) ) ;
    public final EObject ruleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3102:2: ( ( (lv_value_0_0= RULE_DATETIME ) ) )
            // InternalEldmDslParser.g:3103:2: ( (lv_value_0_0= RULE_DATETIME ) )
            {
            // InternalEldmDslParser.g:3103:2: ( (lv_value_0_0= RULE_DATETIME ) )
            // InternalEldmDslParser.g:3104:3: (lv_value_0_0= RULE_DATETIME )
            {
            // InternalEldmDslParser.g:3104:3: (lv_value_0_0= RULE_DATETIME )
            // InternalEldmDslParser.g:3105:4: lv_value_0_0= RULE_DATETIME
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
    // InternalEldmDslParser.g:3124:1: entryRulePathLiteral returns [EObject current=null] : iv_rulePathLiteral= rulePathLiteral EOF ;
    public final EObject entryRulePathLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathLiteral = null;


        try {
            // InternalEldmDslParser.g:3124:52: (iv_rulePathLiteral= rulePathLiteral EOF )
            // InternalEldmDslParser.g:3125:2: iv_rulePathLiteral= rulePathLiteral EOF
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
    // InternalEldmDslParser.g:3131:1: rulePathLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_PATH ) ) ;
    public final EObject rulePathLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3137:2: ( ( (lv_value_0_0= RULE_PATH ) ) )
            // InternalEldmDslParser.g:3138:2: ( (lv_value_0_0= RULE_PATH ) )
            {
            // InternalEldmDslParser.g:3138:2: ( (lv_value_0_0= RULE_PATH ) )
            // InternalEldmDslParser.g:3139:3: (lv_value_0_0= RULE_PATH )
            {
            // InternalEldmDslParser.g:3139:3: (lv_value_0_0= RULE_PATH )
            // InternalEldmDslParser.g:3140:4: lv_value_0_0= RULE_PATH
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
    // InternalEldmDslParser.g:3159:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalEldmDslParser.g:3159:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalEldmDslParser.g:3160:2: iv_ruleListLiteral= ruleListLiteral EOF
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
    // InternalEldmDslParser.g:3166:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vals_2_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3172:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEldmDslParser.g:3173:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEldmDslParser.g:3173:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEldmDslParser.g:3174:3: () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEldmDslParser.g:3174:3: ()
            // InternalEldmDslParser.g:3175:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3185:3: ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==False||(LA54_0>=Bool && LA54_0<=Enum)||(LA54_0>=Path && LA54_0<=True)||LA54_0==Any||LA54_0==Flt||(LA54_0>=Int && LA54_0<=Ldt)||(LA54_0>=Lst && LA54_0<=Map)||LA54_0==Str||(LA54_0>=CommercialAt && LA54_0<=LeftSquareBracket)||LA54_0==LeftCurlyBracket||(LA54_0>=RULE_PATH && LA54_0<=RULE_ID)||(LA54_0>=RULE_NATURAL && LA54_0<=RULE_TEXT)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEldmDslParser.g:3186:4: ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    {
                    // InternalEldmDslParser.g:3186:4: ( (lv_vals_2_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:3187:5: (lv_vals_2_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:3187:5: (lv_vals_2_0= ruleLiteral )
                    // InternalEldmDslParser.g:3188:6: lv_vals_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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

                    // InternalEldmDslParser.g:3205:4: (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Comma) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:3206:5: otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEldmDslParser.g:3210:5: ( (lv_vals_4_0= ruleLiteral ) )
                    	    // InternalEldmDslParser.g:3211:6: (lv_vals_4_0= ruleLiteral )
                    	    {
                    	    // InternalEldmDslParser.g:3211:6: (lv_vals_4_0= ruleLiteral )
                    	    // InternalEldmDslParser.g:3212:7: lv_vals_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop53;
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
    // InternalEldmDslParser.g:3239:1: entryRuleMapLiteral returns [EObject current=null] : iv_ruleMapLiteral= ruleMapLiteral EOF ;
    public final EObject entryRuleMapLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteral = null;


        try {
            // InternalEldmDslParser.g:3239:51: (iv_ruleMapLiteral= ruleMapLiteral EOF )
            // InternalEldmDslParser.g:3240:2: iv_ruleMapLiteral= ruleMapLiteral EOF
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
    // InternalEldmDslParser.g:3246:1: ruleMapLiteral returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) ;
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
            // InternalEldmDslParser.g:3252:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:3253:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:3253:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LeftCurlyBracket) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_BEGIN) ) {
                    alt59=2;
                }
                else if ( (LA59_1==RULE_ID) && (synpred11_InternalEldmDslParser())) {
                    alt59=1;
                }
                else if ( (LA59_1==RightCurlyBracket) && (synpred11_InternalEldmDslParser())) {
                    alt59=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalEldmDslParser.g:3254:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:3254:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:3255:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3277:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    // InternalEldmDslParser.g:3278:5: () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3278:5: ()
                    // InternalEldmDslParser.g:3279:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapLiteralAccess().getMapLiteralAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:3289:5: ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_ID) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalEldmDslParser.g:3290:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3290:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3291:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3291:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3292:8: lv_entries_2_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_40);
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

                            // InternalEldmDslParser.g:3309:6: (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==Comma) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3310:7: otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:3314:7: ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3315:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3315:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3316:9: lv_entries_4_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_40);
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
                            	    break loop55;
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
                    // InternalEldmDslParser.g:3342:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:3342:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    // InternalEldmDslParser.g:3343:4: () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:3343:4: ()
                    // InternalEldmDslParser.g:3344:5: 
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
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getMapLiteralAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:3358:4: ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_ID) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalEldmDslParser.g:3359:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:3359:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:3360:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:3360:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:3361:7: lv_entries_9_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
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

                            // InternalEldmDslParser.g:3378:5: ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==EOF||(LA57_0>=LineFeed && LA57_0<=CarriageReturn)||LA57_0==RULE_ID) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:3379:6: ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getMapLiteralAccess().getBREAKParserRuleCall_1_3_1_0());
                            	      					
                            	    }
                            	    pushFollow(FOLLOW_11);
                            	    ruleBREAK();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }
                            	    // InternalEldmDslParser.g:3386:6: ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:3387:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:3387:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:3388:8: lv_entries_11_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_42);
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
                            	    break loop57;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_43); if (state.failed) return current;
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
    // InternalEldmDslParser.g:3420:1: entryRuleMapEntryLiteral returns [EObject current=null] : iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF ;
    public final EObject entryRuleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryLiteral = null;


        try {
            // InternalEldmDslParser.g:3420:56: (iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF )
            // InternalEldmDslParser.g:3421:2: iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF
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
    // InternalEldmDslParser.g:3427:1: ruleMapEntryLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3433:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalEldmDslParser.g:3434:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalEldmDslParser.g:3434:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalEldmDslParser.g:3435:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalEldmDslParser.g:3435:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:3436:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:3436:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:3437:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3457:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalEldmDslParser.g:3458:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalEldmDslParser.g:3458:4: (lv_value_2_0= ruleLiteral )
            // InternalEldmDslParser.g:3459:5: lv_value_2_0= ruleLiteral
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
    // InternalEldmDslParser.g:3480:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalEldmDslParser.g:3480:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalEldmDslParser.g:3481:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalEldmDslParser.g:3487:1: ruleEnumLiteral returns [EObject current=null] : ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3493:2: ( ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:3494:2: ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:3494:2: ( () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) ) )
            // InternalEldmDslParser.g:3495:3: () otherlv_1= CommercialAt ( (otherlv_2= RULE_ID ) )
            {
            // InternalEldmDslParser.g:3495:3: ()
            // InternalEldmDslParser.g:3496:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,CommercialAt,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getCommercialAtKeyword_1());
              		
            }
            // InternalEldmDslParser.g:3506:3: ( (otherlv_2= RULE_ID ) )
            // InternalEldmDslParser.g:3507:4: (otherlv_2= RULE_ID )
            {
            // InternalEldmDslParser.g:3507:4: (otherlv_2= RULE_ID )
            // InternalEldmDslParser.g:3508:5: otherlv_2= RULE_ID
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
    // InternalEldmDslParser.g:3523:1: entryRulePatternLiteral returns [EObject current=null] : iv_rulePatternLiteral= rulePatternLiteral EOF ;
    public final EObject entryRulePatternLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternLiteral = null;


        try {
            // InternalEldmDslParser.g:3523:55: (iv_rulePatternLiteral= rulePatternLiteral EOF )
            // InternalEldmDslParser.g:3524:2: iv_rulePatternLiteral= rulePatternLiteral EOF
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
    // InternalEldmDslParser.g:3530:1: rulePatternLiteral returns [EObject current=null] : ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) ;
    public final EObject rulePatternLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        AntlrDatatypeRuleToken lv_native_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:3536:2: ( ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) )
            // InternalEldmDslParser.g:3537:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            {
            // InternalEldmDslParser.g:3537:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:3538:3: () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:3538:3: ()
            // InternalEldmDslParser.g:3539:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:3545:3: ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=Bool && LA60_0<=Enum)||LA60_0==Path||LA60_0==Any||LA60_0==Flt||(LA60_0>=Int && LA60_0<=Ldt)||(LA60_0>=Lst && LA60_0<=Map)||LA60_0==Str) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalEldmDslParser.g:3546:4: ( (lv_native_1_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:3546:4: ( (lv_native_1_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:3547:5: (lv_native_1_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:3547:5: (lv_native_1_0= ruleNativeDef )
                    // InternalEldmDslParser.g:3548:6: lv_native_1_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternLiteralAccess().getNativeNativeDefParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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
                    // InternalEldmDslParser.g:3566:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:3566:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEldmDslParser.g:3567:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEldmDslParser.g:3567:5: (otherlv_2= RULE_ID )
                    // InternalEldmDslParser.g:3568:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternLiteralRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPatternLiteralAccess().getRefDefinitionCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,CommercialAt,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2());
              		
            }
            // InternalEldmDslParser.g:3584:3: ( (lv_text_4_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:3585:4: (lv_text_4_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:3585:4: (lv_text_4_0= RULE_TEXT )
            // InternalEldmDslParser.g:3586:5: lv_text_4_0= RULE_TEXT
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
    // InternalEldmDslParser.g:3606:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalEldmDslParser.g:3606:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalEldmDslParser.g:3607:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalEldmDslParser.g:3613:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LineFeed | kw= CarriageReturn )* ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:3619:2: ( (kw= LineFeed | kw= CarriageReturn )* )
            // InternalEldmDslParser.g:3620:2: (kw= LineFeed | kw= CarriageReturn )*
            {
            // InternalEldmDslParser.g:3620:2: (kw= LineFeed | kw= CarriageReturn )*
            loop61:
            do {
                int alt61=3;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==LineFeed) ) {
                    alt61=1;
                }
                else if ( (LA61_0==CarriageReturn) ) {
                    alt61=2;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalEldmDslParser.g:3621:3: kw= LineFeed
            	    {
            	    kw=(Token)match(input,LineFeed,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getLineFeedKeyword_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEldmDslParser.g:3627:3: kw= CarriageReturn
            	    {
            	    kw=(Token)match(input,CarriageReturn,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
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
        // InternalEldmDslParser.g:1050:5: ( ( () ( ( Or ) ) ) )
        // InternalEldmDslParser.g:1050:6: ( () ( ( Or ) ) )
        {
        // InternalEldmDslParser.g:1050:6: ( () ( ( Or ) ) )
        // InternalEldmDslParser.g:1051:6: () ( ( Or ) )
        {
        // InternalEldmDslParser.g:1051:6: ()
        // InternalEldmDslParser.g:1052:6: 
        {
        }

        // InternalEldmDslParser.g:1053:6: ( ( Or ) )
        // InternalEldmDslParser.g:1054:7: ( Or )
        {
        // InternalEldmDslParser.g:1054:7: ( Or )
        // InternalEldmDslParser.g:1055:8: Or
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
        // InternalEldmDslParser.g:1133:5: ( ( () ( ( And ) ) ) )
        // InternalEldmDslParser.g:1133:6: ( () ( ( And ) ) )
        {
        // InternalEldmDslParser.g:1133:6: ( () ( ( And ) ) )
        // InternalEldmDslParser.g:1134:6: () ( ( And ) )
        {
        // InternalEldmDslParser.g:1134:6: ()
        // InternalEldmDslParser.g:1135:6: 
        {
        }

        // InternalEldmDslParser.g:1136:6: ( ( And ) )
        // InternalEldmDslParser.g:1137:7: ( And )
        {
        // InternalEldmDslParser.g:1137:7: ( And )
        // InternalEldmDslParser.g:1138:8: And
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
        // InternalEldmDslParser.g:1216:5: ( ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) ) )
        // InternalEldmDslParser.g:1216:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        {
        // InternalEldmDslParser.g:1216:6: ( () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) ) )
        // InternalEldmDslParser.g:1217:6: () ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        {
        // InternalEldmDslParser.g:1217:6: ()
        // InternalEldmDslParser.g:1218:6: 
        {
        }

        // InternalEldmDslParser.g:1219:6: ( ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) ) )
        // InternalEldmDslParser.g:1220:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        {
        // InternalEldmDslParser.g:1220:7: ( ( EqualsSignEqualsSign | ExclamationMarkEqualsSign ) )
        // InternalEldmDslParser.g:1221:8: ( EqualsSignEqualsSign | ExclamationMarkEqualsSign )
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
        // InternalEldmDslParser.g:1317:6: ( ( () ( ( Is ) ) ) )
        // InternalEldmDslParser.g:1317:7: ( () ( ( Is ) ) )
        {
        // InternalEldmDslParser.g:1317:7: ( () ( ( Is ) ) )
        // InternalEldmDslParser.g:1318:7: () ( ( Is ) )
        {
        // InternalEldmDslParser.g:1318:7: ()
        // InternalEldmDslParser.g:1319:7: 
        {
        }

        // InternalEldmDslParser.g:1320:7: ( ( Is ) )
        // InternalEldmDslParser.g:1321:8: ( Is )
        {
        // InternalEldmDslParser.g:1321:8: ( Is )
        // InternalEldmDslParser.g:1322:9: Is
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
        // InternalEldmDslParser.g:1374:6: ( ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) ) )
        // InternalEldmDslParser.g:1374:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        {
        // InternalEldmDslParser.g:1374:7: ( () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) ) )
        // InternalEldmDslParser.g:1375:7: () ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        {
        // InternalEldmDslParser.g:1375:7: ()
        // InternalEldmDslParser.g:1376:7: 
        {
        }

        // InternalEldmDslParser.g:1377:7: ( ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) ) )
        // InternalEldmDslParser.g:1378:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        {
        // InternalEldmDslParser.g:1378:8: ( ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign ) )
        // InternalEldmDslParser.g:1379:9: ( GreaterThanSignEqualsSign | LessThanSignEqualsSign | GreaterThanSign | LessThanSign )
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
        // InternalEldmDslParser.g:1501:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )
        // InternalEldmDslParser.g:1501:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        {
        // InternalEldmDslParser.g:1501:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        // InternalEldmDslParser.g:1502:6: () ( ( ( PlusSign | HyphenMinus ) ) )
        {
        // InternalEldmDslParser.g:1502:6: ()
        // InternalEldmDslParser.g:1503:6: 
        {
        }

        // InternalEldmDslParser.g:1504:6: ( ( ( PlusSign | HyphenMinus ) ) )
        // InternalEldmDslParser.g:1505:7: ( ( PlusSign | HyphenMinus ) )
        {
        // InternalEldmDslParser.g:1505:7: ( ( PlusSign | HyphenMinus ) )
        // InternalEldmDslParser.g:1506:8: ( PlusSign | HyphenMinus )
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
        // InternalEldmDslParser.g:1601:5: ( ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) ) )
        // InternalEldmDslParser.g:1601:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalEldmDslParser.g:1601:6: ( () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) ) )
        // InternalEldmDslParser.g:1602:6: () ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        {
        // InternalEldmDslParser.g:1602:6: ()
        // InternalEldmDslParser.g:1603:6: 
        {
        }

        // InternalEldmDslParser.g:1604:6: ( ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) ) )
        // InternalEldmDslParser.g:1605:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        {
        // InternalEldmDslParser.g:1605:7: ( ( Asterisk | AsteriskAsterisk | Solidus | PercentSign ) )
        // InternalEldmDslParser.g:1606:8: ( Asterisk | AsteriskAsterisk | Solidus | PercentSign )
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
        // InternalEldmDslParser.g:1855:5: ( ( RULE_ID ) )
        // InternalEldmDslParser.g:1855:6: ( RULE_ID )
        {
        // InternalEldmDslParser.g:1855:6: ( RULE_ID )
        // InternalEldmDslParser.g:1856:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalEldmDslParser

    // $ANTLR start synpred10_InternalEldmDslParser
    public final void synpred10_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:2194:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:2194:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:2194:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket )
        // InternalEldmDslParser.g:2195:5: () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:2195:5: ()
        // InternalEldmDslParser.g:2196:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_39); if (state.failed) return ;
        // InternalEldmDslParser.g:2198:5: ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )?
        int alt63=2;
        int LA63_0 = input.LA(1);

        if ( (LA63_0==RULE_ID) ) {
            alt63=1;
        }
        switch (alt63) {
            case 1 :
                // InternalEldmDslParser.g:2199:6: ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )*
                {
                // InternalEldmDslParser.g:2199:6: ( ( ruleMapEntryDef ) )
                // InternalEldmDslParser.g:2200:7: ( ruleMapEntryDef )
                {
                // InternalEldmDslParser.g:2200:7: ( ruleMapEntryDef )
                // InternalEldmDslParser.g:2201:8: ruleMapEntryDef
                {
                pushFollow(FOLLOW_40);
                ruleMapEntryDef();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:2204:6: ( Comma ( ( ruleMapEntryDef ) ) )*
                loop62:
                do {
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==Comma) ) {
                        alt62=1;
                    }


                    switch (alt62) {
                	case 1 :
                	    // InternalEldmDslParser.g:2205:7: Comma ( ( ruleMapEntryDef ) )
                	    {
                	    match(input,Comma,FOLLOW_11); if (state.failed) return ;
                	    // InternalEldmDslParser.g:2206:7: ( ( ruleMapEntryDef ) )
                	    // InternalEldmDslParser.g:2207:8: ( ruleMapEntryDef )
                	    {
                	    // InternalEldmDslParser.g:2207:8: ( ruleMapEntryDef )
                	    // InternalEldmDslParser.g:2208:9: ruleMapEntryDef
                	    {
                	    pushFollow(FOLLOW_40);
                	    ruleMapEntryDef();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalEldmDslParser

    // $ANTLR start synpred11_InternalEldmDslParser
    public final void synpred11_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:3255:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:3255:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:3255:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        // InternalEldmDslParser.g:3256:5: () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:3256:5: ()
        // InternalEldmDslParser.g:3257:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_39); if (state.failed) return ;
        // InternalEldmDslParser.g:3259:5: ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )?
        int alt65=2;
        int LA65_0 = input.LA(1);

        if ( (LA65_0==RULE_ID) ) {
            alt65=1;
        }
        switch (alt65) {
            case 1 :
                // InternalEldmDslParser.g:3260:6: ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )*
                {
                // InternalEldmDslParser.g:3260:6: ( ( ruleMapEntryLiteral ) )
                // InternalEldmDslParser.g:3261:7: ( ruleMapEntryLiteral )
                {
                // InternalEldmDslParser.g:3261:7: ( ruleMapEntryLiteral )
                // InternalEldmDslParser.g:3262:8: ruleMapEntryLiteral
                {
                pushFollow(FOLLOW_40);
                ruleMapEntryLiteral();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:3265:6: ( Comma ( ( ruleMapEntryLiteral ) ) )*
                loop64:
                do {
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==Comma) ) {
                        alt64=1;
                    }


                    switch (alt64) {
                	case 1 :
                	    // InternalEldmDslParser.g:3266:7: Comma ( ( ruleMapEntryLiteral ) )
                	    {
                	    match(input,Comma,FOLLOW_11); if (state.failed) return ;
                	    // InternalEldmDslParser.g:3267:7: ( ( ruleMapEntryLiteral ) )
                	    // InternalEldmDslParser.g:3268:8: ( ruleMapEntryLiteral )
                	    {
                	    // InternalEldmDslParser.g:3268:8: ( ruleMapEntryLiteral )
                	    // InternalEldmDslParser.g:3269:9: ruleMapEntryLiteral
                	    {
                	    pushFollow(FOLLOW_40);
                	    ruleMapEntryLiteral();

                	    state._fsp--;
                	    if (state.failed) return ;

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


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\2\uffff\1\26\25\uffff";
    static final String dfa_3s = "\1\11\1\uffff\1\21\25\uffff";
    static final String dfa_4s = "\1\112\1\uffff\1\101\25\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\25\2";
    static final String dfa_6s = "\2\uffff\1\0\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\3\1\1\uffff\1\1\34\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\2\1\uffff\6\1",
            "",
            "\1\22\7\uffff\1\25\5\uffff\1\21\1\6\2\uffff\1\15\1\20\1\14\1\4\1\uffff\1\13\1\23\3\uffff\1\10\1\uffff\1\27\1\5\1\11\1\uffff\1\12\1\3\1\7\1\uffff\1\17\1\uffff\1\16\1\uffff\1\1\5\uffff\1\24",
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

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1832:2: ( ( (lv_value_0_0= ruleLiteral ) ) | ( ( ( ( RULE_ID ) )=> (otherlv_1= RULE_ID ) ) ( (lv_calls_2_0= ruleMemberCall ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_2==CommercialAt) ) {s = 1;}

                        else if ( (LA34_2==FullStop) && (synpred9_InternalEldmDslParser())) {s = 3;}

                        else if ( (LA34_2==QuestionMarkFullStop) && (synpred9_InternalEldmDslParser())) {s = 4;}

                        else if ( (LA34_2==Asterisk) && (synpred9_InternalEldmDslParser())) {s = 5;}

                        else if ( (LA34_2==AsteriskAsterisk) && (synpred9_InternalEldmDslParser())) {s = 6;}

                        else if ( (LA34_2==Solidus) && (synpred9_InternalEldmDslParser())) {s = 7;}

                        else if ( (LA34_2==PercentSign) && (synpred9_InternalEldmDslParser())) {s = 8;}

                        else if ( (LA34_2==PlusSign) && (synpred9_InternalEldmDslParser())) {s = 9;}

                        else if ( (LA34_2==HyphenMinus) && (synpred9_InternalEldmDslParser())) {s = 10;}

                        else if ( (LA34_2==Is) && (synpred9_InternalEldmDslParser())) {s = 11;}

                        else if ( (LA34_2==GreaterThanSignEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 12;}

                        else if ( (LA34_2==LessThanSignEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 13;}

                        else if ( (LA34_2==GreaterThanSign) && (synpred9_InternalEldmDslParser())) {s = 14;}

                        else if ( (LA34_2==LessThanSign) && (synpred9_InternalEldmDslParser())) {s = 15;}

                        else if ( (LA34_2==EqualsSignEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 16;}

                        else if ( (LA34_2==ExclamationMarkEqualsSign) && (synpred9_InternalEldmDslParser())) {s = 17;}

                        else if ( (LA34_2==And) && (synpred9_InternalEldmDslParser())) {s = 18;}

                        else if ( (LA34_2==Or) && (synpred9_InternalEldmDslParser())) {s = 19;}

                        else if ( (LA34_2==RULE_END) && (synpred9_InternalEldmDslParser())) {s = 20;}

                        else if ( (LA34_2==Let) && (synpred9_InternalEldmDslParser())) {s = 21;}

                        else if ( (LA34_2==EOF) && (synpred9_InternalEldmDslParser())) {s = 22;}

                        else if ( (LA34_2==RightParenthesis) && (synpred9_InternalEldmDslParser())) {s = 23;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\11\14\uffff";
    static final String dfa_10s = "\1\112\14\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\2\14\2\uffff\1\14\1\1\1\uffff\1\14\1\uffff\1\14\1\uffff\3\14\1\uffff\3\14\1\uffff\1\14\34\uffff\1\13\1\11\1\uffff\1\12\3\uffff\1\10\1\14\1\uffff\1\3\1\4\1\5\1\6\1\7\1\2",
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

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2755:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_DateLiteral_4= ruleDateLiteral | this_TimeLiteral_5= ruleTimeLiteral | this_DateTimeLiteral_6= ruleDateTimeLiteral | this_PathLiteral_7= rulePathLiteral | this_ListLiteral_8= ruleListLiteral | this_MapLiteral_9= ruleMapLiteral | this_EnumLiteral_10= ruleEnumLiteral | this_PatternLiteral_11= rulePatternLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080072L,0x000000000000000CL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080072L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000080L,0x000000000000000EL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000005DD49800L,0x0000000000000008L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4040000200000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4040000200000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x400000045DD49800L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080040L,0x0000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x580050005DD59A00L,0x00000000000007ECL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0280012800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000A000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0021200100000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010004000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x400000045DD4DC00L,0x0000000000000008L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0540000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x580000005DD59A00L,0x00000000000007ECL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x780000005DD59A00L,0x00000000000007ECL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000C0000000002L});

}