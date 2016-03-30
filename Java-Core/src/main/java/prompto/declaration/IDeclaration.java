package prompto.declaration;

import java.util.Collection;

import prompto.code.ICodeStore;
import prompto.grammar.INamed;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.statement.CommentStatement;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public interface IDeclaration extends INamed, ISection {
	
	public static enum Type {
		ATTRIBUTE,
		CATEGORY,
		METHOD,
		ENUM, 
		TEST;
	}
	
	void register(Context context);
	IType check(Context context);
	void toDialect(CodeWriter writer);
	void setOrigin(ICodeStore origin);
	ICodeStore getOrigin();
	Type getDeclarationType();
	void setComments(Collection<CommentStatement> comments);
	Collection<CommentStatement> getComments();
	
}
