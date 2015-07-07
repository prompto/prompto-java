var SyntaxError = require("../error/SyntaxError").SyntaxError;
var CodeWriter = require("../utils/CodeWriter").CodeWriter;
var Dialect = require("../parser/Dialect").Dialect;
var Value = require("../value/Value").Value;
var Bool = require("../value/Bool").Bool;

function NotExpression(expression) {
	this.expression = expression;
	return this;
}

NotExpression.prototype.toString = function() {
    return "not " + this.expression.toString();
};

NotExpression.prototype.operatorToDialect = function(dialect) {
    switch(dialect) {
        case Dialect.E:
        case Dialect.S:
            return "not ";
        case Dialect.O:
            return "! ";
        default:
            throw new Exception("Unsupported: " + dialect.name);
    }
};

NotExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
    this.expression.toDialect(writer);
};

NotExpression.prototype.toEDialect = function(writer) {
    writer.append("not ");
};

NotExpression.prototype.toSDialect = function(writer) {
    writer.append("not ");
};

NotExpression.prototype.toODialect = function(writer) {
    writer.append("!");
};


NotExpression.prototype.check = function(context) {
	var type = this.expression.check(context);
	return type.checkNot(context);
};

NotExpression.prototype.interpret = function(context) {
	var val = this.expression.interpret(context);
	return val.Not();
};

NotExpression.prototype.interpretAssert = function(context, test) {
    var result = this.interpret(context);
    if(result==Bool.TRUE)
        return true;
    var writer = new CodeWriter(test.dialect, context);
    this.toDialect(writer);
    var expected = writer.toString();
    var actual = this.operatorToDialect(test.dialect) + val.toString();
    test.printFailure(context, expected, actual);
    return false;
};

exports.NotExpression = NotExpression;
