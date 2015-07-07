var Location = require("./Location").Location;

function Section() {
	this.path = "";
	this.start = null;
	this.end = null;
    this.dialect = null;
	this.breakpoint = false;
	return this;
}

Section.prototype.setFrom = function(path, start, end, dialect) {
    if(!dialect)
        throw "dialect!";
	this.path = path;
	this.start = new Location(start);
	this.end = new Location(end, true);
    this.dialect = dialect;
	this.breakpoint = false;
};
	
exports.Section = Section;