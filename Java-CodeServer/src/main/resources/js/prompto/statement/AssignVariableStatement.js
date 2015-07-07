var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var ResourceType = require("../type/ResourceType").ResourceType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Variable = require("../runtime/Variable").Variable;
var VoidType = require("../type/VoidType").VoidType;

function AssignVariableStatement(name, expression) {
	SimpleStatement.call(this);
	this.name = name;
	this.expression = expression;
	return this;
}

AssignVariableStatement.prototype = Object.create(SimpleStatement.prototype);
AssignVariableStatement.prototype.constructor = AssignVariableStatement;


AssignVariableStatement.prototype.toDialect = function(writer) {
    writer.append(this.name);
    writer.append(" = ");
    this.expression.toDialect(writer);
};

AssignVariableStatement.prototype.checkResource = function(context) {
	var type = this.expression.check(context);
	if(!(type instanceof ResourceType)) {
		throw new SyntaxError("Not a resource!");
	}
	var actual = context.getRegisteredValue(this.name);
	if(actual==null) {
		context.registerValue(new Variable(this.name, type));
	} else {
		// need to check type compatibility
		var actualType = actual.getType(context);
		type.checkAssignableTo(context,actualType);
	}
	return VoidType.instance;
};

AssignVariableStatement.prototype.equals = function(obj) {
	if(obj==this) {
		return true;
	}
	if(!(obj instanceof AssignVariableStatement)) {
		return false;
	}
	return this.name==obj.name && this.expression==obj.expression;
};

AssignVariableStatement.prototype.check = function(context) {
	var actual = context.getRegisteredValue(this.name);
	if(actual==null) {
        var actualType = this.expression.check(context);
		context.registerValue(new Variable(this.name, actualType));
	} else {
		// need to check type compatibility
		var actualType = actual.getType(context);
		var newType = expression.check(context);
		newType.checkAssignableTo(context,actualType);
	}
	return VoidType.instance;
};

AssignVariableStatement.prototype.interpret = function(context) {
	if(context.getRegisteredValue(this.name)==null) {
        var actualType = this.expression.check(context);
		context.registerValue(new Variable(this.name, actualType));
	}
	context.setValue(this.name, this.expression.interpret(context));
	return null;
};

exports.AssignVariableStatement = AssignVariableStatement;