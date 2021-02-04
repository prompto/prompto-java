package prompto.debug.stack;

import java.util.Collection;
import java.util.stream.Collectors;

import prompto.debug.variable.IVariable;
import prompto.debug.variable.WorkerVariable;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.NativeMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.grammar.INamed;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.statement.IStatement;

public class WorkerStackFrame extends LeanStackFrame {
	
	Context context;
	
	public WorkerStackFrame(Context context, String categoryName, String methodName, String methodProto, int index, IDeclaration method) {
		this(context, categoryName, methodName, methodProto, method.computeStartLine(), index, (ISection)method);
		if(method instanceof ConcreteMethodDeclaration) {
			IStatement stmt = ((ConcreteMethodDeclaration)method).getStatements().getFirst();
			this.endCharIndex = stmt.getStart().getTokenIndex() - 1;
		} else if(method instanceof NativeMethodDeclaration) {
			IStatement stmt = ((NativeMethodDeclaration)method).getStatements().getFirst();
			this.endCharIndex = stmt.getStart().getTokenIndex() - 1;
		} else if(method instanceof TestMethodDeclaration) {
			IStatement stmt = ((TestMethodDeclaration)method).getStatements().getFirst();
			this.endCharIndex = stmt.getStart().getTokenIndex() - 1;
		} else
			this.endCharIndex = this.startCharIndex + 1;
	}

	public WorkerStackFrame(Context context, String categoryName, String methodName, String methodProto, int methodLine, int index, ISection section) {
		this.context = context;
		this.filePath = section.getPath();
			this.categoryName = categoryName;
		this.methodName = methodName;
		this.methodProto = methodProto;
		this.methodLine = methodLine;
		this.statementLine = section.computeStartLine();
		this.index = index;
		this.startCharIndex = section.computeStartTokenIndex();
		this.endCharIndex = section.computeEndTokenIndex();
	}
	
	@Override
	public Collection<WorkerVariable> getVariables() {
		return context.getInstancesStream(true)
				.map((n)->new WorkerVariable(context, n))
				.collect(Collectors.toList());
	}

	public IVariable getVariable(String variableName) {
		INamed named = context.getInstance(variableName, true);
		return named==null ? null : new WorkerVariable(context, named);
	}

}
