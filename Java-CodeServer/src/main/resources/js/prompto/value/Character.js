var Value = require("./Value").Value;
var Integer = require("./Integer").Integer;
var CharacterType = require("../type/CharacterType").CharacterType;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var Text = null; // circular dependency
var removeAccents = require("../utils/Utils").removeAccents;

exports.resolve = function() {
    Text = require("./Text").Text;
}

function Character(value) {
    Value.call(this, CharacterType.instance);
	this.value = value;
	return this;
}

Character.prototype = Object.create(Value.prototype);
Character.prototype.constructor = Character;

var whitespace = [];
whitespace[" ".charCodeAt(0)] = true;
whitespace["\t".charCodeAt(0)] = true;
whitespace["\r".charCodeAt(0)] = true;
whitespace["\n".charCodeAt(0)] = true;

Character.isWhitespace = function(c) {
	return !!whitespace[c.charCodeAt(0)];
};

Character.prototype.Add = function(context, value) {
    return new Text(this.value + value.toString());
}

Character.prototype.Multiply = function(context, value) {
    if (value instanceof Integer) {
        var count = value.value;
        if (count < 0) {
            throw new SyntaxError("Negative repeat count:" + count);
        } else if (count == 0) {
            return new Text("");
        } else if (count == 1) {
            return new Text(value.toString());
        } else {
            var all = [];
            while (--count >= 0) {
                all[count] = this.value;
            }
            var value = all.join("");
            return new Text(value);
        }
    } else {
        throw new SyntaxError("Illegal: Chararacter * " + typeof(value));
    }
};

Character.prototype.cmp = function(obj) {
    return this.value > obj.value ? 1 : this.value == obj.value ? 0 : -1 ;
};

Character.prototype.CompareTo = function(context, value) {
    if(value instanceof Text || value instanceof Character) {
        return this.value > value.value ? 1 : this.value == value.value ? 0 : -1;
    } else {
        throw new SyntaxError("Illegal: Compare Character with " + typeof(value));
    }
};
/*

@Override
public Object ConvertTo(Class<?> type)
{
    return value;
}

*/

Character.prototype.toString = function() {
    return "" + this.value;
};

Character.prototype.equals = function(obj) {
    if (obj instanceof Character) {
        return this.value == obj.value;
    } else {
        return false;
    }
};

Character.prototype.Roughly = function(context, obj) {
    if (obj instanceof Text || obj instanceof Character) {
        return removeAccents(this.value.toLowerCase()) == removeAccents(obj.value.toLowerCase());
    } else {
        return false;
    }
};

exports.Character = Character;


