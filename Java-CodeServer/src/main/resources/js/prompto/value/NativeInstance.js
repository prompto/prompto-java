var CategoryType = require("../type/CategoryType").CategoryType;
var Value = require("./Value").Value;

function NativeInstance(declaration, instance) {
	Value.call(this,new CategoryType(declaration.name));
	this.declaration = declaration;
	this.instance = instance || this.makeInstance();
	return this;
}

NativeInstance.prototype = Object.create(Value.prototype);
NativeInstance.prototype.constructor = NativeInstance;

NativeInstance.prototype.makeInstance = function() {
	var bound = this.declaration.getBoundFunction(true);
	return bound.prototype.constructor();
};

NativeInstance.prototype.getType = function() {
	return new CategoryType(this.declaration.name);
};

// don't call getters from getters, so register them
// TODO: thread local storage

var activeGetters = {};

function getActiveGetters() {
    return activeGetters;
}

NativeInstance.prototype.getMember = function(context, attrName) {
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

NativeInstance.prototype.doGetMember = function(context, attrName, allowGetter) {
    var getter = allowGetter ? this.declaration.findGetter(context,attrName) : null;
    if(getter!=null) {
        context = context.newInstanceContext(this, null).newChildContext();
        return getter.interpret(context);
    } else {
        var value = this.instance[attrName];
        return Value.convertFromJavaScript(value);
    }
};

// don't call setters from setters, so register them
// TODO: thread local storage

var activeSetters = {};

function getActiveSetters() {
    return activeSetters;
}

NativeInstance.prototype.setMember = function(context, attrName, value) {
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

NativeInstance.prototype.doSetMember = function(context, attrName, value, allowSetter) {
    var decl = context.getRegisteredDeclaration(attrName);
    var setter = allowSetter ? this.declaration.findSetter(context,attrName) : null;
    if(setter!=null) {
        // use attribute name as parameter name for incoming value
        context = context.newInstanceContext(this, null).newChildContext();
        context.registerValue(new Variable(attrName, decl.getType()));
        context.setValue(attrName, value);
        value = setter.interpret(context);
    }
	value = value.convertToJavaScript();
	this.instance[attrName] = value;
};


exports.NativeInstance = NativeInstance;
