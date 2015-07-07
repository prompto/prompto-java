var JavaScriptLiteral = require("./JavaScriptLiteral").JavaScriptLiteral;

function JavaScriptDecimalLiteral(text) {
	JavaScriptLiteral.call(this, text);
	return this;
}

JavaScriptDecimalLiteral.prototype = Object.create(JavaScriptLiteral.prototype);
JavaScriptDecimalLiteral.prototype.constructor = JavaScriptDecimalLiteral;

JavaScriptDecimalLiteral.prototype.check = function(context) {
	return DecimalType.instance;
};

JavaScriptDecimalLiteral.prototype.toString = function() {
	return this.value.toString();
};

exports.JavaScriptDecimalLiteral = JavaScriptDecimalLiteral;

