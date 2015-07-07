var BaseSwitchStatement = require("./BaseSwitchStatement").BaseSwitchStatement;
var ErrorVariable = require("../runtime/ErrorVariable").ErrorVariable;
var EnumeratedCategoryType = require("../type/EnumeratedCategoryType").EnumeratedCategoryType;
var VoidType = require("../type/VoidType").VoidType;
var ExecutionError = require("../error/ExecutionError").ExecutionError;

function SwitchErrorStatement(errorName, instructions, handlers, anyStmts, alwaysStmts) {
	BaseSwitchStatement.call(this, handlers, anyStmts);
	this.errorName = errorName;
	this.instructions = instructions || null;
	this.alwaysInstructions = alwaysStmts || null;
	return null;
}

SwitchErrorStatement.prototype = Object.create(BaseSwitchStatement.prototype);
SwitchErrorStatement.prototype.constructor = SwitchErrorStatement;

SwitchErrorStatement.prototype.checkSwitchCasesType = function(context) {
	var local = context.newLocalContext();
	local.registerValue(new ErrorVariable(this.errorName));
	BaseSwitchStatement.prototype.checkSwitchCasesType.call(this, local);
};

SwitchErrorStatement.prototype.checkSwitchType = function(context) {
	return new EnumeratedCategoryType("Error");
};

SwitchErrorStatement.prototype.collectReturnTypes = function(context, types) {
	var type = this.instructions.check(context);
	if(type!=VoidType.instance) {
		types[type.name] = type;
	}
	var local = context.newLocalContext();
	local.registerValue(new ErrorVariable(this.errorName));
	BaseSwitchStatement.prototype.collectReturnTypes.call(this, local, types);
	if(this.alwaysInstructions!=null) {
		type = this.alwaysInstructions.check(context);
		if(type!=VoidType.instance) {
			types[type.name] = type;
		}
	}
};

SwitchErrorStatement.prototype.interpret = function(context) {
	var result = null;
	try {
		result = this.instructions.interpret(context);
	} catch ( e) {
		if(e instanceof ExecutionError) {
			var switchValue = this.populateError(e, context);
			result = this.interpretSwitch(context, switchValue, e);
		} else {
			throw e;
		}
	} finally {
		if(this.alwaysInstructions!=null) {
			this.alwaysInstructions.evaluate(context);
		}
	}
	return result;
};

SwitchErrorStatement.prototype.populateError = function(e, context) {
	var error = e.getExpression(context);
	if(error==null) {
		var args = new ArgumentAssignmentList();
		args.add(new ArgumentAssignment(new UnresolvedArgument("name"), new TextLiteral(typeof(e))));
		args.add(new ArgumentAssignment(new UnresolvedArgument("text"), new TextLiteral(e.message)));
		error = new ConstructorExpression(new CategoryType("Error"), args);
	}
	if(context.getRegisteredValue(this.errorName)==null) {
		context.registerValue(new ErrorVariable(this.errorName));
	}
	if(error.interpret) {
		error = error.interpret(context);
	}
	context.setValue(this.errorName, error);
	return error;
};

SwitchErrorStatement.prototype.toODialect = function(writer) {
    writer.append("try (");
    writer.append(this.errorName);
    writer.append(") {\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
    writer.append("} ");
    for(var i=0;i<this.switchCases.length;i++)
        this.switchCases[i].catchToODialect(writer);
    if(this.defaultCase!=null) {
        writer.append("catch(any) {\n");
        writer.indent();
        this.defaultCase.toDialect(writer);
        writer.dedent();
        writer.append("}");
    }
    if(this.alwaysInstructions!=null) {
        writer.append("finally {\n");
        writer.indent();
        this.alwaysInstructions.toDialect(writer);
        writer.dedent();
        writer.append("}");
    }
    writer.newLine();
}

SwitchErrorStatement.prototype.toSDialect = function(writer) {
    writer.append("try ");
    writer.append(this.errorName);
    writer.append(":\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
    for(var i=0;i<this.switchCases.length;i++)
        this.switchCases[i].catchToPDialect(writer);
    if(this.defaultCase!=null) {
        writer.append("except:\n");
        writer.indent();
        this.defaultCase.toDialect(writer);
        writer.dedent();
    }
    if(this.alwaysInstructions!=null) {
        writer.append("finally:\n");
        writer.indent();
        this.alwaysInstructions.toDialect(writer);
        writer.dedent();
    }
    writer.newLine();
}

SwitchErrorStatement.prototype.toEDialect = function(writer) {
    writer.append("switch on ");
    writer.append(this.errorName);
    writer.append(" doing:\n");
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
    for(var i=0;i<this.switchCases.length;i++)
        this.switchCases[i].catchToEDialect(writer);
    if(this.defaultCase!=null) {
        writer.append("when any:\n");
        writer.indent();
        this.defaultCase.toDialect(writer);
        writer.dedent();
    }
    if(this.alwaysInstructions!=null) {
        writer.append("always:\n");
        writer.indent();
        this.alwaysInstructions.toDialect(writer);
        writer.dedent();
    }
}

exports.SwitchErrorStatement = SwitchErrorStatement;
