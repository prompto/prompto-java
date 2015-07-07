var JavaLiteral = require("./JavaLiteral").JavaLiteral;

function JavaIntegerLiteral(text) {
	JavaLiteral.call(this, text);
    return this;
}

JavaIntegerLiteral.prototype = Object.create(JavaLiteral.prototype);
JavaIntegerLiteral.prototype.constructor = JavaIntegerLiteral;

exports.JavaIntegerLiteral = JavaIntegerLiteral;

