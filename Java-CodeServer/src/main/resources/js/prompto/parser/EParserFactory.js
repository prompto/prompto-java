var antlr4 = require("antlr4/index");
var EIndentingLexer = require("./EIndentingLexer").EIndentingLexer;
var ECleverParser = require("./ECleverParser").ECleverParser;

exports.EParserFactory = function() {
	
	this.newLexer = function(data) {
		return new EIndentingLexer(new antlr4.InputStream(data));
	};

	this.newParser = function(path, data) {
		return new ECleverParser(path, data);
	};

};
