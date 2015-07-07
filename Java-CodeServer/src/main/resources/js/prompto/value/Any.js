var Value = require("./Value").Value;

function Any() {
    Value.call(this);
    this.text = null;
    return this;
}

Any.prototype = Object.create(Value.prototype);
Any.prototype.constructor = Value;

Any.prototype.toString = function() {
    return "{id:" + this.id + ", text:" + this.text + "}";
};

exports.Any = Any;

