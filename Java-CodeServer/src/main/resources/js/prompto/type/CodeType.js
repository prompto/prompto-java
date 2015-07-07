var NativeType = require("./NativeType").NativeType;

function CodeType()  {
	NativeType.call(this, "Code");
	return this;
}

CodeType.prototype = Object.create(NativeType.prototype);
CodeType.prototype.constructor = CodeType;

CodeType.instance = new CodeType();

/*
@Override
public Class<?> toJavaClass() {
	return null;
}
*/

exports.CodeType = CodeType;
