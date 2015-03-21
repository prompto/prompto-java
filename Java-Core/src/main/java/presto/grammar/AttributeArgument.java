package presto.grammar;

import presto.declaration.AttributeDeclaration;
import presto.declaration.IDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.utils.Utils;
import presto.value.IValue;

public class AttributeArgument extends BaseArgument implements INamedArgument {
	
	public AttributeArgument(String name) {
		super(name);
	}

	@Override
	public String getSignature(Dialect dialect) {
		return getName();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(getName());
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public String getProto(Context context) {
		return getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof AttributeArgument))
			return false;
		AttributeArgument other = (AttributeArgument)obj;
		return Utils.equal(this.getName(),other.getName());
	}

	@Override
	public void register(Context context) throws SyntaxError {
		context.registerValue(this, true);
		if(defaultExpression!=null) try {
			context.setValue(name, defaultExpression.interpret(context));
		} catch(PrestoError error) {
			throw new SyntaxError("Unable to register default value: "+ defaultExpression.toString() + " for argument: " + name);
		}
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
		AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class,name);
		if(actual==null)
			throw new SyntaxError("Unknown attribute: \"" + name + "\"");
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		IDeclaration named = context.getRegisteredDeclaration(IDeclaration.class,name);
		return named.getType(context);
	}
	
	@Override
	public IValue checkValue(Context context, IExpression expression) throws PrestoError {
		AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class,name);
		return actual.checkValue(context, expression);
	}
	
}
