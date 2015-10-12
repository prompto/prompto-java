package prompto.declaration;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.IAttributeConstraint;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class AttributeDeclaration extends BaseDeclaration {
	
	IType type;
	IAttributeConstraint constraint;
	boolean storable = false;
	
	public AttributeDeclaration(Identifier name, IType type, IAttributeConstraint constraint) {
		super(name);
		this.type = type;
		this.constraint = constraint;
	}
	
	public IType getType() {
		return type;
	}
	
	public IAttributeConstraint getConstraint() {
		return constraint;
	}
	
	public void setStorable(boolean storable) {
		this.storable = storable;
	}
	
	public boolean isStorable() {
		return storable;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("define ");
			writer.append(getIdentifier());
			writer.append(" as ");
			type.toDialect(writer);
			writer.append(" attribute");
			if(constraint!=null)
				constraint.toDialect(writer);
			break;
		case O:
			writer.append("attribute ");
			writer.append(getIdentifier());
			writer.append(" : ");
			type.toDialect(writer);
			if(constraint!=null)
				constraint.toDialect(writer);
			writer.append(';');
			break;
		case S:
			writer.append("attr ");
			writer.append(getIdentifier());
			writer.append(" ( ");
			type.toDialect(writer);
			writer.append(" ):\n");
			writer.indent();
			if(constraint!=null)
				constraint.toDialect(writer);
			else
				writer.append("pass");
			writer.dedent();
			break;
		}
	}
	
	@Override
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		type.checkExists(context);
		return type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}

	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		IValue value = expression.interpret(context);
		if(constraint==null)
			return value;
		constraint.checkValue(context, value);
		return value;
	}


}
