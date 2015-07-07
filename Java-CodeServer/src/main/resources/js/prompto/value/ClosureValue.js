var SyntaxError = require("../error/SyntaxError").SyntaxError;
var MethodType = require("../type/MethodType").MethodType;
var Value = require("./Value").Value;

function ClosureValue(context, method) {
    Value.call(this, new MethodType(context, method.name));
    this.context = context;
    this.method = method;
    return this;
}

ClosureValue.prototype = Object.create(Value.prototype);
ClosureValue.prototype.constructor = ClosureValue;

ClosureValue.prototype.interpret = function(context) {
    var thisContext = this.type.context;
    var parentMost = thisContext.getParentMostContext();
    parentMost.setParentContext(context);
    var result = this.method.interpret(thisContext);
    parentMost.setParentContext(null);
    return result;
}

exports.ClosureValue = ClosureValue;
