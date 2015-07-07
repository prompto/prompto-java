var BaseType = require("./BaseType").BaseType;
var ListType = require("./ListType").ListType;
var TextType = require("./TextType").TextType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function EnumeratedNativeType(name, derivedFrom) {
	BaseType.call(this, name);
	this.derivedFrom = derivedFrom;
	return this;
}

EnumeratedNativeType.prototype = Object.create(BaseType.prototype);
EnumeratedNativeType.prototype.constructor = EnumeratedNativeType;

/*
public NativeType getDerivedFrom() {
	return derivedFrom;
}

@Override
public Class<?> toJavaClass() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void checkUnique(Context context) throws SyntaxError {
	// TODO Auto-generated method stub

}

@Override
public void checkExists(Context context) throws SyntaxError {
	// TODO Auto-generated method stub

}

*/

EnumeratedNativeType.prototype.checkMember = function(context, name) {
	if ("symbols"==name) {
		return new ListType(this.derivedFrom);
	} else if ("value"==name) {
		return this;
	} else if ("name"==name) {
		return TextType.instance;
	} else {
		return BaseType.prototype.checkMember.apply(this, context, name);
	}
};

EnumeratedNativeType.prototype.getMember = function(context, name) {
	var decl = context.getRegisteredDeclaration(this.name);
	if(!decl || !decl.symbols) {
		throw new SyntaxError(name + " is not an enumerated type!");
	}
	if ("symbols"==name) {
		return decl.symbols;
	} else {
		throw new SyntaxError("Unknown member:" + name);
	}
};

/*

@Override
public boolean isAssignableTo(Context context, IType other) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isMoreSpecificThan(Context context, IType other) {
	// TODO Auto-generated method stub
	return false;
}

*/

exports.EnumeratedNativeType = EnumeratedNativeType;
