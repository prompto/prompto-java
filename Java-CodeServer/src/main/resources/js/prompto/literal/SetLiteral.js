var Literal = require("./Literal").Literal;
var SetValue = require("../value/SetValue").SetValue;
var SetType = require("../type/SetType").SetType;
var MissingType = require("../type/MissingType").MissingType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function SetLiteral(expressions) {
    expressions = expressions || new ExpressionList();
	Literal.call(this, "<" + expressions.toString() + ">", new SetValue(MissingType.instance));
	this.itemType = null;
    this.expressions = expressions;
	return this;
}

SetLiteral.prototype = Object.create(Literal.prototype);
SetLiteral.prototype.constructor = SetLiteral;


SetLiteral.prototype.check = function(context) {
	if(this.itemType==null) {
		this.itemType = this.inferElementType(context);
        this.type = new SetType(this.itemType);
	}
	return this.type;
};

SetLiteral.prototype.inferElementType = function(context) {
    if (this.expressions.length == 0)
        return MissingType.instance;
    var lastType = null;
    for (var i = 0; i < this.expressions.length; i++) {
        var elemType = this.expressions[i].check(context);
        if (lastType == null) {
            lastType = elemType;
        } else if (!lastType.equals(elemType)) {
            if (elemType.isAssignableTo(context, lastType)) {
                ; // lastType is less specific
            } else if (lastType.isAssignableTo(context, elemType)) {
                lastType = elemType; // elemType is less specific
            } else {
                throw new SyntaxError("Incompatible types: " + elemType.toString() + " and " + lastType.toString());
            }
        }
    }
    return lastType;
};

SetLiteral.prototype.interpret = function(context) {
	if(this.value.isEmpty()) {
        this.check(context); // force computation of itemType
		var list = new SetValue(this.itemType);
		for(var i=0; i<this.expressions.length;i++) {
			var item = this.expressions[i].interpret(context);
			list.add(item);
		}
		this.value = list;
        // don't dispose of expressions, they are required by translation
	}
	return this.value;
};

SetLiteral.prototype.toDialect = function(writer) {
    if(this.expressions!=null) {
        writer.append('<');
        this.expressions.toDialect(writer);
        writer.append('>');
    } else
        writer.append("< >");
};

exports.SetLiteral = SetLiteral;
