var SyntaxError = require("../error/SyntaxError").SyntaxError;
var MethodType = require("../type/MethodType").MethodType;
var MethodDeclarationMap = null; // circular dependency
var Dialect = require("../parser/Dialect").Dialect;

exports.resolve = function() {
    MethodDeclarationMap = require("../runtime/Context").MethodDeclarationMap;
};

function MethodExpression(name) {
	this.name = name;
	return this;
}

MethodExpression.prototype.toString = function() {
	return "Method: " + this.name;
};

MethodExpression.prototype.toDialect = function(writer) {
    if(writer.dialect==Dialect.E)
        writer.append("Method: ");
    writer.append(this.name);
};

MethodExpression.prototype.check = function(context) {
	var named = context.getRegistered(this.name);
	if(named instanceof MethodDeclarationMap) {
		return new MethodType(context, this.name);
	} else {
		throw new SyntaxError("No method with name:" + this.name);
	}
};

MethodExpression.prototype.interpret = function(context, asMethod) {
	return context.getValue(this.name);
};
	
exports.MethodExpression = MethodExpression;
