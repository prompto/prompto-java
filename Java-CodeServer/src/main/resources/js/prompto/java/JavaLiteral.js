JavaLiteral = function(text) {
    this.text = text;
    return this;
};

JavaLiteral.prototype.toString = function() {
    return this.text;
};

JavaLiteral.prototype.toDialect = function(writer) {
    writer.append(this.text);
};


exports.JavaLiteral = JavaLiteral