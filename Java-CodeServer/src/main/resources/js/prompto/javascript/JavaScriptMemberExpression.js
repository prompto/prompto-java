var JavaScriptSelectorExpression = require("./JavaScriptSelectorExpression").JavaScriptSelectorExpression;

function JavaScriptMemberExpression(name) {
	JavaScriptSelectorExpression.call(this);
	this.name = name;
	return this;
}

JavaScriptMemberExpression.prototype = Object.create(JavaScriptSelectorExpression.prototype);
JavaScriptMemberExpression.prototype.constructor = JavaScriptMemberExpression;

JavaScriptMemberExpression.prototype.toString = function() {
	return this.parent.toString() + "." + this.name;
};

JavaScriptMemberExpression.prototype.interpret = function(context) {
    var o = this.parent.interpret(context);
    if(o!=null) {
        return this.interpret_field(o);
    } else {
        return null;
    }
};

JavaScriptMemberExpression.prototype.toDialect = function(writer) {
    if (this.parent != null) {
        this.parent.toDialect(writer);
        writer.append('.');
    }
    writer.append(this.name);
};

JavaScriptMemberExpression.prototype.interpret_field = function(o) {
    return o[this.name];
};

exports.JavaScriptMemberExpression = JavaScriptMemberExpression;