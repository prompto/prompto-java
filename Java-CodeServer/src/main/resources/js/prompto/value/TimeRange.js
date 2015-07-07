var Range = require("./Range").Range;
var Time = require("./Time").Time;
var TimeType = null;

exports.resolve = function() {
    TimeType = require("../type/TimeType").TimeType;
};

function TimeRange(left, right) {
	Range.call(this, TimeType.instance, left, right);
	return this;
}

TimeRange.prototype = Object.create(Range.prototype);
TimeRange.prototype.constructor = TimeRange;


TimeRange.prototype.size = function() {
	return 1 + (this.high.value.valueOf() - this.low.value.valueOf())/1000;
};

TimeRange.prototype.compare = function(o1, o2) {
	return o1.cmp(o2);
};

TimeRange.prototype.getItem = function(index) {
	var result = this.low.value.valueOf() + (index-1)*1000;
	if(result>this.high.value.valueOf()) {
		throw new IndexOutOfBoundsException();
	}
	return new Time(new Date(result));
};

/*
@Override
public Range<Time> newInstance(Time left, Time right) {
	return new TimeRange(left, right);
}
*/

exports.TimeRange = TimeRange;
