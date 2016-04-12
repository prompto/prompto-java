package prompto.value;

import prompto.error.PromptoError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;

public class ClosureValue extends BaseValue {
	
	Context context;
	MethodType type;
	
	public ClosureValue(Context context, MethodType type) {
		super(type);
		this.context = context;
		this.type = type;
	}
	
	public IValue interpret(Context context) throws PromptoError {
		Context parentMost = this.context.getParentMostContext();
		parentMost.setParentContext(context);
		IValue result = type.getMethod().interpret(this.context);
		parentMost.setParentContext(null);
		return result;
	}

	public Identifier getName() {
		return type.getMethod().getId();
	}

	public ArgumentList getArguments() {
		return type.getMethod().getArguments();
	}

	public IType getReturnType() {
		return type.getMethod().getReturnType();
	}

}
