var yaml = require("js-yaml");


exports.yamlRead = function (text) {
    var docs = yaml.safeLoadAll(text);
    return convert(docs);
};

function convert(obj) {
    if(Array.isArray(obj))
        return convertList(obj);
    else if(typeof(obj)===typeof({}))
        return convertDocument(obj);
    else
        return obj
}

function convertList(obj) {
    /* global intrinsic */
    var items = obj.map(function(item) { return convert(item);});
    return new intrinsic.List(false, items);
}

function convertDocument(obj) {
    var values = new intrinsic.Document();
    Object.getOwnPropertyNames(obj).forEach(function (key) {
        var value = obj[key];
        values[key] = convert(value);
    }, this);
    return values;
}
