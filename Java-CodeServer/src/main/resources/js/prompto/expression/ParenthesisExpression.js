function ParenthesisExpression(expression) {
	this.expression = expression;
	return this;
};

ParenthesisExpression.prototype.toString = function() {
	return "(" + this.expression.toString() + ")";
};

ParenthesisExpression.prototype.toDialect = function(writer) {
    writer.append("(");
    this.expression.toDialect(writer);
    writer.append(")");
};

ParenthesisExpression.prototype.check = function(context) {
	return this.expression.check(context);
};

ParenthesisExpression.prototype.interpret = function(context) {
	return this.expression.interpret(context);
};

exports.ParenthesisExpression = ParenthesisExpression;
