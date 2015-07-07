var JavaLiteral = require("./JavaLiteral").JavaLiteral;

function JavaTextLiteral(text) {
	JavaLiteral.call(this, text);
	return this;
}

JavaTextLiteral.prototype = Object.create(JavaLiteral.prototype);
JavaTextLiteral.prototype.constructor = JavaTextLiteral;

exports.JavaTextLiteral = JavaTextLiteral;
