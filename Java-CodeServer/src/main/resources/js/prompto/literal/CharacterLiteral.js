var Literal = require("./Literal").Literal;
var Character = require("../value/Character").Character;
var CharacterType = require("../type/CharacterType").CharacterType;

/*jshint evil:true*/
function unescape(text) {
	return eval(text);
}

function CharacterLiteral(text) {
	Literal.call(this, text, new Character(unescape(text)));
	return this;
}

CharacterLiteral.prototype = Object.create(Literal.prototype);
CharacterLiteral.prototype.constructor = CharacterLiteral;


CharacterLiteral.prototype.check = function(context) {
	return CharacterType.instance;
};

exports.CharacterLiteral = CharacterLiteral;
