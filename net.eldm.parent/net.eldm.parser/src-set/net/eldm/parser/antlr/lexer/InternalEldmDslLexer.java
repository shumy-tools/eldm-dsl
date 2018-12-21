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

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:22:8: ( 'import' )
            // InternalEldmDslLexer.g:22:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

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

    // $ANTLR start "Catch"
    public final void mCatch() throws RecognitionException {
        try {
            int _type = Catch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:26:7: ( 'catch' )
            // InternalEldmDslLexer.g:26:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Catch"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:28:7: ( 'false' )
            // InternalEldmDslLexer.g:28:9: 'false'
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
            // InternalEldmDslLexer.g:30:7: ( 'match' )
            // InternalEldmDslLexer.g:30:9: 'match'
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
            // InternalEldmDslLexer.g:32:6: ( 'bool' )
            // InternalEldmDslLexer.g:32:8: 'bool'
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

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:34:6: ( 'else' )
            // InternalEldmDslLexer.g:34:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

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

    // $ANTLR start "Func"
    public final void mFunc() throws RecognitionException {
        try {
            int _type = Func;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:40:6: ( 'func' )
            // InternalEldmDslLexer.g:40:8: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Func"

    // $ANTLR start "Mask"
    public final void mMask() throws RecognitionException {
        try {
            int _type = Mask;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:42:6: ( 'mask' )
            // InternalEldmDslLexer.g:42:8: 'mask'
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

    // $ANTLR start "None"
    public final void mNone() throws RecognitionException {
        try {
            int _type = None;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:44:6: ( 'none' )
            // InternalEldmDslLexer.g:44:8: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "None"

    // $ANTLR start "Path"
    public final void mPath() throws RecognitionException {
        try {
            int _type = Path;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:46:6: ( 'path' )
            // InternalEldmDslLexer.g:46:8: 'path'
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

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:48:6: ( 'then' )
            // InternalEldmDslLexer.g:48:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:50:6: ( 'true' )
            // InternalEldmDslLexer.g:50:8: 'true'
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
            // InternalEldmDslLexer.g:52:5: ( 'and' )
            // InternalEldmDslLexer.g:52:7: 'and'
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
            // InternalEldmDslLexer.g:54:5: ( 'any' )
            // InternalEldmDslLexer.g:54:7: 'any'
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
            // InternalEldmDslLexer.g:56:5: ( 'def' )
            // InternalEldmDslLexer.g:56:7: 'def'
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

    // $ANTLR start "Del"
    public final void mDel() throws RecognitionException {
        try {
            int _type = Del;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:58:5: ( 'del' )
            // InternalEldmDslLexer.g:58:7: 'del'
            {
            match("del"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Del"

    // $ANTLR start "Flt"
    public final void mFlt() throws RecognitionException {
        try {
            int _type = Flt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:60:5: ( 'flt' )
            // InternalEldmDslLexer.g:60:7: 'flt'
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

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:62:5: ( 'for' )
            // InternalEldmDslLexer.g:62:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Get"
    public final void mGet() throws RecognitionException {
        try {
            int _type = Get;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:64:5: ( 'get' )
            // InternalEldmDslLexer.g:64:7: 'get'
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
            // InternalEldmDslLexer.g:66:5: ( 'int' )
            // InternalEldmDslLexer.g:66:7: 'int'
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
            // InternalEldmDslLexer.g:68:5: ( 'lda' )
            // InternalEldmDslLexer.g:68:7: 'lda'
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
            // InternalEldmDslLexer.g:70:5: ( 'ldt' )
            // InternalEldmDslLexer.g:70:7: 'ldt'
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
            // InternalEldmDslLexer.g:72:5: ( 'let' )
            // InternalEldmDslLexer.g:72:7: 'let'
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
            // InternalEldmDslLexer.g:74:5: ( 'lst' )
            // InternalEldmDslLexer.g:74:7: 'lst'
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
            // InternalEldmDslLexer.g:76:5: ( 'ltm' )
            // InternalEldmDslLexer.g:76:7: 'ltm'
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
            // InternalEldmDslLexer.g:78:5: ( 'map' )
            // InternalEldmDslLexer.g:78:7: 'map'
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

    // $ANTLR start "Out"
    public final void mOut() throws RecognitionException {
        try {
            int _type = Out;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:80:5: ( 'out' )
            // InternalEldmDslLexer.g:80:7: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Out"

    // $ANTLR start "Set"
    public final void mSet() throws RecognitionException {
        try {
            int _type = Set;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:82:5: ( 'set' )
            // InternalEldmDslLexer.g:82:7: 'set'
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
            // InternalEldmDslLexer.g:84:5: ( 'str' )
            // InternalEldmDslLexer.g:84:7: 'str'
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

    // $ANTLR start "Use"
    public final void mUse() throws RecognitionException {
        try {
            int _type = Use;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:86:5: ( 'use' )
            // InternalEldmDslLexer.g:86:7: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Use"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:88:5: ( 'var' )
            // InternalEldmDslLexer.g:88:7: 'var'
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
            // InternalEldmDslLexer.g:90:27: ( '!=' )
            // InternalEldmDslLexer.g:90:29: '!='
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
            // InternalEldmDslLexer.g:92:18: ( '**' )
            // InternalEldmDslLexer.g:92:20: '**'
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
            // InternalEldmDslLexer.g:94:28: ( '->' )
            // InternalEldmDslLexer.g:94:30: '->'
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
            // InternalEldmDslLexer.g:96:18: ( '..' )
            // InternalEldmDslLexer.g:96:20: '..'
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
            // InternalEldmDslLexer.g:98:24: ( '<=' )
            // InternalEldmDslLexer.g:98:26: '<='
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
            // InternalEldmDslLexer.g:100:22: ( '==' )
            // InternalEldmDslLexer.g:100:24: '=='
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
            // InternalEldmDslLexer.g:102:27: ( '>=' )
            // InternalEldmDslLexer.g:102:29: '>='
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
            // InternalEldmDslLexer.g:104:22: ( '?.' )
            // InternalEldmDslLexer.g:104:24: '?.'
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
            // InternalEldmDslLexer.g:106:4: ( 'as' )
            // InternalEldmDslLexer.g:106:6: 'as'
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

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:108:4: ( 'if' )
            // InternalEldmDslLexer.g:108:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:110:4: ( 'in' )
            // InternalEldmDslLexer.g:110:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "Is"
    public final void mIs() throws RecognitionException {
        try {
            int _type = Is;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:112:4: ( 'is' )
            // InternalEldmDslLexer.g:112:6: 'is'
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
            // InternalEldmDslLexer.g:114:4: ( 'or' )
            // InternalEldmDslLexer.g:114:6: 'or'
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
            // InternalEldmDslLexer.g:116:10: ( '\\n' )
            // InternalEldmDslLexer.g:116:12: '\\n'
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
            // InternalEldmDslLexer.g:118:16: ( '\\r' )
            // InternalEldmDslLexer.g:118:18: '\\r'
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
            // InternalEldmDslLexer.g:120:17: ( '!' )
            // InternalEldmDslLexer.g:120:19: '!'
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
            // InternalEldmDslLexer.g:122:13: ( '%' )
            // InternalEldmDslLexer.g:122:15: '%'
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
            // InternalEldmDslLexer.g:124:17: ( '(' )
            // InternalEldmDslLexer.g:124:19: '('
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
            // InternalEldmDslLexer.g:126:18: ( ')' )
            // InternalEldmDslLexer.g:126:20: ')'
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
            // InternalEldmDslLexer.g:128:10: ( '*' )
            // InternalEldmDslLexer.g:128:12: '*'
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
            // InternalEldmDslLexer.g:130:10: ( '+' )
            // InternalEldmDslLexer.g:130:12: '+'
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
            // InternalEldmDslLexer.g:132:7: ( ',' )
            // InternalEldmDslLexer.g:132:9: ','
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
            // InternalEldmDslLexer.g:134:13: ( '-' )
            // InternalEldmDslLexer.g:134:15: '-'
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
            // InternalEldmDslLexer.g:136:10: ( '.' )
            // InternalEldmDslLexer.g:136:12: '.'
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
            // InternalEldmDslLexer.g:138:9: ( '/' )
            // InternalEldmDslLexer.g:138:11: '/'
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
            // InternalEldmDslLexer.g:140:7: ( ':' )
            // InternalEldmDslLexer.g:140:9: ':'
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
            // InternalEldmDslLexer.g:142:14: ( '<' )
            // InternalEldmDslLexer.g:142:16: '<'
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
            // InternalEldmDslLexer.g:144:12: ( '=' )
            // InternalEldmDslLexer.g:144:14: '='
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
            // InternalEldmDslLexer.g:146:17: ( '>' )
            // InternalEldmDslLexer.g:146:19: '>'
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
            // InternalEldmDslLexer.g:148:14: ( '?' )
            // InternalEldmDslLexer.g:148:16: '?'
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
            // InternalEldmDslLexer.g:150:14: ( '@' )
            // InternalEldmDslLexer.g:150:16: '@'
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
            // InternalEldmDslLexer.g:152:19: ( '[' )
            // InternalEldmDslLexer.g:152:21: '['
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
            // InternalEldmDslLexer.g:154:20: ( ']' )
            // InternalEldmDslLexer.g:154:22: ']'
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
            // InternalEldmDslLexer.g:156:18: ( '{' )
            // InternalEldmDslLexer.g:156:20: '{'
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
            // InternalEldmDslLexer.g:158:19: ( '}' )
            // InternalEldmDslLexer.g:158:21: '}'
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

    // $ANTLR start "LeftPointingDoubleAngleQuotationMark"
    public final void mLeftPointingDoubleAngleQuotationMark() throws RecognitionException {
        try {
            int _type = LeftPointingDoubleAngleQuotationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:160:38: ( '\\u00AB' )
            // InternalEldmDslLexer.g:160:40: '\\u00AB'
            {
            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftPointingDoubleAngleQuotationMark"

    // $ANTLR start "RightPointingDoubleAngleQuotationMark"
    public final void mRightPointingDoubleAngleQuotationMark() throws RecognitionException {
        try {
            int _type = RightPointingDoubleAngleQuotationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEldmDslLexer.g:162:39: ( '\\u00BB' )
            // InternalEldmDslLexer.g:162:41: '\\u00BB'
            {
            match('\u00BB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightPointingDoubleAngleQuotationMark"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalEldmDslLexer.g:164:21: ()
            // InternalEldmDslLexer.g:164:23: 
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
            // InternalEldmDslLexer.g:166:19: ()
            // InternalEldmDslLexer.g:166:21: 
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
            // InternalEldmDslLexer.g:168:11: ( ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )* )
            // InternalEldmDslLexer.g:168:13: ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )*
            {
            // InternalEldmDslLexer.g:168:13: ( '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+ )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEldmDslLexer.g:168:14: '/' ( 'a' .. 'z' | '-' | '0' .. '9' )+
            	    {
            	    match('/'); 
            	    // InternalEldmDslLexer.g:168:18: ( 'a' .. 'z' | '-' | '0' .. '9' )+
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
            // InternalEldmDslLexer.g:170:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )* )
            // InternalEldmDslLexer.g:170:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )*
            {
            // InternalEldmDslLexer.g:170:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEldmDslLexer.g:170:11: '^'
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

            // InternalEldmDslLexer.g:170:40: ( 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | '0' .. '9' )*
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
            // InternalEldmDslLexer.g:172:19: ( ( '0' .. '9' )+ )
            // InternalEldmDslLexer.g:172:21: ( '0' .. '9' )+
            {
            // InternalEldmDslLexer.g:172:21: ( '0' .. '9' )+
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
            	    // InternalEldmDslLexer.g:172:22: '0' .. '9'
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
            // InternalEldmDslLexer.g:174:14: ( ( '-' )? RULE_INT )
            // InternalEldmDslLexer.g:174:16: ( '-' )? RULE_INT
            {
            // InternalEldmDslLexer.g:174:16: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEldmDslLexer.g:174:16: '-'
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
            // InternalEldmDslLexer.g:176:12: ( RULE_NATURAL ( '.' RULE_INT )? )
            // InternalEldmDslLexer.g:176:14: RULE_NATURAL ( '.' RULE_INT )?
            {
            mRULE_NATURAL(); 
            // InternalEldmDslLexer.g:176:27: ( '.' RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEldmDslLexer.g:176:28: '.' RULE_INT
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
            // InternalEldmDslLexer.g:178:11: ( RULE_INT '-' ( '0' '1' .. '9' | '1' '0' .. '2' ) '-' ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' ) )
            // InternalEldmDslLexer.g:178:13: RULE_INT '-' ( '0' '1' .. '9' | '1' '0' .. '2' ) '-' ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' )
            {
            mRULE_INT(); 
            match('-'); 
            // InternalEldmDslLexer.g:178:26: ( '0' '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalEldmDslLexer.g:178:27: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:178:40: '1' '0' .. '2'
                    {
                    match('1'); 
                    matchRange('0','2'); 

                    }
                    break;

            }

            match('-'); 
            // InternalEldmDslLexer.g:178:58: ( '0' '1' .. '9' | '1' .. '2' '0' .. '9' | '3' '0' .. '1' )
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
                    // InternalEldmDslLexer.g:178:59: '0' '1' .. '9'
                    {
                    match('0'); 
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:178:72: '1' .. '2' '0' .. '9'
                    {
                    matchRange('1','2'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalEldmDslLexer.g:178:90: '3' '0' .. '1'
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
            // InternalEldmDslLexer.g:180:11: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9' )
            // InternalEldmDslLexer.g:180:13: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) ':' '0' .. '5' '0' .. '9' ':' '0' .. '5' '0' .. '9'
            {
            // InternalEldmDslLexer.g:180:13: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalEldmDslLexer.g:180:14: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalEldmDslLexer.g:180:32: '2' '0' .. '3'
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
            // InternalEldmDslLexer.g:182:15: ( RULE_DATE 'T' RULE_TIME )
            // InternalEldmDslLexer.g:182:17: RULE_DATE 'T' RULE_TIME
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
            // InternalEldmDslLexer.g:184:11: ( ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalEldmDslLexer.g:184:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalEldmDslLexer.g:184:13: ( '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
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
                    // InternalEldmDslLexer.g:184:14: '\\'' (~ ( ( '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEldmDslLexer.g:184:19: (~ ( ( '\\'' | '\\r' | '\\n' ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEldmDslLexer.g:184:19: ~ ( ( '\\'' | '\\r' | '\\n' ) )
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
                    // InternalEldmDslLexer.g:184:45: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalEldmDslLexer.g:184:51: ( options {greedy=false; } : . )*
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
                    	    // InternalEldmDslLexer.g:184:79: .
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
            // InternalEldmDslLexer.g:186:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEldmDslLexer.g:186:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEldmDslLexer.g:186:24: ( options {greedy=false; } : . )*
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
            	    // InternalEldmDslLexer.g:186:52: .
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
            // InternalEldmDslLexer.g:188:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEldmDslLexer.g:188:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEldmDslLexer.g:188:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEldmDslLexer.g:188:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalEldmDslLexer.g:188:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEldmDslLexer.g:188:41: ( '\\r' )? '\\n'
                    {
                    // InternalEldmDslLexer.g:188:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEldmDslLexer.g:188:41: '\\r'
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
            // InternalEldmDslLexer.g:190:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEldmDslLexer.g:190:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEldmDslLexer.g:190:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalEldmDslLexer.g:192:16: ( . )
            // InternalEldmDslLexer.g:192:18: .
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
        // InternalEldmDslLexer.g:1:8: ( Definitions | PlugDsl | Service | Typedef | Import | Module | Catch | False | Match | Bool | Else | Enum | From | Func | Mask | None | Path | Then | True | And | Any | Def | Del | Flt | For | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Out | Set | Str | Use | Var | ExclamationMarkEqualsSign | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | As | If | In | Is | Or | LineFeed | CarriageReturn | ExclamationMark | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | LeftPointingDoubleAngleQuotationMark | RightPointingDoubleAngleQuotationMark | RULE_PATH | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_DATE | RULE_TIME | RULE_DATETIME | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=87;
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
                // InternalEldmDslLexer.g:1:46: Import
                {
                mImport(); 

                }
                break;
            case 6 :
                // InternalEldmDslLexer.g:1:53: Module
                {
                mModule(); 

                }
                break;
            case 7 :
                // InternalEldmDslLexer.g:1:60: Catch
                {
                mCatch(); 

                }
                break;
            case 8 :
                // InternalEldmDslLexer.g:1:66: False
                {
                mFalse(); 

                }
                break;
            case 9 :
                // InternalEldmDslLexer.g:1:72: Match
                {
                mMatch(); 

                }
                break;
            case 10 :
                // InternalEldmDslLexer.g:1:78: Bool
                {
                mBool(); 

                }
                break;
            case 11 :
                // InternalEldmDslLexer.g:1:83: Else
                {
                mElse(); 

                }
                break;
            case 12 :
                // InternalEldmDslLexer.g:1:88: Enum
                {
                mEnum(); 

                }
                break;
            case 13 :
                // InternalEldmDslLexer.g:1:93: From
                {
                mFrom(); 

                }
                break;
            case 14 :
                // InternalEldmDslLexer.g:1:98: Func
                {
                mFunc(); 

                }
                break;
            case 15 :
                // InternalEldmDslLexer.g:1:103: Mask
                {
                mMask(); 

                }
                break;
            case 16 :
                // InternalEldmDslLexer.g:1:108: None
                {
                mNone(); 

                }
                break;
            case 17 :
                // InternalEldmDslLexer.g:1:113: Path
                {
                mPath(); 

                }
                break;
            case 18 :
                // InternalEldmDslLexer.g:1:118: Then
                {
                mThen(); 

                }
                break;
            case 19 :
                // InternalEldmDslLexer.g:1:123: True
                {
                mTrue(); 

                }
                break;
            case 20 :
                // InternalEldmDslLexer.g:1:128: And
                {
                mAnd(); 

                }
                break;
            case 21 :
                // InternalEldmDslLexer.g:1:132: Any
                {
                mAny(); 

                }
                break;
            case 22 :
                // InternalEldmDslLexer.g:1:136: Def
                {
                mDef(); 

                }
                break;
            case 23 :
                // InternalEldmDslLexer.g:1:140: Del
                {
                mDel(); 

                }
                break;
            case 24 :
                // InternalEldmDslLexer.g:1:144: Flt
                {
                mFlt(); 

                }
                break;
            case 25 :
                // InternalEldmDslLexer.g:1:148: For
                {
                mFor(); 

                }
                break;
            case 26 :
                // InternalEldmDslLexer.g:1:152: Get
                {
                mGet(); 

                }
                break;
            case 27 :
                // InternalEldmDslLexer.g:1:156: Int
                {
                mInt(); 

                }
                break;
            case 28 :
                // InternalEldmDslLexer.g:1:160: Lda
                {
                mLda(); 

                }
                break;
            case 29 :
                // InternalEldmDslLexer.g:1:164: Ldt
                {
                mLdt(); 

                }
                break;
            case 30 :
                // InternalEldmDslLexer.g:1:168: Let
                {
                mLet(); 

                }
                break;
            case 31 :
                // InternalEldmDslLexer.g:1:172: Lst
                {
                mLst(); 

                }
                break;
            case 32 :
                // InternalEldmDslLexer.g:1:176: Ltm
                {
                mLtm(); 

                }
                break;
            case 33 :
                // InternalEldmDslLexer.g:1:180: Map
                {
                mMap(); 

                }
                break;
            case 34 :
                // InternalEldmDslLexer.g:1:184: Out
                {
                mOut(); 

                }
                break;
            case 35 :
                // InternalEldmDslLexer.g:1:188: Set
                {
                mSet(); 

                }
                break;
            case 36 :
                // InternalEldmDslLexer.g:1:192: Str
                {
                mStr(); 

                }
                break;
            case 37 :
                // InternalEldmDslLexer.g:1:196: Use
                {
                mUse(); 

                }
                break;
            case 38 :
                // InternalEldmDslLexer.g:1:200: Var
                {
                mVar(); 

                }
                break;
            case 39 :
                // InternalEldmDslLexer.g:1:204: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 40 :
                // InternalEldmDslLexer.g:1:230: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 41 :
                // InternalEldmDslLexer.g:1:247: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 42 :
                // InternalEldmDslLexer.g:1:274: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 43 :
                // InternalEldmDslLexer.g:1:291: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 44 :
                // InternalEldmDslLexer.g:1:314: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 45 :
                // InternalEldmDslLexer.g:1:335: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 46 :
                // InternalEldmDslLexer.g:1:361: QuestionMarkFullStop
                {
                mQuestionMarkFullStop(); 

                }
                break;
            case 47 :
                // InternalEldmDslLexer.g:1:382: As
                {
                mAs(); 

                }
                break;
            case 48 :
                // InternalEldmDslLexer.g:1:385: If
                {
                mIf(); 

                }
                break;
            case 49 :
                // InternalEldmDslLexer.g:1:388: In
                {
                mIn(); 

                }
                break;
            case 50 :
                // InternalEldmDslLexer.g:1:391: Is
                {
                mIs(); 

                }
                break;
            case 51 :
                // InternalEldmDslLexer.g:1:394: Or
                {
                mOr(); 

                }
                break;
            case 52 :
                // InternalEldmDslLexer.g:1:397: LineFeed
                {
                mLineFeed(); 

                }
                break;
            case 53 :
                // InternalEldmDslLexer.g:1:406: CarriageReturn
                {
                mCarriageReturn(); 

                }
                break;
            case 54 :
                // InternalEldmDslLexer.g:1:421: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 55 :
                // InternalEldmDslLexer.g:1:437: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 56 :
                // InternalEldmDslLexer.g:1:449: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 57 :
                // InternalEldmDslLexer.g:1:465: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 58 :
                // InternalEldmDslLexer.g:1:482: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 59 :
                // InternalEldmDslLexer.g:1:491: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 60 :
                // InternalEldmDslLexer.g:1:500: Comma
                {
                mComma(); 

                }
                break;
            case 61 :
                // InternalEldmDslLexer.g:1:506: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 62 :
                // InternalEldmDslLexer.g:1:518: FullStop
                {
                mFullStop(); 

                }
                break;
            case 63 :
                // InternalEldmDslLexer.g:1:527: Solidus
                {
                mSolidus(); 

                }
                break;
            case 64 :
                // InternalEldmDslLexer.g:1:535: Colon
                {
                mColon(); 

                }
                break;
            case 65 :
                // InternalEldmDslLexer.g:1:541: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 66 :
                // InternalEldmDslLexer.g:1:554: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 67 :
                // InternalEldmDslLexer.g:1:565: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 68 :
                // InternalEldmDslLexer.g:1:581: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 69 :
                // InternalEldmDslLexer.g:1:594: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 70 :
                // InternalEldmDslLexer.g:1:607: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 71 :
                // InternalEldmDslLexer.g:1:625: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 72 :
                // InternalEldmDslLexer.g:1:644: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 73 :
                // InternalEldmDslLexer.g:1:661: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 74 :
                // InternalEldmDslLexer.g:1:679: LeftPointingDoubleAngleQuotationMark
                {
                mLeftPointingDoubleAngleQuotationMark(); 

                }
                break;
            case 75 :
                // InternalEldmDslLexer.g:1:716: RightPointingDoubleAngleQuotationMark
                {
                mRightPointingDoubleAngleQuotationMark(); 

                }
                break;
            case 76 :
                // InternalEldmDslLexer.g:1:754: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 77 :
                // InternalEldmDslLexer.g:1:764: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 78 :
                // InternalEldmDslLexer.g:1:772: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 79 :
                // InternalEldmDslLexer.g:1:785: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 80 :
                // InternalEldmDslLexer.g:1:796: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 81 :
                // InternalEldmDslLexer.g:1:806: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 82 :
                // InternalEldmDslLexer.g:1:816: RULE_DATETIME
                {
                mRULE_DATETIME(); 

                }
                break;
            case 83 :
                // InternalEldmDslLexer.g:1:830: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 84 :
                // InternalEldmDslLexer.g:1:840: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 85 :
                // InternalEldmDslLexer.g:1:856: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 86 :
                // InternalEldmDslLexer.g:1:872: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 87 :
                // InternalEldmDslLexer.g:1:880: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\52\21\65\1\131\1\133\1\136\1\140\1\142\1\144\1\146\1\150\1\151\1\153\5\uffff\1\163\11\uffff\1\63\1\uffff\3\175\2\63\2\uffff\1\65\1\uffff\10\65\1\u008f\1\u0090\1\u0091\15\65\1\u00a2\6\65\1\u00aa\2\65\5\uffff\1\175\36\uffff\1\175\3\uffff\2\175\1\uffff\1\u00b1\1\u00b2\3\65\1\u00b6\1\u00b7\4\65\1\u00bc\3\uffff\3\65\1\u00c0\4\65\1\u00c5\1\u00c6\4\65\1\u00cb\1\u00cc\1\uffff\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\uffff\1\u00d4\1\u00d5\3\uffff\1\65\2\uffff\1\65\1\u00da\1\65\2\uffff\1\65\1\u00dd\1\u00de\1\65\1\uffff\2\65\1\u00e2\1\uffff\2\65\1\u00e5\1\u00e6\2\uffff\1\u00e7\1\u00e8\1\u00e9\1\u00ea\15\uffff\2\65\1\uffff\2\65\2\uffff\2\65\1\u00f2\1\uffff\1\u00f3\1\u00f4\7\uffff\4\65\1\u00fc\1\u00fd\6\uffff\2\65\1\u0103\1\u0104\2\uffff\3\u0105\1\65\1\u0108\4\uffff\1\65\1\uffff\2\65\1\uffff";
    static final String DFA19_eofS =
        "\u010c\uffff";
    static final String DFA19_minS =
        "\1\0\1\145\1\141\1\145\1\150\1\146\3\141\1\157\1\154\1\157\1\156\1\145\1\144\1\162\1\163\1\141\1\75\1\52\1\60\1\56\3\75\1\56\2\11\5\uffff\1\52\11\uffff\1\101\1\uffff\3\55\1\0\1\42\2\uffff\1\146\1\uffff\1\165\1\164\2\162\1\160\1\145\1\165\1\160\3\55\1\144\1\160\1\164\1\154\1\157\1\156\1\164\1\162\1\157\1\163\1\165\1\156\1\144\1\55\1\164\1\141\2\164\1\155\1\164\1\55\1\145\1\162\5\uffff\1\56\36\uffff\1\55\1\uffff\1\60\1\uffff\2\55\1\uffff\2\55\1\147\1\150\1\166\2\55\1\145\1\156\1\145\1\157\1\55\3\uffff\1\165\1\143\1\153\1\55\1\143\1\163\1\155\1\143\2\55\1\154\1\145\1\155\1\145\2\55\1\uffff\7\55\1\uffff\2\55\1\uffff\1\61\1\60\1\156\2\uffff\2\55\1\151\2\uffff\1\144\2\55\1\162\1\uffff\1\154\1\150\1\55\1\uffff\1\150\1\145\2\55\2\uffff\4\55\13\uffff\2\55\1\151\1\144\1\uffff\1\143\1\145\2\uffff\1\164\1\145\1\55\1\uffff\2\55\6\uffff\1\60\1\164\1\163\1\145\1\146\2\55\3\uffff\1\61\2\60\1\151\1\154\2\55\2\uffff\3\124\1\157\1\55\4\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\145\1\154\1\164\1\171\1\163\1\157\1\141\1\165\1\157\1\156\1\157\1\163\1\145\1\164\1\165\1\163\1\141\1\75\1\52\1\76\1\56\3\75\1\56\2\40\5\uffff\1\172\11\uffff\1\172\1\uffff\3\71\1\uffff\1\42\2\uffff\1\154\1\uffff\1\165\2\164\1\162\1\160\1\145\1\165\1\160\3\172\1\144\2\164\1\154\1\157\1\156\1\164\1\162\1\157\1\163\1\165\1\156\1\171\1\172\4\164\1\155\1\164\1\172\1\145\1\162\5\uffff\1\71\36\uffff\1\72\1\uffff\1\61\1\uffff\1\72\1\71\1\uffff\2\172\1\147\1\150\1\166\2\172\1\145\1\156\1\145\1\157\1\172\3\uffff\1\165\1\143\1\153\1\172\1\143\1\163\1\155\1\143\2\172\1\154\1\145\1\155\1\145\2\172\1\uffff\7\172\1\uffff\2\172\1\uffff\1\71\1\62\1\156\2\uffff\1\55\1\172\1\151\2\uffff\1\144\2\172\1\162\1\uffff\1\154\1\150\1\172\1\uffff\1\150\1\145\2\172\2\uffff\4\172\13\uffff\2\55\1\151\1\144\1\uffff\1\143\1\145\2\uffff\1\164\1\145\1\172\1\uffff\2\172\6\uffff\1\63\1\164\1\163\1\145\1\146\2\172\3\uffff\2\71\1\61\1\151\1\154\2\172\2\uffff\3\124\1\157\1\172\4\uffff\1\156\1\uffff\1\163\1\72\1\uffff";
    static final String DFA19_acceptS =
        "\34\uffff\1\67\1\70\1\71\1\73\1\74\1\uffff\1\100\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\uffff\1\115\5\uffff\1\126\1\127\1\uffff\1\115\42\uffff\1\47\1\66\1\50\1\72\1\51\1\uffff\1\75\1\52\1\76\1\53\1\101\1\54\1\102\1\55\1\103\1\56\1\104\1\64\1\126\1\65\1\67\1\70\1\71\1\73\1\74\1\124\1\125\1\77\1\100\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\uffff\1\116\1\uffff\1\117\2\uffff\1\123\14\uffff\1\61\1\60\1\62\20\uffff\1\57\7\uffff\1\63\2\uffff\1\121\3\uffff\1\26\1\27\3\uffff\1\43\1\44\4\uffff\1\33\3\uffff\1\41\4\uffff\1\30\1\31\4\uffff\1\24\1\25\1\32\1\34\1\35\1\36\1\37\1\40\1\42\1\45\1\46\4\uffff\1\21\2\uffff\1\22\1\23\3\uffff\1\17\2\uffff\1\15\1\16\1\12\1\13\1\14\1\20\7\uffff\1\11\1\7\1\10\7\uffff\1\5\1\6\5\uffff\1\3\1\4\1\120\1\122\1\uffff\1\2\2\uffff\1\1";
    static final String DFA19_specialS =
        "\1\0\57\uffff\1\1\u00db\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\63\1\62\1\32\2\63\1\33\22\63\1\62\1\22\1\61\2\63\1\34\1\63\1\60\1\35\1\36\1\23\1\37\1\40\1\24\1\25\1\41\2\55\1\56\7\57\1\42\1\63\1\26\1\27\1\30\1\31\1\43\32\54\1\44\1\63\1\45\1\53\1\54\1\63\1\14\1\11\1\7\1\1\1\12\1\10\1\15\1\54\1\5\2\54\1\16\1\6\1\13\1\17\1\2\2\54\1\3\1\4\1\20\1\21\4\54\1\46\1\63\1\47\55\63\1\50\17\63\1\51\uff44\63",
            "\1\64",
            "\1\67\12\uffff\1\66",
            "\1\70\16\uffff\1\71",
            "\1\73\11\uffff\1\74\6\uffff\1\72",
            "\1\77\6\uffff\1\75\1\76\4\uffff\1\100",
            "\1\102\15\uffff\1\101",
            "\1\103",
            "\1\104\12\uffff\1\107\2\uffff\1\110\2\uffff\1\105\2\uffff\1\106",
            "\1\111",
            "\1\112\1\uffff\1\113",
            "\1\114",
            "\1\115\4\uffff\1\116",
            "\1\117",
            "\1\120\1\121\15\uffff\1\122\1\123",
            "\1\125\2\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\132",
            "\12\135\4\uffff\1\134",
            "\1\137",
            "\1\141",
            "\1\143",
            "\1\145",
            "\1\147",
            "\2\152\2\uffff\1\152\22\uffff\1\152",
            "\2\152\2\uffff\1\152\22\uffff\1\152",
            "",
            "",
            "",
            "",
            "",
            "\1\161\2\uffff\1\52\1\uffff\1\162\12\52\47\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\176\1\177\1\uffff\12\174",
            "\1\176\1\177\1\uffff\4\u0080\6\u0081",
            "\1\176\1\177\1\uffff\12\u0081",
            "\12\u0082\1\uffff\2\u0082\1\uffff\ufff2\u0082",
            "\1\u0082",
            "",
            "",
            "\1\u0083\5\uffff\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\1\uffff\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u008e\6\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0092",
            "\1\u0095\2\uffff\1\u0094\1\u0093",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\24\uffff\1\u00a1",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00a3",
            "\1\u00a4\22\uffff\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "",
            "",
            "",
            "\1\177\1\uffff\12\135",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\176\1\177\1\uffff\12\u0081\1\u00ad",
            "",
            "\1\u00ae\1\u00af",
            "",
            "\1\176\1\177\1\uffff\12\u0081\1\u00ad",
            "\1\176\1\177\1\uffff\12\u0081",
            "",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00b0\21\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\11\u00d6",
            "\3\u00d7",
            "\1\u00d8",
            "",
            "",
            "\1\u00d9",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
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
            "\1\u00eb",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f5\2\u00f6\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\11\u00fe",
            "\12\u00ff",
            "\2\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0107",
            "\1\65\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
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
            return "1:1: Tokens : ( Definitions | PlugDsl | Service | Typedef | Import | Module | Catch | False | Match | Bool | Else | Enum | From | Func | Mask | None | Path | Then | True | And | Any | Def | Del | Flt | For | Get | Int | Lda | Ldt | Let | Lst | Ltm | Map | Out | Set | Str | Use | Var | ExclamationMarkEqualsSign | AsteriskAsterisk | HyphenMinusGreaterThanSign | FullStopFullStop | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | QuestionMarkFullStop | As | If | In | Is | Or | LineFeed | CarriageReturn | ExclamationMark | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | LeftPointingDoubleAngleQuotationMark | RightPointingDoubleAngleQuotationMark | RULE_PATH | RULE_ID | RULE_NATURAL | RULE_FLOAT | RULE_DATE | RULE_TIME | RULE_DATETIME | RULE_TEXT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='d') ) {s = 1;}

                        else if ( (LA19_0=='p') ) {s = 2;}

                        else if ( (LA19_0=='s') ) {s = 3;}

                        else if ( (LA19_0=='t') ) {s = 4;}

                        else if ( (LA19_0=='i') ) {s = 5;}

                        else if ( (LA19_0=='m') ) {s = 6;}

                        else if ( (LA19_0=='c') ) {s = 7;}

                        else if ( (LA19_0=='f') ) {s = 8;}

                        else if ( (LA19_0=='b') ) {s = 9;}

                        else if ( (LA19_0=='e') ) {s = 10;}

                        else if ( (LA19_0=='n') ) {s = 11;}

                        else if ( (LA19_0=='a') ) {s = 12;}

                        else if ( (LA19_0=='g') ) {s = 13;}

                        else if ( (LA19_0=='l') ) {s = 14;}

                        else if ( (LA19_0=='o') ) {s = 15;}

                        else if ( (LA19_0=='u') ) {s = 16;}

                        else if ( (LA19_0=='v') ) {s = 17;}

                        else if ( (LA19_0=='!') ) {s = 18;}

                        else if ( (LA19_0=='*') ) {s = 19;}

                        else if ( (LA19_0=='-') ) {s = 20;}

                        else if ( (LA19_0=='.') ) {s = 21;}

                        else if ( (LA19_0=='<') ) {s = 22;}

                        else if ( (LA19_0=='=') ) {s = 23;}

                        else if ( (LA19_0=='>') ) {s = 24;}

                        else if ( (LA19_0=='?') ) {s = 25;}

                        else if ( (LA19_0=='\n') ) {s = 26;}

                        else if ( (LA19_0=='\r') ) {s = 27;}

                        else if ( (LA19_0=='%') ) {s = 28;}

                        else if ( (LA19_0=='(') ) {s = 29;}

                        else if ( (LA19_0==')') ) {s = 30;}

                        else if ( (LA19_0=='+') ) {s = 31;}

                        else if ( (LA19_0==',') ) {s = 32;}

                        else if ( (LA19_0=='/') ) {s = 33;}

                        else if ( (LA19_0==':') ) {s = 34;}

                        else if ( (LA19_0=='@') ) {s = 35;}

                        else if ( (LA19_0=='[') ) {s = 36;}

                        else if ( (LA19_0==']') ) {s = 37;}

                        else if ( (LA19_0=='{') ) {s = 38;}

                        else if ( (LA19_0=='}') ) {s = 39;}

                        else if ( (LA19_0=='\u00AB') ) {s = 40;}

                        else if ( (LA19_0=='\u00BB') ) {s = 41;}

                        else if ( (LA19_0=='^') ) {s = 43;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||LA19_0=='h'||(LA19_0>='j' && LA19_0<='k')||(LA19_0>='q' && LA19_0<='r')||(LA19_0>='w' && LA19_0<='z')) ) {s = 44;}

                        else if ( ((LA19_0>='0' && LA19_0<='1')) ) {s = 45;}

                        else if ( (LA19_0=='2') ) {s = 46;}

                        else if ( ((LA19_0>='3' && LA19_0<='9')) ) {s = 47;}

                        else if ( (LA19_0=='\'') ) {s = 48;}

                        else if ( (LA19_0=='\"') ) {s = 49;}

                        else if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 50;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='#' && LA19_0<='$')||LA19_0=='&'||LA19_0==';'||LA19_0=='\\'||LA19_0=='`'||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\u00AA')||(LA19_0>='\u00AC' && LA19_0<='\u00BA')||(LA19_0>='\u00BC' && LA19_0<='\uFFFF')) ) {s = 51;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_48 = input.LA(1);

                        s = -1;
                        if ( ((LA19_48>='\u0000' && LA19_48<='\t')||(LA19_48>='\u000B' && LA19_48<='\f')||(LA19_48>='\u000E' && LA19_48<='\uFFFF')) ) {s = 130;}

                        else s = 51;

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