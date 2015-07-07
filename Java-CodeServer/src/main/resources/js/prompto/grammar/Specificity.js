function Specificity(ordinal) {
	this.ordinal = ordinal;
	return this;
}

Specificity.INCOMPATIBLE = new Specificity(0);
Specificity.RESOLVED = new Specificity(1);
Specificity.INHERITED = new Specificity(2);
Specificity.EXACT = new Specificity(3);

Specificity.prototype.greaterThan = function(other) {
	return this.ordinal > other.ordinal;
}

exports.Specificity = Specificity;