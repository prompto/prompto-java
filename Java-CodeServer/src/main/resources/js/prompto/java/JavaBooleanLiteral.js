var JavaLiteral = require("./JavaLiteral").JavaLiteral;

function JavaBooleanLiteral(text) {
	JavaLiteral.call(this, text);
	return this;
}

JavaBooleanLiteral.prototype = Object.create(JavaLiteral.prototype);
JavaBooleanLiteral.prototype.constructor = JavaBooleanLiteral;

exports.JavaBooleanLiteral = JavaBooleanLiteral;
