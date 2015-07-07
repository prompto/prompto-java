var Value = require("./Value").Value;

function ContextualExpression(calling, expression) {
	Value.call(this, null); // TODO check that this is not a problem
	this.calling = calling;
	this.expression = expression;
	return this;
}

ContextualExpression.prototype = Object.create(Value.prototype);
ContextualExpression.prototype.constructor = ContextualExpression;

ContextualExpression.prototype.toDialect = function(dialect) {
	return this.expression.toDialect(dialect);
};

ContextualExpression.prototype.check = function(context) {
	return this.expression.check(this.calling);
};

ContextualExpression.prototype.interpret = function(context) {
	return this.expression.interpret(this.calling);
};

exports.ContextualExpression = ContextualExpression;