var UnresolvedIdentifier;

exports.resolve = function() {
    UnresolvedIdentifier = require("../grammar/UnresolvedIdentifier").UnresolvedIdentifier;
}

function SelectorExpression(parent) {
	this.parent = parent || null;
	return this;
}

SelectorExpression.prototype.checkParent = function(context) {
    if (this.parent instanceof UnresolvedIdentifier)
        return this.parent.checkMember(context);
    else
        return this.parent.check(context);
};


exports.SelectorExpression = SelectorExpression;