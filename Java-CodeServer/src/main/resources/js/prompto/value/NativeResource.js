var NativeInstance = require("./NativeInstance").NativeInstance;

function NativeResource(declaration) {
	NativeInstance.call(this, declaration);
	return this;
}

NativeResource.prototype = Object.create(NativeInstance.prototype);
NativeResource.prototype.constructor = NativeResource;

NativeResource.prototype.isReadable = function() {
	return this.instance.isReadable();
};

NativeResource.prototype.isWritable = function() {
	return this.instance.isWritable();
};

NativeResource.prototype.readFully = function() {
	return this.instance.readFully();
};

NativeResource.prototype.writeFully = function(data) {
	this.instance.writeFully(data);
};

NativeResource.prototype.close = function() {
	this.instance.close();
};

exports.NativeResource = NativeResource;
