var window = this.window;
/* work around limited JS syntax in prompto bindings */
/* cannot write: window[methodName](url, name) */
exports.openWindow = function(methodName, url, name) {
    window[methodName](url, name);
}