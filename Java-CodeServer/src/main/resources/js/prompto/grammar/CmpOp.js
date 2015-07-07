function CmpOp() {
	return this;
}

CmpOp.prototype.toDialect = function(writer) {
    writer.append(this.toString());
};

CmpOp.GT = new CmpOp();
CmpOp.GT.toString = function() {
    return ">";
}

CmpOp.GTE = new CmpOp();
CmpOp.GTE.toString = function() {
    return ">=";
}

CmpOp.LT = new CmpOp();
CmpOp.LT.toString = function() {
    return "<";
}

CmpOp.LTE = new CmpOp();
CmpOp.LTE.toString = function() {
    return "<=";
}

exports.CmpOp = CmpOp;
