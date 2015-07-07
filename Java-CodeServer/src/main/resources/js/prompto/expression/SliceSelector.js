var SelectorExpression = require("./SelectorExpression").SelectorExpression;
var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var IntegerType = require("../type/IntegerType").IntegerType;
var Integer = require("../value/Integer").Integer;

function SliceSelector(parent, first, last) {
	SelectorExpression.call(this, parent);
	this.first = first || null;
	this.last = last || null;
	return this;
}

SliceSelector.prototype = Object.create(SelectorExpression.prototype);
SliceSelector.prototype.constructor = SliceSelector;

SliceSelector.prototype.toString = function() {
	return this.parent.toString() + "[" +
			(this.first==null?"":this.first.toString()) + ":" +
			(this.last==null?"":this.last.toString()) + "]";
};
SliceSelector.prototype.toDialect = function(writer) {
    this.parent.toDialect(writer);
    writer.append('[');
    if (this.first != null)
        this.first.toDialect(writer);
    writer.append(':');
    if (this.last != null)
        this.last.toDialect(writer);
    writer.append(']');
};

SliceSelector.prototype.check = function(context) {
	var firstType = this.first!=null ? this.first.check(context) : null;
	var lastType = this.last!=null ? this.last.check(context) : null;
	if(this.firstType!=null && !(this.firstType instanceof IntegerType)) {
		throw new SyntaxError(this.firstType.toString() + " is not an integer");
	}
	if(this.lastType!=null && !(this.lastType instanceof IntegerType)) {
		throw new SyntaxError(this.lastType.toString() + " is not an integer");
	}
	var parentType = this.parent.check(context);
	return parentType.checkSlice(context);
};

SliceSelector.prototype.interpret = function(context) {
	var o = this.parent.interpret(context);
	if (o == null) {
		throw new NullReferenceError();
	}
    if (o.sliceable)
        o = o.sliceable;
	if (o.slice) {
		var fi = this.first != null ? this.first.interpret(context) : null;
		if (fi != null && !(fi instanceof Integer)) {
			throw new SyntaxError("Illegal slice value type: " + fi);
		}
		var li = this.last != null ? this.last.interpret(context) : null;
		if (li != null && !(li instanceof Integer)) {
			throw new SyntaxError("Illegal slice value type: " + li);
		}
		return o.slice(fi, li);
	} else {
		throw new SyntaxError("Illegal sliced object: " + this.parent);
	}
};

exports.SliceSelector = SliceSelector;
