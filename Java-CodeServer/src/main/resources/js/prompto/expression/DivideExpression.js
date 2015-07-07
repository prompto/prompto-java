var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Value = require("../value/Value").Value;

function DivideExpression(left, right) {
	this.left = left;
	this.right = right;
	return this;
}

DivideExpression.prototype.toString = function() {
	return this.left.toString() + " / " + this.right.toString();
};

DivideExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" / ");
    this.right.toDialect(writer);
};


DivideExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkDivide(context,rt);
};

DivideExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
	return lval.Divide(context, rval);
};


exports.DivideExpression = DivideExpression;