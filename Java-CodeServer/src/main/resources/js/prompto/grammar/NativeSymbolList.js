var SymbolList = require("./SymbolList").SymbolList;

function NativeSymbolList(symbol) {
	SymbolList.call(this, symbol);
	return this;
}

NativeSymbolList.prototype = Object.create(SymbolList.prototype);
NativeSymbolList.prototype.constructor = NativeSymbolList;

exports.NativeSymbolList = NativeSymbolList;
