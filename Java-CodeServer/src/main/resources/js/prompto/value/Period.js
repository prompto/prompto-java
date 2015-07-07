var Value = require("./Value").Value;
var Integer = require("./Integer").Integer;
var PeriodType = require("../type/PeriodType").PeriodType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function Period(data) {
    Value.call(this, PeriodType.instance);
    this.years = data[0] || null;
    this.months = data[1] || null;
    this.weeks = data[2] || null;
    this.days = data[3] || null;
    this.hours = data[4] || null;
    this.minutes = data[5] || null;
    this.seconds = data[6] || null;
    this.millis = data[7] || null;
    return this;
}

Period.prototype = Object.create(Value.prototype);
Period.prototype.constructor = Period;

Period.Parse = function(text) {
    try {
        var data = [];
        var steps = "YMWDHM.S";
        var value = null;
        var lastStep = -1;
        var isNeg = false;
        var inPeriod = false;
        var inTime = false;
        var inMillis = false;

        for(var i=0;i<text.length;i++) {
            var c = text[i];
            // leading 'P' is mandatory
            if (!inPeriod) {
                if (c == 'P') {
                    inPeriod = true;
                    continue;
                } else {
                    throw new Exception();
                }
            }
            // check for time section
            if (c == 'T') {
                if (!inTime) {
                    inTime = true;
                    continue;
                } else {
                    throw new Exception();
                }
            }
            // check for value type
            var step = inTime ? steps.indexOf(c, 4) : steps.indexOf(c);
            if (step >= 0) {
                if (step <= lastStep) {
                    throw new Exception();
                } else if (step > 3 && !inTime) {
                    throw new Exception();
                } else if (value == null) {
                    throw new Exception();
                } else if (step == 6) { // millis '.'
                    inMillis = true;
                } else if (step == 7 && !inMillis) {
                    step = 6;
                }
                data[step] = value;
                lastStep = step;
                value = null;
                continue;
            }
            if (c == '-') {
                if (value!=null) {
                    throw new Exception();
                }
                if (isNeg || inMillis) {
                    throw new Exception();
                }
                isNeg = true;
            }
            if (c < '0' || c > '9') {
                throw new Exception();
            }
            if (value!=null) {
                value *= 10;
                value += c - '0';
            } else {
                value = c - '0';
                if (isNeg) {
                    value = -value;
                    isNeg = false;
                }
            }
        }
        // must terminate by a value type
        if (value != null) {
            throw new Exception();
        }
        return new Period(data);
    } catch (e) {
        throw new InvalidDataError("\"" + text + "\" is not a valid ISO 8601 period!");
    }
};

/*
 public Period(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis)
 {
 this.Years = years;
 this.Months = months;
 this.Weeks = weeks;
 this.Days = days;
 this.Hours = hours;
 this.Minutes = minutes;
 this.Seconds = seconds;
 this.Millis = millis;
 }

 private Period(int[] data)
 : this(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7])
 {
 }

 public int Years { get; set; }

 public int Months { get; set; }

 public int Days { get; set; }

 public int Weeks { get; set; }

 public int Hours { get; set; }

 public int Minutes { get; set; }

 public int Seconds { get; set; }

 public int Millis { get; set; }

*/

Period.prototype.Add = function(context, value) {
    if (value instanceof Period) {
        return this.plus(value);
    } else {
        throw new SyntaxError("Illegal: Period + " + typeof(value));
    }
};

Period.prototype.plus = function(period) {
    var data = [];
    data[0] = this.years + period.years;
    data[1] = this.months + period.months;
    data[2] = this.weeks + period.weeks;
    data[3] = this.days + period.days;
    data[4] = this.hours + period.hours;
    data[5] = this.minutes + period.minutes;
    var seconds = (this.seconds + period.seconds) + ((this.millis + period.millis)/1000.0);
    data[6] = seconds | 0;
    var millis = Math.round(( seconds * 1000 ) % 1000);
    data[7] = Math.abs(millis) | 0;
    return new Period(data);
};


Period.prototype.Minus = function(context) {
    var data = [];
    data[0] = -this.years;
    data[1] = -this.months;
    data[2] = -this.weeks;
    data[3] = -this.days;
    data[4] = -this.hours;
    data[5] = -this.minutes;
    data[6] = -this.seconds;
    data[7] = -this.millis;
    return new Period(data);
};

Period.prototype.Subtract = function(context, value) {
    if (value instanceof Period) {
        return this.minus(value);
    } else {
        throw new SyntaxError("Illegal: Period + " + typeof(value));
    }
};

Period.prototype.minus = function(period) {
    var data = [];
    data[0] = this.years - period.years;
    data[1] = this.months - period.months;
    data[2] = this.weeks - period.weeks;
    data[3] = this.days - period.days;
    data[4] = this.hours - period.hours;
    data[5] = this.minutes - period.minutes;
    var seconds = (this.seconds + this.millis/1000.0) - (period.seconds + period.millis/1000.0);
    data[6] = seconds | 0;
    var millis = Math.round(( seconds * 1000 ) % 1000);
    data[7] = Math.abs(millis) | 0;
    return new Period(data);
};

Period.prototype.Multiply = function(context, value) {
    if (value instanceof Integer) {
        return this.multiply(value);
    } else {
        throw new SyntaxError("Illegal: Period * " + typeof(value));
    }
};

Period.prototype.multiply = function(value) {
    var count = value.value;
    if (count == 0) {
        return new Period([]);
    } else if (count == 1) {
        return this;
    } else {
        var data = [];
        data[0] = this.years * count;
        data[1] = this.months * count;
        data[2] = this.weeks * count;
        data[3] = this.days * count;
        data[4] = this.hours * count;
        data[5] = this.minutes * count;
        var seconds = (this.seconds + this.millis/1000.0) * count;
        data[6] = seconds | 0;
        var millis = Math.round(( seconds * 1000 ) % 1000);
        data[7] = Math.abs(millis) | 0;
        return new Period(data);
     }
 };

/*
 override
 public Object ConvertTo(Type type)
 {
 return this; // TODO convert to TimeSpan
 }

*/

Period.prototype.toString = function() {
    var s = "P";
    if(this.years) {
        s += this.years;
        s += "Y";
    }
    if (this.months) {
        s += this.months;
        s += "M";
    }
    if (this.weeks) {
        s += this.weeks;
        s += "W";
    }
    if (this.days) {
        s += this.days;
        s += "D";
    }
    if (this.hours || this.minutes || this.seconds || this.millis) {
        s += "T";
        if (this.hours) {
            s += this.hours;
            s += "H";
        }
        if (this.minutes) {
            s += this.minutes;
            s += "M";
        }
        if (this.seconds || this.millis) {
            s += this.seconds;
            if (this.millis) {
                s += ".";
                s += ("000" + this.millis).slice(-3);
            }
            s += "S";
        }
    }
    return s;
 };

Period.prototype.equals = function(obj) {
    if (obj instanceof Period) {
        return this.years == obj.years &&
            this.months == obj.months &&
            this.weeks == obj.weeks &&
            this.days == obj.days &&
            this.hours == obj.hours &&
            this.minutes == obj.minutes &&
            this.seconds == obj.seconds &&
            this.millis == obj.millis;
    } else {
        return false;
    }
};

/*

 override
 public int GetHashCode()
 {
 return ToString().GetHashCode();
 }


 }
 }


 */
/*
 public static final Period ZERO = new Period(0, 0, 0, 0, 0, 0, 0, 0);

 org.joda.time.Period value;

 public Period(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis)
 {
 value = new org.joda.time.Period(years, months, weeks, days, hours, minutes, seconds, millis);
 }

 public Period(org.joda.time.Period value)
 {
 this.value = value;
 }

 public org.joda.time.Period getValue() {
 return value;
 }


 @Override
 public IValue Add(Context context, IValue value) throws PrestoError
 {
 if (value instanceof Period)
 return this.plus((Period)value);
 else
 throw new SyntaxError("Illegal: Period + " + value.getClass().getSimpleName());
 }

 @Override
 public IValue Subtract(Context context, IValue value) throws PrestoError
 {
 if (value instanceof Period)
 return this.minus((Period)value);
 else
 throw new SyntaxError("Illegal: Period - " + value.getClass().getSimpleName());
 }

 @Override
 public IValue Multiply(Context context, IValue value) throws PrestoError
 {
 if (value instanceof Integer)
 {
 int count = (int)((Integer)value).IntegerValue();
 if (count < 0)
 throw new SyntaxError("Negative repeat count:" + count);
 if (count == 0)
 return Period.ZERO;
 if (count == 1)
 return this;
 return this.times(count);
 }
 else
 throw new SyntaxError("Illegal: Period * " + value.getClass().getSimpleName());
 }

 @Override
 public Object ConvertTo(Class<?> type)
 {
 return value;
 }

 public Period minus(Period period)
 {
 return new Period( this.value.minus(period.value));
 }



 public Period plus(Period period)
 {
 return new Period(this.value.plus(period.value));
 }

 public Period times(int count)
 {
 return new Period(
 this.value.getYears() * count,
 this.value.getMonths() * count,
 this.value.getWeeks() * count,
 this.value.getDays() * count,
 this.value.getHours() * count,
 this.value.getMinutes() * count,
 this.value.getSeconds() * count,
 this.value.getMillis() * count);
 }

 @Override
 public String toString()
 {
 return value.toString();
 }

 @Override
 public boolean equals(Object obj)
 {
 if (obj instanceof Period)
 return this.value.equals(((Period)obj).value);
 else
 return false;
 }

 @Override
 public int hashCode()
 {
 return value.hashCode();
 }


 }
 */

exports.Period = Period;
