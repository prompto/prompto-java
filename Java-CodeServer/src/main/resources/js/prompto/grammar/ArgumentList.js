var ObjectList = require("../utils/ObjectList").ObjectList;

function ArgumentList(item) {
	ObjectList.call(this);
	item = item || null;
	if(item!==null) {
		this.add(item);
	}
	return this;
}

ArgumentList.prototype = Object.create(ObjectList.prototype);
ArgumentList.prototype.constructor = ArgumentList;

ArgumentList.prototype.register = function(context) {
	for(var i=0;i<this.length;i++) {
		this[i].register(context);
	}
};

ArgumentList.prototype.check = function(context) {
	for(var i=0;i<this.length;i++) {
		this[i].check(context);
	}
};

ArgumentList.prototype.find = function(name) {
	for(var i=0;i<this.length;i++) {
		if(name===this[i].name) {
			return this[i];
		}
	}
	return null;
};

ArgumentList.prototype.toDialect = function(writer) {
    if(this.length==0)
        return;
    writer.toDialect(this);
};

ArgumentList.prototype.toEDialect = function(writer) {
    writer.append("receiving: ");
    for(var i=0;i<this.length-1;i++) {
        this[i].toDialect(writer);
        writer.append(", ");
    }
    if(this.length>1) {
        writer.trimLast(2);
        writer.append(" and ");
    }
    this[this.length-1].toDialect(writer);
    writer.append(" ");
};

ArgumentList.prototype.toODialect = function(writer) {
    if(this.length>0) {
        for (var i = 0; i < this.length; i++) {
            this[i].toDialect(writer);
            writer.append(", ");
        }
        writer.trimLast(2);
    }
};

ArgumentList.prototype.toSDialect = function(writer) {
    this.toODialect(writer);
};

exports.ArgumentList = ArgumentList;