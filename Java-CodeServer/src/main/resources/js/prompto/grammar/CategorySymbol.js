var Symbol = require("./Symbol").Symbol;
var Text = require("../value/Text").Text;

function CategorySymbol(name, assignments) {
	Symbol.call(this, name);
	this.assignments = assignments;
	this.type = null;
	return this;
}

CategorySymbol.prototype = Object.create(Symbol.prototype);
CategorySymbol.prototype.constructor = CategorySymbol;

CategorySymbol.prototype.toDialect = function(writer) {
    writer.append(this.symbol);
    writer.append(" ");
    this.assignments.toDialect(writer);
};

CategorySymbol.prototype.getType = function(context) {
	return this.type;
};

CategorySymbol.prototype.toString = function() {
	if(this.assignments!=null) {
		return this.assignments.toString();
	} else {
		return this.type.name;
	}
};

CategorySymbol.prototype.check = function(context) {
	var cd = context.getRegisteredDeclaration(this.type.name);
	if(cd==null) {
		throw new SyntaxError("Unknown category " + this.type.name);
	}
	if(this.assignments!=null) {
        context = context.newLocalContext();
		for(var i=0;i<this.assignments.length;i++) {
			var assignment = this.assignments[i];
			if(!cd.hasAttribute(context, assignment.name)) {
				throw new SyntaxError("\"" + assignment.name + "\" is not an attribute of " + type.name);
			}
			assignment.check(context);
		}
	}
	return this.type;
};

CategorySymbol.prototype.interpret = function(context) {
	var instance = this.type.newInstance(context);
    instance.mutable = true;
	if(this.assignments!=null) {
        context = context.newLocalContext();
		for(var i=0;i<this.assignments.length;i++) {
			var assignment = this.assignments[i];
			var value = assignment.expression.interpret(context);
			instance.setMember(context, assignment.name, value);
		}
	}
    instance.setMember(context, "name", new Text(this.name));
    instance.mutable = false;
    return instance;
};


exports.CategorySymbol = CategorySymbol;
