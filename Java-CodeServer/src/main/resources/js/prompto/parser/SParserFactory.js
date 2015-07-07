var antlr4 = require("antlr4/index");
var SIndentingLexer = require("./SIndentingLexer").SIndentingLexer;
var SCleverParser = require("./SCleverParser").SCleverParser;

antlr4.SParserFactory = function() {
	
	this.newLexer = function(data) {
		return new SIndentingLexer(new antlr4.InputStream(data));
	};

	this.newParser = function(path, data) {
		return new SCleverParser(path, data);
	};

};
