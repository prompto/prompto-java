var Section = require("../parser/Section").Section;

function BaseDeclaration(name) {
	Section.call(this);
	this.name = name;
	return this;
}

BaseDeclaration.prototype = Object.create(Section.prototype);
BaseDeclaration.prototype.constructor = BaseDeclaration;

BaseDeclaration.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};


exports.BaseDeclaration = BaseDeclaration;
