var PythonLiteral = require("./PythonLiteral").PythonLiteral;

function PythonCharacterLiteral(text) {
	PythonLiteral.call(this, text);
	return this;
}

PythonCharacterLiteral.prototype = Object.create(PythonLiteral.prototype);
PythonCharacterLiteral.prototype.constructor = PythonCharacterLiteral;

exports.PythonCharacterLiteral = PythonCharacterLiteral;
