var PythonNativeCategoryBinding = require("./PythonNativeCategoryBinding").PythonNativeCategoryBinding;

function Python3NativeCategoryBinding(binding) {
	PythonNativeCategoryBinding.call(this, binding.identifier, binding.module);
	return this;
}

Python3NativeCategoryBinding.prototype = Object.create(PythonNativeCategoryBinding.prototype);
Python3NativeCategoryBinding.prototype.constructor = Python3NativeCategoryBinding;

Python3NativeCategoryBinding.prototype.toDialect = function(writer) {
    writer.append("Python3: ");
    writer.append(this.identifier);
    if(this.module!=null)
        this.module.toDialect(writer);
};

exports.Python3NativeCategoryBinding = Python3NativeCategoryBinding;

