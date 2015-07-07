var SyntaxError = require("../error/SyntaxError").SyntaxError;
var BooleanType = require("../type/BooleanType").BooleanType;
var Value = require("./Value").Value;

function Bool(value) {
	Value.call(this, BooleanType.instance);
	this.value = value;
	return this;
}

Bool.prototype = Object.create(Value.prototype);
Bool.prototype.constructor = Bool;

Bool.TRUE = new Bool(true);
Bool.FALSE = new Bool(false);
Bool.TRUE.not = Bool.FALSE;
Bool.FALSE.not = Bool.TRUE;

Bool.ValueOf = function(value) {
	return value ? Bool.TRUE : Bool.FALSE;
};

Bool.Parse = function(text) {
	var bool = text==="true";
	return Bool.ValueOf(bool);
};

Bool.prototype.getValue = function() {
	return this.value;
};

Bool.prototype.And = function(value) {
	if(value instanceof Bool) {
		return Bool.ValueOf(this.value && value.value);
	} else {
		throw new SyntaxError("Illegal: Boolean and " + typeof(value));
	}
	return this.value;
};

Bool.prototype.Or = function(value) {
	if(value instanceof Bool) {
		return Bool.ValueOf(this.value || value.value);
	} else {
		throw new SyntaxError("Illegal: Boolean or " + typeof(value));
	}
	return this.value;
};

Bool.prototype.Not = function() {
	return this.not;
};

/*
public Boolean getNot() {
	return not;
}

public int CompareTo(Context context, IValue value) throws SyntaxError {
	if (value instanceof Boolean)
		return compareTo((Boolean) value);
	else
		throw new SyntaxError("Illegal comparison: Boolean + " + value.getClass().getSimpleName());
}

public int compareTo(Boolean other) {
	return java.lang.Boolean.compare(this.value, other.value);
}

public Object ConvertTo(Class<?> type) {
	return value;
}
*/

Bool.prototype.toString = function() {
	return this.value.toString();
};

Bool.prototype.equals = function(obj) {
	if (obj instanceof Bool) {
		return this.value == obj.value;
	} else {
		return false;
	}
};

exports.Bool = Bool;
