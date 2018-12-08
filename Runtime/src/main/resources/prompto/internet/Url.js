function Url(path, encoding) {
    this.path = path;
    this.encoding = encoding || "utf-8";
    return this;
}

Url.prototype.isReadable = function() {
    return true;
};

Url.prototype.isWritable = function() {
    return true;
};

Url.prototype.close = function() {
};

Url.prototype.readFully = function() {
    var r = new XMLHttpRequest();
    r.overrideMimeType('text/plain');
    r.open('GET', this.path, false);
    r.send();
    if (r.status != 200) {
        var rwe = eval("prompto.error.ReadWriteError"); // assume it's already defined
        throw new rwe("Request failed, status: " + r.status +", " + r.statusText);
    }
    return r.responseText;
};

Url.prototype.readLine = function() {
    if(!this.lines) {
        var full = this.readFully() || "";
        this.lines = full.split("\n");
    }
    if(this.lines.length>0)
        return this.lines.shift();
    else
        return null;
}

Url.prototype.writeFully = function(data) {

};

Url.prototype.writeLine = function(data) {

};

exports.Url = Url;
