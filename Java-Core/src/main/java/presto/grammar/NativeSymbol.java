package presto.grammar;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.EnumeratedNativeType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class NativeSymbol extends Symbol implements IExpression {
	
	IExpression expression;
	
	public NativeSymbol(Identifier name, IExpression expression) {
		super(name);
		this.expression = expression;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(symbol);
		switch(writer.getDialect()) {
		case E:
			writer.append(" with ");
			expression.toDialect(writer);
			writer.append(" as value");
			break;
		case O:
			writer.append(" = ");
			expression.toDialect(writer);
			break;
		case S:
			writer.append(" = ");
			expression.toDialect(writer);
			break;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof NativeSymbol))
			return false;
		NativeSymbol other = (NativeSymbol)obj;
		return this.getIdentifier().equals(other.getIdentifier())
				&& this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public EnumeratedNativeType check(Context context) throws SyntaxError {
		IType actual = expression.check(context);
		EnumeratedNativeType type = (EnumeratedNativeType)this.getType(context);
		if(!actual.isAssignableTo(context, type.getDerivedFrom()))
			throw new SyntaxError("Cannot assign " + actual.getName() + " to " + type.getDerivedFrom().getName());
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return expression.interpret(context);
	}

}
