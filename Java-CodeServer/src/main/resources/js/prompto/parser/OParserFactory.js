var antlr4 = require("antlr4/index");
var ONamingLexer = require("./ONamingLexer").ONamingLexer;
var OCleverParser = require("./OCleverParser").OCleverParser;

exports.OopsParserFactory =  function() {
	
	this.newLexer = function(data) {
		return new ONamingLexer(new antlr4.InputStream(data));
	};

	this.newParser = function(path, data) {
		return new OCleverParser(path, data);
	};

};