var PrestoError = require("./PrestoError").PrestoError;

function SyntaxError(message) {
	PrestoError.call(this, message);
	return this;
}

SyntaxError.prototype = Object.create(PrestoError.prototype);
SyntaxError.prototype.constructor = SyntaxError;

exports.SyntaxError = SyntaxError;

