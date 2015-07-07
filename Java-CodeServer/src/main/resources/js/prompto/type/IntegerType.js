var NativeType = require("./NativeType").NativeType;
var BooleanType = require("./BooleanType").BooleanType;
var DecimalType = require("./DecimalType").DecimalType;
var CharacterType = null;
var ListType = require("./ListType").ListType;
var RangeType = require("./RangeType").RangeType;
var TextType = null;
var AnyType = require("./AnyType").AnyType;
var Integer = require("../value/Integer").Integer;
var IntegerRange = require("../value/IntegerRange").IntegerRange;
var PeriodType = null;

exports.resolve = function() {
	CharacterType = require("./CharacterType").CharacterType;
	TextType = require("./TextType").TextType;
	PeriodType = require("./PeriodType").PeriodType;
}

function IntegerType()  {
	NativeType.call(this, "Integer");
	return this;
}

IntegerType.prototype = Object.create(NativeType.prototype);
IntegerType.prototype.constructor = IntegerType;

IntegerType.instance = new IntegerType();
	
/*
public Class<?> toJavaClass() {
	return Long.class;
}
*/

IntegerType.prototype.isAssignableTo = function(context, other) {
	return (other instanceof IntegerType) || (other instanceof DecimalType) || (other instanceof AnyType);
};

IntegerType.prototype.checkAdd = function(context, other, tryReverse) {
	if(other instanceof IntegerType) {
		return this;
	} else if(other instanceof DecimalType) {
		return other;
	} else {
		return NativeType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

IntegerType.prototype.checkSubstract = function(context, other) {
	if(other instanceof IntegerType) {
		return this;
	} else if(other instanceof DecimalType) {
		return other;
	} else {
		return NativeType.prototype.checkSubstract.call(this, context, other);
	}
};

IntegerType.prototype.checkMultiply = function(context, other, tryReverse) {
	if(other instanceof IntegerType) {
		return this;
	} else if(other instanceof DecimalType) {
		return other;
	} else if(other instanceof CharacterType) {
		return TextType.instance;
	} else if(other instanceof TextType) {
		return other;
	} else if(other instanceof PeriodType) {
		return other;
	} else if(other instanceof ListType) {
		return other;
	} else {
		return NativeType.prototype.checkMultiply.call(this, context, other, tryReverse);
	}
};


IntegerType.prototype.checkDivide = function(context, other) {
	if(other instanceof IntegerType || other instanceof DecimalType) {
		return DecimalType.instance;
	} else {
		return NativeType.prototype.checkDivide.call(this, context, other);
	}
};

IntegerType.prototype.checkIntDivide = function(context, other) {
	if(other instanceof IntegerType) {
		return this;
	} else {
		return NativeType.prototype.checkIntDivide.call(this, context, other);
	}
};

IntegerType.prototype.checkModulo = function(context, other) {
	if(other instanceof IntegerType) {
		return this;
	} else {
		return NativeType.prototype.checkModulo.call(this, context, other);
	}
};

IntegerType.prototype.checkMinus = function(context) {
	return this;
};

/*
@Override
public IType checkMember(Context context, String name) throws SyntaxError {
	if(name.equals("min"))
		return this;
	else if(name.equals("max"))
		return this;
	else
		return super.checkMember(context, name);
}

@Override
public IValue getMember(Context context, String name) throws PrestoError {
	if(name.equals("min"))
		return new Integer(java.lang.Integer.MIN_VALUE);
	else if(name.equals("max"))
		return new Integer(java.lang.Integer.MAX_VALUE);
	else
		return super.getMember(context, name);
}

*/

IntegerType.prototype.checkCompare = function(context, other) {
	if(other instanceof IntegerType || other instanceof DecimalType) {
		return BooleanType.instance;
	} else {
		return NativeType.prototype.checkCompare.call(this, context, other);
	}
};


IntegerType.prototype.checkRange = function(context, other) {
	if(other instanceof IntegerType) {
		return new RangeType(this);
	} else {
		return NativeType.prototype.checkRange.call(this, context, other);
	}
};


IntegerType.prototype.newRange = function(left, right) {
	if(left instanceof Integer && right instanceof Integer) {
		return new IntegerRange(left, right);
	} else {
		return NativeType.prototype.checkCompare.newRange(this, left, right);
	}
};

IntegerType.prototype.convertJavaScriptValueToPrestoValue = function(context, value, returnType) {
	if (typeof(value)=='number') {
		return new Integer(value);
	} else {
		return value; // TODO for now
	}
};


exports.IntegerType = IntegerType;
