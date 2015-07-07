var Literal = require("./Literal").Literal;
var Integer = require("../value/Integer").Integer;
var IntegerType = require("../type/IntegerType").IntegerType;

/* jshint bitwise:false*/
function parseHexa(text) {
	var value = 0;
	for(var i=2;i<text.length; i++) {
		value <<= 4;
		var c = text[i];
		if(c>='0' && c<='9') {
			value += (c.charCodeAt(0) - '0'.charCodeAt(0));
		} else if(c>='a' && c<='f') {
			value += (c.charCodeAt(0) - 'a'.charCodeAt(0));
		} else if(c>='A' && c<='F') {
			value += 10 + (c.charCodeAt(0) - 'A'.charCodeAt(0));
		} else {
			throw (text + " is not a valid hexadecimal number");
		}
	}
	return new Integer(value);
}

function HexaLiteral(text) {
	Literal.call(this, text, parseHexa(text));
	return this;
}

HexaLiteral.prototype = Object.create(Literal.prototype);
HexaLiteral.prototype.constructor = HexaLiteral;

HexaLiteral.parseHexa = parseHexa;
HexaLiteral.prototype.check = function(context) {
	return IntegerType.instance;
};

exports.HexaLiteral = HexaLiteral;