function Type(name) {
	this.name = name;
	return this;
}

Type.prototype.toString = function() {
	return this.name;
}