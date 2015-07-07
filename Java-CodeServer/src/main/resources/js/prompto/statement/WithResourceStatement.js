var BaseStatement = require("./BaseStatement").BaseStatement;
var SimpleStatement = require("./SimpleStatement").SimpleStatement;

function WithResourceStatement(resource, instructions) {
	BaseStatement.call(this);
	this.resource = resource;
	this.instructions = instructions;
}

WithResourceStatement.prototype = Object.create(BaseStatement.prototype);
WithResourceStatement.prototype.constructor = WithResourceStatement;

WithResourceStatement.prototype.check = function(context) {
	context = context.newResourceContext();
	this.resource.checkResource(context);
	return this.instructions.check(context);
};

WithResourceStatement.prototype.interpret = function(context) {
	context = context.newResourceContext();
	try {
		this.resource.interpret(context);
		return this.instructions.interpret(context);
	} finally {
		var res = context.getValue(this.resource.name);
		if(res.close) {
			res.close();
		}
	}
};

WithResourceStatement.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

WithResourceStatement.prototype.toEDialect = function(writer) {
    writer.append("with ");
    this.resource.toDialect(writer);
    writer.append(", do:\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
}

WithResourceStatement.prototype.toODialect = function(writer) {
    writer.append("with (");
    this.resource.toDialect(writer);
    writer.append(")");
    var oneLine = this.instructions.length==1 && (this.instructions[0] instanceof SimpleStatement);
    if(!oneLine)
        writer.append(" {");
    writer.newLine();
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
    if(!oneLine) {
        writer.append("}");
        writer.newLine();
    }
}

WithResourceStatement.prototype.toSDialect = function(writer) {
    writer.append("with ");
    this.resource.toDialect(writer);
    writer.append(":\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
}

exports.WithResourceStatement = WithResourceStatement;