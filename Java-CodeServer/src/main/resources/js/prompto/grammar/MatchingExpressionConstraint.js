var InvalidDataError = require("../error/InvalidDataError").InvalidDataError;
var TransientVariable = require("../runtime/TransientVariable").TransientVariable;
var AnyType = require("../type/AnyType").AnyType;

function MatchingExpressionConstraint(expression) {
	this.expression = expression;
	return this;
}

MatchingExpressionConstraint.prototype.checkValue = function(context, value) {
	var child = context.newChildContext();
	child.registerValue(new TransientVariable("value", AnyType.instance));
	child.setValue("value", value);
	var test = this.expression.interpret(child);
	if(!test.value) {
		throw new InvalidDataError((value == null ? "null" : value.toString()) + " does not match:" + this.expression.toString());
	}
};

MatchingExpressionConstraint.prototype.toDialect = function(writer) {
    writer.append(" matching ");
    this.expression.toDialect(writer);
}

exports.MatchingExpressionConstraint = MatchingExpressionConstraint;

