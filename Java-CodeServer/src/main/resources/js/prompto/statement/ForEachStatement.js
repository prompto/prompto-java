var BaseStatement = require("./BaseStatement").BaseStatement;
var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var TransientVariable = require("../runtime/TransientVariable").TransientVariable;
var IntegerType = require("../type/IntegerType").IntegerType;
var Integer = require("../value/Integer").Integer;

function ForEachStatement(v1, v2, source, instructions) {
	BaseStatement.call(this);
	this.v1 = v1 || null;
	this.v2 = v2 || null;
	this.source = source;
	this.instructions = instructions;
	return this;
}

ForEachStatement.prototype = Object.create(BaseStatement.prototype);
ForEachStatement.prototype.constructor = ForEachStatement;

ForEachStatement.prototype.check = function(context) {
	var srcType = this.source.check(context);
	var elemType = srcType.checkIterator(context);
	return this.checkItemIterator(elemType, context);
};

ForEachStatement.prototype.checkItemIterator = function(elemType, context) {
	var child = context.newChildContext();
	var itemName = this.v2 == null ? this.v1 : this.v2;
	context.registerValue(new TransientVariable(itemName, elemType));
	if (this.v2 != null) {
		context.registerValue(new TransientVariable(this.v1, IntegerType.instance));
	}
	return this.instructions.check(child);
};

ForEachStatement.prototype.interpret = function(context) {
	var srcType = this.source.check(context);
	var elemType = srcType.checkIterator(context);
	return this.evaluateItemIterator(elemType, context);
};

ForEachStatement.prototype.evaluateItemIterator = function(elemType, context) {
	if (this.v2 == null) {
		return this.evaluateItemIteratorNoIndex(elemType, context);
	} else {
		return this.evaluateItemIteratorWithIndex(elemType, context);
	}
};

ForEachStatement.prototype.evaluateItemIteratorNoIndex = function(elemType, context) {
	var src = this.source.interpret(context);
	var iterator = src.getIterator(context);
	while (iterator.hasNext()) {
		var child = context.newChildContext();
		child.registerValue(new TransientVariable(this.v1, elemType));
        var value = iterator.next();
		child.setValue(this.v1, value);
		value = this.instructions.interpret(child);
		if (value != null) {
			return value;
		}
	}
	return null;
};

ForEachStatement.prototype.evaluateItemIteratorWithIndex = function(elemType, context) {
	var src = this.source.interpret(context);
	var iterator = src.getIterator(context);
	var index = 0;
	while (iterator.hasNext()) {
		var child = context.newChildContext();
		child.registerValue(new TransientVariable(this.v2, elemType));
		child.setValue(this.v2, iterator.next());
		child.registerValue(new TransientVariable(this.v1, IntegerType.instance));
		child.setValue(this.v1, new Integer(++index));
		var value = this.instructions.interpret(child);
		if (value != null) {
			return value;
		}
	}
	return null;
};

ForEachStatement.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

ForEachStatement.prototype.toODialect = function(writer) {
    writer.append("for each (");
    writer.append(this.v1);
    if(this.v2!=null) {
        writer.append(", ");
        writer.append(this.v2);
    }
    writer.append(" in ");
    this.source.toDialect(writer);
    writer.append(")");
    var oneLine = this.instructions.length==1 && (this.instructions[0] instanceof SimpleStatement);
    if(!oneLine)
        writer.append(" {");
    writer.newLine();
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
    if(!oneLine) {
        writer.append("}");
        writer.newLine();
    }
}

ForEachStatement.prototype.toEDialect = function(writer) {
    writer.append("for each ");
    writer.append(this.v1);
    if(this.v2!=null) {
        writer.append(", ");
        writer.append(this.v2);
    }
    writer.append(" in ");
    this.source.toDialect(writer);
    writer.append(":");
    writer.newLine();
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
}

ForEachStatement.prototype.toSDialect = function(writer) {
    writer.append("for ");
    writer.append(this.v1);
    if(this.v2!=null) {
        writer.append(", ");
        writer.append(this.v2);
    }
    writer.append(" in ");
    this.source.toDialect(writer);
    writer.append(":");
    writer.newLine();
    writer.indent();
    this.instructions.toDialect(writer);
    writer.dedent();
}

exports.ForEachStatement = ForEachStatement;