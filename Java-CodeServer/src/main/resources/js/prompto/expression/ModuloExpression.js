var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Value = require("../value/Value").Value;

function ModuloExpression(left, right) {
	this.left = left;
	this.right = right;
	return this;
}

ModuloExpression.prototype.toString = function() {
	return this.left.toString() + " % " + this.right.toString();
};

ModuloExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" % ");
    this.right.toDialect(writer);
};

ModuloExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkModulo(context, rt);
};

ModuloExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
	return lval.Modulo(context, rval);
};

exports.ModuloExpression = ModuloExpression;
