var ConcreteMethodDeclaration = require("./ConcreteMethodDeclaration").ConcreteMethodDeclaration;
var VoidType = require("../type/VoidType").VoidType;

function NativeMethodDeclaration(name, args, returnType, stmts) {
	ConcreteMethodDeclaration.call(this, name, args,returnType, stmts);
	return this;
}

NativeMethodDeclaration.prototype = Object.create(ConcreteMethodDeclaration.prototype);
NativeMethodDeclaration.prototype.constructor = NativeMethodDeclaration;

NativeMethodDeclaration.prototype.check = function(context) {
	var checked = this.fullCheck(context, true);
	return this.returnType != null ? this.returnType : checked;
};

NativeMethodDeclaration.prototype.interpret = function(context) {
	context.enterMethod(this);
	try {
		var result = this.statements.interpretNative(context, this.returnType);
        return this.castToReturnType(context, result);
	} finally {
		context.leaveMethod(this);
	}
};

NativeMethodDeclaration.prototype.castToReturnType = function(context, value) {
    // can only cast to specified type, and if required
    if(this.returnType!=null && !(value.type.isAssignableTo(context, this.returnType))) {
        // only cast if implemented, on a per type basis
        if(this.returnType.nativeCast)
            value = this.returnType.nativeCast(context, value);
    }
    return value;
};

NativeMethodDeclaration.prototype.toSDialect = function(writer) {
    writer.append("def native ");
    writer.append(this.name);
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

NativeMethodDeclaration.prototype.toODialect = function(writer) {
    if(this.returnType!=null  && this.returnType!=VoidType.instance) {
        this.returnType.toDialect(writer);
        writer.append(" ");
    }
    writer.append("native method ");
    writer.append(this.name);
    writer.append(" (");
    this.args.toDialect(writer);
    writer.append(") {\n");
    writer.indent();
    for(var i=0; i<this.statements.length; i++) {
        this.statements[i].toDialect(writer);
        writer.newLine();
    }
    writer.dedent();
    writer.append("}\n");
};

NativeMethodDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.name);
    writer.append(" as: native method ");
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
    writer.append("\n");
};

exports.NativeMethodDeclaration = NativeMethodDeclaration;
