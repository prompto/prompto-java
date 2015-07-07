function DictEntryList(entries, entry) {
	this.items = entries || [];
	entry = entry || null;
	if(entry!==null) {
		this.items.push(entry);
	}
	return this;
}

DictEntryList.prototype.toDialect = function(writer) {
    writer.append('{');
    if(this.items.length>0) {
        for(var i=0;i<this.items.length;i++) {
            this.items[i].toDialect(writer);
            writer.append(", ");
        }
        writer.trimLast(2);
    }
    writer.append('}');
};

DictEntryList.prototype.toString = function() {
	return "{" + this.items.join(", ") + "}";
};

DictEntryList.prototype.add = function(entry) {
	this.items.push(entry);
};

exports.DictEntryList = DictEntryList;