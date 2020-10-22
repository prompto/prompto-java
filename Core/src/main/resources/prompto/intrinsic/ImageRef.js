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
	return image;
}