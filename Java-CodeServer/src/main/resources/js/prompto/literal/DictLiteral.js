var Literal = require("./Literal").Literal;
var DictEntryList = require("./DictEntryList").DictEntryList;
var Dictionary = require("../value/Dictionary").Dictionary;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var MissingType = require("../type/MissingType").MissingType;
var DictType = require("../type/DictType").DictType;
var TextType = require("../type/TextType").TextType;

// we can only compute keys by evaluating key expressions in context
// so we need to keep the full entry list.
function DictLiteral(entries) {
	this.entries = entries || new DictEntryList();
    this.itemType = null;
	Literal.call(this, this.entries.toString(), new Dictionary(MissingType.instance));
	return this;
}

DictLiteral.prototype = Object.create(Literal.prototype);
DictLiteral.prototype.constructor = DictLiteral;

DictLiteral.prototype.toDialect = function(writer) {
    this.entries.toDialect(writer);
};

DictLiteral.prototype.check = function(context) {
	if(this.itemType==null)
        this.itemType = this.inferElementType(context);
	return new DictType(this.itemType);
};

DictLiteral.prototype.inferElementType = function(context) {
	var items = this.entries.items;
	if(items.length==0) {
		return MissingType.instance;
	}
	var lastType = null;
	for(var i=0;i<items.length;i++) {
		var entry = items[i];
		var keyType = entry.key.check(context);
		if(keyType!=TextType.instance) {
			throw new SyntaxError("Illegal key type: " + keyType.toString());
		}
		var elemType = entry.value.check(context);
		if(lastType==null) {
			lastType = elemType;
		} else if(!lastType.equals(elemType)) {
			if(elemType.isAssignableTo(context, lastType)) {
				; // lastType is less specific
			} else if(lastType.isAssignableTo(context, elemType)) {
				lastType = elemType; // elemType is less specific
			} else {
				throw new SyntaxError("Incompatible value types: " + elemType.toString() + " and " + lastType.toString());
			}
		}
	}
	return lastType;
};

DictLiteral.prototype.interpret = function(context) {
	if(!this.value.isEmpty() || this.entries.items.length==0) {
		return this.value;
	}
    this.check(context); /// force computation of itemType
	var dict = {};
	for(var i=0;i<this.entries.items.length;i++) {
		var entry = this.entries.items[i];
		var key = entry.key.interpret(context);
		var val = entry.value.interpret(context);
		dict[key] = val;
	}
	this.value = new Dictionary(this.itemType, dict);
	return this.value;
}

exports.DictLiteral = DictLiteral;
