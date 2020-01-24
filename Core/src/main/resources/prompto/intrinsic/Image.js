function Image() {
	this.mimeType = null;
	this.url = null;
	this.file = null;
	return this;
}

Image.fromJSON = function(value) {
	var image = new Image();
	image.mimeType = value.mimeType;
	image.url = value.url;
	return image;
}

Image.fromFile = function(file) {
	var image = new Image();
	image.mimeType = file.type;
	image.file = file;
	return image;
}