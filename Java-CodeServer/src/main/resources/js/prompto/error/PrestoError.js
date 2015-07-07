function PrestoError() {
    var tmp = Error.apply(this, arguments);
    this.message = tmp.message
    tmp.name = this.name = 'PrestoError'
    Object.defineProperty(this, "stack", {
        get: function () {
            return tmp.stack
        }
    });
    return this;
}


exports.PrestoError = PrestoError;