var AbstractMethodDeclaration = require("./AbstractMethodDeclaration").AbstractMethodDeclaration;

function ClosureDeclaration(closure) {
    AbstractMethodDeclaration.call(this, closure.method.name, closure.method.args, closure.method.returnType);
	this.closure = closure;
	return this;
}

ClosureDeclaration.prototype = Object.create(AbstractMethodDeclaration.prototype);
ClosureDeclaration.prototype.constructor = ClosureDeclaration;

ClosureDeclaration.prototype.interpret = function(context) {
	return this.closure.interpret(context);
};

exports.ClosureDeclaration = ClosureDeclaration;
