const blobRefURLRegistry = new FinalizationRegistry(url=>URL.revokeObjectURL(url));

function BlobRef() {
    this.zipped = null;
    this.file = null;
    return this;
}

BlobRef.fromJSON = function(value) {
	var blob = new BlobRef();
	blob.mimeType = value.mimeType;
	blob.url = value.url;
	return blob;
}


BlobRef.fromFile = function(file) {
    var blob = new BlobRef();
	blob.mimeType = file.type ? file.type : "application/octet-stream";
    blob.file = file;
    blob.url = URL.createObjectURL(file);
    blobRefURLRegistry.register(blob, blob.url);
    return blob;
};

// TODO move the below to an Archive type

BlobRef.fromValue = function(value) {
    var binaries = {};
    // create json type-aware object graph and collect binaries
    var values = {}; // need a temporary parent
    value.toJson(values, null, "value", true, binaries);
    var json = JSON.stringify(values["value"]);
    // add it
    binaries["value.json"] = stringToUtf8Buffer(json);
    // zip binaries
    var zipped = BlobRef.zipDatas(binaries)
    // done
    var blob = new BlobRef();
    blob.zipped = zipped;
    return blob;
};

BlobRef.zipDatas = function(datas) {
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


BlobRef.readParts = function(zipped) {
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

BlobRef.readValue = function(parts) {
    var data = parts["value.json"] || null;
    if (data == null)
        throw new Error("Expecting a 'value.json' part!");
    var json = utf8BufferToString(data);
    return JSON.parse(json);
};


BlobRef.prototype.toDocument = function() {
    if (this.zipped)
        return this.zippedToDocument();
    else
        return null;
};

BlobRef.prototype.zippedToDocument = function() {
    var parts = BlobRef.readParts(this.zipped);
    var value = BlobRef.readValue(parts);
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
