package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.MethodType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class MethodExpression implements IExpression {

	Identifier name;
	
	public MethodExpression(Identifier name) {
		this.name = name;
	}

	public Identifier getName() {
		return name;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.E)
			writer.append("Method: ");
		writer.append(name);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		INamed named = context.getRegistered(name);
		if(named instanceof Context.MethodDeclarationMap)
			return new MethodType(context, name);
		else
			throw new SyntaxError("No method with name:" + name);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return context.getValue(name);
	}
	
}
