var ConcreteMethodDeclaration = require("./ConcreteMethodDeclaration").ConcreteMethodDeclaration;

function SetterMethodDeclaration(name, statements) {
    ConcreteMethodDeclaration.call(this, name, null, null, statements);
	return this;
}

SetterMethodDeclaration.prototype = Object.create(ConcreteMethodDeclaration.prototype);
SetterMethodDeclaration.prototype.contructor = SetterMethodDeclaration;

SetterMethodDeclaration.prototype.toODialect = function(writer) {
    writer.append("setter ");
    writer.append(this.name);
    writer.append(" {\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
    writer.append("}\n");
}

SetterMethodDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.name);
    writer.append(" setter doing:\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
}

SetterMethodDeclaration.prototype.toSDialect = function(writer) {
    writer.append("def ");
    writer.append(this.name);
    writer.append(" setter():\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
}

exports.SetterMethodDeclaration = SetterMethodDeclaration;
