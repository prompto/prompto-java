var InstanceExpression = require("./InstanceExpression").InstanceExpression;
var UnresolvedIdentifier = require("../grammar/UnresolvedIdentifier").UnresolvedIdentifier;
var LinkedVariable = require("../runtime/LinkedVariable").LinkedVariable;
var LinkedValue = require("../runtime/LinkedValue").LinkedValue;
var BooleanType = require("../type/BooleanType").BooleanType;
var TypeValue = require("../value/TypeValue").TypeValue;
var CodeWriter = require("../utils/CodeWriter").CodeWriter;
var Value = require("../value/Value").Value;
var Bool = require("../value/Bool").Bool;
var EqOp = require("../grammar/EqOp").EqOp;

function EqualsExpression(left, operator, right) {
	this.left = left;
	this.operator = operator;
	this.right = right;
	return this;
}

EqualsExpression.prototype.toString = function() {
	return this.left.toString() + " " + this.operator.toString() + " " + this.right.toString();
};

var VOWELS = "AEIO"; // sufficient here

EqualsExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" ");
    this.operator.toDialect(writer);
    // make this a AN
    if(this.operator==EqOp.IS_A || this.operator==EqOp.IS_NOT_A) {
        var name = this.right.toString();
        if(VOWELS.indexOf(name.charAt(0))>=0)
            writer.append("n");
    }
    writer.append(" ");
    this.right.toDialect(writer);
};

EqualsExpression.prototype.check = function(context) {
	this.left.check(context);
	this.right.check(context);
	return BooleanType.instance; // can compare all objects
};

EqualsExpression.prototype.interpret = function(context) {
    var lval = this.left.interpret(context);
    var rval = this.right.interpret(context);
    return this.interpretValues(context, lval, rval);
};

EqualsExpression.prototype.interpretValues = function(context, lval, rval) {
    var equal = false;
    switch(this.operator) {
        case EqOp.IS:
            equal = lval==rval;
            break;
        case EqOp.IS_NOT:
            equal = lval!=rval;
            break;
        case EqOp.IS_A:
            equal = this.isA(context,lval,rval);
            break;
        case EqOp.IS_NOT_A:
            equal = !this.isA(context,lval,rval);
            break;
        case EqOp.EQUALS:
            equal = this.areEqual(context,lval,rval);
            break;
        case EqOp.NOT_EQUALS:
            equal = !this.areEqual(context,lval,rval);
            break;
        case EqOp.ROUGHLY:
            equal = this.roughly(context,lval,rval);
            break;
    }
    return Bool.ValueOf(equal);
};

EqualsExpression.prototype.roughly = function(context, lval, rval) {
    if(lval!=null && rval!=null && lval.Roughly) {
        return lval.Roughly(context, rval);
    } else {
        return this.areEqual(context, lval, rval);
    }
};

EqualsExpression.prototype.areEqual = function(context, lval, rval) {
	if(lval==rval) {
		return true;
	} else if(lval==null || rval==null) {
        return false;
    } else {
		return lval.equals(rval);
	}
};

EqualsExpression.prototype.isA = function(context, lval, rval) {
    if(lval instanceof Value && rval instanceof TypeValue) {
        var actual = lval.type;
        var toCheck = rval.value;
        return actual.isAssignableTo(context, toCheck);
    } else
        return false;
};


EqualsExpression.prototype.downCast = function(context, setValue) {
    if(this.operator==EqOp.IS_A) {
        var name = this.readLeftName();
        if(name!=null) {
            var value = context.getRegisteredValue(name);
            var type = this.right.value;
            var local = context.newChildContext();
            value = new LinkedVariable(type, value);
            local.registerValue(value, false);
            if(setValue)
                local.setValue(name, new LinkedValue(context));
            context = local;
        }
    }
    return context;
};

EqualsExpression.prototype.readLeftName = function() {
    if(this.left instanceof InstanceExpression)
        return this.left.name;
    else if(this.left instanceof UnresolvedIdentifier)
        return this.left.name;
    else
        return null;
};

EqualsExpression.prototype.interpretAssert = function(context, test) {
    var lval = this.left.interpret(context);
    var rval = this.right.interpret(context);
    var result = this.interpretValues(context, lval, rval);
    if(result==Bool.TRUE)
        return true;
    var writer = new CodeWriter(test.dialect, context);
    this.toDialect(writer);
    var expected = writer.toString();
    var actual = lval.toString() + " " + this.operator.toString(test.dialect) + " " + rval.toString();
    test.printFailure(context, expected, actual);
    return false;
};

exports.EqualsExpression = EqualsExpression;


