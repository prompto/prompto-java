var ObjectList = require("../utils/ObjectList").ObjectList;

function JavaExpressionList(expression) {
	ObjectList.call(this);
	expression = expression || null;
	if(expression!==null) {
		this.add(expression);
	}
	return this;
}

JavaExpressionList.prototype = Object.create(ObjectList.prototype);
JavaExpressionList.prototype.constructor = JavaExpressionList;

JavaExpressionList.prototype.toDialect = function(writer) {
    if(this.length>0) {
        for(var i=0;i<this.length;i++) {
            var exp = this[i];
            exp.toDialect(writer);
            writer.append(", ");
        }
        writer.trimLast(2);
    }
};

exports.JavaExpressionList = JavaExpressionList;