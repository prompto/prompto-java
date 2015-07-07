var isNodeJs = typeof window === 'undefined';
var fs = isNodeJs ? require("fs") : {}; // nodejs only
var antlr4 = require("antlr4/index");
var SIndentingLexer = require("./SIndentingLexer").SIndentingLexer;
var SParser = require("./SParser").SParser;
var SPrestoBuilder = require("./SPromptoBuilder").SPromptoBuilder;

function createInput(input) {
	if(typeof(input)==='string' || input instanceof String) {
		if(isNodeJs && fs.existsSync(input)) {
			input = new antlr4.FileStream(input);
		} else {
			input = new antlr4.InputStream(input);
		}
	}
	if(input instanceof antlr4.InputStream) {
		input = new SIndentingLexer(input);
	}
	if(input instanceof antlr4.Lexer) {
		input = new antlr4.CommonTokenStream(input);
	}
	return input;
}

function SCleverParser(input) {
	SParser.call(this,createInput(input));
	this.path = "";
	return this;
}

SCleverParser.prototype = Object.create(SParser.prototype);
SCleverParser.prototype.constructor = SCleverParser;

SCleverParser.prototype.parse = function() {
	return this.parse_declaration_list();
};
	
SCleverParser.prototype.parse_declaration_list = function() {
	var tree = this.declaration_list();
	var builder = new SPrestoBuilder(this);
	var walker = new antlr4.tree.ParseTreeWalker();
	walker.walk(builder, tree);
	return builder.getNodeValue(tree);
};

SCleverParser.prototype.equalToken = function() {
    return SParser.EQUAL;
};

exports.SCleverParser = SCleverParser;