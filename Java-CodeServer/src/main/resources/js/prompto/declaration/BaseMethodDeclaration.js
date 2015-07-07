var BaseDeclaration = require("./BaseDeclaration").BaseDeclaration;
var ArgumentList = require("../grammar/ArgumentList").ArgumentList;
var VoidType = require("../type/VoidType").VoidType;
var CategoryType = null;;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var PrestoError = require("../error/PrestoError").PrestoError;
var ArgumentAssignmentList = require("../grammar/ArgumentAssignmentList").ArgumentAssignmentList;
var ArgumentAssignment = require("../grammar/ArgumentAssignment").ArgumentAssignment;
var Specificity = require("../grammar/Specificity").Specificity;

exports.resolve = function() {
	CategoryType = require("../type/CategoryType").CategoryType;
}

function BaseMethodDeclaration(name, args, returnType) {
	BaseDeclaration.call(this, name);
    this.memberOf = null;
	this.args = args || new ArgumentList();
	this.returnType = returnType || VoidType.instance;
	return this;
}

BaseMethodDeclaration.prototype  = Object.create(BaseDeclaration.prototype);
BaseMethodDeclaration.prototype.constructor = BaseMethodDeclaration;

BaseMethodDeclaration.prototype.getProto = function(context) {
	var s = "";
	for(var i=0;i<this.args.length;i++) {
		if(i>0) {
			s += "/";
		}
		s += this.args[i].getProto(context);
	}
	return s;
};



BaseMethodDeclaration.prototype.register = function(context) {
	context.registerMethodDeclaration(this);
};

BaseMethodDeclaration.prototype.registerArguments = function(context) {
	if(this.args!=null) {
		this.args.register(context);
	}
};

BaseMethodDeclaration.prototype.isAssignableTo = function(context, assignments, checkInstance) {
	try {
		var local = context.newLocalContext();
		this.registerArguments(local);
		var assignmentsList = new ArgumentAssignmentList(assignments);
		for(var i=0;i<this.args.length;i++) {
			var argument = this.args[i];
			var idx = assignmentsList.findIndex(argument.name);
            var assignment = idx>=0 ? assignmentsList[idx] : null;
            if(assignment==null) { // missing argument
                if(argument.defaultExpression!=null)
                    assignment = new ArgumentAssignment(argument, argument.defaultExpression);
				else
                    return false;
			}
			if(!this.isAssignableToArgument(local, argument, assignment, checkInstance)) {
				return false;
			}
			if(idx>=0)
                assignmentsList.remove(idx);
		}
		return assignmentsList.length===0;
	} catch (e) {
		if(e instanceof SyntaxError) {
			return false;
		} else {
			throw e;
		}
	}
};

BaseMethodDeclaration.prototype.isAssignableToArgument = function(context, argument, assignment, checkInstance) {
	return this.computeSpecificity(context, argument, assignment, checkInstance)!==Specificity.INCOMPATIBLE;
};

BaseMethodDeclaration.prototype.computeSpecificity = function(context, argument, assignment, checkInstance) {
	try {
		var required = argument.getType(context);
		var actual = assignment.expression.check(context);
		// retrieve actual runtime type
		if(checkInstance && (actual instanceof CategoryType)) {
			var value = assignment.expression.interpret(context.getCallingContext());
			if(value && value.getType) {
				actual = value.getType();
			}
		}
		if(actual.equals(required)) {
			return Specificity.EXACT;
		} else if(actual.isAssignableTo(context, required)) {
			return Specificity.INHERITED;
		}
		actual = assignment.resolve(context,this,checkInstance).check(context);
		if(actual.isAssignableTo(context, required)) {
			return Specificity.RESOLVED;
		}
	} catch(error) {
		if(!(error instanceof PrestoError )) {
			throw error;
		}
	}
	return Specificity.INCOMPATIBLE;
};

BaseMethodDeclaration.prototype.isEligibleAsMain = function() {
	return false;
};

exports.BaseMethodDeclaration = BaseMethodDeclaration;


