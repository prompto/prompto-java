var BaseType = require("../type/BaseType").BaseType;

function Variable (name, type) {
    if(!(type instanceof BaseType))
        throw new Exception();
    this.name = name;
	this.type = type;
	return this;
}

Variable.prototype.toString = function() {
	return this.name;
}

Variable.prototype.getType = function(context) {
    return this.type;
};

exports.Variable = Variable;
