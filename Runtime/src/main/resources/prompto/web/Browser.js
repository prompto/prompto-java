var window = this.window;

exports.openBrowser = function(methodName, url, name) {
    var tab = window[methodName](url, name);
    // ensure result exhibits the same as Document 
    if(tab && typeof(Document) !== undefined)
    	return new Document(tab);
    else
    	return tab;
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

