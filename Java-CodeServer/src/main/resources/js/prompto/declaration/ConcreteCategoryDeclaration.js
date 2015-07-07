var SyntaxError = require("../error/SyntaxError").SyntaxError;
var CategoryDeclaration = require("./CategoryDeclaration").CategoryDeclaration;
var SetterMethodDeclaration = require("./SetterMethodDeclaration").SetterMethodDeclaration;
var GetterMethodDeclaration = require("./GetterMethodDeclaration").GetterMethodDeclaration;
var MethodDeclarationMap = null;
var ConcreteInstance = require("../value/ConcreteInstance").ConcreteInstance;

exports.resolve = function() {
    MethodDeclarationMap = require("../runtime/Context").MethodDeclarationMap;
}

function ConcreteCategoryDeclaration(name, attributes, derivedFrom, methods) {
	CategoryDeclaration.call(this, name, attributes);
	this.derivedFrom = derivedFrom || null;
	this.methodsMap = null;
	this.methods = methods || [];
	return this;
}

ConcreteCategoryDeclaration.prototype = Object.create(CategoryDeclaration.prototype);
ConcreteCategoryDeclaration.prototype.constructor = ConcreteCategoryDeclaration;


ConcreteCategoryDeclaration.prototype.toEDialect = function(writer) {
    var hasMethods = this.methods!=null && this.methods.length>0;
    this.protoToEDialect(writer, hasMethods, false); // no bindings
    if(hasMethods)
        this.methodsToEDialect(writer, this.methods);
}

ConcreteCategoryDeclaration.prototype.categoryTypeToEDialect = function(writer) {
    if(this.derivedFrom==null)
        writer.append("category");
    else
        this.derivedFrom.toDialect(writer, true);
};


ConcreteCategoryDeclaration.prototype.toODialect = function(writer) {
    var hasMethods = this.methods!=null && this.methods.length>0;
    this.allToODialect(writer, hasMethods);
};

ConcreteCategoryDeclaration.prototype.categoryTypeToODialect = function(writer) {
    writer.append("category");
};


ConcreteCategoryDeclaration.prototype.categoryExtensionToODialect = function(writer) {
    if(this.derivedFrom!=null) {
        writer.append(" extends ");
        this.derivedFrom.toDialect(writer, true);
    }
};


ConcreteCategoryDeclaration.prototype.bodyToODialect = function(writer) {
    this.methodsToODialect (writer, this.methods);
};


ConcreteCategoryDeclaration.prototype.toSDialect = function(writer) {
    this.protoToSDialect(writer, this.derivedFrom);
    this.methodsToSDialect(writer);
};


ConcreteCategoryDeclaration.prototype.categoryTypeToSDialect = function(writer) {
    writer.append("class");
};


ConcreteCategoryDeclaration.prototype.methodsToSDialect = function(writer) {
    writer.indent();
    if(this.methods==null || this.methods.length==0)
        writer.append("pass\n");
    else for(var i=0;i<this.methods.length;i++) {
        var w = writer.newMemberWriter();
        this.methods[i].toDialect(w);
        writer.newLine();
    }
    writer.dedent();
};

ConcreteCategoryDeclaration.prototype.hasAttribute = function(context, name) {
	if (CategoryDeclaration.prototype.hasAttribute.call(this, context, name)) {
		return true;
	} else {
		return this.hasDerivedAttribute(context, name);
	}
};

ConcreteCategoryDeclaration.prototype.hasDerivedAttribute = function(context, name) {
	if(this.derivedFrom==null) {
		return false;
	}
	for(var i=0;i<this.derivedFrom.length;i++) {
		if(ConcreteCategoryDeclaration.ancestorHasAttribute(this.derivedFrom[i],context,name)) {
			return true;
		}
	}
	return false;
};

ConcreteCategoryDeclaration.ancestorHasAttribute = function(ancestor, context, name) {
	var actual = context.getRegisteredDeclaration(ancestor);
	if(!(actual instanceof CategoryDeclaration)) {
		return false;
	}
	return actual.hasAttribute(context, name);
};

ConcreteCategoryDeclaration.prototype.check = function(context) {
	this.checkDerived(context);
	this.checkMethods(context);
	return CategoryDeclaration.prototype.check.call(this, context);
}

ConcreteCategoryDeclaration.prototype.checkMethods = function(context) {
    this.registerMethods(context);
    for (var i = 0; i < this.methods.length; i++) {
        this.methods[i].memberCheck(this, context);
    }
};

ConcreteCategoryDeclaration.prototype.registerMethods = function(context) {
	if(this.methodsMap==null) {
        this.methodsMap = {};
		for(var i=0;i<this.methods.length;i++) {
            this.methods[i].memberOf = this;
			this.registerMethod(this.methods[i], context);
		}
	}
};


ConcreteCategoryDeclaration.prototype.registerMethod = function(method, context) {
	var actual;
	if(method instanceof SetterMethodDeclaration) {
		var key = "setter:"+method.name;
		actual = this.methodsMap[key] || null;
		if(actual!=null) {
			throw new SyntaxError("Duplicate setter: \"" + method.name + "\"");
		}
		this.methodsMap[key] = method;
	} else if(method instanceof GetterMethodDeclaration) {
		var key = "getter:"+method.name;
		actual = this.methodsMap[key] || null;
		if(actual!=null) {
			throw new SyntaxError("Duplicate getter: \"" + method.name + "\"");
		}
		this.methodsMap[key] = method;
	} else {
		var key = method.name;
		actual = this.methodsMap[key] || null;
		if(actual==null) {
			actual = new MethodDeclarationMap(method.name);
			this.methodsMap[key] = actual;
		}
		actual.register(method, context);
	}
};

ConcreteCategoryDeclaration.prototype.checkDerived = function(context) {
	if(this.derivedFrom!=null) {
		for(var i=0;i<this.derivedFrom.length;i++) {
			var cd = context.getRegisteredDeclaration(this.derivedFrom[i]) || null;
			if (cd == null) {
				throw new SyntaxError("Unknown category: \"" + this.derivedFrom[i] + "\"");
			}
		}
	}
};

ConcreteCategoryDeclaration.prototype.isDerivedFrom = function(context, categoryType) {
	if(this.derivedFrom==null) {
		return false;
	}
	for(var i=0;i<this.derivedFrom.length;i++) {
		var ancestor = this.derivedFrom[i];
		if(ancestor==categoryType.name) {
			return true;
		}
		if(ConcreteCategoryDeclaration.isAncestorDerivedFrom(ancestor,context,categoryType)) {
			return true;
		}
	}
	return false;
};

ConcreteCategoryDeclaration.isAncestorDerivedFrom = function(ancestor, context, categoryType) {
	var actual = context.getRegisteredDeclaration(ancestor);
	if(!(actual instanceof CategoryDeclaration)) {
		return false;
	}
	return actual.isDerivedFrom(context, categoryType);
};

ConcreteCategoryDeclaration.prototype.newInstance = function() {
	return new ConcreteInstance(this);
};

ConcreteCategoryDeclaration.prototype.findGetter = function(context, attrName) {
	if(this.methodsMap==null) {
		return null;
	}
	var method = this.methodsMap["getter:"+attrName] || null;
	if(method instanceof GetterMethodDeclaration) {
		return method;
	}
	if(method!=null) {
		throw new SyntaxError("Not a getter method!");
	}
	return this.findDerivedGetter(context, attrName);
};

ConcreteCategoryDeclaration.prototype.findDerivedGetter = function(context, attrName) {
	if(this.derivedFrom==null) {
		return null;
	}
	for(var i=0;i<this.derivedFrom;i++) {
		var method = ConcreteCategoryDeclaration.findAncestorGetter(this.derivedFrom[i],context,attrName);
		if(method!=null) {
			return method;
		}
	}
	return null;
}

ConcreteCategoryDeclaration.findAncestorGetter = function(ancestor, context, attrName) {
	var actual = context.getRegisteredDeclaration(ancestor);
	if(!(actual instanceof ConcreteCategoryDeclaration)) {
		return null;
	}
	return actual.findGetter(context, attrName);
};

ConcreteCategoryDeclaration.prototype.findSetter = function(context, attrName) {
	if(this.methodsMap==null) {
		return null;
	}
	var method = this.methodsMap["setter:"+attrName] || null;
	if(method instanceof SetterMethodDeclaration) {
		return method;
	}
	if(method!=null) {
		throw new SyntaxError("Not a setter method!");
	}
	return this.findDerivedSetter(context,attrName);
};

ConcreteCategoryDeclaration.prototype.findDerivedSetter = function(context, attrName) {
	if(this.derivedFrom==null) {
		return null;
	}
	for(var i=0;i<this.derivedFrom;i++) {
		var method = ConcreteCategoryDeclaration.findAncestorSetter(this.derivedFrom[i],context,attrName);
		if(method!=null) {
			return method;
		}
	}
	return null;
};

ConcreteCategoryDeclaration.findAncestorSetter = function(ancestor, context, attrName) {
	var actual = context.getRegisteredDeclaration(ancestor);
	if(!(actual instanceof ConcreteCategoryDeclaration)) {
		return null;
	}
	return actual.findSetter(context, attrName);
};


ConcreteCategoryDeclaration.prototype.findMemberMethods = function(context, name) {
	var result = new MethodDeclarationMap(name);
	this.registerMemberMethods(context,result);
	var names = Object.getOwnPropertyNames(result.methods);
	var list = [];
	for(var i=0;i<names.length;i++) {
		list.push(result.methods[names[i]]);
	}
	return list;
};


ConcreteCategoryDeclaration.prototype.registerMemberMethods = function(context, result) {
    this.registerMethods(context);
	this.registerThisMemberMethods(context,result);
	this.registerDerivedMemberMethods(context,result);
};


ConcreteCategoryDeclaration.prototype.registerThisMemberMethods = function(context, result) {
	if(this.methodsMap==null) {
		return;
	}
	var actual = this.methodsMap[result.name] || null;
	if(actual==null) {
		return;
	}
	if(!(actual instanceof MethodDeclarationMap)) {
		throw new SyntaxError("Not a member method!");
	}
	var names = Object.getOwnPropertyNames(actual.methods);
	for(var i=0;i<names.length;i++) {
		var method = actual.methods[names[i]];
		result.registerIfMissing(method, context);
	}
};

ConcreteCategoryDeclaration.prototype.registerDerivedMemberMethods = function(context, result) {
	if(this.derivedFrom==null) {
		return;
	}
	for(var i=0;i<this.derivedFrom.length;i++) {
		var ancestor = this.derivedFrom[i];
		this.registerAncestorMemberMethods(ancestor, context, result);
	}
};

ConcreteCategoryDeclaration.prototype.registerAncestorMemberMethods = function(ancestor, context, result) {
	var actual = context.getRegisteredDeclaration(ancestor);
	if(!(actual instanceof ConcreteCategoryDeclaration)) {
		return;
	}
	actual.registerMemberMethods(context, result);
};


ConcreteCategoryDeclaration.prototype.findOperator = function(context, operator, type) {
    var methodName = "operator_" + operator.name;
    var methods = this.findMemberMethods(context, methodName);
    if(methods==null)
        return null;
    // find best candidate
    var candidate = null;
    for(var i=0;i<methods.length;i++) {
        var method  = methods[i];
        var potential = method.args[0].getType(context);
        if(!type.isAssignableTo(context, potential))
            continue;
        if(candidate==null)
            candidate = method;
        else {
            var currentBest = candidate.args[0].getType(context);
            if(currentBest.isAssignableTo(context, potential))
                candidate = method;
        }
    }
    return candidate;
};

exports.ConcreteCategoryDeclaration = ConcreteCategoryDeclaration;
