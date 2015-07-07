var InvalidDataError = require("../error/InvalidDataError").InvalidDataError;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var IntegerType = require("../type/IntegerType").IntegerType;
var BaseValueList = require("../value/BaseValueList").BaseValueList;
var Integer = require("../value/Integer").Integer;
var Value = require("../value/Value").Value;

function ItemInstance(item) {
	this.parent = null;
	this.item = item;
	return this;
}
	
ItemInstance.prototype.toString = function() {
	return this.parent.toString() + "[" + this.item.toString() + "]";
};

ItemInstance.prototype.toDialect = function(writer) {
    this.parent.toDialect(writer);
    writer.append('[');
    this.item.toDialect(writer);
    writer.append(']');
}

ItemInstance.prototype.checkAssignValue = function(context, expression) {
	this.parent.checkAssignElement(context);
	var itemType = this.item.check(context);
	if(itemType!=IntegerType.instance) {
		throw new SyntaxError("Expecting an Integer, got:" + itemType.toString());
	}
};

ItemInstance.prototype.checkAssignMember = function(context, memberName) {
	// TODO Auto-generated method stub
};

/*

@Override
public void checkAssignElement(Context context) throws SyntaxError {
	// TODO Auto-generated method stub
	
}

*/

ItemInstance.prototype.assign = function(context, expression) {
	var obj = this.parent.interpret(context);
	if(!(obj instanceof BaseValueList)) {
		throw new InvalidDataError("Expected a List, got:" + typeof(obj));
	}
	var idx = this.item.interpret(context);
	if(!(idx instanceof Integer)) {
		throw new InvalidDataError("Expected an Integer, got:" + idx.getClass().getName());
	}
	var index = idx.IntegerValue();
	if(index<1 || index>obj.size()) {
		throw new IndexOutOfRangeError();
	}
	obj.setItem(index-1, expression.interpret(context));
};

ItemInstance.prototype.interpret = function(context) {
    var parent = this.parent.interpret(context);
    var item = this.item.interpret(context);
    if (parent.getItemInContext && item instanceof Value) {
		return parent.getItemInContext(context, item);
	} else {
		throw new SyntaxError("Unknown item/key: " + typeof(item));
	}
};

exports.ItemInstance = ItemInstance;
