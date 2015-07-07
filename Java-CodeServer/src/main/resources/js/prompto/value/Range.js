var Value = require("./Value").Value;
var Integer = require("./Integer").Integer;
var IndexOutOfRangeError = require("../error/IndexOutOfRangeError").IndexOutOfRangeError;
var BaseType = require("../type/BaseType").BaseType;
var RangeType = require("../type/RangeType").RangeType;

function Range(itemType, left, right) {
    if(!(itemType instanceof BaseType))
        return;
	Value.call(this, new RangeType(itemType));
	var cmp = left.cmp(right);
	if(cmp<0) {
		this.low = left;
		this.high = right;
	} else {
		this.low = right;
		this.high = left;
	}
	return this;
}

Range.prototype = Object.create(Value.prototype);
Range.prototype.constructor = Range;

Range.prototype.toString = function() {
	return "[" + (this.low==null?"":this.low.toString()) + ".."
			+ (this.high==null?"":this.high.toString()) + "]";
};

Range.prototype.equals = function(obj) {
	if(obj instanceof Range) {
		return this.low.equals(obj.low) && this.high.equals(obj.high);
	} else {
		return false;
	}
};


Range.prototype.hasItem = function(context, lval) {
	var a = lval.cmp(this.low);
	var b = this.high.cmp(lval);
	return a>=0 && b>=0;
};

Range.prototype.getItemInContext = function(context, index) {
	if (index instanceof Integer) {
		try {
			var value = this.getItem(index.IntegerValue());
			if (value instanceof Value) {
				return value;
			} else {
				throw new InternalError("Item not a value!");
			}
		} catch (e) {
			throw new IndexOutOfRangeError();
		}

	} else {
		throw new SyntaxError("No such item:" + index.toString());
	}
};

Range.prototype.slice = function(fi, li) {
	var size = this.size();
	var first = this.checkFirst(fi, size);
	var last = this.checkLast(li, size);
	return this.newInstance(this.getItem(first),this.getItem(last));
}

Range.prototype.checkFirst = function(fi, size) {
	var value = (fi == null) ? 1 : fi.IntegerValue();
	if (value < 1 || value > size) {
		throw new IndexOutOfRangeError();
	}
	return value;
};

Range.prototype.checkLast = function(li, size) {
	var value = (li == null) ? size : li.IntegerValue();
	if (value < 0) {
		value = size + 1 + li.IntegerValue();
	}
	if (value < 1 || value > size) {
		throw new IndexOutOfRangeError();
	}
	return value;
};

/*
 @Override
 public Iterable<T> getItems(Context context) {
 return new RangeIterable(context);
 }

*/


Range.prototype.getIterator = function(context) {
	return new RangeIterator(context, this);
};

function RangeIterator(context, range) {
	this.context = context;
	this.range = range;
	this.index = 0;
	return this;
}

RangeIterator.prototype.hasNext = function() {
	return this.index<this.range.size();
};

RangeIterator.prototype.next = function() {
	return this.range.getItemInContext(this.context, new Integer(++this.index));
};

/*
@Override
public boolean isEmpty() {
	return size()==0;
}

public abstract long size();
public abstract int compare(T o1,T o2);
public abstract T getItem(long index);
public abstract Range<T> newInstance(T left,T right);

*/

exports.Range = Range;