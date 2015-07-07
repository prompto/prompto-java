var ExecutionError = require("./ExecutionError").ExecutionError;

function NullReferenceError() {
	ExecutionError.call(this);
	return this;
}

NullReferenceError.prototype = Object.create(ExecutionError.prototype);
NullReferenceError.prototype.constructor = NullReferenceError;

NullReferenceError.prototype.getExpression = function(context) {
	return context.getRegisteredValue("NULL_REFERENCE");
};

exports.NullReferenceError = NullReferenceError;
