package presto.declaration;

import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.parser.ISection;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;

public interface IDeclaration extends INamed, ISection {
	
	void register(Context context) throws SyntaxError;
	IType check(Context context) throws SyntaxError;
	void toDialect(CodeWriter writer);
	
}
