function Category(klass) {
	this.klass = klass;
	this.name = klass.name;
	return this;
}

function $Root() {
    this.$mutable = false;
    this.$storable = this.$storable || null;
    this.dbId = null;
    this.$categories = [];
    return this;
}

Object.defineProperty($Root.prototype, "category", {
	get: function() {
		return new Category(this.$categories.slice(-1)[0]);
	}
});

$Root.prototype.equals = function(other) {
    if (this === other)
        return true;
    if (!(other instanceof $Root))
        return false;
    if (this.$categories[this.$categories.length - 1] !== other.$categories[other.$categories.length - 1])
        return false;
    var thisNames = this.getAttributeNames();
    var otherNames = other.getAttributeNames();
    if(!equalArrays(thisNames, otherNames))
    	return false;
    return thisNames.every(function(name) {
    	var thisVal = this[name];
        var otherVal = other[name];
        if (thisVal === null) 
        	return otherVal == null;
        else
        	return thisVal === otherVal || (thisVal.equals && thisVal.equals(otherVal));
    }, this);
};


$Root.prototype.toMutable = function() {
	var ctor = getPrototypeOf(this).constructor;
	return new ctor(this, {}, true);
};

$Root.prototype.instanceOf = function(type) {
    return this.$categories.indexOf(type)>=0;
};

$Root.prototype.getDbId = function() {
    return this.dbId;
};

$Root.prototype.getOrCreateDbId = function() {
	if(this.dbId)
		return this.dbId;
	else if(this.$storable)
		return this.$storable.getOrCreateDbId();
	else
		return null;
};

$Root.prototype.setDbId = function(dbId) {
	this.dbId = dbId;
};



$Root.prototype.getAttributeNames = function() {
    return Object.getOwnPropertyNames(this).filter(function(name) {
        return name!=="dbId" && !name.startsWith('$') && typeof(this[name])!='function';
    }, this);
};

$Root.prototype.toString = function() {
    var names = this.getAttributeNames();
	names = names.filter(function (name) {
        return this[name] !== null;
    }, this);
    var vals = names.map(function (name) {
        return name + ':' + this[name];
    }, this);
    return "{" + vals.join(", ") + "}";
};

$Root.prototype.getText = function() {
    if(this.hasOwnProperty("text"))
        return this.text;
    else
        return this.toString();
};


$Root.prototype.setMember = function(name, value, storable, mutable, isEnum) {
    if(!this.$mutable || (value && value.$mutable && !mutable))
        throw new NotMutableError();
    this[name] = value;
    if(this.$storable && storable) {
    	if(name==="dbId")
    		this.$storable.setDbId(value);
    	else {
	        if(isEnum && value)
	            value = value.name;
	        this.$storable.setData(name, value, this.dbId);
    	}
    }
};

$Root.prototype.fromStored = function(stored) {
	this.dbId = stored.getData("dbId");
	var names = this.getAttributeNames();
	names.forEach( function(name) {
        var value = stored.getData(name);
        var method = this["load$" + name];
        this[name] = method ? method(value) : value;
    }, this);
	if(this.$storable)
		this.$storable.clear();
};

$Root.prototype.collectStorables = function(storablesToAdd) {
    if(this.$storable && this.$storable.isDirty()) {
    	this.getOrCreateDbId();
        storablesToAdd.add(this.$storable);
    }
    var names = this.getAttributeNames();
    names.forEach(function(name) {
    	var value = this[name];
    	if(value && value.collectStorables)
			value.collectStorables(storablesToAdd);
	}, this);
};

$Root.prototype.collectDbIds = function(idsToDelete) {
    if(this.dbId) {
    	var dbId = typeof(this.dbId) === "object" ? this.dbId.toString() : this.dbId;
    	idsToDelete.add(dbId);
    }
};

$Root.prototype.toDocument = function() {
    var doc = new Document();
    var names = this.getAttributeNames();
    names.forEach(function(name) {
        if(this.hasOwnProperty(name)) {
            var value = this[name];
            if(value && value.toDocument)
                value = value.toDocument();
            doc[name] = value;
        }
    }, this);
    return doc;
};

$Root.prototype.toJson = function() {
    return convertToJson(this);
};

$Root.prototype.toJsonNode = function() {
    var value = {};
    var names = this.getAttributeNames();
    names.forEach(function(name) {
        value[name] = convertToJsonNode(this[name]);
    }, this);
    if(this.hasOwnProperty("dbId"))
        value.dbId = this.dbId ? "" + this.dbId : null;
    return value;
};
