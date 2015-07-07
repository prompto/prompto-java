var CategoryType = null;
var ContextualExpression = require("../value/ContextualExpression").ContextualExpression;
var NotMutableError = require("../error/NotMutableError").NotMutableError;
var ExpressionValue = require("../value/ExpressionValue").ExpressionValue;
var DecimalType = require("../type/DecimalType").DecimalType;
var Variable = require("../runtime/Variable").Variable;
var Operator = require("../grammar/Operator").Operator;
var Decimal = require("./Decimal").Decimal;
var Integer = require("./Integer").Integer;
var Value = require("./Value").Value;

exports.resolve = function() {
	CategoryType = require("../type/CategoryType").CategoryType;
};

function ConcreteInstance(declaration) {
	Value.call(this, new CategoryType(declaration.name));
	this.declaration = declaration;
    this.mutable = false;
	this.values = {};
	return this;
}

ConcreteInstance.prototype = Object.create(Value.prototype);
ConcreteInstance.prototype.constructor = ConcreteInstance;

ConcreteInstance.prototype.getType = function() {
	return this.type;
};

ConcreteInstance.prototype.getAttributeNames = function() {
	return Object.getOwnPropertyNames(this.values);
};

// don't call getters from getters, so register them
// TODO: thread local storage

var activeGetters = {};

function getActiveGetters() {
	return activeGetters;
}

ConcreteInstance.prototype.getMember = function(context, attrName) {
	var stacked = getActiveGetters()[attrName] || null;
    var first = stacked==null;
    if(first)
        getActiveGetters()[attrName] = context;
	try {
		return this.doGetMember(context, attrName, first);
	} finally {
		if(first) {
			delete getActiveGetters()[attrName];
		}
	}
};

ConcreteInstance.prototype.doGetMember = function(context, attrName, allowGetter) {
	var getter = allowGetter ? this.declaration.findGetter(context,attrName) : null;
	if(getter!=null) {
		context = context.newInstanceContext(this, null).newChildContext();
		return getter.interpret(context);
	} else {
		return this.values[attrName];
	}
};


// don't call setters from setters, so register them
// TODO: thread local storage

var activeSetters = {};

function getActiveSetters() {
	return activeSetters;
}

ConcreteInstance.prototype.setMember = function(context, attrName, value) {
    if(!this.mutable)
        throw new NotMutableError();
	var stacked = getActiveSetters()[attrName] || null;
    var first = stacked==null;
    if(first)
        getActiveSetters()[attrName] = context;
	try {
		this.doSetMember(context, attrName, value, first);
	} finally {
		if(first) {
			delete getActiveSetters()[attrName];
		}
	}
};

ConcreteInstance.prototype.doSetMember = function(context, attrName, value, allowSetter) {
    var decl = context.getRegisteredDeclaration(attrName);
	var setter = allowSetter ? this.declaration.findSetter(context,attrName) : null;
	if(setter!=null) {
		// use attribute name as parameter name for incoming value
		context = context.newInstanceContext(this, null).newChildContext();
		context.registerValue(new Variable(attrName, decl.getType()));
		context.setValue(attrName, value);
		value = setter.interpret(context);
	}
    value = this.autocast(decl, value);
	this.values[attrName] = value;
};

ConcreteInstance.prototype.autocast = function(decl, value) {
    if(value instanceof Integer && decl.getType()==DecimalType.instance)
        value = new Decimal(value.DecimalValue());
    return value;
};

ConcreteInstance.prototype.equals = function(obj) {
	if(obj==this) {
		return true;
	} else if(!(obj instanceof ConcreteInstance)) {
		return false;
	} else {
		var names = Object.getOwnPropertyNames(this.values);
		var otherNames = Object.getOwnPropertyNames(obj.values);
		if(names.length!=otherNames.length) {
			return false;
		}
		for(var i=0;i<names.length;i++) {
			var v1 = this.values[names[i]] || null;
			var v2 = obj.values[names[i]];
			if(v1==v2) {
				continue;
			} else if(v1==null || v2==null) {
				return false;
			} else {
				if(v1.equals) {
					if(!v1.equals(v2)) {
						return false;
					}
				} else if(v2.equals) {
					if(!v2.equals(v1)) {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		return true;
	}
};

ConcreteInstance.prototype.toString = function() {
	var props = [];
	for(p in this.values) {
		props.push(p + ":" + this.values[p].toString())
	}
	return "{" + props.join(", ") + "}";
};



ConcreteInstance.prototype.Multiply = function(context, value) {
    try {
        return this.interpretOperator(context, value, Operator.MULTIPLY);
    } catch(e) {
        return Value.prototype.Multiply.call(this, context, value);
    }
};


ConcreteInstance.prototype.Divide = function(context, value) {
    try {
        return this.interpretOperator(context, value, Operator.DIVIDE);
    } catch(e) {
        return Value.prototype.Divide.call(this, context, value);
    }
};


ConcreteInstance.prototype.IntDivide = function(context, value) {
    try {
        return this.interpretOperator(context, value, Operator.IDIVIDE);
    } catch(e) {
        return Value.prototype.IntDivide.call(this, context, value);
    }
};


ConcreteInstance.prototype.Modulo = function(context, value) {
    try {
        return this.interpretOperator(context, value, Operator.MODULO);
    } catch(e) {
        return Value.prototype.Modulo.call(this, context, value);
    }
};


ConcreteInstance.prototype.Add = function(context, value) {
    try {
        return this.interpretOperator(context, value, Operator.PLUS);
    } catch(e) {
        return Value.prototype.Add.call(this, context, value);
    }
};


ConcreteInstance.prototype.Subtract = function(context, value) {
    try {
        return this.interpretOperator(context, value, Operator.MINUS);
    } catch(e) {
        return Value.prototype.Subtract.call(this, context, value);
    }
};


ConcreteInstance.prototype.interpretOperator = function(context, value, operator) {
    var decl = this.declaration.findOperator(context, operator, value.type);
    context = context.newInstanceContext(this);
    var local = context.newChildContext();
    decl.registerArguments(local);
    var arg = decl.args[0];
    local.setValue(arg.name, value);
    return decl.interpret(local);
};

exports.ConcreteInstance = ConcreteInstance;

