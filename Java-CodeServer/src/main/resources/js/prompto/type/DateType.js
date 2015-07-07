var NativeType = require("./NativeType").NativeType;
var BooleanType = require("./BooleanType").BooleanType;
var PeriodType = require("./PeriodType").PeriodType;
var IntegerType = require("./IntegerType").IntegerType;
var RangeType = require("./RangeType").RangeType;
var AnyType = require("./AnyType").AnyType;
var DateRange = require("../value/DateRange").DateRange;
var LocalDate = require("../value/LocalDate").LocalDate;

function DateType()  {
	NativeType.call(this, "Date");
	return this;
}

DateType.prototype = Object.create(NativeType.prototype);
DateType.prototype.constructor = DateType;

DateType.instance = new DateType();

/*
@Override
public Class<?> toJavaClass() {
	return Date.class;
}
*/

DateType.prototype.isAssignableTo = function(context, other) {
	return (other instanceof DateType) || (other instanceof AnyType);
};

DateType.prototype.checkAdd = function(context, other, tryReverse) {
	if (other instanceof PeriodType) {
		return this; // ignore time section
	} else {
		return NativeType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

DateType.prototype.checkSubstract = function(context, other) {
	if (other instanceof PeriodType) {
		return this; // ignore time section
	} else if (other instanceof DateType) {
		return PeriodType.instance;
	} else if (other instanceof TimeType) {
		return PeriodType.instance;
	} else if (other instanceof DateTimeType) {
		return PeriodType.instance;
	} else {
		return NativeType.prototype.checkSubstract.call(this, context, other);
	}
};

DateType.prototype.checkCompare = function(context, other) {
	if (other instanceof DateType || other instanceof DateTimeType) {
		return BooleanType.instance;
	} else {
		return NativeType.prototype.checkCompare.call(this, context, other);
	}
};

DateType.prototype.checkRange = function(context, other) {
	if (other instanceof DateType) {
		return new RangeType(this);
	} else {
		return Nativetype.prototype.checkRange.call(this, context, other);
	}
};

DateType.prototype.checkMember = function(context, name) {
	if ("year"==name) {
		return IntegerType.instance;
	} else if ("month"==name) {
		return IntegerType.instance;
	} else if ("dayOfMonth"==name) {
		return IntegerType.instance;
	} else if ("dayOfYear"==name) {
		return IntegerType.instance;
	} else {
		return NativeType.prototype.checkMember.call(this, context, name);
	}
};

DateType.prototype.newRange = function(left, right) {
	if (left instanceof LocalDate && right instanceof LocalDate) {
		return new DateRange(left, right);
	} else {
		return NativeType.prototype.newRange.call(this, left, right);
	}
};

/*
@Override
public ListValue sort(Context context, ListValue list) throws PrestoError {
	return this.<Date> doSort(context, list);
}

@Override
public String toString(Object value) {
	return "'" + value.toString() + "'";
}

*/

exports.DateType = DateType;
