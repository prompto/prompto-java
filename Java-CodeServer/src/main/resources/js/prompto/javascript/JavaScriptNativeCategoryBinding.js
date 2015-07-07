var NativeCategoryBinding = require("./../grammar/NativeCategoryBinding").NativeCategoryBinding;

function JavaScriptNativeCategoryBinding(identifier, module) {
	NativeCategoryBinding.call(this);
	this.identifier = identifier;
	this.module = module || null;
	return this;
}

JavaScriptNativeCategoryBinding.prototype = Object.create(NativeCategoryBinding.prototype);
JavaScriptNativeCategoryBinding.prototype.creator = JavaScriptNativeCategoryBinding;

JavaScriptNativeCategoryBinding.prototype.resolve = function() {
	var m = this.resolve_module();
	if(m==null) {
		return eval(this.identifier);
	} else {
		return m[this.identifier] || null;
	}
};

JavaScriptNativeCategoryBinding.prototype.resolve_module = function(context) {
	if (this.module == null) {
		return null;
	} else {
		return this.module.resolve();
	}
};

JavaScriptNativeCategoryBinding.prototype.toDialect = function(writer) {
    writer.append("JavaScript: ");
    writer.append(this.identifier);
    if(this.module!=null)
        this.module.toDialect(writer);
};

exports.JavaScriptNativeCategoryBinding = JavaScriptNativeCategoryBinding;

