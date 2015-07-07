var ConcreteMethodDeclaration = require("./ConcreteMethodDeclaration").ConcreteMethodDeclaration;

function GetterMethodDeclaration(name, statements) {
    ConcreteMethodDeclaration.call(this, name, null, null, statements);
	return this;
}

GetterMethodDeclaration.prototype = Object.create(ConcreteMethodDeclaration.prototype);
GetterMethodDeclaration.prototype.contructor = GetterMethodDeclaration;

GetterMethodDeclaration.prototype.toODialect = function(writer) {
    writer.append("getter ");
    writer.append(this.name);
    writer.append(" {\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
    writer.append("}\n");
};

GetterMethodDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.name);
    writer.append(" getter doing:\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
};

GetterMethodDeclaration.prototype.toSDialect = function(writer) {
    writer.append("def ");
    writer.append(this.name);
    writer.append(" getter():\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
};

exports.GetterMethodDeclaration = GetterMethodDeclaration;
