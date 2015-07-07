// Generated from ArgsLexer.g4 by ANTLR 4.5
// jshint ignore: start
var antlr4 = require('antlr4/index');


var serializedATN = ["\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd",
    "\2\7\60\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2",
    "\3\2\7\2\23\n\2\f\2\16\2\26\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3",
    "\3\3\5\3\"\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7-\n\7\r\7\16\7",
    ".\2\2\b\3\3\5\2\7\4\t\5\13\6\r\7\3\2\5\6\2\f\f\17\17$$^^\n\2$$))^^d",
    "dhhppttvv\b\2\13\f\17\17\"\"$$//??\64\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3",
    "\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\31\3\2\2\2\7#\3\2\2\2",
    "\t%\3\2\2\2\13\'\3\2\2\2\r,\3\2\2\2\17\24\7$\2\2\20\23\5\5\3\2\21\23",
    "\n\2\2\2\22\20\3\2\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24",
    "\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\7$\2\2\30\4\3\2\2\2\31",
    "!\7^\2\2\32\"\t\3\2\2\33\34\4\62\65\2\34\35\4\629\2\35\"\4\629\2\36",
    "\37\4\629\2\37\"\4\629\2 \"\4\629\2!\32\3\2\2\2!\33\3\2\2\2!\36\3\2",
    "\2\2! \3\2\2\2\"\6\3\2\2\2#$\7?\2\2$\b\3\2\2\2%&\7/\2\2&\n\3\2\2\2\'",
    "(\7\"\2\2()\3\2\2\2)*\b\6\2\2*\f\3\2\2\2+-\n\4\2\2,+\3\2\2\2-.\3\2\2",
    "\2.,\3\2\2\2./\3\2\2\2/\16\3\2\2\2\7\2\22\24!.\3\b\2\2"].join("");
		

var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

function ArgsLexer(input) {
	antlr4.Lexer.call(this, input);
    this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    return this;
}

ArgsLexer.prototype = Object.create(antlr4.Lexer.prototype);
ArgsLexer.prototype.constructor = ArgsLexer;

ArgsLexer.EOF = antlr4.Token.EOF;
ArgsLexer.STRING = 1;
ArgsLexer.EQUALS = 2;
ArgsLexer.DASH = 3;
ArgsLexer.WS = 4;
ArgsLexer.ELEMENT = 5;


ArgsLexer.modeNames = [ "DEFAULT_MODE" ];

ArgsLexer.literalNames = [ 'null', 'null', "'='", "'-'", "' '" ];

ArgsLexer.symbolicNames = [ 'null', "STRING", "EQUALS", "DASH", "WS", "ELEMENT" ];

ArgsLexer.ruleNames = [ "STRING", "EscapeSequence", "EQUALS", "DASH", "WS", 
                        "ELEMENT" ];

ArgsLexer.grammarFileName = "ArgsLexer.g4";



exports.ArgsLexer = ArgsLexer;

