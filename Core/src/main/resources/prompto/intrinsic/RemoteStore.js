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
	this.newQueryBuilder = function() {
		return new RemoteQueryBuilder();
	};
	this.fetchSync = function(url, body) {
		var response = null;
		var request  = new XMLHttpRequest();
		request.open("POST", url, false); // must be synchronous
		request.setRequestHeader("Content-type", "application/json; charset=utf-8");
		request.onload = function() { 
			if (this.status == 200)
				response = JSON.parse(this.responseText); 
			else
				throw new Error(this.statusText);
		};
		request.onerror = function() {
			throw this.error;
		};
		request.send(body);
		return response;
	}
	this.fetchMany = function(query) {
		var records = this.fetchSync("/ws/store/fetchMany", JSON.stringify(query));
		// make it look like a StoredIterable
		return {
			index: 0,
			count: function() { return records.count; },
			totalCount: function() { return records.totalCount; },
			hasNext: function() { this.index < records.count; },
			next: function() { return records.data[this.index++]; }
		};
	};
	return this; 
}

function RemoteQueryBuilder() {
    this.orderBys = null;
    this.predicates = null;
    this.first = null;
    this.last = null;
	return this;
}

RemoteQueryBuilder.prototype.verify = function(fieldInfo, matchOp, value) {
    if(this.predicates==null)
        this.predicates = [];
    this.predicates.push(new MatchPredicate(fieldInfo, matchOp, value));
};

RemoteQueryBuilder.prototype.and = function() {
    var right = this.predicates.pop();
    var left = this.predicates.pop();
    this.predicates.push(new AndPredicate(left, right));
};

RemoteQueryBuilder.prototype.or = function() {
    var right = this.predicates.pop();
    var left = this.predicates.pop();
    this.predicates.push(new OrPredicate(left, right));
};

RemoteQueryBuilder.prototype.not = function() {
    var top = this.predicates.pop();
    this.predicates.push(new NotPredicate(top));
};


RemoteQueryBuilder.prototype.setFirst = function(value) {
    this.first = value;
};

RemoteQueryBuilder.prototype.setLast = function(value) {
    this.last = value;
};


RemoteQueryBuilder.prototype.build = function() {
    return {
        predicate: this.predicates==null ? null : this.predicates.pop(),
        first: this.first,
        last: this.last,
        orderBys : this.orderBys
    };
};

RemoteQueryBuilder.prototype.addOrderByClause = function(info, descending) {
    if (this.orderBys == null)
        this.orderBys = [];
    this.orderBys.push({info: info, descending: descending});
};

function AndPredicate(left, right) {
	this.type = "AndPredicate";
    this.left = left;
    this.right = right;
    return this;
}

function OrPredicate(left, right) {
	this.type = "OrPredicate";
    this.left = left;
    this.right = right;
    return this;
}

function NotPredicate(pred) {
	this.type = "NotPredicate";
    this.pred = pred;
    return this;
}

function MatchPredicate(info, matchOp, value) {
	this.type = "MatchPredicate";
    this.info = info;
    this.matchOp = MatchOp[matchOp.name];
    this.value = value;
    return this;
}



DataStore.instance = new RemoteStore();