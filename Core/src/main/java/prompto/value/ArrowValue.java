package prompto.value;

import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.ArrowExpression;
import prompto.runtime.Context;

public class ArrowValue extends ContextualExpression {

	IMethodDeclaration method;
	
	public ArrowValue(IMethodDeclaration method, Context calling, ArrowExpression expression) {
		super(calling, expression);
		this.method = method;
	}
	
	public IMethodDeclaration getMethod() {
		return method;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Context parent = context.getParentContext();
		try {
			context.setParentContext(calling);
			return expression.interpret(context);
		} finally {
			context.setParentContext(parent);
		}
	}

}
