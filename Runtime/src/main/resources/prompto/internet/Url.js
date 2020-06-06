function Url(path, encoding, method) {
	this.path = path;
	this.encoding = encoding || "utf-8";
	this.httpRequestMethod = method || "GET";
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
	var xhr = this.createHttpRequest(false);
	xhr.send();
	this.checkStatus(xhr);
	return xhr.responseText;
};

Url.prototype.readFullyAsync = function(callback) {
	var self = this;
	var xhr = this.createHttpRequest(true);
	xhr.onload = function() {
		self.checkStatus(xhr);
		callback(xhr.responseText);
	};
	xhr.send();
};

Url.prototype.checkStatus = function(xhr) {
	if (xhr.status != 200) {
		try {
			var rwe = eval("prompto.error.ReadWriteError"); // assume it's already defined
			throw new rwe("Request failed, status: " + xhr.status + ", " + xhr.statusText);
		} catch (error) {
			throw new Error("Request failed, status: " + xhr.status + ", " + xhr.statusText);
		}
	}
};

Url.prototype.createHttpRequest = function(async) {
	var method = this.httpRequestMethod || "GET";
	var xhr = new XMLHttpRequest();
	xhr.overrideMimeType('text/plain');
	xhr.open(method, this.path, async);
	xhr.setRequestHeader("Access-Control-Allow-Origin", "*");
	xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	return xhr;
};

Url.prototype.readLine = function() {
	if (!this.lines) {
		var full = this.readFully() || "";
		this.lines = full.split("\n");
	}
	if (this.lines.length > 0)
		return this.lines.shift();
	else
		return null;
}

Url.prototype.writeFully = function(data) {

};

Url.prototype.writeLine = function(data) {

};

exports.Url = Url;
