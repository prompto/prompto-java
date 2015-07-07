var BaseDeclaration = require("./BaseDeclaration").BaseDeclaration;
var EnumeratedNativeType = require("../type/EnumeratedNativeType").EnumeratedNativeType;

function EnumeratedNativeDeclaration(name, derivedFrom, symbols) {
	BaseDeclaration.call(this, name);
	this.type = new EnumeratedNativeType(name, derivedFrom);
	this.symbols = symbols;
	for(var i=0;i<symbols.length;i++) {
		symbols[i].type = this.type;
	}
	return this;
}

EnumeratedNativeDeclaration.prototype = Object.create(BaseDeclaration.prototype);
EnumeratedNativeDeclaration.prototype.constructor = EnumeratedNativeDeclaration;

EnumeratedNativeDeclaration.prototype.toDialect = function(writer) {
    writer.toDialect(this);
};


EnumeratedNativeDeclaration.prototype.toSDialect = function(writer) {
    writer.append("enum ");
    writer.append(this.name);
    writer.append('(');
    this.type.derivedFrom.toDialect(writer);
    writer.append("):\n");
    writer.indent();
    for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].toDialect(writer);
        writer.append("\n");
    }
    writer.dedent();
}

EnumeratedNativeDeclaration.prototype.toODialect = function(writer) {
    writer.append("enumerated ");
    writer.append(this.name);
    writer.append('(');
    this.type.derivedFrom.toDialect(writer);
    writer.append(") {\n");
    writer.indent();
    for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].toDialect(writer);
        writer.append(";\n");
    }
    writer.dedent();
    writer.append("}\n");
}

EnumeratedNativeDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.name);
    writer.append(" as: enumerated ");
    this.type.derivedFrom.toDialect(writer);
    writer.append(" with symbols:\n");
    writer.indent();
    for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].toDialect(writer);
        writer.append("\n");
    }
    writer.dedent();
};

EnumeratedNativeDeclaration.prototype.register = function(context) {
	context.registerDeclaration(this);
	for(var i=0;i<this.symbols.length;i++) {
		this.symbols[i].register(context);
	}
};

EnumeratedNativeDeclaration.prototype.check = function(context) {
	for(var i=0;i<this.symbols.length;i++) {
		this.symbols[i].check(context);
	}
	return this.type;
};

EnumeratedNativeDeclaration.prototype.getType = function(context) {
	return this.type;
};


exports.EnumeratedNativeDeclaration = EnumeratedNativeDeclaration;
