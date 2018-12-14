package net.eldm.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEldmDslLexer extends Lexer {
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

    public InternalEldmDslLexer() {;} 
    public InternalEldmDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEldmDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEldmDslLexer.g"; }

    // $ANTLR start "Definitions"
    public final void mDefinitions() throws RecognitionException {
        try {
            int _type = Definitions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:14:13: ( 'definitions:' )
            // InternalEldmDslLexer.g:14:15: 'definitions:'
            {
            match("definitions:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Definitions"

    // $ANTLR start "PlugDsl"
    public final void mPlugDsl() throws RecognitionException {
        try {
            int _type = PlugDsl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:16:9: ( 'plug-dsl' )
            // InternalEldmDslLexer.g:16:11: 'plug-dsl'
            {
            match("plug-dsl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlugDsl"

    // $ANTLR start "Service"
    public final void mService() throws RecognitionException {
        try {
            int _type = Service;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:18:9: ( 'service' )
            // InternalEldmDslLexer.g:18:11: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Service"

    // $ANTLR start "Typedef"
    public final void mTypedef() throws RecognitionException {
        try {
            int _type = Typedef;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:20:9: ( 'typedef' )
            // InternalEldmDslLexer.g:20:11: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Typedef"

    // $ANTLR start "Module"
    public final void mModule() throws RecognitionException {
        try {
            int _type = Module;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:22:8: ( 'module' )
            // InternalEldmDslLexer.g:22:10: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Module"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:24:7: ( 'false' )
            // InternalEldmDslLexer.g:24:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Match"
    public final void mMatch() throws RecognitionException {
        try {
            int _type = Match;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:26:7: ( 'match' )
            // InternalEldmDslLexer.g:26:9: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Match"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:28:6: ( 'bool' )
            // InternalEldmDslLexer.g:28:8: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Enum"
    public final void mEnum() throws RecognitionException {
        try {
            int _type = Enum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:30:6: ( 'enum' )
            // InternalEldmDslLexer.g:30:8: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enum"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:32:6: ( 'from' )
            // InternalEldmDslLexer.g:32:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Mask"
    public final void mMask() throws RecognitionException {
        try {
            int _type = Mask;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:34:6: ( 'mask' )
            // InternalEldmDslLexer.g:34:8: 'mask'
            {
            match("mask"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mask"

    // $ANTLR start "Path"
    public final void mPath() throws RecognitionException {
        try {
            int _type = Path;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:36:6: ( 'path' )
            // InternalEldmDslLexer.g:36:8: 'path'
            {
            match("path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Path"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:38:6: ( 'true' )
            // InternalEldmDslLexer.g:38:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:40:5: ( 'and' )
            // InternalEldmDslLexer.g:40:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Any"
    public final void mAny() throws RecognitionException {
        try {
            int _type = Any;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:42:5: ( 'any' )
            // InternalEldmDslLexer.g:42:7: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Any"

    // $ANTLR start "Def"
    public final void mDef() throws RecognitionException {
        try {
            int _type = Def;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:44:5: ( 'def' )
            // InternalEldmDslLexer.g:44:7: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Def"

    // $ANTLR start "Flt"
    public final void mFlt() throws RecognitionException {
        try {
            int _type = Flt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:46:5: ( 'flt' )
            // InternalEldmDslLexer.g:46:7: 'flt'
            {
            match("flt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Flt"

    // $ANTLR start "Get"
    public final void mGet() throws RecognitionException {
        try {
            int _type = Get;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:48:5: ( 'get' )
            // InternalEldmDslLexer.g:48:7: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Get"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:50:5: ( 'int' )
            // InternalEldmDslLexer.g:50:7: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Lda"
    public final void mLda() throws RecognitionException {
        try {
            int _type = Lda;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:52:5: ( 'lda' )
            // InternalEldmDslLexer.g:52:7: 'lda'
            {
            match("lda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Lda"

    // $ANTLR start "Ldt"
    public final void mLdt() throws RecognitionException {
        try {
            int _type = Ldt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:54:5: ( 'ldt' )
            // InternalEldmDslLexer.g:54:7: 'ldt'
            {
            match("ldt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ldt"

    // $ANTLR start "Let"
    public final void mLet() throws RecognitionException {
        try {
            int _type = Let;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:56:5: ( 'let' )
            // InternalEldmDslLexer.g:56:7: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Let"

    // $ANTLR start "Lst"
    public final void mLst() throws RecognitionException {
        try {
            int _type = Lst;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:58:5: ( 'lst' )
            // InternalEldmDslLexer.g:58:7: 'lst'
            {
            match("lst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Lst"

    // $ANTLR start "Ltm"
    public final void mLtm() throws RecognitionException {
        try {
            int _type = Ltm;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:60:5: ( 'ltm' )
            // InternalEldmDslLexer.g:60:7: 'ltm'
            {
            match("ltm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ltm"

    // $ANTLR start "Map"
    public final void mMap() throws RecognitionException {
        try {
            int _type = Map;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:62:5: ( 'map' )
            // InternalEldmDslLexer.g:62:7: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Map"

    // $ANTLR start "Set"
    public final void mSet() throws RecognitionException {
        try {
            int _type = Set;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:64:5: ( 'set' )
            // InternalEldmDslLexer.g:64:7: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Set"

    // $ANTLR start "Str"
    public final void mStr() throws RecognitionException {
        try {
            int _type = Str;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:66:5: ( 'str' )
            // InternalEldmDslLexer.g:66:7: 'str'
            {
            match("str"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Str"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:68:5: ( 'var' )
            // InternalEldmDslLexer.g:68:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:70:27: ( '!=' )
            // InternalEldmDslLexer.g:70:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AsteriskAsterisk"
    public final void mAsteriskAsterisk() throws RecognitionException {
        try {
            int _type = AsteriskAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:72:18: ( '**' )
            // InternalEldmDslLexer.g:72:20: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskAsterisk"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:74:28: ( '->' )
            // InternalEldmDslLexer.g:74:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:76:18: ( '..' )
            // InternalEldmDslLexer.g:76:20: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:78:24: ( '<=' )
            // InternalEldmDslLexer.g:78:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:80:22: ( '==' )
            // InternalEldmDslLexer.g:80:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:82:27: ( '>=' )
            // InternalEldmDslLexer.g:82:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "QuestionMarkFullStop"
    public final void mQuestionMarkFullStop() throws RecognitionException {
        try {
            int _type = QuestionMarkFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:84:22: ( '?.' )
            // InternalEldmDslLexer.g:84:24: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMarkFullStop"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:86:4: ( 'as' )
            // InternalEldmDslLexer.g:86:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "As"

    // $ANTLR start "Is"
    public final void mIs() throws RecognitionException {
        try {
            int _type = Is;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:88:4: ( 'is' )
            // InternalEldmDslLexer.g:88:6: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Is"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:90:4: ( 'or' )
            // InternalEldmDslLexer.g:90:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "LineFeed"
    public final void mLineFeed() throws RecognitionException {
        try {
            int _type = LineFeed;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:92:10: ( '\\n' )
            // InternalEldmDslLexer.g:92:12: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LineFeed"

    // $ANTLR start "CarriageReturn"
    public final void mCarriageReturn() throws RecognitionException {
        try {
            int _type = CarriageReturn;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:94:16: ( '\\r' )
            // InternalEldmDslLexer.g:94:18: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CarriageReturn"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:96:17: ( '!' )
            // InternalEldmDslLexer.g:96:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:98:13: ( '%' )
            // InternalEldmDslLexer.g:98:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:100:17: ( '(' )
            // InternalEldmDslLexer.g:100:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:102:18: ( ')' )
            // InternalEldmDslLexer.g:102:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:104:10: ( '*' )
            // InternalEldmDslLexer.g:104:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:106:10: ( '+' )
            // InternalEldmDslLexer.g:106:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:108:7: ( ',' )
            // InternalEldmDslLexer.g:108:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:110:13: ( '-' )
            // InternalEldmDslLexer.g:110:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:112:10: ( '.' )
            // InternalEldmDslLexer.g:112:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:114:9: ( '/' )
            // InternalEldmDslLexer.g:114:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:116:7: ( ':' )
            // InternalEldmDslLexer.g:116:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:118:14: ( '<' )
            // InternalEldmDslLexer.g:118:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:120:12: ( '=' )
            // InternalEldmDslLexer.g:120:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:122:17: ( '>' )
            // InternalEldmDslLexer.g:122:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:124:14: ( '?' )
            // InternalEldmDslLexer.g:124:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:126:14: ( '@' )
            // InternalEldmDslLexer.g:126:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:128:19: ( '[' )
            // InternalEldmDslLexer.g:128:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:130:20: ( ']' )
            // InternalEldmDslLexer.g:130:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:132:18: ( '{' )
            // InternalEldmDslLexer.g:132:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:134:19: ( '}' )
            // InternalEldmDslLexer.g:134:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalEldmDslLexer.g:136:21: ()
            // InternalEldmDslLexer.g:136:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalEldmDslLexer.g:138:19: ()
            // InternalEldmDslLexer.g:138:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_PATH"
    public final void mRULE_PATH() throws RecognitionException {
        try {
            int _type = RULE_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:140:11: ( ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )* )
            // InternalEldmDslLexer.g:140:13: ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )*
            {
            // InternalEldmDslLexer.g:140:13: ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEldmDslLexer.g:140:14: '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+
            	    {
            	    match('/'); 
            	    // InternalEldmDslLexer.g:140:18: ( 'a' .. 'z' | '-' | '0' .. '9' )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='a' && LA1_0<='z')) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalEldmDslLexer.g:
            	    	    {
            	    	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATH"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:142:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )* )
            // InternalEldmDslLexer.g:142:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )*
            {
            // InternalEldmDslLexer.g:142:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEldmDslLexer.g:142:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEldmDslLexer.g:142:40: ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEldmDslLexer.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalEldmDslLexer.g:144:19: ( ( '0' .. '9' )+ )
            // InternalEldmDslLexer.g:144:21: ( '0' .. '9' )+
            {
            // InternalEldmDslLexer.g:144:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEldmDslLexer.g:144:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_NATURAL"
    public final void mRULE_NATURAL() throws RecognitionException {
        try {
            int _type = RULE_NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:146:14: ( ( '-' )? RULE_INT )
            // InternalEldmDslLexer.g:146:16: ( '-' )? RULE_INT
            {
            // InternalEldmDslLexer.g:146:16: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEldmDslLexer.g:146:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NATURAL"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:148:12: ( RULE_NATURAL ( '.' RULE_INT )? )
            // InternalEldmDslLexer.g:148:14: RULE_NATURAL ( '.' RULE_INT )?
            {
            mRULE_NATURAL(); 
            // InternalEldmDslLexer.g:148:27: ( '.' RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEldmDslLexer.g:148:28: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:150:11: ( RULE_INT '-' ( '0' '1' .. '9' | '1' '0' .. '2' ) '-' ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' ) )
            // InternalEldmDslLexer.g:150:13: RULE_INT '-' ( '0' '1' .. '9' | '1' '0' .. '2' ) '-' ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' )
            {
            mRULE_INT(); 
            match('-'); 
            // InternalEldmDslLexer.g:150:26: ( '0' '1' .. '9' | '1' '0' .. '2' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                alt8=1;
            }
            else if ( (LA8_0=='1') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEldmDslLexer.g:150:27: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:150:40: '1' '0' .. '2'
                    {
                    match('1'); 
                    matchRange('0','2'); 

                    }
                    break;

            }

            match('-'); 
            // InternalEldmDslLexer.g:150:58: ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt9=1;
                }
                break;
            case '1':
            case '2':
                {
                alt9=2;
                }
                break;
            case '3':
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEldmDslLexer.g:150:59: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:150:72: '1' .. '2' '0' .. '9'
                    {
                    matchRange('1','2'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalEldmDslLexer.g:150:90: '3' '0' .. '1'
                    {
                    match('3'); 
                    matchRange('0','1'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_TIME"
    public final void mRULE_TIME() throws RecognitionException {
        try {
            int _type = RULE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:152:11: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9' )
            // InternalEldmDslLexer.g:152:13: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9'
            {
            // InternalEldmDslLexer.g:152:13: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='1')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='2') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEldmDslLexer.g:152:14: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:152:32: '2' '0' .. '3'
                    {
                    match('2'); 
                    matchRange('0','3'); 

                    }
                    break;

            }

            match(':'); 
            matchRange('0','5'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','5'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME"

    // $ANTLR start "RULE_DATETIME"
    public final void mRULE_DATETIME() throws RecognitionException {
        try {
            int _type = RULE_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:154:15: ( RULE_DATE 'T' RULE_TIME )
            // InternalEldmDslLexer.g:154:17: RULE_DATE 'T' RULE_TIME
            {
            mRULE_DATE(); 
            match('T'); 
            mRULE_TIME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATETIME"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:156:11: ( ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalEldmDslLexer.g:156:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalEldmDslLexer.g:156:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\'') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\"') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEldmDslLexer.g:156:14: '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEldmDslLexer.g:156:19: (~ ( ( '\\'' | '\\r' | '\\n' ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEldmDslLexer.g:156:19: ~ ( ( '\\'' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:156:45: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalEldmDslLexer.g:156:51: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\"') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='\"') ) {
                                int LA12_3 = input.LA(3);

                                if ( (LA12_3=='\"') ) {
                                    alt12=2;
                                }
                                else if ( ((LA12_3>='\u0000' && LA12_3<='!')||(LA12_3>='#' && LA12_3<='\uFFFF')) ) {
                                    alt12=1;
                                }


                            }
                            else if ( ((LA12_1>='\u0000' && LA12_1<='!')||(LA12_1>='#' && LA12_1<='\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEldmDslLexer.g:156:79: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:158:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEldmDslLexer.g:158:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEldmDslLexer.g:158:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEldmDslLexer.g:158:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:160:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEldmDslLexer.g:160:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEldmDslLexer.g:160:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEldmDslLexer.g:160:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalEldmDslLexer.g:160:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEldmDslLexer.g:160:41: ( '\\r' )? '\\n'
                    {
                    // InternalEldmDslLexer.g:160:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEldmDslLexer.g:160:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:162:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEldmDslLexer.g:162:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEldmDslLexer.g:162:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEldmDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:164:16: ( . )
            // InternalEldmDslLexer.g:164:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalEldmDslLexer.g:1:8: ( Definitions | PlugDsl | Service | Typedef | Module | False | Match | Bool | Enum | From | Mask | Path | True | And | Any | Def | Flt | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Set | Str | Var | ExclamationMarkEqualsSign | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | As | Is | Or | LineFeed | CarriageReturn | ExclamationMark | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_PATH | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_DATE | RULE_TIME | RULE_DATETIME | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=73;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalEldmDslLexer.g:1:10: Definitions
                {
                mDefinitions(); 

                }
                break;
            case 2 :
                // InternalEldmDslLexer.g:1:22: PlugDsl
                {
                mPlugDsl(); 

                }
                break;
            case 3 :
                // InternalEldmDslLexer.g:1:30: Service
                {
                mService(); 

                }
                break;
            case 4 :
                // InternalEldmDslLexer.g:1:38: Typedef
                {
                mTypedef(); 

                }
                break;
            case 5 :
                // InternalEldmDslLexer.g:1:46: Module
                {
                mModule(); 

                }
                break;
            case 6 :
                // InternalEldmDslLexer.g:1:53: False
                {
                mFalse(); 

                }
                break;
            case 7 :
                // InternalEldmDslLexer.g:1:59: Match
                {
                mMatch(); 

                }
                break;
            case 8 :
                // InternalEldmDslLexer.g:1:65: Bool
                {
                mBool(); 

                }
                break;
            case 9 :
                // InternalEldmDslLexer.g:1:70: Enum
                {
                mEnum(); 

                }
                break;
            case 10 :
                // InternalEldmDslLexer.g:1:75: From
                {
                mFrom(); 

                }
                break;
            case 11 :
                // InternalEldmDslLexer.g:1:80: Mask
                {
                mMask(); 

                }
                break;
            case 12 :
                // InternalEldmDslLexer.g:1:85: Path
                {
                mPath(); 

                }
                break;
            case 13 :
                // InternalEldmDslLexer.g:1:90: True
                {
                mTrue(); 

                }
                break;
            case 14 :
                // InternalEldmDslLexer.g:1:95: And
                {
                mAnd(); 

                }
                break;
            case 15 :
                // InternalEldmDslLexer.g:1:99: Any
                {
                mAny(); 

                }
                break;
            case 16 :
                // InternalEldmDslLexer.g:1:103: Def
                {
                mDef(); 

                }
                break;
            case 17 :
                // InternalEldmDslLexer.g:1:107: Flt
                {
                mFlt(); 

                }
                break;
            case 18 :
                // InternalEldmDslLexer.g:1:111: Get
                {
                mGet(); 

                }
                break;
            case 19 :
                // InternalEldmDslLexer.g:1:115: Int
                {
                mInt(); 

                }
                break;
            case 20 :
                // InternalEldmDslLexer.g:1:119: Lda
                {
                mLda(); 

                }
                break;
            case 21 :
                // InternalEldmDslLexer.g:1:123: Ldt
                {
                mLdt(); 

                }
                break;
            case 22 :
                // InternalEldmDslLexer.g:1:127: Let
                {
                mLet(); 

                }
                break;
            case 23 :
                // InternalEldmDslLexer.g:1:131: Lst
                {
                mLst(); 

                }
                break;
            case 24 :
                // InternalEldmDslLexer.g:1:135: Ltm
                {
                mLtm(); 

                }
                break;
            case 25 :
                // InternalEldmDslLexer.g:1:139: Map
                {
                mMap(); 

                }
                break;
            case 26 :
                // InternalEldmDslLexer.g:1:143: Set
                {
                mSet(); 

                }
                break;
            case 27 :
                // InternalEldmDslLexer.g:1:147: Str
                {
                mStr(); 

                }
                break;
            case 28 :
                // InternalEldmDslLexer.g:1:151: Var
                {
                mVar(); 

                }
                break;
            case 29 :
                // InternalEldmDslLexer.g:1:155: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 30 :
                // InternalEldmDslLexer.g:1:181: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 31 :
                // InternalEldmDslLexer.g:1:198: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 32 :
                // InternalEldmDslLexer.g:1:225: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 33 :
                // InternalEldmDslLexer.g:1:242: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 34 :
                // InternalEldmDslLexer.g:1:265: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 35 :
                // InternalEldmDslLexer.g:1:286: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 36 :
                // InternalEldmDslLexer.g:1:312: QuestionMarkFullStop
                {
                mQuestionMarkFullStop(); 

                }
                break;
            case 37 :
                // InternalEldmDslLexer.g:1:333: As
                {
                mAs(); 

                }
                break;
            case 38 :
                // InternalEldmDslLexer.g:1:336: Is
                {
                mIs(); 

                }
                break;
            case 39 :
                // InternalEldmDslLexer.g:1:339: Or
                {
                mOr(); 

                }
                break;
            case 40 :
                // InternalEldmDslLexer.g:1:342: LineFeed
                {
                mLineFeed(); 

                }
                break;
            case 41 :
                // InternalEldmDslLexer.g:1:351: CarriageReturn
                {
                mCarriageReturn(); 

                }
                break;
            case 42 :
                // InternalEldmDslLexer.g:1:366: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 43 :
                // InternalEldmDslLexer.g:1:382: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 44 :
                // InternalEldmDslLexer.g:1:394: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 45 :
                // InternalEldmDslLexer.g:1:410: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 46 :
                // InternalEldmDslLexer.g:1:427: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 47 :
                // InternalEldmDslLexer.g:1:436: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 48 :
                // InternalEldmDslLexer.g:1:445: Comma
                {
                mComma(); 

                }
                break;
            case 49 :
                // InternalEldmDslLexer.g:1:451: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 50 :
                // InternalEldmDslLexer.g:1:463: FullStop
                {
                mFullStop(); 

                }
                break;
            case 51 :
                // InternalEldmDslLexer.g:1:472: Solidus
                {
                mSolidus(); 

                }
                break;
            case 52 :
                // InternalEldmDslLexer.g:1:480: Colon
                {
                mColon(); 

                }
                break;
            case 53 :
                // InternalEldmDslLexer.g:1:486: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 54 :
                // InternalEldmDslLexer.g:1:499: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 55 :
                // InternalEldmDslLexer.g:1:510: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 56 :
                // InternalEldmDslLexer.g:1:526: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 57 :
                // InternalEldmDslLexer.g:1:539: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 58 :
                // InternalEldmDslLexer.g:1:552: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 59 :
                // InternalEldmDslLexer.g:1:570: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 60 :
                // InternalEldmDslLexer.g:1:589: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 61 :
                // InternalEldmDslLexer.g:1:606: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 62 :
                // InternalEldmDslLexer.g:1:624: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 63 :
                // InternalEldmDslLexer.g:1:634: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 64 :
                // InternalEldmDslLexer.g:1:642: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 65 :
                // InternalEldmDslLexer.g:1:655: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 66 :
                // InternalEldmDslLexer.g:1:666: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 67 :
                // InternalEldmDslLexer.g:1:676: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 68 :
                // InternalEldmDslLexer.g:1:686: RULE_DATETIME
                {
                mRULE_DATETIME(); 

                }
                break;
            case 69 :
                // InternalEldmDslLexer.g:1:700: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 70 :
                // InternalEldmDslLexer.g:1:710: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalEldmDslLexer.g:1:726: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalEldmDslLexer.g:1:742: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalEldmDslLexer.g:1:750: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\45\15\60\1\111\1\113\1\115\1\120\1\122\1\124\1\126\1\130\1\60\1\132\1\134\5\uffff\1\144\7\uffff\1\56\1\uffff\3\154\2\56\2\uffff\1\60\1\uffff\16\60\1\u0085\2\60\1\u0088\5\60\6\uffff\1\154\12\uffff\1\u008f\21\uffff\1\154\3\uffff\2\154\1\uffff\1\u0094\3\60\1\u0098\1\u0099\5\60\1\u009f\2\60\1\u00a2\2\60\1\u00a5\1\u00a6\1\uffff\1\u00a7\1\u00a8\1\uffff\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\4\uffff\1\60\1\uffff\1\60\1\u00b3\1\60\2\uffff\1\60\1\u00b6\2\60\1\u00b9\1\uffff\1\60\1\u00bb\1\uffff\1\u00bc\1\u00bd\14\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\u00c4\1\uffff\1\u00c5\4\uffff\4\60\1\u00cd\5\uffff\2\60\1\u00d3\1\u00d4\1\uffff\3\u00d5\1\60\1\u00d8\4\uffff\1\60\1\uffff\2\60\1\uffff";
    static final String DFA19_eofS =
        "\u00dc\uffff";
    static final String DFA19_minS =
        "\1\0\1\145\1\141\1\145\1\162\2\141\1\157\2\156\1\145\1\156\1\144\1\141\1\75\1\52\1\60\1\56\3\75\1\56\1\162\2\11\5\uffff\1\52\7\uffff\1\101\1\uffff\3\55\1\0\1\42\2\uffff\1\146\1\uffff\1\165\1\164\2\162\1\160\1\165\1\144\1\160\1\154\1\157\1\164\1\157\1\165\1\144\1\55\2\164\1\55\1\141\2\164\1\155\1\162\6\uffff\1\56\12\uffff\1\55\21\uffff\1\55\2\uffff\1\60\2\55\1\uffff\1\55\1\147\1\150\1\166\2\55\2\145\1\165\1\143\1\153\1\55\1\163\1\155\1\55\1\154\1\155\2\55\1\uffff\2\55\1\uffff\6\55\2\uffff\1\61\1\60\1\156\1\uffff\2\55\1\151\2\uffff\1\144\1\55\1\154\1\150\1\55\1\uffff\1\145\1\55\1\uffff\2\55\12\uffff\2\55\1\151\1\144\1\uffff\1\143\1\145\1\uffff\1\145\1\55\1\uffff\1\55\3\uffff\1\60\1\164\1\163\1\145\1\146\1\55\2\uffff\1\61\2\60\1\151\1\154\2\55\1\uffff\3\124\1\157\1\55\4\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\145\1\154\1\164\1\171\1\157\1\162\1\157\1\156\1\163\1\145\1\163\1\164\1\141\1\75\1\52\1\76\1\56\3\75\1\56\1\162\2\40\5\uffff\1\172\7\uffff\1\172\1\uffff\3\71\1\uffff\1\42\2\uffff\1\146\1\uffff\1\165\2\164\1\162\1\160\1\165\1\144\1\164\1\154\1\157\1\164\1\157\1\165\1\171\1\172\2\164\1\172\3\164\1\155\1\162\6\uffff\1\71\12\uffff\1\172\21\uffff\1\72\2\uffff\1\61\1\72\1\71\1\uffff\1\172\1\147\1\150\1\166\2\172\2\145\1\165\1\143\1\153\1\172\1\163\1\155\1\172\1\154\1\155\2\172\1\uffff\2\172\1\uffff\6\172\2\uffff\1\71\1\62\1\156\1\uffff\1\55\1\172\1\151\2\uffff\1\144\1\172\1\154\1\150\1\172\1\uffff\1\145\1\172\1\uffff\2\172\12\uffff\2\55\1\151\1\144\1\uffff\1\143\1\145\1\uffff\1\145\1\172\1\uffff\1\172\3\uffff\1\63\1\164\1\163\1\145\1\146\1\172\2\uffff\2\71\1\61\1\151\1\154\2\172\1\uffff\3\124\1\157\1\172\4\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA19_acceptS =
        "\31\uffff\1\53\1\54\1\55\1\57\1\60\1\uffff\1\64\1\71\1\72\1\73\1\74\1\75\1\76\1\uffff\1\77\5\uffff\1\110\1\111\1\uffff\1\77\27\uffff\1\35\1\52\1\36\1\56\1\37\1\61\1\uffff\1\40\1\62\1\41\1\65\1\42\1\66\1\43\1\67\1\44\1\70\1\uffff\1\50\1\110\1\51\1\53\1\54\1\55\1\57\1\60\1\106\1\107\1\63\1\64\1\71\1\72\1\73\1\74\1\75\1\uffff\1\100\1\101\3\uffff\1\105\23\uffff\1\45\2\uffff\1\46\6\uffff\1\47\1\103\3\uffff\1\20\3\uffff\1\32\1\33\5\uffff\1\31\2\uffff\1\21\2\uffff\1\16\1\17\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\34\4\uffff\1\14\2\uffff\1\15\2\uffff\1\13\1\uffff\1\12\1\10\1\11\6\uffff\1\7\1\6\7\uffff\1\5\5\uffff\1\3\1\4\1\102\1\104\1\uffff\1\2\2\uffff\1\1";
    static final String DFA19_specialS =
        "\1\1\52\uffff\1\0\u00b0\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\56\1\55\1\27\2\56\1\30\22\56\1\55\1\16\1\54\2\56\1\31\1\56\1\53\1\32\1\33\1\17\1\34\1\35\1\20\1\21\1\36\2\50\1\51\7\52\1\37\1\56\1\22\1\23\1\24\1\25\1\40\32\47\1\41\1\56\1\42\1\46\1\47\1\56\1\11\1\7\1\47\1\1\1\10\1\6\1\12\1\47\1\13\2\47\1\14\1\5\1\47\1\26\1\2\2\47\1\3\1\4\1\47\1\15\4\47\1\43\1\56\1\44\uff82\56",
            "\1\57",
            "\1\62\12\uffff\1\61",
            "\1\63\16\uffff\1\64",
            "\1\66\6\uffff\1\65",
            "\1\70\15\uffff\1\67",
            "\1\71\12\uffff\1\73\5\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76\4\uffff\1\77",
            "\1\100",
            "\1\101\4\uffff\1\102",
            "\1\103\1\104\15\uffff\1\105\1\106",
            "\1\107",
            "\1\110",
            "\1\112",
            "\12\116\4\uffff\1\114",
            "\1\117",
            "\1\121",
            "\1\123",
            "\1\125",
            "\1\127",
            "\1\131",
            "\2\133\2\uffff\1\133\22\uffff\1\133",
            "\2\133\2\uffff\1\133\22\uffff\1\133",
            "",
            "",
            "",
            "",
            "",
            "\1\142\2\uffff\1\45\1\uffff\1\143\12\45\47\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\156\1\155\1\uffff\12\153",
            "\1\156\1\155\1\uffff\4\157\6\160",
            "\1\156\1\155\1\uffff\12\160",
            "\12\161\1\uffff\2\161\1\uffff\ufff2\161",
            "\1\161",
            "",
            "",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165\1\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\175\2\uffff\1\174\1\173",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\24\uffff\1\u0084",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0086",
            "\1\u0087",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0089\22\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\155\1\uffff\12\116",
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
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
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
            "\1\156\1\155\1\uffff\12\160\1\u0090",
            "",
            "",
            "\1\u0091\1\u0092",
            "\1\156\1\155\1\uffff\12\160\1\u0090",
            "\1\156\1\155\1\uffff\12\160",
            "",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0093\21\60",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a0",
            "\1\u00a1",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a3",
            "\1\u00a4",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\11\u00af",
            "\3\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b4",
            "",
            "",
            "\1\u00b5",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b7",
            "\1\u00b8",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00ba",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
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
            "\1\u00be",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\u00c6\2\u00c7\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\11\u00ce",
            "\12\u00cf",
            "\2\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00d6",
            "\1\u00d6",
            "\1\u00d6",
            "\1\u00d7",
            "\1\60\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Definitions | PlugDsl | Service | Typedef | Module | False | Match | Bool | Enum | From | Mask | Path | True | And | Any | Def | Flt | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Set | Str | Var | ExclamationMarkEqualsSign | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | As | Is | Or | LineFeed | CarriageReturn | ExclamationMark | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_PATH | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_DATE | RULE_TIME | RULE_DATETIME | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_43 = input.LA(1);

                        s = -1;
                        if ( ((LA19_43>='\u0000' && LA19_43<='\t')||(LA19_43>='\u000B' && LA19_43<='\f')||(LA19_43>='\u000E' && LA19_43<='\uFFFF')) ) {s = 113;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='d') ) {s = 1;}

                        else if ( (LA19_0=='p') ) {s = 2;}

                        else if ( (LA19_0=='s') ) {s = 3;}

                        else if ( (LA19_0=='t') ) {s = 4;}

                        else if ( (LA19_0=='m') ) {s = 5;}

                        else if ( (LA19_0=='f') ) {s = 6;}

                        else if ( (LA19_0=='b') ) {s = 7;}

                        else if ( (LA19_0=='e') ) {s = 8;}

                        else if ( (LA19_0=='a') ) {s = 9;}

                        else if ( (LA19_0=='g') ) {s = 10;}

                        else if ( (LA19_0=='i') ) {s = 11;}

                        else if ( (LA19_0=='l') ) {s = 12;}

                        else if ( (LA19_0=='v') ) {s = 13;}

                        else if ( (LA19_0=='!') ) {s = 14;}

                        else if ( (LA19_0=='*') ) {s = 15;}

                        else if ( (LA19_0=='-') ) {s = 16;}

                        else if ( (LA19_0=='.') ) {s = 17;}

                        else if ( (LA19_0=='<') ) {s = 18;}

                        else if ( (LA19_0=='=') ) {s = 19;}

                        else if ( (LA19_0=='>') ) {s = 20;}

                        else if ( (LA19_0=='?') ) {s = 21;}

                        else if ( (LA19_0=='o') ) {s = 22;}

                        else if ( (LA19_0=='\n') ) {s = 23;}

                        else if ( (LA19_0=='\r') ) {s = 24;}

                        else if ( (LA19_0=='%') ) {s = 25;}

                        else if ( (LA19_0=='(') ) {s = 26;}

                        else if ( (LA19_0==')') ) {s = 27;}

                        else if ( (LA19_0=='+') ) {s = 28;}

                        else if ( (LA19_0==',') ) {s = 29;}

                        else if ( (LA19_0=='/') ) {s = 30;}

                        else if ( (LA19_0==':') ) {s = 31;}

                        else if ( (LA19_0=='@') ) {s = 32;}

                        else if ( (LA19_0=='[') ) {s = 33;}

                        else if ( (LA19_0==']') ) {s = 34;}

                        else if ( (LA19_0=='{') ) {s = 35;}

                        else if ( (LA19_0=='}') ) {s = 36;}

                        else if ( (LA19_0=='^') ) {s = 38;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||LA19_0=='c'||LA19_0=='h'||(LA19_0>='j' && LA19_0<='k')||LA19_0=='n'||(LA19_0>='q' && LA19_0<='r')||LA19_0=='u'||(LA19_0>='w' && LA19_0<='z')) ) {s = 39;}

                        else if ( ((LA19_0>='0' && LA19_0<='1')) ) {s = 40;}

                        else if ( (LA19_0=='2') ) {s = 41;}

                        else if ( ((LA19_0>='3' && LA19_0<='9')) ) {s = 42;}

                        else if ( (LA19_0=='\'') ) {s = 43;}

                        else if ( (LA19_0=='\"') ) {s = 44;}

                        else if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 45;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='#' && LA19_0<='$')||LA19_0=='&'||LA19_0==';'||LA19_0=='\\'||LA19_0=='`'||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 46;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}