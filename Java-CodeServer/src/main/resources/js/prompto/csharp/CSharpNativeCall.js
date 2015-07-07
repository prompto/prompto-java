var NativeCall = require("../statement/NativeCall").NativeCall;

function CSharpNativeCall(statement) {
	NativeCall.call(this);
	this.statement = statement;
	return this;
}

CSharpNativeCall.prototype = Object.create(NativeCall.prototype);
CSharpNativeCall.prototype.constructor = CSharpNativeCall;

CSharpNativeCall.prototype.toDialect = function(writer) {
    writer.append("C#: ");
    this.statement.toDialect(writer);
};


exports.CSharpNativeCall = CSharpNativeCall;
