function Document(entries) {
    if(entries)
        Object.getOwnPropertyNames(entries).forEach(function(name) { this[name] = entries[name]; }, this);
    return this;
}

Document.prototype.toString = function() {
    return JSON.stringify(this);
};

Document.prototype.equals = function(other) {
    if(this==other)
        return true;
    if(!(other instanceof Document))
        return false;
    var thisNames = Object.getOwnPropertyNames(this);
    var otherNames = Object.getOwnPropertyNames(other);
    if(!equalArrays(thisNames,otherNames))
        return false;
    return thisNames.every(function(name) {
        return this[name]===other[name] || (this[name].equals && this[name].equals(other[name]));
    }, this);
};

Document.prototype.getText = function() {
    if(this.hasOwnProperty("text"))
        return this.text;
    else
        return this.toString();
};

Document.prototype.getMember = function(name, create) {
    if(this.hasOwnProperty(name))
        return this[name];
    else if(create) {
        this[name] = new Document();
        return this[name];
    } else
        return null;
};

Document.prototype.item = function(item) {
    return this[item];
};


Document.prototype.setMember = function(name, value) {
    this[name] = value;
};


Document.prototype.setItem = function(item, value) {
    this[item] = value;
};

Document.prototype.toJson = function(json, instanceId, fieldName, withType, binaries) {
    var values = {};
    Object.getOwnPropertyNames(this).forEach(function (key) {
        var value = this[key];
        if(!value || typeof(value)===typeof(true) || typeof(value)===typeof(1) || typeof(value)===typeof(1.0) || typeof(value)===typeof(""))
            values[key] = value;
        else {
            var id = this; // TODO create identifier
            value.toJson(values, id, key, withType, binaries);
        }
    }, this);
    var doc = withType ? {type: "Document", value: values} : values;
    if (Array.isArray(json))
        json.push(doc);
    else
        json[fieldName] = doc;
};

Document.prototype.fromJson = function(node, parts) {
    for (key in node) {
        this[key] = this.readJsonField(node[key], parts);
    }
};

Document.prototype.readJsonField = function(node, parts) {
    if(!node || typeof(node)===typeof(true) || typeof(node)===typeof(1) || typeof(node)===typeof(1.0) || typeof(node)===typeof(""))
        return node;
    else if(typeof(node)===typeof([]))
        throw new Error("list");
    else if(typeof(node)===typeof({}))
        throw new Error("dict/object");
    else
        throw new Error(typeof(node).toString());
};


// ensure objects created from Documents exhibit the same behaviour
Object.defineProperty(Object.prototype, "getMember", {
    get: function() {
        return Document.prototype.getMember;
    },
    set: function() {
    	// pass
    }
});

