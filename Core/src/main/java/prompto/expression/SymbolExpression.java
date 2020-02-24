package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class SymbolExpression implements IExpression {

	Identifier id;
	Symbol symbol;
	
	public SymbolExpression(Identifier id) {
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.toString();
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
	}
	
	public Symbol getSymbol(Context context) {
		if(symbol==null) 
			symbol = context.getGlobalsContext().getRegisteredSymbol(id, true);
		return symbol;
	}
	
	@Override
	public IType check(Context context) {
		Symbol symbol = getSymbol(context);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + id);
		return symbol.check(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Symbol symbol = getSymbol(context);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + id);
		return symbol.interpret(context);	
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		Symbol symbol = getSymbol(context);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + id);
		return symbol.compile(context, method, flags);			
	}

	public Type getJavaType(Context context) {
		Symbol symbol = getSymbol(context);
		if(symbol==null)
			throw new SyntaxError("Unknown symbol:" + id);
		return symbol.getJavaType(context);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		Symbol symbol = getSymbol(transpiler.getContext());
	    symbol.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		Symbol symbol = getSymbol(transpiler.getContext());
	    return symbol.transpile(transpiler);
	}

}
