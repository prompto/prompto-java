var CSharpLiteral = require("./CSharpLiteral").CSharpLiteral;

function CSharpDecimalLiteral(text) {
    CSharpLiteral.call(this, text);
    return this;
}

CSharpDecimalLiteral.prototype = Object.create(CSharpLiteral.prototype);
CSharpDecimalLiteral.prototype.constructor = CSharpDecimalLiteral;

exports.CSharpDecimalLiteral = CSharpDecimalLiteral;
