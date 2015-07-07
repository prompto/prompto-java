var Argument = require("./Argument").Argument;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var MethodType = require("../type/MethodType").MethodType;

function MethodArgument(name) {
	Argument.call(this, name);
	return this;
}

MethodArgument.prototype = Object.create(Argument.prototype);
MethodArgument.prototype.constructor = MethodArgument;

MethodArgument.prototype.getSignature = function(dialect) {
	return this.name;
};

MethodArgument.prototype.toString = function() {
	return this.name;
};

MethodArgument.prototype.getProto = function(context) {
	return this.name;
};

/*
@Override
public boolean equals(Object obj) {
	if(obj==this)
		return true;
	if(obj==null)
		return false;
	if(!(obj instanceof MethodArgument))
		return false;
	MethodArgument other = (MethodArgument)obj;
	return Utils.equal(this.getName(),other.getName());
}

*/

MethodArgument.prototype.register = function(context) {
	var actual = context.getRegisteredValue(this.name);
	if(actual!=null) {
		throw new SyntaxError("Duplicate argument: \"" + this.name + "\"");
	}
	context.registerValue(this);
};

MethodArgument.prototype.check = function(context) {
	var actual = context.getRegisteredDeclaration(this.name);
	if(actual==null) {
		throw new SyntaxError("Unknown method: \"" + this.name + "\"");
	}
};

MethodArgument.prototype.getType = function(context) {
	return new MethodType(context,this.name);
};

exports.MethodArgument = MethodArgument;
