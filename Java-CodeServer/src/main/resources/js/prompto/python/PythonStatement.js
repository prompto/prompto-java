function PythonStatement(expression, isReturn) {
	this.expression = expression;
	this.isReturn = isReturn;
    this.module = null;
	return this;
}

PythonStatement.prototype.toString = function() {
	return "" + (this.isReturn ? "return " : "") + this.expression.toString() + ";";
};

PythonStatement.prototype.toDialect = function(writer) {
    if(this.isReturn)
        writer.append("return ");
    this.expression.toDialect(writer);
    if(this.module!=null)
        this.module.toDialect(writer);
};

exports.PythonStatement = PythonStatement;