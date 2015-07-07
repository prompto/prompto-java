var JavaScriptLiteral = require("./JavaScriptLiteral").JavaScriptLiteral;
var CharacterType = require("../type/CharacterType").CharacterType;

function JavaScriptCharacterLiteral(text) {
	JavaScriptLiteral.call(this, text);
	return this;
}

JavaScriptCharacterLiteral.prototype = Object.create(JavaScriptLiteral.prototype);
JavaScriptCharacterLiteral.prototype.constructor = JavaScriptCharacterLiteral;

JavaScriptCharacterLiteral.prototype.check = function(context) {
	return CharacterType.instance;
};

exports.JavaScriptCharacterLiteral = JavaScriptCharacterLiteral;

