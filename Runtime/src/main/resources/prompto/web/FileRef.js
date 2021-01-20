var document = this.document;

function FileRef(file) {
    this.file = file;
    return this;
}

FileRef.prototype.readImage = function() {
    return ImageRef.fromFile(this.file);
};

FileRef.prototype.readBlob = function() {
    return BlobRef.fromFile(this.file);
};

FileRef.prototype.readText = function(callback) {
	var reader = new FileReader();
	reader.onload = function(event) { callback(reader.result); };
	reader.readAsText(this.file);
};

exports.FileRef = FileRef;

exports.selectFileRef = function(callback, mimeTypes) {
    var input = document.createElement("input");
    input.type = 'file';
    input.style = { display: "none" };
    if(mimeTypes && mimeTypes.length)
        input.accept = Array.from(mimeTypes.set).join(",");
    input.onchange = function(e) {
        callback(new FileRef(e.target.files[0]));
    };
    input.click();
};
