package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.grammar.Symbol;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

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
	public IValue interpret(Context context) throws PrestoError {
		Symbol symbol = context.<Symbol>getRegisteredValue(Symbol.class, name);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + name);
		return symbol.interpret(context);			
	}

}
