var CodeType = require("../type/CodeType").CodeType;

function CodeExpression(expression) {
	this.expression = expression;
	return this;
}

CodeExpression.prototype.toString = function() {
	return "Code: " + this.expression.toString();
};

CodeExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

CodeExpression.prototype.toEDialect = function(writer) {
    writer.append("Code: ");
    this.expression.toDialect(writer);
};

CodeExpression.prototype.toODialect = function(writer) {
    writer.append("Code(");
    this.expression.toDialect(writer);
    writer.append(")");
};

CodeExpression.prototype.toSDialect = function(writer) {
    this.toODialect(writer);
};

CodeExpression.prototype.check = function(context) {
	return CodeType.instance;
};

CodeExpression.prototype.interpret = function(context) {
	return this;
};

// expression can only be checked and evaluated in the context of an execute:

CodeExpression.prototype.checkCode = function(context) {
	return this.expression.check(context);
};

CodeExpression.prototype.interpretCode = function(context) {
	return this.expression.interpret(context);
};
	

exports.CodeExpression = CodeExpression;