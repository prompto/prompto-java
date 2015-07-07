var ExecutionError = require("./ExecutionError").ExecutionError;
var TextLiteral = require("../literal/TextLiteral").TextLiteral;

function InvalidDataError(message) {
	ExecutionError.call(this, message);
	return this;
}

InvalidDataError.prototype = Object.create(ExecutionError.prototype);
InvalidDataError.prototype.constructor = InvalidDataError;

InvalidDataError.prototype.getExpression = function(context) {
	return new TextLiteral("'" + this.message + "'");
};

exports.InvalidDataError = InvalidDataError;
