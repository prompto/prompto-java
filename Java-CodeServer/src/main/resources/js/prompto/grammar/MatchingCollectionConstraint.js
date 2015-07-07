var InvalidDataError = require("../error/InvalidDataError").InvalidDataError;

function MatchingCollectionConstraint(collection) {
	this.collection = collection;
	return this;
}

MatchingCollectionConstraint.prototype.checkValue = function(context, value) {
	var container = this.collection.interpret(context);
	if(container.hasItem) {
		if(!(container.hasItem(context, value))) {
			throw new InvalidDataError("Value:" + value.toString() + " is not in range: " + this.collection.toString());
		}
	} else {
		throw new InvalidDataError("Not a collection: " + this.collection.toString());
	}
};

MatchingCollectionConstraint.prototype.toDialect = function(writer) {
    writer.append(" in ");
    this.collection.toDialect(writer);
};


exports.MatchingCollectionConstraint = MatchingCollectionConstraint;

