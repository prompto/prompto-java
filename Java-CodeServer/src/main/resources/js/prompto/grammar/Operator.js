function Operator(name, token) {
    this.name = name;
    this.token = token;
    return this;
}

Operator.prototype.toString = function() {
    return this.token;
};

Operator.prototype.toDialect = function(writer) {
    writer.append(this.token);
};

Operator.PLUS = new Operator("PLUS", "+");
Operator.MINUS = new Operator("MINUS", "-");
Operator.MULTIPLY = new Operator("MULTIPLY", "*");
Operator.DIVIDE = new Operator("DIVIDE", "/");
Operator.IDIVIDE = new Operator("IDIVIDE", "\\");
Operator.MODULO = new Operator("MODULO", "%");

exports.Operator = Operator;
