var Value = require("./Value").Value;
var DocumentType = require("../type/DocumentType").DocumentType;

function Document(value) {
    Value.call(this, DocumentType.instance);
    this.mutable = true;
    this.members = {};
    return this;
}

Document.prototype = Object.create(Value.prototype);
Document.prototype.constructor = Document;

Document.prototype.getMember = function(context, name) {
    var result = this.members[name] || null;
    if(result==null) {
        result = new Document();
        this.members[name] = result;
    }
    return result;
};

Document.prototype.setMember = function(context, name, value) {
    this.members[name] = value;
};

exports.Document = Document;


