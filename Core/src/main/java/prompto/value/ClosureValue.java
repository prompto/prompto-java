package prompto.value;

import java.lang.reflect.Type;

import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.ParameterList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;

public class ClosureValue extends BaseValue {
	
	Context context;
	
	public ClosureValue(Context context, MethodType type) {
		super(type);
		this.context = context;
	}
	
	@Override
	public Object convertTo(Context context, Type type) {
		if(type==IMethodDeclaration.class)
			return getMethod();
		else
			return super.convertTo(context, type);
	}
	
	public IMethodDeclaration getMethod() {
		return ((MethodType)type).getMethod();
	}
	
	public IValue interpret(Context context) throws PromptoError {
		Context parentMost = this.context.getParentMostContext();
		Context savedParent = parentMost.getParentContext();
		parentMost.setParentContext(context);
		Context local = this.context.newChildContext();
		try {
			return doInterpret(local);
		} finally {
			parentMost.setParentContext(savedParent);
		}
	}
	
	
	
	private IValue doInterpret(Context local) {
		IMethodDeclaration declaration = getMethod();
		local.enterMethod(declaration);
		try {
			return declaration.interpret(local);
		} finally {
			local.leaveSection(declaration);
		}
	}

	public Identifier getName() {
		return getMethod().getId();
	}

	public ParameterList getArguments() {
		return getMethod().getParameters();
	}

	public IType getReturnType() {
		return getMethod().getReturnType();
	}

}
