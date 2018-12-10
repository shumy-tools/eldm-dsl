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
    public static final int Enum=15;
    public static final int RULE_BEGIN=50;
    public static final int True=19;
    public static final int False=12;
    public static final int Str=33;
    public static final int Bool=14;
    public static final int Async=11;
    public static final int FullStopFullStop=36;
    public static final int RULE_TIME=58;
    public static final int RightSquareBracket=47;
    public static final int RULE_ID=53;
    public static final int Mask=17;
    public static final int RightParenthesis=40;
    public static final int Lst=28;
    public static final int Mut=31;
    public static final int RULE_PATH=52;
    public static final int RULE_DATE=57;
    public static final int Typedef=8;
    public static final int RULE_INT=54;
    public static final int Get=23;
    public static final int RULE_NATURAL=55;
    public static final int RULE_ML_COMMENT=61;
    public static final int Block=7;
    public static final int RULE_TEXT=60;
    public static final int LeftSquareBracket=46;
    public static final int Module=9;
    public static final int Map=30;
    public static final int RULE_END=51;
    public static final int Set=32;
    public static final int Ltm=29;
    public static final int RULE_DATETIME=59;
    public static final int Lda=25;
    public static final int Test10=5;
    public static final int Any=20;
    public static final int Int=24;
    public static final int Match=13;
    public static final int Flt=22;
    public static final int RULE_SL_COMMENT=62;
    public static final int Comma=41;
    public static final int EqualsSign=43;
    public static final int As=37;
    public static final int NumberSignLeftParenthesis=34;
    public static final int CarriageReturn=39;
    public static final int Colon=42;
    public static final int RightCurlyBracket=49;
    public static final int EOF=-1;
    public static final int Ldt=26;
    public static final int Path=18;
    public static final int Def=21;
    public static final int RULE_WS=63;
    public static final int Definitions=4;
    public static final int LeftCurlyBracket=48;
    public static final int From=16;
    public static final int RULE_ANY_OTHER=64;
    public static final int CommercialAt=45;
    public static final int PlugDsl=6;
    public static final int QuestionMark=44;
    public static final int RULE_FLOAT=56;
    public static final int Let=27;
    public static final int Exp=10;
    public static final int HyphenMinusGreaterThanSign=35;
    public static final int LineFeed=38;

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

    // $ANTLR start "Test10"
    public final void mTest10() throws RecognitionException {
        try {
            int _type = Test10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:16:8: ( '{test:10}' )
            // InternalEldmDslLexer.g:16:10: '{test:10}'
            {
            match("{test:10}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Test10"

    // $ANTLR start "PlugDsl"
    public final void mPlugDsl() throws RecognitionException {
        try {
            int _type = PlugDsl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:18:9: ( 'plug-dsl' )
            // InternalEldmDslLexer.g:18:11: 'plug-dsl'
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

    // $ANTLR start "Block"
    public final void mBlock() throws RecognitionException {
        try {
            int _type = Block;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:20:7: ( '<block>' )
            // InternalEldmDslLexer.g:20:9: '<block>'
            {
            match("<block>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Block"

    // $ANTLR start "Typedef"
    public final void mTypedef() throws RecognitionException {
        try {
            int _type = Typedef;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:22:9: ( 'typedef' )
            // InternalEldmDslLexer.g:22:11: 'typedef'
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
            // InternalEldmDslLexer.g:24:8: ( 'module' )
            // InternalEldmDslLexer.g:24:10: 'module'
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

    // $ANTLR start "Exp"
    public final void mExp() throws RecognitionException {
        try {
            int _type = Exp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:26:5: ( '<exp>' )
            // InternalEldmDslLexer.g:26:7: '<exp>'
            {
            match("<exp>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exp"

    // $ANTLR start "Async"
    public final void mAsync() throws RecognitionException {
        try {
            int _type = Async;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:28:7: ( 'async' )
            // InternalEldmDslLexer.g:28:9: 'async'
            {
            match("async"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Async"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:30:7: ( 'false' )
            // InternalEldmDslLexer.g:30:9: 'false'
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
            // InternalEldmDslLexer.g:32:7: ( 'match' )
            // InternalEldmDslLexer.g:32:9: 'match'
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
            // InternalEldmDslLexer.g:34:6: ( 'bool' )
            // InternalEldmDslLexer.g:34:8: 'bool'
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
            // InternalEldmDslLexer.g:36:6: ( 'enum' )
            // InternalEldmDslLexer.g:36:8: 'enum'
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
            // InternalEldmDslLexer.g:38:6: ( 'from' )
            // InternalEldmDslLexer.g:38:8: 'from'
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
            // InternalEldmDslLexer.g:40:6: ( 'mask' )
            // InternalEldmDslLexer.g:40:8: 'mask'
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
            // InternalEldmDslLexer.g:42:6: ( 'path' )
            // InternalEldmDslLexer.g:42:8: 'path'
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
            // InternalEldmDslLexer.g:44:6: ( 'true' )
            // InternalEldmDslLexer.g:44:8: 'true'
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

    // $ANTLR start "Any"
    public final void mAny() throws RecognitionException {
        try {
            int _type = Any;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:46:5: ( 'any' )
            // InternalEldmDslLexer.g:46:7: 'any'
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
            // InternalEldmDslLexer.g:48:5: ( 'def' )
            // InternalEldmDslLexer.g:48:7: 'def'
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
            // InternalEldmDslLexer.g:50:5: ( 'flt' )
            // InternalEldmDslLexer.g:50:7: 'flt'
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
            // InternalEldmDslLexer.g:52:5: ( 'get' )
            // InternalEldmDslLexer.g:52:7: 'get'
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
            // InternalEldmDslLexer.g:54:5: ( 'int' )
            // InternalEldmDslLexer.g:54:7: 'int'
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
            // InternalEldmDslLexer.g:56:5: ( 'lda' )
            // InternalEldmDslLexer.g:56:7: 'lda'
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
            // InternalEldmDslLexer.g:58:5: ( 'ldt' )
            // InternalEldmDslLexer.g:58:7: 'ldt'
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
            // InternalEldmDslLexer.g:60:5: ( 'let' )
            // InternalEldmDslLexer.g:60:7: 'let'
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
            // InternalEldmDslLexer.g:62:5: ( 'lst' )
            // InternalEldmDslLexer.g:62:7: 'lst'
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
            // InternalEldmDslLexer.g:64:5: ( 'ltm' )
            // InternalEldmDslLexer.g:64:7: 'ltm'
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
            // InternalEldmDslLexer.g:66:5: ( 'map' )
            // InternalEldmDslLexer.g:66:7: 'map'
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

    // $ANTLR start "Mut"
    public final void mMut() throws RecognitionException {
        try {
            int _type = Mut;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:68:5: ( 'mut' )
            // InternalEldmDslLexer.g:68:7: 'mut'
            {
            match("mut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mut"

    // $ANTLR start "Set"
    public final void mSet() throws RecognitionException {
        try {
            int _type = Set;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:70:5: ( 'set' )
            // InternalEldmDslLexer.g:70:7: 'set'
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
            // InternalEldmDslLexer.g:72:5: ( 'str' )
            // InternalEldmDslLexer.g:72:7: 'str'
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

    // $ANTLR start "NumberSignLeftParenthesis"
    public final void mNumberSignLeftParenthesis() throws RecognitionException {
        try {
            int _type = NumberSignLeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:74:27: ( '#(' )
            // InternalEldmDslLexer.g:74:29: '#('
            {
            match("#("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSignLeftParenthesis"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:76:28: ( '->' )
            // InternalEldmDslLexer.g:76:30: '->'
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
            // InternalEldmDslLexer.g:78:18: ( '..' )
            // InternalEldmDslLexer.g:78:20: '..'
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

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:80:4: ( 'as' )
            // InternalEldmDslLexer.g:80:6: 'as'
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

    // $ANTLR start "LineFeed"
    public final void mLineFeed() throws RecognitionException {
        try {
            int _type = LineFeed;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:82:10: ( '\\n' )
            // InternalEldmDslLexer.g:82:12: '\\n'
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
            // InternalEldmDslLexer.g:84:16: ( '\\r' )
            // InternalEldmDslLexer.g:84:18: '\\r'
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

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:86:18: ( ')' )
            // InternalEldmDslLexer.g:86:20: ')'
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

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:88:7: ( ',' )
            // InternalEldmDslLexer.g:88:9: ','
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:90:7: ( ':' )
            // InternalEldmDslLexer.g:90:9: ':'
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

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:92:12: ( '=' )
            // InternalEldmDslLexer.g:92:14: '='
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

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:94:14: ( '?' )
            // InternalEldmDslLexer.g:94:16: '?'
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
            // InternalEldmDslLexer.g:96:14: ( '@' )
            // InternalEldmDslLexer.g:96:16: '@'
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
            // InternalEldmDslLexer.g:98:19: ( '[' )
            // InternalEldmDslLexer.g:98:21: '['
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
            // InternalEldmDslLexer.g:100:20: ( ']' )
            // InternalEldmDslLexer.g:100:22: ']'
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
            // InternalEldmDslLexer.g:102:18: ( '{' )
            // InternalEldmDslLexer.g:102:20: '{'
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
            // InternalEldmDslLexer.g:104:19: ( '}' )
            // InternalEldmDslLexer.g:104:21: '}'
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
            // InternalEldmDslLexer.g:106:21: ()
            // InternalEldmDslLexer.g:106:23: 
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
            // InternalEldmDslLexer.g:108:19: ()
            // InternalEldmDslLexer.g:108:21: 
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
            // InternalEldmDslLexer.g:110:11: ( ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )* )
            // InternalEldmDslLexer.g:110:13: ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )*
            {
            // InternalEldmDslLexer.g:110:13: ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEldmDslLexer.g:110:14: '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+
            	    {
            	    match('/'); 
            	    // InternalEldmDslLexer.g:110:18: ( 'a' .. 'z' | '-' | '0' .. '9' )+
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
            // InternalEldmDslLexer.g:112:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )* )
            // InternalEldmDslLexer.g:112:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )*
            {
            // InternalEldmDslLexer.g:112:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEldmDslLexer.g:112:11: '^'
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

            // InternalEldmDslLexer.g:112:40: ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )*
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
            // InternalEldmDslLexer.g:114:19: ( ( '0' .. '9' )+ )
            // InternalEldmDslLexer.g:114:21: ( '0' .. '9' )+
            {
            // InternalEldmDslLexer.g:114:21: ( '0' .. '9' )+
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
            	    // InternalEldmDslLexer.g:114:22: '0' .. '9'
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
            // InternalEldmDslLexer.g:116:14: ( ( '-' )? RULE_INT )
            // InternalEldmDslLexer.g:116:16: ( '-' )? RULE_INT
            {
            // InternalEldmDslLexer.g:116:16: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEldmDslLexer.g:116:16: '-'
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
            // InternalEldmDslLexer.g:118:12: ( RULE_NATURAL ( '.' RULE_INT )? )
            // InternalEldmDslLexer.g:118:14: RULE_NATURAL ( '.' RULE_INT )?
            {
            mRULE_NATURAL(); 
            // InternalEldmDslLexer.g:118:27: ( '.' RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEldmDslLexer.g:118:28: '.' RULE_INT
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
            // InternalEldmDslLexer.g:120:11: ( RULE_INT '-' ( '0' '1' .. '9' | '1' '0' .. '2' ) '-' ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' ) )
            // InternalEldmDslLexer.g:120:13: RULE_INT '-' ( '0' '1' .. '9' | '1' '0' .. '2' ) '-' ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' )
            {
            mRULE_INT(); 
            match('-'); 
            // InternalEldmDslLexer.g:120:26: ( '0' '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalEldmDslLexer.g:120:27: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:120:40: '1' '0' .. '2'
                    {
                    match('1'); 
                    matchRange('0','2'); 

                    }
                    break;

            }

            match('-'); 
            // InternalEldmDslLexer.g:120:58: ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' )
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
                    // InternalEldmDslLexer.g:120:59: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:120:72: '1' .. '2' '0' .. '9'
                    {
                    matchRange('1','2'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalEldmDslLexer.g:120:90: '3' '0' .. '1'
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
            // InternalEldmDslLexer.g:122:11: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9' )
            // InternalEldmDslLexer.g:122:13: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9'
            {
            // InternalEldmDslLexer.g:122:13: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalEldmDslLexer.g:122:14: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:122:32: '2' '0' .. '3'
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
            // InternalEldmDslLexer.g:124:15: ( RULE_DATE 'T' RULE_TIME )
            // InternalEldmDslLexer.g:124:17: RULE_DATE 'T' RULE_TIME
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
            // InternalEldmDslLexer.g:126:11: ( ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalEldmDslLexer.g:126:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalEldmDslLexer.g:126:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
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
                    // InternalEldmDslLexer.g:126:14: '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEldmDslLexer.g:126:19: (~ ( ( '\\'' | '\\r' | '\\n' ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEldmDslLexer.g:126:19: ~ ( ( '\\'' | '\\r' | '\\n' ) )
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
                    // InternalEldmDslLexer.g:126:45: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalEldmDslLexer.g:126:51: ( options {greedy=false; } : . )*
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
                    	    // InternalEldmDslLexer.g:126:79: .
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
            // InternalEldmDslLexer.g:128:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEldmDslLexer.g:128:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEldmDslLexer.g:128:24: ( options {greedy=false; } : . )*
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
            	    // InternalEldmDslLexer.g:128:52: .
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
            // InternalEldmDslLexer.g:130:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEldmDslLexer.g:130:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEldmDslLexer.g:130:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEldmDslLexer.g:130:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalEldmDslLexer.g:130:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEldmDslLexer.g:130:41: ( '\\r' )? '\\n'
                    {
                    // InternalEldmDslLexer.g:130:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEldmDslLexer.g:130:41: '\\r'
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
            // InternalEldmDslLexer.g:132:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEldmDslLexer.g:132:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEldmDslLexer.g:132:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalEldmDslLexer.g:134:16: ( . )
            // InternalEldmDslLexer.g:134:18: .
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
        // InternalEldmDslLexer.g:1:8: ( Definitions | Test10 | PlugDsl | Block | Typedef | Module | Exp | Async | False | Match | Bool | Enum | From | Mask | Path | True | Any | Def | Flt | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Mut | Set | Str | NumberSignLeftParenthesis | HyphenMinusGreaterThanSign | FullStopFullStop | As | LineFeed | CarriageReturn | RightParenthesis | Comma | Colon | EqualsSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_PATH | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_DATE | RULE_TIME | RULE_DATETIME | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=58;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalEldmDslLexer.g:1:10: Definitions
                {
                mDefinitions(); 

                }
                break;
            case 2 :
                // InternalEldmDslLexer.g:1:22: Test10
                {
                mTest10(); 

                }
                break;
            case 3 :
                // InternalEldmDslLexer.g:1:29: PlugDsl
                {
                mPlugDsl(); 

                }
                break;
            case 4 :
                // InternalEldmDslLexer.g:1:37: Block
                {
                mBlock(); 

                }
                break;
            case 5 :
                // InternalEldmDslLexer.g:1:43: Typedef
                {
                mTypedef(); 

                }
                break;
            case 6 :
                // InternalEldmDslLexer.g:1:51: Module
                {
                mModule(); 

                }
                break;
            case 7 :
                // InternalEldmDslLexer.g:1:58: Exp
                {
                mExp(); 

                }
                break;
            case 8 :
                // InternalEldmDslLexer.g:1:62: Async
                {
                mAsync(); 

                }
                break;
            case 9 :
                // InternalEldmDslLexer.g:1:68: False
                {
                mFalse(); 

                }
                break;
            case 10 :
                // InternalEldmDslLexer.g:1:74: Match
                {
                mMatch(); 

                }
                break;
            case 11 :
                // InternalEldmDslLexer.g:1:80: Bool
                {
                mBool(); 

                }
                break;
            case 12 :
                // InternalEldmDslLexer.g:1:85: Enum
                {
                mEnum(); 

                }
                break;
            case 13 :
                // InternalEldmDslLexer.g:1:90: From
                {
                mFrom(); 

                }
                break;
            case 14 :
                // InternalEldmDslLexer.g:1:95: Mask
                {
                mMask(); 

                }
                break;
            case 15 :
                // InternalEldmDslLexer.g:1:100: Path
                {
                mPath(); 

                }
                break;
            case 16 :
                // InternalEldmDslLexer.g:1:105: True
                {
                mTrue(); 

                }
                break;
            case 17 :
                // InternalEldmDslLexer.g:1:110: Any
                {
                mAny(); 

                }
                break;
            case 18 :
                // InternalEldmDslLexer.g:1:114: Def
                {
                mDef(); 

                }
                break;
            case 19 :
                // InternalEldmDslLexer.g:1:118: Flt
                {
                mFlt(); 

                }
                break;
            case 20 :
                // InternalEldmDslLexer.g:1:122: Get
                {
                mGet(); 

                }
                break;
            case 21 :
                // InternalEldmDslLexer.g:1:126: Int
                {
                mInt(); 

                }
                break;
            case 22 :
                // InternalEldmDslLexer.g:1:130: Lda
                {
                mLda(); 

                }
                break;
            case 23 :
                // InternalEldmDslLexer.g:1:134: Ldt
                {
                mLdt(); 

                }
                break;
            case 24 :
                // InternalEldmDslLexer.g:1:138: Let
                {
                mLet(); 

                }
                break;
            case 25 :
                // InternalEldmDslLexer.g:1:142: Lst
                {
                mLst(); 

                }
                break;
            case 26 :
                // InternalEldmDslLexer.g:1:146: Ltm
                {
                mLtm(); 

                }
                break;
            case 27 :
                // InternalEldmDslLexer.g:1:150: Map
                {
                mMap(); 

                }
                break;
            case 28 :
                // InternalEldmDslLexer.g:1:154: Mut
                {
                mMut(); 

                }
                break;
            case 29 :
                // InternalEldmDslLexer.g:1:158: Set
                {
                mSet(); 

                }
                break;
            case 30 :
                // InternalEldmDslLexer.g:1:162: Str
                {
                mStr(); 

                }
                break;
            case 31 :
                // InternalEldmDslLexer.g:1:166: NumberSignLeftParenthesis
                {
                mNumberSignLeftParenthesis(); 

                }
                break;
            case 32 :
                // InternalEldmDslLexer.g:1:192: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 33 :
                // InternalEldmDslLexer.g:1:219: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 34 :
                // InternalEldmDslLexer.g:1:236: As
                {
                mAs(); 

                }
                break;
            case 35 :
                // InternalEldmDslLexer.g:1:239: LineFeed
                {
                mLineFeed(); 

                }
                break;
            case 36 :
                // InternalEldmDslLexer.g:1:248: CarriageReturn
                {
                mCarriageReturn(); 

                }
                break;
            case 37 :
                // InternalEldmDslLexer.g:1:263: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 38 :
                // InternalEldmDslLexer.g:1:280: Comma
                {
                mComma(); 

                }
                break;
            case 39 :
                // InternalEldmDslLexer.g:1:286: Colon
                {
                mColon(); 

                }
                break;
            case 40 :
                // InternalEldmDslLexer.g:1:292: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 41 :
                // InternalEldmDslLexer.g:1:303: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 42 :
                // InternalEldmDslLexer.g:1:316: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 43 :
                // InternalEldmDslLexer.g:1:329: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 44 :
                // InternalEldmDslLexer.g:1:347: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 45 :
                // InternalEldmDslLexer.g:1:366: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 46 :
                // InternalEldmDslLexer.g:1:383: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 47 :
                // InternalEldmDslLexer.g:1:401: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 48 :
                // InternalEldmDslLexer.g:1:411: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // InternalEldmDslLexer.g:1:419: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 50 :
                // InternalEldmDslLexer.g:1:432: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 51 :
                // InternalEldmDslLexer.g:1:443: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 52 :
                // InternalEldmDslLexer.g:1:453: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 53 :
                // InternalEldmDslLexer.g:1:463: RULE_DATETIME
                {
                mRULE_DATETIME(); 

                }
                break;
            case 54 :
                // InternalEldmDslLexer.g:1:477: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 55 :
                // InternalEldmDslLexer.g:1:487: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // InternalEldmDslLexer.g:1:503: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 57 :
                // InternalEldmDslLexer.g:1:519: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // InternalEldmDslLexer.g:1:527: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\36\1\51\1\53\1\51\1\47\12\51\3\47\1\110\1\112\11\uffff\1\47\1\uffff\1\47\1\uffff\3\127\2\47\2\uffff\1\51\3\uffff\2\51\2\uffff\5\51\1\150\16\51\2\uffff\1\127\17\uffff\1\127\3\uffff\2\127\1\uffff\1\174\7\51\1\u0084\1\u0085\1\51\1\uffff\1\u0087\2\51\1\u008a\2\51\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\3\uffff\1\51\1\uffff\1\51\1\u009a\1\51\1\u009c\2\51\1\u009f\2\uffff\1\51\1\uffff\1\51\1\u00a2\1\uffff\1\u00a3\1\u00a4\13\uffff\2\51\1\uffff\1\51\1\uffff\1\51\1\u00aa\1\uffff\1\u00ab\1\u00ac\4\uffff\3\51\1\u00b3\6\uffff\2\51\1\u00b9\1\uffff\3\u00ba\1\51\1\u00bd\3\uffff\1\51\1\uffff\2\51\1\uffff";
    static final String DFA19_eofS =
        "\u00c1\uffff";
    static final String DFA19_minS =
        "\1\0\1\145\1\164\1\141\1\142\1\162\1\141\1\156\1\141\1\157\1\156\1\145\1\156\1\144\1\145\1\50\1\60\1\56\2\11\11\uffff\1\52\1\uffff\1\101\1\uffff\3\55\1\0\1\42\2\uffff\1\146\3\uffff\1\165\1\164\2\uffff\1\160\1\165\1\144\1\160\1\164\1\55\1\171\1\154\1\157\1\164\1\157\1\165\2\164\1\141\2\164\1\155\1\164\1\162\2\uffff\1\56\17\uffff\1\55\1\uffff\1\60\1\uffff\2\55\1\uffff\1\55\1\147\1\150\2\145\1\165\1\143\1\153\2\55\1\156\1\uffff\1\55\1\163\1\155\1\55\1\154\1\155\11\55\1\uffff\1\61\1\60\1\156\1\uffff\2\55\1\144\1\55\1\154\1\150\1\55\2\uffff\1\143\1\uffff\1\145\1\55\1\uffff\2\55\11\uffff\2\55\1\151\1\144\1\uffff\1\145\1\uffff\1\145\1\55\1\uffff\2\55\3\uffff\1\60\1\164\1\163\1\146\1\55\3\uffff\1\61\2\60\1\151\1\154\1\55\1\uffff\3\124\1\157\1\55\3\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\145\1\164\1\154\1\145\1\171\1\165\1\163\1\162\1\157\1\156\1\145\1\156\2\164\1\50\1\76\1\56\2\40\11\uffff\1\172\1\uffff\1\172\1\uffff\3\71\1\uffff\1\42\2\uffff\1\146\3\uffff\1\165\1\164\2\uffff\1\160\1\165\1\144\2\164\1\172\1\171\1\154\1\157\1\164\1\157\1\165\5\164\1\155\1\164\1\162\2\uffff\1\71\17\uffff\1\72\1\uffff\1\61\1\uffff\1\72\1\71\1\uffff\1\172\1\147\1\150\2\145\1\165\1\143\1\153\2\172\1\156\1\uffff\1\172\1\163\1\155\1\172\1\154\1\155\11\172\1\uffff\1\71\1\62\1\156\1\uffff\1\55\1\172\1\144\1\172\1\154\1\150\1\172\2\uffff\1\143\1\uffff\1\145\1\172\1\uffff\2\172\11\uffff\2\55\1\151\1\144\1\uffff\1\145\1\uffff\1\145\1\172\1\uffff\2\172\3\uffff\1\63\1\164\1\163\1\146\1\172\3\uffff\2\71\1\61\1\151\1\154\1\172\1\uffff\3\124\1\157\1\172\3\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA19_acceptS =
        "\24\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56\1\uffff\1\57\1\uffff\1\60\5\uffff\1\71\1\72\1\uffff\1\60\1\2\1\55\2\uffff\1\4\1\7\24\uffff\1\37\1\40\1\uffff\1\41\1\43\1\71\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56\1\67\1\70\1\uffff\1\61\1\uffff\1\62\2\uffff\1\66\13\uffff\1\42\17\uffff\1\64\3\uffff\1\22\7\uffff\1\33\1\34\1\uffff\1\21\2\uffff\1\23\2\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\35\1\36\4\uffff\1\17\1\uffff\1\20\2\uffff\1\16\2\uffff\1\15\1\13\1\14\5\uffff\1\12\1\10\1\11\6\uffff\1\6\5\uffff\1\5\1\63\1\65\1\uffff\1\3\2\uffff\1\1";
    static final String DFA19_specialS =
        "\1\0\43\uffff\1\1\u009c\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\47\1\46\1\22\2\47\1\23\22\47\1\46\1\47\1\45\1\17\3\47\1\44\1\47\1\24\2\47\1\25\1\20\1\21\1\35\2\41\1\42\7\43\1\26\1\47\1\4\1\27\1\47\1\30\1\31\32\40\1\32\1\47\1\33\1\37\1\40\1\47\1\7\1\11\1\40\1\1\1\12\1\10\1\13\1\40\1\14\2\40\1\15\1\6\2\40\1\3\2\40\1\16\1\5\6\40\1\2\1\47\1\34\uff82\47",
            "\1\50",
            "\1\52",
            "\1\55\12\uffff\1\54",
            "\1\56\2\uffff\1\57",
            "\1\61\6\uffff\1\60",
            "\1\63\15\uffff\1\62\5\uffff\1\64",
            "\1\66\4\uffff\1\65",
            "\1\67\12\uffff\1\71\5\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\1\77\15\uffff\1\100\1\101",
            "\1\102\16\uffff\1\103",
            "\1\104",
            "\12\106\4\uffff\1\105",
            "\1\107",
            "\2\111\2\uffff\1\111\22\uffff\1\111",
            "\2\111\2\uffff\1\111\22\uffff\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124\2\uffff\1\36\1\uffff\1\125\12\36\47\uffff\32\36",
            "",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\130\1\131\1\uffff\12\126",
            "\1\130\1\131\1\uffff\4\132\6\133",
            "\1\130\1\131\1\uffff\12\133",
            "\12\134\1\uffff\2\134\1\uffff\ufff2\134",
            "\1\134",
            "",
            "",
            "\1\135",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\145\2\uffff\1\144\1\143",
            "\1\146",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\30\51\1\147\1\51",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161\22\uffff\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\131\1\uffff\12\106",
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
            "\1\130\1\131\1\uffff\12\133\1\170",
            "",
            "\1\171\1\172",
            "",
            "\1\130\1\131\1\uffff\12\133\1\170",
            "\1\130\1\131\1\uffff\12\133",
            "",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\173\21\51",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0086",
            "",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0088",
            "\1\u0089",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008b",
            "\1\u008c",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\11\u0096",
            "\3\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009b",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009d",
            "\1\u009e",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u00ad\2\u00ae\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\11\u00b4",
            "\12\u00b5",
            "\2\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00bb",
            "\1\u00bb",
            "\1\u00bb",
            "\1\u00bc",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
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
            return "1:1: Tokens : ( Definitions | Test10 | PlugDsl | Block | Typedef | Module | Exp | Async | False | Match | Bool | Enum | From | Mask | Path | True | Any | Def | Flt | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Mut | Set | Str | NumberSignLeftParenthesis | HyphenMinusGreaterThanSign | FullStopFullStop | As | LineFeed | CarriageReturn | RightParenthesis | Comma | Colon | EqualsSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_PATH | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_DATE | RULE_TIME | RULE_DATETIME | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='d') ) {s = 1;}

                        else if ( (LA19_0=='{') ) {s = 2;}

                        else if ( (LA19_0=='p') ) {s = 3;}

                        else if ( (LA19_0=='<') ) {s = 4;}

                        else if ( (LA19_0=='t') ) {s = 5;}

                        else if ( (LA19_0=='m') ) {s = 6;}

                        else if ( (LA19_0=='a') ) {s = 7;}

                        else if ( (LA19_0=='f') ) {s = 8;}

                        else if ( (LA19_0=='b') ) {s = 9;}

                        else if ( (LA19_0=='e') ) {s = 10;}

                        else if ( (LA19_0=='g') ) {s = 11;}

                        else if ( (LA19_0=='i') ) {s = 12;}

                        else if ( (LA19_0=='l') ) {s = 13;}

                        else if ( (LA19_0=='s') ) {s = 14;}

                        else if ( (LA19_0=='#') ) {s = 15;}

                        else if ( (LA19_0=='-') ) {s = 16;}

                        else if ( (LA19_0=='.') ) {s = 17;}

                        else if ( (LA19_0=='\n') ) {s = 18;}

                        else if ( (LA19_0=='\r') ) {s = 19;}

                        else if ( (LA19_0==')') ) {s = 20;}

                        else if ( (LA19_0==',') ) {s = 21;}

                        else if ( (LA19_0==':') ) {s = 22;}

                        else if ( (LA19_0=='=') ) {s = 23;}

                        else if ( (LA19_0=='?') ) {s = 24;}

                        else if ( (LA19_0=='@') ) {s = 25;}

                        else if ( (LA19_0=='[') ) {s = 26;}

                        else if ( (LA19_0==']') ) {s = 27;}

                        else if ( (LA19_0=='}') ) {s = 28;}

                        else if ( (LA19_0=='/') ) {s = 29;}

                        else if ( (LA19_0=='^') ) {s = 31;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||LA19_0=='c'||LA19_0=='h'||(LA19_0>='j' && LA19_0<='k')||(LA19_0>='n' && LA19_0<='o')||(LA19_0>='q' && LA19_0<='r')||(LA19_0>='u' && LA19_0<='z')) ) {s = 32;}

                        else if ( ((LA19_0>='0' && LA19_0<='1')) ) {s = 33;}

                        else if ( (LA19_0=='2') ) {s = 34;}

                        else if ( ((LA19_0>='3' && LA19_0<='9')) ) {s = 35;}

                        else if ( (LA19_0=='\'') ) {s = 36;}

                        else if ( (LA19_0=='\"') ) {s = 37;}

                        else if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 38;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='$' && LA19_0<='&')||LA19_0=='('||(LA19_0>='*' && LA19_0<='+')||LA19_0==';'||LA19_0=='>'||LA19_0=='\\'||LA19_0=='`'||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 39;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_36 = input.LA(1);

                        s = -1;
                        if ( ((LA19_36>='\u0000' && LA19_36<='\t')||(LA19_36>='\u000B' && LA19_36<='\f')||(LA19_36>='\u000E' && LA19_36<='\uFFFF')) ) {s = 92;}

                        else s = 39;

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