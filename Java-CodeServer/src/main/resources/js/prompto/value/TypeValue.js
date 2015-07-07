var Value = require("./Value").Value;

function TypeValue(value) {
    Value.call(this, null); // TODO type of type
    this.value = value;
    return this;
};

exports.TypeValue = TypeValue;