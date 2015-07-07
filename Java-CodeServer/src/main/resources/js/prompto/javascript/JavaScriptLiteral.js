function JavaScriptLiteral(text) {
    this.text = text;
    this.value = eval(text);
    return this;
}

JavaScriptLiteral.prototype.interpret = function(context) {
    return this.value;
};

JavaScriptLiteral.prototype.toString = function() {
    return this.text;
};

JavaScriptLiteral.prototype.toDialect = function(writer) {
    writer.append(this.text);
};

exports.JavaScriptLiteral = JavaScriptLiteral;
