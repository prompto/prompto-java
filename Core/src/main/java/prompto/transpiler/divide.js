function divide( a, b ) {
    if(b===0)
        throw new DivideByZeroError();
    else
        return a / b;
}


function DivideByZeroError(message) {
    if (!Error.captureStackTrace)
      this.stack = (new Error()).stack;
    else
      Error.captureStackTrace(this, this.constructor);
    this.message = message;
    init && init.apply(this, arguments);
    return this;
}
DivideByZeroError.prototype = new Error();
DivideByZeroError.prototype.name = "DivideByZeroError";
DivideByZeroError.prototype.promptoName = "DIVIDE_BY_ZERO";
DivideByZeroError.prototype.constructor = DivideByZeroError;
DivideByZeroError.prototype.toString = function() {
	return this.message;
};
DivideByZeroError.prototype.getText = function() {
	return this.message;
};