var BaseType = require("./BaseType").BaseType;
var BooleanType = require("./BooleanType").BooleanType;
var TextType = require("./TextType").TextType;

function EntryType(itemType) {
	BaseType.call(this, itemType.name + "{}[]");
	this.itemType = itemType;
	return this;
}

EntryType.prototype = Object.create(BaseType.prototype);
EntryType.prototype.constructor = EntryType;

EntryType.prototype.checkMember = function(context, name) {
	if ("key"==name) {
		return TextType.instance;
	} else if ("value"==name) {
		return this.itemType;
	} else {
		return BaseType.prototype.checkMember.call(this, context, name);
	}
};

exports.EntryType = EntryType;