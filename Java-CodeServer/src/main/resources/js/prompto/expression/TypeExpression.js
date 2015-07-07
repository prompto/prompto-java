var TypeValue = require("../value/TypeValue").TypeValue;

function TypeExpression(value) {
	this.value = value;
	return this;
}

TypeExpression.prototype.toDialect = function(writer) {
    writer.append(this.value.toString());
};

TypeExpression.prototype.check = function(context) {
	return this.value;
};

TypeExpression.prototype.toString = function() {
    return this.value.toString();
};

TypeExpression.prototype.interpret = function(context) {
	return new TypeValue(this.value);
};

TypeExpression.prototype.getMember = function(context, name) {
	return this.value.getMember(context, name);
};

exports.TypeExpression = TypeExpression;