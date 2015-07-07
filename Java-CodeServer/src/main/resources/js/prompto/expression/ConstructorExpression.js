var CategoryType = null;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var NotMutableError = require("../error/NotMutableError").NotMutableError;
var ArgumentAssignment = require("../grammar/ArgumentAssignment").ArgumentAssignment;
var ArgumentAssignmentList = require("../grammar/ArgumentAssignmentList").ArgumentAssignmentList;

exports.resolve = function() {
	CategoryType = require("../type/CategoryType").CategoryType;
};


function ConstructorExpression(type, mutable, assignments) {
	this.type = type;
    this.mutable = mutable;
	this.copyFrom = null;
	this.assignments = null;
	this.setAssignments(assignments);
	return this;
}

ConstructorExpression.prototype.setAssignments = function(assignments) {
	this.assignments = assignments;
	// first anonymous argument is copyFrom
	if(assignments!==null && assignments.length>0 && assignments[0].argument===null) {
		this.copyFrom = assignments[0].expression;
		this.assignments.remove(0);
	}
};

ConstructorExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
}

ConstructorExpression.prototype.toSDialect = function(writer) {
    this.toODialect(writer);
}

ConstructorExpression.prototype.toODialect = function(writer) {
    if(this.mutable)
        writer.append("mutable ");
    writer.append(this.type.name);
    var assignments = new ArgumentAssignmentList();
    if (this.copyFrom != null)
        assignments.add(new ArgumentAssignment(null, this.copyFrom));
    if(this.assignments!=null)
        assignments.addAll(this.assignments);
    assignments.toDialect(writer);
};

ConstructorExpression.prototype.toEDialect = function(writer) {
    if(this.mutable)
        writer.append("mutable ");
    writer.append(this.type.name);
    if (this.copyFrom != null) {
        writer.append(" from ");
        writer.append(this.copyFrom.toString());
        if (this.assignments != null && this.assignments.length>0)
            writer.append(",");
    }
    if (this.assignments != null)
        this.assignments.toDialect(writer);
};

ConstructorExpression.prototype.check = function(context) {
	// need to update type, since it was arbitrarily set to CategoryType
	var cd = context.getRegisteredDeclaration(this.type.name);
	if(cd==null) {
		throw new SyntaxError("Unknown category " + this.type.name);
	}
	this.type = cd.getType();
	cd.checkConstructorContext(context);
	if(this.copyFrom!=null) {
		var cft = this.copyFrom.check(context);
		if(!(cft instanceof CategoryType)) {
			throw new SyntaxError("Cannot copy from " + cft.getName());
		}
	}
	if(this.assignments!=null) {
		for(var i=0; i<this.assignments.length; i++) {
			var assignment = this.assignments[i];
			if(!cd.hasAttribute(context, assignment.name)) {
				throw new SyntaxError("\"" + assignment.name + "\" is not an attribute of " + this.type.name);
			}
			assignment.check(context);
		}
	}
	return this.type;
};

ConstructorExpression.prototype.interpret = function(context) {
	var instance = this.type.newInstance(context);
    instance.mutable = true;
	if(this.copyFrom!=null) {
		var copyObj = this.copyFrom.interpret(context);
		if((copyObj.getMember || null)!=null) {
			var cd = context.getRegisteredDeclaration(this.type.name);
			var names = copyObj.getAttributeNames();
			for(var i=0;i<names.length;i++) {
				var name = names[i]
				if(cd.hasAttribute(context, name)) {
                    var value = copyObj.getMember(context, name);
                    if(value!=null && value.mutable && !this.mutable)
                        throw new NotMutableError();
					instance.setMember(context, name, value);
				}
			}
		}
	}
	if(this.assignments!=null) {
		for(var i=0;i<this.assignments.length;i++) {
			var assignment = this.assignments[i];
			var value = assignment.expression.interpret(context);
            if(value!=null && value.mutable && !this.mutable)
                throw new NotMutableError();
			instance.setMember(context, assignment.name, value);
		}
	}
    instance.mutable = this.mutable;
	return instance;
};

exports.ConstructorExpression = ConstructorExpression;
