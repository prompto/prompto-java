var isNodeJs = typeof window === 'undefined' && typeof importScripts === 'undefined';

if(isNodeJs) {
    var net = require("net");
    exports.writer = net.Socket;
    exports.stdout = process.stdout;
    exports.stderr = process.stderr;
} else {
    // need a named wrapper around console for situations where console is anonymous (such as in ace.js)
    function writer(m) {
        this.write = m || console.log;
    };

    exports.writer = new writer();
    exports.stdout = new writer(function(t) {
        console.log(t);
    });
    exports.stderr = new writer(function(t) {
        console.error(t);
    });
}
