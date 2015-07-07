var PythonLiteral = require("./PythonLiteral").PythonLiteral;

function PythonDecimalLiteral(text) {
    PythonLiteral.call(this, text);
    return this;
}

PythonDecimalLiteral.prototype = Object.create(PythonLiteral.prototype);
PythonDecimalLiteral.prototype.constructor = PythonDecimalLiteral;

exports.PythonDecimalLiteral = PythonDecimalLiteral;
