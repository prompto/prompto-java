var ObjectList = require("../utils/ObjectList").ObjectList;
var JavaScriptExpression = require("./JavaScriptExpression").JavaScriptExpression;

function JavaScriptExpressionList(expression) {
	ObjectList.call(this);
	expression = expression || null;
	if(expression!==null) {
		this.add(expression);
	}
	return this;
}

JavaScriptExpressionList.prototype = Object.create(ObjectList.prototype);
JavaScriptExpressionList.prototype.constructor = JavaScriptExpressionList;

JavaScriptExpressionList.prototype.toDialect = function(writer) {
    if(this.length>0) {
        for (var idx = 0; idx < this.length; idx++) {
            this[idx].toDialect(writer);
            writer.append(", ");
        }
        writer.trimLast(2);
    }
};


JavaScriptExpressionList.prototype.computeArguments = function(context) {
	var values = [];
	for (var idx = 0; idx < this.length; idx++) {
		values[idx] = this.computeArgument(this[idx], context);
	}
	return values;
};


JavaScriptExpressionList.prototype.computeArgument = function(arg, context) {
	// interpret expression
	var interpret = arg.interpret || null;
	if (interpret!=null) {
		arg = arg.interpret(context);
	}
	// expression might be a wrapper
	interpret = arg.interpret || null;
	if (interpret!=null) {
		arg = arg.interpret(context);
	}
	// convert value to JavaScript
	var convert = arg.convertToJavaScript || null;
	if (convert!=null) {
		arg = arg.convertToJavaScript();
	}
	return arg;
};

exports.JavaScriptExpressionList = JavaScriptExpressionList;