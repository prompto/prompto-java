var PythonExpression = require("./PythonExpression").PythonExpression;

function PythonIdentifierExpression(parent, identifier) {
	PythonExpression.call(this);
	this.parent = parent;
	this.identifier = identifier;
	return this;
}

PythonIdentifierExpression.prototype = Object.create(PythonExpression.prototype);
PythonIdentifierExpression.prototype.constructor = PythonIdentifierExpression;

PythonIdentifierExpression.prototype.toString = function() {
	if(this.parent===null) {
		return this.identifier;
	} else {
		return this.parent.toString() + "." + this.identifier;
	}
}

PythonIdentifierExpression.parse = function(ids) {
	var parts = ids.split("\\.");
	var result = null;
	for(var idx=0;i<parts.length;idx++) {
		result = new PythonIdentifierExpression(result, parts[idx]);
	}
	return result;
};

PythonIdentifierExpression.prototype.toDialect = function(writer) {
    if(this.parent!=null) {
        this.parent.toDialect(writer);
        writer.append('.');
    }
    writer.append(this.identifier);
};


exports.PythonIdentifierExpression = PythonIdentifierExpression;
