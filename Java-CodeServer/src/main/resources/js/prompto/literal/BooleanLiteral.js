var Literal = require("./Literal").Literal;
var BooleanType = require("../type/BooleanType").BooleanType;
var Bool = require("../value/Bool").Bool;

function BooleanLiteral(text) {
	Literal.call(this, text, Bool.Parse(text));
	return this;
}

BooleanLiteral.prototype = Object.create(Literal.prototype);
BooleanLiteral.prototype.constructor = BooleanLiteral;

BooleanLiteral.prototype.check = function(context) {
	return BooleanType.instance;
};

exports.BooleanLiteral = BooleanLiteral;