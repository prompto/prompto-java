var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Variable = require("../runtime/Variable").Variable;
var LinkedVariable = require("../runtime/LinkedVariable").LinkedVariable;
var Argument = require("../grammar/Argument").Argument;
var Dialect = require("../parser/Dialect").Dialect;
var CategoryDeclaration = null;
var MethodType = require("../type/MethodType").MethodType;
var AttributeDeclaration = require("../declaration/AttributeDeclaration").AttributeDeclaration;
var MethodDeclarationMap = null;

exports.resolve = function() {
	CategoryDeclaration = require("../declaration/CategoryDeclaration").CategoryDeclaration;
    MethodDeclarationMap = require("../runtime/Context").MethodDeclarationMap;
}

function InstanceExpression(name) {
	this.name = name;
	return this;
}

InstanceExpression.prototype.toString = function() {
	return this.name;
};

InstanceExpression.prototype.toDialect = function(writer, requireMethod) {
    if(requireMethod === undefined)
        requireMethod = true;
    if(requireMethod && this.requiresMethod(writer))
        writer.append("Method: ");
    writer.append(this.name);
};

InstanceExpression.prototype.requiresMethod = function(writer) {
    if(writer.dialect!=Dialect.E)
        return false;
    var o = writer.context.getRegistered(this.name);
    if(o instanceof MethodDeclarationMap)
        return true;
    return false;
};

InstanceExpression.prototype.check = function(context) {
	var named = context.getRegistered(this.name);
	if (named == null) {
		throw new SyntaxError("Unknown identifier:" + this.name);
	} else if (named instanceof Variable) { // local variable
        return named.getType(context);
    } else if(named instanceof LinkedVariable) { // local variable
        return named.getType(context);
	} else if (named instanceof Argument) { // named argument
		return named.getType(context);
	} else if(named instanceof CategoryDeclaration) { // any p with x
		return named.getType(context);
	} else if(named instanceof AttributeDeclaration) { // in category method
		return named.getType(context);
	} else if(named instanceof MethodDeclarationMap) { // global method or closure
		return new MethodType(context, this.name);
	} else {
		throw new SyntaxError(this.name + "  is not an instance:" + typeof(named));
	}
};

InstanceExpression.prototype.interpret = function(context) {
	return context.getValue(this.name);
};

exports.InstanceExpression = InstanceExpression;
