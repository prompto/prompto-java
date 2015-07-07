var ExecutionError = require("./ExecutionError").ExecutionError;
var TextLiteral = require("../literal/TextLiteral").TextLiteral;

function InvalidResourceError(message) {
	ExecutionError.call(this, message);
	return this;
}

InvalidResourceError.prototype = Object.create(ExecutionError.prototype);
InvalidResourceError.prototype.constructor = InvalidResourceError;

InvalidResourceError.prototype.getExpression = function(context) {
	return new TextLiteral(this.message);
};

exports.InvalidResourceError = InvalidResourceError;
