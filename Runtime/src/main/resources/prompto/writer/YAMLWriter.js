var yaml = require("js-yaml");

function convert(obj) {
    /* global intrinsic */
    if(obj instanceof intrinsic.List)
        return convertList(obj);
    else if(obj instanceof intrinsic.Document)
        return convertDocument(obj);
    else
        return obj
}

function convertList(obj) {
    return obj.map(function(item) { return convert(item);});
}

function convertDocument(obj) {
    var values = {};
    Object.getOwnPropertyNames(obj).forEach(function (key) {
        var value = obj[key];
        values[key] = convert(value);
    }, this);
    return values;
}

exports.yamlWrite = function (docs) {
    return docs.map(function(doc) {
        var raw = convertDocument(doc);
        return yaml.safeDump(raw);
    }).join("---\n");
};
