package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;
import presto.value.TypeValue;

public class TypeExpression implements IExpression {

	IType type;
	
	public TypeExpression(IType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		type.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return this.type;
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return new TypeValue(type);
	}

	public IValue getMember(Context context, Identifier name) throws PrestoError {
		return type.getMember(context, name);
	}

	public IType getType() {
		return type;
	}
}
