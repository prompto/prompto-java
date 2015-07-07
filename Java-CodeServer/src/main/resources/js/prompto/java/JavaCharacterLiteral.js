var JavaLiteral = require("./JavaLiteral").JavaLiteral;

function JavaCharacterLiteral(text) {
    JavaLiteral.call(this, text);
    return this;
}

JavaCharacterLiteral.prototype = Object.create(JavaLiteral.prototype);
JavaCharacterLiteral.prototype.constructor = JavaCharacterLiteral;

exports.JavaCharacterLiteral = JavaCharacterLiteral;
