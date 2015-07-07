var JavaExpression = require("./JavaExpression").JavaExpression;
var ThisExpression = require("../expression/ThisExpression").ThisExpression;

function JavaThisExpression() {
    JavaExpression.call(this);
	this.expression = new ThisExpression();
	return this;
}

JavaThisExpression.prototype = Object.create(JavaExpression.prototype);
JavaThisExpression.prototype.constructor = JavaThisExpression;

JavaThisExpression.prototype.toString = function() {
	return this.expression.toString();
};

JavaThisExpression.prototype.toDialect = function(writer) {
    this.expression.toDialect(writer);
};

exports.JavaThisExpression = JavaThisExpression;