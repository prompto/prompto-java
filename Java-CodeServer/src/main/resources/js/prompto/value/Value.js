var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Text = null;
var Integer = null;
var Decimal = null;

exports.resolve = function() {
    Text = require("./Text").Text;
    Integer = require("./Integer").Integer;
    Decimal = require("./Decimal").Decimal;
};

var id = 0;

function Value (type) {
    this.id = ++id;
    this.type = type;
    this.mutable = false;
	return this;
}

Value.prototype.And = function(context, value) {
	throw new SyntaxError("Logical and not supported by " + this.constructor.name);
};

Value.prototype.Or = function(context, value) {
	throw new SyntaxError("Logical or not supported by " + this.constructor.name);
};

Value.prototype.Not = function(context) {
	throw new SyntaxError("Logical negation not supported by " + this.constructor.name);
};

Value.prototype.Add = function(context, value) {
	throw new SyntaxError("Add not supported by " + this.constructor.name);
};

Value.prototype.Subtract = function(context, value) {
	throw new SyntaxError("Subtract not supported by " + this.constructor.name);
};

Value.prototype.Multiply = function(context, value) {
	throw new SyntaxError("Multiply not supported by " + this.constructor.name);
};

Value.prototype.Divide = function(context, value) {
	throw new SyntaxError("Divide not supported by " + this.constructor.name);
};

Value.prototype.IntDivide = function(context, value) {
	throw new SyntaxError("Integer divide not supported by " + this.constructor.name);
};

Value.prototype.Modulo = function(context, value) {
	throw new SyntaxError("Modulo not supported by " + this.constructor.name);
};

Value.prototype.Minus = function(context) {
	throw new SyntaxError("Minus not supported by " + this.constructor.name);
};

Value.prototype.CompareTo = function(context, value) {
	throw new SyntaxError("Compare not supported by " + this.constructor.name);
};

Value.prototype.getMember = function(context, name) {
	throw new SyntaxError("No member support for " + this.constructor.name);
};

Value.prototype.ConvertTo = function(type) {
	return this;
};

Value.prototype.Roughly = function(context, value) {
    return this.equals(value);
};

Value.convertFromJavaScript = function(value) {
	if(value==null) {
		return NullValue.instance;
	} else if(typeof(value)=='string') {
		return new Text(value);
	} else if(typeof(value)=='number') {
        if(value == (value | 0))
            return new Integer(value);
        else
            return new Decimal(value);
    } else {
		throw "Not implemented yet convertFromJavaScript:" + typeof(value);
	}
};

exports.Value = Value;
