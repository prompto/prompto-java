var document = this.document;

function FileRef(file) {
    this.file = file;
    return this;
}

FileRef.prototype.readImage = function() {
    return null;
};

FileRef.prototype.readBlob = function() {
    return null;
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
