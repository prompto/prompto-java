var Symbol = require("./Symbol").Symbol;
var Dialect = require("../parser/Dialect").Dialect;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function NativeSymbol(name, expression) {
	Symbol.call(this, name);
	this.expression = expression;
	this.type = null;
	return this;
}

NativeSymbol.prototype = Object.create(Symbol.prototype);
NativeSymbol.prototype.constructor = NativeSymbol;

NativeSymbol.prototype.toString = function() {
	return this.symbol + " with " + this.expression.toString() + " as value";
};

NativeSymbol.prototype.toDialect = function(writer) {
    writer.append(this.symbol);
    switch(writer.dialect) {
        case Dialect.E:
            writer.append(" with ");
            this.expression.toDialect(writer);
            writer.append(" as value");
            break;
        case Dialect.O:
            writer.append(" = ");
            this.expression.toDialect(writer);
            break;
        case Dialect.S:
            writer.append(" = ");
            this.expression.toDialect(writer);
            break;
    }
};

/*
@Override
public boolean equals(Object obj) {
	if(obj==this)
		return true;
	if(obj==null)
		return false;
	if(!(obj instanceof NativeSymbol))
		return false;
	NativeSymbol other = (NativeSymbol)obj;
	return this.getName().equals(other.getName())
			&& this.getExpression().equals(other.getExpression());
}
*/

NativeSymbol.prototype.check = function(context) {
	var actual = this.expression.check(context);
	if(!actual.isAssignableTo(context, this.type.derivedFrom)) {
		throw new SyntaxError("Cannot assign " + actual.name + " to " + type.derivedFrom.name);
	}
	return this.type;
};

NativeSymbol.prototype.interpret = function(context) {
	return this.expression.interpret(context);
}

exports.NativeSymbol = NativeSymbol;