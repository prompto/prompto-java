var CSharpLiteral = require("./CSharpLiteral").CSharpLiteral;

function CSharpBooleanLiteral(text) {
    CSharpLiteral.call(this, text);
    return this;
}

CSharpBooleanLiteral.prototype = Object.create(CSharpLiteral.prototype);
CSharpBooleanLiteral.prototype.constructor = CSharpBooleanLiteral;

exports.CSharpBooleanLiteral = CSharpBooleanLiteral;
