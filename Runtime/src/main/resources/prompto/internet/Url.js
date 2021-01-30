function Url(path, encoding, httpMethod, httpHeaders) {
	this.path = path;
	this.encoding = encoding;
	this.httpMethod = httpMethod;
	this.httpHeaders = httpHeaders;
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
		return this.readFullyAsyncHttp(callback);
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
    var rwe = null;
    try {
        rwe = eval("prompto.error.ReadWriteError"); // assume it's already defined
    } catch (error) { }
    if(rwe)
        throw new rwe(message);
    else
        throw new Error(message);
};

Url.prototype.createHttpRequest = function(async) {
	var xhr = new XMLHttpRequest();
	xhr.overrideMimeType('text/plain');
	var httpMethod = this._getHttpMethod();
	xhr.open(httpMethod, this.path, async);
	// Accept-Charset is not allowed in browsers, so ignore this.encoding 
	var httpHeaders = { Accept: "application/json, text/plain", "Content-Type": "application/x-www-form-urlencoded" };
	this.httpHeaders.forEach(function(header) {
		httpHeaders[header.name] = header.text;
	});
	for(var name in httpHeaders) {
		xhr.setRequestHeader(name, httpHeaders[name]);
	}
	return xhr;
};

Url.prototype._getHttpMethod = function() {
	if(this.httpMethod) {
		// fetch value from enum
		if(this.httpMethod.value)
			return this.httpMethod.value;
		else
			return this.httpMethod;
	} else
		return "GET";
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
};

Url.prototype.writeFully = function(data, callback) {
	var self = this;
	var async = callback !== null;
	var xhr = this.createHttpRequest(async);
	xhr.onload = function() {
		self.checkHttpStatus(xhr);
		if(callback !== null)
			callback(xhr.responseText);
	};
	data = this.serialize(data);
	xhr.send(data);
};

Url.prototype.serialize = function(data) {
	return JSON.stringify(writeJSONValue(data));
};	

Url.prototype.writeLine = function(data) {
	this.throwError("Url only supports full HTTP writes in browser.");
};

module.exports.Url = Url;
