var Value = require("./Value").Value;
var Period = require("./Period").Period;
var LocalDate = require("./LocalDate").LocalDate;
var Time = require("./Time").Time;
var Integer = require("./Integer").Integer;
var Text = require("./Text").Text;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var DateTimeType = require("../type/DateTimeType").DateTimeType;

function parseOffset(text) {
    var hours = parseInt(text.substring(0,2));
    var i = text[2]==':' ? 3 : 2;
    var minutes = parseInt(text.substring(i,i+2));
    return ((hours * 60) + minutes) * 60;
}

function parseTZOffset(text) {
    var i = text.indexOf('Z');
    if(i>0)
        return 0;
    i = text.indexOf('+');
    if(i>0)
        return parseOffset(text.substring(i+1));
    i = text.lastIndexOf('-');
    if(i>10) // skip date separator
        return -parseOffset(text.substring(i+1));
    return 0;
}

function parseUTCDate(text) {
    var i = text.indexOf('Z');
    if(i<0) {
        i = text.indexOf('+');
        if(i>0)
            text = text.substring(0, i);
        else {
            i = text.lastIndexOf('-');
            if(i>10) // skip date separator
                text = text.substring(0, i);
        }
    }
    return new Date(text);
}

function DateTime(date, tzOffset) {
	Value.call(this, DateTimeType.instance);
	this.date = date;
    this.tzOffset = tzOffset;
	return this;
}

DateTime.prototype = Object.create(Value.prototype);
DateTime.prototype.constructor = DateTime;

DateTime.Parse = function(text) {
    var date = parseUTCDate(text);
    var tzOffset = parseTZOffset(text);
	return new DateTime(date, tzOffset);
};

DateTime.prototype.toString = function() {
    var s = "" +
    ("0000" + this.date.getUTCFullYear()).slice(-4) +
    "-" +
    ("00" + (1 + this.date.getUTCMonth())).slice(-2) +
    "-" +
    ("00" + this.date.getUTCDate()).slice(-2) +
    "T" +
    ("00" + this.date.getUTCHours()).slice(-2) +
    ":" +
    ("00" + this.date.getUTCMinutes()).slice(-2) +
    ":" +
    ("00" + this.date.getUTCSeconds()).slice(-2) +
    "." +
    ("000" + this.date.getUTCMilliseconds()).slice(-3);
    var offset = this.tzOffset;
    if(offset==0)
        s += "Z";
    else {
        if(offset>0)
            s += "+";
        else {
            offset = -offset;
            s += "-";
        }
        s += ("00" + Math.floor(offset/3600)).slice(-2);
        s += ":";
        s += ("00" + Math.floor((offset%3600)/60)).slice(-2);
    }
	return s;
};

DateTime.prototype.Add = function(context, value) {
	if (value instanceof Period) {
		return this.addPeriod(value);
	} else {
		throw new SyntaxError("Illegal: DateTime + " + typeof(value));
	}
};

DateTime.prototype.addPeriod = function(value) {
	var date = new Date();
	var year = this.date.getUTCFullYear() + (value.years || 0);
	date.setUTCFullYear(year);
	var month = this.date.getUTCMonth() + (value.months || 0);
	date.setUTCMonth(month);
	var day = this.date.getUTCDate() + ((value.weeks || 0) * 7) + (value.days || 0);
	date.setUTCDate(day);
	var hour = this.date.getUTCHours() + (value.hours || 0);
	date.setUTCHours(hour);
	var minute = this.date.getUTCMinutes() + (value.minutes || 0);
	date.setUTCMinutes(minute);
	var second = this.date.getUTCSeconds() + (value.seconds || 0);
	date.setUTCSeconds(second);
	var millis = this.date.getUTCMilliseconds() + (value.millis || 0);
	date.setUTCMilliseconds(millis);
	return new DateTime(date, this.tzOffset);
};

DateTime.prototype.Subtract = function(context, value) {
	if (value instanceof DateTime) {
		return this.subDateTime(value)
	} else if (value instanceof LocalDate) {
		return this.subDate(value)
	} else if (value instanceof Time) {
		return this.subTime(value)
	} else if (value instanceof Period) {
		return this.subPeriod(value)
	} else {
		throw new SyntaxError("Illegal: DateTime - " + typeof(value));
	}
};

DateTime.prototype.subDateTime = function(other) {
    var thisValue = this.date.valueOf() + this.tzOffset*1000;
    var otherValue = other.date.valueOf() + other.tzOffset*1000;
	var numDays = ( thisValue - otherValue)/(24*60*60*1000);
	var data = [];
	data[3] = numDays | 0;
	data[4] = this.date.getUTCHours() - other.date.getUTCHours();
	data[5] = this.date.getUTCMinutes() - other.date.getUTCMinutes();
	data[6] = this.date.getUTCSeconds() - other.date.getUTCSeconds();
	data[7] = this.date.getUTCMilliseconds() - other.date.getUTCMilliseconds();
	return new Period(data);
}

DateTime.prototype.subDate = function(value) {
	var numDays = (this.date.valueOf() - value.value.valueOf())/(24*60*60*1000);
	var data = [];
	data[3] = numDays | 0;
	data[4] = this.date.getUTCHours();
	data[5] = this.date.getUTCMinutes();
	data[6] = this.date.getUTCSeconds();
	data[7] = this.date.getUTCMilliseconds();
	return new Period(data);
}

DateTime.prototype.subTime = function(value) {
	var data = [];
	data[0] = this.date.getUTCFullYear();
	data[1] = this.date.getUTCMonth();
	data[3] = this.date.getUTCDate();
	data[4] = this.date.getUTCHours() - value.value.getUTCHours();
	data[5] = this.date.getUTCMinutes() - value.value.getUTCMinutes();
	data[6] = this.date.getUTCSeconds() - value.value.getUTCSeconds();
	data[7] = this.date.getUTCMilliseconds() - value.value.getUTCMilliseconds();
	return new Period(data);
}

DateTime.prototype.subPeriod = function(value) {
	var date = new Date();
	var year = this.date.getUTCFullYear() - (value.years || 0);
	date.setUTCFullYear(year);
	var month = this.date.getUTCMonth() - (value.months || 0);
	date.setUTCMonth(month);
	var day = this.date.getUTCDate() - ((value.weeks || 0) * 7) - (value.days || 0);
	date.setUTCDate(day);
	var hour = this.date.getUTCHours() - (value.hours || 0);
	date.setUTCHours(hour);
	var minute = this.date.getUTCMinutes() - (value.minutes || 0);
	date.setUTCMinutes(minute);
	var second = this.date.getUTCSeconds() - (value.seconds || 0);
	date.setUTCSeconds(second);
	var millis = this.date.getUTCMilliseconds() - (value.millis || 0);
	date.setUTCMilliseconds(millis);
	return new DateTime(date, this.tzOffset);
};

DateTime.prototype.CompareTo = function(context, value) {
    if (value instanceof DateTime) {
        return this.cmp(value.date, value.tzOffset);
    } else if (value instanceof LocalDate) {
		return this.cmp(value.value, 0);
	} else {
		throw new SyntaxError("Illegal comparison: DateTime and " + typeof(value));
	}
};

DateTime.prototype.cmp = function(date, tzOffset) {
	var a = this.date.valueOf() + this.tzOffset*60000;
	var b = date.valueOf() + tzOffset*60000;
	return a > b ? 1 : (a == b ? 0 : -1);
};


DateTime.prototype.getMember = function(context, name) {
	if ("year"==name) {
		return new Integer(this.date.getUTCFullYear());
	} else if ("month"==name) {
		return new Integer(this.date.getUTCMonth() + 1);
	} else if ("dayOfMonth"==name) {
		return new Integer(this.date.getUTCDate());
	} else if ("dayOfYear"==name) {
		return new Integer(this.getDayOfYear());
	} else if ("hour"==name) {
		return new Integer(this.date.getUTCHours());
	} else if ("minute"==name) {
		return new Integer(this.date.getUTCMinutes());
	} else if ("second"==name) {
		return new Integer(this.date.getUTCSeconds());
	} else if ("millis"==name) {
		return new Integer(this.date.getUTCMilliseconds());
	} else if ("tzOffset"==name) {
		return new Integer(this.tzOffset);
	} else if ("tzName"==name) {
		return new Text("TO DO");
	} else {
		throw new SyntaxError("No such member:" + name);
	}
};

DateTime.prototype.getDayOfYear = function() {
	var first = new Date(this.date);
	first.setMonth(0);
	first.setDate(1);
	var numDays = (this.date - first) / (1000 * 60 * 60 * 24);
	return 1 + numDays | 0;
}

/*
@Override
public Object ConvertTo(Class<?> type) {
	return value;
}

*/

DateTime.prototype.equals = function(obj) {
	if (obj instanceof DateTime) {
		return this.date.valueOf() == obj.date.valueOf() && this.tzOffset==obj.tzOffset;
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

exports.DateTime = DateTime;
