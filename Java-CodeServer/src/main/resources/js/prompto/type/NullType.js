var BaseType = require("./BaseType").BaseType;

function NullType() {
    BaseType.call(this, "Null");
    return this;
}

NullType.prototype = Object.create(BaseType.prototype);
NullType.prototype.constructor = NullType;

NullType.instance = new NullType();

NullType.prototype.checkUnique = function(self, context) {
    // ok
};

NullType.prototype.checkExists = function(self, context) {
    // ok
};

NullType.prototype.isAssignableTo = function(self, context, other) {
    return true;
};

NullType.prototype.isMoreSpecificThan = function(self, context, other) {
    return false;
};

exports.NullType = NullType;
