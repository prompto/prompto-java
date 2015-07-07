var Argument = require("./Argument").Argument;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function AttributeArgument(name) {
	Argument.call(this, name);
	return this;
}

AttributeArgument.prototype = Object.create(Argument.prototype);
AttributeArgument.prototype.constructor = AttributeArgument;

/*
@Override
public String getSignature(Dialect dialect) {
	return getName();
}
*/

AttributeArgument.prototype.toString = function() {
	return this.name;
};

AttributeArgument.prototype.getProto = function(context) {
	return this.name;
};

/*
@Override
public boolean equals(Object obj) {
	if(obj==this)
		return true;
	if(obj==null)
		return false;
	if(!(obj instanceof AttributeArgument))
		return false;
	AttributeArgument other = (AttributeArgument)obj;
	return Utils.equal(this.getName(),other.getName());
}

*/

AttributeArgument.prototype.register = function(context) {
	context.registerValue(this, true);
    if(this.defaultExpression!=null) try {
        context.setValue(name, this.defaultExpression.interpret(context));
    } catch(error) {
        throw new SyntaxError("Unable to register default value: "+ this.defaultExpression.toString() + " for argument: " + name);
    }
};

AttributeArgument.prototype.check = function(context) {
	var actual = context.getRegisteredDeclaration(this.name);
	if(actual==null)
		throw new SyntaxError("Unknown attribute: \"" + this.name + "\"");
};

AttributeArgument.prototype.getType = function(context) {
	var named = context.getRegisteredDeclaration(this.name);
	return named.getType(context);
};

AttributeArgument.prototype.checkValue = function(context, value) {
	var actual = context.getRegisteredDeclaration(this.name);
	return actual.checkValue(context,value);
};

exports.AttributeArgument = AttributeArgument;