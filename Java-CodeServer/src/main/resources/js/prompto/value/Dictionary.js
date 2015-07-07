var Value = require("./Value").Value;
var ListValue = require("./ListValue").ListValue;
var Text = require("./Text").Text;
var Integer = require("./Integer").Integer;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var InternalError = require("../error/InternalError").InternalError;
var BaseType = require("../type/BaseType").BaseType;
var DictType = require("../type/DictType").DictType;
var TextType = require("../type/TextType").TextType;

function Dictionary(itemType, dict) {
    Value.call(this, new DictType(itemType));
	this.dict = dict || {};
	return this;
}

Dictionary.prototype = Object.create(Value.prototype);
Dictionary.prototype.constructor = Dictionary;

Dictionary.prototype.toString = function() {
	var vals = [];
	var names = Object.getOwnPropertyNames(this.dict);
	for(var i=0;i<names.length;i++) {
		vals[i] = names[i] + ":" + this.dict[names[i]];
	}
	return "{" + vals.join(", ") + "}";
};


Dictionary.merge = function(dict1, dict2) {
    var dict = {};
    for(var p in dict1.dict) {
        dict[p] = dict1.dict[p];
    }
    for(var p in dict2.dict) {
        dict[p] = dict2.dict[p];
    }
    return new Dictionary(dict1.type.itemType, dict);
};

Dictionary.prototype.size = function() {
    var n = 0;
    for(p in this.dict) {
        n += 1;
    }
    return n;
};

Dictionary.prototype.isEmpty = function() {
    for(var p in this.dict) {
        return false;
    }
    return true;
};

Dictionary.prototype.Add = function(context, value) {
    if (value instanceof Dictionary) {
        return Dictionary.merge(this, value);
    } else {
        throw new SyntaxError("Illegal: Dict + " + typeof(value));
    }
};

Dictionary.prototype.hasItem = function(context, value) {
    if (value instanceof Text) {
        return value.value in this.dict;
    } else {
        throw new SyntaxError("Only Text key type supported by Dictionary");
    }
};


Dictionary.prototype.getMember = function(context, name) {
    if ("length"==name) {
        return new Integer(this.size());
    } else if ("keys"==name) {
        var list = [];
        for(p in this.dict) {
            list.push(new Text(p));
        }
        return new ListValue(TextType.instance, list);
    } else if ("values"==name) {
        var list = []
        for(p in this.dict) {
            list.push(this.dict[p]); // no need to interpret now
        }
        return new ListValue(this.type.itemType, list);
    } else {
        throw new SyntaxError("No such member:" + name);
    }
};

Dictionary.prototype.getItemInContext = function(context, index) {
    if (index instanceof Text)
    {
        var value = this.dict[index];
        if (value instanceof Value) {
            return value;
        } else {
            throw new InternalError("Item not a value!");
        }
    } else {
        throw new SyntaxError("No such item:" + index.toString());
    }
};

/*
public Object ConvertTo(Class<?> type)
{
    return this;
}

*/

Dictionary.prototype.equals = function(obj) {
    if(obj instanceof Dictionary) {
        var keys = Object.getOwnPropertyNames(this.dict);
        if(keys.length!=Object.getOwnPropertyNames(obj.dict).length) {
            return false;
        }
        for(var i=0;i<keys.length;i++) {
            var v1 = this.dict[keys[i]] || null;
            var v2 = obj.dict[keys[i]] || null;
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
                    if (!v2.equals(v1)) {
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

Dictionary.prototype.getIterator = function(context) {
    return new KVPIterator(context, this.dict);
}

function KVPIterator(context, dict) {
    this.context = context;
    this.dict = dict;
    this.keys = Object.getOwnPropertyNames(this.dict);
    this.index = 0;
    return this;
}

KVPIterator.prototype.hasNext = function() {
    return this.index < this.keys.length;
};


KVPIterator.prototype.next = function() {
    var key = this.keys[this.index++];
    return new KVPValue(key, this.dict[key]);
};


function KVPValue(key, value) {
    Value.call(this, null); // TODO check that this is safe
    this.key = key;
    this.value = value;
    return this;
}

KVPValue.prototype = Object.create(Value.prototype);
KVPValue.prototype.constructor = KVPValue;

KVPValue.prototype.getMember = function(context, name) {
    if ("key"==name) {
        return new Text(this.key);
    } else if ("value"==name) {
        if (this.value.interpret) {
            this.value = this.value.interpret(context);
        }
        return this.value;
    } else {
        throw new SyntaxError("No such member:" + name);
    }
};

exports.Dictionary = Dictionary;
