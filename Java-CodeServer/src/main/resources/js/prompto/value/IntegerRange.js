var Range = require("./Range").Range;
var Integer = require("./Integer").Integer;
var IntegerType = null;

exports.resolve =function() {
    IntegerType = require("../type/IntegerType").IntegerType;
};

function IntegerRange(left, right) {
	Range.call(this, IntegerType.instance, left, right);
	return this;
}

IntegerRange.prototype = Object.create(Range.prototype);
IntegerRange.prototype.constructor = IntegerRange;

IntegerRange.prototype.size = function() {
	return 1 + this.high.IntegerValue() - this.low.IntegerValue();
};


IntegerRange.prototype.getItem = function(index) {
	var result = this.low.IntegerValue() + index - 1;
	if(result>this.high.IntegerValue()) {
		throw new IndexOutOfBoundsException();
	}
	return new Integer(result);
};

IntegerRange.prototype.newInstance = function(left, right) {
	return new IntegerRange(left, right);
};


exports.IntegerRange = IntegerRange;