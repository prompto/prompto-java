var SyntaxError = require("../error/SyntaxError").SyntaxError;
var TupleValue = null;
var SetValue = null;
var ListValue = null;

exports.resolve = function() {
    TupleValue = require("../value/TupleValue").TupleValue;
    SetValue = require("../value/SetValue").SetValue;
    ListValue = require("../value/ListValue").ListValue;
};

function BaseType(name) {
	this.name = name;
	if(this.name!=name) {
		console.log(this.name);
	}
	return this;
};

/*

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof IType))
		return false;
	IType type = (IType) obj;
	return this.name.equals(type.name);
};

*/

BaseType.prototype.toString = function() {
	return this.name;
};


BaseType.prototype.checkAdd = function(context, other, tryReverse) {
    if(tryReverse)
        return other.checkAdd(context, this, false);
    else
	    throw new SyntaxError("Cannot add " + this.name + " to " + other.name);
};


BaseType.prototype.checkSubstract = function(context, other) {
	throw new SyntaxError("Cannot substract " + this.name + " from " + other.name);
};


BaseType.prototype.checkDivide = function(context, other) {
	throw new SyntaxError("Cannot divide " + this.name + " with " + other.name);
};


BaseType.prototype.checkIntDivide = function(context, other) {
	throw new SyntaxError("Cannot divide " + this.name + " with " + other.name);
};

BaseType.prototype.checkModulo = function(context, other) {
	throw new SyntaxError("Cannot modulo " + this.name + " with " + other.name);
};

BaseType.prototype.checkMultiply = function(context, other, tryReverse) {
    if(tryReverse)
        return other.checkMultiply(context, this, false);
    else
	    throw new SyntaxError("Cannot multiply " + this.name + " with " + other.name);
};

BaseType.prototype.checkMinus = function(context) {
	throw new SyntaxError("Cannot negate " + this.name);
};

BaseType.prototype.checkCompare = function(context, other) {
	throw new SyntaxError("Cannot compare " + this.name + " to " + other.name);
};


BaseType.prototype.checkContains = function(context, other) {
	throw new SyntaxError(this.name + " cannot contain " + other.name);
};


BaseType.prototype.checkContainsAllOrAny = function(context, other) {
	throw new SyntaxError(this.name + " cannot contain " + other.name);
};


BaseType.prototype.checkItem = function(context, itemType) {
	throw new SyntaxError("Cannot read item from " + this.name);
};


BaseType.prototype.checkMember = function(context, name) {
	throw new SyntaxError("Cannot read member from " + this.name);
};


BaseType.prototype.checkSlice = function(context) {
	throw new SyntaxError("Cannot slice " + this.name);
};


BaseType.prototype.checkIterator = function(context) {
	throw new SyntaxError("Cannot iterate over " + this.name);
};


BaseType.prototype.checkAssignableTo = function(context, other) {
	if (!this.isAssignableTo(context, other)) {
		throw new SyntaxError("Type: " + this.name + " is not compatible with: " + other.name);
	};
};

BaseType.prototype.checkRange = function(context, other) {
	throw new SyntaxError("Cannot create range of " + this.name + " and " + other.name);
};

BaseType.prototype.checkAnd = function(context, other) {
	throw new SyntaxError("Cannot logically combine " + this.name + " and " + other.name);
};

BaseType.prototype.checkOr = function(context, other) {
	throw new SyntaxError("Cannot logically combine " + this.name + " or " + other.name);
};

BaseType.prototype.checkNot = function(context) {
	throw new SyntaxError("Cannot logically negate " + this.name);
};

/*


 public Range<?> newRange(Object left, Object right) {
	throw new SyntaxError("Cannot create range of " + this.name);
};


public String toString(Object value) {
	return value.toString();
};

*/

BaseType.prototype.sort = function(context, list, cmp) {
	// only sort if required
	if(list.size()<=1) {
		return list;
	}
    // create result list we can sort in place
    var items = [];
    if( list instanceof ListValue || list instanceof TupleValue) {
        items = items.concat(list.items);
    } else if ( list instanceof SetValue) {
        for(var name in list.items)
            items.push(list.items[name]);
    }
	items.sort(cmp);
	return new ListValue(list.type.itemType, items);
};

BaseType.prototype.convertJavaScriptValueToPrestoValue = function(context, value, returnType) {
	return value; // TODO for now
};

BaseType.prototype.getMember = function(context, name) {
	throw new SyntaxError("Cannot read member from " + this.name);
};

BaseType.prototype.toDialect = function(writer) {
    writer.append(this.name);
};

exports.BaseType = BaseType;
