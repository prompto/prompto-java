var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Value = require("../value/Value").Value;

function SubtractExpression(left, right) {
	this.left = left;
	this.right = right;
	return this;
}

SubtractExpression.prototype.toString = function() {
	return this.left.toString() + " - " + this.right.toString();
};

SubtractExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" - ");
    this.right.toDialect(writer);
};



SubtractExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkSubstract(context,rt);
};

SubtractExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
    return lval.Subtract(context, rval);
};

exports.SubtractExpression = SubtractExpression;



