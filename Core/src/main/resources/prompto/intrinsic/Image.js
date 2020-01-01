function Image() {
	return this;
}

Image.fromJSON = function(value) {
	this.mimeType = value.mimeType;
	this.url = value.url;
}