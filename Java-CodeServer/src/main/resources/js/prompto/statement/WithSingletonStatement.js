var BaseStatement = require("./BaseStatement").BaseStatement;
var SimpleStatement = require("./SimpleStatement").SimpleStatement;

function WithSingletonStatement(type, instructions) {
    BaseStatement.call(this);
    this.type = type;
    this.instructions = instructions;
    return this;
};

WithSingletonStatement.prototype = Object.create(BaseStatement.prototype);
WithSingletonStatement.prototype.constructor = WithSingletonStatement;

WithSingletonStatement.prototype.check = function(context) {
    var instanceContext = context.newInstanceContext(null, this.type);
    var childContext = instanceContext.newChildContext();
    return this.instructions.check(childContext);
};

WithSingletonStatement.prototype.interpret = function(context) {
    // TODO synchronize
    var instance = context.loadSingleton(this.type);
    var instanceContext = context.newInstanceContext(instance);
    var childContext = instanceContext.newChildContext();
    return this.instructions.interpret(childContext);
};


WithSingletonStatement.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

WithSingletonStatement.prototype.toEDialect = function(writer) {
    writer.append("with ");
    this.type.toDialect(writer);
    writer.append(", do:\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
};

WithSingletonStatement.prototype.toODialect = function(writer) {
    writer.append("with (");
    this.type.toDialect(writer);
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
};

WithSingletonStatement.prototype.toSDialect = function(writer) {
    writer.append("with ");
    this.type.toDialect(writer);
    writer.append(":\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
};

exports.WithSingletonStatement = WithSingletonStatement;
