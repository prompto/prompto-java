var SyntaxError = require("../error/SyntaxError").SyntaxError;
var CodeType = require("../type/CodeType").CodeType;
var Argument = require("./Argument").Argument;

function CodeArgument(name) {
	Argument.call(this, name);
	return this;
}

CodeArgument.prototype = Object.create(Argument.prototype);
CodeArgument.prototype.constructor = CodeArgument;

/*
	
@Override
public IType getType() {
	return CodeType.instance();
}

@Override
public String getSignature(Dialect dialect) {
	return name + ':' + CodeType.instance().getName();
}
*/

CodeArgument.prototype.getProto = function(context) {
	return CodeType.instance.name;
};

/*
@Override
public String toString() {
	return name + ':' + CodeType.instance().getName();
}

@Override
public boolean equals(Object obj) {
	if(obj==this)
		return true;
	if(obj==null)
		return false;
	if(!(obj instanceof CodeArgument))
		return false;
	CodeArgument other = (CodeArgument)obj;
	return Utils.equal(this.getName(),other.getName());
}
*/

CodeArgument.prototype.register = function(context) {
	var actual = context.getRegisteredValue(this.name);
	if(actual!=null) {
		throw new SyntaxError("Duplicate argument: \"" + this.name + "\"");
	}
	context.registerValue(this);
};

CodeArgument.prototype.check = function(context) {
	// ok
};

CodeArgument.prototype.getType = function(context) {
	return CodeType.instance;
};

CodeArgument.prototype.toDialect = function(writer) {
    writer.append(CodeType.instance.name);
    writer.append(" ");
    writer.append(this.name);
};


exports.CodeArgument = CodeArgument;