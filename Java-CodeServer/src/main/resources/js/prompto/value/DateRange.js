var Range = require("./Range").Range;
var LocalDate = require("./LocalDate").LocalDate;
var DateType = null;

exports.resolve = function() {
    DateType = require("../type/DateType").DateType;
};

function DateRange(left, right) {
	Range.call(this, DateType.instance, left, right);
	return this;
}

DateRange.prototype = Object.create(Range.prototype);
DateRange.prototype.constructor = DateRange;


DateRange.prototype.size = function() {
	var h = this.high.value.valueOf();
	var l = this.low.value.valueOf();
	return 1 + ( (h-l)/(24*60*60*1000));
};

DateRange.prototype.getItem = function(index) {
	var millis = this.low.value.valueOf() + (index-1)*(24*60*60*1000);
	if(millis>this.high.value.valueOf()) {
		throw new IndexOutOfBoundsException();
	} else {
		return new LocalDate(new Date(millis));
	}
};

/*
@Override
public Range<Date> newInstance(Date left, Date right) {
	return new DateRange(left, right);
}

*/


exports.DateRange = DateRange;
