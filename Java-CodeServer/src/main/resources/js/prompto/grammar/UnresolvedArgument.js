var SyntaxError = require("../error/SyntaxError").SyntaxError;
var AttributeDeclaration = require("../declaration/AttributeDeclaration").AttributeDeclaration;
var AttributeArgument = require("./AttributeArgument").AttributeArgument;
var MethodDeclarationMap = require("../runtime/Context").MethodDeclarationMap;
var MethodArgument = require("./MethodArgument").MethodArgument;

function UnresolvedArgument(name) {
	this.name = name;
	this.resolved = null;
	return this;
}

/*
@Override
public String getSignature(Dialect dialect) {
	return getName();
}

@Override
public String getName() {
	return name;
}

@Override
public String toString() {
	return name;
}
*/

UnresolvedArgument.prototype.toDialect = function(writer) {
    writer.append(this.name);
};

UnresolvedArgument.prototype.check = function(context) {
	this.resolveAndCheck(context);
};

UnresolvedArgument.prototype.getProto = function(context) {
	this.resolveAndCheck(context);
	return this.resolved.getProto(context);
};

UnresolvedArgument.prototype.getType = function(context) {
	this.resolveAndCheck(context);
	return this.resolved.getType(context);
};

UnresolvedArgument.prototype.register = function(context) {
	this.resolveAndCheck(context);
	this.resolved.register(context);
    if(this.defaultExpression!=null)
        context.setValue(this.name, this.defaultExpression.interpret(context));
};

UnresolvedArgument.prototype.checkValue = function(context, value) {
	this.resolveAndCheck(context);
	return this.resolved.checkValue(context, value);
}

UnresolvedArgument.prototype.resolveAndCheck = function(context) {
	if(this.resolved!=null) {
		return;
	}
	var named = context.getRegisteredDeclaration(this.name);
	if(named instanceof AttributeDeclaration) {
		this.resolved = new AttributeArgument(this.name);
	} else if(named instanceof MethodDeclarationMap) {
		this.resolved = new MethodArgument(this.name);
	} else {
		throw new SyntaxError("Unknown identifier:" + this.name);
	}
};

exports.UnresolvedArgument = UnresolvedArgument;

