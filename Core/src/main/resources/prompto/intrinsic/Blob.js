function Blob() {
    this.zipped = null;
    this.file = null;
    return this;
}

Blob.fromJSON = function(value) {
	var blob = new Blob();
	blob.mimeType = value.mimeType;
	blob.url = value.url;
	return blob;
}


Blob.fromFile = function(file) {
    var blob = new Blob();
	blob.mimeType = file.type;
    blob.file = file;
    return blob;
};

// TODO move the below to an Archive type

Blob.fromValue = function(value) {
    var binaries = {};
    // create json type-aware object graph and collect binaries
    var values = {}; // need a temporary parent
    value.toJson(values, null, "value", true, binaries);
    var json = JSON.stringify(values["value"]);
    // add it
    binaries["value.json"] = stringToUtf8Buffer(json);
    // zip binaries
    var zipped = Blob.zipDatas(binaries)
    // done
    var blob = new Blob();
    blob.zipped = zipped;
    return blob;
};

Blob.zipDatas = function(datas) {
    var JSZip = require("jszip-sync");
    var zip = new JSZip();
    return zip.sync(function() {
        for (var key in datas)
            zip.file(key, datas[key]);
        var result = null;
        zip.generateAsync({type: "arraybuffer", compression: "DEFLATE"}).
        then(function(value) {
            result = value;
        });
        return result;
    });
};


Blob.readParts = function(zipped) {
    var JSZip = require("jszip-sync");
    var zip = new JSZip();
    return zip.sync(function() {
        var parts = {};
        zip.loadAsync(zipped);
        zip.forEach(function (entry) {
            zip.file(entry)
                .async("arraybuffer")
                .then(function(value) {
                    parts[entry] = value;
                });
        });
        return parts;
    });
};

Blob.readValue = function(parts) {
    var data = parts["value.json"] || null;
    if (data == null)
        throw new Error("Expecting a 'value.json' part!");
    var json = utf8BufferToString(data);
    return JSON.parse(json);
};


Blob.prototype.toDocument = function() {
    if (this.zipped)
        return this.zippedToDocument();
    else
        return null;
};

Blob.prototype.zippedToDocument = function() {
    var parts = Blob.readParts(this.zipped);
    var value = Blob.readValue(parts);
    var typeName = value["type"] || null;
    if (typeName == null)
        throw new Error("Expecting a 'type' field!");
    var type = eval(typeName)
    if (type != Document)
        throw new Error("Expecting a Document type!");
    value = value["value"] || null;
    if (value == null)
        throw new Error("Expecting a 'value' field!");
    var instance = new type();
    instance.fromJson(value, parts);
    return instance;
};
