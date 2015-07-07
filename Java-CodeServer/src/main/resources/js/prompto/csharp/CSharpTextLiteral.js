var CSharpLiteral = require("./CSharpLiteral").CSharpLiteral;

function CSharpTextLiteral(text) {
	CSharpLiteral.call(this, text);
	return this;
}

CSharpTextLiteral.prototype = Object.create(CSharpLiteral.prototype);
CSharpTextLiteral.prototype.constructor = CSharpTextLiteral;

exports.CSharpTextLiteral = CSharpTextLiteral;
