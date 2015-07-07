var InvalidDataError = require("../error/InvalidDataError").InvalidDataError;

function MatchingPatternConstraint(expression) {
	this.expression = expression;
	this.pattern = null;
	return this;
}

MatchingPatternConstraint.prototype.checkValue = function(context, value) {
	if(this.pattern==null) {
		var toMatch = this.expression.interpret(context);
		this.pattern = new RegExp(toMatch);
	}
	if(!this.pattern.test(value.toString())) {
		throw new InvalidDataError(value.toString() + " does not match:" + this.pattern.toString());
	}
};

MatchingPatternConstraint.prototype.toDialect = function(writer) {
    writer.append(" matching ");
    this.expression.toDialect(writer);
}


exports.MatchingPatternConstraint = MatchingPatternConstraint;
