var Range = require("./Range").Range;
var Integer = require("./Integer").Integer;
var Character = null;
var CharacterType = null;

exports.resolve = function() {
    Character = require("./Character").Character;
    CharacterType = require("../type/CharacterType").CharacterType;
}

function CharacterRange(left, right) {
	Range.call(this, CharacterType.instance, left, right);
	return this;
}

CharacterRange.prototype = Object.create(Range.prototype);
CharacterRange.prototype.constructor = CharacterRange;


CharacterRange.prototype.size = function() {
	return 1 + this.high.value.charCodeAt(0) - this.low.value.charCodeAt(0);
};


CharacterRange.prototype.getItem = function(index) {
	var result = this.low.value.charCodeAt(0) + index - 1;
	if(result>this.high.value.charCodeAt(0)) {
		throw new IndexOutOfBoundsException();
	} else {
		return new Character(String.fromCharCode(result));
	}
};

/*
@Override
public Range<Character> newInstance(Character left, Character right) {
	return new CharacterRange(left, right);
}


*/

exports.CharacterRange = CharacterRange;