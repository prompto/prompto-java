var JavaScriptLiteral = require("./JavaScriptLiteral").JavaScriptLiteral;
var TextType = require("../type/TextType").TextType;

function JavaScriptTextLiteral(text) {
    JavaScriptLiteral.call(this, text);
    return this;
}

JavaScriptTextLiteral.prototype = Object.create(JavaScriptLiteral.prototype);
JavaScriptTextLiteral.prototype.constructor = JavaScriptTextLiteral;

JavaScriptTextLiteral.prototype.check = function(context) {
    return TextType.instance;
};

exports.JavaScriptTextLiteral = JavaScriptTextLiteral;

