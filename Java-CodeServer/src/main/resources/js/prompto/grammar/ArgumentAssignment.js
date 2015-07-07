var SyntaxError = require("../error/SyntaxError").SyntaxError;
var ContextualExpression = require("../value/ContextualExpression").ContextualExpression;
var CategoryType = null;
var MemberSelector = require("../expression/MemberSelector").MemberSelector;
var Variable = require("../runtime/Variable").Variable;
var VoidType = require("../type/VoidType").VoidType;

exports.resolve = function() {
    CategoryType = require("../type/CategoryType").CategoryType;
}

function ArgumentAssignment(argument, expression) {
	this.argument = argument;
	this.expression = expression;
	return this;
}

Object.defineProperty(ArgumentAssignment.prototype, "name", {
	get : function() {
		return this.argument.name;
	}
});

ArgumentAssignment.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

ArgumentAssignment.prototype.toODialect = function(writer) {
    if(this.argument!=null) {
        writer.append(this.argument.name);
        writer.append(" = ");
    }
    this.expression.toDialect(writer);
};

ArgumentAssignment.prototype.toSDialect = function(writer) {
    if(this.argument!=null) {
        writer.append(this.argument.name);
        writer.append(" = ");
    }
    this.expression.toDialect(writer);
};

ArgumentAssignment.prototype.toEDialect = function(writer) {
    this.expression.toDialect(writer);
    if(this.argument!=null) {
        writer.append(" as ");
        writer.append(this.argument.name);
    }
};

ArgumentAssignment.prototype.toString = function() {
    if(this.argument===null) {
        return this.expression.toString();
    } else {
        return this.name + " = " + this.expression.toString();
    }
};

ArgumentAssignment.prototype.equals = function(obj) {
	if(obj==this) {
		return true;
	} else if(obj==null) {
		return false;
	} else if(!(obj instanceof ArgumentAssignment)) {
		return false;
	} else {
		return this.argument.equals(obj.argument) &&
			this.expression.equals(other.expression);
	}
};

ArgumentAssignment.prototype.check = function(context) {
	var actual = context.getRegisteredValue(this.argument.name);
	if(actual==null) {
        var actualType = this.expression.check(context);
		context.registerValue(new Variable(this.argument.name, actualType));
	} else {
		// need to check type compatibility
		var actualType = actual.getType(context);
		var newType = this.expression.check(context);
		newType.checkAssignableTo(context,actualType);
	}
	return VoidType.instance;
};

ArgumentAssignment.prototype.evaluate = function(context) {
	if(context.getRegisteredValue(this.argument.name)==null) {
		context.registerValue(new Variable(this.argument.name, this.expression));
	}
	context.setValue(this.argument.name, this.expression.interpret(context));
	return null;
};

ArgumentAssignment.prototype.resolve = function(context, methodDeclaration, checkInstance) {
	// since we support implicit members, it's time to resolve them
	var name = this.argument.name;
	var expression = this.expression;
	var argument = methodDeclaration.args.find(name);
	var required = argument.getType(context);
	var actual = expression.check(context.getCallingContext());
	if(checkInstance && actual instanceof CategoryType) {
		var value = expression.interpret(context.getCallingContext());
		if(value && value.getType) {
			actual = value.getType();
		}
	}
	if(!actual.isAssignableTo(context, required) && (actual instanceof CategoryType)) {
		expression = new MemberSelector(expression, name);
	}
	return expression;
};

ArgumentAssignment.prototype.makeAssignment = function(context, declaration) {
	var argument = this.argument;
	// when 1st argument, can be unnamed
	if(argument===null) {
		if(declaration.args.length==0) {
			throw new SyntaxError("Method has no argument");
		}
		argument = declaration.args[0];
	} else {
		argument = declaration.args.find(this.name);
	}
	if(argument==null) {
		throw new SyntaxError("Method has no argument:" + this.name);
	}
	var expression = new ContextualExpression(context,this.expression);
	return new ArgumentAssignment(argument,expression);
};

exports.ArgumentAssignment = ArgumentAssignment;

