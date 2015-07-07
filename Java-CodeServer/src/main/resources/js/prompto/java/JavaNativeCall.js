var NativeCall = require("../statement/NativeCall").NativeCall;

function JavaNativeCall(statement) {
	NativeCall.call(this);
	this.statement = statement;
	return this;
}

JavaNativeCall.prototype = Object.create(NativeCall.prototype);
JavaNativeCall.prototype.constructor = JavaNativeCall;

JavaNativeCall.prototype.toDialect = function(writer) {
    writer.append("Java: ");
    this.statement.toDialect(writer);
};

exports.JavaNativeCall = JavaNativeCall;

