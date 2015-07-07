var NativeCategoryBinding = require("./../grammar/NativeCategoryBinding").NativeCategoryBinding;

function CSharpNativeCategoryBinding(expression) {
	NativeCategoryBinding.call(this);
	this.expression = expression;
	return this;
}

CSharpNativeCategoryBinding.prototype = Object.create(NativeCategoryBinding.prototype);
CSharpNativeCategoryBinding.prototype.constructor = CSharpNativeCategoryBinding;

CSharpNativeCategoryBinding.prototype.toDialect = function(writer) {
    writer.append("C#: ");
    this.expression.toDialect(writer);
};

exports.CSharpNativeCategoryBinding = CSharpNativeCategoryBinding;
