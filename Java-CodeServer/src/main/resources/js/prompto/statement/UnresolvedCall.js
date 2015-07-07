var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var UnresolvedIdentifier = require("../grammar/UnresolvedIdentifier").UnresolvedIdentifier;
var MethodCall = require("./MethodCall").MethodCall;
var MemberSelector = require("../expression/MemberSelector").MemberSelector;
var MethodSelector = require("../expression/MethodSelector").MethodSelector;
var CategoryDeclaration = require("../declaration/CategoryDeclaration").CategoryDeclaration;
var ConstructorExpression = require("../expression/ConstructorExpression").ConstructorExpression;
var CategoryType = require("../type/CategoryType").CategoryType;
var CodeWriter = require("../utils/CodeWriter").CodeWriter;
var InstanceContext = require("../runtime/Context").InstanceContext;

function UnresolvedCall(callable, assignments) {
	SimpleStatement.call(this);
	this.resolved = null;
	this.callable = callable;
	this.assignments = assignments || null;
	return this;
}

UnresolvedCall.prototype  = Object.create(SimpleStatement.prototype);
UnresolvedCall.prototype.constructor = UnresolvedCall;

UnresolvedCall.prototype.toDialect = function(writer) {
    try {
        this.resolve(writer.context);
        this.resolved.toDialect(writer);
    } catch(error) {
        this.callable.toDialect(writer);
        if(this.assignments!=null)
           this. assignments.toDialect(writer);
    }
};
	
UnresolvedCall.prototype.check = function(context) {
	this.resolve(context);
	return this.resolved.check(context);
};

UnresolvedCall.prototype.interpret = function(context) {
	this.resolve(context);
	return this.resolved.interpret(context);
};

UnresolvedCall.prototype.interpretAssert = function(context, testMethodDeclaration) {
    this.resolve(context);
    if (this.resolved.interpretAssert)
        return this.resolved.interpretAssert(context, testMethodDeclaration);
    else {
        var writer = new CodeWriter(this.dialect, context);
        this.resolved.toDialect(writer);
        throw new SyntaxError("Cannot test '" + writer.toString() + "'");
    }
};

UnresolvedCall.prototype.resolve = function(context) {
	if(this.resolved===null) {
		if(this.callable instanceof UnresolvedIdentifier) {
            this.resolved = this.resolveUnresolvedIdentifier(context);
		} else if (this.callable instanceof MemberSelector) {
            this.resolved = this.resolveMember(context);
		}
	}
};


UnresolvedCall.prototype.resolveUnresolvedIdentifier = function(context) {
	var name = this.callable.name;
    var decl = null;
    // if this happens in the context of a member method, then we need to check for category members first
    if(context.parent instanceof InstanceContext) {
        decl = this.resolveUnresolvedMember(context.parent, name);
        if(decl!=null)
            return new MethodCall(new MethodSelector(null, name), this.assignments);
    }
	decl = context.getRegisteredDeclaration(name);
	if(decl===null) {
		throw new SyntaxError("Unknown name:" + name);
	}
	if(decl instanceof CategoryDeclaration) {
		return new ConstructorExpression(new CategoryType(name), false, this.assignments);
	} else {
		return new MethodCall(new MethodSelector(null, name), this.assignments);
	}
};

UnresolvedCall.prototype.resolveUnresolvedMember = function(context, name) {
    var decl = context.getRegisteredDeclaration(context.instanceType.name);
    var methods = decl.findMemberMethods(context, name);
    if(methods!=null && methods.length>0)
        return methods;
    else
        return null;
};


UnresolvedCall.prototype.resolveMember = function(context) {
	return new MethodCall(new MethodSelector(this.callable.parent, this.callable.name), this.assignments);
};


exports.UnresolvedCall = UnresolvedCall;