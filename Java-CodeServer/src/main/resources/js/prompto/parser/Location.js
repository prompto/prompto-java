function Location(token, isEnd) {
	this.index = token.startIndex;
	this.line = token.line;
	this.column = token.column;
	if(isEnd && token.text!==null) {
		this.index += token.text.length;
		this.column += token.text.length;
	}
}

exports.Location = Location;