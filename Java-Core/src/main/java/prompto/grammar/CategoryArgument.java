package prompto.grammar;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.Utils;

public class CategoryArgument extends BaseArgument implements ITypedArgument {
	
	IType type;
	IdentifierList attributes;
	
	public CategoryArgument(IType type, Identifier name, IdentifierList attributes) {
		super(name);
		this.type = type;
		this.attributes = attributes;
	}

	public CategoryArgument(IType type, Identifier name) {
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
	
	@Override
	public String getProto() {
		if(attributes==null)
			return type.getId().toString();
		else
			return type.getId().toString() + '(' + attributes.toString() + ')';
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(mutable)
			writer.append("mutable ");
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toPDialect(writer);
			break;
		}
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		boolean anonymous = "any".equals(type.getId().toString());
		type.toDialect(writer);
		if(anonymous) {
			writer.append(' ');
			writer.append(name);
		}
		if(attributes!=null) {
			switch(attributes.size()) {
			case 0:
				break;
			case 1:
				writer.append(" with attribute ");
				attributes.toDialect(writer, false);
				break;
			default:
				writer.append(" with attributes ");
				attributes.toDialect(writer, true);
				break;
			}
		}
		if(!anonymous) {
			writer.append(' ');
			writer.append(name);
		}
	}

	private void toODialect(CodeWriter writer) {
		type.toDialect(writer);
		if(attributes!=null) {
			writer.append('(');
			attributes.toDialect(writer, false);
			writer.append(')');
		}
		writer.append(' ');
		writer.append(name);
	}

	private void toPDialect(CodeWriter writer) {
		writer.append(name);
		writer.append(':');
		type.toDialect(writer);
		if(attributes!=null) {
			writer.append('(');
			attributes.toDialect(writer, false);
			writer.append(')');
		}
	}

	@Override
	public String toString() {
		return name.toString() + ':' + getProto();
	}
	
	public boolean hasAttributes() {
		return attributes!=null;
	}

	public IdentifierList getAttributes() {
		return attributes;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof CategoryArgument))
			return false;
		CategoryArgument other = (CategoryArgument)obj;
		return Utils.equal(this.getType(),other.getType())
				&& Utils.equal(this.getIdentifier(),other.getIdentifier())
				&& Utils.equal(this.getAttributes(),other.getAttributes());
	}

	@Override
	public void register(Context context) throws SyntaxError {
		INamed actual = context.getRegisteredValue(INamed.class, name);
		if(actual!=null)
			throw new SyntaxError("Duplicate argument: \"" + name + "\"");
		if(attributes!=null) {
			ConcreteCategoryDeclaration declaration = 
					new ConcreteCategoryDeclaration(name, attributes,
							new IdentifierList(type.getId()), null);
			context.registerDeclaration(declaration);
		}
		context.registerValue(this);
		if(defaultExpression!=null) try {
			context.setValue(name, defaultExpression.interpret(context));
		} catch(PromptoError error) {
			throw new SyntaxError("Unable to register default value: "+ defaultExpression.toString() + " for argument: " + name);
		}
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
		type.checkExists(context);
		if(attributes!=null) for(Identifier attribute : attributes) {
			AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class, attribute);
			if(actual==null)
				throw new SyntaxError("Unknown attribute: \"" + attribute + "\"");
		}
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		if(attributes==null)
			return type;
		else
			return context.getRegisteredDeclaration(IDeclaration.class, name).getType(context);
	}

}
