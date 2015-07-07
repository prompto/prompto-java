var ObjectList = require("../utils/ObjectList").ObjectList;

function MethodDeclarationList(method) {
    ObjectList.call(this, null, method);
	return this;
}

MethodDeclarationList.prototype = Object.create(ObjectList.prototype);
MethodDeclarationList.prototype.constructor = MethodDeclarationList;

exports.MethodDeclarationList = MethodDeclarationList;
