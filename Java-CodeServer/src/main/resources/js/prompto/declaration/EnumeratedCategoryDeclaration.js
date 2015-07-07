var ConcreteCategoryDeclaration = require("./ConcreteCategoryDeclaration").ConcreteCategoryDeclaration;
var EnumeratedCategoryType = require("../type/EnumeratedCategoryType").EnumeratedCategoryType;

function EnumeratedCategoryDeclaration(name, attrs, derived, symbols) {
	ConcreteCategoryDeclaration.call(this, name, attrs, derived, null);
	this.setSymbols(symbols);
	return this;
}

EnumeratedCategoryDeclaration.prototype = Object.create(ConcreteCategoryDeclaration.prototype);
EnumeratedCategoryDeclaration.prototype.constructor = EnumeratedCategoryDeclaration;

EnumeratedCategoryDeclaration.prototype.setSymbols = function(symbols) {
	this.symbols = symbols;
	var type = new EnumeratedCategoryType(this.name);
	for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].type = type;
	}
};

EnumeratedCategoryDeclaration.prototype.register = function(context) {
	context.registerDeclaration(this);
	for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].register(context);
	}
};

EnumeratedCategoryDeclaration.prototype.check = function(context) {
	ConcreteCategoryDeclaration.prototype.check.call(this, context);
	for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].check(context);
	}
	return this.getType(context);
};

EnumeratedCategoryDeclaration.prototype.getType = function(context) {
	return new EnumeratedCategoryType(this.name);
};

EnumeratedCategoryDeclaration.prototype.toODialect = function(writer) {
    writer.append("enumerated category ");
    writer.append(this.name);
    if(this.attributes!=null) {
        writer.append('(');
        this.attributes.toDialect(writer, true);
        writer.append(")");
    }
    if(this.derivedFrom!=null) {
        writer.append(" extends ");
        this.derivedFrom.toDialect(writer, true);
    }
    writer.append(" {\n");
    writer.indent();
    for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].toDialect(writer);
        writer.append(";\n");
    }
    writer.dedent();
    writer.append("}\n");
}

EnumeratedCategoryDeclaration.prototype.toEDialect = function(writer) {
    writer.append("define ");
    writer.append(this.name);
    writer.append(" as: enumerated ");
    if(this.derivedFrom!=null)
        this.derivedFrom.toDialect(writer, true);
    else
        writer.append("category");
    if(this.attributes!=null && this.attributes.length>0) {
        if(this.attributes.length==1)
            writer.append(" with attribute: ");
        else
            writer.append(" with attributes: ");
        this.attributes.toDialect(writer, true);
        if(this.symbols!=null && this.symbols.length>0)
            writer.append(", and symbols:\n");
    } else
        writer.append(" with symbols:\n");
    writer.indent();
    for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].toDialect(writer);
        writer.append("\n");
    }
    writer.dedent();
}

EnumeratedCategoryDeclaration.prototype.toSDialect = function(writer) {
    writer.append("enum ");
    writer.append(this.name);
    writer.append("(");
    if(this.derivedFrom!=null) {
        this.derivedFrom.toDialect(writer, false);
        if(this.attributes!=null && this.attributes.length>0)
            writer.append(", ");
    }
    if(this.attributes!=null && this.attributes.length>0)
        this.attributes.toDialect(writer, false);
    writer.append("):\n");
    writer.indent();
    for(var i=0;i<this.symbols.length;i++) {
        this.symbols[i].toDialect(writer);
        writer.append("\n");
    }
    writer.dedent();
}

exports.EnumeratedCategoryDeclaration = EnumeratedCategoryDeclaration;