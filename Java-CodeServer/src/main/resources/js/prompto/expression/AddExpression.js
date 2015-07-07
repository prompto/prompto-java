var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Value = require("../value/Value").Value;

function AddExpression(left, right) {
	this.left = left;
	this.right = right;
	return this;
}

AddExpression.prototype.toString = function() {
	return this.left.toString() + " + " + this.right.toString();
};

AddExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" + ");
    this.right.toDialect(writer);
};


AddExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkAdd(context,rt, true);
};

AddExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
	return lval.Add(context, rval);
};

exports.AddExpression = AddExpression;

