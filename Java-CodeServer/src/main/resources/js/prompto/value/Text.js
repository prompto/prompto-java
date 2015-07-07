var Value = require("./Value").Value;
var Character = require("./Character").Character;
var Integer = require("./Integer").Integer;
var TextType = require("../type/TextType").TextType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var IndexOutOfRangeError = require("../error/IndexOutOfRangeError").IndexOutOfRangeError;
var removeAccents = require("../utils/Utils").removeAccents;

function Text(value) {
	Value.call(this, TextType.instance);
	this.value = value;
	return this;
}

Text.prototype = Object.create(Value.prototype);
Text.prototype.constructor = Text;


Text.prototype.getValue = function() {
	return this.value;
};

Text.prototype.toString = function() {
	return this.value;
};


/*
@Override
public long size() {
	return value.length();
}

@Override
public boolean isEmpty() {
	return value.isEmpty();
}

*/

Text.prototype.Add = function(context, value) {
	return new Text(this.value + value.toString());
};

Text.prototype.Multiply = function(context, value) {
	if (value instanceof Integer) {
		var count = value.IntegerValue();
		if (count < 0) {
			throw new SyntaxError("Negative repeat count:" + count);
		} else if (count == 0) {
			return new Text("");
		} else if (count == 1) {
			return new Text(this.value);
		} else {
			var all = [];
			while (--count >= 0) {
				all[count] = this.value;
			}
			var value = all.join("");
			return new Text(value);
		}
	} else {
		throw new SyntaxError("Illegal: Chararacter * " + typeof(value));
	}
};

Text.prototype.CompareTo = function(context, value) {
	if(value instanceof Text || value instanceof Character) {
		return this.value > value.value ? 1 : this.value == value.value ? 0 : -1;
	} else {
		throw new SyntaxError("Illegal: Compare Text with " + typeof(value));
	}
};

Text.prototype.hasItem = function(context, value) {
	if (value instanceof Character || value instanceof Text) {
		return this.value.indexOf(value.value) >= 0;
	} else {
		throw new SyntaxError("Illegal contains: Text + " + typeof(value));
	}
};


Text.prototype.getMember = function(context, name) {
	if ("length"==name) {
		return new Integer(this.value.length);
	} else {
		throw new InvalidDataError("No such member:" + name);
	}
};

Text.prototype.getItemInContext = function(context, index) {
	try {
		if (index instanceof Integer) {
			return new Character(this.value[index.IntegerValue() - 1]);
		} else {
			throw new InvalidDataError("No such item:" + index.toString());
		}
	} catch (e) {
		if(e instanceof IndexOutOfBoundsException) {
			throw new IndexOutOfRangeError();
		} else {
			throw e;
		}
	}

}

Text.prototype.getIterator = function(context) {
	return new TextIterator(this.value);
};

function TextIterator(value) {
	this.index = -1;
	this.value = value;
	return this;
}

TextIterator.prototype.hasNext = function() {
	return this.index < this.value.length - 1;
};

TextIterator.prototype.next = function() {
	return new Character(this.value[++this.index]);
};


Text.prototype.convertToJavaScript = function() {
	return this.value;
};

Text.prototype.slice = function(fi, li) {
	var first = this.checkFirst(fi);
	var last = this.checkLast(li);
	return new Text(this.value.slice(first - 1, last));
};

Text.prototype.checkFirst = function(fi) {
	var value = (fi == null) ? 1 : fi.IntegerValue();
	if (value < 1 || value > this.value.length) {
		throw new IndexOutOfRangeError();
	}
	return value;
};

Text.prototype.checkLast = function(li) {
	var value = (li == null) ? this.value.length : li.IntegerValue();
	if (value < 0) {
		value = this.value.length + 1 + li.IntegerValue();
	}
	if (value < 1 || value > this.value.length) {
		throw new IndexOutOfRangeError();
	}
	return value;
};

Text.prototype.equals = function(obj) {
	if (obj instanceof Text) {
		return this.value == obj.value;
	} else {
		return false;
	}
};

Text.prototype.Roughly = function(context, obj) {
    if (obj instanceof Text || obj instanceof Character) {
        return removeAccents(this.value.toLowerCase()) == removeAccents(obj.value.toLowerCase());
    } else {
        return false;
    }
};


/*

@Override
public int hashCode() {
	return value.hashCode();
}
}

*/

exports.Text = Text;


