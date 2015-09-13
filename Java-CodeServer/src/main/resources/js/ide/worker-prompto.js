importScripts("worker-base.js");
ace.define('ace/worker/prompto',["require","exports","module","ace/lib/oop","ace/worker/mirror"], function(require, exports, module) {
    "use strict";

    var oop = require("ace/lib/oop");
    var Mirror = require("ace/worker/mirror").Mirror;

    var PromptoWorker = function(sender) {
        Mirror.call(this, sender);
        this.setTimeout(200);
        this.$dialect = null;
        this.onInit();
    };

    oop.inherits(PromptoWorker, Mirror);

    PromptoWorker.prototype.setDialect = function(dialect) {
        var old = this.$dialect;
        this.$dialect = dialect;
        if(old && dialect!==old) {
            var value = this.doc.getValue();
            if(value) {
                value = safe_require(function(){return translate(value, old, dialect);});
                this.sender.emit("value", value);
            }
        }
    };

    PromptoWorker.prototype.getDeclaration = function(id) {
        if(id.test)
            return appContext.getRegisteredTest(id.test);
        else if(id.method) {
            var decl = appContext.getRegisteredDeclaration(id.method);
            if(id.proto)
                return decl.methods[id.proto];
            else for(var proto in decl.methods)
                return decl.methods[proto];
        } else {
            var name = id.attribute || id.category
            return appContext.getRegisteredDeclaration(name);
        }
    };

    PromptoWorker.prototype.setContent = function(id) {
        var worker = this;
        safe_require(function() {
            var decl = worker.getDeclaration(id);
            var dialect = prompto.parser.Dialect[worker.$dialect];
            var writer = new prompto.utils.CodeWriter(dialect, appContext);
            decl.toDialect(writer);
            var value = writer.toString();
            worker.sender.emit("value", value);
        });
    };

    PromptoWorker.prototype.onUpdate = function() {
        var annotations = [];
        var value = this.doc.getValue();
        if (value) {
            var errorListener = new AnnotatingErrorListener(annotations);
            var worker = this;
            safe_require(function() { parse(value, worker.$dialect, errorListener); });
        }
        this.sender.emit("annotate", annotations);
    };

    PromptoWorker.prototype.onInit = function() {
        var worker = this;
        safe_require(function() {
            loadCore(worker);
            publishCore(worker);
        });
    };

    exports.PromptoWorker = PromptoWorker;
});

// load nodejs compatible require
var ace_require = require;
try {
    self.require = undefined;
    Honey = {'requirePath': ['..']}; // walk up to js folder
    importScripts("../lib/require.js");
    var antlr4_require = require;
} finally {
    self.require = ace_require;
}

// load antlr4 and prompto
var antlr4, prompto;
try {
    self.require = antlr4_require;
    antlr4 = require('antlr4/index');
    prompto = require('prompto/index');
} finally {
    self.require = ace_require;
}

function safe_require(method) {
    try {
        self.require = antlr4_require;
        return method();
    } finally {
        self.require = ace_require;
    }

}
// class for gathering errors and posting them to editor
var AnnotatingErrorListener = function(annotations) {
    antlr4.error.ErrorListener.call(this);
    this.annotations = annotations;
    return this;
};

AnnotatingErrorListener.prototype = Object.create(antlr4.error.ErrorListener.prototype);
AnnotatingErrorListener.prototype.constructor = AnnotatingErrorListener;

AnnotatingErrorListener.prototype.syntaxError = function(recognizer, offendingSymbol, line, column, msg, e) {
    this.annotations.push({
        row: line - 1,
        column: column,
        text: msg,
        type: "error"
    });
};

// method for parsing editor input
var parse = function(input, dialect, listener) {
    var klass = prompto.parser[dialect + "CleverParser"];
    var parser = new klass(input);
    parser.removeErrorListeners();
    if(listener)
        parser.addErrorListener(listener);
    return parser.parse();
};

// method for translating current input to other dialect
var translate = function(input, from, to) {
    var decls = parse(input, from); // could be cached
    var ctx = prompto.runtime.Context.newGlobalContext();
    decls.register(ctx);
    // rewrite
    var dialect = prompto.parser.Dialect[to];
    var writer = new prompto.utils.CodeWriter(dialect, ctx);
    decls.toDialect(writer);
    return writer.toString();
};

// method for downloading prompto code
var loadCode = function(url) {
    var xhr = new XMLHttpRequest();
    xhr.responseType = "text";
    xhr.onerror = function(e) {
        alert("Error " + e.target.status + " occurred while receiving the document.");
        return null;
    };
    xhr.open('GET', url, false);
    xhr.send(null);
    return xhr.responseText;
};

var coreContext = prompto.runtime.Context.newGlobalContext();
var appContext = coreContext.newLocalContext();

function loadCore(worker) {
    var code = loadCode("../../prompto/core.pec");
    var decls = parse(code, "E");
    decls.register(coreContext);
};

function publishCore(worker) {
    var delta = {
        removed : {},
        added   : coreContext.getCatalog()
    };
    worker.sender.emit("catalog", delta);
}

