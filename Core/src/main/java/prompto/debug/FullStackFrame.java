package prompto.debug;

import java.util.Collection;
import java.util.stream.Collectors;

import prompto.declaration.IDeclaration;
import prompto.parser.ISection;
import prompto.runtime.Context;

public class FullStackFrame extends LeanStackFrame {
	
	Context context;
	
	public FullStackFrame(Context context, String methodName, IDeclaration method) {
		super(methodName, method);
		this.context = context;
	}

	public FullStackFrame(Context context, String methodName, ISection section) {
		super(methodName, section);
		this.context = context;
	}

	public Collection<IVariable> getVariables() {
		return context.getInstances().stream()
				.map((n)->new FullVariable(context, n))
				.collect(Collectors.toList());
	}

}
