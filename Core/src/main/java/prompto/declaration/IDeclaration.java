package prompto.declaration;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

import prompto.code.ICodeStore;
import prompto.grammar.Annotation;
import prompto.grammar.INamed;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.statement.CommentStatement;
import prompto.transpiler.ITranspilable;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public interface IDeclaration extends ITranspilable, INamed, ICodeSection {
	
	public static enum DeclarationType {
		ATTRIBUTE,
		CATEGORY,
		METHOD,
		ENUMERATED, 
		TEST;
	}
	
	void register(Context context);
	IType check(Context context);
	void toDialect(CodeWriter writer);
	void setOrigin(ICodeStore origin);
	ICodeStore getOrigin();
	DeclarationType getDeclarationType();
	void setComments(Collection<CommentStatement> comments);
	Collection<CommentStatement> getComments();
	void setAnnotations(Collection<Annotation> annotations);
	void addAnnotation(Annotation annotation);
	Collection<Annotation> getLocalAnnotations();
	Collection<Annotation> getAllAnnotations(Context context);
	Stream<Annotation> getAllAnnotationsAsStream(Context context);
	default boolean hasAnnotation(Context context, String name) {
		return hasLocalAnnotation(name) || hasInheritedAnnotation(context, name);
	}
	boolean hasLocalAnnotation(String name);
	boolean hasAnyLocalAnnotation(Set<String> names);
	boolean hasInheritedAnnotation(Context context, String name);
	boolean removeAnnotation(String name);
	default void setClosureOf(IDeclaration declaration) { throw new UnsupportedOperationException(); }
	default IDeclaration getClosureOf() { throw new UnsupportedOperationException(); }
	default boolean isStorable(Context context) { return false; }
	default String getTranspiledName(Context context) { throw new UnsupportedOperationException("getTranspiledName " + this.getClass().getName()); }
	default void declare(Transpiler transpiler) { throw new UnsupportedOperationException("declare " + this.getClass().getName()); }
	default void declareChild(Transpiler transpiler) { throw new UnsupportedOperationException("declareChild " + this.getClass().getName()); }
	@Override
	default boolean transpile(Transpiler transpiler) { throw new UnsupportedOperationException("transpile " + this.getClass().getName()); }
	default ISection locateSection(ISection section) {
		return isOrContains(section) ? this.getSection() : null;
	}
}
