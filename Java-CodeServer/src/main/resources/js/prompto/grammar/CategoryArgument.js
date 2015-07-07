var Argument = require("./Argument").Argument;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var IdentifierList = require("../grammar/IdentifierList").IdentifierList;
var AttributeDeclaration = require("../declaration/AttributeDeclaration").AttributeDeclaration;
var ConcreteCategoryDeclaration = require("../declaration/ConcreteCategoryDeclaration").ConcreteCategoryDeclaration;
var utils = require("../utils/index");

function CategoryArgument(type, name, attributes) {
	Argument.call(this, name);
	this.type = type;
	this.attributes = attributes || null;
	return this;
}

CategoryArgument.prototype = Object.create(Argument.prototype);
CategoryArgument.prototype.constructor = CategoryArgument;

/*
	public CategoryArgument(IType type, String name) {
		super(name);
		this.type = type;
	}

	public void setAttributes(IdentifierList attributes) {
		this.attributes = attributes;
	}
	
	@Override
	public IType getType() {
		return type;
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return getProto();
	}

*/

CategoryArgument.prototype.getProto = function(context) {
	if(this.attributes==null) {
		return this.type.name;
	} else {
		return this.type.name + '(' + this.attributes.toString() + ')';
	}
};
	
/*
	@Override
	public String toString() {
		return name + ':' + getProto();
	}
	
	public boolean hasAttributes() {
		return attributes!=null;
	}

	public IdentifierList getAttributes() {
		return attributes;
	}
*/

CategoryArgument.prototype.equals = function(obj) {
	if(obj===this) {
		return true;
	} 
	if(obj===null || obj===undefined) {
		return false;
	}
	if(!(obj instanceof CategoryArgument)) {
		return false;
	}
	return utils.equalObjects(this.type, obj.type) && 
		this.name===obj.name && 
		utils.equalArrays(this.attributes, obj.attributes);
};

CategoryArgument.prototype.register = function(context) {
	var actual = context.getRegisteredValue(this.name);
	if(actual!==null) {
		throw new SyntaxError("Duplicate argument: \"" + name + "\"");
	}
	if(this.attributes!=null) {
		var declaration = new ConcreteCategoryDeclaration(this.name, this.attributes, new IdentifierList(this.type.name), null);
		context.registerDeclaration(declaration);
	}
	context.registerValue(this);
    if(this.defaultExpression!=null)
        context.setValue(this.name, this.defaultExpression.interpret(context));
};

CategoryArgument.prototype.check = function(context) {
	this.type.checkExists(context);
	if(this.attributes!==null) {
		for(var i=0;i<this.attributes.length;i++) {
			var actual = context.getRegisteredDeclaration(this.attributes[i]);
			if (!actual instanceof AttributeDeclaration) {
				throw new SyntaxError("Unknown attribute: \"" + attribute + "\"");
			}
		}
	}
};

CategoryArgument.prototype.getType = function(context) {
	if(this.attributes==null) {
		return this.type;
	} else {
		return context.getRegisteredDeclaration(this.name).getType(context);
	}
};

CategoryArgument.prototype.toEDialect = function(writer) {
    var anonymous = "any"==this.type.name;
    this.type.toDialect(writer);
    if(anonymous) {
        writer.append(' ');
        writer.append(this.name);
    }
    if(this.attributes!=null) {
        switch(this.attributes.length) {
            case 0:
                break;
            case 1:
                writer.append(" with attribute: ");
                this.attributes.toDialect(writer, false);
                break;
            default:
                writer.append(" with attributes: ");
                this.attributes.toDialect(writer, true);
                break;
        }
    }
    if(!anonymous) {
        writer.append(' ');
        writer.append(this.name);
    }
};

CategoryArgument.prototype.toODialect = function(writer) {
    this.type.toDialect(writer);
    if(this.attributes!=null) {
        writer.append('(');
        this.attributes.toDialect(writer, false);
        writer.append(')');
    }
    writer.append(' ');
    writer.append(this.name);
};

CategoryArgument.prototype.toSDialect = function(writer) {
    writer.append(this.name);
    writer.append(':');
    this.type.toDialect(writer);
    if(this.attributes!=null) {
        writer.append('(');
        this.attributes.toDialect(writer, false);
        writer.append(')');
    }
};

exports.CategoryArgument = CategoryArgument;
