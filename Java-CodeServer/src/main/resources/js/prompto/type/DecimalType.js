var NativeType = require("./NativeType").NativeType;
var BooleanType = require("./BooleanType").BooleanType;
var IntegerType = null; // circular dependency
var AnyType = require("./AnyType").AnyType;
var Decimal = require("../value/Decimal").Decimal;

exports.resolve = function() {
	IntegerType = require("./IntegerType").IntegerType;
}

function DecimalType()  {
	NativeType.call(this, "Decimal");
	return this;
}

DecimalType.prototype = Object.create(NativeType.prototype);
DecimalType.prototype.constructor = DecimalType;

DecimalType.instance = new DecimalType();


DecimalType.prototype.isAssignableTo = function(context, other) {
	return (other instanceof IntegerType) || (other instanceof DecimalType) || (other instanceof AnyType);
};


DecimalType.prototype.checkAdd = function(context, other, tryReverse) {
	if(other instanceof IntegerType) {
		return this;
	} else if(other instanceof DecimalType) {
		return this;
	} else {
		return NativeType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

DecimalType.prototype.checkSubstract = function(context, other) {
	if(other instanceof IntegerType || other instanceof DecimalType) {
		return this;
	} else {
		return NativeType.prototype.checkSubstract.call(this, context, other);
	}
};

DecimalType.prototype.checkMultiply = function(context, other, tryReverse) {
	if(other instanceof IntegerType || other instanceof DecimalType) {
		return this;
	} else {
		return NativeType.prototype.checkMultiply.call(this, context, other, tryReverse);
	}
};

DecimalType.prototype.checkDivide = function(context, other) {
	if(other instanceof IntegerType || other instanceof DecimalType) {
		return this;
	} else {
		return NativeType.prototype.checkDivide.call(this, context, other);
	}
};

DecimalType.prototype.checkIntDivide = function(context, other) {
    if(other instanceof IntegerType) {
        return this;
    } else {
        return NativeType.prototype.checkIntDivide.call(this, context, other);
    }
};

DecimalType.prototype.checkModulo = function(context, other) {
    if(other instanceof IntegerType || other instanceof DecimalType) {
        return this;
    } else {
        return NativeType.prototype.checkModulo.call(this, context, other);
    }
};

DecimalType.prototype.checkMinus = function(context) {
	return this;
};

DecimalType.prototype.checkCompare = function(context, other) {
	if(other instanceof IntegerType || other instanceof DecimalType) {
		return BooleanType.instance;
	} else {
		return NativeType.prototype.checkCompare.call(this, context, other);
	}
};

DecimalType.prototype.convertJavaScriptValueToPrestoValue = function(context, value, returnType) {
    if (typeof(value)=='number') {
        return new Decimal(value);
    } else {
        return value; // TODO for now
    }
};

exports.DecimalType = DecimalType;