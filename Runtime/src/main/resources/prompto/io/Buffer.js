function Buffer() {
    this.data = null;
    return this;
}

Object.defineProperty(Buffer.prototype, "text", {
    get : function() {
        return this.data;
    }
});

Buffer.prototype.isReadable = function() {
    return true;
};

Buffer.prototype.isWritable = function() {
    return true;
};

Buffer.prototype.close = function() {
};

Buffer.prototype.readFully = function() {
    return this.data;
};

Buffer.prototype.readLine = function() {
    if(!this.lines) {
        var full = this.readFully() || "";
        // remove trailing LF
        if(full.endsWith("\n"))
            full = full.substring(0,full.length-1);
        this.lines = full.split(/\n/);
    }
    if(this.lines.length>0)
        return this.lines.shift();
    else
        return null;
}

Buffer.prototype.writeFully = function(data) {
    this.data = data;
};

Buffer.prototype.writeLine = function(data) {
    var full = this.data || "";
    this.data = full + data + "\n";
};

exports.Buffer = Buffer;
