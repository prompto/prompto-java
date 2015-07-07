var SyntaxError = require("../error/SyntaxError").SyntaxError;
var CodeWriter = require("../utils/CodeWriter").CodeWriter;
var Dialect = require("../parser/Dialect").Dialect;
var Value = require("../value/Value").Value;
var Bool = require("../value/Bool").Bool;

function OrExpression(left, right) {
	this.left = left;
	this.right = right;
	return this;
}

OrExpression.prototype.toString = function() {
    return this.left.toString() + " or " + this.right.toString();
};

OrExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

OrExpression.prototype.operatorToDialect = function(dialect) {
    switch(dialect) {
        case Dialect.E:
        case Dialect.S:
            return " or ";
        case Dialect.O:
            return " || ";
        default:
            throw new Exception("Unsupported: " + dialect.name);
    }
};

OrExpression.prototype.toEDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(this.operatorToDialect(writer.dialect));
    this.right.toDialect(writer);
};

OrExpression.prototype.toODialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(this.operatorToDialect(writer.dialect));
    this.right.toDialect(writer);
};

OrExpression.prototype.toSDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(this.operatorToDialect(writer.dialect));
    this.right.toDialect(writer);
};

OrExpression.prototype.check = function(context) {
	var lt = this.left.check(context);
	var rt = this.right.check(context);
	return lt.checkOr(context, rt);
};

OrExpression.prototype.interpret = function(context) {
	var lval = this.left.interpret(context);
	var rval = this.right.interpret(context);
	return lval.Or(rval);
};

OrExpression.prototype.interpretAssert = function(context, test) {
    var lval = this.left.interpret(context);
    var rval = this.right.interpret(context);
    var result = lval.Or(rval);
    if(result==Bool.TRUE)
        return true;
    var writer = new CodeWriter(test.dialect, context);
    this.toDialect(writer);
    var expected = writer.toString();
    var actual = lval.toString() + this.operatorToDialect(test.dialect) + rval.toString();
    test.printFailure(context, expected, actual);
    return false;
};

exports.OrExpression = OrExpression;

