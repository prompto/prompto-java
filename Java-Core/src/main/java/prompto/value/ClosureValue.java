package prompto.value;

import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;

public class ClosureValue extends BaseValue {
	
	IMethodDeclaration method;
	
	public ClosureValue(Context context, IMethodDeclaration method) {
		super(new MethodType(context, method.getId()));
		this.method = method;
	}
	
	public IMethodDeclaration getMethodDeclaration() {
		return method;
	}
	
	public IValue interpret(Context context) throws PromptoError {
		Context thisContext = ((MethodType)type).getContext();
		Context parentMost = thisContext.getParentMostContext();
		parentMost.setParentContext(context);
		IValue result = method.interpret(thisContext);
		parentMost.setParentContext(null);
		return result;
	}

	public Identifier getName() {
		return method.getId();
	}

	public ArgumentList getArguments() {
		return method.getArguments();
	}

	public IType getReturnType() {
		return method.getReturnType();
	}

}
