var ExecutionError = require("./ExecutionError").ExecutionError;

function NotMutableError() {
	ExecutionError.call(this);
	return this;
}

NotMutableError.prototype = Object.create(ExecutionError.prototype);
NotMutableError.prototype.constructor = NotMutableError;

NotMutableError.prototype.getExpression = function(context) {
	return context.getRegisteredValue("NOT_MUTABLE");
};

exports.NotMutableError = NotMutableError;
