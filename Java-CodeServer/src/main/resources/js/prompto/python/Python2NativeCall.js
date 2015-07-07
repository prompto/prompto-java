var PythonNativeCall = require("./PythonNativeCall").PythonNativeCall;

function Python2NativeCall(statement, module) {
	PythonNativeCall.call(this, statement, module);
	return this;
}

Python2NativeCall.prototype = Object.create(PythonNativeCall.prototype);
Python2NativeCall.prototype.constructor = Python2NativeCall;

Python2NativeCall.prototype.toDialect = function(writer) {
    writer.append("Python2: ");
    PythonNativeCall.prototype.toDialect.call(this, writer);
};

exports.Python2NativeCall = Python2NativeCall;