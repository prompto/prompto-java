var Value = require("../value/Value").Value;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function MinusExpression(expression) {
	this.expression = expression;
	return this;
}

MinusExpression.prototype.toString = function() {
	return "-" + this.expression.toString();
};

MinusExpression.prototype.toDialect = function(writer) {
    writer.append("-");
    this.expression.toDialect(writer);
};

MinusExpression.prototype.check = function(context) {
	var type = this.expression.check(context);
	return type.checkMinus(context);
};

MinusExpression.prototype.interpret = function(context){
	var val = this.expression.interpret(context);
	return val.Minus(context);
};

exports.MinusExpression = MinusExpression;