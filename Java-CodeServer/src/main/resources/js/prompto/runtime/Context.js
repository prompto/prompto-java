var ConcreteCategoryDeclaration = require("../declaration/ConcreteCategoryDeclaration").ConcreteCategoryDeclaration;
var ContextualExpression = require("../value/ContextualExpression").ContextualExpression;
var MethodExpression = require("../expression/MethodExpression").MethodExpression;
var ConcreteInstance = require("../value/ConcreteInstance").ConcreteInstance;
var ExpressionValue = require("../value/ExpressionValue").ExpressionValue;
var DecimalType = require("../type/DecimalType").DecimalType;
var Decimal = require("../value/Decimal").Decimal;
var Integer = require("../value/Integer").Integer;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Variable = require("./Variable").Variable;
var LinkedValue = require("./LinkedValue").LinkedValue;

function Context() {
	this.globals = null;
	this.calling = null;
	this.parent = null; // for inner methods
	this.debugger = null;
	this.declarations = {};
    this.tests = {};
	this.instances = {};
	this.values = {};
    this.nativeBindings = {};
	return this;
}

Context.newGlobalContext = function() {
	var context = new Context();
	context.globals = context;
	context.calling = null;
	context.parent = null;
	context.debugger = null;
	return context;
};


Context.prototype.isGlobalContext = function() {
	return this===this.globals;
};

/*

public void setDebugger(Debugger debugger) {
	this.debugger = debugger;
}

public Debugger getDebugger() {
	return debugger;
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("{");
	if(this!=globals) {
		sb.append("globals:");
		sb.append(globals);
	}
	sb.append(",calling:");
	sb.append(calling);
	sb.append(",parent:");
	sb.append(parent);
	sb.append(",declarations:");
	sb.append(declarations);
	sb.append(",instances:");
	sb.append(instances);
	sb.append(",values:");
	sb.append(values);
	sb.append("}");
	return sb.toString();
}

*/

Context.prototype.getCallingContext = function() {
	return this.calling;
};

Context.prototype.getParentMostContext = function() {
	if(this.parent==null) {
		return this;
	} else {
		return this.parent.getParentMostContext();
	}
};

Context.prototype.getParentContext = function() {
	return this.parent;
}

Context.prototype.setParentContext = function(parent) {
	this.parent = parent;
}

Context.prototype.newResourceContext = function() {
	var context = new ResourceContext();
	context.globals = this.globals;
	context.calling = this.calling;
	context.parent = this;
	context.debugger = this.debugger;
	return context;
};

Context.prototype.newLocalContext = function() {
	var context = new Context();
	context.globals = this.globals;
	context.calling = this;
	context.parent = null;
	context.debugger = this.debugger;
	return context;
};

Context.prototype.newInstanceContext = function(instance, type) {
	var context = new InstanceContext(instance, type);
	context.globals = this.globals;
	context.calling = this;
	context.parent = null;
	context.debugger = this.debugger;
	return context;
};


Context.prototype.newChildContext = function() {
	var context = new Context();
	context.globals = this.globals;
	context.calling = this.calling;
	context.parent = this;
	context.debugger = this.debugger;
	return context;
};

Context.prototype.findAttribute = function(name) {
    if(this==this.globals)
        return this.declarations[name] || null;
    else
        return this.globals.findAttribute(name);
};

Context.prototype.getRegistered = function(name) {
	// resolve upwards, since local names override global ones
	var actual = this.declarations[name] || null;
	if(actual!==null) {
		return actual;
	}
	actual = this.instances[name] || null;
	if(actual!==null) {
		return actual;
	} else if(this.parent!==null) {
		return this.parent.getRegistered(name);
	} else if(this.globals!==this) {
		return this.globals.getRegistered(name);
	} else {
		return null;
	}
}

Context.prototype.getRegisteredDeclaration = function(name) {
	// resolve upwards, since local names override global ones
	var actual = this.declarations[name] || null;
	if(actual!==null) {
		return actual;
	} else if(this.parent!==null) {
		return this.parent.getRegisteredDeclaration(name);
	} else if(this.globals!==this) {
		return this.globals.getRegisteredDeclaration(name);
	} else {
		return null;
	}
}

Context.prototype.registerDeclaration = function(declaration) {
	var actual = this.getRegistered(declaration.name) || null;
	if(actual!=null) {
		throw new SyntaxError("Duplicate name: \"" + declaration.name + "\"");
	}
	this.declarations[declaration.name] = declaration;
};

Context.prototype.registerMethodDeclaration = function(declaration) {
	var actual = this.getRegistered(declaration.name);
	if(actual!==null && !(actual instanceof MethodDeclarationMap)) {
		throw new SyntaxError("Duplicate name: \"" + declaration.name + "\"");
	}
    if(actual===null) {
        actual = new MethodDeclarationMap(declaration.name);
        this.declarations[declaration.name] = actual;
    }
	actual.register(declaration,this);
};

Context.prototype.registerTestDeclaration = function(declaration) {
    var actual = this.tests[declaration.name] || null;
    if(actual!==null) {
        throw new SyntaxError("Duplicate test: \"" + declaration.name + "\"");
    }
    this.tests[declaration.name] = declaration;
};

Context.prototype.hasTests = function() {
    for(var test in this.tests)
        return true;
    return false;
};

Context.prototype.registerNativeBinding = function(type, declaration) {
    if(this==this.globals)
        this.nativeBindings[type] = declaration;
    else
        this.globals.registerNativeBinding(type, declaration);
};

Context.prototype.getNativeBinding = function(type) {
    if(this==this.globals)
        return this.nativeBindings[type] || null;
    else
        return this.globals.getNativeBinding(type);
};

function MethodDeclarationMap(name) {
	this.name = name;
	this.methods = {};
	return this;
}

MethodDeclarationMap.prototype.register = function(declaration, context) {
	var proto = declaration.getProto(context);
	var current = this.methods[proto] || null;
	if(current!==null) {
		throw new SyntaxError("Duplicate prototype for name: \"" + declaration.name + "\"");
	}
	this.methods[proto] = declaration;
};

MethodDeclarationMap.prototype.registerIfMissing = function(declaration,context) {
	var proto = declaration.getProto(context);
	if(!(proto in this.methods)) {
		this.methods[proto] = declaration;
	}
};


Context.prototype.getRegisteredValue = function(name) {
    var context = this.contextForValue(name);
    if (context == null)
        return null;
    else
        return context.readRegisteredValue(name);
};

Context.prototype.readRegisteredValue = function(name) {
	return this.instances[name] || null;
};


Context.prototype.registerValue = function(value, checkDuplicate) {
    if(checkDuplicate === undefined)
        checkDuplicate = true;
	if(checkDuplicate) {
        // only explore current context
        var actual = this.instances[value.name] || null;
        if(actual!==null) {
            throw new SyntaxError("Duplicate name: \"" + value.name + "\"");
        }
    }
	this.instances[value.name] = value;
}

Context.prototype.getValue = function(name) {
	var context = this.contextForValue(name);
	if(context===null) {
		throw new SyntaxError(name + " is not defined");
	}
	return context.readValue(name);
};

Context.prototype.readValue = function(name) {
	var value = this.values[name] || null;
	if(value===null) {
		throw new SyntaxError(name + " has no value");
	}
    if(value instanceof LinkedValue)
        return value.context.getValue(name);
    else
        return value;
};

Context.prototype.setValue = function(name, value) {
	var context = this.contextForValue(name);
	if(context===null) {
		throw new SyntaxError(name + " is not defined");
	}
	context.writeValue(name,value);
};


Context.prototype.writeValue = function(name, value) {
    value = this.autocast(name, value);
    var current = this.values[name];
    if(current instanceof LinkedValue)
        current.context.setValue(name, value);
    else
    	this.values[name] = value;
};

Context.prototype.autocast = function(name, value) {
    if(value!=null && value instanceof Integer) {
        var actual = this.instances[name];
        if(actual.getType(this)==DecimalType.instance)
            value = new Decimal(value.DecimalValue());
    }
    return value;
};

Context.prototype.contextForValue = function(name) {
	// resolve upwards, since local names override global ones
	var actual = this.instances[name] || null;
	if(actual!==null) {
		return this;
	} else if(this.parent!==null) {
		return this.parent.contextForValue(name);
	} else if(this.globals!==this) {
		return this.globals.contextForValue(name);
	} else {
		return null;
	}
};

function ResourceContext() {
	Context.call(this);
	return this;
}

ResourceContext.prototype = Object.create(Context.prototype);
ResourceContext.prototype.constructor = ResourceContext;

function InstanceContext(instance, type) {
	Context.call(this);
	this.instance = instance || null;
    this.instanceType = type!=null ? type : instance.type;
	return this;
}

InstanceContext.prototype = Object.create(Context.prototype);
InstanceContext.prototype.constructor = InstanceContext;


InstanceContext.prototype.readRegisteredValue = function(name) {
    var actual = this.instances[name];
    // not very pure, but avoids a lot of complexity when registering a value
    if(actual==null) {
        var attr = this.getRegisteredDeclaration(name);
        var type = attr.getType();
        actual = new Variable(name, type);
        this.instances[name] = actual;
    }
    return actual;
};


InstanceContext.prototype.contextForValue = function(name) {
	// params and variables have precedence over members
	// so first look in context values
	var context = Context.prototype.contextForValue.call(this,name);
	if(context!=null) {
		return context;
	} else if(this.getDeclaration().hasAttribute(this, name)) {
		return this;
	} else {
		return null;
	}
};

InstanceContext.prototype.getDeclaration = function() {
    if(this.instance!=null)
        return this.instance.declaration;
    else
        return this.getRegisteredDeclaration(this.instanceType.name);
};

InstanceContext.prototype.readValue = function(name) {
	return this.instance.getMember(this.calling, name);
};

InstanceContext.prototype.writeValue = function(name, value) {
	this.instance.setMember(this.calling, name, value);
};



Context.prototype.enterMethod = function(method) {
	if(this.debugger!=null) {
		this.debugger.enterMethod(this, method);
	}
};

Context.prototype.leaveMethod = function(method) {
	if(this.debugger!=null) {
		this.debugger.leaveMethod(this, method);
	}
};

Context.prototype.enterStatement = function(statement) {
	if(this.debugger!=null) {
		this.debugger.enterStatement(this, statement);
	}
};

Context.prototype.leaveStatement = function(statement) {
	if(this.debugger!=null) {
		this.debugger.leaveStatement(this, statement);
	}
}

Context.prototype.terminated = function() {
	if (this.debugger != null) {
		this.debugger.terminated();
	}
};

Context.prototype.loadSingleton = function(type) {
    if(this==this.globals) {
        var value = this.values[type.name] || null;
        if(value==null) {
            var decl = this.declarations[type.name] || null;
            if(!(decl instanceof ConcreteCategoryDeclaration))
                throw new InternalError("No such singleton:" + type.name);
            value = new ConcreteInstance(decl);
            value.mutable = true; // a singleton is protected by "with x do", so always mutable in that context
            this.values[type.name] = value;
        }
        if(value instanceof ConcreteInstance)
            return value;
        else
            throw new InternalError("Not a concrete instance:" + value);
    } else
        return this.globals.loadSingleton(type);
};


exports.Context = Context;
exports.InstanceContext = InstanceContext;
exports.ResourceContext = ResourceContext;
exports.MethodDeclarationMap = MethodDeclarationMap;