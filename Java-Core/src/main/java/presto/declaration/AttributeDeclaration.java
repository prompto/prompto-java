package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.IAttributeConstraint;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class AttributeDeclaration extends BaseDeclaration {
	
	IType type;
	IAttributeConstraint constraint;
	
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
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("define ");
			writer.append(getName());
			writer.append(" as: ");
			type.toDialect(writer);
			writer.append(" attribute");
			if(constraint!=null)
				constraint.toDialect(writer);
			break;
		case O:
			writer.append("attribute ");
			writer.append(getName());
			writer.append(" : ");
			type.toDialect(writer);
			if(constraint!=null)
				constraint.toDialect(writer);
			writer.append(';');
			break;
		case S:
			writer.append("attr ");
			writer.append(getName());
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

	public IValue checkValue(Context context, IExpression expression) throws PrestoError {
		IValue value = expression.interpret(context);
		if(constraint==null)
			return value;
		constraint.checkValue(context, value);
		return value;
	}
}
