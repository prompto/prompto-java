package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.TypeValue;

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
	public IValue interpret(Context context) throws PromptoError {
		return new TypeValue(type);
	}

	public IValue getMember(Context context, Identifier name) throws PromptoError {
		return type.getMember(context, name);
	}

	public IType getType() {
		return type;
	}
}
