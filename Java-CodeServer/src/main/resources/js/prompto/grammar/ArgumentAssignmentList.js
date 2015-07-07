var ObjectList = require("../utils/ObjectList").ObjectList;
var Dialect = require("../parser/Dialect").Dialect;

function ArgumentAssignmentList(items, item) {
	items = items || [];
	ObjectList.call(this, items);
	item = item || null;
	if(item!==null) {
		this.add(item);
	}
	return this;
}

ArgumentAssignmentList.prototype = Object.create(ObjectList.prototype);
ArgumentAssignmentList.prototype.constructor = ArgumentAssignmentList;
	

ArgumentAssignmentList.prototype.findIndex = function(name) {
	for(var i=0;i<this.length;i++) {
		if(name==this[i].name) {
			return i;
		}
	}
	return -1;
};

ArgumentAssignmentList.prototype.find = function(name) {
	for(var i=0;i<this.length;i++) {
		if(name==this[i].name) {
			return this[i];
		}
	}
	return None;
};

ArgumentAssignmentList.prototype.makeAssignments = function(context, declaration) {
	var assignments = new ArgumentAssignmentList();
	for(var i=0;i<this.length;i++) {
		assignments.push(this[i].makeAssignment(context, declaration));
	}
	return assignments;
};



ArgumentAssignmentList.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};

ArgumentAssignmentList.prototype.toEDialect = function(writer) {
    var idx = 0;
    // anonymous argument before 'with'
    if(this.length>0 && this[0].argument==null) {
        writer.append(' ');
        this[idx++].toDialect(writer);
    }
    if(idx<this.length) {
        writer.append(" with ");
        this[idx++].toDialect(writer);
        writer.append(", ");
        while(idx<this.length-1) {
            this[idx++].toDialect(writer);
            writer.append(", ");
        }
        writer.trimLast(2);
        if(idx<this.length) {
            writer.append(" and ");
            this[idx++].toDialect(writer);
        }
    }
};

ArgumentAssignmentList.prototype.toODialect = function(writer) {
    writer.append("(");
    for(var i=0; i<this.length; i++) {
        this[i].toDialect(writer);
        writer.append(", ");
    }
    if(this.length>0)
        writer.trimLast(2);
    writer.append(")");
};

ArgumentAssignmentList.prototype.toSDialect = function(writer) {
    this.toODialect(writer);
};


exports.ArgumentAssignmentList = ArgumentAssignmentList;

