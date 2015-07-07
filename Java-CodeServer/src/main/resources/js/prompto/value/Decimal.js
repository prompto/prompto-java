var Value = require("./Value").Value;
var Integer = null; // circular dependency
var DecimalType = null;

exports.resolve = function() {
	Integer = require("./Integer").Integer;
    DecimalType = require("../type/DecimalType").DecimalType;
};

function Decimal(value) {
	Value.call(this, DecimalType.instance);
	this.value = value;
	return this;
}

Decimal.prototype = Object.create(Value.prototype);
Decimal.prototype.constructor = Decimal;

Decimal.Parse = function(text) {
	return new Decimal(parseFloat(text));
};

Decimal.prototype.toString = function() {
	// mimic 0.0######
	if(this.value == (this.value | 0)) {
		return Number(this.value).toFixed(1);
	} else {
		return this.value;
	}
};

/*jshint bitwise:false*/
Decimal.prototype.IntegerValue = function() {
	return this.value | 0;
};

Decimal.prototype.DecimalValue = function() {
	return this.value;
};

Decimal.prototype.Add = function(context, value) {
	if (value instanceof Integer) {
		return new Decimal(this.value + value.IntegerValue());
	} else if (value instanceof Decimal) {
		return new Decimal(this.value + value.DecimalValue());
	} else {
		throw new SyntaxError("Illegal: Decimal + " + typeof(value));
	}
};

Decimal.prototype.Subtract = function(context, value) {
	if (value instanceof Integer) {
		return new Decimal(this.value - value.IntegerValue());
	} else if (value instanceof Decimal) {
		return new Decimal(this.value - value.DecimalValue());
	} else {
		throw new SyntaxError("Illegal: Decimal - " + typeof(value));
	}
};

Decimal.prototype.Multiply = function(context, value) {
	if (value instanceof Integer) {
		return new Decimal(this.value * value.IntegerValue());
	} else if (value instanceof Decimal) {
		return new Decimal(this.value * value.DecimalValue());
	} else {
		throw new SyntaxError("Illegal: Decimal * " + typeof(value));
	}
};

Decimal.prototype.Divide = function(context, value) {
	if (value instanceof Integer || value instanceof Decimal) {
		if (value.DecimalValue() == 0.0) {
			throw new DivideByZeroError();
		} else {
			return new Decimal(this.DecimalValue() / value.DecimalValue());
		}
	} else {
		throw new SyntaxError("Illegal: Decimal / " + typeof(value));
	}
};

Decimal.prototype.IntDivide = function(context, value) {
    if (value instanceof Integer) {
        if (value.IntegerValue() == 0) {
            throw new DivideByZeroError();
        } else {
            return new Integer(this.DecimalValue() / value.IntegerValue());
        }
    } else {
        throw new SyntaxError("Illegal: Decimal \\ " + typeof(value));
    }
};

Decimal.prototype.Modulo = function(context, value) {
    if (value instanceof Integer || value instanceof Decimal) {
        if (value.DecimalValue() == 0.0) {
            throw new DivideByZeroError();
        } else {
            return new Decimal(this.DecimalValue() % value.DecimalValue());
        }
    } else {
        throw new SyntaxError("Illegal: Decimal % " + typeof(value));
    }
};

Decimal.prototype.Minus = function(context) {
	return new Decimal(-this.value);
};

Decimal.prototype.CompareTo = function(context, value) {
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

Decimal.prototype.equals = function(obj) {
	if (obj instanceof Integer || obj instanceof Decimal) {
		return this.value == obj.value;
	} else {
		return false;
	}
};

exports.Decimal = Decimal;

