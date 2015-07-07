var ResourceType = require("../type/ResourceType").ResourceType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;
var InternalError = require("../error/InternalError").InternalError;
var InvalidResourceError = require("../error/InvalidResourceError").InvalidResourceError;
var TextType = require("../type/TextType").TextType;
var Text = require("../value/Text").Text;

function ReadExpression(resource) {
	this.resource = resource;
	return this;
}

ReadExpression.prototype.toString = function() {
	return "read from " + this.resource.toString();
};

ReadExpression.prototype.toDialect = function(writer) {
    writer.append("read from ");
    this.resource.toDialect(writer);
};

ReadExpression.prototype.check = function(context) {
	context = context.newResourceContext();
	var sourceType = this.resource.check(context);
	if(!(sourceType instanceof ResourceType)) {
		throw new SyntaxError("Not a readable resource!");
	}
	return TextType.instance;
};

ReadExpression.prototype.interpret = function(context) {
	context = context.newResourceContext();
	var o = this.resource.interpret(context);
	if(o==null) {
		throw new NullReferenceError();
	}
	if(!(o.isReadable)) {
		throw new InternalError("Illegal read source: " + o);
	}
	if(!o.isReadable()) {
		throw new InvalidResourceError("Not readable");
	}
	var s = o.readFully();
    return new Text(s);
};

exports.ReadExpression = ReadExpression;
