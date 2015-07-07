var CSharpLiteral = require("./CSharpLiteral").CSharpLiteral;

function CSharpIntegerLiteral(text) {
    CSharpLiteral.call(this, text);
    return this;
}

CSharpIntegerLiteral.prototype = Object.create(CSharpLiteral.prototype);
CSharpIntegerLiteral.prototype.constructor = CSharpIntegerLiteral;

exports.CSharpIntegerLiteral = CSharpIntegerLiteral;
