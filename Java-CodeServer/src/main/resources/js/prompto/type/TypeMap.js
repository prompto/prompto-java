var VoidType = require("./VoidType").VoidType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function TypeMap() {
	return this;
}

TypeMap.prototype.inferType = function(context) {
	var keys = Object.keys(this);
	if(keys.length===0) {
		return VoidType.instance;
	}
	var type = null;
	// first pass: get less specific type
	for(var i=0;i<keys.length;i++) {
		var t = this[keys[i]];
		if(type==null) {
			type = t;
		} else if(t.isAssignableTo(context, type)) {
			continue;
		} else if(type.isAssignableTo(context, t)) {
			type = t;
		} else {
			throw new SyntaxError("Incompatible types: " + type.name + " and " + t.name);
		}
	}
	// second pass: check compatible
	for(var i=0;i<keys.length;i++) {
		var t = this[keys[i]];
		if(!t.isAssignableTo(context, type)) {
			throw new SyntaxError("Incompatible types: " + type.name + " and " + t.name);
		}
	}
	return type;
};

exports.TypeMap = TypeMap;
