var Section = require("../parser/Section").Section;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var BooleanType = require("../type/BooleanType").BooleanType;
var ListType = require("../type/ListType").ListType;
var TupleType = require("../type/TupleType").TupleType;
var SetType = require("../type/SetType").SetType;
var TransientVariable = require("../runtime/TransientVariable").TransientVariable;
var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;
var ListValue = require("../value/ListValue").ListValue;
var TupleValue = require("../value/TupleValue").TupleValue;
var SetValue = require("../value/SetValue").SetValue;
var Bool = require("../value/Bool").Bool;

function FetchExpression(itemName, source, filter) {
	Section.call(this);
	this.itemName = itemName;
	this.source = source;
	this.filter = filter;
	return this;
}

FetchExpression.prototype  = Object.create(Section.prototype);
FetchExpression.prototype.constructor = FetchExpression;


FetchExpression.prototype.toDialect = function(dialect) {
	return "fetch any " + this.itemName + " from " + this.source.toString() + " where " + this.filter.toString();
};

FetchExpression.prototype.check = function(context) {
	var listType = this.source.check(context);
	if(!(listType instanceof ListType || listType instanceof TupleType || listType instanceof SetType)) {
		throw new SyntaxError("Expecting a list type as data source !");
	}
	var local = context.newLocalContext();
	local.registerValue(new TransientVariable(this.itemName,listType.itemType));
	var filterType = this.filter.check(local);
	if(filterType!=BooleanType.instance) {
		throw new SyntaxError("Filtering expresion must return a boolean !");
	}
	return listType;
};

FetchExpression.prototype.interpret = function(context) {
	var listType = this.source.check(context);
	if(!(listType instanceof ListType || listType instanceof TupleType || listType instanceof SetType)) {
		throw new InternalError("Illegal source type: " + listType.getName());
	}
	var list = this.source.interpret(context);
	if(list==null) {
		throw new NullReferenceError();
	}
	if(!(list instanceof ListValue || list instanceof TupleValue || list instanceof SetValue)) {
		throw new InternalError("Illegal fetch source: " + this.source);
	}
	var itemType = listType.itemType;
	var result = new ListValue(itemType);
	var local = context.newLocalContext();
	var item = new TransientVariable(this.itemName, itemType);
	local.registerValue(item);
	var iter = list.getIterator(context);
	while(iter.hasNext()) {
		var o = iter.next();
		local.setValue(this.itemName, o);
		var test = this.filter.interpret(local);
		if(!(test instanceof Bool)) {
			throw new InternalError("Illegal test result: " + test);
		}
		if(test.value) {
			result.add(o);
		}
	}
	return result;
};

FetchExpression.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

FetchExpression.prototype.toEDialect = function(writer) {
    writer.append("fetch any ");
    writer.append(this.itemName);
    writer.append(" from ");
    this.source.toDialect(writer);
    writer.append(" where ");
    this.filter.toDialect(writer);
};


FetchExpression.prototype.toODialect = function(writer) {
    writer.append("fetch (");
    writer.append(this.itemName);
    writer.append(")");
    writer.append(" from ");
    this.source.toDialect(writer);
    writer.append(" where ");
    this.filter.toDialect(writer);
};

FetchExpression.prototype.toSDialect = function(writer) {
    writer.append("fetch ");
    writer.append(this.itemName);
    writer.append(" from ");
    this.source.toDialect(writer);
    writer.append(" where ");
    this.filter.toDialect(writer);
};

exports.FetchExpression = FetchExpression;
