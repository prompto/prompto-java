var NativeCall = require("../statement/NativeCall").NativeCall;

function JavaScriptNativeCall(statement, module) {
	NativeCall.call(this);
	this.statement = statement;
	return this;
}

JavaScriptNativeCall.prototype = Object.create(NativeCall.prototype);
JavaScriptNativeCall.prototype.constructor = JavaScriptNativeCall;

JavaScriptNativeCall.prototype.toString = function() {
	return this.statement.toString();
};

JavaScriptNativeCall.prototype.check = function(context) {
	return this.statement.check(context);
};

JavaScriptNativeCall.prototype.interpret = function(context, returnType) {
	return this.statement.interpret(context, returnType);
};

JavaScriptNativeCall.prototype.toDialect = function(writer) {
    writer.append("JavaScript: ");
    this.statement.toDialect(writer);
};

exports.JavaScriptNativeCall = JavaScriptNativeCall;

