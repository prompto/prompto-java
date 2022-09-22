package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.declaration.TestMethodDeclaration;
import prompto.parser.Dialect;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public interface IAssertion extends IExpression, ICodeSection {

	default Context checkAssert(Context context) {
		IType type = check(context);
		if(type != BooleanType.instance())
			context.getProblemListener().reportIllegalAssignment(this, BooleanType.instance(), type);
		return context;
	}
	boolean interpretAssert(Context context, TestMethodDeclaration testMethodDeclaration);
	void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test);
	void transpileFound(Transpiler transpiler, Dialect dialect);
	default String getExpected(Context context, Dialect dialect, int escapeMode) {
		CodeWriter writer = new CodeWriter(dialect, context, escapeMode);
		this.toDialect(writer);
		return writer.toString();
	}

}
