package presto.value;

import presto.declaration.IMethodDeclaration;
import presto.error.PrestoError;
import presto.grammar.ArgumentList;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.MethodType;

public class ClosureValue extends BaseValue {
	
	IMethodDeclaration method;
	
	public ClosureValue(Context context, IMethodDeclaration method) {
		super(new MethodType(context, method.getIdentifier()));
		this.method = method;
	}
	
	public IMethodDeclaration getMethodDeclaration() {
		return method;
	}
	
	public IValue interpret(Context context) throws PrestoError {
		Context thisContext = ((MethodType)type).getContext();
		Context parentMost = thisContext.getParentMostContext();
		parentMost.setParentContext(context);
		IValue result = method.interpret(thisContext);
		parentMost.setParentContext(null);
		return result;
	}

	public Identifier getName() {
		return method.getIdentifier();
	}

	public ArgumentList getArguments() {
		return method.getArguments();
	}

	public IType getReturnType() {
		return method.getReturnType();
	}

}
