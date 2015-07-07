var CSharpLiteral = require("./CSharpLiteral").CSharpLiteral;

function CSharpCharacterLiteral(text) {
    CSharpLiteral.call(this, text);
    return this;
}

CSharpCharacterLiteral.prototype = Object.create(CSharpLiteral.prototype);
CSharpCharacterLiteral.prototype.constructor = CSharpCharacterLiteral;

exports.CSharpCharacterLiteral = CSharpCharacterLiteral;
