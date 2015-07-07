var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Value = require("../value/Value").Value;
var Bool = require("../value/Bool").Bool;
var CmpOp = require("../grammar/CmpOp").CmpOp;

function CompareExpression(left, operator, right) {
	this.left = left;
	this.operator = operator;
	this.right = right;
	return this;
}

CompareExpression.prototype.toString = function() {
	return this.left.toString() + " " + this.operator.toString() + " " + this.right.toString();
};

CompareExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" ");
    this.operator.toDialect(writer);
    writer.append(" ");
    this.right.toDialect(writer);
};

CompareExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkCompare(context,rt);
};

CompareExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
	return this.compare(context, lval, rval);
};

CompareExpression.prototype.compare = function(context, lval, rval) {
	var cmp = lval.CompareTo(context, rval);
	switch (this.operator) {
		case CmpOp.GT:
			return Bool.ValueOf(cmp > 0);
		case CmpOp.LT:
			return Bool.ValueOf(cmp < 0);
		case CmpOp.GTE:
			return Bool.ValueOf(cmp >= 0);
		case CmpOp.LTE:
			return Bool.ValueOf(cmp <= 0);
		default:
			throw new SyntaxError("Illegal operand: " + this.operator.toString());
	}
};


CompareExpression.prototype.interpretAssert = function(context, test) {
    var lval = this.left.interpret(context);
    var rval = this.right.interpret(context);
    var result = this.compare(context, lval, rval);
    if(result==Bool.TRUE)
        return true;
    var writer = new CodeWriter(test.dialect, context);
    this.toDialect(writer);
    var expected = writer.toString();
    var actual = lval.toString() + this.operator.toString() + rval.toString();
    test.printFailure(context, expected, actual);
    return false;
};

exports.CompareExpression = CompareExpression;