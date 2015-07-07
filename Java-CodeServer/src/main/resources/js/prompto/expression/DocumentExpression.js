var DocumentType = require("../type/DocumentType").DocumentType;
var Document = require("../value/Document").Document;
var Dialect = require("../parser/Dialect").Dialect;

function DocumentExpression() {
	return this;
}


DocumentExpression.prototype.check = function(context) {
	return DocumentType.instance;
};

DocumentExpression.prototype.interpret = function(context) {
	return new Document();
};

DocumentExpression.prototype.toDialect = function(dialect) {
	return "Document";
};

DocumentExpression.prototype.toDialect = function(writer) {
    writer.append("Document");
    if(writer.dialect==Dialect.O)
        writer.append("()");
}


exports.DocumentExpression = DocumentExpression;
