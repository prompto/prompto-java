var PythonNativeCall = require("./PythonNativeCall").PythonNativeCall;

function Python3NativeCall(statement, module) {
	PythonNativeCall.call(this, statement, module);
	return this;
}

Python3NativeCall.prototype = Object.create(PythonNativeCall.prototype);
Python3NativeCall.prototype.constructor = Python3NativeCall;

Python3NativeCall.prototype.toDialect = function(writer) {
    writer.append("Python3: ");
    PythonNativeCall.prototype.toDialect.call(this, writer);
};


exports.Python3NativeCall = Python3NativeCall;