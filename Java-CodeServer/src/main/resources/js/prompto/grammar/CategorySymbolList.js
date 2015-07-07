var SymbolList = require("./SymbolList").SymbolList;

function CategorySymbolList(symbol) {
	SymbolList.call(this, symbol);
	return this;
}

CategorySymbolList.prototype = Object.create(SymbolList.prototype);
CategorySymbolList.prototype.constructor = CategorySymbolList;

exports.CategorySymbolList = CategorySymbolList;
