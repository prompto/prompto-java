package presto.declaration;

import presto.error.PrestoError;
import presto.runtime.Context;
import presto.value.IValue;
import presto.value.ClosureValue;

/* a dummy declaration to interpret closures in context */
public class ClosureDeclaration extends AbstractMethodDeclaration {

	ClosureValue closure;
	
	public ClosureDeclaration(ClosureValue closure) {
		super(closure.getName(),closure.getArguments(),closure.getReturnType());
		this.closure = closure;
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return closure.interpret(context);
	}

}
