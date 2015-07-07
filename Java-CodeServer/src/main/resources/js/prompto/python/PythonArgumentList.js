var ObjectList = require("../utils/ObjectList").ObjectList;

function PythonArgumentList(argument) {
    ObjectList.call(this);
    argument = argument || null;
    if(argument!==null) {
        this.add(argument);
    }
    return this;
}

PythonArgumentList.prototype = Object.create(ObjectList.prototype);
PythonArgumentList.prototype.constructor = PythonArgumentList;

PythonArgumentList.prototype.toDialect = function(writer) {
    if(this.length>0) {
        for(var i=0;i<this.length;i++) {
            this[i].toDialect(writer);
            writer.append(", ");
        }
        writer.trimLast(2);
    }
};

exports.PythonArgumentList = PythonArgumentList;