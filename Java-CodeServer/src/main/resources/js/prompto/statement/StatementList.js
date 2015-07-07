var ObjectList = require("../utils/ObjectList").ObjectList;
var TypeMap = require("../type/TypeMap").TypeMap;
var VoidType = require("../type/VoidType").VoidType;
var Dialect = require("../parser/Dialect").Dialect;
var NullReferenceError = require("../error/NullReferenceError").NullReferenceError;
var SimpleStatement = require("./SimpleStatement").SimpleStatement;
var JavaScriptNativeCall = require("../javascript/JavaScriptNativeCall").JavaScriptNativeCall;

function StatementList(statement) {
	ObjectList.call(this);
	this.add(statement);
	return this;
}

StatementList.prototype = Object.create(ObjectList.prototype);
StatementList.prototype.constructor = StatementList;

StatementList.prototype.check = function(context, nativeOnly) {
	nativeOnly = nativeOnly || false;
	var types = new TypeMap();
	for(var i=0;i<this.length;i++) {
		var stmt = this[i];
		if(nativeOnly && !(stmt instanceof JavaScriptNativeCall)) {
			continue;
		}
		var type = stmt.check(context);
		if(type!==VoidType.instance) {
			types[type.name] = type;
		}
	}
	return types.inferType(context);
};

StatementList.prototype.interpret = function(context) {
	try {
		return this.doInterpret(context);
	} catch(e) {
		if(e instanceof ReferenceError) {
			throw e; // new NullReferenceError();
		} else {
			throw e;
		}
	}
};

StatementList.prototype.interpretNative = function(context, returnType) {
    try {
        return this.doInterpretNative(context, returnType);
    } catch(e) {
        if(e instanceof ReferenceError) {
            throw e; // new NullReferenceError();
        } else {
            throw e;
        }
    }
};

StatementList.prototype.doInterpret = function(context) {
	for(var i=0;i<this.length;i++) {
    	var stmt = this[i];
		context.enterStatement(stmt);
		try {
			var result = stmt.interpret(context);
			if(result!=null)
				return result;
		} finally {
			context.leaveStatement(stmt);
		}
	}
	return null;
};

StatementList.prototype.doInterpretNative = function(context, returnType) {
    for(var i=0;i<this.length;i++) {
        var stmt = this[i];
        if(!(stmt instanceof JavaScriptNativeCall))
            continue;
        context.enterStatement(stmt);
        try {
            var result = stmt.interpret(context, returnType);
            if(result!=null)
                return result;
        } finally {
            context.leaveStatement(stmt);
        }
    }
    return null;
};

StatementList.prototype.toDialect = function(writer) {
    for(var i=0;i<this.length;i++) {
        var stmt = this[i];
        stmt.toDialect(writer);
        if(stmt instanceof SimpleStatement) {
            if(writer.dialect==Dialect.O)
                writer.append(';');
            writer.newLine();
        }
    }
};

exports.StatementList = StatementList;
