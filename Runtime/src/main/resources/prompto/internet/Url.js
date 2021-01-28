function Url(path, encoding, httpMethod, httpHeaders) {
	this.path = path;
	this.encoding = encoding || "utf-8";
	this.httpMethod = httpMethod || "GET";
	this.httpHeaders = httpHeaders || [ new HttpHeader("Content-Type", "application/x-www-form-urlencoded")];
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
	if(this.path.startsWith("http"))
		return this.readFullyHttp();
	else
		this.throwError("Url only supports HTTP protocol in browser.");
};
	
Url.prototype.readFullyHttp = function() {
	var xhr = this.createHttpRequest(false);
	xhr.send();
	this.checkStatus(xhr);
	return xhr.responseText;
};

Url.prototype.readFullyAsync = function(callback) {
	if(this.path.startsWith("http"))
		return this.readFullyAsyncHttp();
	else
		this.throwError("Url only supports HTTP protocol in browser.");
}

Url.prototype.readFullyAsyncHttp = function(callback) {
	var self = this;
	var xhr = this.createHttpRequest(true);
	xhr.onload = function() {
		self.checkHttpStatus(xhr);
		callback(xhr.responseText);
	};
	xhr.send();
};

Url.prototype.checkHttpStatus = function(xhr) {
	if (xhr.status != 200)
		this.throwError("Request failed, status: " + xhr.status + ", " + xhr.statusText);
};

Url.prototype.throwError = function(message) {
	try {
		var rwe = eval("prompto.error.ReadWriteError"); // assume it's already defined
		throw new rwe(message);
	} catch (error) {
		throw new Error(message);
	}
};

Url.prototype.createHttpRequest = function(async) {
	var xhr = new XMLHttpRequest();
	xhr.overrideMimeType('text/plain');
	xhr.open(this.httpMethod, this.path, async);
	this.httpHeaders.forEach(function(header) {
		xhr.setRequestHeader(header.name, header.text);
	});
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

Url.prototype.writeFully = function(data, callback) {
	var self = this;
	var async = callback !== null;
	var xhr = this.createHttpRequest(async);
	xhr.setRequestHeader("Content-Size", data.length);
	xhr.onload = function() {
		self.checkHttpStatus(xhr);
		if(callback !== null)
			callback(xhr.responseText);
	};
	xhr.send(data);
};

Url.prototype.writeLine = function(data) {
	this.throwError("Url only supports full HTTP writes in browser.");
};

module.exports.Url = Url;
