function jsonRead(text) {
    var node = JSON.parse(text);
    return toValue(node);
}

function toValue(node) {
    if (node === null)
        return null;
    else if (Array.isArray(node))
        return toList(node);
    else if (typeof(node) === "object")
        return toDocument(node);
    else
        return node;
}

function toList(node) {
    var values = node.map(toValue);
    return new intrinsic.List(false, values);
}


function toDocument(node) {
    var doc = new intrinsic.Document();
    for(var name in node) {
        if(node.hasOwnProperty(name))
            doc[name] = toValue(node[name]);
    }
    return doc;
}

exports.jsonRead = jsonRead;