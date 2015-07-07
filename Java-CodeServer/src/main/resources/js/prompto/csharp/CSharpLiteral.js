function CSharpLiteral(text) {
    this.text = text;
    return this;
}


CSharpLiteral.prototype.toDialect = function(writer) {
    return writer.append(this.text);
};


exports.CSharpLiteral = CSharpLiteral;
