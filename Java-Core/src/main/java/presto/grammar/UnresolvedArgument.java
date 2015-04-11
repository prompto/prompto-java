package presto.grammar;

import presto.declaration.AttributeDeclaration;
import presto.declaration.IDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.runtime.Context.MethodDeclarationMap;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class UnresolvedArgument extends BaseArgument implements INamedArgument {

	INamedArgument resolved = null;
	
	public UnresolvedArgument(Identifier name) {
		super(name);
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return getName().toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(name);
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	@Override
	public String toString() {
		return name.toString();
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
		resolveAndCheck(context);
	}
	
	@Override
	public String getProto(Context context) throws SyntaxError {
		resolveAndCheck(context);
		return resolved.getProto(context);
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		resolveAndCheck(context);
		return resolved.getType(context);
	}
	
	@Override
	public void register(Context context) throws SyntaxError {
		resolveAndCheck(context);
		resolved.register(context);
	}
	
	@Override
	public IValue checkValue(Context context, IExpression value) throws PrestoError {
		resolveAndCheck(context);
		return resolved.checkValue(context, value);
	}
	
	private void resolveAndCheck(Context context) throws SyntaxError {
		if(resolved!=null) 
			return;
		IDeclaration named = context.getRegisteredDeclaration(IDeclaration.class, name);
		if(named instanceof AttributeDeclaration)
			resolved = new AttributeArgument(name);
		else if(named instanceof MethodDeclarationMap)
			resolved = new MethodArgument(name);
		else
			throw new SyntaxError("Unknown identifier:" + name);
	}


}
