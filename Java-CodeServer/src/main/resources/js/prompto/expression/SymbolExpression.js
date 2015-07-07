var SyntaxError = require("../error/SyntaxError").SyntaxError;

function SymbolExpression(name) {
	this.name = name;
	return this;
}

SymbolExpression.prototype.toDialect = function(writer) {
    writer.append(this.name);
};

SymbolExpression.prototype.check = function(context) {
	var symbol = context.getRegisteredValue(this.name);
	if(symbol==null) {
		throw new SyntaxError("Unknown symbol:" + this.name);
	}
	return symbol.check(context);
};

SymbolExpression.prototype.interpret = function(context) {
	var symbol = context.getRegisteredValue(this.name);
	if(symbol==null) {
		throw new SyntaxError("Unknown symbol:" + this.name);
	}
	return symbol.interpret(context);
};

exports.SymbolExpression = SymbolExpression;