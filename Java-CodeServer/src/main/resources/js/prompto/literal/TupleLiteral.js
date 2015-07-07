var Literal = require("./Literal").Literal;
var TupleType = require("../type/TupleType").TupleType;
var TupleValue = require("../value/TupleValue").TupleValue;
var ExpressionList = require("../utils/ExpressionList").ExpressionList;

function TupleLiteral(expressions) {
    expressions = expressions || new ExpressionList();
	Literal.call(this, "(" + expressions.toString() + ")", new TupleValue());
    this.expressions = expressions;
	return this;
}

TupleLiteral.prototype = Object.create(Literal.prototype);
TupleLiteral.prototype.constructor = TupleLiteral;

TupleLiteral.prototype.check = function(context) {
	return TupleType.instance;
};

TupleLiteral.prototype.toDialect = function(writer) {
    this.value.toDialect(writer);
};

TupleLiteral.prototype.interpret = function(context) {
    if(this.value.isEmpty()) {
        var tuple = new TupleValue();
        for(var i=0; i<this.expressions.length;i++) {
            var item = this.expressions[i].interpret(context);
            tuple.add(item);
        }
        this.value = tuple;
        // don't dispose of expressions, they are required by translation
    }
    return this.value;
};

TupleLiteral.prototype.toDialect = function(writer) {
    if(this.expressions!=null) {
        writer.append('(');
        this.expressions.toDialect(writer);
        writer.append(')');
    } else
        writer.append("()");
};


exports.TupleLiteral = TupleLiteral;