function ContOp(name) {
    this.name = name;
    return this;
}

ContOp.prototype.toString = function() {
    return this.name.toLowerCase().replace('_', ' ');
};

ContOp.prototype.toDialect = function(writer) {
    writer.append(this.toString());
};

ContOp.IN = new ContOp("IN");
ContOp.CONTAINS = new ContOp("CONTAINS");
ContOp.CONTAINS_ALL = new ContOp("CONTAINS_ALL");
ContOp.CONTAINS_ANY = new ContOp("CONTAINS_ANY");
ContOp.NOT_IN = new ContOp("NOT_IN");
ContOp.NOT_CONTAINS = new ContOp("NOT_CONTAINS");
ContOp.NOT_CONTAINS_ALL = new ContOp("NOT_CONTAINS_ALL");
ContOp.NOT_CONTAINS_ANY = new ContOp("NOT_CONTAINS_ANY");

exports.ContOp = ContOp;
