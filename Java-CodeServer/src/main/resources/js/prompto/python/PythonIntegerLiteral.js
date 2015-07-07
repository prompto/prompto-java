var PythonLiteral = require("./PythonLiteral").PythonLiteral;

function PythonIntegerLiteral(text) {
    PythonLiteral.call(this, text);
    return this;
}

PythonIntegerLiteral.prototype = Object.create(PythonLiteral.prototype);
PythonIntegerLiteral.prototype.constructor = PythonIntegerLiteral;

exports.PythonIntegerLiteral = PythonIntegerLiteral;
