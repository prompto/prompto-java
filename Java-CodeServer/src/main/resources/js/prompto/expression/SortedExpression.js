var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;
var UnresolvedIdentifier = require("../grammar/UnresolvedIdentifier").UnresolvedIdentifier;
var InstanceExpression = require("../expression/InstanceExpression").InstanceExpression;
var InternalError = require("../error/InternalError").InternalError;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var CategoryType = require("../type/CategoryType").CategoryType;
var ListValue = require("../value/ListValue").ListValue;
var TupleValue = require("../value/TupleValue").TupleValue;
var SetValue = require("../value/SetValue").SetValue;
var ListType = require("../type/ListType").ListType;
var TupleType = require("../type/TupleType").TupleType;
var SetType = require("../type/SetType").SetType;

function SortedExpression(source, key) {
	this.source = source;
	this.key = key || null;
	return this;
}

SortedExpression.prototype.toString = function() {
	return "sorted " + this.source.toString() +
		(this.key==null ? "" : " with " + this.key.toString() + " as key");
};

SortedExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

SortedExpression.prototype.toEDialect = function(writer) {
    writer.append("sorted ");
    this.source.toDialect(writer);
    if(this.key!=null) {
        writer.append(" with ");
        var keyExp = this.key;
        if(keyExp instanceof UnresolvedIdentifier) try {
            keyExp = keyExp.resolve(writer.context, false);
        } catch (e) {
            // TODO add warning
        }
        if(keyExp instanceof InstanceExpression)
            keyExp.toDialect(writer, false);
        else
            keyExp.toDialect(writer);
        writer.append(" as key");
    }
}

SortedExpression.prototype.toODialect = function(writer) {
    writer.append("sorted (");
    this.source.toDialect(writer);
    if(this.key!=null) {
        writer.append(", key = ");
        this.key.toDialect(writer);
    }
    writer.append(")");
}

SortedExpression.prototype.toSDialect = function(writer) {
    this.toODialect(writer);
}

SortedExpression.prototype.check = function(context) {
	var type = this.source.check(context);
	if(!(type instanceof ListType || type instanceof TupleType || type instanceof SetType)) {
		throw new SyntaxError("Unsupported type: " + type);
	}
	return type;
};

SortedExpression.prototype.interpret = function(context) {
	var type = this.source.check(context);
	if(!(type instanceof ListType || type instanceof TupleType || type instanceof SetType)) {
		throw new SyntaxError("Unsupported type: " + type);
	}
	var o = this.source.interpret(context);
	if(o==null) {
		throw new NullReferenceError();
	}
	if(!(o instanceof ListValue || o instanceof TupleValue || o instanceof SetValue)) {
		throw new InternalError("Unexpected type:" + typeof(o));
	}
	var itemType = type.itemType;
	if(itemType instanceof CategoryType) {
		return itemType.sort(context, o, this.key);
	} else {
		return itemType.sort(context, o);
	}
};

exports.SortedExpression = SortedExpression;
