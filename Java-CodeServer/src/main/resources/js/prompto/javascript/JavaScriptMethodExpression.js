var JavaScriptSelectorExpression = require("./JavaScriptSelectorExpression").JavaScriptSelectorExpression;
var JavaScriptExpressionList = require("./JavaScriptExpressionList").JavaScriptExpressionList;
var NativeInstance = require("../value/NativeInstance").NativeInstance;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function JavaScriptMethodExpression(name, args) {
	JavaScriptSelectorExpression.call(this);
	this.name = name;
	this.args = args || new JavaScriptExpressionList();
	return this;
}

JavaScriptMethodExpression.prototype = Object.create(JavaScriptSelectorExpression.prototype);
JavaScriptMethodExpression.prototype.constructor = JavaScriptMethodExpression;


JavaScriptMethodExpression.prototype.toString = function() {
	return this.parent.toString() + "." + this.name + "(" + this.args.toString() + ")";
};

/*
	
@Override
public IType check(Context context) throws SyntaxError {
	Method method = findMethod(context);
	if(method==null)
		return null;
	else
		return new JavaScriptClassType(method.getReturnType());
}

*/
JavaScriptMethodExpression.prototype.interpret = function(context, module) {
	var args = this.args.computeArguments(context);
	if (this.parent === null) {
		return this.interpretGlobal(context, module, args);
	} else {
		return this.interpretMember(context, module, args);
	}
};

JavaScriptMethodExpression.prototype.interpretGlobal = function(context, module, args) {
	/*var m = rewritten.get(self.name, None)
	if m is
	None:
		m = globals().get(self.name, None)
	if m is
	None:
		m = globals()["__builtins__"].get(self.name, None)
	if isinstance(args, tuple):
	return m( * args
	)
	elif
	isinstance(args, dict)
	:
	return m( * * args
	)
	else:
	return m()*/
};


JavaScriptMethodExpression.prototype.interpretMember = function(context, module, args) {
	var p = this.parent.interpret(context, module)
	if(p===null) {
		throw "Null reference";
	}
	if(p instanceof NativeInstance) {
		p = p.instance;
	}
	var m = p[this.name];
	if(!m) {
		throw new SyntaxError(this.name + " is not a member of " + p.toString());
	}
	return m.apply(p, args);
};

JavaScriptMethodExpression.prototype.toDialect = function(writer) {
    if(this.parent!=null) {
        this.parent.toDialect(writer);
        writer.append('.');
    }
    writer.append(this.name);
    writer.append('(');
    if(this.args!=null)
        this.args.toDialect(writer);
    writer.append(')');
};

exports.JavaScriptMethodExpression = JavaScriptMethodExpression;