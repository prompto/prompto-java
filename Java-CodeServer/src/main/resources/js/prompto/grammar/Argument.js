function Argument(name) {
	this.name = name;
    this.mutable = false;
    this.defaultExpression = null;
	return this;
}

Argument.prototype.checkValue = function(context, expression) {
	return expression.interpret(context);
};

Argument.prototype.toDialect = function(writer) {
    if(this.mutable)
        writer.append("mutable ");
    writer.toDialect(this);
    if(this.defaultExpression!=null) {
        writer.append(" = ");
        this.defaultExpression.toDialect(writer);
    }
};

exports.Argument = Argument;
