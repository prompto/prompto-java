var FinalizationRegistry = FinalizationRegistry || function() { 
	this.register = function() {};
	this.unregister = function() {};
	return this;
};

var imageRefURLRegistry = new FinalizationRegistry(function(url) {
	URL.revokeObjectURL(url);
});

function ImageRef() {
	this.mimeType = null;
	this.url = null;
	this.file = null;
	return this;
}

ImageRef.fromJSON = function(value) {
	var image = new ImageRef();
	image.mimeType = value.mimeType;
	image.url = value.url;
	return image;
}

ImageRef.fromFile = function(file) {
	var image = new ImageRef();
	image.mimeType = file.type;
	image.file = file;
	image.url = URL.createObjectURL(file);
	imageRefURLRegistry.register(image, image.url);
	return image;
}