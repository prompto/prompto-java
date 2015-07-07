var InstanceContext = require("../runtime/Context").InstanceContext;
var SyntaxError = require("../error/SyntaxError").SyntaxError;

function ThisExpression() {
    return this;
}

ThisExpression.prototype.check = function(context) {
    if (context != null && !(context instanceof InstanceContext))
        context = context.getParentContext ();
    if (context instanceof InstanceContext)
        return context.instanceType;
    else
        throw new SyntaxError ("Not in an instance context!");
};


ThisExpression.prototype.interpret = function(context) {
    if (context != null && !(context instanceof InstanceContext))
        context = context.getParentContext ();
    if (context instanceof InstanceContext)
        return context.instance;
    else
        throw new SyntaxError ("Not in an instance context!");
};

ThisExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

ThisExpression.prototype.toEDialect = function(writer) {
    writer.append("self");
};

ThisExpression.prototype.toODialect = function(writer) {
    writer.append("this");
};

ThisExpression.prototype.toSDialect = function(writer) {
    writer.append("self");
};

exports.ThisExpression = ThisExpression;
