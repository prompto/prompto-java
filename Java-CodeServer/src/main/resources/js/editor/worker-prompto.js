self.console.log('loading prompto worker');
importScripts("worker-base.js");
ace.define('ace/worker/prompto',["require","exports","module","ace/lib/oop","ace/worker/mirror"], function(require, exports, module) {
    "use strict";

    var oop = require("ace/lib/oop");
    var Mirror = require("ace/worker/mirror").Mirror;

    var PromptoWorker = function(sender) {
        Mirror.call(this, sender);
        this.setTimeout(200);
    };

    oop.inherits(PromptoWorker, Mirror);

    (function() {

        this.onUpdate = function() {
            self.console.log('onUpdate');
            var value = this.doc.getValue();
            var errors = [];
            errors.push({
                row: 0,
                column: 8,
                text: "prompto worker!",
                type: "error",
                raw: "just a test"
            });
            /*
            try {
                if (value)
                    parse(value);
            } catch (e) {
                var pos = this.doc.indexToPosition(e.at-1);
                errors.push({
                    row: pos.row,
                    column: pos.column,
                    text: e.message,
                    type: "error"
                });
            }*/
            this.sender.emit("annotate", errors);
        };

    }).call(PromptoWorker.prototype);

    exports.PromptoWorker = PromptoWorker;
});
self.console.log('prompto worker loaded');

self.console.log('loading prompto parser');
var require_saved = require;
require = undefined;
Smoothie = { 'requirePath': ['..'] }; // walk up to js folder
importScripts("../lib/require.js");
var prompto = require('prompto/index');
require = require_saved;
self.console.log('prompto parser loaded');

var parse = function(input) {
    var parser = new prompto.parser.ECleverParser(input);
    var decls = parser.parse();
};
