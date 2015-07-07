var JavaScriptExpression = require("./JavaScriptExpression").JavaScriptExpression;

function JavaScriptSelectorExpression(parent) {
	JavaScriptExpression.call(this);
	this.parent = parent || null;
	return this;
}
JavaScriptSelectorExpression.prototype = Object.create(JavaScriptExpression.prototype);
JavaScriptSelectorExpression.prototype.constructor = JavaScriptSelectorExpression;

exports.JavaScriptSelectorExpression = JavaScriptSelectorExpression;
