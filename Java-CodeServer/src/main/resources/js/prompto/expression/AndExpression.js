var SyntaxError = require("../error/SyntaxError").SyntaxError;
var CodeWriter = require("../utils/CodeWriter").CodeWriter;
var Dialect = require("../parser/Dialect").Dialect;
var Value = require("../value/Value").Value;
var Bool = require("../value/Bool").Bool;

function AndExpression(left, right) {
	this.left = left;
	this.right = right;
	return this;
}

AndExpression.prototype.toString = function() {
	return this.left.toString() + " and " + this.right.toString();
};

AndExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

AndExpression.prototype.operatorToDialect = function(dialect) {
    switch(dialect) {
        case Dialect.E:
        case Dialect.S:
            return " and ";
        case Dialect.O:
            return " && ";
        default:
            throw new Exception("Unsupported: " + dialect.name);
    }
};

AndExpression.prototype.toEDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" and ");
    this.right.toDialect(writer);
};

AndExpression.prototype.toODialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" && ");
    this.right.toDialect(writer);
};

AndExpression.prototype.toSDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" and ");
    this.right.toDialect(writer);
};


AndExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkAnd(context, rt);
};

AndExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
	return lval.And(rval);
};

AndExpression.prototype.interpretAssert = function(context, test) {
    var lval = this.left.interpret(context);
    var rval = this.right.interpret(context);
    var result = lval.And(rval);
    if(result==Bool.TRUE)
        return true;
    var writer = new CodeWriter(test.dialect, context);
    this.toDialect(writer);
    var expected = writer.toString();
    var actual = lval.toString() + this.operatorToDialect(test.dialect) + rval.toString();
    test.printFailure(context, expected, actual);
    return false;
};

exports.AndExpression = AndExpression;

