function PythonOrdinalArgument(expression) {
    this.expression = expression;
    return this;
}

PythonOrdinalArgument.prototype.toDialect = function(writer) {
    this.expression.toDialect(writer);
};

exports.PythonOrdinalArgument = PythonOrdinalArgument;
