var Literal = require("./Literal").Literal;
var Text = require("../value/Text").Text;
var TextType = require("../type/TextType").TextType;

/*jshint evil:true*/
function unescape(text) {
	return eval(text);
}

function TextLiteral(text) {
	Literal.call(this, text, new Text(unescape(text)));
	return this;
}

TextLiteral.prototype = Object.create(Literal.prototype);
TextLiteral.prototype.constructor = TextLiteral;


TextLiteral.prototype.check = function(context) {
	return TextType.instance;
};

exports.TextLiteral = TextLiteral;
