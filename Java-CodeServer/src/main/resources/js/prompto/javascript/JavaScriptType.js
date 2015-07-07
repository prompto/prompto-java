var type = require("../type/index.js");
var Value = require("../value/Value").Value;
var getTypeName = require("./JavaScriptUtils").getTypeName;
var InternalError = require("../error/InternalError").InternalError;
var NativeInstance = require("../value/NativeInstance").NativeInstance;
var AnyNativeCategoryDeclaration = require("../declaration/AnyNativeCategoryDeclaration").AnyNativeCategoryDeclaration;

function JavaScriptType(name) {
	type.CategoryType.call(this, name);
	return this;
};

JavaScriptType.prototype = Object.create(type.CategoryType.prototype);
JavaScriptType.prototype.constructor = JavaScriptType;


JavaScriptType.scriptToTypeMap = {
	'string' : type.TextType.instance,
	'boolean' : type.BooleanType.instance,
	'object' : type.AnyType.instance
};


JavaScriptType.prototype.convertJavaScriptValueToPrestoValue = function(context, value, returnType) {
	if(value instanceof Value) {
		return value;
	}
    var typeName = getTypeName(value);
    var prestoType = JavaScriptType.scriptToTypeMap[typeName] || null;
	if (prestoType != null) {
		return prestoType.convertJavaScriptValueToPrestoValue(context, value, returnType);
	} else if(typeName=='number') {
        if (value == (value | 0)) {
            return type.IntegerType.instance.convertJavaScriptValueToPrestoValue(context, value, returnType);
        } else {
            return type.DecimalType.instance.convertJavaScriptValueToPrestoValue(context, value, returnType);
        }
    }
    var decl = context.getNativeBinding(typeName);
    if(decl!=null) {
        return new NativeInstance(decl, value);
    } else if(returnType==type.AnyType.instance) {
        return new NativeInstance(AnyNativeCategoryDeclaration.instance, value);
	} else {
		throw new InternalError("Unable to convert:" + typeName);
	}
};

exports.JavaScriptType = JavaScriptType;