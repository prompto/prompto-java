var isNodeJs = typeof window === 'undefined';
var fs = isNodeJs ? require("fs") : {}; // nodejs only
var antlr4 = require("antlr4/index");
var EIndentingLexer = require("./EIndentingLexer").EIndentingLexer;
var EParser = require("./EParser").EParser;
var EPrestoBuilder = require("./EPromptoBuilder").EPromptoBuilder;

function createInput(input) {
	if(typeof(input)==='string' || input instanceof String) {
		if(isNodeJs && fs.existsSync(input)) {
			input = new antlr4.FileStream(input);
		} else {
			input = new antlr4.InputStream(input);
		}
	}
	if(input instanceof antlr4.InputStream) {
		input = new EIndentingLexer(input);
	}
	if(input instanceof antlr4.Lexer) {
		input = new antlr4.CommonTokenStream(input);
	}
	return input;
}

function ECleverParser(input) {
	EParser.call(this,createInput(input));
	this.path = "";
	return this;
}

ECleverParser.prototype = Object.create(EParser.prototype);
ECleverParser.prototype.constructor = ECleverParser;

ECleverParser.prototype.parse = function() {
	return this.parse_declaration_list();
};
	
ECleverParser.prototype.parse_declaration_list = function() {
	var tree = this.declaration_list();
	var builder = new EPrestoBuilder(this);
	var walker = new antlr4.tree.ParseTreeWalker();
	walker.walk(builder, tree);
	return builder.getNodeValue(tree);
};


exports.ECleverParser = ECleverParser;