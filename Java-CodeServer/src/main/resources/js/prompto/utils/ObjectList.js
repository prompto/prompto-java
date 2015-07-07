function ObjectList(items, item) {
	Array.call(this);
	items = items || null;
	if(items!==null) {
		this.addAll(items);
	}
    item = item || null;
    if(item!==null) {
        this.add(item);
    }
	return this;
}

ObjectList.prototype = Object.create(Array.prototype);
ObjectList.prototype.constructor = ObjectList;

ObjectList.prototype.addAll = function(items) {
	this.push.apply(this, items);
};

ObjectList.prototype.add = function(item) {
	this.push(item);
};

ObjectList.prototype.insert = function(before, item) {
	this.splice(0, 0, item);
};

ObjectList.prototype.remove = function(index) {
	this.splice(index, 1);
};

ObjectList.prototype.toString = function() {
	return this.join(", ");
};


exports.ObjectList = ObjectList;
