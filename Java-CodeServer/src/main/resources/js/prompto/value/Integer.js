var Value = require("./Value").Value;
var Decimal = require("./Decimal").Decimal;
var IntegerType = null;
var DivideByZeroError = require("../error/DivideByZeroError").DivideByZeroError;

exports.resolve = function() {
    IntegerType = require("../type/IntegerType").IntegerType;
};

function Integer(value) {
	Value.call(this, IntegerType.instance);
	this.value = value>0 ? Math.floor(value) : Math.ceil(value);
	return this;
}

Integer.prototype = Object.create(Value.prototype);
Integer.prototype.constructor = Integer;

Integer.Parse = function(text) {
	return new Integer(parseInt(text));
};


Integer.prototype.toString = function() {
	return this.value.toString();
};


Integer.prototype.IntegerValue = function() {
	return this.value;
};

Integer.prototype.DecimalValue = function() {
	return this.value;
};

Integer.prototype.Add = function(context, value) {
	if (value instanceof Integer) {
		return new Integer(this.value + value.value);
	} else if (value instanceof Decimal) {
		return new Decimal(value.DecimalValue() + this.value);
	} else {
		throw new SyntaxError("Illegal: Integer + " + typeof(value));
	}
};

Integer.prototype.Subtract = function(context, value) {
	if (value instanceof Integer) {
		return new Integer(this.value - value.value);
	} else if (value instanceof Decimal) {
		return new Decimal(this.value - value.DecimalValue());
	} else {
		throw new SyntaxError("Illegal: Integer - " + typeof(value));
	}
};

Integer.prototype.Multiply = function(context, value) {
	if (value instanceof Integer) {
		return new Integer(this.value * value.value);
	} else if (value instanceof Decimal) {
		return new Decimal(value.value * this.value);
	} else if (value.Multiply) {
		return value.Multiply(context, this);
	} else {
		throw new SyntaxError("Illegal: Integer * " + typeof(value));
	}
};


Integer.prototype.Divide = function(context, value) {
	if (value instanceof Integer || value instanceof Decimal) {
		if (value.DecimalValue() == 0.0) {
			throw new DivideByZeroError();
		} else {
			return new Decimal(this.DecimalValue() / value.DecimalValue());
		}
	} else {
		throw new SyntaxError("Illegal: Integer / " + typeof(value));
	}
};

Integer.prototype.IntDivide = function(context, value) {
	if (value instanceof Integer) {
		if (value.IntegerValue() == 0) {
			throw new DivideByZeroError();
		} else {
			return new Integer(this.IntegerValue() / value.IntegerValue());
		}
	} else {
		throw new SyntaxError("Illegal: Integer \\ " + typeof(value));
	}
};

Integer.prototype.Modulo = function(context, value) {
	if (value instanceof Integer) {
		if (value.IntegerValue() == 0) {
			throw new DivideByZeroError();
		} else {
			return new Integer(this.IntegerValue() % value.IntegerValue());
		}
	} else {
		throw new SyntaxError("Illegal: Integer \\ " + typeof(value));
	}
};

Integer.prototype.Minus = function(context) {
	return new Integer(-this.value);
};

Integer.prototype.cmp = function(obj) {
	return this.value > obj.IntegerValue() ? 1 : this.value == obj.IntegerValue() ? 0 : -1 ;
};

Integer.prototype.CompareTo = function(context, value) {
	if (value instanceof Integer || value instanceof Decimal) {
		return this.value > value.value ? 1 : this.value == value.value ? 0 : -1;
	} else {
		throw new SyntaxError("Illegal comparison: Integer and " + typeof(value));
	}
};

/*
@Override
public Object ConvertTo(Class<?> type) {
	return value;
}

*/

Integer.prototype.equals = function(obj) {
	if (obj instanceof Integer) {
		return this.value == obj.value;
	} else if (obj instanceof Decimal) {
		return this.value == obj.value;
	} else {
		return false;
	}
};

exports.Integer = Integer;
