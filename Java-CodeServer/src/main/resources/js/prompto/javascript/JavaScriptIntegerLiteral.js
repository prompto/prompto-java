var JavaScriptLiteral = require("./JavaScriptLiteral").JavaScriptLiteral;

function JavaScriptIntegerLiteral(text) {
	JavaScriptLiteral.call(this, text);
	return this;
}

JavaScriptIntegerLiteral.prototype = Object.create(JavaScriptLiteral.prototype);
JavaScriptIntegerLiteral.prototype.constructor = JavaScriptIntegerLiteral;

JavaScriptIntegerLiteral.prototype.check = function(context) {
	return IntegerType.instance;
};

JavaScriptIntegerLiteral.prototype.toString = function() {
	return this.value.toString();
};

exports.JavaScriptIntegerLiteral = JavaScriptIntegerLiteral;

