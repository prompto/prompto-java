var Literal = require("./Literal").Literal;
var TimeType = require("../type/TimeType").TimeType;
var Time = require("../value/Time").Time;

function TimeLiteral(text) {
	Literal.call(this, text, Time.Parse(text.substring(1,text.length-1)));
	return this;
}

TimeLiteral.prototype = Object.create(Literal.prototype);
TimeLiteral.prototype.constructor = TimeLiteral;

TimeLiteral.prototype.check = function(context) {
	return TimeType.instance;
};

exports.TimeLiteral = TimeLiteral;

