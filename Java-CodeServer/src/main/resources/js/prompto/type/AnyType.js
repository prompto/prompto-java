var NativeType = require("./NativeType").NativeType;

function AnyType() {
 	NativeType.call(this, "any");
 	return this;
 }

 AnyType.prototype = Object.create(NativeType.prototype);
 AnyType.prototype.constructor = AnyType;

 AnyType.instance = new AnyType();
	
/*

@Override
public Class<?> toJavaClass() {
	return Object.class;
}

*/

AnyType.prototype.checkItem = function(context, name) {
	return AnyType.instance; // required to support Document items
};

AnyType.prototype.checkMember = function(context, name) {
	return AnyType.instance; // required to support Document members
};

AnyType.prototype.isAssignableTo = function(context, other) {
	return (other instanceof AnyType);
};

exports.AnyType = AnyType;
