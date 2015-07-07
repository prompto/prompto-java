function Literal(text, value) {
	this.text = text;
	this.value = value;
	return this;
}
	
Literal.prototype.toDialect = function(writer) {
    writer.append(this.text);
};

Literal.prototype.toString = function() {
	return this.text;
};

Literal.prototype.getValue = function() {
	return this.value;
};

Literal.prototype.interpret = function(context) {
	return this.value;
};

exports.Literal = Literal;
