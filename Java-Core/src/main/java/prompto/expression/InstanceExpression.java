package prompto.expression;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.IArgument;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.LinkedVariable;
import prompto.runtime.Variable;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class InstanceExpression implements IExpression {

	Identifier name;
	
	public InstanceExpression(Identifier name) {
		this.name = name;
	}

	public Identifier getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		toDialect(writer, true);
	}
	
	public void toDialect(CodeWriter writer, boolean requireMethod) {
		if(requireMethod && requiresMethod(writer))
			writer.append("Method: ");
		writer.append(name);
	}
	
	private boolean requiresMethod(CodeWriter writer) {
		if(writer.getDialect()!=Dialect.E)
			return false;
		Object o = writer.getContext().getRegistered(name);
		if(o instanceof MethodDeclarationMap)
			return true;
		return false;
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		INamed named = context.getRegistered(name);
		if(named==null)
			throw new SyntaxError("Unknown identifier:" + name);
		else if(named instanceof Variable) // local variable
			return named.getType(context);
		else if(named instanceof LinkedVariable) // local variable
			return named.getType(context);
		else if(named instanceof IArgument) // named argument
			return named.getType(context);
		else if(named instanceof CategoryDeclaration) // any p with x
			return named.getType(context);
		else if(named instanceof AttributeDeclaration) // in category method
			return named.getType(context);
		else if(named instanceof Context.MethodDeclarationMap) // global method or closure
			return new MethodType(context, name);
		else
			throw new SyntaxError(name + "  is not an instance:" + named.getClass().getSimpleName());
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return context.getValue(name);
	}

}
