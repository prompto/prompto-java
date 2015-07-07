var ExecutionError = require("./ExecutionError").ExecutionError;

function IndexOutOfRangeError() {
	ExecutionError.call(this);
	return this;
}

IndexOutOfRangeError.prototype = Object.create(ExecutionError.prototype);
IndexOutOfRangeError.prototype.constructor = IndexOutOfRangeError;

IndexOutOfRangeError.prototype.getExpression = function(context) {
	return context.getRegisteredValue("INDEX_OUT_OF_RANGE");
};

exports.IndexOutOfRangeError = IndexOutOfRangeError;
