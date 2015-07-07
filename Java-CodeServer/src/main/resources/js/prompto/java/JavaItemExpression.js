var JavaSelectorExpression = require("./JavaSelectorExpression").JavaSelectorExpression;

function JavaItemExpression(item) {
	JavaSelectorExpression.call(this);
	this.item = item || null;
	return this;
}

JavaItemExpression.prototype = Object.create(JavaSelectorExpression.prototype);
JavaItemExpression.prototype.constructor = JavaItemExpression;

/*
	@Override
	public IType check(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object evaluate(Context context) {
		// TODO Auto-generated method stub
		return null;
	}
*/

JavaItemExpression.prototype.toString = function() {
	return this.parent.toString() + "[" + this.item.toString() + "]";
};

exports.JavaItemExpression = JavaItemExpression;