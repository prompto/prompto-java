function PythonNamedArgument(name, expression) {
    this.name = name;
    this.expression = expression;
    return this;
}

PythonNamedArgument.prototype.toDialect = function(writer) {
    writer.append(this.name);
    writer.append(" = ");
    this.expression.toDialect(writer);
};

exports.PythonNamedArgument = PythonNamedArgument;
