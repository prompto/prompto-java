var CSharpExpression = require("./CSharpExpression").CSharpExpression;

function CSharpSelectorExpression(parent) {
    CSharpExpression.call(this);
    this.parent = parent || null;
    return this;
}
CSharpSelectorExpression.prototype = Object.create(CSharpExpression.prototype);
CSharpSelectorExpression.prototype.constructor = CSharpSelectorExpression;

exports.CSharpSelectorExpression = CSharpSelectorExpression;
