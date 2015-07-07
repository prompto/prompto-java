var Value = require("./Value").Value;
var Period = require("./Period").Period;
var Integer = require("./Integer").Integer;
var DateType = null;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

exports.resolve = function() {
    DateType = require("../type/DateType").DateType;
};

function LocalDate(value) {
    Value.call(this, DateType.instance);
	this.value = value;
	return this;
}

LocalDate.prototype = Object.create(Value.prototype);
LocalDate.prototype.constructor = LocalDate;

LocalDate.Parse = function(text) {
	return new LocalDate(new Date(text));
};

LocalDate.prototype.toString = function() {
    return this.value.toISOString().substring(0, 10);
};

LocalDate.prototype.getValue = function() { 
	return this.value; 
};

LocalDate.prototype.Add = function(context, value) {
    if (value instanceof Period) {
        return this.addPeriod(value);
    } else {
        throw new SyntaxError("Illegal: Date + " + typeof(value));
    }
};

LocalDate.prototype.addPeriod = function(value) {
    var date = new Date();
    var year = this.value.getUTCFullYear() + (value.years || 0);
    date.setUTCFullYear(year);
    var month = this.value.getUTCMonth() + (value.months || 0);
    date.setUTCMonth(month);
    var day = this.value.getUTCDate() + ((value.weeks || 0) * 7) + (value.days || 0);
    date.setUTCDate(day);
    return new LocalDate(date);
};

LocalDate.prototype.Subtract = function(context, value)  {
    if (value instanceof LocalDate) {
        return this.minusDate(value);
    } else if (value instanceof Period) {
        return this.minusPeriod(value);
    } else {
        throw new SyntaxError("Illegal: Date - " + typeof(value));
    }
};

LocalDate.prototype.minusDate = function(value) {
    var data = [];
    data[0] = this.value.getUTCFullYear() - value.value.getUTCFullYear();
    data[1] = this.value.getUTCMonth() - value.value.getUTCMonth();
    data[3] = this.value.getUTCDate() - value.value.getUTCDate();
    return new Period(data);
};

LocalDate.prototype.minusPeriod = function(value) {
    var date = new Date();
    var year = this.value.getUTCFullYear() - (value.years || 0);
    date.setUTCFullYear(year);
    var month = this.value.getUTCMonth() - (value.months || 0);
    date.setUTCMonth(month);
    var day = this.value.getUTCDate() - ((value.weeks || 0) * 7) - (value.days || 0);
    date.setUTCDate(day);
    return new LocalDate(date);
};

LocalDate.prototype.CompareTo = function(context, value) {
    if (value instanceof LocalDate || value instanceof DateTime) {
        return this.cmp(value);
    } else {
        throw new SyntaxError("Illegal comparison: Date and " + typeof(value));
    }
};

LocalDate.prototype.cmp = function(value) {
    var a = this.value.valueOf();
    var b = value.value.valueOf();
    return a > b ? 1 : (a == b ? 0 : -1);
};

LocalDate.prototype.getMember = function(context, name) {
    if ("year"==name) {
        return new Integer(this.value.getUTCFullYear());
    } else if ("month"==name) {
        return new Integer(this.value.getUTCMonth() + 1);
    } else if ("dayOfMonth"==name) {
        return new Integer(this.value.getUTCDate());
    } else if ("dayOfYear"==name) {
        return new Integer(this.getDayOfYear());
    } else {
        throw new SyntaxError("No such member:" + name);
    }
};

LocalDate.prototype.getDayOfYear = function() {
    var first = new Date(this.value);
    first.setMonth(0);
    first.setDate(1);
    var numDays = (this.value - first) / (1000 * 60 * 60 * 24);
    return 1 + numDays | 0;
}

/*

public Object ConvertTo(Class<?> type)
{
    return value;
}

public Date toDateMidnight()
{
    return this;
}

*/


LocalDate.prototype.equals = function(obj) {
    if (obj instanceof LocalDate) {
        return this.value.valueOf() == obj.value.valueOf();
    } else {
        return false;
    }
};

/*
public int hashCode()
{
    return value.hashCode();
}

*/

exports.LocalDate = LocalDate;


