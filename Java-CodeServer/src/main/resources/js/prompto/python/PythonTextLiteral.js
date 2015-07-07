var PythonLiteral = require("./PythonLiteral").PythonLiteral;

function PythonTextLiteral(text) {
	PythonLiteral.call(this, text);
	return this;
}

PythonTextLiteral.prototype = Object.create(PythonLiteral.prototype);
PythonTextLiteral.prototype.constructor = PythonTextLiteral;

exports.PythonTextLiteral = PythonTextLiteral;
