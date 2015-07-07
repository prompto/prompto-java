var antlr4 = require("antlr4/index");
var al = require("./ArgsLexer");
var ap = require("./ArgsParser");
var ArgsParserListener = require("./ArgsParserListener").ArgsParserListener;

function CmdLineBuilder() {
	ArgsParserListener.call(this);
	this.args = {};
	this.values = {};
	return this;
}

CmdLineBuilder.prototype = Object.create(ArgsParserListener.prototype);
CmdLineBuilder.prototype.constructor = CmdLineBuilder;

CmdLineBuilder.prototype.getCmdLineArgs = function() {
	return this.args;
};

CmdLineBuilder.prototype.exitEntry = function(ctx) {
	var key = this.values[ctx.k];
	var value = this.values[ctx.v];
	this.args[key] = value;
};

CmdLineBuilder.prototype.exitKey = function(ctx) {
	this.values[ctx] = ctx.getText();
};

CmdLineBuilder.prototype.exitSTRING = function(ctx) {
	var s = ctx.getText();
	this.values[ctx] = s.substring(1,s.length-1);
};

CmdLineBuilder.prototype.exitELEMENT = function(ctx) {
	this.values[ctx] = ctx.getText();
};

function CmdLineParser() {
	return this;
}

CmdLineParser.parse = function(input) {
	if(input===null) {
		input = "";
	}
	var stream = new antlr4.InputStream(input);
	var lexer = new al.ArgsLexer(stream);
	var tokens = new antlr4.CommonTokenStream(lexer);
	var parser = new ap.ArgsParser(tokens);
	var tree = parser.parse();
	var builder = new CmdLineBuilder();
	var walker = new antlr4.tree.ParseTreeWalker();
	walker.walk(builder, tree);
	return builder.getCmdLineArgs();
};

exports.CmdLineParser = CmdLineParser;