var PythonExpression = require("./PythonExpression").PythonExpression;

function PythonSelectorExpression(parent) {
    PythonExpression.call(this);
    this.parent = parent || null;
    return this;
}
PythonSelectorExpression.prototype = Object.create(PythonExpression.prototype);
PythonSelectorExpression.prototype.constructor = PythonSelectorExpression;

exports.PythonSelectorExpression = PythonSelectorExpression;
