var Literal = require("./Literal").Literal;
var Decimal = require("../value/Decimal").Decimal;
var DecimalType = require("../type/DecimalType").DecimalType;

function DecimalLiteral(text) {
	Literal.call(this, text, Decimal.Parse(text));
	return this;
}

DecimalLiteral.prototype = Object.create(Literal.prototype);
DecimalLiteral.prototype.constructor = DecimalLiteral;

DecimalLiteral.prototype.check = function(context) {
	return DecimalType.instance;
};

exports.DecimalLiteral = DecimalLiteral;