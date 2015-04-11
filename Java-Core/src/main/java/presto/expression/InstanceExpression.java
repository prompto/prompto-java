package presto.expression;

import presto.declaration.AttributeDeclaration;
import presto.declaration.CategoryDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.IArgument;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.parser.Dialect;
import presto.runtime.Attribute;
import presto.runtime.Context;
import presto.runtime.Context.MethodDeclarationMap;
import presto.runtime.LinkedVariable;
import presto.runtime.Variable;
import presto.type.IType;
import presto.type.MethodType;
import presto.utils.CodeWriter;
import presto.value.IValue;

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
		else if(named instanceof Attribute) // instance member
			return named.getType(context);
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
	public IValue interpret(Context context) throws PrestoError {
		return context.getValue(name);
	}

}
