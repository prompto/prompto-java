package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class SymbolExpression implements IExpression {

	Identifier name;
	
	public SymbolExpression(Identifier name) {
		this.name = name;
	}

	public Identifier getName() {
		return name;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(name);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		Symbol symbol = context.getRegisteredValue(Symbol.class, name);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + name);
		return symbol.check(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Symbol symbol = context.<Symbol>getRegisteredValue(Symbol.class, name);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + name);
		return symbol.interpret(context);			
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		Symbol symbol = context.<Symbol>getRegisteredValue(Symbol.class, name);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + name);
		return symbol.compile(context, method, flags);			
	}

}
