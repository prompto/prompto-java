var CollectionType = require("../type/CollectionType").CollectionType;
var SwitchCase = require("./SwitchCase").SwitchCase;

function CollectionSwitchCase(expression, instructions) {
	SwitchCase.call(this, expression,instructions);
	return this;
};

CollectionSwitchCase.prototype = Object.create(SwitchCase.prototype);
CollectionSwitchCase.prototype.constructor = CollectionSwitchCase;

CollectionSwitchCase.prototype.checkSwitchType = function(context, type) {
	var thisType = this.expression.check(context);
	if(thisType instanceof CollectionType) {
		thisType = thisType.itemType;
	}
	if(!thisType.isAssignableTo(context, type)) {
		throw new SyntaxError("Cannot assign:" + thisType.name + " to:" + type.name);
	}
};

CollectionSwitchCase.prototype.matches = function(context, value) {
	var thisValue = this.expression.interpret(context);
	if(thisValue.hasItem) {
		return thisValue.hasItem(context, value);
	} else {
		return false;
	}
};


CollectionSwitchCase.prototype.caseToPDialect = function(writer) {
    this.caseToEDialect(writer);
}


CollectionSwitchCase.prototype.caseToODialect = function(writer) {
    writer.append("case in ");
    this.expression.toDialect(writer);
    writer.append(":\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
}


CollectionSwitchCase.prototype.caseToEDialect = function(writer) {
    writer.append("when in ");
    this.expression.toDialect(writer);
    writer.append(":\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
}


CollectionSwitchCase.prototype.catchToODialect = function(writer) {
    writer.append("catch (");
    this.expression.toDialect(writer);
    writer.append(") {\n");
    writer.indent();
    this.statements.toDialect(writer);
    writer.dedent();
    writer.append("} ");
}


CollectionSwitchCase.prototype.catchToPDialect = function(writer) {
    writer.append("except in ");
    expression.toDialect(writer);
    writer.append(":\n");
    writer.indent();
    statements.toDialect(writer);
    writer.dedent();
}


CollectionSwitchCase.prototype.catchToEDialect = function(writer) {
    caseToEDialect(writer); // no difference
}

exports.CollectionSwitchCase = CollectionSwitchCase;
