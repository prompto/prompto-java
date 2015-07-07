function CSharpStatement(expression, isReturn) {
	this.expression = expression;
	this.isReturn = isReturn;
	return this;
}

CSharpStatement.prototype.toString = function() {
	return "" + (this.isReturn ? "return " : "") + this.expression.toString() + ";";
};

CSharpStatement.prototype.toDialect = function(writer) {
    if(this.isReturn)
        writer.append("return ");
    this.expression.toDialect(writer);
    writer.append(';');
};

exports.CSharpStatement = CSharpStatement;
