var CollectionType = require("./CollectionType").CollectionType;
var BooleanType = require("./BooleanType").BooleanType;
var IntegerType = require("./IntegerType").IntegerType;
var TextType = require("./TextType").TextType;
var ListType = require("./ListType").ListType;
var EntryType = require("./EntryType").EntryType;

function DictType(itemType) {
	CollectionType.call(this, itemType.name+"{}", itemType);
	this.itemType = itemType;
	return this;
}

DictType.prototype = Object.create(CollectionType.prototype);
DictType.prototype.constructor = DictType;


DictType.prototype.isAssignableTo = function(context, other) {
	return (other instanceof DictType) && this.itemType.isAssignableTo(context, other.itemType);
};

/*
	@Override
	public Class<?> toJavaClass() {
		return Map.class;
	}
*/

DictType.prototype.equals = function(obj) {
	if (obj == null) {
		return false;
	} else if (obj == this) {
		return true;
	} else if (!(obj instanceof DictType)) {
		return false;
	} else {
		return this.itemType.equals(obj.itemType);
	}
};

DictType.prototype.checkAdd = function(context, other, tryReverse) {
	if(other instanceof DictType && this.itemType.equals(other.itemType)) {
		return this;
	} else {
		return CollectionType.prototype.checkAdd.call(this, context, other, tryReverse);
	}
};

DictType.prototype.checkContains = function(context, other) {
	if(other==TextType.instance) {
		return BooleanType.instance;
	} else {
		return CollectionType.prototype.checkContains.call(this, context, other);
	}
};


DictType.prototype.checkItem = function(context, other) {
	if(other==TextType.instance) {
		return this.itemType;
	} else {
		return CollectionType.prototype.checkItem.call(this, context, other);
	}
};


DictType.prototype.checkIterator = function(context) {
	return new EntryType(this.itemType);
};

DictType.prototype.checkMember = function(context, name) {
	if ("length"==name) {
		return IntegerType.instance;
	} else if("keys"==name) {
		return new ListType(TextType.instance);
	} else if ("values"==name) {
		return new ListType(this.itemType);
	} else {
		return CollectionType.prototype.checkMember.call(this, context, name);
	}
};

exports.DictType = DictType;
