var JavaLiteral = require("./JavaLiteral").JavaLiteral;

function JavaDecimalLiteral(text) {
	JavaLiteral.call(this, text);
    return this;
}

JavaDecimalLiteral.prototype = Object.create(JavaLiteral.prototype);
JavaDecimalLiteral.prototype.constructor = JavaDecimalLiteral;

exports.JavaDecimalLiteral = JavaDecimalLiteral;

