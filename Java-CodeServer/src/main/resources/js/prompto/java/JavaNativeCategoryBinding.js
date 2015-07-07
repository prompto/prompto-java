var NativeCategoryBinding = require("./../grammar/NativeCategoryBinding").NativeCategoryBinding;

function JavaNativeCategoryBinding(expression) {
	NativeCategoryBinding.call(this);
	this.expression = expression;
	return this;
}

JavaNativeCategoryBinding.prototype = Object.create(NativeCategoryBinding.prototype);
JavaNativeCategoryBinding.prototype.creator = JavaNativeCategoryBinding;

JavaNativeCategoryBinding.prototype.toDialect = function(writer) {
    writer.append("Java: ");
    this.expression.toDialect(writer);
};

exports.JavaNativeCategoryBinding = JavaNativeCategoryBinding;