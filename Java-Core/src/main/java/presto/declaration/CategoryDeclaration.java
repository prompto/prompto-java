package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.MethodDeclarationList;
import presto.grammar.Identifier;
import presto.parser.IProblemListener;
import presto.runtime.Context;
import presto.type.CategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.utils.IdentifierList;
import presto.value.IInstance;

public abstract class CategoryDeclaration extends BaseDeclaration {
	
	IdentifierList attributes;
	
	public CategoryDeclaration(Identifier name) {
		super(name);
	}

	public CategoryDeclaration(Identifier name, IdentifierList attributes) {
		super(name);
		this.attributes = attributes;
	}

	public void setAttributes(IdentifierList attributes) {
		this.attributes = attributes;
	}
	
	public IdentifierList getAttributes() {
		return attributes;
	}
		
	@Override
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		if(attributes!=null) for(Identifier attribute : attributes) {
			AttributeDeclaration ad = context.getRegisteredDeclaration(AttributeDeclaration.class, attribute);
			if(ad==null) {
				IProblemListener pl = context.getProblemListener();
				if(pl!=null)
					pl.reportUnknownAttribute(attribute.toString(), attribute);
				else
					throw new SyntaxError("Unknown attribute: \"" + attribute + "\"");
			}
		}
		return new CategoryType(this.getIdentifier());
	}
	
	@Override
	public CategoryType getType(Context context) {
		return new CategoryType(getIdentifier());
	}

	public boolean hasAttribute(Context context, Identifier name) {
		 return attributes!=null && attributes.contains(name);
	}

	public boolean hasMethod(Context context, String key, Object object) {
		return false;
	}

	public boolean isDerivedFrom(Context context, CategoryType categoryType) {
		return false;
	}

	public IdentifierList getDerivedFrom() {
		return null;
	}

	public abstract IInstance newInstance() throws PrestoError;

	public void checkConstructorContext(Context context) throws SyntaxError {
		// nothing to do
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer = writer.newInstanceWriter(getType(writer.getContext()));
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}

	protected abstract void toEDialect(CodeWriter writer);

	protected void protoToEDialect(CodeWriter writer, boolean hasMethods, boolean hasMappings) {
		boolean hasAttributes = attributes!=null && attributes.size()>0;
		writer.append("define ");
		writer.append(getName());
		writer.append(" as: ");
		categoryTypeToEDialect(writer);
		if(hasAttributes) {
			if(attributes.size()==1)
				writer.append(" with attribute: ");
			else
				writer.append(" with attributes: ");
			attributes.toDialect(writer, true);
		}
		if(hasMethods) {
			if(hasAttributes)
				writer.append(", and methods:");
			else 
				writer.append(" with methods:");
		} else if (hasMappings) {
			if(hasAttributes)
				writer.append(", and bindings:");
			else 
				writer.append(" with bindings:");
		}
		writer.newLine();	
	}
	
	protected void methodsToEDialect(CodeWriter writer, MethodDeclarationList methods) {
		writer.indent();
		for(IDeclaration decl : methods) {
			writer.newLine();
			CodeWriter w = writer.newMemberWriter();
			decl.toDialect(w);
		}
		writer.dedent();
	}

	protected void methodsToODialect(CodeWriter writer, MethodDeclarationList methods) {
		for(IDeclaration decl : methods) {
			CodeWriter w = writer.newMemberWriter();
			decl.toDialect(w);
			w.newLine();
		}
	}



	protected abstract void categoryTypeToEDialect(CodeWriter writer);

	protected abstract void toODialect(CodeWriter writer);
	
	protected void toODialect(CodeWriter writer, boolean hasBody) {
		categoryTypeToODialect(writer);
		writer.append(" ");
		writer.append(getName());
		if(attributes!=null) {
			writer.append('(');
			attributes.toDialect(writer, true);
			writer.append(')');
		}	
		categoryExtensionToODialect(writer);
		if(hasBody) {
			writer.append(" {\n");
			writer.newLine();
			writer.indent();
			bodyToODialect(writer);
			writer.dedent();
			writer.append('}');
			writer.newLine();
		} else
			writer.append(';');
	}

	protected abstract void categoryTypeToODialect(CodeWriter writer);

	protected void categoryExtensionToODialect(CodeWriter writer) {
		// by default no extension
	}

	protected abstract void bodyToODialect(CodeWriter writer);

	protected abstract void toSDialect(CodeWriter writer);

	protected void protoToPDialect(CodeWriter writer, IdentifierList derivedFrom) {
		categoryTypeToPDialect(writer);
		writer.append(" ");
		writer.append(getName());
		writer.append("(");
		if(derivedFrom!=null) {
			derivedFrom.toDialect(writer, false);
			if(attributes!=null)
				writer.append(", ");
		}
		if(attributes!=null)
			attributes.toDialect(writer, false);
		writer.append("):\n");
		writer.newLine();
	}

	protected abstract void categoryTypeToPDialect(CodeWriter writer);
	
	




}
