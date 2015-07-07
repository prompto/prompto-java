var NativeType = require("./NativeType").NativeType;
var IntegerType = require("./IntegerType").IntegerType;

function PeriodType()  {
	NativeType.call(this, "Duration");
	return this;
}

PeriodType.prototype = Object.create(NativeType.prototype);
PeriodType.prototype.constructor = PeriodType;

PeriodType.instance = new PeriodType();

/*
@Override
public Class<?> toJavaClass() {
	return Period.class;
}


@Override
public boolean isAssignableTo(Context context, IType other) {
	return (other instanceof PeriodType) || (other instanceof AnyType);
}

*/

PeriodType.prototype.checkAdd = function(context, other, tryReverse) {
	if(other instanceof PeriodType) {
		return this;
	} else {
		return NativeType.prototype.checkAdd(this, context, other, tryReverse);
	}
};

PeriodType.prototype.checkSubstract = function(context, other) {
	if(other instanceof PeriodType) {
		return this;
	} else {
		return NativeType.prototype.checkSubstract(this, context, other);
	}
};

PeriodType.prototype.checkMultiply = function(context, other, tryReverse) {
	if(other instanceof IntegerType) {
		return this;
	} else {
		return NativeType.prototype.checkMultiply(this, context, other, tryReverse);
	}
};


PeriodType.prototype.checkMinus = function(context) {
	return this;
};

/*
@Override
public IType checkCompare(Context context, IType other) throws SyntaxError {
	if(other instanceof PeriodType)
		return BooleanType.instance();
	return super.checkCompare(context, other);
}
*/

exports.PeriodType = PeriodType;
