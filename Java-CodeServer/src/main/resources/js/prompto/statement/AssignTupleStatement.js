var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var TupleType = require("../type/TupleType").TupleType;
var AnyType = require("../type/AnyType").AnyType;
var VoidType = require("../type/VoidType").VoidType;
var Variable = require("../runtime/Variable").Variable;
var TupleValue = require("../value/TupleValue").TupleValue;
var Integer = require("../value/Integer").Integer;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var ExpressionValue = require("../value/ExpressionValue").ExpressionValue;

function AssignTupleStatement(names, expression) {
	SimpleStatement.call(this);
	this.names = names;
	this.expression = expression;
	return this;
}

AssignTupleStatement.prototype = Object.create(SimpleStatement.prototype);
AssignTupleStatement.prototype.constructor = AssignTupleStatement;

/*
@Override
public boolean equals(Object obj) {
	if(obj==this)
		return true;
	if(obj==null)
		return false;
	if(!(obj instanceof AssignTupleStatement))
		return false;
	AssignTupleStatement other = (AssignTupleStatement)obj;
	return this.getNames().equals(other.getNames())
			&& this.getExpression().equals(other.getExpression());
}

*/

AssignTupleStatement.prototype.check = function(context) {
	var type = this.expression.check(context);
	if(type!=TupleType.instance) {
		throw new SyntaxError("Expecting a tuple expression, got " + type.getName());
	}
	for(var i=0;i<this.names.length;i++) {
		var name = this.names[i];
		var actual = context.getRegistered(name);
		if(actual==null) {
            var actualType = this.expression.check(context);
			context.registerValue(new Variable(name, actualType));
		} else {
			// need to check type compatibility
			var actualType = actual.getType(context);
			var newType = this.expression.check(context);
			newType.checkAssignableTo(context,actualType);
		}
	}
	return VoidType.instance;
};

AssignTupleStatement.prototype.interpret = function(context) {
	var object = this.expression.interpret(context);
	if(!(object instanceof TupleValue)) {
		throw new SyntaxError("Expecting a tuple expression, got " + typeof(object));
	}
	for(var i=0;i<this.names.length;i++) {
		var name = this.names[i];
		var value = object.getItemInContext(context, new Integer(i+1)); // since getItemInContext is 1 based
		if(context.getRegisteredValue(name)==null) {
			context.registerValue(new Variable(name, AnyType.instance));
		}
		context.setValue(name, value);
	}
	return null;
};

AssignTupleStatement.prototype.toDialect = function(writer) {
    this.names.toDialect(writer, false);
    writer.append(" = ");
    this.expression.toDialect(writer);
};


exports.AssignTupleStatement = AssignTupleStatement;