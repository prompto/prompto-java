function divide( a, b ) {
    if(b===0)
        throw new DivideByZeroError();
    else
        return a / b;
}

function DivideByZeroError() {
    if (!Error.captureStackTrace)
      this.stack = (new Error()).stack;
    else
      Error.captureStackTrace(this, this.constructor);
    return this;
}
DivideByZeroError.prototype = Object.create(Error.prototype);
DivideByZeroError.prototype.constructor = DivideByZeroError;
DivideByZeroError.prototype.message = "Divide by zero!";
DivideByZeroError.prototype.name = "DivideByZeroError";
DivideByZeroError.prototype.promptoName = "DIVIDE_BY_ZERO";
DivideByZeroError.prototype.toString = function() {
	return this.message;
};
DivideByZeroError.prototype.getText = function() {
	return this.message;
};
