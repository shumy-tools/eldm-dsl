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
    public static final int RULE_PID=52;
    public static final int Bool=14;
    public static final int Async=11;
    public static final int FullStopFullStop=36;
    public static final int RightSquareBracket=47;
    public static final int RULE_ID=53;
    public static final int Mask=17;
    public static final int RightParenthesis=40;
    public static final int Lst=28;
    public static final int Mut=31;
    public static final int Typedef=8;
    public static final int RULE_INT=54;
    public static final int Get=23;
    public static final int RULE_NATURAL=55;
    public static final int RULE_ML_COMMENT=58;
    public static final int Block=7;
    public static final int RULE_TEXT=57;
    public static final int LeftSquareBracket=46;
    public static final int Module=9;
    public static final int Map=30;
    public static final int RULE_END=51;
    public static final int Set=32;
    public static final int Ltm=29;
    public static final int Lda=25;
    public static final int Test10=5;
    public static final int Any=20;
    public static final int Int=24;
    public static final int Match=13;
    public static final int Flt=22;
    public static final int RULE_SL_COMMENT=59;
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
    public static final int RULE_WS=60;
    public static final int Definitions=4;
    public static final int LeftCurlyBracket=48;
    public static final int From=16;
    public static final int RULE_ANY_OTHER=61;
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

    // $ANTLR start "RULE_PID"
    public final void mRULE_PID() throws RecognitionException {
        try {
            int _type = RULE_PID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:110:10: ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )
            // InternalEldmDslLexer.g:110:12: '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+
            {
            match('/'); 
            // InternalEldmDslLexer.g:110:16: ( 'a' .. 'z' | '-' | '0' .. '9' )+
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:112:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )* )
            // InternalEldmDslLexer.g:112:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )*
            {
            // InternalEldmDslLexer.g:112:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
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
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEldmDslLexer.g:114:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
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
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
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

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:120:11: ( ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalEldmDslLexer.g:120:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalEldmDslLexer.g:120:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\'') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\"') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEldmDslLexer.g:120:14: '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEldmDslLexer.g:120:19: (~ ( ( '\\'' | '\\r' | '\\n' ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEldmDslLexer.g:120:19: ~ ( ( '\\'' | '\\r' | '\\n' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:120:45: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalEldmDslLexer.g:120:51: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\"') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='\"') ) {
                                int LA8_3 = input.LA(3);

                                if ( (LA8_3=='\"') ) {
                                    alt8=2;
                                }
                                else if ( ((LA8_3>='\u0000' && LA8_3<='!')||(LA8_3>='#' && LA8_3<='\uFFFF')) ) {
                                    alt8=1;
                                }


                            }
                            else if ( ((LA8_1>='\u0000' && LA8_1<='!')||(LA8_1>='#' && LA8_1<='\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalEldmDslLexer.g:120:79: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
            // InternalEldmDslLexer.g:122:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEldmDslLexer.g:122:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEldmDslLexer.g:122:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEldmDslLexer.g:122:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalEldmDslLexer.g:124:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEldmDslLexer.g:124:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEldmDslLexer.g:124:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEldmDslLexer.g:124:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalEldmDslLexer.g:124:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEldmDslLexer.g:124:41: ( '\\r' )? '\\n'
                    {
                    // InternalEldmDslLexer.g:124:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEldmDslLexer.g:124:41: '\\r'
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
            // InternalEldmDslLexer.g:126:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEldmDslLexer.g:126:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEldmDslLexer.g:126:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalEldmDslLexer.g:128:16: ( . )
            // InternalEldmDslLexer.g:128:18: .
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
        // InternalEldmDslLexer.g:1:8: ( Definitions | Test10 | PlugDsl | Block | Typedef | Module | Exp | Async | False | Match | Bool | Enum | From | Mask | Path | True | Any | Def | Flt | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Mut | Set | Str | NumberSignLeftParenthesis | HyphenMinusGreaterThanSign | FullStopFullStop | As | LineFeed | CarriageReturn | RightParenthesis | Comma | Colon | EqualsSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_PID | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=55;
        alt15 = dfa15.predict(input);
        switch (alt15) {
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
                // InternalEldmDslLexer.g:1:401: RULE_PID
                {
                mRULE_PID(); 

                }
                break;
            case 48 :
                // InternalEldmDslLexer.g:1:410: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // InternalEldmDslLexer.g:1:418: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 50 :
                // InternalEldmDslLexer.g:1:431: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 51 :
                // InternalEldmDslLexer.g:1:442: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 52 :
                // InternalEldmDslLexer.g:1:452: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 53 :
                // InternalEldmDslLexer.g:1:468: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalEldmDslLexer.g:1:484: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalEldmDslLexer.g:1:492: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\46\1\50\1\46\1\44\12\46\3\44\1\105\1\107\11\uffff\2\44\1\uffff\1\124\2\44\2\uffff\1\46\3\uffff\2\46\2\uffff\5\46\1\142\16\46\2\uffff\1\124\23\uffff\1\163\7\46\1\173\1\174\1\46\1\uffff\1\176\2\46\1\u0081\2\46\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\46\1\uffff\1\46\1\u008f\1\46\1\u0091\2\46\1\u0094\2\uffff\1\46\1\uffff\1\46\1\u0097\1\uffff\1\u0098\1\u0099\11\uffff\2\46\1\uffff\1\46\1\uffff\1\46\1\u009e\1\uffff\1\u009f\1\u00a0\3\uffff\3\46\1\u00a4\3\uffff\2\46\1\u00a7\1\uffff\1\46\1\u00a9\1\uffff\1\46\1\uffff\2\46\1\uffff";
    static final String DFA15_eofS =
        "\u00ad\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\1\164\1\141\1\142\1\162\1\141\1\156\1\141\1\157\1\156\1\145\1\156\1\144\1\145\1\50\1\60\1\56\2\11\11\uffff\1\52\1\101\1\uffff\1\56\1\0\1\42\2\uffff\1\146\3\uffff\1\165\1\164\2\uffff\1\160\1\165\1\144\1\160\1\164\1\55\1\171\1\154\1\157\1\164\1\157\1\165\2\164\1\141\2\164\1\155\1\164\1\162\2\uffff\1\56\23\uffff\1\55\1\147\1\150\2\145\1\165\1\143\1\153\2\55\1\156\1\uffff\1\55\1\163\1\155\1\55\1\154\1\155\11\55\1\156\1\uffff\2\55\1\144\1\55\1\154\1\150\1\55\2\uffff\1\143\1\uffff\1\145\1\55\1\uffff\2\55\11\uffff\1\151\1\144\1\uffff\1\145\1\uffff\1\145\1\55\1\uffff\2\55\3\uffff\1\164\1\163\1\146\1\55\3\uffff\1\151\1\154\1\55\1\uffff\1\157\1\55\1\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\145\1\164\1\154\1\145\1\171\1\165\1\163\1\162\1\157\1\156\1\145\1\156\2\164\1\50\1\76\1\56\2\40\11\uffff\2\172\1\uffff\1\71\1\uffff\1\42\2\uffff\1\146\3\uffff\1\165\1\164\2\uffff\1\160\1\165\1\144\2\164\1\172\1\171\1\154\1\157\1\164\1\157\1\165\5\164\1\155\1\164\1\162\2\uffff\1\71\23\uffff\1\172\1\147\1\150\2\145\1\165\1\143\1\153\2\172\1\156\1\uffff\1\172\1\163\1\155\1\172\1\154\1\155\11\172\1\156\1\uffff\1\55\1\172\1\144\1\172\1\154\1\150\1\172\2\uffff\1\143\1\uffff\1\145\1\172\1\uffff\2\172\11\uffff\1\151\1\144\1\uffff\1\145\1\uffff\1\145\1\172\1\uffff\2\172\3\uffff\1\164\1\163\1\146\1\172\3\uffff\1\151\1\154\1\172\1\uffff\1\157\1\172\1\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA15_acceptS =
        "\24\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56\2\uffff\1\60\3\uffff\1\66\1\67\1\uffff\1\60\1\2\1\55\2\uffff\1\4\1\7\24\uffff\1\37\1\40\1\uffff\1\41\1\43\1\66\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56\1\64\1\65\1\57\1\61\1\62\1\63\13\uffff\1\42\20\uffff\1\22\7\uffff\1\33\1\34\1\uffff\1\21\2\uffff\1\23\2\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\35\1\36\2\uffff\1\17\1\uffff\1\20\2\uffff\1\16\2\uffff\1\15\1\13\1\14\4\uffff\1\12\1\10\1\11\3\uffff\1\6\2\uffff\1\5\1\uffff\1\3\2\uffff\1\1";
    static final String DFA15_specialS =
        "\1\0\40\uffff\1\1\u008b\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\44\1\43\1\22\2\44\1\23\22\44\1\43\1\44\1\42\1\17\3\44\1\41\1\44\1\24\2\44\1\25\1\20\1\21\1\35\12\40\1\26\1\44\1\4\1\27\1\44\1\30\1\31\32\37\1\32\1\44\1\33\1\36\1\37\1\44\1\7\1\11\1\37\1\1\1\12\1\10\1\13\1\37\1\14\2\37\1\15\1\6\2\37\1\3\2\37\1\16\1\5\6\37\1\2\1\44\1\34\uff82\44",
            "\1\45",
            "\1\47",
            "\1\52\12\uffff\1\51",
            "\1\53\2\uffff\1\54",
            "\1\56\6\uffff\1\55",
            "\1\60\15\uffff\1\57\5\uffff\1\61",
            "\1\63\4\uffff\1\62",
            "\1\64\12\uffff\1\66\5\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73\1\74\15\uffff\1\75\1\76",
            "\1\77\16\uffff\1\100",
            "\1\101",
            "\12\103\4\uffff\1\102",
            "\1\104",
            "\2\106\2\uffff\1\106\22\uffff\1\106",
            "\2\106\2\uffff\1\106\22\uffff\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121\2\uffff\1\123\1\uffff\1\122\12\123\47\uffff\32\123",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\125\1\uffff\12\103",
            "\12\126\1\uffff\2\126\1\uffff\ufff2\126",
            "\1\126",
            "",
            "",
            "\1\127",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\137\2\uffff\1\136\1\135",
            "\1\140",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\30\46\1\141\1\46",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\22\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "\1\125\1\uffff\12\103",
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
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\162\21\46",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\175",
            "",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\177",
            "\1\u0080",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0082",
            "\1\u0083",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0090",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0092",
            "\1\u0093",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00a8",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Definitions | Test10 | PlugDsl | Block | Typedef | Module | Exp | Async | False | Match | Bool | Enum | From | Mask | Path | True | Any | Def | Flt | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Mut | Set | Str | NumberSignLeftParenthesis | HyphenMinusGreaterThanSign | FullStopFullStop | As | LineFeed | CarriageReturn | RightParenthesis | Comma | Colon | EqualsSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_PID | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='d') ) {s = 1;}

                        else if ( (LA15_0=='{') ) {s = 2;}

                        else if ( (LA15_0=='p') ) {s = 3;}

                        else if ( (LA15_0=='<') ) {s = 4;}

                        else if ( (LA15_0=='t') ) {s = 5;}

                        else if ( (LA15_0=='m') ) {s = 6;}

                        else if ( (LA15_0=='a') ) {s = 7;}

                        else if ( (LA15_0=='f') ) {s = 8;}

                        else if ( (LA15_0=='b') ) {s = 9;}

                        else if ( (LA15_0=='e') ) {s = 10;}

                        else if ( (LA15_0=='g') ) {s = 11;}

                        else if ( (LA15_0=='i') ) {s = 12;}

                        else if ( (LA15_0=='l') ) {s = 13;}

                        else if ( (LA15_0=='s') ) {s = 14;}

                        else if ( (LA15_0=='#') ) {s = 15;}

                        else if ( (LA15_0=='-') ) {s = 16;}

                        else if ( (LA15_0=='.') ) {s = 17;}

                        else if ( (LA15_0=='\n') ) {s = 18;}

                        else if ( (LA15_0=='\r') ) {s = 19;}

                        else if ( (LA15_0==')') ) {s = 20;}

                        else if ( (LA15_0==',') ) {s = 21;}

                        else if ( (LA15_0==':') ) {s = 22;}

                        else if ( (LA15_0=='=') ) {s = 23;}

                        else if ( (LA15_0=='?') ) {s = 24;}

                        else if ( (LA15_0=='@') ) {s = 25;}

                        else if ( (LA15_0=='[') ) {s = 26;}

                        else if ( (LA15_0==']') ) {s = 27;}

                        else if ( (LA15_0=='}') ) {s = 28;}

                        else if ( (LA15_0=='/') ) {s = 29;}

                        else if ( (LA15_0=='^') ) {s = 30;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='c'||LA15_0=='h'||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='n' && LA15_0<='o')||(LA15_0>='q' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='z')) ) {s = 31;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 32;}

                        else if ( (LA15_0=='\'') ) {s = 33;}

                        else if ( (LA15_0=='\"') ) {s = 34;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 35;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||LA15_0=='('||(LA15_0>='*' && LA15_0<='+')||LA15_0==';'||LA15_0=='>'||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_33 = input.LA(1);

                        s = -1;
                        if ( ((LA15_33>='\u0000' && LA15_33<='\t')||(LA15_33>='\u000B' && LA15_33<='\f')||(LA15_33>='\u000E' && LA15_33<='\uFFFF')) ) {s = 86;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}