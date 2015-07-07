var SyntaxError = require("../error/SyntaxError").SyntaxError;

function CastExpression(expression, type) {
    this.expression = expression;
    this.type = type;
    return this;
}

CastExpression.prototype.check = function(context) {
    var actual = this.expression.check(context);
    if(!this.type.isAssignableTo(context, actual))
        throw new SyntaxError("Cannot cast " + actual.toString() + " to " + type.toString());
    return this.type;
};

CastExpression.prototype.interpret = function(context) {
    return this.expression.interpret(context);
};

CastExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

CastExpression.prototype.toEDialect = function(writer) {
    this.expression.toDialect(writer);
    writer.append(" as ");
    this.type.toDialect(writer);
};

CastExpression.prototype.toSDialect = function(writer) {
    this.toEDialect(writer);
};

CastExpression.prototype.toODialect = function(writer) {
    writer.append("(");
    this.type.toDialect(writer);
    writer.append(")");
    this.expression.toDialect(writer);
};

exports.CastExpression = CastExpression;
