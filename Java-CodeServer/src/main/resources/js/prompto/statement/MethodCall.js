var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var MethodFinder = require("../runtime/MethodFinder").MethodFinder;
var ArgumentAssignmentList = require("../grammar/ArgumentAssignmentList").ArgumentAssignmentList;
var AbstractMethodDeclaration = require("../declaration/AbstractMethodDeclaration").AbstractMethodDeclaration;
var ConcreteMethodDeclaration = require("../declaration/ConcreteMethodDeclaration").ConcreteMethodDeclaration;
var ClosureDeclaration = require("../declaration/ClosureDeclaration").ClosureDeclaration;
var ClosureValue = require("../value/ClosureValue").ClosureValue;
var NotMutableError = require("../error/NotMutableError").NotMutableError;
var PrestoError = require("../error/PrestoError").PrestoError;
var Dialect = require("../parser/Dialect").Dialect;
var Bool = require("../value/Bool").Bool;

function MethodCall(method, assignments) {
	SimpleStatement.call(this);
	this.method = method;
	this.assignments = assignments || null;
	return this;
}

MethodCall.prototype = Object.create(SimpleStatement.prototype);
MethodCall.prototype.constructor = MethodCall;

MethodCall.prototype.toDialect = function(writer) {
    if (this.requiresInvoke(writer))
        writer.append("invoke: ");
    this.method.toDialect(writer);
    if (this.assignments != null)
        this.assignments.toDialect(writer);
    else if (writer.dialect!= Dialect.E)
        writer.append("()");
};

MethodCall.prototype.requiresInvoke = function(writer) {
    if (writer.dialect != Dialect.E)
        return false;
    if (this.assignments != null && this.assignments.length > 0)
        return false;
    try {
        finder = new MethodFinder(writer.context, this);
        var declaration = finder.findMethod(false);
        /* if method is abstract, need to prefix with invoke */
        if(declaration instanceof AbstractMethodDeclaration)
            return true;
    } catch(e) {
        // ok
    }
    return false;
}

MethodCall.prototype.toString = function() {
	return this.method.toString() + " " + (this.assignments!==null ? this.assignments.toString() : "");
};


MethodCall.prototype.check = function(context) {
	var finder = new MethodFinder(context,this);
	var declaration = finder.findMethod(false);
    var local = this.method.newLocalCheckContext(context, declaration);
    return this.checkDeclaration(declaration, context, local);
};

MethodCall.prototype.checkDeclaration = function(declaration, parent, local) {
	if(declaration instanceof ConcreteMethodDeclaration && declaration.mustBeBeCheckedInCallContext(parent)) {
		return this.fullCheck(declaration, parent, local);
	} else {
		return this.lightCheck(declaration, parent, local);
	}
};

MethodCall.prototype.lightCheck = function(declaration, parent, local) {
	declaration.registerArguments(local);
	return declaration.check(local);
};

MethodCall.prototype.fullCheck = function(declaration, parent, local) {
	try {
		var assignments = this.makeAssignments(parent,declaration);
		declaration.registerArguments(local);
		for(var i=0;i<assignments.length;i++) {
			var assignment = assignments[i];
			var expression = assignment.resolve(local,declaration,true);
			var value = assignment.argument.checkValue(parent,expression);
			local.setValue(assignment.name, value);
		}
		return declaration.check(local);
	} catch (e) {
		if(e instanceof PrestoError) {
			throw new SyntaxError(e.message);
		}
	}
};

MethodCall.prototype.makeAssignments = function(context, declaration) {
	if(this.assignments==null) {
		return new ArgumentAssignmentList();
	} else {
		return this.assignments.makeAssignments(context, declaration);
	}
};

MethodCall.prototype.interpret = function(context) {
	var declaration = this.findDeclaration(context);
	var local = this.method.newLocalContext(context, declaration);
	declaration.registerArguments(local);
	var assignments = this.makeAssignments(context,declaration);
	for(var i=0;i<assignments.length;i++) {
		var assignment = assignments[i];
		var expression = assignment.resolve(local, declaration, true);
        var argument = assignment.argument;
		var value = argument.checkValue(context,expression);
        if(value!=null && value.mutable && !argument.mutable)
            throw new NotMutableError();
		local.setValue(assignment.name, value);
	}
	return declaration.interpret(local, true);
};

MethodCall.prototype.interpretAssert = function(context, testMethodDeclaration) {
    var value = this.interpret(context);
    if(value instanceof Bool)
        return value.value;
    else {
        var writer = new CodeWriter(this.dialect, context);
        this.toDialect(writer);
        throw new SyntaxError("Cannot test '" + writer.toString() + "'");
    }
};

MethodCall.prototype.findDeclaration = function(context) {
	// look for method as value
	try {
		var o = context.getValue(this.method.name);
		if(o instanceof ClosureValue) {
			return new ClosureDeclaration(o);
		}
	} catch (e) {
		if(!(e instanceof PrestoError)) {
			throw e;
		}
	}
	// look for declared method
	var finder = new MethodFinder(context,this);
	return finder.findMethod(true);
};

exports.MethodCall = MethodCall;