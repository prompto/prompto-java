var PythonNativeCategoryBinding = require("./PythonNativeCategoryBinding").PythonNativeCategoryBinding;

function Python2NativeCategoryBinding(binding) {
	PythonNativeCategoryBinding.call(this, binding.identifier, binding.module);
	return this;
}

Python2NativeCategoryBinding.prototype = Object.create(PythonNativeCategoryBinding.prototype);
Python2NativeCategoryBinding.prototype.constructor = Python2NativeCategoryBinding;

Python2NativeCategoryBinding.prototype.toDialect = function(writer) {
    writer.append("Python2: ");
    writer.append(this.identifier);
    if(this.module!=null)
        this.module.toDialect(writer);
};

exports.Python2NativeCategoryBinding = Python2NativeCategoryBinding;

