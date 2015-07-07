var Value = require("./Value").Value;
var Period = require("./Period").Period;
var Integer = require("./Integer").Integer;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var TimeType = null;

exports.resolve = function() {
    TimeType = require("../type/TimeType").TimeType;
};

function Time(value) {
	Value.call(this, TimeType.instance);
	this.value = value;
	return this;
}

Time.prototype = Object.create(Value.prototype);
Time.prototype.constructor = Time;

Time.Parse = function(text) {
	var date = new Date();
	date.setUTCHours(parseInt(text.substring(0,2)));
	date.setUTCMinutes(parseInt(text.substring(3,5)));
	date.setUTCSeconds(parseInt(text.length>6 ? text.substring(6,8) : 0));
	date.setUTCMilliseconds(text.length>9 ? parseInt(text.substring(9,13)) : 0);
	return new Time(date);
};

Time.prototype.toString = function() {
    return this.value.toISOString().substring(11, 23);
};

Time.prototype.getValue = function() {
	return this.value;
};

Time.prototype.Add = function(context, value) {
	if (value instanceof Period) {
		return this.addPeriod(value);
	} else {
		throw new SyntaxError("Illegal: Time + " + typeof(value));
	}
};

Time.prototype.addPeriod = function(value) {
	var date = new Date();
	var hour = this.value.getUTCHours() + (value.hours || 0);
	date.setUTCHours(hour);
	var minute = this.value.getUTCMinutes() + (value.minutes || 0);
	date.setUTCMinutes(minute);
	var second = this.value.getUTCSeconds() + (value.seconds || 0);
	date.setUTCSeconds(second);
	var millis = this.value.getUTCMilliseconds() + (value.millis || 0);
	date.setUTCMilliseconds(millis);
	return new Time(date);
};

Time.prototype.Subtract = function(context, value) {
	if (value instanceof Period) {
		return this.subPeriod(value);
	} else if (value instanceof Time) {
			return this.subTime(value);
	} else {
		throw new SyntaxError("Illegal: Time - " + typeof(value));
	}
};

Time.prototype.subTime = function(value) {
	var data = [];
	data[4] = this.value.getUTCHours() - value.value.getUTCHours();
	data[5] = this.value.getUTCMinutes() - value.value.getUTCMinutes();
	data[6] = this.value.getUTCSeconds() - value.value.getUTCSeconds();
	data[7] = this.value.getUTCMilliseconds() - value.value.getUTCMilliseconds();
	return new Period(data);
};

Time.prototype.subPeriod = function(value) {
	var date = new Date();
	var hour = this.value.getUTCHours() - (value.hours || 0);
	date.setUTCHours(hour);
	var minute = this.value.getUTCMinutes() - (value.minutes || 0);
	date.setUTCMinutes(minute);
	var second = this.value.getUTCSeconds() - (value.seconds || 0);
	date.setUTCSeconds(second);
	var millis = this.value.getUTCMilliseconds() - (value.millis || 0);
	date.setUTCMilliseconds(millis);
	return new Time(date);
};


/*
@Override
public IValue Subtract(Context context, IValue value) throws PrestoError {
	if (value instanceof Time) {
		LocalTime other = ((Time) value).value;
		org.joda.time.Period res = new org.joda.time.Period(0, 0, 0, 0, this.value.getHourOfDay() - other.getHourOfDay(), this.value.getMinuteOfHour() - other.getMinuteOfHour(), this.value.getSecondOfMinute() - other.getSecondOfMinute(), this.value.getMillisOfSecond()
				- other.getMillisOfSecond());
		return new Period(res);
	} else if (value instanceof Period)
		return this.minus((Period) value);
	else
		throw new SyntaxError("Illegal: Time - " + value.getClass().getSimpleName());
}

*/

Time.prototype.CompareTo = function(context, value) {
	if (value instanceof Time) {
		return this.cmp(value);
	} else {
		throw new SyntaxError("Illegal comparison: Time and " + typeof(value));
	}
};

Time.prototype.getMember = function(context, name) {
	if ("hour"==name) {
		return new Integer(this.value.getUTCHours());
	} else if ("minute"==name) {
		return new Integer(this.value.getUTCMinutes());
	} else if ("second"==name) {
		return new Integer(this.value.getUTCSeconds());
	} else if ("millis"==name) {
		return new Integer(this.value.getUTCMilliseconds());
	} else {
		throw new SyntaxError("No such member:" + name);
	}
};

/*
@Override
public Object ConvertTo(Class<?> type) {
	return value;
}

public long getMillisOfDay() {
	return value.getMillisOfDay();
}

*/

Time.prototype.cmp = function(obj) {
	var a = this.value.valueOf();
	var b = obj.value.valueOf();
	return a > b ? 1 : (a == b ? 0 : -1) ;
};

Time.prototype.equals = function(obj) {
	if (obj instanceof Time) {
		return this.value.valueOf() == obj.value.valueOf();
	} else {
		return false;
	}
};

/*
@Override
public int hashCode() {
	return value.hashCode();
}

@Override
public String toString() {
	return value.toString();
}

*/

exports.Time = Time;
