var BaseStatement = require("./BaseStatement").BaseStatement;
var InvalidDataError = require("../error/InvalidDataError").InvalidDataError;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var BooleanType = require("../type/BooleanType").BooleanType;
var Bool = require("../value/Bool").Bool;

function DoWhileStatement(condition, instructions) {
	BaseStatement.call(this);
	this.condition = condition;
	this.instructions = instructions;
	return this;
}

DoWhileStatement.prototype = Object.create(BaseStatement.prototype);
DoWhileStatement.prototype.constructor = DoWhileStatement;


DoWhileStatement.prototype.check = function(context) {
	var cond = this.condition.check(context);
	if(cond!=BooleanType.instance) {
		throw new SyntaxError("Expected a Boolean condition!");
	}
	var child = context.newChildContext();
	return this.instructions.check(child);
};

DoWhileStatement.prototype.interpret = function(context) {
	do {
		var child = context.newChildContext();
		var value = this.instructions.interpret(child);
		if(value!=null)
			return value;
	} while(this.interpretCondition(context));
	return null;
}

DoWhileStatement.prototype.interpretCondition = function(context) {
	var value = this.condition.interpret(context);
	if(!(value instanceof Bool)) {
		throw new InvalidDataError("Expected a Boolean, got:" + typeof(value));
	}
	return value.value;
};

DoWhileStatement.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

DoWhileStatement.prototype.toSDialect = function(writer) {
    this.toEDialect(writer);
};

DoWhileStatement.prototype.toEDialect = function(writer) {
    writer.append("do:\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
    writer.append("while ");
    this.condition.toDialect(writer);
    writer.newLine();
}

DoWhileStatement.prototype.toODialect = function(writer) {
    writer.append("do {\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
    writer.append("} while (");
    this.condition.toDialect(writer);
    writer.append(");\n");
}

exports.DoWhileStatement = DoWhileStatement;

