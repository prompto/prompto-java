var antlr4 = require("antlr4/index");
var ELexer = require("./ELexer").ELexer;
var Dialect = require("./Dialect").Dialect;

function EIndentingLexer(input) {
	ELexer.call(this, input);
	this.tokens = [];
	this.indents = [0];
	this.wasLF = false;
	this.addLF = true;
	this.dialect = Dialect.BOA;
	this.nextLexerToken = this.nextToken;
	this.nextToken = this.indentedNextToken;
	return this;
}

EIndentingLexer.prototype = Object.create(ELexer.prototype);
EIndentingLexer.prototype.constructor = EIndentingLexer;

EIndentingLexer.prototype.indentedNextToken = function() {
	var t = this.getNextToken();
	this.wasLF = t.type===ELexer.LF;
	return t;
};

EIndentingLexer.prototype.getNextToken = function() {
	if(this.tokens.length>0) {
		return this.tokens.shift();
	}
	this.interpret(this.nextLexerToken());
	return this.nextToken();
};

EIndentingLexer.prototype.interpret = function(token) {
	switch(token.type) {
	case ELexer.EOF:
		this.interpretEOF(token);
		break;
	case ELexer.LF_TAB:
		this.interpretLFTAB(token);
		break;			
	default:
		this.interpretAnyToken(token);
	}
};

EIndentingLexer.prototype.interpretEOF = function(eof) {
	// gracefully handle missing dedents
	while(this.indents.length>1) {
		this.tokens.push(this.deriveToken(eof, ELexer.DEDENT));
		this.tokens.push(this.deriveToken(eof, ELexer.LF));
		this.wasLF = true;
		this.indents.pop();
	}
	// gracefully handle missing lf
	if(!this.wasLF && this.addLF) {
		this.tokens.push(this.deriveToken(eof, ELexer.LF));
	}
	this.tokens.push(eof);
};
  
EIndentingLexer.prototype.interpretLFTAB = function(lftab) {
	// count TABs following LF
	var indentCount = this.countIndents(lftab.text);
	var next = this.nextLexerToken();
	// if this was an empty line, simply skip it
	if(next.type===ELexer.EOF || next.type===ELexer.LF_TAB) {
		this.tokens.push(this.deriveToken(lftab, ELexer.LF));
		this.interpret(next);
	} else if(indentCount===this.indents[this.indents.length-1]) {
		this.tokens.push(this.deriveToken(lftab, ELexer.LF));
		this.interpret(next);
	} else if(indentCount>this.indents[this.indents.length-1]) {
		this.tokens.push(this.deriveToken(lftab, ELexer.LF));
		this.tokens.push(this.deriveToken(lftab, ELexer.INDENT));
		this.indents.push(indentCount);
		this.interpret(next);
	} else {
		while(this.indents.length>1 && indentCount<this.indents[this.indents.length-1]) {
			this.tokens.push(this.deriveToken(lftab, ELexer.DEDENT));
			this.tokens.push(this.deriveToken(lftab, ELexer.LF));
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

EIndentingLexer.prototype.deriveToken = function(token, type) {
	var res = token.clone();
	res.type = type;
	return res;
};

EIndentingLexer.prototype.countIndents = function(text) {
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

EIndentingLexer.prototype.interpretAnyToken = function(token) {
	this.tokens.push(token);
};

exports.EIndentingLexer = EIndentingLexer;

