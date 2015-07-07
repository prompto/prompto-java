var isNodeJs = typeof window === 'undefined';
var mod = isNodeJs ? require("module") : null;
var path = isNodeJs ? require('path') : null;

function JavaScriptModule(ids) {
    this.ids = ids;
}

JavaScriptModule.prototype.toString = function() {
    var res = this.ids.join("/");
    if("js"==this.ids[this.ids.length-1]) {
        res = res.replace("/js", ".js")
    }
    return res;
}

JavaScriptModule.prototype.resolve = function() {
    var o = this.resolve_module();
    if(o!=null) {
        return o;
    }
    var o = this.resolve_path("prompto");
    if(o!=null) {
        return o;
    }
    var o = this.resolve_path("main");
    if(o!=null) {
        return o;
    }
    return null;
};

JavaScriptModule.prototype.resolve_module = function() {
    try {
        var path = this.toString();
        return require(path);
    } catch (e) {
        return null;
    }
};

JavaScriptModule.prototype.resolve_path = function(part) {
    try {
        var folder = path.sep + part + path.sep;
        var idx = module.filename.lastIndexOf(folder);
        var rootpath = module.filename.substring(0, idx + 1);
        // for now let's assume prompto and the required module are at the same level
        var modulepath = rootpath + this.toString();
        return require(modulepath);
    } catch (e) {
        return null;
    }
};

JavaScriptModule.prototype.toDialect = function(writer) {
    writer.append(" from module: ");
    for(var i=0;i<this.ids.length;i++) {
        var id = this.ids[i];
        if("js"==id) {
            writer.trimLast(1);
            writer.append('.');
        }
        writer.append(id);
        writer.append('/');
    }
    writer.trimLast(1);
}

exports.JavaScriptModule = JavaScriptModule;