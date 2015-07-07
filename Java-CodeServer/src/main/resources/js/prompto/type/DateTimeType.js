var NativeType = require("./NativeType").NativeType;
var BooleanType = require("./BooleanType").BooleanType;
var PeriodType = require("./PeriodType").PeriodType;
var IntegerType = require("./IntegerType").IntegerType;
var TextType = require("./TextType").TextType;
var DateType = require("./DateType").DateType;
var TimeType = require("./TimeType").TimeType;
var AnyType = require("./AnyType").AnyType;

function DateTimeType()  {
	NativeType.call(this, "DateTime");
	return this;
}

DateTimeType.prototype = Object.create(NativeType.prototype);
DateTimeType.prototype.constructor = DateTimeType;

DateTimeType.instance = new DateTimeType();

/*
@Override
public Class<?> toJavaClass() {
	return DateTime.class;
}

*/
DateTimeType.prototype.isAssignableTo = function(context, other) {
	return (other instanceof DateTimeType || other instanceof DateType ||  other instanceof TimeType || other instanceof AnyType);
};


DateTimeType.prototype.checkAdd = function(context, other, tryReverse) {
	if (other instanceof PeriodType) {
		return this;
	} else {
		return NativeType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

DateTimeType.prototype.checkSubstract = function(context, other) {
	if (other instanceof PeriodType) {
		return this;
	} else if(other instanceof DateTimeType || other instanceof DateType || other instanceof TimeType) {
		return PeriodType.instance;
	} else {
		return NativeType.prototype.checkSubstract.call(this, context, other);
	}
};

DateTimeType.prototype.checkCompare = function(context, other) {
	if(other instanceof DateTimeType || other instanceof DateType) {
		return BooleanType.instance;
	} else {
		return NativeType.prototype.checkCompare.call(this, context, other);
	}
};

DateTimeType.prototype.checkMember = function(context, name) {
	if ("year"==name) {
		return IntegerType.instance;
	} else if ("month"==name) {
		return IntegerType.instance;
	} else if ("dayOfMonth"==name) {
		return IntegerType.instance;
	} else if ("dayOfYear"==name) {
		return IntegerType.instance;
	} else if ("hour"==name) {
		return IntegerType.instance;
	} else if ("minute"==name) {
		return IntegerType.instance;
	} else if ("second"==name) {
		return IntegerType.instance;
	} else if ("millis"==name) {
		return IntegerType.instance;
	} else if ("tzOffset"==name) {
		return IntegerType.instance;
	} else if ("tzName"==name) {
		return TextType.instance;
	} else {
		return NativeType.prototype.checkMember.apply(this, context, name);
	}
};

/*

@Override
public ListValue sort(Context context, ListValue list) throws PrestoError {
	return this.<DateTime> doSort(context, list);
}

@Override
public String toString(Object value) {
	return "'" + value.toString() + "'";
}

*/

exports.DateTimeType = DateTimeType;
