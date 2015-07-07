var CSharpExpression = require("./CSharpExpression").CSharpExpression;

function CSharpIdentifierExpression(parent, identifier) {
	CSharpExpression.call(this);
	this.parent = parent;
	this.identifier = identifier;
	return this;
}

CSharpIdentifierExpression.prototype = Object.create(CSharpExpression.prototype);
CSharpIdentifierExpression.prototype.constructor = CSharpIdentifierExpression;

CSharpIdentifierExpression.prototype.toString = function() {
	if(this.parent===null) {
		return this.identifier;
	} else {
		return this.parent.toString() + "." + this.identifier;
	}
}

CSharpIdentifierExpression.parse = function(ids) {
	var parts = ids.split("\\.");
	var result = null;
	for(var idx=0;i<parts.length;idx++) {
		result = new CSharpIdentifierExpression(result, parts[idx]);
	}
	return result;
};

CSharpIdentifierExpression.prototype.toDialect = function(writer) {
    if(this.parent!=null) {
        this.parent.toDialect(writer);
        writer.append('.');
    }
    writer.append(this.identifier);
};

exports.CSharpIdentifierExpression = CSharpIdentifierExpression;
