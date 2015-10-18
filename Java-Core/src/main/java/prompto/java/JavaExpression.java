package prompto.java;


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
	
}
