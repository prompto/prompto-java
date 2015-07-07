var BaseDeclaration = require("./BaseDeclaration").BaseDeclaration;
var InternalError = require("../error/InternalError").InternalError;
var Value = require("../value/Value").Value;

function AttributeDeclaration(name, type, constraint) {
	BaseDeclaration.call(this, name);
	this.type = type;
	this.constraint = constraint;
	return this;
}

AttributeDeclaration.prototype = Object.create(BaseDeclaration.prototype);
AttributeDeclaration.prototype.constructor = AttributeDeclaration;
	
AttributeDeclaration.prototype.getType = function() {
	return this.type;
};
	
AttributeDeclaration.prototype.toString = function() {
	return this.name + ':' + this.type.toString();
};

AttributeDeclaration.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

AttributeDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.name);
    writer.append(" as: ");
    this.type.toDialect(writer);
    writer.append(" attribute");
    if (this.constraint != null)
        this.constraint.toDialect(writer);
};

AttributeDeclaration.prototype.toODialect = function(writer) {
    writer.append("attribute ");
    writer.append(this.name);
    writer.append(" : ");
    this.type.toDialect(writer);
    if (this.constraint != null)
        this.constraint.toDialect(writer);
    writer.append(';');
};

AttributeDeclaration.prototype.toSDialect = function(writer) {
    writer.append("attr ");
    writer.append(this.name);
    writer.append(" ( ");
    this.type.toDialect(writer);
    writer.append(" ):\n");
    writer.indent();
    if (this.constraint != null)
        this.constraint.toDialect(writer);
    else
        writer.append("pass");
    writer.dedent();
};

AttributeDeclaration.prototype.register = function(context) {
	context.registerDeclaration(this);
};

AttributeDeclaration.prototype.check = function(context) {
	this.type.checkExists(context);
	return this.type;
};

AttributeDeclaration.prototype.checkValue = function(context, expression) {
    var value = expression.interpret(context);
	if(this.constraint==null) {
		return value;
	}
	this.constraint.checkValue(context, value);
	return value;
};

exports.AttributeDeclaration = AttributeDeclaration;