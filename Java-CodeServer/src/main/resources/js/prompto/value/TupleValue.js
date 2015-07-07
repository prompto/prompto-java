var BaseValueList = require("./BaseValueList").BaseValueList;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var TupleType = null;

exports.resolve = function() {
    TupleType = require("../type/TupleType").TupleType;
};

function TupleValue(items, item) {
	BaseValueList.call(this, TupleType.instance, items, item);
	return this;
}

TupleValue.prototype = Object.create(BaseValueList.prototype);
TupleValue.prototype.constructor = TupleValue;

TupleValue.prototype.toString = function() {
	return "(" + this.items.join(", ") + ")";
};

TupleValue.prototype.toDialect = function(writer) {
    writer.append('(');
    BaseValueList.prototype.toDialect.call(this, writer);
    writer.append(')');
};

/*

@Override
protected TupleValue newInstance(List<Object> items) {
	return new TupleValue(items);
}

*/

TupleValue.prototype.Add = function(context, value) {
	if (value instanceof BaseValueList) {
		var items = this.items.concat(value.items);
		return new TupleValue(items);
	} else {
		throw new SyntaxError("Illegal: Tuple + " + typeof(value));
	}
};

exports.TupleValue = TupleValue;