var NativeType = require("./NativeType").NativeType;
var AnyType = require("./AnyType").AnyType;

function DocumentType() {
	NativeType.call(this, "Document");
	return this;
}

DocumentType.prototype = Object.create(NativeType.prototype);
DocumentType.prototype.constructor = DocumentType;

DocumentType.instance = new DocumentType();


/*
@Override
public Class<?> toJavaClass() {
	return Document.class;
}

@Override
public boolean isAssignableTo(Context context, IType other) {
	return (other instanceof DocumentType) || (other instanceof AnyType);
}
*/

DocumentType.prototype.checkMember = function(context, name) {
	return AnyType.instance;
};

exports.DocumentType = DocumentType;
