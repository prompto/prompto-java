var ContOp = require("../grammar/ContOp").ContOp;
var Value = require("../value/Value").Value;
var Bool = require("../value/Bool").Bool;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function ContainsExpression(left, operator, right) {
    this.left = left;
    this.operator = operator;
    this.right = right;
    return this;
}

ContainsExpression.prototype.toString = function() {
    return this.left.toString() + " " + this.operator.toString() + " " + this.right.toString();
};

ContainsExpression.prototype.toDialect = function(writer) {
    this.left.toDialect(writer);
    writer.append(" ");
    this.operator.toDialect(writer);
    writer.append(" ");
    this.right.toDialect(writer);
};

ContainsExpression.prototype.check = function(context) {
    var lt = this.left.check(context);
    var rt = this.right.check(context);
    switch(this.operator) {
    case ContOp.IN:
    case ContOp.NOT_IN:
        return rt.checkContains(context,lt);
    case ContOp.CONTAINS:
    case ContOp.NOT_CONTAINS:
        return lt.checkContains(context, rt);
    default:
        return lt.checkContainsAllOrAny(context, rt);
    }
};

ContainsExpression.prototype.interpret = function(context) {
    var lval = this.left.interpret(context);
    var rval = this.right.interpret(context);
    return this.interpretValues(context, lval, rval);
};

ContainsExpression.prototype.interpretValues = function(context, lval, rval) {
    var result = null;
    switch (this.operator) {
    case ContOp.IN:
    case ContOp.NOT_IN:
        if(rval.hasItem) {
            result = rval.hasItem(context, lval);
        }
        break;
    case ContOp.CONTAINS:
    case ContOp.NOT_CONTAINS:
        if(lval.hasItem) {
            result = lval.hasItem(context, rval);
        }
        break;
    case ContOp.CONTAINS_ALL:
    case ContOp.NOT_CONTAINS_ALL:
        if (lval.hasItem && rval.hasItem) {
            result = this.containsAll(context, lval, rval);
        }
        break;
    case ContOp.CONTAINS_ANY:
    case ContOp.NOT_CONTAINS_ANY:
        if (lval.hasItem && rval.hasItem) {
            result = this.containsAny(context, lval, rval);
        }
        break;
    }
    if (result != null)
    {
        if (this.operator.name.indexOf("NOT_")==0) {
            result = !result;
        }
        return Bool.ValueOf(result);
    }
    // error management
    if (this.operator.name.lastIndexOf("IN")==operator.name.length-"IN".length) {
        var tmp = lval;
        lval = rval;
        rval = tmp;
    }
    var lowerName = this.operator.name.toLowerCase().replace('_', ' ');
    throw new SyntaxError("Illegal comparison: " + typeof(lval) + " " + lowerName + " " + typeof(rval));
};

ContainsExpression.prototype.containsAll = function(context, container, items) {
    var iterItems = items.getIterator(context);
    while(iterItems.hasNext()) {
        var item = iterItems.next();
        if (item instanceof Value) {
            if (!container.hasItem(context, item)) {
                return false;
            }
        } else {
            throw new SyntaxError("Illegal contains: " + typeof(container) + " + " + typeof(item));
        }
    }
    return true;
};

ContainsExpression.prototype.containsAny = function(context, container, items) {
    var iterItems = items.getIterator(context);
    while(iterItems.hasNext()) {
        var item = iterItems.next();
        if (item instanceof Value)
        {
            if (container.hasItem(context, item)) {
                return true;
            }
        } else {
            throw new SyntaxError("Illegal contains: " + typeof(container) + " + " + typeof(item));
        }
    }
    return false;
};

ContainsExpression.prototype.interpretAssert = function(context, test) {
    var lval = this.left.interpret(context);
    var rval = this.right.interpret(context);
    var result = this.interpretValues(context, lval, rval);
    if(result==Bool.TRUE)
        return true;
    var writer = new CodeWriter(test.dialect, context);
    this.toDialect(writer);
    var expected = writer.toString();
    var actual = lval.toString() + this.operator.toString() + rval.toString();
    test.printFailure(context, expected, actual);
    return false;
};

exports.ContainsExpression = ContainsExpression;