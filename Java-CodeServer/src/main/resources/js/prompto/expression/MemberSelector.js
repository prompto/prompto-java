var SelectorExpression = require("./SelectorExpression").SelectorExpression;
var UnresolvedIdentifier = null;
var SymbolExpression = require("../expression/SymbolExpression").SymbolExpression;
var TypeExpression = require("../expression/TypeExpression").TypeExpression;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;
var CategoryType = null;
var NullValue = require("../value/NullValue").NullValue;
var Value = require("../value/Value").Value;
var Text = require("../value/Text").Text;

exports.resolve = function() {
    UnresolvedIdentifier = require("../grammar/UnresolvedIdentifier").UnresolvedIdentifier;
    CategoryType = require("../type/CategoryType").CategoryType;
}

function MemberSelector(parent, name) {
	SelectorExpression.call(this, parent);
	this.name = name;
	return this;
}

MemberSelector.prototype = Object.create(SelectorExpression.prototype);
MemberSelector.prototype.constructor = MemberSelector;

MemberSelector.prototype.toDialect = function(writer) {
    // ensure singletons are not treated as constructors
    try {
        this.resolveParent(writer.context);
    } catch(e) {
        // ignore
    }
    this.parent.toDialect(writer);
    writer.append(".");
    writer.append(this.name);
};

MemberSelector.prototype.toString = function() {
	return this.parent.toString() + "." + this.name;
};

MemberSelector.prototype.check = function(context) {
    var parentType = this.checkParent(context);
    return parentType.checkMember(context, this.name);
};

MemberSelector.prototype.interpret = function(context) {
    // resolve parent to keep clarity
    var parent = this.resolveParent(context);
    // special case for Symbol which evaluates as value
    var value = this.interpretSymbol(context, parent);
    if(value!=null)
        return value;
    // special case for singletons
    value = this.interpretSingleton(context, parent);
    if(value!=null)
        return value;
    // special case for 'static' type members (like Enum.symbols, Type.name etc...)
    value = this.interpretTypeMember(context, parent);
    if(value!=null)
        return value;
    // finally resolve instance member
    return this.interpretInstanceMember(context, parent);
};

MemberSelector.prototype.interpretInstanceMember = function(context, parent) {
    var instance = this.parent.interpret(context);
    if (instance == null || instance == NullValue.instance)
        throw new NullReferenceError();
    else
        return instance.getMember(context, this.name);
};

MemberSelector.prototype.interpretTypeMember = function(context, parent) {
    if(parent instanceof TypeExpression)
        return parent.getMember(context, this.name);
    else
        return null;
};

MemberSelector.prototype.interpretSingleton = function(context, parent) {
    if(parent instanceof TypeExpression && parent.value instanceof CategoryType) {
        var instance = context.loadSingleton(parent.value);
        if(instance!=null)
            return instance.getMember(context, this.name);
    }
    return null;
};

MemberSelector.prototype.interpretSymbol = function(context, parent) {
    if (parent instanceof SymbolExpression)
    {
        if ("name"==this.name)
            return new Text(parent.name);
        else if("value"==this.name)
            return parent.interpret(context);
    }
    return null;
};

MemberSelector.prototype.resolveParent = function(context) {
    if(this.parent instanceof UnresolvedIdentifier) {
        this.parent.checkMember(context);
        return this.parent.resolved;
    } else
        return this.parent;
};

exports.MemberSelector = MemberSelector;

