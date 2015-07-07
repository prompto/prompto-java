var NativeType = require("./NativeType").NativeType;

function MissingType() {
	NativeType.call(this, "*");
	return this;
}

MissingType.prototype = Object.create(NativeType.prototype);
MissingType.prototype.constructor = MissingType;

MissingType.instance = new MissingType();
	
/*
	
	@Override
	public Class<?> toJavaClass() {
		return Object.class;
	}
*/

MissingType.prototype.isAssignableTo = function(context, other) {
	return true;
};

exports.MissingType = MissingType;