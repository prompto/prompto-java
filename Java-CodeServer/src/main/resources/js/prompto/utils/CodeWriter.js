var Context = require("../runtime/Context").Context;

function Indenter() {
    this.value = "";
    this.indents = "";
    this.isStartOfLine = true;
    return this;
}

Indenter.prototype.appendTabsIfRequired = function(s) {
    if(this.isStartOfLine) {
        this.value += this.indents;
    }
    this.isStartOfLine = s.charAt(s.length-1)=='\n';
};

Indenter.prototype.append = function(s) {
    this.value += s;
};

Indenter.prototype.trimLast = function(count) {
    this.value = this.value.substring(0, this.value.length - count);
};

Indenter.prototype.indent = function() {
    this.indents += '\t';
};

Indenter.prototype.dedent = function() {
    if(this.indents.length==0) {
        throw new Exception("Illegal dedent!");
    }
    this.indents = this.indents.slice(1);
};


function CodeWriter(dialect, context, indenter) {
    this.dialect = dialect;
    this.context = context || Context.newGlobalContext();
    this.indenter = indenter || new Indenter();
    return this;
}

CodeWriter.prototype.isGlobalContext = function() {
    return this.context.isGlobalContext();
};

CodeWriter.prototype.append = function(s) {
    this.indenter.appendTabsIfRequired(s);
    this.indenter.append(s);
};

CodeWriter.prototype.toString = function() {
    return this.indenter.value;
};

CodeWriter.prototype.trimLast = function(count) {
    this.indenter.trimLast(count);
};

CodeWriter.prototype.indent = function() {
    this.indenter.indent();
};

CodeWriter.prototype.dedent = function() {
    this.indenter.dedent();
};

CodeWriter.prototype.newLine = function() {
    this.append('\n');
};

CodeWriter.prototype.newLocalWriter = function() {
    return new CodeWriter(this.dialect, this.context.newLocalContext(), this.indenter);
};

CodeWriter.prototype.newInstanceWriter = function(type) {
    return new CodeWriter(this.dialect, this.context.newInstanceContext(null, type), this.indenter);
};

CodeWriter.prototype.newMemberWriter = function() {
    var context = this.context.newLocalContext ();
    context.parent = this.context;
    return new CodeWriter (this.dialect, context, this.indenter);
};

CodeWriter.prototype.toDialect = function(o) {
    this.dialect.toDialect(this, o);
};

exports.CodeWriter = CodeWriter