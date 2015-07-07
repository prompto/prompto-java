var NullType = require("../type/NullType").NullType;
var NullValue = require("../value/NullValue").NullValue;

function NullLiteral() {
   return this;
}

NullLiteral.instance = new NullLiteral();

NullLiteral.prototype.check = function(context) {
    return NullType.instance;
};

NullLiteral.prototype.interpret = function(context) {
    return NullValue.instance;
};

NullLiteral.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

NullLiteral.prototype.toEDialect = function(writer) {
    writer.append("nothing");
};

NullLiteral.prototype.toODialect = function(writer)
{
    writer.append("null");
};

NullLiteral.prototype.toSDialect = function(writer)
{
    writer.append("None");
}

exports.NullLiteral = NullLiteral;