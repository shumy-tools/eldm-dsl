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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Definitions", "Test10", "PlugDsl", "Block", "Typedef", "Module", "Return", "Exp", "Async", "False", "Regex", "Bool", "Enum", "From", "Mask", "Path", "True", "Any", "Def", "Flt", "Get", "Int", "Lda", "Ldt", "Let", "Ltm", "Mut", "Set", "Str", "NumberSignLeftParenthesis", "HyphenMinusGreaterThanSign", "FullStopFullStop", "As", "LineFeed", "CarriageReturn", "RightParenthesis", "Comma", "Colon", "EqualsSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_PID", "RULE_ID", "RULE_INT", "RULE_NATURAL", "RULE_FLOAT", "RULE_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=16;
    public static final int RULE_BEGIN=49;
    public static final int True=20;
    public static final int False=13;
    public static final int Str=32;
    public static final int RULE_PID=51;
    public static final int Regex=14;
    public static final int Bool=15;
    public static final int Async=12;
    public static final int FullStopFullStop=35;
    public static final int RightSquareBracket=46;
    public static final int RULE_ID=52;
    public static final int Mask=18;
    public static final int RightParenthesis=39;
    public static final int Mut=30;
    public static final int Typedef=8;
    public static final int RULE_INT=53;
    public static final int Get=24;
    public static final int RULE_NATURAL=54;
    public static final int RULE_ML_COMMENT=57;
    public static final int Block=7;
    public static final int RULE_TEXT=56;
    public static final int LeftSquareBracket=45;
    public static final int Module=9;
    public static final int RULE_END=50;
    public static final int Set=31;
    public static final int Ltm=29;
    public static final int Lda=26;
    public static final int Test10=5;
    public static final int Any=21;
    public static final int Int=25;
    public static final int Flt=23;
    public static final int RULE_SL_COMMENT=58;
    public static final int Comma=40;
    public static final int EqualsSign=42;
    public static final int As=36;
    public static final int NumberSignLeftParenthesis=33;
    public static final int CarriageReturn=38;
    public static final int Colon=41;
    public static final int RightCurlyBracket=48;
    public static final int EOF=-1;
    public static final int Ldt=27;
    public static final int Path=19;
    public static final int Return=10;
    public static final int Def=22;
    public static final int RULE_WS=59;
    public static final int Definitions=4;
    public static final int LeftCurlyBracket=47;
    public static final int From=17;
    public static final int RULE_ANY_OTHER=60;
    public static final int CommercialAt=44;
    public static final int PlugDsl=6;
    public static final int QuestionMark=43;
    public static final int RULE_FLOAT=55;
    public static final int Let=28;
    public static final int Exp=11;
    public static final int HyphenMinusGreaterThanSign=34;
    public static final int LineFeed=37;

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
    // InternalEldmDslParser.g:64:1: ruleModule returns [EObject current=null] : (otherlv_0= Module ( (lv_name_1_0= rulePath ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )+ this_END_7= RULE_END )? ( (lv_opers_8_0= ruleOperation ) )* ( (lv_paths_9_0= ruleSubPath ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_plugs_3_0 = null;

        EObject lv_defs_6_0 = null;

        EObject lv_opers_8_0 = null;

        EObject lv_paths_9_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:70:2: ( (otherlv_0= Module ( (lv_name_1_0= rulePath ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )+ this_END_7= RULE_END )? ( (lv_opers_8_0= ruleOperation ) )* ( (lv_paths_9_0= ruleSubPath ) )* ) )
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePath ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )+ this_END_7= RULE_END )? ( (lv_opers_8_0= ruleOperation ) )* ( (lv_paths_9_0= ruleSubPath ) )* )
            {
            // InternalEldmDslParser.g:71:2: (otherlv_0= Module ( (lv_name_1_0= rulePath ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )+ this_END_7= RULE_END )? ( (lv_opers_8_0= ruleOperation ) )* ( (lv_paths_9_0= ruleSubPath ) )* )
            // InternalEldmDslParser.g:72:3: otherlv_0= Module ( (lv_name_1_0= rulePath ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_plugs_3_0= rulePlugDsl ) )* (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )+ this_END_7= RULE_END )? ( (lv_opers_8_0= ruleOperation ) )* ( (lv_paths_9_0= ruleSubPath ) )*
            {
            otherlv_0=(Token)match(input,Module,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
              		
            }
            // InternalEldmDslParser.g:76:3: ( (lv_name_1_0= rulePath ) )
            // InternalEldmDslParser.g:77:4: (lv_name_1_0= rulePath )
            {
            // InternalEldmDslParser.g:77:4: (lv_name_1_0= rulePath )
            // InternalEldmDslParser.g:78:5: lv_name_1_0= rulePath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleAccess().getNamePathParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=rulePath();

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
              						"net.eldm.EldmDsl.Path");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEldmDslParser.g:95:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_PID && LA1_0<=RULE_ID)) ) {
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

            // InternalEldmDslParser.g:133:3: (otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )+ this_END_7= RULE_END )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Definitions) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEldmDslParser.g:134:4: otherlv_4= Definitions this_BEGIN_5= RULE_BEGIN ( (lv_defs_6_0= ruleDefinition ) )+ this_END_7= RULE_END
                    {
                    otherlv_4=(Token)match(input,Definitions,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getDefinitionsKeyword_4_0());
                      			
                    }
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_5, grammarAccess.getModuleAccess().getBEGINTerminalRuleCall_4_1());
                      			
                    }
                    // InternalEldmDslParser.g:142:4: ( (lv_defs_6_0= ruleDefinition ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Typedef||LA3_0==Enum||LA3_0==RULE_ID) ) {
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
                    	    pushFollow(FOLLOW_8);
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
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_7, grammarAccess.getModuleAccess().getENDTerminalRuleCall_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:166:3: ( (lv_opers_8_0= ruleOperation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Def) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==Get||LA5_1==Set) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalEldmDslParser.g:167:4: (lv_opers_8_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:167:4: (lv_opers_8_0= ruleOperation )
            	    // InternalEldmDslParser.g:168:5: lv_opers_8_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getOpersOperationParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_opers_8_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"opers",
            	      						lv_opers_8_0,
            	      						"net.eldm.EldmDsl.Operation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalEldmDslParser.g:185:3: ( (lv_paths_9_0= ruleSubPath ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Def) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEldmDslParser.g:186:4: (lv_paths_9_0= ruleSubPath )
            	    {
            	    // InternalEldmDslParser.g:186:4: (lv_paths_9_0= ruleSubPath )
            	    // InternalEldmDslParser.g:187:5: lv_paths_9_0= ruleSubPath
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getPathsSubPathParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_paths_9_0=ruleSubPath();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paths",
            	      						lv_paths_9_0,
            	      						"net.eldm.EldmDsl.SubPath");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalEldmDslParser.g:208:1: entryRulePlugDsl returns [EObject current=null] : iv_rulePlugDsl= rulePlugDsl EOF ;
    public final EObject entryRulePlugDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugDsl = null;


        try {
            // InternalEldmDslParser.g:208:48: (iv_rulePlugDsl= rulePlugDsl EOF )
            // InternalEldmDslParser.g:209:2: iv_rulePlugDsl= rulePlugDsl EOF
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
    // InternalEldmDslParser.g:215:1: rulePlugDsl returns [EObject current=null] : (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) ) ;
    public final EObject rulePlugDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_adaptor_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:221:2: ( (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) ) )
            // InternalEldmDslParser.g:222:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) )
            {
            // InternalEldmDslParser.g:222:2: (otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) ) )
            // InternalEldmDslParser.g:223:3: otherlv_0= PlugDsl ( (lv_name_1_0= RULE_ID ) ) ( (lv_adaptor_2_0= rulePatternLiteral ) )
            {
            otherlv_0=(Token)match(input,PlugDsl,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlugDslAccess().getPlugDslKeyword_0());
              		
            }
            // InternalEldmDslParser.g:227:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:228:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:228:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:229:5: lv_name_1_0= RULE_ID
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

            // InternalEldmDslParser.g:245:3: ( (lv_adaptor_2_0= rulePatternLiteral ) )
            // InternalEldmDslParser.g:246:4: (lv_adaptor_2_0= rulePatternLiteral )
            {
            // InternalEldmDslParser.g:246:4: (lv_adaptor_2_0= rulePatternLiteral )
            // InternalEldmDslParser.g:247:5: lv_adaptor_2_0= rulePatternLiteral
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
    // InternalEldmDslParser.g:268:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEldmDslParser.g:268:47: (iv_ruleImport= ruleImport EOF )
            // InternalEldmDslParser.g:269:2: iv_ruleImport= ruleImport EOF
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
    // InternalEldmDslParser.g:275:1: ruleImport returns [EObject current=null] : (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_ImportOperation_0 = null;

        EObject this_ImportDefinition_1 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:281:2: ( (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition ) )
            // InternalEldmDslParser.g:282:2: (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition )
            {
            // InternalEldmDslParser.g:282:2: (this_ImportOperation_0= ruleImportOperation | this_ImportDefinition_1= ruleImportDefinition )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_PID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEldmDslParser.g:283:3: this_ImportOperation_0= ruleImportOperation
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
                    // InternalEldmDslParser.g:292:3: this_ImportDefinition_1= ruleImportDefinition
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
    // InternalEldmDslParser.g:304:1: entryRuleImportOperation returns [EObject current=null] : iv_ruleImportOperation= ruleImportOperation EOF ;
    public final EObject entryRuleImportOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportOperation = null;


        try {
            // InternalEldmDslParser.g:304:56: (iv_ruleImportOperation= ruleImportOperation EOF )
            // InternalEldmDslParser.g:305:2: iv_ruleImportOperation= ruleImportOperation EOF
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
    // InternalEldmDslParser.g:311:1: ruleImportOperation returns [EObject current=null] : ( ( (lv_name_0_0= rulePath ) ) otherlv_1= From ( (lv_ref_2_0= rulePath ) ) ) ;
    public final EObject ruleImportOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:317:2: ( ( ( (lv_name_0_0= rulePath ) ) otherlv_1= From ( (lv_ref_2_0= rulePath ) ) ) )
            // InternalEldmDslParser.g:318:2: ( ( (lv_name_0_0= rulePath ) ) otherlv_1= From ( (lv_ref_2_0= rulePath ) ) )
            {
            // InternalEldmDslParser.g:318:2: ( ( (lv_name_0_0= rulePath ) ) otherlv_1= From ( (lv_ref_2_0= rulePath ) ) )
            // InternalEldmDslParser.g:319:3: ( (lv_name_0_0= rulePath ) ) otherlv_1= From ( (lv_ref_2_0= rulePath ) )
            {
            // InternalEldmDslParser.g:319:3: ( (lv_name_0_0= rulePath ) )
            // InternalEldmDslParser.g:320:4: (lv_name_0_0= rulePath )
            {
            // InternalEldmDslParser.g:320:4: (lv_name_0_0= rulePath )
            // InternalEldmDslParser.g:321:5: lv_name_0_0= rulePath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportOperationAccess().getNamePathParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_name_0_0=rulePath();

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
              						"net.eldm.EldmDsl.Path");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,From,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImportOperationAccess().getFromKeyword_1());
              		
            }
            // InternalEldmDslParser.g:342:3: ( (lv_ref_2_0= rulePath ) )
            // InternalEldmDslParser.g:343:4: (lv_ref_2_0= rulePath )
            {
            // InternalEldmDslParser.g:343:4: (lv_ref_2_0= rulePath )
            // InternalEldmDslParser.g:344:5: lv_ref_2_0= rulePath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportOperationAccess().getRefPathParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ref_2_0=rulePath();

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
              						"net.eldm.EldmDsl.Path");
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
    // InternalEldmDslParser.g:365:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // InternalEldmDslParser.g:365:57: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // InternalEldmDslParser.g:366:2: iv_ruleImportDefinition= ruleImportDefinition EOF
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
    // InternalEldmDslParser.g:372:1: ruleImportDefinition returns [EObject current=null] : ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePath ) ) ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_defs_0_0 = null;

        EObject lv_defs_2_0 = null;

        AntlrDatatypeRuleToken lv_ref_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:378:2: ( ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePath ) ) ) )
            // InternalEldmDslParser.g:379:2: ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePath ) ) )
            {
            // InternalEldmDslParser.g:379:2: ( ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePath ) ) )
            // InternalEldmDslParser.g:380:3: ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* ) otherlv_3= From ( (lv_ref_4_0= rulePath ) )
            {
            // InternalEldmDslParser.g:380:3: ( ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )* )
            // InternalEldmDslParser.g:381:4: ( (lv_defs_0_0= ruleExternalDef ) ) (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )*
            {
            // InternalEldmDslParser.g:381:4: ( (lv_defs_0_0= ruleExternalDef ) )
            // InternalEldmDslParser.g:382:5: (lv_defs_0_0= ruleExternalDef )
            {
            // InternalEldmDslParser.g:382:5: (lv_defs_0_0= ruleExternalDef )
            // InternalEldmDslParser.g:383:6: lv_defs_0_0= ruleExternalDef
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

            // InternalEldmDslParser.g:400:4: (otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEldmDslParser.g:401:5: otherlv_1= Comma ( (lv_defs_2_0= ruleExternalDef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_1, grammarAccess.getImportDefinitionAccess().getCommaKeyword_0_1_0());
            	      				
            	    }
            	    // InternalEldmDslParser.g:405:5: ( (lv_defs_2_0= ruleExternalDef ) )
            	    // InternalEldmDslParser.g:406:6: (lv_defs_2_0= ruleExternalDef )
            	    {
            	    // InternalEldmDslParser.g:406:6: (lv_defs_2_0= ruleExternalDef )
            	    // InternalEldmDslParser.g:407:7: lv_defs_2_0= ruleExternalDef
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
            	    break loop8;
                }
            } while (true);


            }

            otherlv_3=(Token)match(input,From,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getImportDefinitionAccess().getFromKeyword_1());
              		
            }
            // InternalEldmDslParser.g:430:3: ( (lv_ref_4_0= rulePath ) )
            // InternalEldmDslParser.g:431:4: (lv_ref_4_0= rulePath )
            {
            // InternalEldmDslParser.g:431:4: (lv_ref_4_0= rulePath )
            // InternalEldmDslParser.g:432:5: lv_ref_4_0= rulePath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportDefinitionAccess().getRefPathParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ref_4_0=rulePath();

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
              						"net.eldm.EldmDsl.Path");
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
    // InternalEldmDslParser.g:453:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalEldmDslParser.g:453:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalEldmDslParser.g:454:2: iv_ruleExternalDef= ruleExternalDef EOF
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
    // InternalEldmDslParser.g:460:1: ruleExternalDef returns [EObject current=null] : ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token lv_ref_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:466:2: ( ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:467:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:467:2: ( ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? ) | ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (true) ) {
                    alt10=1;
                }
                else if ( (synpred1_InternalEldmDslParser()) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEldmDslParser.g:468:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    {
                    // InternalEldmDslParser.g:468:3: ( ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )? )
                    // InternalEldmDslParser.g:469:4: ( (lv_ref_0_0= RULE_ID ) ) (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    {
                    // InternalEldmDslParser.g:469:4: ( (lv_ref_0_0= RULE_ID ) )
                    // InternalEldmDslParser.g:470:5: (lv_ref_0_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:470:5: (lv_ref_0_0= RULE_ID )
                    // InternalEldmDslParser.g:471:6: lv_ref_0_0= RULE_ID
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

                    // InternalEldmDslParser.g:487:4: (otherlv_1= As ( (lv_name_2_0= RULE_ID ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==As) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalEldmDslParser.g:488:5: otherlv_1= As ( (lv_name_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,As,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getExternalDefAccess().getAsKeyword_0_1_0());
                              				
                            }
                            // InternalEldmDslParser.g:492:5: ( (lv_name_2_0= RULE_ID ) )
                            // InternalEldmDslParser.g:493:6: (lv_name_2_0= RULE_ID )
                            {
                            // InternalEldmDslParser.g:493:6: (lv_name_2_0= RULE_ID )
                            // InternalEldmDslParser.g:494:7: lv_name_2_0= RULE_ID
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
                    // InternalEldmDslParser.g:513:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:513:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
                    // InternalEldmDslParser.g:514:4: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
                    {
                    // InternalEldmDslParser.g:518:4: (lv_name_3_0= RULE_ID )
                    // InternalEldmDslParser.g:519:5: lv_name_3_0= RULE_ID
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


    // $ANTLR start "entryRuleSubPath"
    // InternalEldmDslParser.g:539:1: entryRuleSubPath returns [EObject current=null] : iv_ruleSubPath= ruleSubPath EOF ;
    public final EObject entryRuleSubPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPath = null;


        try {
            // InternalEldmDslParser.g:539:48: (iv_ruleSubPath= ruleSubPath EOF )
            // InternalEldmDslParser.g:540:2: iv_ruleSubPath= ruleSubPath EOF
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
    // InternalEldmDslParser.g:546:1: ruleSubPath returns [EObject current=null] : (otherlv_0= Def ( (lv_name_1_0= rulePath ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleSubPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_opers_3_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:552:2: ( (otherlv_0= Def ( (lv_name_1_0= rulePath ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END ) )
            // InternalEldmDslParser.g:553:2: (otherlv_0= Def ( (lv_name_1_0= rulePath ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            {
            // InternalEldmDslParser.g:553:2: (otherlv_0= Def ( (lv_name_1_0= rulePath ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END )
            // InternalEldmDslParser.g:554:3: otherlv_0= Def ( (lv_name_1_0= rulePath ) ) this_BEGIN_2= RULE_BEGIN ( (lv_opers_3_0= ruleOperation ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSubPathAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:558:3: ( (lv_name_1_0= rulePath ) )
            // InternalEldmDslParser.g:559:4: (lv_name_1_0= rulePath )
            {
            // InternalEldmDslParser.g:559:4: (lv_name_1_0= rulePath )
            // InternalEldmDslParser.g:560:5: lv_name_1_0= rulePath
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubPathAccess().getNamePathParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePath();

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
              						"net.eldm.EldmDsl.Path");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getSubPathAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalEldmDslParser.g:581:3: ( (lv_opers_3_0= ruleOperation ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Def) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEldmDslParser.g:582:4: (lv_opers_3_0= ruleOperation )
            	    {
            	    // InternalEldmDslParser.g:582:4: (lv_opers_3_0= ruleOperation )
            	    // InternalEldmDslParser.g:583:5: lv_opers_3_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubPathAccess().getOpersOperationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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


    // $ANTLR start "entryRuleOperation"
    // InternalEldmDslParser.g:608:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalEldmDslParser.g:608:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalEldmDslParser.g:609:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalEldmDslParser.g:615:1: ruleOperation returns [EObject current=null] : (otherlv_0= Def ( ( (lv_isGet_1_0= Get ) ) | otherlv_2= Set ) ( (lv_name_3_0= rulePath ) )? ( (lv_param_4_0= ruleParamDef ) )? (otherlv_5= HyphenMinusGreaterThanSign ( (lv_result_6_0= ruleElementTypeDef ) ) )? otherlv_7= Colon ( (lv_body_8_0= ruleBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isGet_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_param_4_0 = null;

        EObject lv_result_6_0 = null;

        AntlrDatatypeRuleToken lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:621:2: ( (otherlv_0= Def ( ( (lv_isGet_1_0= Get ) ) | otherlv_2= Set ) ( (lv_name_3_0= rulePath ) )? ( (lv_param_4_0= ruleParamDef ) )? (otherlv_5= HyphenMinusGreaterThanSign ( (lv_result_6_0= ruleElementTypeDef ) ) )? otherlv_7= Colon ( (lv_body_8_0= ruleBlockExpression ) ) ) )
            // InternalEldmDslParser.g:622:2: (otherlv_0= Def ( ( (lv_isGet_1_0= Get ) ) | otherlv_2= Set ) ( (lv_name_3_0= rulePath ) )? ( (lv_param_4_0= ruleParamDef ) )? (otherlv_5= HyphenMinusGreaterThanSign ( (lv_result_6_0= ruleElementTypeDef ) ) )? otherlv_7= Colon ( (lv_body_8_0= ruleBlockExpression ) ) )
            {
            // InternalEldmDslParser.g:622:2: (otherlv_0= Def ( ( (lv_isGet_1_0= Get ) ) | otherlv_2= Set ) ( (lv_name_3_0= rulePath ) )? ( (lv_param_4_0= ruleParamDef ) )? (otherlv_5= HyphenMinusGreaterThanSign ( (lv_result_6_0= ruleElementTypeDef ) ) )? otherlv_7= Colon ( (lv_body_8_0= ruleBlockExpression ) ) )
            // InternalEldmDslParser.g:623:3: otherlv_0= Def ( ( (lv_isGet_1_0= Get ) ) | otherlv_2= Set ) ( (lv_name_3_0= rulePath ) )? ( (lv_param_4_0= ruleParamDef ) )? (otherlv_5= HyphenMinusGreaterThanSign ( (lv_result_6_0= ruleElementTypeDef ) ) )? otherlv_7= Colon ( (lv_body_8_0= ruleBlockExpression ) )
            {
            otherlv_0=(Token)match(input,Def,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getDefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:627:3: ( ( (lv_isGet_1_0= Get ) ) | otherlv_2= Set )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Get) ) {
                alt12=1;
            }
            else if ( (LA12_0==Set) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEldmDslParser.g:628:4: ( (lv_isGet_1_0= Get ) )
                    {
                    // InternalEldmDslParser.g:628:4: ( (lv_isGet_1_0= Get ) )
                    // InternalEldmDslParser.g:629:5: (lv_isGet_1_0= Get )
                    {
                    // InternalEldmDslParser.g:629:5: (lv_isGet_1_0= Get )
                    // InternalEldmDslParser.g:630:6: lv_isGet_1_0= Get
                    {
                    lv_isGet_1_0=(Token)match(input,Get,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isGet_1_0, grammarAccess.getOperationAccess().getIsGetGetKeyword_1_0_0());
                      					
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
                    // InternalEldmDslParser.g:643:4: otherlv_2= Set
                    {
                    otherlv_2=(Token)match(input,Set,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getSetKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEldmDslParser.g:648:3: ( (lv_name_3_0= rulePath ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_PID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEldmDslParser.g:649:4: (lv_name_3_0= rulePath )
                    {
                    // InternalEldmDslParser.g:649:4: (lv_name_3_0= rulePath )
                    // InternalEldmDslParser.g:650:5: lv_name_3_0= rulePath
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationAccess().getNamePathParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_name_3_0=rulePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_3_0,
                      						"net.eldm.EldmDsl.Path");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:667:3: ( (lv_param_4_0= ruleParamDef ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LeftCurlyBracket||LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEldmDslParser.g:668:4: (lv_param_4_0= ruleParamDef )
                    {
                    // InternalEldmDslParser.g:668:4: (lv_param_4_0= ruleParamDef )
                    // InternalEldmDslParser.g:669:5: lv_param_4_0= ruleParamDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationAccess().getParamParamDefParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_param_4_0=ruleParamDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationRule());
                      					}
                      					set(
                      						current,
                      						"param",
                      						lv_param_4_0,
                      						"net.eldm.EldmDsl.ParamDef");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEldmDslParser.g:686:3: (otherlv_5= HyphenMinusGreaterThanSign ( (lv_result_6_0= ruleElementTypeDef ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HyphenMinusGreaterThanSign) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEldmDslParser.g:687:4: otherlv_5= HyphenMinusGreaterThanSign ( (lv_result_6_0= ruleElementTypeDef ) )
                    {
                    otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                      			
                    }
                    // InternalEldmDslParser.g:691:4: ( (lv_result_6_0= ruleElementTypeDef ) )
                    // InternalEldmDslParser.g:692:5: (lv_result_6_0= ruleElementTypeDef )
                    {
                    // InternalEldmDslParser.g:692:5: (lv_result_6_0= ruleElementTypeDef )
                    // InternalEldmDslParser.g:693:6: lv_result_6_0= ruleElementTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationAccess().getResultElementTypeDefParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_result_6_0=ruleElementTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationRule());
                      						}
                      						set(
                      							current,
                      							"result",
                      							lv_result_6_0,
                      							"net.eldm.EldmDsl.ElementTypeDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getColonKeyword_5());
              		
            }
            // InternalEldmDslParser.g:715:3: ( (lv_body_8_0= ruleBlockExpression ) )
            // InternalEldmDslParser.g:716:4: (lv_body_8_0= ruleBlockExpression )
            {
            // InternalEldmDslParser.g:716:4: (lv_body_8_0= ruleBlockExpression )
            // InternalEldmDslParser.g:717:5: lv_body_8_0= ruleBlockExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getBodyBlockExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_8_0,
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
    // InternalEldmDslParser.g:738:1: entryRuleParamDef returns [EObject current=null] : iv_ruleParamDef= ruleParamDef EOF ;
    public final EObject entryRuleParamDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDef = null;


        try {
            // InternalEldmDslParser.g:738:49: (iv_ruleParamDef= ruleParamDef EOF )
            // InternalEldmDslParser.g:739:2: iv_ruleParamDef= ruleParamDef EOF
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
    // InternalEldmDslParser.g:745:1: ruleParamDef returns [EObject current=null] : ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleParamDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_def_0_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:751:2: ( ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:752:2: ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:752:2: ( ( (lv_def_0_0= ruleMapDef ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftCurlyBracket) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:753:3: ( (lv_def_0_0= ruleMapDef ) )
                    {
                    // InternalEldmDslParser.g:753:3: ( (lv_def_0_0= ruleMapDef ) )
                    // InternalEldmDslParser.g:754:4: (lv_def_0_0= ruleMapDef )
                    {
                    // InternalEldmDslParser.g:754:4: (lv_def_0_0= ruleMapDef )
                    // InternalEldmDslParser.g:755:5: lv_def_0_0= ruleMapDef
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
                    // InternalEldmDslParser.g:773:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:773:3: ( (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:774:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:774:4: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:775:5: otherlv_1= RULE_ID
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


    // $ANTLR start "entryRuleBlockExpression"
    // InternalEldmDslParser.g:790:1: entryRuleBlockExpression returns [String current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final String entryRuleBlockExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockExpression = null;


        try {
            // InternalEldmDslParser.g:790:55: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // InternalEldmDslParser.g:791:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockExpression.getText(); 
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
    // InternalEldmDslParser.g:797:1: ruleBlockExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BEGIN_0= RULE_BEGIN kw= Block this_END_2= RULE_END ) ;
    public final AntlrDatatypeRuleToken ruleBlockExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BEGIN_0=null;
        Token kw=null;
        Token this_END_2=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:803:2: ( (this_BEGIN_0= RULE_BEGIN kw= Block this_END_2= RULE_END ) )
            // InternalEldmDslParser.g:804:2: (this_BEGIN_0= RULE_BEGIN kw= Block this_END_2= RULE_END )
            {
            // InternalEldmDslParser.g:804:2: (this_BEGIN_0= RULE_BEGIN kw= Block this_END_2= RULE_END )
            // InternalEldmDslParser.g:805:3: this_BEGIN_0= RULE_BEGIN kw= Block this_END_2= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_BEGIN_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_0, grammarAccess.getBlockExpressionAccess().getBEGINTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,Block,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockExpressionAccess().getBlockKeyword_1());
              		
            }
            this_END_2=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_END_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_2, grammarAccess.getBlockExpressionAccess().getENDTerminalRuleCall_2());
              		
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
    // InternalEldmDslParser.g:828:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalEldmDslParser.g:828:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalEldmDslParser.g:829:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression.getText(); 
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
    // InternalEldmDslParser.g:835:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Exp ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:841:2: (kw= Exp )
            // InternalEldmDslParser.g:842:2: kw= Exp
            {
            kw=(Token)match(input,Exp,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getExpressionAccess().getExpKeyword());
              	
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


    // $ANTLR start "entryRuleMapExpression"
    // InternalEldmDslParser.g:850:1: entryRuleMapExpression returns [String current=null] : iv_ruleMapExpression= ruleMapExpression EOF ;
    public final String entryRuleMapExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapExpression = null;


        try {
            // InternalEldmDslParser.g:850:53: (iv_ruleMapExpression= ruleMapExpression EOF )
            // InternalEldmDslParser.g:851:2: iv_ruleMapExpression= ruleMapExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapExpression=ruleMapExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapExpression.getText(); 
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
    // $ANTLR end "entryRuleMapExpression"


    // $ANTLR start "ruleMapExpression"
    // InternalEldmDslParser.g:857:1: ruleMapExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Test10 ;
    public final AntlrDatatypeRuleToken ruleMapExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:863:2: (kw= Test10 )
            // InternalEldmDslParser.g:864:2: kw= Test10
            {
            kw=(Token)match(input,Test10,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMapExpressionAccess().getTest10Keyword());
              	
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
    // $ANTLR end "ruleMapExpression"


    // $ANTLR start "entryRuleDefinition"
    // InternalEldmDslParser.g:872:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalEldmDslParser.g:872:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalEldmDslParser.g:873:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalEldmDslParser.g:879:1: ruleDefinition returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_EnumDef_1= ruleEnumDef | this_ExternalDef_2= ruleExternalDef ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_EnumDef_1 = null;

        EObject this_ExternalDef_2 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:885:2: ( (this_TypeDef_0= ruleTypeDef | this_EnumDef_1= ruleEnumDef | this_ExternalDef_2= ruleExternalDef ) )
            // InternalEldmDslParser.g:886:2: (this_TypeDef_0= ruleTypeDef | this_EnumDef_1= ruleEnumDef | this_ExternalDef_2= ruleExternalDef )
            {
            // InternalEldmDslParser.g:886:2: (this_TypeDef_0= ruleTypeDef | this_EnumDef_1= ruleEnumDef | this_ExternalDef_2= ruleExternalDef )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Typedef:
                {
                alt17=1;
                }
                break;
            case Enum:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalEldmDslParser.g:887:3: this_TypeDef_0= ruleTypeDef
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
                    // InternalEldmDslParser.g:896:3: this_EnumDef_1= ruleEnumDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getEnumDefParserRuleCall_1());
                      		
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
                    // InternalEldmDslParser.g:905:3: this_ExternalDef_2= ruleExternalDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionAccess().getExternalDefParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternalDef_2=ruleExternalDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternalDef_2;
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
    // InternalEldmDslParser.g:917:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEldmDslParser.g:917:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEldmDslParser.g:918:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalEldmDslParser.g:924:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleValueDef ) ) ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_parser_2_1=null;
        Token lv_parser_2_2=null;
        Token lv_parser_2_3=null;
        Token lv_code_3_0=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:930:2: ( (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleValueDef ) ) ) ) )
            // InternalEldmDslParser.g:931:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleValueDef ) ) ) )
            {
            // InternalEldmDslParser.g:931:2: (otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleValueDef ) ) ) )
            // InternalEldmDslParser.g:932:3: otherlv_0= Typedef ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleValueDef ) ) )
            {
            otherlv_0=(Token)match(input,Typedef,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
              		
            }
            // InternalEldmDslParser.g:936:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:937:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:937:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:938:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            // InternalEldmDslParser.g:954:3: ( ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) ) | ( (lv_type_4_0= ruleValueDef ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Return||LA19_0==Regex||LA19_0==Mask) ) {
                alt19=1;
            }
            else if ( (LA19_0==Bool||LA19_0==Path||LA19_0==Any||LA19_0==Flt||(LA19_0>=Int && LA19_0<=Ldt)||LA19_0==Ltm||LA19_0==Str||LA19_0==FullStopFullStop||LA19_0==LeftCurlyBracket) ) {
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
                    // InternalEldmDslParser.g:955:4: ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    {
                    // InternalEldmDslParser.g:955:4: ( ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) ) )
                    // InternalEldmDslParser.g:956:5: ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) ) ( (lv_code_3_0= RULE_TEXT ) )
                    {
                    // InternalEldmDslParser.g:956:5: ( ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) ) )
                    // InternalEldmDslParser.g:957:6: ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) )
                    {
                    // InternalEldmDslParser.g:957:6: ( (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return ) )
                    // InternalEldmDslParser.g:958:7: (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return )
                    {
                    // InternalEldmDslParser.g:958:7: (lv_parser_2_1= Regex | lv_parser_2_2= Mask | lv_parser_2_3= Return )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case Regex:
                        {
                        alt18=1;
                        }
                        break;
                    case Mask:
                        {
                        alt18=2;
                        }
                        break;
                    case Return:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // InternalEldmDslParser.g:959:8: lv_parser_2_1= Regex
                            {
                            lv_parser_2_1=(Token)match(input,Regex,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_parser_2_1, grammarAccess.getTypeDefAccess().getParserRegexKeyword_2_0_0_0_0());
                              							
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
                            // InternalEldmDslParser.g:970:8: lv_parser_2_2= Mask
                            {
                            lv_parser_2_2=(Token)match(input,Mask,FOLLOW_27); if (state.failed) return current;
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
                        case 3 :
                            // InternalEldmDslParser.g:981:8: lv_parser_2_3= Return
                            {
                            lv_parser_2_3=(Token)match(input,Return,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_parser_2_3, grammarAccess.getTypeDefAccess().getParserReturnKeyword_2_0_0_0_2());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTypeDefRule());
                              								}
                              								setWithLastConsumed(current, "parser", lv_parser_2_3, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalEldmDslParser.g:994:5: ( (lv_code_3_0= RULE_TEXT ) )
                    // InternalEldmDslParser.g:995:6: (lv_code_3_0= RULE_TEXT )
                    {
                    // InternalEldmDslParser.g:995:6: (lv_code_3_0= RULE_TEXT )
                    // InternalEldmDslParser.g:996:7: lv_code_3_0= RULE_TEXT
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
                    // InternalEldmDslParser.g:1014:4: ( (lv_type_4_0= ruleValueDef ) )
                    {
                    // InternalEldmDslParser.g:1014:4: ( (lv_type_4_0= ruleValueDef ) )
                    // InternalEldmDslParser.g:1015:5: (lv_type_4_0= ruleValueDef )
                    {
                    // InternalEldmDslParser.g:1015:5: (lv_type_4_0= ruleValueDef )
                    // InternalEldmDslParser.g:1016:6: lv_type_4_0= ruleValueDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDefAccess().getTypeValueDefParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleValueDef();

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
                      							"net.eldm.EldmDsl.ValueDef");
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


    // $ANTLR start "entryRuleEnumDef"
    // InternalEldmDslParser.g:1038:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // InternalEldmDslParser.g:1038:48: (iv_ruleEnumDef= ruleEnumDef EOF )
            // InternalEldmDslParser.g:1039:2: iv_ruleEnumDef= ruleEnumDef EOF
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
    // InternalEldmDslParser.g:1045:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleMapDef ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_defs_5_0= ruleEnumItemDef ) )+ this_END_6= RULE_END ) ;
    public final EObject ruleEnumDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_defs_5_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1051:2: ( (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleMapDef ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_defs_5_0= ruleEnumItemDef ) )+ this_END_6= RULE_END ) )
            // InternalEldmDslParser.g:1052:2: (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleMapDef ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_defs_5_0= ruleEnumItemDef ) )+ this_END_6= RULE_END )
            {
            // InternalEldmDslParser.g:1052:2: (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleMapDef ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_defs_5_0= ruleEnumItemDef ) )+ this_END_6= RULE_END )
            // InternalEldmDslParser.g:1053:3: otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleMapDef ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_defs_5_0= ruleEnumItemDef ) )+ this_END_6= RULE_END
            {
            otherlv_0=(Token)match(input,Enum,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
              		
            }
            // InternalEldmDslParser.g:1057:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEldmDslParser.g:1058:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1058:4: (lv_name_1_0= RULE_ID )
            // InternalEldmDslParser.g:1059:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumDefAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"net.eldm.EldmDsl.ID");
              				
            }

            }


            }

            // InternalEldmDslParser.g:1075:3: ( (lv_type_2_0= ruleMapDef ) )
            // InternalEldmDslParser.g:1076:4: (lv_type_2_0= ruleMapDef )
            {
            // InternalEldmDslParser.g:1076:4: (lv_type_2_0= ruleMapDef )
            // InternalEldmDslParser.g:1077:5: lv_type_2_0= ruleMapDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDefAccess().getTypeMapDefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_type_2_0=ruleMapDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumDefRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"net.eldm.EldmDsl.MapDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEnumDefAccess().getColonKeyword_3());
              		
            }
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_4, grammarAccess.getEnumDefAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalEldmDslParser.g:1102:3: ( (lv_defs_5_0= ruleEnumItemDef ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEldmDslParser.g:1103:4: (lv_defs_5_0= ruleEnumItemDef )
            	    {
            	    // InternalEldmDslParser.g:1103:4: (lv_defs_5_0= ruleEnumItemDef )
            	    // InternalEldmDslParser.g:1104:5: lv_defs_5_0= ruleEnumItemDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumDefAccess().getDefsEnumItemDefParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_defs_5_0=ruleEnumItemDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumDefRule());
            	      					}
            	      					add(
            	      						current,
            	      						"defs",
            	      						lv_defs_5_0,
            	      						"net.eldm.EldmDsl.EnumItemDef");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_6, grammarAccess.getEnumDefAccess().getENDTerminalRuleCall_6());
              		
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
    // InternalEldmDslParser.g:1129:1: entryRuleEnumItemDef returns [EObject current=null] : iv_ruleEnumItemDef= ruleEnumItemDef EOF ;
    public final EObject entryRuleEnumItemDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItemDef = null;


        try {
            // InternalEldmDslParser.g:1129:52: (iv_ruleEnumItemDef= ruleEnumItemDef EOF )
            // InternalEldmDslParser.g:1130:2: iv_ruleEnumItemDef= ruleEnumItemDef EOF
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
    // InternalEldmDslParser.g:1136:1: ruleEnumItemDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) ) ) ;
    public final EObject ruleEnumItemDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1142:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) ) ) )
            // InternalEldmDslParser.g:1143:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) ) )
            {
            // InternalEldmDslParser.g:1143:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) ) )
            // InternalEldmDslParser.g:1144:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleMapLiteral ) )
            {
            // InternalEldmDslParser.g:1144:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:1145:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1145:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:1146:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            // InternalEldmDslParser.g:1162:3: ( (lv_value_1_0= ruleMapLiteral ) )
            // InternalEldmDslParser.g:1163:4: (lv_value_1_0= ruleMapLiteral )
            {
            // InternalEldmDslParser.g:1163:4: (lv_value_1_0= ruleMapLiteral )
            // InternalEldmDslParser.g:1164:5: lv_value_1_0= ruleMapLiteral
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


    // $ANTLR start "entryRuleElementTypeDef"
    // InternalEldmDslParser.g:1185:1: entryRuleElementTypeDef returns [EObject current=null] : iv_ruleElementTypeDef= ruleElementTypeDef EOF ;
    public final EObject entryRuleElementTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementTypeDef = null;


        try {
            // InternalEldmDslParser.g:1185:55: (iv_ruleElementTypeDef= ruleElementTypeDef EOF )
            // InternalEldmDslParser.g:1186:2: iv_ruleElementTypeDef= ruleElementTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementTypeDef=ruleElementTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementTypeDef; 
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
    // $ANTLR end "entryRuleElementTypeDef"


    // $ANTLR start "ruleElementTypeDef"
    // InternalEldmDslParser.g:1192:1: ruleElementTypeDef returns [EObject current=null] : (this_ValueDef_0= ruleValueDef | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleElementTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ValueDef_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1198:2: ( (this_ValueDef_0= ruleValueDef | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:1199:2: (this_ValueDef_0= ruleValueDef | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:1199:2: (this_ValueDef_0= ruleValueDef | ( (otherlv_1= RULE_ID ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Bool||LA21_0==Path||LA21_0==Any||LA21_0==Flt||(LA21_0>=Int && LA21_0<=Ldt)||LA21_0==Ltm||LA21_0==Str||LA21_0==FullStopFullStop||LA21_0==LeftCurlyBracket) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:1200:3: this_ValueDef_0= ruleValueDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeDefAccess().getValueDefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ValueDef_0=ruleValueDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValueDef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1209:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:1209:3: ( (otherlv_1= RULE_ID ) )
                    // InternalEldmDslParser.g:1210:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEldmDslParser.g:1210:4: (otherlv_1= RULE_ID )
                    // InternalEldmDslParser.g:1211:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementTypeDefRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getElementTypeDefAccess().getRefDefinitionCrossReference_1_0());
                      				
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
    // $ANTLR end "ruleElementTypeDef"


    // $ANTLR start "entryRuleValueDef"
    // InternalEldmDslParser.g:1226:1: entryRuleValueDef returns [EObject current=null] : iv_ruleValueDef= ruleValueDef EOF ;
    public final EObject entryRuleValueDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueDef = null;


        try {
            // InternalEldmDslParser.g:1226:49: (iv_ruleValueDef= ruleValueDef EOF )
            // InternalEldmDslParser.g:1227:2: iv_ruleValueDef= ruleValueDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValueDef=ruleValueDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueDef; 
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
    // $ANTLR end "entryRuleValueDef"


    // $ANTLR start "ruleValueDef"
    // InternalEldmDslParser.g:1233:1: ruleValueDef returns [EObject current=null] : ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef ) ;
    public final EObject ruleValueDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_native_0_0 = null;

        EObject this_ListDef_1 = null;

        EObject this_MapDef_2 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1239:2: ( ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef ) )
            // InternalEldmDslParser.g:1240:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef )
            {
            // InternalEldmDslParser.g:1240:2: ( ( (lv_native_0_0= ruleNativeDef ) ) | this_ListDef_1= ruleListDef | this_MapDef_2= ruleMapDef )
            int alt22=3;
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
                alt22=1;
                }
                break;
            case FullStopFullStop:
                {
                alt22=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalEldmDslParser.g:1241:3: ( (lv_native_0_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:1241:3: ( (lv_native_0_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:1242:4: (lv_native_0_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:1242:4: (lv_native_0_0= ruleNativeDef )
                    // InternalEldmDslParser.g:1243:5: lv_native_0_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getValueDefAccess().getNativeNativeDefParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_native_0_0=ruleNativeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getValueDefRule());
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
                    // InternalEldmDslParser.g:1261:3: this_ListDef_1= ruleListDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueDefAccess().getListDefParserRuleCall_1());
                      		
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
                    // InternalEldmDslParser.g:1270:3: this_MapDef_2= ruleMapDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueDefAccess().getMapDefParserRuleCall_2());
                      		
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
    // $ANTLR end "ruleValueDef"


    // $ANTLR start "entryRuleMapDef"
    // InternalEldmDslParser.g:1282:1: entryRuleMapDef returns [EObject current=null] : iv_ruleMapDef= ruleMapDef EOF ;
    public final EObject entryRuleMapDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapDef = null;


        try {
            // InternalEldmDslParser.g:1282:47: (iv_ruleMapDef= ruleMapDef EOF )
            // InternalEldmDslParser.g:1283:2: iv_ruleMapDef= ruleMapDef EOF
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
    // InternalEldmDslParser.g:1289:1: ruleMapDef returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) ;
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
            // InternalEldmDslParser.g:1295:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:1296:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:1296:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftCurlyBracket) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_BEGIN) ) {
                    alt27=2;
                }
                else if ( (LA27_1==RULE_ID) && (synpred2_InternalEldmDslParser())) {
                    alt27=1;
                }
                else if ( (LA27_1==RightCurlyBracket) && (synpred2_InternalEldmDslParser())) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalEldmDslParser.g:1297:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:1297:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:1298:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:1320:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket )
                    // InternalEldmDslParser.g:1321:5: () otherlv_1= LeftCurlyBracket ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )? otherlv_5= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:1321:5: ()
                    // InternalEldmDslParser.g:1322:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapDefAccess().getMapDefAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapDefAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:1332:5: ( ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalEldmDslParser.g:1333:6: ( (lv_defs_2_0= ruleMapEntryDef ) ) (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:1333:6: ( (lv_defs_2_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:1334:7: (lv_defs_2_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:1334:7: (lv_defs_2_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:1335:8: lv_defs_2_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_31);
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

                            // InternalEldmDslParser.g:1352:6: (otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==Comma) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:1353:7: otherlv_3= Comma ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapDefAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:1357:7: ( (lv_defs_4_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:1358:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:1358:8: (lv_defs_4_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:1359:9: lv_defs_4_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_31);
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
                            	    break loop23;
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
                    // InternalEldmDslParser.g:1385:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:1385:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    // InternalEldmDslParser.g:1386:4: () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:1386:4: ()
                    // InternalEldmDslParser.g:1387:5: 
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
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getMapDefAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:1401:4: ( ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalEldmDslParser.g:1402:5: ( (lv_defs_9_0= ruleMapEntryDef ) ) ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )*
                            {
                            // InternalEldmDslParser.g:1402:5: ( (lv_defs_9_0= ruleMapEntryDef ) )
                            // InternalEldmDslParser.g:1403:6: (lv_defs_9_0= ruleMapEntryDef )
                            {
                            // InternalEldmDslParser.g:1403:6: (lv_defs_9_0= ruleMapEntryDef )
                            // InternalEldmDslParser.g:1404:7: lv_defs_9_0= ruleMapEntryDef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
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

                            // InternalEldmDslParser.g:1421:5: ( ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==EOF||(LA25_0>=LineFeed && LA25_0<=CarriageReturn)||LA25_0==RULE_ID) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:1422:6: ruleBREAK ( (lv_defs_11_0= ruleMapEntryDef ) )
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
                            	    // InternalEldmDslParser.g:1429:6: ( (lv_defs_11_0= ruleMapEntryDef ) )
                            	    // InternalEldmDslParser.g:1430:7: (lv_defs_11_0= ruleMapEntryDef )
                            	    {
                            	    // InternalEldmDslParser.g:1430:7: (lv_defs_11_0= ruleMapEntryDef )
                            	    // InternalEldmDslParser.g:1431:8: lv_defs_11_0= ruleMapEntryDef
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapDefAccess().getDefsMapEntryDefParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_32);
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
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_33); if (state.failed) return current;
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
    // InternalEldmDslParser.g:1463:1: entryRuleMapEntryDef returns [EObject current=null] : iv_ruleMapEntryDef= ruleMapEntryDef EOF ;
    public final EObject entryRuleMapEntryDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryDef = null;


        try {
            // InternalEldmDslParser.g:1463:52: (iv_ruleMapEntryDef= ruleMapEntryDef EOF )
            // InternalEldmDslParser.g:1464:2: iv_ruleMapEntryDef= ruleMapEntryDef EOF
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
    // InternalEldmDslParser.g:1470:1: ruleMapEntryDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) ) | (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) ) ) ) ;
    public final EObject ruleMapEntryDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_opt_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1476:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) ) | (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) ) ) ) )
            // InternalEldmDslParser.g:1477:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) ) | (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) ) ) )
            {
            // InternalEldmDslParser.g:1477:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) ) | (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) ) ) )
            // InternalEldmDslParser.g:1478:3: ( (lv_name_0_0= RULE_ID ) ) ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) ) | (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) ) )
            {
            // InternalEldmDslParser.g:1478:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:1479:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:1479:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:1480:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
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

            // InternalEldmDslParser.g:1496:3: ( ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) ) | (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Colon||LA29_0==QuestionMark) ) {
                alt29=1;
            }
            else if ( (LA29_0==EqualsSign) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalEldmDslParser.g:1497:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) )
                    {
                    // InternalEldmDslParser.g:1497:4: ( ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) ) )
                    // InternalEldmDslParser.g:1498:5: ( (lv_opt_1_0= QuestionMark ) )? otherlv_2= Colon ( (lv_type_3_0= ruleElementTypeDef ) )
                    {
                    // InternalEldmDslParser.g:1498:5: ( (lv_opt_1_0= QuestionMark ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==QuestionMark) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalEldmDslParser.g:1499:6: (lv_opt_1_0= QuestionMark )
                            {
                            // InternalEldmDslParser.g:1499:6: (lv_opt_1_0= QuestionMark )
                            // InternalEldmDslParser.g:1500:7: lv_opt_1_0= QuestionMark
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
                    // InternalEldmDslParser.g:1516:5: ( (lv_type_3_0= ruleElementTypeDef ) )
                    // InternalEldmDslParser.g:1517:6: (lv_type_3_0= ruleElementTypeDef )
                    {
                    // InternalEldmDslParser.g:1517:6: (lv_type_3_0= ruleElementTypeDef )
                    // InternalEldmDslParser.g:1518:7: lv_type_3_0= ruleElementTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMapEntryDefAccess().getTypeElementTypeDefParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleElementTypeDef();

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
                      								"net.eldm.EldmDsl.ElementTypeDef");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1537:4: (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) )
                    {
                    // InternalEldmDslParser.g:1537:4: (otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) ) )
                    // InternalEldmDslParser.g:1538:5: otherlv_4= EqualsSign ( (lv_value_5_0= ruleLiteral ) )
                    {
                    otherlv_4=(Token)match(input,EqualsSign,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMapEntryDefAccess().getEqualsSignKeyword_1_1_0());
                      				
                    }
                    // InternalEldmDslParser.g:1542:5: ( (lv_value_5_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:1543:6: (lv_value_5_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:1543:6: (lv_value_5_0= ruleLiteral )
                    // InternalEldmDslParser.g:1544:7: lv_value_5_0= ruleLiteral
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
    // InternalEldmDslParser.g:1567:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalEldmDslParser.g:1567:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalEldmDslParser.g:1568:2: iv_ruleListDef= ruleListDef EOF
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
    // InternalEldmDslParser.g:1574:1: ruleListDef returns [EObject current=null] : ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementTypeDef ) ) ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1580:2: ( ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementTypeDef ) ) ) )
            // InternalEldmDslParser.g:1581:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementTypeDef ) ) )
            {
            // InternalEldmDslParser.g:1581:2: ( () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementTypeDef ) ) )
            // InternalEldmDslParser.g:1582:3: () otherlv_1= FullStopFullStop ( (lv_type_2_0= ruleElementTypeDef ) )
            {
            // InternalEldmDslParser.g:1582:3: ()
            // InternalEldmDslParser.g:1583:4: 
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
            // InternalEldmDslParser.g:1593:3: ( (lv_type_2_0= ruleElementTypeDef ) )
            // InternalEldmDslParser.g:1594:4: (lv_type_2_0= ruleElementTypeDef )
            {
            // InternalEldmDslParser.g:1594:4: (lv_type_2_0= ruleElementTypeDef )
            // InternalEldmDslParser.g:1595:5: lv_type_2_0= ruleElementTypeDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getTypeElementTypeDefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleElementTypeDef();

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
              						"net.eldm.EldmDsl.ElementTypeDef");
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


    // $ANTLR start "entryRuleNativeDef"
    // InternalEldmDslParser.g:1616:1: entryRuleNativeDef returns [String current=null] : iv_ruleNativeDef= ruleNativeDef EOF ;
    public final String entryRuleNativeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNativeDef = null;


        try {
            // InternalEldmDslParser.g:1616:49: (iv_ruleNativeDef= ruleNativeDef EOF )
            // InternalEldmDslParser.g:1617:2: iv_ruleNativeDef= ruleNativeDef EOF
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
    // InternalEldmDslParser.g:1623:1: ruleNativeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Any | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Path ) ;
    public final AntlrDatatypeRuleToken ruleNativeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:1629:2: ( (kw= Any | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Path ) )
            // InternalEldmDslParser.g:1630:2: (kw= Any | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Path )
            {
            // InternalEldmDslParser.g:1630:2: (kw= Any | kw= Bool | kw= Str | kw= Int | kw= Flt | kw= Lda | kw= Ltm | kw= Ldt | kw= Path )
            int alt30=9;
            switch ( input.LA(1) ) {
            case Any:
                {
                alt30=1;
                }
                break;
            case Bool:
                {
                alt30=2;
                }
                break;
            case Str:
                {
                alt30=3;
                }
                break;
            case Int:
                {
                alt30=4;
                }
                break;
            case Flt:
                {
                alt30=5;
                }
                break;
            case Lda:
                {
                alt30=6;
                }
                break;
            case Ltm:
                {
                alt30=7;
                }
                break;
            case Ldt:
                {
                alt30=8;
                }
                break;
            case Path:
                {
                alt30=9;
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
                    // InternalEldmDslParser.g:1631:3: kw= Any
                    {
                    kw=(Token)match(input,Any,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getAnyKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1637:3: kw= Bool
                    {
                    kw=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getBoolKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEldmDslParser.g:1643:3: kw= Str
                    {
                    kw=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getStrKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEldmDslParser.g:1649:3: kw= Int
                    {
                    kw=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getIntKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEldmDslParser.g:1655:3: kw= Flt
                    {
                    kw=(Token)match(input,Flt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getFltKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:1661:3: kw= Lda
                    {
                    kw=(Token)match(input,Lda,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdaKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:1667:3: kw= Ltm
                    {
                    kw=(Token)match(input,Ltm,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLtmKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:1673:3: kw= Ldt
                    {
                    kw=(Token)match(input,Ldt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getLdtKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:1679:3: kw= Path
                    {
                    kw=(Token)match(input,Path,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getNativeDefAccess().getPathKeyword_8());
                      		
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
    // InternalEldmDslParser.g:1688:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEldmDslParser.g:1688:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEldmDslParser.g:1689:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEldmDslParser.g:1695:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_ListLiteral_4= ruleListLiteral | this_MapLiteral_5= ruleMapLiteral | this_EnumLiteral_6= ruleEnumLiteral | this_PatternLiteral_7= rulePatternLiteral | ( (lv_path_8_0= rulePath ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_StrLiteral_1 = null;

        EObject this_IntLiteral_2 = null;

        EObject this_FltLiteral_3 = null;

        EObject this_ListLiteral_4 = null;

        EObject this_MapLiteral_5 = null;

        EObject this_EnumLiteral_6 = null;

        EObject this_PatternLiteral_7 = null;

        AntlrDatatypeRuleToken lv_path_8_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1701:2: ( (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_ListLiteral_4= ruleListLiteral | this_MapLiteral_5= ruleMapLiteral | this_EnumLiteral_6= ruleEnumLiteral | this_PatternLiteral_7= rulePatternLiteral | ( (lv_path_8_0= rulePath ) ) ) )
            // InternalEldmDslParser.g:1702:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_ListLiteral_4= ruleListLiteral | this_MapLiteral_5= ruleMapLiteral | this_EnumLiteral_6= ruleEnumLiteral | this_PatternLiteral_7= rulePatternLiteral | ( (lv_path_8_0= rulePath ) ) )
            {
            // InternalEldmDslParser.g:1702:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_ListLiteral_4= ruleListLiteral | this_MapLiteral_5= ruleMapLiteral | this_EnumLiteral_6= ruleEnumLiteral | this_PatternLiteral_7= rulePatternLiteral | ( (lv_path_8_0= rulePath ) ) )
            int alt31=9;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalEldmDslParser.g:1703:3: this_BoolLiteral_0= ruleBoolLiteral
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
                    // InternalEldmDslParser.g:1712:3: this_StrLiteral_1= ruleStrLiteral
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
                    // InternalEldmDslParser.g:1721:3: this_IntLiteral_2= ruleIntLiteral
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
                    // InternalEldmDslParser.g:1730:3: this_FltLiteral_3= ruleFltLiteral
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
                    // InternalEldmDslParser.g:1739:3: this_ListLiteral_4= ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getListLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListLiteral_4=ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEldmDslParser.g:1748:3: this_MapLiteral_5= ruleMapLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getMapLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapLiteral_5=ruleMapLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEldmDslParser.g:1757:3: this_EnumLiteral_6= ruleEnumLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getEnumLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumLiteral_6=ruleEnumLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEldmDslParser.g:1766:3: this_PatternLiteral_7= rulePatternLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getPatternLiteralParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PatternLiteral_7=rulePatternLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PatternLiteral_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEldmDslParser.g:1775:3: ( (lv_path_8_0= rulePath ) )
                    {
                    // InternalEldmDslParser.g:1775:3: ( (lv_path_8_0= rulePath ) )
                    // InternalEldmDslParser.g:1776:4: (lv_path_8_0= rulePath )
                    {
                    // InternalEldmDslParser.g:1776:4: (lv_path_8_0= rulePath )
                    // InternalEldmDslParser.g:1777:5: lv_path_8_0= rulePath
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralAccess().getPathPathParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_path_8_0=rulePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralRule());
                      					}
                      					set(
                      						current,
                      						"path",
                      						lv_path_8_0,
                      						"net.eldm.EldmDsl.Path");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalEldmDslParser.g:1798:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalEldmDslParser.g:1798:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalEldmDslParser.g:1799:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
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
    // InternalEldmDslParser.g:1805:1: ruleBoolLiteral returns [EObject current=null] : ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:1811:2: ( ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) ) )
            // InternalEldmDslParser.g:1812:2: ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) )
            {
            // InternalEldmDslParser.g:1812:2: ( () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) ) )
            // InternalEldmDslParser.g:1813:3: () (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) )
            {
            // InternalEldmDslParser.g:1813:3: ()
            // InternalEldmDslParser.g:1814:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:1820:3: (otherlv_1= False | ( (lv_isTrue_2_0= True ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==False) ) {
                alt32=1;
            }
            else if ( (LA32_0==True) ) {
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
                    // InternalEldmDslParser.g:1821:4: otherlv_1= False
                    {
                    otherlv_1=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEldmDslParser.g:1826:4: ( (lv_isTrue_2_0= True ) )
                    {
                    // InternalEldmDslParser.g:1826:4: ( (lv_isTrue_2_0= True ) )
                    // InternalEldmDslParser.g:1827:5: (lv_isTrue_2_0= True )
                    {
                    // InternalEldmDslParser.g:1827:5: (lv_isTrue_2_0= True )
                    // InternalEldmDslParser.g:1828:6: lv_isTrue_2_0= True
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
    // InternalEldmDslParser.g:1845:1: entryRuleStrLiteral returns [EObject current=null] : iv_ruleStrLiteral= ruleStrLiteral EOF ;
    public final EObject entryRuleStrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrLiteral = null;


        try {
            // InternalEldmDslParser.g:1845:51: (iv_ruleStrLiteral= ruleStrLiteral EOF )
            // InternalEldmDslParser.g:1846:2: iv_ruleStrLiteral= ruleStrLiteral EOF
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
    // InternalEldmDslParser.g:1852:1: ruleStrLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT ) ) ;
    public final EObject ruleStrLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:1858:2: ( ( (lv_value_0_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:1859:2: ( (lv_value_0_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:1859:2: ( (lv_value_0_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:1860:3: (lv_value_0_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:1860:3: (lv_value_0_0= RULE_TEXT )
            // InternalEldmDslParser.g:1861:4: lv_value_0_0= RULE_TEXT
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
    // InternalEldmDslParser.g:1880:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalEldmDslParser.g:1880:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalEldmDslParser.g:1881:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalEldmDslParser.g:1887:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:1893:2: ( ( (lv_value_0_0= RULE_NATURAL ) ) )
            // InternalEldmDslParser.g:1894:2: ( (lv_value_0_0= RULE_NATURAL ) )
            {
            // InternalEldmDslParser.g:1894:2: ( (lv_value_0_0= RULE_NATURAL ) )
            // InternalEldmDslParser.g:1895:3: (lv_value_0_0= RULE_NATURAL )
            {
            // InternalEldmDslParser.g:1895:3: (lv_value_0_0= RULE_NATURAL )
            // InternalEldmDslParser.g:1896:4: lv_value_0_0= RULE_NATURAL
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
    // InternalEldmDslParser.g:1915:1: entryRuleFltLiteral returns [EObject current=null] : iv_ruleFltLiteral= ruleFltLiteral EOF ;
    public final EObject entryRuleFltLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFltLiteral = null;


        try {
            // InternalEldmDslParser.g:1915:51: (iv_ruleFltLiteral= ruleFltLiteral EOF )
            // InternalEldmDslParser.g:1916:2: iv_ruleFltLiteral= ruleFltLiteral EOF
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
    // InternalEldmDslParser.g:1922:1: ruleFltLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFltLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:1928:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalEldmDslParser.g:1929:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalEldmDslParser.g:1929:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalEldmDslParser.g:1930:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalEldmDslParser.g:1930:3: (lv_value_0_0= RULE_FLOAT )
            // InternalEldmDslParser.g:1931:4: lv_value_0_0= RULE_FLOAT
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


    // $ANTLR start "entryRuleListLiteral"
    // InternalEldmDslParser.g:1950:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // InternalEldmDslParser.g:1950:52: (iv_ruleListLiteral= ruleListLiteral EOF )
            // InternalEldmDslParser.g:1951:2: iv_ruleListLiteral= ruleListLiteral EOF
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
    // InternalEldmDslParser.g:1957:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vals_2_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:1963:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEldmDslParser.g:1964:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEldmDslParser.g:1964:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEldmDslParser.g:1965:3: () otherlv_1= LeftSquareBracket ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEldmDslParser.g:1965:3: ()
            // InternalEldmDslParser.g:1966:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEldmDslParser.g:1976:3: ( ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==False||LA34_0==Bool||(LA34_0>=Path && LA34_0<=Any)||LA34_0==Flt||(LA34_0>=Int && LA34_0<=Ldt)||LA34_0==Ltm||LA34_0==Str||LA34_0==LeftSquareBracket||LA34_0==LeftCurlyBracket||(LA34_0>=RULE_PID && LA34_0<=RULE_ID)||(LA34_0>=RULE_NATURAL && LA34_0<=RULE_TEXT)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEldmDslParser.g:1977:4: ( (lv_vals_2_0= ruleLiteral ) ) (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    {
                    // InternalEldmDslParser.g:1977:4: ( (lv_vals_2_0= ruleLiteral ) )
                    // InternalEldmDslParser.g:1978:5: (lv_vals_2_0= ruleLiteral )
                    {
                    // InternalEldmDslParser.g:1978:5: (lv_vals_2_0= ruleLiteral )
                    // InternalEldmDslParser.g:1979:6: lv_vals_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
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

                    // InternalEldmDslParser.g:1996:4: (otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalEldmDslParser.g:1997:5: otherlv_3= Comma ( (lv_vals_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEldmDslParser.g:2001:5: ( (lv_vals_4_0= ruleLiteral ) )
                    	    // InternalEldmDslParser.g:2002:6: (lv_vals_4_0= ruleLiteral )
                    	    {
                    	    // InternalEldmDslParser.g:2002:6: (lv_vals_4_0= ruleLiteral )
                    	    // InternalEldmDslParser.g:2003:7: lv_vals_4_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLiteralAccess().getValsLiteralParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop33;
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
    // InternalEldmDslParser.g:2030:1: entryRuleMapLiteral returns [EObject current=null] : iv_ruleMapLiteral= ruleMapLiteral EOF ;
    public final EObject entryRuleMapLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteral = null;


        try {
            // InternalEldmDslParser.g:2030:51: (iv_ruleMapLiteral= ruleMapLiteral EOF )
            // InternalEldmDslParser.g:2031:2: iv_ruleMapLiteral= ruleMapLiteral EOF
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
    // InternalEldmDslParser.g:2037:1: ruleMapLiteral returns [EObject current=null] : ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) ;
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
            // InternalEldmDslParser.g:2043:2: ( ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) ) )
            // InternalEldmDslParser.g:2044:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            {
            // InternalEldmDslParser.g:2044:2: ( ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) ) | ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LeftCurlyBracket) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_BEGIN) ) {
                    alt39=2;
                }
                else if ( (LA39_1==RULE_ID) && (synpred3_InternalEldmDslParser())) {
                    alt39=1;
                }
                else if ( (LA39_1==RightCurlyBracket) && (synpred3_InternalEldmDslParser())) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalEldmDslParser.g:2045:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    {
                    // InternalEldmDslParser.g:2045:3: ( ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket ) )
                    // InternalEldmDslParser.g:2046:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )=> ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2068:4: ( () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket )
                    // InternalEldmDslParser.g:2069:5: () otherlv_1= LeftCurlyBracket ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )? otherlv_5= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2069:5: ()
                    // InternalEldmDslParser.g:2070:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getMapLiteralAccess().getMapLiteralAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMapLiteralAccess().getLeftCurlyBracketKeyword_0_0_1());
                      				
                    }
                    // InternalEldmDslParser.g:2080:5: ( ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalEldmDslParser.g:2081:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) ) (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:2081:6: ( (lv_entries_2_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:2082:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:2082:7: (lv_entries_2_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:2083:8: lv_entries_2_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_31);
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

                            // InternalEldmDslParser.g:2100:6: (otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==Comma) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2101:7: otherlv_3= Comma ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    {
                            	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getMapLiteralAccess().getCommaKeyword_0_0_2_1_0());
                            	      						
                            	    }
                            	    // InternalEldmDslParser.g:2105:7: ( (lv_entries_4_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:2106:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:2106:8: (lv_entries_4_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:2107:9: lv_entries_4_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_0_0_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_31);
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
                            	    break loop35;
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
                    // InternalEldmDslParser.g:2133:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    {
                    // InternalEldmDslParser.g:2133:3: ( () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket )
                    // InternalEldmDslParser.g:2134:4: () otherlv_7= LeftCurlyBracket this_BEGIN_8= RULE_BEGIN ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )? this_END_12= RULE_END otherlv_13= RightCurlyBracket
                    {
                    // InternalEldmDslParser.g:2134:4: ()
                    // InternalEldmDslParser.g:2135:5: 
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
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getMapLiteralAccess().getBEGINTerminalRuleCall_1_2());
                      			
                    }
                    // InternalEldmDslParser.g:2149:4: ( ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalEldmDslParser.g:2150:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) ) ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            {
                            // InternalEldmDslParser.g:2150:5: ( (lv_entries_9_0= ruleMapEntryLiteral ) )
                            // InternalEldmDslParser.g:2151:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            {
                            // InternalEldmDslParser.g:2151:6: (lv_entries_9_0= ruleMapEntryLiteral )
                            // InternalEldmDslParser.g:2152:7: lv_entries_9_0= ruleMapEntryLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
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

                            // InternalEldmDslParser.g:2169:5: ( ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==EOF||(LA37_0>=LineFeed && LA37_0<=CarriageReturn)||LA37_0==RULE_ID) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalEldmDslParser.g:2170:6: ruleBREAK ( (lv_entries_11_0= ruleMapEntryLiteral ) )
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
                            	    // InternalEldmDslParser.g:2177:6: ( (lv_entries_11_0= ruleMapEntryLiteral ) )
                            	    // InternalEldmDslParser.g:2178:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    {
                            	    // InternalEldmDslParser.g:2178:7: (lv_entries_11_0= ruleMapEntryLiteral )
                            	    // InternalEldmDslParser.g:2179:8: lv_entries_11_0= ruleMapEntryLiteral
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMapLiteralAccess().getEntriesMapEntryLiteralParserRuleCall_1_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_32);
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
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_33); if (state.failed) return current;
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
    // InternalEldmDslParser.g:2211:1: entryRuleMapEntryLiteral returns [EObject current=null] : iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF ;
    public final EObject entryRuleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapEntryLiteral = null;


        try {
            // InternalEldmDslParser.g:2211:56: (iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF )
            // InternalEldmDslParser.g:2212:2: iv_ruleMapEntryLiteral= ruleMapEntryLiteral EOF
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
    // InternalEldmDslParser.g:2218:1: ruleMapEntryLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleMapEntryLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2224:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) ) )
            // InternalEldmDslParser.g:2225:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // InternalEldmDslParser.g:2225:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) ) )
            // InternalEldmDslParser.g:2226:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleLiteral ) )
            {
            // InternalEldmDslParser.g:2226:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEldmDslParser.g:2227:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEldmDslParser.g:2227:4: (lv_name_0_0= RULE_ID )
            // InternalEldmDslParser.g:2228:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapEntryLiteralAccess().getColonKeyword_1());
              		
            }
            // InternalEldmDslParser.g:2248:3: ( (lv_value_2_0= ruleLiteral ) )
            // InternalEldmDslParser.g:2249:4: (lv_value_2_0= ruleLiteral )
            {
            // InternalEldmDslParser.g:2249:4: (lv_value_2_0= ruleLiteral )
            // InternalEldmDslParser.g:2250:5: lv_value_2_0= ruleLiteral
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
    // InternalEldmDslParser.g:2271:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalEldmDslParser.g:2271:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalEldmDslParser.g:2272:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalEldmDslParser.g:2278:1: ruleEnumLiteral returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2284:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEldmDslParser.g:2285:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEldmDslParser.g:2285:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalEldmDslParser.g:2286:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalEldmDslParser.g:2286:3: ()
            // InternalEldmDslParser.g:2287:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:2293:3: ( (otherlv_1= RULE_ID ) )
            // InternalEldmDslParser.g:2294:4: (otherlv_1= RULE_ID )
            {
            // InternalEldmDslParser.g:2294:4: (otherlv_1= RULE_ID )
            // InternalEldmDslParser.g:2295:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumLiteralRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getRefEnumItemDefCrossReference_1_0());
              				
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
    // InternalEldmDslParser.g:2310:1: entryRulePatternLiteral returns [EObject current=null] : iv_rulePatternLiteral= rulePatternLiteral EOF ;
    public final EObject entryRulePatternLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternLiteral = null;


        try {
            // InternalEldmDslParser.g:2310:55: (iv_rulePatternLiteral= rulePatternLiteral EOF )
            // InternalEldmDslParser.g:2311:2: iv_rulePatternLiteral= rulePatternLiteral EOF
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
    // InternalEldmDslParser.g:2317:1: rulePatternLiteral returns [EObject current=null] : ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) ;
    public final EObject rulePatternLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        AntlrDatatypeRuleToken lv_native_1_0 = null;



        	enterRule();

        try {
            // InternalEldmDslParser.g:2323:2: ( ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) ) )
            // InternalEldmDslParser.g:2324:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            {
            // InternalEldmDslParser.g:2324:2: ( () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) ) )
            // InternalEldmDslParser.g:2325:3: () ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= CommercialAt ( (lv_text_4_0= RULE_TEXT ) )
            {
            // InternalEldmDslParser.g:2325:3: ()
            // InternalEldmDslParser.g:2326:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPatternLiteralAccess().getPatternLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalEldmDslParser.g:2332:3: ( ( (lv_native_1_0= ruleNativeDef ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Bool||LA40_0==Path||LA40_0==Any||LA40_0==Flt||(LA40_0>=Int && LA40_0<=Ldt)||LA40_0==Ltm||LA40_0==Str) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
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
                    // InternalEldmDslParser.g:2333:4: ( (lv_native_1_0= ruleNativeDef ) )
                    {
                    // InternalEldmDslParser.g:2333:4: ( (lv_native_1_0= ruleNativeDef ) )
                    // InternalEldmDslParser.g:2334:5: (lv_native_1_0= ruleNativeDef )
                    {
                    // InternalEldmDslParser.g:2334:5: (lv_native_1_0= ruleNativeDef )
                    // InternalEldmDslParser.g:2335:6: lv_native_1_0= ruleNativeDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternLiteralAccess().getNativeNativeDefParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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
                    // InternalEldmDslParser.g:2353:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEldmDslParser.g:2353:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEldmDslParser.g:2354:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEldmDslParser.g:2354:5: (otherlv_2= RULE_ID )
                    // InternalEldmDslParser.g:2355:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternLiteralRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPatternLiteralAccess().getRefDefinitionCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,CommercialAt,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternLiteralAccess().getCommercialAtKeyword_2());
              		
            }
            // InternalEldmDslParser.g:2371:3: ( (lv_text_4_0= RULE_TEXT ) )
            // InternalEldmDslParser.g:2372:4: (lv_text_4_0= RULE_TEXT )
            {
            // InternalEldmDslParser.g:2372:4: (lv_text_4_0= RULE_TEXT )
            // InternalEldmDslParser.g:2373:5: lv_text_4_0= RULE_TEXT
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


    // $ANTLR start "entryRulePath"
    // InternalEldmDslParser.g:2393:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // InternalEldmDslParser.g:2393:44: (iv_rulePath= rulePath EOF )
            // InternalEldmDslParser.g:2394:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalEldmDslParser.g:2400:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PID_0= RULE_PID ( ( RULE_PID )=>this_PID_1= RULE_PID )* ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PID_0=null;
        Token this_PID_1=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2406:2: ( (this_PID_0= RULE_PID ( ( RULE_PID )=>this_PID_1= RULE_PID )* ) )
            // InternalEldmDslParser.g:2407:2: (this_PID_0= RULE_PID ( ( RULE_PID )=>this_PID_1= RULE_PID )* )
            {
            // InternalEldmDslParser.g:2407:2: (this_PID_0= RULE_PID ( ( RULE_PID )=>this_PID_1= RULE_PID )* )
            // InternalEldmDslParser.g:2408:3: this_PID_0= RULE_PID ( ( RULE_PID )=>this_PID_1= RULE_PID )*
            {
            this_PID_0=(Token)match(input,RULE_PID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PID_0, grammarAccess.getPathAccess().getPIDTerminalRuleCall_0());
              		
            }
            // InternalEldmDslParser.g:2415:3: ( ( RULE_PID )=>this_PID_1= RULE_PID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_PID) ) {
                    int LA41_1 = input.LA(2);

                    if ( (synpred4_InternalEldmDslParser()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalEldmDslParser.g:2416:4: ( RULE_PID )=>this_PID_1= RULE_PID
            	    {
            	    this_PID_1=(Token)match(input,RULE_PID,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_PID_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_PID_1, grammarAccess.getPathAccess().getPIDTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleBREAK"
    // InternalEldmDslParser.g:2429:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalEldmDslParser.g:2429:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalEldmDslParser.g:2430:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalEldmDslParser.g:2436:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LineFeed | kw= CarriageReturn )* ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEldmDslParser.g:2442:2: ( (kw= LineFeed | kw= CarriageReturn )* )
            // InternalEldmDslParser.g:2443:2: (kw= LineFeed | kw= CarriageReturn )*
            {
            // InternalEldmDslParser.g:2443:2: (kw= LineFeed | kw= CarriageReturn )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LineFeed) ) {
                    alt42=1;
                }
                else if ( (LA42_0==CarriageReturn) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalEldmDslParser.g:2444:3: kw= LineFeed
            	    {
            	    kw=(Token)match(input,LineFeed,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getLineFeedKeyword_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEldmDslParser.g:2450:3: kw= CarriageReturn
            	    {
            	    kw=(Token)match(input,CarriageReturn,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getBREAKAccess().getCarriageReturnKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
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
        // InternalEldmDslParser.g:514:4: ( ( RULE_ID ) )
        // InternalEldmDslParser.g:514:5: ( RULE_ID )
        {
        // InternalEldmDslParser.g:514:5: ( RULE_ID )
        // InternalEldmDslParser.g:515:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEldmDslParser

    // $ANTLR start synpred2_InternalEldmDslParser
    public final void synpred2_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:1298:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:1298:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:1298:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket )
        // InternalEldmDslParser.g:1299:5: () LeftCurlyBracket ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:1299:5: ()
        // InternalEldmDslParser.g:1300:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_30); if (state.failed) return ;
        // InternalEldmDslParser.g:1302:5: ( ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )* )?
        int alt44=2;
        int LA44_0 = input.LA(1);

        if ( (LA44_0==RULE_ID) ) {
            alt44=1;
        }
        switch (alt44) {
            case 1 :
                // InternalEldmDslParser.g:1303:6: ( ( ruleMapEntryDef ) ) ( Comma ( ( ruleMapEntryDef ) ) )*
                {
                // InternalEldmDslParser.g:1303:6: ( ( ruleMapEntryDef ) )
                // InternalEldmDslParser.g:1304:7: ( ruleMapEntryDef )
                {
                // InternalEldmDslParser.g:1304:7: ( ruleMapEntryDef )
                // InternalEldmDslParser.g:1305:8: ruleMapEntryDef
                {
                pushFollow(FOLLOW_31);
                ruleMapEntryDef();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:1308:6: ( Comma ( ( ruleMapEntryDef ) ) )*
                loop43:
                do {
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==Comma) ) {
                        alt43=1;
                    }


                    switch (alt43) {
                	case 1 :
                	    // InternalEldmDslParser.g:1309:7: Comma ( ( ruleMapEntryDef ) )
                	    {
                	    match(input,Comma,FOLLOW_10); if (state.failed) return ;
                	    // InternalEldmDslParser.g:1310:7: ( ( ruleMapEntryDef ) )
                	    // InternalEldmDslParser.g:1311:8: ( ruleMapEntryDef )
                	    {
                	    // InternalEldmDslParser.g:1311:8: ( ruleMapEntryDef )
                	    // InternalEldmDslParser.g:1312:9: ruleMapEntryDef
                	    {
                	    pushFollow(FOLLOW_31);
                	    ruleMapEntryDef();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop43;
                    }
                } while (true);


                }
                break;

        }

        match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEldmDslParser

    // $ANTLR start synpred3_InternalEldmDslParser
    public final void synpred3_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:2046:4: ( ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket ) )
        // InternalEldmDslParser.g:2046:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        {
        // InternalEldmDslParser.g:2046:5: ( () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket )
        // InternalEldmDslParser.g:2047:5: () LeftCurlyBracket ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )? RightCurlyBracket
        {
        // InternalEldmDslParser.g:2047:5: ()
        // InternalEldmDslParser.g:2048:5: 
        {
        }

        match(input,LeftCurlyBracket,FOLLOW_30); if (state.failed) return ;
        // InternalEldmDslParser.g:2050:5: ( ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )* )?
        int alt46=2;
        int LA46_0 = input.LA(1);

        if ( (LA46_0==RULE_ID) ) {
            alt46=1;
        }
        switch (alt46) {
            case 1 :
                // InternalEldmDslParser.g:2051:6: ( ( ruleMapEntryLiteral ) ) ( Comma ( ( ruleMapEntryLiteral ) ) )*
                {
                // InternalEldmDslParser.g:2051:6: ( ( ruleMapEntryLiteral ) )
                // InternalEldmDslParser.g:2052:7: ( ruleMapEntryLiteral )
                {
                // InternalEldmDslParser.g:2052:7: ( ruleMapEntryLiteral )
                // InternalEldmDslParser.g:2053:8: ruleMapEntryLiteral
                {
                pushFollow(FOLLOW_31);
                ruleMapEntryLiteral();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalEldmDslParser.g:2056:6: ( Comma ( ( ruleMapEntryLiteral ) ) )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==Comma) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // InternalEldmDslParser.g:2057:7: Comma ( ( ruleMapEntryLiteral ) )
                	    {
                	    match(input,Comma,FOLLOW_10); if (state.failed) return ;
                	    // InternalEldmDslParser.g:2058:7: ( ( ruleMapEntryLiteral ) )
                	    // InternalEldmDslParser.g:2059:8: ( ruleMapEntryLiteral )
                	    {
                	    // InternalEldmDslParser.g:2059:8: ( ruleMapEntryLiteral )
                	    // InternalEldmDslParser.g:2060:9: ruleMapEntryLiteral
                	    {
                	    pushFollow(FOLLOW_31);
                	    ruleMapEntryLiteral();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                }
                break;

        }

        match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalEldmDslParser

    // $ANTLR start synpred4_InternalEldmDslParser
    public final void synpred4_InternalEldmDslParser_fragment() throws RecognitionException {   
        // InternalEldmDslParser.g:2416:4: ( RULE_PID )
        // InternalEldmDslParser.g:2416:5: RULE_PID
        {
        match(input,RULE_PID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalEldmDslParser

    // Delegated rules

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


    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\7\uffff\1\12\3\uffff";
    static final String dfa_3s = "\1\15\6\uffff\1\45\3\uffff";
    static final String dfa_4s = "\1\70\6\uffff\1\64\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\7";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\10\3\uffff\1\10\1\1\1\10\1\uffff\1\10\1\uffff\3\10\1\uffff\1\10\2\uffff\1\10\14\uffff\1\5\1\uffff\1\6\3\uffff\1\11\1\7\1\uffff\1\3\1\4\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\12\1\uffff\1\12\3\uffff\1\10\1\uffff\1\12\1\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
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

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1702:2: (this_BoolLiteral_0= ruleBoolLiteral | this_StrLiteral_1= ruleStrLiteral | this_IntLiteral_2= ruleIntLiteral | this_FltLiteral_3= ruleFltLiteral | this_ListLiteral_4= ruleListLiteral | this_MapLiteral_5= ruleMapLiteral | this_EnumLiteral_6= ruleEnumLiteral | this_PatternLiteral_7= rulePatternLiteral | ( (lv_path_8_0= rulePath ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0018000000400052L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400052L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0018000000010100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x001C000000010100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x001000012EA88000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0018820400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010820400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x001080092EA88000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000080092EACC400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0014006000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x01D8A0012EB8A000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x01D8E0012EB8A000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000006000000002L});

}