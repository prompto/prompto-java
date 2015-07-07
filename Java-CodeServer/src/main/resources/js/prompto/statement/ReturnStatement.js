var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var VoidResult = require("../runtime/VoidResult").VoidResult;
var VoidType = require("../type/VoidType").VoidType;

function ReturnStatement(expression) {
	SimpleStatement.call(this);
	this.expression = expression || null;
	return this;
}

ReturnStatement.prototype = Object.create(SimpleStatement.prototype);
ReturnStatement.prototype.constructor = ReturnStatement;

ReturnStatement.prototype.toString = function() {
	return "return " + this.expression==null ? "" : this.expression.toString();
}

ReturnStatement.prototype.toDialect = function(writer) {
    writer.append("return");
    if(this.expression!=null) {
        writer.append(" ");
        this.expression.toDialect(writer);
    }
};


ReturnStatement.prototype.equals = function(obj) {
	if(obj==this) {
		return true;
	}
	if(obj==null) {
		return false;
	}
	if(!(obj instanceof ReturnStatement)) {
		return false;
	}
    if(this.expression==obj.expression)
        return true;
    else if(this.expression==null || obj.expression==null)
        return false;
	else
        return this.expression.equals(obj.expression);
};

ReturnStatement.prototype.check = function(context) {
	return this.expression==null ? VoidType.instance : this.expression.check(context);
};

ReturnStatement.prototype.interpret= function(context) {
    if(this.expression==null)
        return VoidResult.instance;
    else
        return this.expression.interpret(context);
};

exports.ReturnStatement = ReturnStatement;
