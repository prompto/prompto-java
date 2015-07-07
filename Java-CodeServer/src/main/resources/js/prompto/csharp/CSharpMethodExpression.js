var CSharpSelectorExpression = require("./CSharpSelectorExpression").CSharpSelectorExpression;
var CSharpExpressionList = require("./CSharpExpressionList").CSharpExpressionList;

function CSharpMethodExpression(name, args) {
    CSharpSelectorExpression.call(this);
    this.name = name;
    this.args = args || new CSharpExpressionList();
    return this;
}

CSharpMethodExpression.prototype = Object.create(CSharpSelectorExpression.prototype);
CSharpMethodExpression.prototype.constructor = CSharpMethodExpression;


CSharpMethodExpression.prototype.toString = function() {
    return this.parent.toString() + "." + this.name + "(" + this.args.toString() + ")";
};

CSharpMethodExpression.prototype.toDialect = function(writer) {
    this.parent.toDialect(writer);
    writer.append('.');
    writer.append(this.name);
    writer.append('(');
    this.args.toDialect(writer);
    writer.append(')');
};

exports.CSharpMethodExpression = CSharpMethodExpression;