var CSharpExpression = require("./CSharpExpression").CSharpExpression;
var ThisExpression = require("../expression/ThisExpression").ThisExpression;

function CSharpThisExpression() {
    CSharpExpression.call(this);
	this.expression = new ThisExpression();
	return this;
}

CSharpThisExpression.prototype = Object.create(CSharpExpression.prototype);
CSharpThisExpression.prototype.constructor = CSharpThisExpression;

CSharpThisExpression.prototype.toDialect = function(writer) {
    return this.expression.toDialect(writer);
};

CSharpThisExpression.prototype.toString = function() {
	return this.expression.toString();
};

exports.CSharpThisExpression = CSharpThisExpression;