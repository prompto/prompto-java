var Literal = require("./Literal").Literal;
var PeriodType = require("../type/PeriodType").PeriodType;
var Period = require("../value/Period").Period;

function PeriodLiteral(text) {
	Literal.call(this, text, Period.Parse(text.substring(1,text.length-1)));
	return this;
}

PeriodLiteral.prototype = Object.create(Literal.prototype);
PeriodLiteral.prototype.constructor = PeriodLiteral;

PeriodLiteral.prototype.check = function(context) {
	return PeriodType.instance;
};

exports.PeriodLiteral = PeriodLiteral;

