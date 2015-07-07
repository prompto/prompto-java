var JavaExpression = require("./JavaExpression").JavaExpression;

function JavaSelectorExpression(parent) {
	JavaExpression.call(this);
	this.parent = parent || null;
	return this;
}
JavaSelectorExpression.prototype = Object.create(JavaExpression.prototype);
JavaSelectorExpression.prototype.constructor = JavaSelectorExpression;

exports.JavaSelectorExpression = JavaSelectorExpression;
