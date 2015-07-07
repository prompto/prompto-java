var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var VoidType = require("../type/VoidType").VoidType;

function NativeCall() {
	SimpleStatement.call(this);
	return this;
}
	
NativeCall.prototype = Object.create(SimpleStatement.prototype);
NativeCall.prototype.constructor = NativeCall;

NativeCall.prototype.toString = function() {
	return this.statement.toString();
};

NativeCall.prototype.check = function(context) {
	return VoidType.instance;
};

exports.NativeCall = NativeCall;
