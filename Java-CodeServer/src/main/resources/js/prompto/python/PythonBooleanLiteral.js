var PythonLiteral = require("./PythonLiteral").PythonLiteral;

function PythonBooleanLiteral(text) {
    PythonLiteral.call(this, text);
    return this;
}

PythonBooleanLiteral.prototype = Object.create(PythonLiteral.prototype);
PythonBooleanLiteral.prototype.constructor = PythonBooleanLiteral;

exports.PythonBooleanLiteral = PythonBooleanLiteral;
