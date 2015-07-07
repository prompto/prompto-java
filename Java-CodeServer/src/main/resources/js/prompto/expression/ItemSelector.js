var SelectorExpression = require("./SelectorExpression").SelectorExpression;
var Value = require("../value/Value").Value;
var NullValue = require("../value/NullValue").NullValue;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;

function ItemSelector(parent, item) {
	SelectorExpression.call(this, parent);
	this.item = item;
}

ItemSelector.prototype = Object.create(SelectorExpression.prototype);
ItemSelector.prototype.constructor = ItemSelector;

ItemSelector.prototype.toString = function() {
	return this.parent.toString() + "[" + this.item.toString() + "]";
};

ItemSelector.prototype.toDialect = function(writer) {
    this.parent.toDialect(writer);
    writer.append("[");
    this.item.toDialect(writer);
    writer.append("]");
};

ItemSelector.prototype.check = function(context) {
	var parentType = this.parent.check(context);
	var itemType = this.item.check(context);
	return parentType.checkItem(context,itemType);
};

ItemSelector.prototype.interpret = function(context) {
    var o = this.parent.interpret(context);
    if (o == null || o == NullValue.instance) {
        throw new NullReferenceError();
    }
    var i = this.item.interpret(context);
    if (i == null || i == NullValue.instance) {
        throw new NullReferenceError();
    }
    if (o.getItemInContext && i instanceof Value) {
        return o.getItemInContext(context, i);
    } else {
        throw new SyntaxError("Unknown container: " + this.parent);
    }
};

exports.ItemSelector = ItemSelector;