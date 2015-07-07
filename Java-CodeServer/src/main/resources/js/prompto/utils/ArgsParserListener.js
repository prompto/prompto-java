// Generated from ArgsParser.g4 by ANTLR 4.5
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by ArgsParser.
function ArgsParserListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

ArgsParserListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
ArgsParserListener.prototype.constructor = ArgsParserListener;

// Enter a parse tree produced by ArgsParser#parse.
ArgsParserListener.prototype.enterParse = function(ctx) {
};

// Exit a parse tree produced by ArgsParser#parse.
ArgsParserListener.prototype.exitParse = function(ctx) {
};


// Enter a parse tree produced by ArgsParser#entry.
ArgsParserListener.prototype.enterEntry = function(ctx) {
};

// Exit a parse tree produced by ArgsParser#entry.
ArgsParserListener.prototype.exitEntry = function(ctx) {
};


// Enter a parse tree produced by ArgsParser#key.
ArgsParserListener.prototype.enterKey = function(ctx) {
};

// Exit a parse tree produced by ArgsParser#key.
ArgsParserListener.prototype.exitKey = function(ctx) {
};


// Enter a parse tree produced by ArgsParser#ELEMENT.
ArgsParserListener.prototype.enterELEMENT = function(ctx) {
};

// Exit a parse tree produced by ArgsParser#ELEMENT.
ArgsParserListener.prototype.exitELEMENT = function(ctx) {
};


// Enter a parse tree produced by ArgsParser#STRING.
ArgsParserListener.prototype.enterSTRING = function(ctx) {
};

// Exit a parse tree produced by ArgsParser#STRING.
ArgsParserListener.prototype.exitSTRING = function(ctx) {
};



exports.ArgsParserListener = ArgsParserListener;