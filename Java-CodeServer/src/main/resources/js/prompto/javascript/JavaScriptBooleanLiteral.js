var JavaScriptLiteral = require("./JavaScriptLiteral").JavaScriptLiteral;
var BooleanType = require("../type/BooleanType").BooleanType;

function JavaScriptBooleanLiteral(text) {
	JavaScriptLiteral.call(this, text);
	return this;
}

JavaScriptBooleanLiteral.prototype = Object.create(JavaScriptLiteral.prototype);
JavaScriptBooleanLiteral.prototype.constructor = JavaScriptBooleanLiteral;

JavaScriptBooleanLiteral.prototype.check = function(context) {
	return BooleanType.instance;
};

exports.JavaScriptBooleanLiteral = JavaScriptBooleanLiteral;