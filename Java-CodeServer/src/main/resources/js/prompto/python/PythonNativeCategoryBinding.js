var NativeCategoryBinding = require("./../grammar/NativeCategoryBinding").NativeCategoryBinding;

function PythonNativeCategoryBinding(identifier, module) {
	NativeCategoryBinding.call(this);
	this.identifier = identifier;
	this.module = module;
	return this;
}

PythonNativeCategoryBinding.prototype = Object.create(NativeCategoryBinding.prototype);
PythonNativeCategoryBinding.prototype.constructor = PythonNativeCategoryBinding;

exports.PythonNativeCategoryBinding = PythonNativeCategoryBinding;

