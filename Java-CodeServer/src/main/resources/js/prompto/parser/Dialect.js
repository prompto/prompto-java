var EParserFactory = null;
var OParserFactory = null;
var SParserFactory = null;

exports.resolve = function() {
    EParserFactory = require("./EParserFactory").EParserFactory;
    OParserFactory = require("./OParserFactory").OParserFactory;
    SParserFactory = require("./SParserFactory").SParserFactory;
}

function Dialect() {
	return this;
}

Dialect.E = new Dialect();
Dialect.E.getParserFactory = function() {
	return new EParserFactory();
};
Dialect.E.toDialect = function(w, o) {
    o.toEDialect(w);
};
Dialect.E.toString = function(o) {
    return o.toEString();
};


Dialect.O = new Dialect();
Dialect.O.getParserFactory = function() {
	return new OParserFactory();
};
Dialect.O.toDialect = function(w, o) {
    o.toODialect(w);
};
Dialect.O.toString = function(o) {
    return o.toOString();
};

Dialect.S = new Dialect();
Dialect.S.getParserFactory = function() {
    return new SParserFactory();
};
Dialect.S.toDialect = function(w, o) {
    o.toSDialect(w);
};
Dialect.S.toString = function(o) {
    return o.toSString();
};

exports.Dialect = Dialect;
