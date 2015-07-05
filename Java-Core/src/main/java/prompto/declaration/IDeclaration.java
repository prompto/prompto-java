package prompto.declaration;

import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public interface IDeclaration extends INamed, ISection {
	
	void register(Context context) throws SyntaxError;
	IType check(Context context) throws SyntaxError;
	void toDialect(CodeWriter writer);
	
}
