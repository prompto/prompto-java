var NativeType = require("./NativeType").NativeType;
var BooleanType = require("./BooleanType").BooleanType;
var PeriodType = require("./PeriodType").PeriodType;
var IntegerType = require("./IntegerType").IntegerType;
var RangeType = require("./RangeType").RangeType;
var TimeRange = require("../value/TimeRange").TimeRange;
var Time = require("../value/Time").Time;

function TimeType()  {
	NativeType.call(this, "Time");
	return this;
}

TimeType.prototype = Object.create(NativeType.prototype);
TimeType.prototype.constructor = TimeType;

TimeType.instance = new TimeType();

/*
@Override
public Class<?> toJavaClass() {
	return LocalTime.class;
}

@Override
public boolean isAssignableTo(Context context, IType other) {
	return (other instanceof TimeType) || (other instanceof AnyType);
}

*/

TimeType.prototype.checkAdd = function(context, other, tryReverse) {
	if (other instanceof PeriodType) {
		return this; // ignore date section
	} else {
		return NativeType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

TimeType.prototype.checkSubstract = function(context, other) {
	if (other instanceof TimeType) {
		return PeriodType.instance; // ignore date section
	} else if (other instanceof PeriodType) {
		return this; // ignore date section
	} else {
		return NativeType.prototype.checkSubstract.call(this, context, other);
	}
};

TimeType.prototype.checkCompare = function(context, other) {
	if (other instanceof TimeType) {
		return BooleanType.instance;
	} else {
		return NativeType.prototype.checkCompare.call(this, context, other);
	}
};

TimeType.prototype.checkRange = function(context, other) {
	if (other instanceof TimeType) {
		return new RangeType(this);
	} else {
		return NativeType.prototype.checkRange.call(this, context, other);
	}
};

TimeType.prototype.checkMember = function (context, name) {
	if ("hour" == name) {
		return IntegerType.instance;
	} else if ("minute" == name) {
		return IntegerType.instance;
	} else if ("second" == name) {
		return IntegerType.instance;
	} else if ("millis" == name) {
		return IntegerType.instance;
	} else {
		return NativeType.prototype.checkMember.call(this, context, name);
	}
};

TimeType.prototype.newRange = function(left, right) {
	if (left instanceof Time && right instanceof Time) {
		return new TimeRange(left, right);
	} else {
		return NativeType.prototype.newRange.call(this, left, right);
	}
};

/*

@Override
public ListValue sort(Context context, ListValue list) throws PrestoError {
	return this.<LocalTime> doSort(context, list);
}

*/

TimeType.prototype.toString = function(value) {
	return "'" + value.toString() + "'";
};

exports.TimeType = TimeType;