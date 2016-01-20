package prompto.grammar;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class UnresolvedArgument extends BaseArgument implements INamedArgument {

	INamedArgument resolved = null;
	
	public UnresolvedArgument(Identifier id) {
		super(id);
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return getIdentifier().toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
		resolveAndCheck(context);
	}
	
	@Override
	public String getProto() {
		return id.getName();
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
	public IValue checkValue(Context context, IExpression value) throws PromptoError {
		resolveAndCheck(context);
		return resolved.checkValue(context, value);
	}
	
	private void resolveAndCheck(Context context) throws SyntaxError {
		if(resolved!=null) 
			return;
		IDeclaration named = context.getRegisteredDeclaration(IDeclaration.class, id);
		if(named instanceof AttributeDeclaration)
			resolved = new AttributeArgument(id);
		else if(named instanceof MethodDeclarationMap)
			resolved = new MethodArgument(id);
		else
			throw new SyntaxError("Unknown identifier: " + id);
	}


}
