var CollectionType = require("./CollectionType").CollectionType;
var IntegerType = require("./IntegerType").IntegerType;
var BooleanType = require("./BooleanType").BooleanType;

function SetType(itemType) {
	CollectionType.call(this, itemType.name+"<>", itemType);
	this.itemType = itemType;
	return this;
}

SetType.prototype = Object.create(CollectionType.prototype);
SetType.prototype.constructor = SetType;


SetType.prototype.equals = function(obj) {
	if(obj===this) {
		return true;
	}
	if(obj===null) {
		return false;
	}
	if(!(obj instanceof SetType)) {
		return false;
	}
	return this.itemType.equals(obj.itemType);
};

SetType.prototype.checkAdd = function(context, other, tryReverse) {
	if(other instanceof SetType && this.itemType.equals(other.itemType, tryReverse)) {
		return this;
	} else {
		return CollectionType.prototype.checkAdd.call(this, context, other);
	}
};

SetType.prototype.checkItem = function(context, other) {
	if(other==IntegerType.instance) {
		return this.itemType;
	} else {
		return CollectionType.prototype.checkItem.call(this, context, other);
	}
};

SetType.prototype.checkContainsAllOrAny = function(context, other) {
	return BooleanType.instance;
}

SetType.prototype.checkIterator = function(context) {
	return this.itemType;
}

SetType.prototype.checkMember = function(context, name) {
	if ("length" == name) {
		return IntegerType.instance;
	} else {
		return CollectionType.prototype.checkMember.call(this, context, name);
	}
};

exports.SetType = SetType;
