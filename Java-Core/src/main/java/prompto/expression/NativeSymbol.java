package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.EnumeratedNativeType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

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
		return this.getId().equals(other.getId())
				&& this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public EnumeratedNativeType check(Context context) {
		IType actual = expression.check(context);
		EnumeratedNativeType type = (EnumeratedNativeType)this.getType(context);
		if(!actual.isAssignableTo(context, type.getDerivedFrom()))
			throw new SyntaxError("Cannot assign " + actual.getTypeName() + " to " + type.getDerivedFrom().getTypeName());
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return expression.interpret(context);
	}
	
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return expression.compile(context, method, flags);
	}
	
}
