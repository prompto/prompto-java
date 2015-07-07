function PythonModule(ids) {
    this.ids = ids;
}

PythonModule.prototype.toDialect = function(writer) {
    writer.append(" from module: ");
    for(var i=0;i<this.ids.length;i++) {
        writer.append(this.ids[i]);
        writer.append('.');
    }
    writer.trimLast(1);
}

exports.PythonModule = PythonModule;