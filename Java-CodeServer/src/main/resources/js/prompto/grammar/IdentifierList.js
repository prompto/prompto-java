var ObjectList = require("../utils/ObjectList").ObjectList;
var Dialect = require("../parser/Dialect").Dialect;

function IdentifierList(item) {
	ObjectList.call(this);
	item = item || null;
	if(item!==null) {
		this.add(item);
	}
	return this;
}

IdentifierList.prototype = Object.create(ObjectList.prototype);
IdentifierList.prototype.constructor = IdentifierList;

IdentifierList.parse = function(ids) {
	var parts = ids.split(",");
	var result = new IdentifierList();
	for(var i=0;i<parts.length;i++) {
		result.add(parts[i]);
	}
	return result;
};

IdentifierList.prototype.toDialect = function(writer, finalAnd) {
    finalAnd = finalAnd || false;
    switch(writer.dialect) {
        case Dialect.E:
            this.toEDialect(writer, finalAnd);
            break;
        case Dialect.O:
            this.toODialect(writer);
            break;
        case Dialect.S:
            this.toSDialect(writer);
            break;
    }
};

IdentifierList.prototype.toEDialect = function(writer, finalAnd) {
    switch(this.length) {
        case 0:
            return;
        case 1:
            writer.append(this[0]);
            break;
        default:
            for(var i=0;i<this.length;i++) {
                if(finalAnd && i==this.length-1)
                    break;
                writer.append(this[i]);
                writer.append(", ");
            }
            writer.trimLast(2);
            if(finalAnd) {
                writer.append(" and ");
                writer.append(this[this.length-1]);
            }
    }
};

IdentifierList.prototype.toODialect = function(writer) {
    if(this.length>0) {
        for(var i=0;i<this.length;i++) {
            writer.append(this[i]);
            writer.append(", ");
        }
        writer.trimLast(2);
    }
};

IdentifierList.prototype.toSDialect = function(writer) {
    this.toODialect(writer);
};

exports.IdentifierList = IdentifierList;