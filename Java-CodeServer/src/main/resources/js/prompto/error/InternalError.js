var PrestoError = require("./PrestoError").PrestoError;

function InternalError(message) {
	PrestoError.call(this, message);
	return this;
}

InternalError.prototype = Object.create(InternalError.prototype);
InternalError.prototype.constructor = InternalError;

exports.InternalError = InternalError;
