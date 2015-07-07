var JavaScriptSelectorExpression = require("./JavaScriptSelectorExpression").JavaScriptSelectorExpression;

function JavaScriptItemExpression(item) {
	JavaScriptSelectorExpression.call(this);
	this.item = item || null;
	return this;
}

JavaScriptItemExpression.prototype = Object.create(JavaScriptSelectorExpression.prototype);
JavaScriptItemExpression.prototype.constructor = JavaScriptItemExpression;

JavaScriptItemExpression.prototype.toString = function() {
	return this.parent.toString() + "[" + this.item.toString() + "]";
};

exports.JavaScriptItemExpression = JavaScriptItemExpression;