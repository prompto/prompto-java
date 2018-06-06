package prompto.declaration;

import java.util.Collection;

import prompto.code.ICodeStore;
import prompto.grammar.INamed;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.statement.CommentStatement;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public interface IDeclaration extends INamed, ISection {
	
	public static enum DeclarationType {
		ATTRIBUTE,
		CATEGORY,
		METHOD,
		ENUMERATED, 
		TEST;
	}
	
	void register(Context context);
	IType check(Context context, boolean isStart);
	void toDialect(CodeWriter writer);
	void setOrigin(ICodeStore origin);
	ICodeStore getOrigin();
	DeclarationType getDeclarationType();
	void setComments(Collection<CommentStatement> comments);
	Collection<CommentStatement> getComments();
	default void setClosureOf(IMethodDeclaration declaration) { throw new UnsupportedOperationException(); }
	default IMethodDeclaration getClosureOf() { throw new UnsupportedOperationException(); }
	default boolean isStorable() { return false; }
	default void declare(Transpiler transpiler) { throw new UnsupportedOperationException("declare " + this.getClass().getName()); }
	default boolean transpile(Transpiler transpiler) { throw new UnsupportedOperationException("transpile " + this.getClass().getName()); }
}
