var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var VoidType = require("../type/VoidType").VoidType;

function AssignInstanceStatement(instance, expression) {
	SimpleStatement.call(this);
	this.instance = instance;
	this.expression = expression;
	return this;
}

AssignInstanceStatement.prototype = Object.create(SimpleStatement.prototype);
AssignInstanceStatement.prototype.constructor = AssignInstanceStatement;

AssignInstanceStatement.prototype.toDialect = function(writer) {
    this.instance.toDialect(writer, this.expression);
    writer.append(" = ");
    this.expression.toDialect(writer);
};

AssignInstanceStatement.prototype.toString = function() {
	return this.instance.toString() + " = " + this.expression.toString();
};

AssignInstanceStatement.prototype.check = function(context) {
	this.instance.checkAssignValue(context, this.expression);
	return VoidType.instance;
};

AssignInstanceStatement.prototype.interpret = function(context) {
	this.instance.assign(context, this.expression);
	return null;
};

exports.AssignInstanceStatement = AssignInstanceStatement;