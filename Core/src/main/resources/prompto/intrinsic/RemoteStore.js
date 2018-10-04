function StoredDocument(categories, dbId) {
    this.categories = categories;
    this.dbId = dbId;
    return this;
}


StoredDocument.prototype.getData = function(name) {
    return this[name] || null;
};

StoredDocument.prototype.matches = function(predicate) {
    if(predicate==null)
        return true;
    else
        return predicate.matches(this);
};

function StorableDocument(categories) {
    if(!categories)
        throw new Error("!!!");
    this.categories = categories;
    this.document = null;
    return this;
}

Object.defineProperty(StorableDocument.prototype, "dirty", {
    get : function() {
        return this.document != null;
    },
    set : function(value) {
        if (value) {
            if(!this.document)
                this.document = new StoredDocument(this.categories, DataStore.instance.nextDbId());
        } else
            this.document = null;
    }
});

StorableDocument.prototype.getOrCreateDbId = function() {
    var dbId = this.document ? (this.document["dbId"] || null) : null;
    if (dbId == null) {
        dbId = DataStore.instance.nextDbId();
        this.setData("dbId", dbId);
    }
    return dbId;
};


StorableDocument.prototype.setData = function(name, value) {
    this.dirty = true;
    this.document[name] = value;
};

function RemoteStore() {
	this.lastDbId = 0;
	this.nextDbId = function() {
		return { temp: --this.lastDbId };
	};
	this.newStorableDocument = function(categories) {
		return new StorableDocument(categories);
	};
	return this;
}

DataStore.instance = new RemoteStore();