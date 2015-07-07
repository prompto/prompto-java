var BaseDeclaration = require("./BaseDeclaration").BaseDeclaration;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var CategoryType = require("../type/CategoryType").CategoryType;

function CategoryDeclaration(name, attributes) {
	BaseDeclaration.call(this, name);
	this.attributes = attributes || null;
	this.derivedFrom = null;
}

CategoryDeclaration.prototype = Object.create(BaseDeclaration.prototype);
CategoryDeclaration.prototype.constructor = CategoryDeclaration;


CategoryDeclaration.prototype.register = function(context) {
	context.registerDeclaration(this);
};

CategoryDeclaration.prototype.check = function(context) {
	if(this.attributes!=null) {
		for(var i=0;i<this.attributes.length;i++) {
			var ad = context.getRegisteredDeclaration(this.attributes[i]);
			if (ad == null) {
				throw new SyntaxError("Unknown attribute: \"" + this.attributes[i] + "\"");
			}
		}
	}
	return new CategoryType(this.name);
}

CategoryDeclaration.prototype.getType = function(context) {
	return new CategoryType(this.name);
};

CategoryDeclaration.prototype.hasAttribute = function(context, name) {
	 return this.attributes!=null && this.attributes.indexOf(name)>=0;
};

CategoryDeclaration.prototype.hasMethod = function(context, key, object) {
	return false;
};

CategoryDeclaration.prototype.isDerivedFrom = function(context, categoryType) {
	return false;
};


CategoryDeclaration.prototype.checkConstructorContext = function(context) {
	// nothing to do
};

CategoryDeclaration.prototype.toDialect = function(writer) {
    var type = this.getType(writer.context);
    writer = writer.newInstanceWriter(type);
    writer.toDialect(this);
};


CategoryDeclaration.prototype.protoToEDialect = function(writer, hasMethods, hasBindings) {
    var hasAttributes = this.attributes!=null && this.attributes.length>0;
    writer.append("define ");
    writer.append(this.name);
    writer.append(" as: ");
    this.categoryTypeToEDialect(writer);
    if(hasAttributes) {
        if(this.attributes.length==1)
            writer.append(" with attribute: ");
        else
            writer.append(" with attributes: ");
        this.attributes.toDialect(writer, true);
    }
    if(hasMethods) {
        if(hasAttributes)
            writer.append(", and methods:");
        else
            writer.append(" with methods:");
    } else if (hasBindings) {
        if(hasAttributes)
            writer.append(", and bindings:");
        else
            writer.append(" with bindings:");
    }
    writer.newLine();
};


CategoryDeclaration.prototype.methodsToEDialect = function(writer, methods) {
    writer.indent();
    for(var i=0; i<methods.length; i++) {
        writer.newLine();
        var w = writer.newMemberWriter();
        methods[i].toDialect(w);
    }
    writer.dedent();
};

CategoryDeclaration.prototype.methodsToODialect = function(writer, methods) {
    for(var i =0; i<methods.length; i++) {
        var w = writer.newMemberWriter();
        methods[i].toDialect(w);
        w.newLine();
    }
}


CategoryDeclaration.prototype.allToODialect = function(writer, hasBody) {
    this.categoryTypeToODialect(writer);
    writer.append(" ");
    writer.append(this.name);
    if(this.attributes!=null) {
        writer.append('(');
        this.attributes.toDialect(writer, true);
        writer.append(')');
    }
    this.categoryExtensionToODialect(writer);
    if(hasBody) {
        writer.append(" {\n");
        writer.newLine();
        writer.indent();
        this.bodyToODialect(writer);
        writer.dedent();
        writer.append('}');
        writer.newLine();
    } else
        writer.append(';');
};

CategoryDeclaration.prototype.categoryExtensionToODialect = function(writer) {
    // by default no extension
};


CategoryDeclaration.prototype.protoToSDialect = function(writer, derivedFrom) {
    this.categoryTypeToSDialect(writer);
    writer.append(" ");
    writer.append(this.name);
    writer.append("(");
    if(this.derivedFrom!=null) {
        this.derivedFrom.toDialect(writer, false);
        if(this.attributes!=null)
            writer.append(", ");
    }
    if(this.attributes!=null)
        this.attributes.toDialect(writer, false);
    writer.append("):\n");
    writer.newLine();
};


exports.CategoryDeclaration = CategoryDeclaration;

