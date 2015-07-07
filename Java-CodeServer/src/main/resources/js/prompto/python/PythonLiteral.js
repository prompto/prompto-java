function PythonLiteral(text) {
    this.text = text;
    return this;
}

PythonLiteral.prototype.toString = function() {
    return this.text;
};

PythonLiteral.prototype.toDialect = function(writer) {
    writer.append(this.text);
};

exports.PythonLiteral = PythonLiteral;