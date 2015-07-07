var Variable = require("./Variable").Variable;
var AnyType = require("../type/AnyType").AnyType;

function TransientVariable(name, type) {
	Variable.call(this, name, AnyType.instance);
	this.type = type;
	return this;
}

TransientVariable.prototype = Object.create(Variable.prototype);
TransientVariable.prototype.constructor = TransientVariable;

TransientVariable.prototype.toString = function() {
	return this.name;
};

TransientVariable.prototype.getType = function(context) {
	return this.type;
};

exports.TransientVariable = TransientVariable;
