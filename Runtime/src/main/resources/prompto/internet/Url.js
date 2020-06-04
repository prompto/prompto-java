function Url(path, encoding, method) {
    this.path = path;
    this.encoding = encoding || "utf-8";
    this.method = method || "POST";
    return this;
}

Url.prototype.isReadable = function() {
    return true;
};

Url.prototype.isWritable = function() {
    return false;
};

Url.prototype.close = function() {
};

Url.prototype.readFully = function() {
    var xhr = new XMLHttpRequest();
    xhr.overrideMimeType('text/plain');
    xhr.open(this.method, this.path, false);
    xhr.setRequestHeader("Access-Control-Allow-Origin", "*");
    xhr.send();
    if (xhr.status != 200) {
        var rwe = eval("prompto.error.ReadWriteError"); // assume it's already defined
        throw new rwe("Request failed, status: " + xhr.status +", " + xhr.statusText);
    }
    return xhr.responseText;
};


Url.prototype.readFullyAsync = function(callback) {
    var xhr = new XMLHttpRequest();
    xhr.overrideMimeType('text/plain');
    xhr.onload = function() {
    	   if (xhr.status != 200) {
    	        var rwe = eval("prompto.error.ReadWriteError"); // assume it's already defined
    	        throw new rwe("Request failed, status: " + xhr.status +", " + xhr.statusText);
    	    }
    	   callback(xhr.responseText);
   };
    xhr.open(this.method, this.path, true);
    xhr.setRequestHeader("Access-Control-Allow-Origin", "*");
    xhr.send();
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
