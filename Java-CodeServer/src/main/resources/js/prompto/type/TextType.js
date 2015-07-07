var NativeType = require("./NativeType").NativeType;
var CharacterType = null;
var IntegerType = require("./IntegerType").IntegerType;
var BooleanType = require("./BooleanType").BooleanType;
var AnyType = require("./AnyType").AnyType;
var Text = null; // circular dependency

exports.resolve = function() {
	CharacterType = require("./CharacterType").CharacterType;
	Text = require("../value/Text").Text;
}

function TextType()  {
	NativeType.call(this, "Text");
	return this;
}

TextType.prototype = Object.create(NativeType.prototype);
TextType.prototype.constructor = TextType;

TextType.instance = new TextType();

/*
	@Override
	public Class<?> toJavaClass() {
		return String.class;
	}
	
*/

TextType.prototype.isAssignableTo = function(context, other) {
	return (other instanceof TextType) || (other instanceof AnyType);
};

TextType.prototype.checkAdd = function(context, other, tryReverse) {
	// can add anything to text
	return this;
};

TextType.prototype.checkMultiply = function(context, other, tryReverse) {
	if(other instanceof IntegerType) {
		return TextType.instance;
	}
	return NativeType.prototype.checkMultiply.call(this, context, other, tryReverse);
};

TextType.prototype.checkCompare = function(context, other) {
	if(other instanceof TextType || other instanceof CharacterType) {
		return BooleanType.instance;
	}
	return NativeType.prototype.checkCompare.call(this, context, other);
};

TextType.prototype.checkItem = function(context, other) {
	if(other==IntegerType.instance) {
		return CharacterType.instance;
	} else {
		return NativeType.prototype.checkItem.call(this, context, other);
	}
};

TextType.prototype.checkMember = function(context, name) {
   if ("length"==name) {
	   return IntegerType.instance;
   } else {
	   return NativeType.prototype.checkMember.call(this, context, name);
   }
};

TextType.prototype.checkContains = function(context, other) {
	if(other instanceof TextType || other instanceof CharacterType) {
		return BooleanType.instance;
	}
	return NativeType.prototype.checkContains.call(this, context, other);
};

TextType.prototype.checkContainsAllOrAny = function(context, other) {
	return BooleanType.instance;
};

TextType.prototype.checkSlice = function(context) {
	return this;
};

TextType.prototype.sort = function(context, list) {

	function cmp(o1, o2) {
		o1 = o1.toString();
		o2 = o2.toString();
		return o1 > o2 ? 1 : o1 == o2 ? 0 : -1;
	}
	return NativeType.prototype.sort(context,list, cmp);
};

TextType.prototype.convertJavaScriptValueToPrestoValue = function(context, value, returnType) {
	if (typeof(value) == 'string') {
		return new Text(value);
	} else {
		return value; // TODO for now
	}
}

exports.TextType = TextType;
