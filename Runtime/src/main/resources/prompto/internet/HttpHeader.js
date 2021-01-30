function HttpHeader(name, text) {
	this.name = name;
	this.text = text;
	return this;
}

module.exports.HttpHeader = HttpHeader;