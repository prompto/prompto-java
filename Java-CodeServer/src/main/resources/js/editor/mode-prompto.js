ace.define('ace/mode/prompto_highlight_rules',["require","exports","module","ace/lib/oop","ace/mode/text_highlight_rules"], function(require, exports, module) {

    var oop = require("ace/lib/oop");
    var TextHighlightRules = require("ace/mode/text_highlight_rules").TextHighlightRules;

    var PromptoHighlightRules = function() {

        var controls = (
            "always|case|catch|default|do|each|else|except|finally|for|from|if|" +
            "on|otherwise|raise|return|switch|throw|to|try|with|when|where|while"
        );

        var types = (
            "Java|C#|Python2|Python3|JavaScript|Swift|Boolean|Character|Text|" +
            "Integer|Decimal|Date|Time|DateTime|Period|Method|Code|Document|" +
            "attr|attribute|attributes|bindings|enum|category|class|getter|" +
            "method|methods|operator|resource|setter|singleton|test"
        );

        var modifiers = (
            "abstract|enumerated|extends|mutable|native|sorted"
        );

        var operators = (
            "and|in|is|modulo|not|or"
        );

        var other = (
            "all|any|as|contains|def|define|doing|expecting|" +
            "matching|receiving|returning"
        );

        var functions = (
            "write|read|close|open|execute|invoke|pass|fetch"
        );

        var constants = (
            "True|true|False|false|None|Nothing|nothing|null|self|this"
        );

        var keywordMapper = this.createKeywordMapper({
            "keyword.control": controls,
            "keyword.operator": operators,
            "keyword.other": other,
            "storage.type": types,
            "storage.modifier": modifiers,
            "support.function": functions,
            "constant.language": constants
        }, "identifier");


        this.$rules = {
            "start": [
                {
                    token : "comment",
                    regex : "//",
                    next : "singleLineComment"
                },
                {
                    token : "string", // text literal
                    regex : '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'
                },
                {
                    token : "string", // date, time, character...
                    regex : "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"
                },
                {
                    token: keywordMapper,
                    regex: "[a-zA-Z_$][a-zA-Z0-9_$]*\\b"
                },
                {
                    token : "constant.numeric", // hex
                    regex : "0[xX][0-9a-fA-F]+\\b"
                },
                {
                    token: "constant.numeric", // float
                    regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"
                },
                {
                    token : "keyword.operator",
                    regex : "!|%|\\\\|/|\\*|\\-|\\+|~=|==|<>|!=|<=|>=|=|<|>|&&|\\|\\|"
                },
                {
                    token : "punctuation.operator",
                    regex : "\\?|\\:|\\,|\\;|\\."
                },
                {
                    token : "paren.lparen",
                    regex : "[[({]"
                },
                {
                    token : "paren.rparen",
                    regex : "[\\])}]"
                },
                {
                    token : "text",
                    regex : "\\s+"
                }
            ]
        };

    };

    oop.inherits(PromptoHighlightRules, TextHighlightRules);

    exports.PromptoHighlightRules = PromptoHighlightRules;
});

ace.define('ace/mode/prompto',["require","exports","module","ace/lib/oop","ace/mode/text","ace/mode/prompto_highlight_rules","ace/worker/worker_client"], function(require, exports, module) {

    var oop = require("ace/lib/oop");
    var TextMode = require("ace/mode/text").Mode;
    var PromptoHighlightRules = require("ace/mode/prompto_highlight_rules").PromptoHighlightRules;
    var WorkerClient = require("ace/worker/worker_client").WorkerClient;

    var Mode = function() {
        this.HighlightRules = PromptoHighlightRules;
    };
    oop.inherits(Mode, TextMode);

    (function() {

        this.setDialect = function(dialect) {
            this.$dialect = dialect;
        };

        this.createWorker = function(session) {
            var worker = new WorkerClient(["ace"], "ace/worker/prompto", "PromptoWorker", "../js/editor/worker-prompto.js");
            worker.send("setDialect", [ this.$dialect ] );
            worker.attachToDocument(session.getDocument());

            worker.on("errors", function(e) {
                session.setAnnotations(e.data);
            });

            worker.on("annotate", function(e) {
                session.setAnnotations(e.data);
            });

            worker.on("terminate", function() {
                session.clearAnnotations();
            });

            return worker;

        };

        this.$id = "ace/mode/prompto";

    }).call(Mode.prototype);

    exports.Mode = Mode;
});

