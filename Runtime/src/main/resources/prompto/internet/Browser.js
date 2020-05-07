var window = this.window;
/* work around limited JS syntax in prompto bindings */
/* cannot write: window[methodName](url, name) */
exports.openBrowser = function(methodName, url, name) {
    window[methodName](url, name);
}

exports.downloadFile = function(url, name) {
	var document = window.document;
	var a = document.createElement("a");
	a.href = url;
	a.download = name ? name : "data";
	document.body.appendChild(a);
	a.click();
	document.body.removeChild(a);
}