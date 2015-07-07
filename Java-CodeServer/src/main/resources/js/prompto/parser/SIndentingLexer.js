var antlr4 = require("antlr4/index");
var SLexer = require("./SLexer").SLexer;
var Dialect = require("./Dialect").Dialect;

function SIndentingLexer(input) {
    SLexer.call(this, input);
	this.tokens = [];
	this.indents = [0];
	this.wasLF = false;
	this.addLF = true;
	this.dialect = Dialect.BOA;
	this.nextLexerToken = this.nextToken;
	this.nextToken = this.indentedNextToken;
	return this;
}

SIndentingLexer.prototype = Object.create(SLexer.prototype);
SIndentingLexer.prototype.constructor = SIndentingLexer;

SIndentingLexer.prototype.indentedNextToken = function() {
	var t = this.getNextToken();
	this.wasLF = t.type===SLexer.LF;
	return t;
};

SIndentingLexer.prototype.getNextToken = function() {
	if(this.tokens.length>0) {
		return this.tokens.shift();
	}
	this.interpret(this.nextLexerToken());
	return this.nextToken();
};

SIndentingLexer.prototype.interpret = function(token) {
	switch(token.type) {
	case SLexer.EOF:
		this.interpretEOF(token);
		break;
	case SLexer.LF_TAB:
		this.interpretLFTAB(token);
		break;			
	default:
		this.interpretAnyToken(token);
	}
};

SIndentingLexer.prototype.interpretEOF = function(eof) {
	// gracefully handle missing dedents
	while(this.indents.length>1) {
		this.tokens.push(this.deriveToken(eof, SLexer.DEDENT));
		this.tokens.push(this.deriveToken(eof, SLexer.LF));
		this.wasLF = true;
		this.indents.pop();
	}
	// gracefully handle missing lf
	if(!this.wasLF && this.addLF) {
		this.tokens.push(this.deriveToken(eof, SLexer.LF));
	}
	this.tokens.push(eof);
};
  
SIndentingLexer.prototype.interpretLFTAB = function(lftab) {
	// count TABs following LF
	var indentCount = this.countIndents(lftab.text);
	var next = this.nextLexerToken();
	// if this was an empty line, simply skip it
	if(next.type===SLexer.EOF || next.type===SLexer.LF_TAB) {
		this.tokens.push(this.deriveToken(lftab, SLexer.LF));
		this.interpret(next);
	} else if(indentCount===this.indents[this.indents.length-1]) {
		this.tokens.push(this.deriveToken(lftab, SLexer.LF));
		this.interpret(next);
	} else if(indentCount>this.indents[this.indents.length-1]) {
		this.tokens.push(this.deriveToken(lftab, SLexer.LF));
		this.tokens.push(this.deriveToken(lftab, SLexer.INDENT));
		this.indents.push(indentCount);
		this.interpret(next);
	} else {
		while(this.indents.length>1 && indentCount<this.indents[this.indents.length-1]) {
			this.tokens.push(this.deriveToken(lftab, SLexer.DEDENT));
			this.tokens.push(this.deriveToken(lftab, SLexer.LF));
			this.indents.pop();
		}
		/*jshint noempty:false*/
		if(indentCount>this.indents[this.indents.length-1]) {
			// TODO, fire an error through token
		}
		this.interpret(next);
		/*jshint noempty:true*/
	}
};

SIndentingLexer.prototype.deriveToken = function(token, type) {
	var res = token.clone();
	res.type = type;
	return res;
};

SIndentingLexer.prototype.countIndents = function(text) {
	var count = 0;
	for(var i=0;i<text.length;i++) {
		switch(text[i]) {
		case ' ':
			count += 1;
			break;
		case '\t':
			count += 4;
			break;
		}
	}
	return count/4;
};

SIndentingLexer.prototype.interpretAnyToken = function(token) {
	this.tokens.push(token);
};

exports.SIndentingLexer = SIndentingLexer;

