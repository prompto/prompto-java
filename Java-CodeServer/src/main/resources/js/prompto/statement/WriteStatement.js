var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var ResourceType = require("../type/ResourceType").ResourceType;
var VoidType = require("../type/VoidType").VoidType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;
var InternalError = require("../error/InternalError").InternalError;
var InvalidResourceError = require("../error/InvalidResourceError").InvalidResourceError;

function WriteStatement(content, resource) {
	SimpleStatement.call(this);
	this.content = content;
	this.resource = resource;
	return this;
}

WriteStatement.prototype = Object.create(SimpleStatement.prototype);
WriteStatement.prototype.constructor = WriteStatement;

WriteStatement.prototype.toString = function() {
	return "write " + this.content.toString() + " to " + this.resource.toString();
};

WriteStatement.prototype.check = function(context) {
	context = context.newResourceContext();
	var resourceType = this.resource.check(context);
	if(!(resourceType instanceof ResourceType))
		throw new SyntaxError("Not a resource!");
	return VoidType.instance;
}

WriteStatement.prototype.interpret = function(context) {
	context = context.newResourceContext();
	var o = this.resource.interpret(context);
	if(o==null) {
		throw new NullReferenceError();
	}
	if(!(o.isWritable)) {
		throw new InternalError("Illegal write source: " + o);
	}
	if(!o.isWritable()) {
		throw new InvalidResourceError("Not writable");
	}
	var str = this.content.interpret(context).toString();
	o.writeFully(str);
	return null;
};

WriteStatement.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

WriteStatement.prototype.toEDialect = function(writer) {
    writer.append("write ");
    this.content.toDialect(writer);
    writer.append(" to ");
    this.resource.toDialect(writer);
};

WriteStatement.prototype.toODialect = function(writer) {
    writer.append("write (");
    this.content.toDialect(writer);
    writer.append(") to ");
    this.resource.toDialect(writer);
};

WriteStatement.prototype.toSDialect = function(writer) {
    this.toEDialect(writer);
};

exports.WriteStatement = WriteStatement;
