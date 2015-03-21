package presto.value;

import presto.declaration.IMethodDeclaration;
import presto.error.PrestoError;
import presto.grammar.ArgumentList;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.MethodType;

public class ClosureValue extends BaseValue {
	
	IMethodDeclaration method;
	
	public ClosureValue(Context context, IMethodDeclaration method) {
		super(new MethodType(context, method.getName()));
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

	public String getName() {
		return method.getName();
	}

	public ArgumentList getArguments() {
		return method.getArguments();
	}

	public IType getReturnType() {
		return method.getReturnType();
	}

}
