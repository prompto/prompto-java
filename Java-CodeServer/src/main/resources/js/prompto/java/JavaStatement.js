function JavaStatement(expression, isReturn) {
	this.expression = expression;
	this.isReturn = isReturn || false;
	return this;
}

JavaStatement.prototype.toString = function() {
	return "" + (this.isReturn ? "return " : "") + this.expression.toString() + ";";
};

JavaStatement.prototype.toDialect = function(writer) {
    if(this.isReturn)
        writer.append("return ");
    this.expression.toDialect(writer);
    writer.append(';');
};

exports.JavaStatement = JavaStatement;
