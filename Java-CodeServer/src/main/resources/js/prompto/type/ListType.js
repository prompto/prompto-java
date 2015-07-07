var CollectionType = require("./CollectionType").CollectionType;
var IntegerType = null;
var BooleanType = require("./BooleanType").BooleanType;

exports.resolve = function() {
    IntegerType = require("./IntegerType").IntegerType;
};

function ListType(itemType) {
	CollectionType.call(this, itemType.name+"[]", itemType);
	this.itemType = itemType;
	return this;
}
	
ListType.prototype = Object.create(CollectionType.prototype);
ListType.prototype.constructor = ListType;

/*
	@Override
	public Class<?> toJavaClass() {
		return List.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof ListType) && itemType.isAssignableTo(context, ((ListType)other).getItemType());
	}
*/

ListType.prototype.equals = function(obj) {
	if(obj===this) {
		return true;
	}
	if(obj===null) {
		return false;
	}
	if(!(obj instanceof ListType)) {
		return false;
	}
	return this.itemType.equals(obj.itemType);
};

ListType.prototype.checkAdd = function(context, other, tryReverse) {
	if(other instanceof ListType && this.itemType.equals(other.itemType)) {
		return this;
	} else {
		return CollectionType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

ListType.prototype.checkItem = function(context, other) {
	if(other==IntegerType.instance) {
		return this.itemType;
	} else {
		return CollectionType.prototype.checkItem.call(this, context, other);
	}
};

ListType.prototype.checkMultiply = function(context, other, tryReverse) {
	if(other instanceof IntegerType) {
		return this;
	} else {
		return CollectionType.prototype.checkMultiply.call(this, context, other, tryReverse);
	}
};

ListType.prototype.checkSlice = function(context) {
	return this;
};

ListType.prototype.checkContainsAllOrAny = function(context, other) {
	return BooleanType.instance;
}

ListType.prototype.checkIterator = function(context) {
	return this.itemType;
}

ListType.prototype.checkMember = function(context, name) {
	if ("length" == name) {
		return IntegerType.instance;
	} else {
		return CollectionType.prototype.checkMember.call(this, context, name);
	}
};

exports.ListType = ListType;
