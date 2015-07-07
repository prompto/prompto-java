var ExpressionList = require("../utils/ExpressionList").ExpressionList;
var MissingType = require("../type/MissingType").MissingType;

function SymbolList(symbol) {
    ExpressionList.call(this, MissingType.instance);
	this.add(symbol);
	return this;
}

SymbolList.prototype = Object.create(ExpressionList.prototype);
SymbolList.prototype.constructor = SymbolList;

SymbolList.prototype.getIterator = function(context) {
    return new SymbolListIterator(this, context);
};

function SymbolListIterator(symbols, context) {
    this.symbols = symbols;
    this.context = context;
    this.idx = 0;
    return this;
};

SymbolListIterator.prototype.hasNext = function() {
    return this.idx<this.symbols.length;
};

SymbolListIterator.prototype.next = function() {
    return this.symbols[this.idx++].interpret(this.context);
};

exports.SymbolList = SymbolList;
