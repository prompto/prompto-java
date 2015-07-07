var Document = require("../value/Document").Document;
var NotMutableError = require("../error/NotMutableError").NotMutableError;

function MemberInstance(name) {
	this.parent = null;
	this.name = name;
	return this;
}
	

MemberInstance.prototype.toString = function() {
	return this.parent.toString() + "." + this.name;
};

MemberInstance.prototype.toDialect = function(writer) {
    this.parent.toDialect(writer);
    writer.append(".");
    writer.append(this.name);
};

MemberInstance.prototype.checkAssignValue = function(context, expression) {
	this.parent.checkAssignMember(context, this.name);
	expression.check(context);
};

MemberInstance.prototype.checkAssignMember = function(context, memberName) {
	this.parent.checkAssignMember(context, this.name);
};

MemberInstance.prototype.checkAssignElement = function(context) {
	// TODO Auto-generated method stub
};


MemberInstance.prototype.assign = function(context, expression) {
    var root = this.parent.interpret(context);
    if(!root.mutable)
        throw new NotMutableError();
	var value = expression.interpret(context);
    root.setMember(context, this.name, value);
};

MemberInstance.prototype.interpret = function(context) {
	var root = this.parent.interpret(context);
	return root.getMember(context, this.name);
};

exports.MemberInstance = MemberInstance;
