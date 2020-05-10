function DateTime(date, tzOffset) {
    this.date = date;
    // can't just use native Date since it's tzOffset is bound to the running location
    this.tzOffset = tzOffset;
    return this;
}

DateTime.now = function() {
    var now = new Date();
    return new DateTime(now, now.getTimezoneOffset());
};

DateTime.parse = function(text) {
    var year = parseInt(text.substring(0,4));
    text = text.substring(4);
    var month = 1;
    var day = 1;
    if(text[0]=='-') {
        text = text.substring(1); // skip "-"
        month = parseInt(text.substring(0,2));
        text = text.substring(2);
        if(text[0]=='-') {
            text = text.substring(1); // skip "-"
            day = parseInt(text.substring(0,2));
            text = text.substring(2);
        }
    }
    var hour = 0;
    var minute = 0;
    var second = 0;
    var milli = 0;
    if(text[0]=='T') {
        text = text.substring(1); // skip "T"
        hour = parseInt(text.substring(0,2));
        text = text.substring(2);
        if(text[0]==':') {
            text = text.substring(1); // skip ":"
            minute = parseInt(text.substring(0,2));
            text = text.substring(2);
            if(text[0]==':') {
                text = text.substring(1); // skip ":"
                second = parseInt(text.substring(0, 2));
                text = text.substring(2);
                if (text[0] == '.') {
                    text = text.substring(1); // skip "."
                    milli = parseInt(text.substring(0, 3));
                    text = text.substring(3);
                }
            }
        }
    }
    var date = new Date(Date.UTC(year, month-1, day, hour, minute, second, milli));
    var tzOffset = 0; // in seconds
    if(text[0]=='+' || text[0]=='-') {
        tzOffset = text[0]=='+' ? 1 : -1;
        text = text.substring(1); // skip "+/-"
        tzOffset *= parseInt(text.substring(0, 2)) * 3600;
        text.substring(2);
        if (text[0] == ':') {
            text = text.substring(1); // skip ":"
            tzOffset *= parseInt(text.substring(0, 2)) * 60;
        }
   }
    return new DateTime(date, tzOffset);
};

DateTime.prototype.addPeriod = function (period) {
    var date = new Date();
    var year = this.date.getUTCFullYear() + (period.years || 0);
    date.setUTCFullYear(year);
    var month = this.date.getUTCMonth() + (period.months || 0);
    date.setUTCMonth(month);
    var day = this.date.getUTCDate() + ((period.weeks || 0) * 7) + (period.days || 0);
    date.setUTCDate(day);
    var hour = this.date.getUTCHours() + (period.hours || 0);
    date.setUTCHours(hour);
    var minute = this.date.getUTCMinutes() + (period.minutes || 0);
    date.setUTCMinutes(minute);
    var second = this.date.getUTCSeconds() + (period.seconds || 0);
    date.setUTCSeconds(second);
    var millis = this.date.getUTCMilliseconds() + (period.millis || 0);
    date.setUTCMilliseconds(millis);
    return new DateTime(date, this.tzOffset);
};


DateTime.prototype.subtractDateTime = function(other) {
    var thisValue = this.date.valueOf() + this.tzOffset*1000;
    var otherValue = other.date.valueOf() + other.tzOffset*1000;
    var numDays = ( thisValue - otherValue)/(24*60*60*1000);
    var data = [];
    data[3] = Math.floor(numDays);
    data[4] = this.date.getUTCHours() - other.date.getUTCHours();
    data[5] = this.date.getUTCMinutes() - other.date.getUTCMinutes();
    data[6] = this.date.getUTCSeconds() - other.date.getUTCSeconds();
    data[7] = this.date.getUTCMilliseconds() - other.date.getUTCMilliseconds();
    return new Period(data);
};


DateTime.prototype.subtractPeriod = function(value) {
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



DateTime.prototype.toString = function() {
    var s = ("0000" + this.date.getUTCFullYear()).slice(-4);
    s += "-";
    s += ("00" + (this.date.getUTCMonth() + 1)).slice(-2);
    s += "-";
    s += ("00" + this.date.getUTCDate()).slice(-2);
    s += "T";
    s += ("00" + this.date.getUTCHours()).slice(-2);
    s += ":";
    s += ("00" + this.date.getUTCMinutes()).slice(-2);
    s += ":";
    s += ("00" + this.date.getUTCSeconds()).slice(-2);
    s += ".";
    s += ("000" + this.date.getUTCMilliseconds()).slice(-3);
    if(this.tzOffset == 0)
        return s + "Z";
    var offset = this.tzOffset;
    if (offset > 0)
        s += "+";
    else {
        offset = -offset;
        s += "-";
    }
    s += ("00" + Math.floor(offset / 3600)).slice(-2);
    s += ":";
    s += ("00" + Math.floor((offset % 3600) / 60)).slice(-2);
    return s;
};


DateTime.prototype.getText = DateTime.prototype.toString;


DateTime.prototype.equals = function(value) {
    return value instanceof DateTime && this.date.valueOf() == value.date.valueOf() && this.tzOffset == value.tzOffset;
};

DateTime.prototype.gt = function(other) {
    return other instanceof DateTime && this.compareTo(other.date, other.tzOffset) > 0;
};


DateTime.prototype.gte = function(other) {
    return other instanceof DateTime && this.compareTo(other.date, other.tzOffset) >= 0;
};


DateTime.prototype.lt = function(other) {
    return other instanceof DateTime && this.compareTo(other.date, other.tzOffset) < 0;
};


DateTime.prototype.lte = function(other) {
    return other instanceof DateTime && this.compareTo(other.date, other.tzOffset) <= 0;
};


DateTime.prototype.compareTo = function(date, tzOffset) {
    var a = this.date.valueOf() + this.tzOffset*60000;
    var b = date.valueOf() + tzOffset*60000;
    return a > b ? 1 : (a == b ? 0 : -1);
};


DateTime.prototype.getYear = function(value) {
    return this.date.getUTCFullYear();
};

DateTime.prototype.getMonth = function(value) {
    return this.date.getUTCMonth() + 1;
};


DateTime.prototype.getDayOfMonth = function(value) {
    return this.date.getUTCDate();
};


DateTime.prototype.getDayOfYear = function() {
    var first = new Date(this.date.getUTCFullYear(), 0, 1, 0, 0, 0, 0);
    var numDays = (this - first) / (1000 * 60 * 60 * 24);
    return 1 + Math.floor(numDays);
};

DateTime.prototype.getHour = function(value) {
    return this.date.getUTCHours();
};


DateTime.prototype.getMinute = function(value) {
    return this.date.getUTCMinutes();
};


DateTime.prototype.getSecond = function(value) {
    return this.date.getUTCSeconds();
};


DateTime.prototype.getMillisecond = function(value) {
    return this.date.getUTCMilliseconds();
};

DateTime.prototype.getTzOffset = function(value) {
    return this.date.tzOffset;
};

DateTime.prototype.getTzName = function(value) {
    return "Z";
};

DateTime.prototype.getDate = function(value) {
    return new LocalDate(this.date);
};


DateTime.prototype.getTime = function(value) {
    return new LocalTime(this.date);
};


DateTime.prototype.toDocument = DateTime.prototype.toString;