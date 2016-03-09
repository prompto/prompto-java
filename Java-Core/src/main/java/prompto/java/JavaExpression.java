package prompto.java;

import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public interface JavaExpression extends ISection {
	
	IType check(Context context) throws SyntaxError;
	Object interpret(Context context) throws PromptoError;
	void toDialect(CodeWriter writer);
	
	default ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		System.err.println("Need to implement compile for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}
	
}
