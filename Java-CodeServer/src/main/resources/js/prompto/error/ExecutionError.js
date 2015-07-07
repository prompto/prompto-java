var PrestoError = require("./PrestoError").PrestoError;
var ErrorVariable = require("../runtime/ErrorVariable").ErrorVariable;

function ExecutionError(message) {
	PrestoError.call(this, message);
	return this;
}

ExecutionError.prototype = Object.create(PrestoError.prototype);
ExecutionError.prototype.constructor = ExecutionError;

ExecutionError.prototype.interpret = function(context, errorName) {
    var exp = this.getExpression(context);
    if(exp==null) {
        var args = new ArgumentAssignmentList();
        args.add(new ArgumentAssignment(new UnresolvedArgument("name"), new TextLiteral(this.getType().Name)));
        args.add(new ArgumentAssignment(new UnresolvedArgument("text"), new TextLiteral(this.message)));
        exp = new ConstructorExpression(new CategoryType("Error"), args);
    }
    if(context.getRegisteredValue(errorName)==null)
        context.registerValue(new ErrorVariable(errorName));
    var error = exp.interpret(context);
    context.setValue(errorName, error);
    return error;
};

exports.ExecutionError = ExecutionError;
