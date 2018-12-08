var prompto = require("../../../../../JavaScript-Core/src/main/prompto/index.js");
var any = prompto.type.AnyType.instance;

function jsonRead(text) {
    var node = JSON.parse(text);
    return toValue(node);
}

function toValue(node) {
    if(node===null)
        return prompto.value.NullValue.instance;
    else if(Array.isArray(node))
        return toList(node);
    var typeName = typeof(node);
    var converter = converters[typeName];
    return converter(node);
}

function toBoolean(node) {
    return prompto.value.BooleanValue.ValueOf(node);
}

function toText(node) {
    return new prompto.value.TextValue(node);
}

function toDocument(node) {
    var values = {};
    for(var name in node) {
        if(node.hasOwnProperty(name))
            values[name] = toValue(node[name]);
    }
    return new prompto.value.DocumentValue(values);
}


function toList(node) {
    var values = node.map(toValue);
    return new prompto.value.ListValue(any, values);
}

function fromNumber(node) {
    if (Number.isInteger(node))
        return new prompto.value.IntegerValue(node);
    else
        return new prompto.value.DecimalValue(node);
}

var converters = {
    "boolean" : toBoolean,
    "number" : fromNumber,
    "string" : toText,
    "object" : toDocument
}

exports.jsonRead = jsonRead;