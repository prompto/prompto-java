var BaseMethodDeclaration = require("./BaseMethodDeclaration").BaseMethodDeclaration;
var VoidType = require("../type/VoidType").VoidType;
var CodeArgument = require("../grammar/CodeArgument").CodeArgument;

function ConcreteMethodDeclaration(name, args, returnType, statements) {
	BaseMethodDeclaration.call(this, name, args, returnType);
	this.statements = statements;
	this.returnType = returnType || null;
	return this;
}

ConcreteMethodDeclaration.prototype = Object.create(BaseMethodDeclaration.prototype);
ConcreteMethodDeclaration.prototype.constructor = ConcreteMethodDeclaration;

ConcreteMethodDeclaration.prototype.memberCheck = function(declaration, context) {
    // TODO Auto-generated method stub
};

ConcreteMethodDeclaration.prototype.check = function(context) {
	if(this.canBeChecked(context)) {
		return this.fullCheck(context, false);
	} else {
		return VoidType.instance;
	}
};

ConcreteMethodDeclaration.prototype.canBeChecked = function(context) {
	if(context.isGlobalContext()) {
		return !this.mustBeBeCheckedInCallContext(context);
	} else {
		return true;
	}
};

ConcreteMethodDeclaration.prototype.mustBeBeCheckedInCallContext = function(context) {
	// if at least one argument is 'Code'
	if(this.args===null) {
		return false;
	}
	for(var i=0;i<this.args.length;i++) {
		if(this.args[i] instanceof CodeArgument) {
			return true;
		}
	}
	return false;
};

ConcreteMethodDeclaration.prototype.fullCheck = function(context, nativeOnly) {
	if(context.isGlobalContext()) {
		context = context.newLocalContext();
		this.registerArguments(context);
	}
	if(this.args!==null) {
		this.args.check(context);
	}
	return this.statements.check(context, nativeOnly);
};

ConcreteMethodDeclaration.prototype.checkChild = function(context) {
	if(this.args!=null) {
		this.args.check(context);
	}
	var child = context.newChildContext();
	this.registerArguments(child);
	return this.statements.check(child);
};

ConcreteMethodDeclaration.prototype.interpret = function(context) {
	context.enterMethod(this);
	try {
		return this.statements.interpret(context);
	} finally {
		context.leaveMethod(this);
	}
};

ConcreteMethodDeclaration.prototype.toDialect = function(writer) {
    if(writer.context.isGlobalContext())
        writer = writer.newLocalWriter();
    writer.toDialect(this);
};

/*
	@Override
	public boolean isEligibleAsMain() {
		if(arguments.size()==0)
			return true;
		if(arguments.size()==1) {
			IArgument arg = arguments.getFirst();
			if(arg instanceof CategoryArgument) {
				IType type = ((CategoryArgument)arg).getType();
				if(type instanceof DictType)
					return ((DictType)type).getItemType()==TextType.instance();
			}
		}
		return super.isEligibleAsMain();
	}

*/

ConcreteMethodDeclaration.prototype.toSDialect = function(writer) {
    writer.append("def ");
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

ConcreteMethodDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.name);
    writer.append(" as: method ");
    this.args.toDialect(writer);
    if(this.returnType!=null && this.returnType!=VoidType.instance()) {
        writer.append("returning: ");
        this.returnType.toDialect(writer);
        writer.append(" ");
    }
    writer.append("doing:\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
};

ConcreteMethodDeclaration.prototype.toODialect = function(writer) {
    if(this.returnType!=null && this.returnType!=VoidType.instance()) {
        this.returnType.toDialect(writer);
        writer.append(" ");
    }
    writer.append("method ");
    writer.append(this.name);
    writer.append(" (");
    this.args.toDialect(writer);
    writer.append(") {\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
    writer.append("}\n");
};

exports.ConcreteMethodDeclaration = ConcreteMethodDeclaration;
