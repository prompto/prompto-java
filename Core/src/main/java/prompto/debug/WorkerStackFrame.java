package prompto.debug;

import java.util.Collection;
import java.util.stream.Collectors;

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
		this(context, categoryName, methodName, methodProto, method.getStartLine(), index, (ISection)method);
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
		this.statementLine = section.getStartLine();
		this.index = index;
		this.startCharIndex = section.getStartTokenIndex();
		this.endCharIndex = section.getEndTokenIndex();
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
