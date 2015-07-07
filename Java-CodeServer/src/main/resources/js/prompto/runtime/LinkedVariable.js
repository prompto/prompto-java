
/* used for downcast */
function LinkedVariable (type, linked) {
    this.type = type;
    this.linked = linked;
    return this;
}

LinkedVariable.prototype.getType = function(context) {
    return this.type;
};

Object.defineProperty(LinkedVariable.prototype, "name", {
    get : function() {
        return this.linked.name;
    }
});

exports.LinkedVariable = LinkedVariable;