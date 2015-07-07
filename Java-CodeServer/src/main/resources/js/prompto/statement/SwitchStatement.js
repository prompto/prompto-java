var BaseSwitchStatement = require("./BaseSwitchStatement").BaseSwitchStatement;

function SwitchStatement(expression, switchCases, defaultCase) {
	BaseSwitchStatement.call(this, switchCases, defaultCase);
	this.expression = expression;
}

SwitchStatement.prototype = Object.create(BaseSwitchStatement.prototype);
SwitchStatement.prototype.constructor = SwitchStatement;

SwitchStatement.prototype.checkSwitchType = function(context) {
	return this.expression.check(context);
};

SwitchStatement.prototype.interpret = function(context) {
	var switchValue = this.expression.interpret(context);
	return this.interpretSwitch(context,switchValue,null);
};

SwitchStatement.prototype.toODialect = function(writer) {
    writer.append("switch(");
    this.expression.toDialect(writer);
    writer.append(") {\n");
    for(var i=0;i<this.switchCases.length;i++)
        this.switchCases[i].caseToODialect(writer);
    if(this.defaultCase!=null) {
        writer.append("default:\n");
        writer.indent();
        this.defaultCase.toDialect(writer);
        writer.dedent();
    }
    writer.append("}\n");
}

SwitchStatement.prototype.toEDialect = function(writer) {
    writer.append("switch on ");
    this.expression.toDialect(writer);
    writer.append(":\n");
    writer.indent();
    for(var i=0;i<this.switchCases.length;i++)
        this.switchCases[i].caseToEDialect(writer);
    if(this.defaultCase!=null) {
        writer.append("otherwise:\n");
        writer.indent();
        this.defaultCase.toDialect(writer);
        writer.dedent();
    }
    writer.dedent();
}

SwitchStatement.prototype.toSDialect = function(writer) {
    writer.append("switch on ");
    this.expression.toDialect(writer);
    writer.append(":\n");
    writer.indent();
    for(var i=0;i<this.switchCases.length;i++)
        this.switchCases[i].caseToPDialect(writer);
    if(this.defaultCase!=null) {
        writer.append("otherwise:\n");
        writer.indent();
        this.defaultCase.toDialect(writer);
        writer.dedent();
    }
    writer.dedent();
};

exports.SwitchStatement = SwitchStatement;