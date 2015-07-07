var NativeCall = require("../statement/NativeCall").NativeCall;

function PythonNativeCall(statement) {
	NativeCall.call(this);
	this.statement = statement;
	return this;
}

PythonNativeCall.prototype = Object.create(NativeCall.prototype);
PythonNativeCall.prototype.constructor = PythonNativeCall;

PythonNativeCall.prototype.toDialect = function(writer) {
    this.statement.toDialect(writer);
}

exports.PythonNativeCall = PythonNativeCall;
