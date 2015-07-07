var ConcreteMethodDeclaration = require("./ConcreteMethodDeclaration").ConcreteMethodDeclaration;
var ArgumentList = require("../grammar/ArgumentList").ArgumentList;
var VoidType = require("../type/VoidType").VoidType;

function OperatorMethodDeclaration(op, arg, returnType, stmts) {
    ConcreteMethodDeclaration.call(this, "operator_" + op.name, new ArgumentList(arg), returnType, stmts);
    this.operator = op;
    return this;
}

OperatorMethodDeclaration.prototype = Object.create(ConcreteMethodDeclaration.prototype);
OperatorMethodDeclaration.prototype.constructor = OperatorMethodDeclaration;


OperatorMethodDeclaration.prototype.memberCheck = function(declaration, context) {
    // TODO Auto-generated method stub
};

OperatorMethodDeclaration.prototype.toSDialect = function(writer) {
    writer.append("def operator ");
    writer.append(this.operator.token);
    writer.append(" (");
    this.args.toDialect(writer);
    writer.append(")");
    if(this.returnType!=null && this.returnType!=VoidType.instance) {
        writer.append("->");
        this.returnType.toDialect(writer);
    }
    writer.append(":\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
};

OperatorMethodDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.operator.token);
    writer.append(" as: operator ");
    this.args.toDialect(writer);
    if(this.returnType!=null && this.returnType!=VoidType.instance) {
        writer.append("returning: ");
        this.returnType.toDialect(writer);
        writer.append(" ");
    }
    writer.append("doing:\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
};

OperatorMethodDeclaration.prototype.toODialect = function(writer) {
    if(this.returnType!=null && this.returnType!=VoidType.instance) {
        this.returnType.toDialect(writer);
        writer.append(" ");
    }
    writer.append("operator ");
    writer.append(this.operator.token);
    writer.append(" (");
    this.args.toDialect(writer);
    writer.append(") {\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
    writer.append("}\n");
};

exports.OperatorMethodDeclaration = OperatorMethodDeclaration;