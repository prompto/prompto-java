var JavaSelectorExpression = require("./JavaSelectorExpression").JavaSelectorExpression;
var JavaExpressionList = require("./JavaExpressionList").JavaExpressionList;

function JavaMethodExpression(name, args) {
	JavaSelectorExpression.call(this);
	this.name = name;
	this.args = args || new JavaExpressionList();
	return this;
}

JavaMethodExpression.prototype = Object.create(JavaSelectorExpression.prototype);
JavaMethodExpression.prototype.constructor = JavaMethodExpression;


JavaMethodExpression.prototype.toString = function() {
	return this.parent.toString() + "." + this.name + "(" + this.args.toString() + ")";
};

JavaMethodExpression.prototype.toDialect = function(writer) {
    this.parent.toDialect(writer);
    writer.append('.');
    writer.append(this.name);
    writer.append('(');
    this.args.toDialect(writer);
    writer.append(')');
};

exports.JavaMethodExpression = JavaMethodExpression;