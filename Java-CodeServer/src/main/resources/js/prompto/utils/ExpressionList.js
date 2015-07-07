var ObjectList = require("./ObjectList").ObjectList;

function ExpressionList(items, item) {
    ObjectList.call(this, items, item);
    return this;
}

ExpressionList.prototype = Object.create(ObjectList.prototype);
ExpressionList.prototype.constructor = ExpressionList;

ExpressionList.prototype.toDialect = function(writer) {
    if (this.length > 0) {
        for (var i = 0; i < this.length; i++) {
            this[i].toDialect(writer);
            writer.append(", ");
        }
        writer.trimLast(2);
    }
};

exports.ExpressionList = ExpressionList;