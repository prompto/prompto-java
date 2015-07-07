var NativeType = require("./NativeType").NativeType;
var BooleanType = require("./BooleanType").BooleanType;
var ListType = require("./ListType").ListType;
var IntegerType = require("./IntegerType").IntegerType;
var AnyType = require("./AnyType").AnyType;

function TupleType()  {
	NativeType.call(this, "Tuple");
	return this;
}

TupleType.prototype = Object.create(NativeType.prototype);
TupleType.prototype.constructor = TupleType;

TupleType.instance = new TupleType();

/*

@Override
public Class<?> toJavaClass() {
	return null; // no equivalent
}

@Override
public boolean isAssignableTo(Context context, IType other) {
	return (other instanceof TupleType) || (other instanceof AnyType);
}
*/
TupleType.prototype.checkItem = function(context, other) {
	if(other==IntegerType.instance) {
		return AnyType.instance;
	} else {
		return NativeType.prototype.checkItem.call(this, context, other);
	}
};

TupleType.prototype.checkMember = function(context, name) {
	if ("length"==name) {
		return IntegerType.instance;
	} else {
		return NativeType.prototype.checkMember.call(this, context, name);
	}
};

TupleType.prototype.checkAdd = function(context, other, tryReverse) {
	if(other instanceof TupleType || other instanceof ListType) {
		return this;
	} else {
		return NativeType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

TupleType.prototype.checkContains = function(context, other) {
	return BooleanType.instance;
};

TupleType.prototype.checkContainsAllOrAny = function(context, other) {
	return BooleanType.instance;
};

exports.TupleType = TupleType;
