var PythonSelectorExpression = require("./PythonSelectorExpression").PythonSelectorExpression;
var PythonArgumentList = require("./PythonArgumentList").PythonArgumentList;

function PythonMethodExpression(name, args) {
    PythonSelectorExpression.call(this);
    this.name = name;
    this.args = args || new PythonArgumentList();
    return this;
}

PythonMethodExpression.prototype = Object.create(PythonSelectorExpression.prototype);
PythonMethodExpression.prototype.constructor = PythonMethodExpression;


PythonMethodExpression.prototype.toString = function() {
    return this.parent.toString() + "." + this.name + "(" + this.args.toString() + ")";
};

PythonMethodExpression.prototype.toDialect = function(writer) {
    if(this.parent!=null) {
        this.parent.toDialect(writer);
        writer.append('.');
    }
    writer.append(this.name);
    writer.append('(');
    this.args.toDialect(writer);
    writer.append(')');
};

exports.PythonMethodExpression = PythonMethodExpression;