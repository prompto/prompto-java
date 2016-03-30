package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

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
	public IType check(Context context) {
		INamed named = context.getRegistered(name);
		if(named instanceof Context.MethodDeclarationMap)
			return new MethodType(context, name);
		else
			throw new SyntaxError("No method with name:" + name);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return context.getValue(name);
	}
	
}
