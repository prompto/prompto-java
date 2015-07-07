var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Value = require("../value/Value").Value;

function MultiplyExpression(left, right) {
	this.left = left;
	this.right = right;
	return this;
}

MultiplyExpression.prototype.toString = function() {
	return this.left.toString() + " * " + this.right.toString();
};

MultiplyExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" * ");
    this.right.toDialect(writer);
};


MultiplyExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkMultiply(context,rt, true);
};

MultiplyExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
	return lval.Multiply(context, rval);
};

exports.MultiplyExpression = MultiplyExpression;
