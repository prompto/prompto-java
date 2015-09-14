importScripts("worker-base.js");
ace.define('ace/worker/prompto',["require","exports","module","ace/lib/oop","ace/worker/mirror"], function(require, exports, module) {
    "use strict";

    var oop = require("ace/lib/oop");
    var Mirror = require("ace/worker/mirror").Mirror;

    var PromptoWorker = function(sender) {
        Mirror.call(this, sender);
        this.setTimeout(200);
        this.$dialect = null;
        this.$value = null;
        this.onInit();
    };

    oop.inherits(PromptoWorker, Mirror);

    PromptoWorker.prototype.setDialect = function(dialect) {
        var old = this.$dialect;
        this.$dialect = dialect;
        if(old && dialect!==old) {
            var value = this.doc.getValue();
            if(value) {
                // remember value since it does not result from an edit
                this.$value = safe_require(function() { return translate(value, old, dialect); } );
                this.sender.emit("value", this.$value);
            }
        }
    };

    PromptoWorker.prototype.setContent = function(id) {
        var worker = this;
        safe_require(function() {
            var decl = getDeclaration(id);
            var dialect = prompto.parser.Dialect[worker.$dialect];
            var writer = new prompto.utils.CodeWriter(dialect, appContext);
            decl.toDialect(writer);
            // remember value since it does not result from an edit
            worker.$value = writer.toString();
            worker.sender.emit("value", worker.$value);
        });
    };

    PromptoWorker.prototype.setCodebase = function(path) {
        var worker = this;
        safe_require(function() {
            loadCodebase(worker, path);
            publishCodebase(worker);
        });
    };

    PromptoWorker.prototype.onUpdate = function() {
        var value = this.doc.getValue();
        var annotations = [];
        var errorListener = new AnnotatingErrorListener(annotations);
        var worker = this;
        safe_require(function() { annotateAndUpdateCatalog(worker, worker.$value, value, worker.$dialect, errorListener); });
        this.$value = value;
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
    prompto.parser.ProblemCollector.call(this);
    this.problems = annotations;
    return this;
};

AnnotatingErrorListener.prototype = Object.create(prompto.parser.ProblemCollector.prototype);
AnnotatingErrorListener.prototype.constructor = AnnotatingErrorListener;

AnnotatingErrorListener.prototype.collectProblem = function(problem) {
    // convert to ACE annotation
    problem = { row : problem.startLine - 1, column : problem.startColumn, type : problem.type, text : problem.message };
    this.problems.push(problem);
};

// method for parsing editor input
function parse(input, dialect, listener) {
    var klass = prompto.parser[dialect + "CleverParser"];
    var parser = new klass(input);
    parser.removeErrorListeners();
    if(listener)
        parser.addErrorListener(listener);
    return parser.parse();
}

// method for updating context on user input
function annotateAndUpdateCatalog(worker, previous, current, dialect, listener) {
    // always annotate new content
    var new_decls = parse(current, dialect, listener);
    // only update catalog and appContext if update event results from an edit
    if(previous && previous!=current) {
        // update catalog using isolated contexts
        var old_listener = new prompto.parser.ProblemCollector(); // ignore errors
        var old_decls = parse(previous, dialect, old_listener);
        var new_context = prompto.runtime.Context.newGlobalContext();
        new_context.problemListener = listener;
        new_decls.register(new_context);
        var old_context = prompto.runtime.Context.newGlobalContext();
        old_context.problemListener = old_listener;
        old_decls.register(old_context);
        var delta = {
            removed : old_context.getLocalCatalog(),
            added   : new_context.getLocalCatalog()
        };
        var count = shrinkDelta(delta);
        if(count)
            worker.sender.emit("catalog", delta);
        // now update appContext
        if(listener.problems.length==0) {
            appContext.problemListener = listener;
            old_decls.unregister(appContext);
            new_decls.register(appContext);
        }
    }
}

function shrinkDelta(delta) {
    var length = shrinkLists(delta.removed.attributes, delta.added.attributes);
    length += shrinkLists(delta.removed.categories, delta.added.categories);
    length += shrinkLists(delta.removed.tests, delta.added.tests);
    return length;
}

function shrinkLists(a, b) {
    if(a && b) {
        a.sort();
        b.sort();
        for(var i=0,j=0;i<a.length && j< b.length;) {
            if(a[i]===b[j]) {
                a.splice(i,1);
                b.splice(j,1);
            } else if(a[i]>b[j]) {
                j++;
            } else {
                i++;
            }
        }
        var length = a.length + b.length;
        if(!length) {
            delete a;
            delete b;
        }
        return length;
    } else if(a)
        return a.length;
    else if(b)
        return b.length;
    else
        return 0;
}


// method for translating current input to other dialect
function translate(input, from, to) {
    var decls = parse(input, from); // could be cached
    var ctx = prompto.runtime.Context.newGlobalContext();
    decls.register(ctx);
    // rewrite
    var dialect = prompto.parser.Dialect[to];
    var writer = new prompto.utils.CodeWriter(dialect, ctx);
    decls.toDialect(writer);
    return writer.toString();
}

// method for downloading prompto code
function loadCode(url) {
    var xhr = new XMLHttpRequest();
    xhr.responseType = "text";
    xhr.onerror = function(e) {
        alert("Error " + e.target.status + " occurred while receiving the document.");
        return null;
    };
    xhr.open('GET', url, false);
    xhr.send(null);
    return xhr.responseText;
}

var coreContext = prompto.runtime.Context.newGlobalContext();
var appContext = coreContext.newLocalContext();

function loadCore(worker) {
    var code = loadCode("../../prompto/core.pec");
    var decls = parse(code, "E");
    decls.register(coreContext);
}

function publishCore(worker) {
    var delta = {
        removed : {},
        added   : coreContext.getCatalog()
    };
    worker.sender.emit("catalog", delta);
}

function inferDialect(path) {
    return path.substring(path.length-2, path.length-1).toUpperCase();
}

function loadCodebase(worker, path) {
    var code = loadCode(path);
    var dialect = inferDialect(path);
    var decls = parse(code, dialect);
    decls.register(appContext);
}

function publishCodebase(worker) {
    var delta = {
        removed : {},
        added   : appContext.getLocalCatalog()
    };
    worker.sender.emit("catalog", delta);
}

function getDeclaration(id) {
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
}



