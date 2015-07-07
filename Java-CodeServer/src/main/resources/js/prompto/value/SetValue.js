var Value = require("./Value").Value;
var Integer = require("./Integer").Integer;
var SetType = require("../type/SetType").SetType;

exports.resolve = function() {
    SetType = require("../type/SetType").SetType;
};

function SetValue(itemType, items) {
    Value.call(this, new SetType(itemType));
    this.itemType = null;
    this.items = items || {};
    return this;
}

SetValue.prototype = Object.create(Value.prototype);
SetValue.prototype.constructor = SetValue;

SetValue.prototype.addAll = function(items) {
    for(var p in items) {
        this.add(items[p]);
    }
};

SetValue.prototype.toString = function() {
    var names = Object.getOwnPropertyNames(this.items);
    return "<" + names.join(", ") + ">";
};

SetValue.prototype.add = function(item) {
    this.items[item.toString()] = item;
};

SetValue.prototype.size = function() {
    var n = 0;
    for(var p in this.items) {
        n += 1;
    }
    return n;
};

SetValue.prototype.isEmpty = function() {
    for(var p in this.items) {
        return false;
    }
    return true;
};

SetValue.prototype.hasItem = function(context, item) {
    return item.toString() in this.items;
};


SetValue.prototype.getItemInContext = function(context, index) {
    if (index instanceof Integer) {
        try {
            var idx = index.IntegerValue();
            for(var p in this.items) {
                if(--idx==0)
                    return this.items[p];
            }
            throw new IndexOutOfRangeError();
        } catch (e) {
            if(e instanceof PrestoError) {
                throw e;
            } else {
                throw new InternalError(e.toString());
            }
        }
    } else
        throw new SyntaxError("No such item:" + index.toString());
};

SetValue.prototype.Add = function(context, value) {
    if (value instanceof SetValue) {
        var result = new SetValue(this.type.itemType, this.items);
        result.addAll(value.items);
        return result;
    } else {
        return Value.prototype.Add.apply(this, context, value);
    }
};

SetValue.prototype.getIterator = function(context) {
    return new SetIterator(this.items, context);
};


SetValue.prototype.equals = function(obj) {
    if(obj instanceof SetValue) {
        for(var p in this.items) {
            var v1 = this.items[p];
            var v2 = obj.items[p];
            if(v1==v2) {
                continue;
            } else if(v1==null || v2==null) {
                return false;
            } else {
                if(v1.equals) {
                    if(!v1.equals(v2)) {
                        return false;
                    }
                } else if(v2.equals) {
                    if(!v2.equals(v1)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    } else {
        return false;
    }
};


function SetIterator(items, context) {
    this.items = items;
    this.names = Object.getOwnPropertyNames(items);
    this.context = context;
    this.index = -1;
    return this;
}

SetIterator.prototype.hasNext = function () {
    return this.index < this.names.length - 1;
}

SetIterator.prototype.next = function() {
    return this.items[this.names[++this.index]];
};

exports.SetValue = SetValue;