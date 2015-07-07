var Value = require("./Value").Value;

function ExpressionValue(type, value) {
	Value.call(this, type);
	this.value = value;
    // make this sliceable
    this.sliceable = value.slice ? value : null;
	return this;
}

ExpressionValue.prototype = Object.create(Value.prototype);
ExpressionValue.prototype.constructor = ExpressionValue;

ExpressionValue.prototype.check = function(context) {
	return this.type;
};

ExpressionValue.prototype.interpret = function(context) {
	if(this.value.interpret) {
		return this.value.interpret(context);
	} else {
		return this.value;
	}
};

ExpressionValue.prototype.toString = function() {
	return this.value.toString();
};

ExpressionValue.prototype.toDialect = function(dialect) {
	return this.value.toDialect(dialect);
};

exports.ExpressionValue = ExpressionValue;
