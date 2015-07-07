var BaseType = require("./BaseType").BaseType;
var SyntaxError = require("../error/SyntaxError");

function MethodType(context, name) {
	BaseType.call(this, name);
	this.context = context;
	return this;
}

MethodType.prototype = Object.create(BaseType.prototype);
MethodType.prototype.constructor = MethodType;

/*
@Override
public Class<?> toJavaClass() {
	return Method.class;
}

*/
MethodType.prototype.equals = function(obj) {
	if(obj==this) {
		return true;
	} else if(obj==null) {
		return false;
	} else if(!(obj instanceof MethodType)) {
		return false;
	} else {
		return this.name == obj.name;
	}
};

MethodType.prototype.checkUnique = function(context) {
	var actual = context.getRegisteredDeclaration(this.name);
	if (actual != null) {
		throw new SyntaxError("Duplicate name: \"" + this.name + "\"");
	}
};


MethodType.prototype.getDeclaration = function(context) {
	var map = this.context.getRegisteredDeclaration(this.name);
	if(map==null) {
		throw new SyntaxError("Unknown method: \"" + this.name + "\"");
	}
	var props = Object.getOwnPropertyNames(map.methods);
	return map.methods[props[0]];
};

/*
 @Override
public void checkExists(Context context) throws SyntaxError {
	getDeclaration(context);
}

*/

MethodType.prototype.isAssignableTo = function(context, other) {
	if(!(other instanceof MethodType)) {
		return false;
	}
	try {
		var thisMethod = this.getDeclaration(context);
		var otherMethod = other.getDeclaration(context);
		return thisMethod.getProto(context)==otherMethod.getProto(other.context); // TODO: refine
	} catch (e) {
		if(e instanceof SyntaxError) {
			return false;
		} else {
			throw e;
		}
	}
}


exports.MethodType = MethodType;
