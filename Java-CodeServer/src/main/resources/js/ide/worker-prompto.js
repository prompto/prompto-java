importScripts("worker-base.js");
ace.define('ace/worker/prompto',["require","exports","module","ace/lib/oop","ace/worker/mirror"], function(require, exports, module) {
    "use strict";

    var oop = require("ace/lib/oop");
    var Mirror = require("ace/worker/mirror").Mirror;

    var PromptoWorker = function(sender) {
        Mirror.call(this, sender);
        this.setTimeout(200);
        this.$dialect = null;
    };

    oop.inherits(PromptoWorker, Mirror);

    (function() {

        this.setDialect = function(dialect) {
            var old = this.$dialect;
            this.$dialect = dialect;
            if(old && dialect!==old) {
                var value = this.doc.getValue();
                if(value) {
                    value = translate(value, old, dialect);
                    this.sender.emit("content", value);
                }
            }
        };

        this.onUpdate = function() {
            var annotations = [];
            var value = this.doc.getValue();
            if (value) {
                var errorListener = new AnnotatingErrorListener(annotations);
                parse(value, this.$dialect, errorListener);
            }
            this.sender.emit("annotate", annotations);
        };

    }).call(PromptoWorker.prototype);

    exports.PromptoWorker = PromptoWorker;
});

var require_saved = require;
require = undefined;
RequireOptions = { 'paths': ['..'] }; // walk up to js folder
importScripts("../lib/require.js");
var prompto = require('prompto/index');
var antlr4ErrorListener = require('antlr4/error/ErrorListener').ErrorListener;
require = require_saved;

var AnnotatingErrorListener = function(annotations) {
    antlr4ErrorListener.call(this);
    this.annotations = annotations;
    return this;
};

AnnotatingErrorListener.prototype = Object.create(antlr4ErrorListener.prototype);
AnnotatingErrorListener.prototype.constructor = AnnotatingErrorListener;

AnnotatingErrorListener.prototype.syntaxError = function(recognizer, offendingSymbol, line, column, msg, e) {
    this.annotations.push({
        row: line - 1,
        column: column,
        text: msg,
        type: "error"
    });
};

var parse = function(input, dialect, listener) {
    var klass = prompto.parser[dialect + "CleverParser"];
    var parser = new klass(input);
    parser.removeErrorListeners();
    if(listener)
        parser.addErrorListener(listener);
    return parser.parse();
};

var translate = function(input, from, to) {
    var decls = parse(input, from); // could be cached
    var context = prompto.runtime.Context.newGlobalContext();
    decls.register(context);
    // rewrite
    var dialect = prompto.parser.Dialect[to];
    var writer = new prompto.utils.CodeWriter(dialect, context);
    decls.toDialect(writer);
    return writer.toString();
};
