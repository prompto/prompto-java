var window = this.window;

/* work around limited JS syntax in prompto bindings */
/* cannot write: window[methodName](url, name) */
exports.openBrowser = function(methodName, url, name) {
    return window[methodName](url, name);
};

/* work around limited JS syntax in prompto bindings */
/* cannot write: window.location = location; */
exports.browserGoto = function(location) {
    window.location = location;
};


exports.browserGetQueryParameter = function(name) {
	var match = RegExp('[?&]' + name + '=([^&]*)').exec(window.location.search);
	return match && decodeURIComponent(match[1].replace(/\+/g, ' '));
};

exports.downloadFile = function(url, name) {
	var document = window.document;
	var a = document.createElement("a");
	a.href = url;
	a.download = name ? name : "data";
	document.body.appendChild(a);
	a.click();
	document.body.removeChild(a);
};

