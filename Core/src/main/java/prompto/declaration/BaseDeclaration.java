package prompto.declaration;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prompto.code.ICodeStore;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.statement.CommentStatement;
import prompto.utils.CodeWriter;

public abstract class BaseDeclaration extends CodeSection implements IDeclaration {

	Collection<CommentStatement> comments = null;
	Collection<Annotation> annotations = null;
	Identifier id;
	ICodeStore origin;
	boolean declaring = false;
	
	protected BaseDeclaration(Identifier id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof IDeclaration && getId().equals(((IDeclaration)obj).getId());
	}
	
	@Override
	public Identifier getId() {
		return id;
	}
	
	@Override
	public String toString() { 
		return getId().toString(); 
	}
	
	@Override
	public void setOrigin(ICodeStore origin) {
		this.origin = origin;
	}
	
	@Override
	public ICodeStore getOrigin() {
		return origin;
	}
	
	@Override
	public String getName() {
		return id.toString();
	}
	
	@Override
	public final void toDialect(CodeWriter writer) {
		if(getComments()!=null)
			getComments().forEach(comment->comment.toDialect(writer));
		if(getLocalAnnotations()!=null)
			getLocalAnnotations().forEach(annotation->annotation.toDialect(writer));
		declarationToDialect(writer);
	}
	
	protected abstract void declarationToDialect(CodeWriter writer);

	@Override
	public Collection<CommentStatement> getComments() {
		return comments;
	}
	
	@Override
	public void setComments(Collection<CommentStatement> comments) {
		this.comments = comments;
	}
	
	@Override
	public void setAnnotations(Collection<Annotation> annotations) {
		this.annotations = annotations;
	}
	
	@Override
	public void addAnnotation(Annotation annotation) {
		if(annotations==null)
			annotations = Collections.singletonList(annotation);
		else
			annotations = Stream.concat(annotations.stream(), Stream.of(annotation)).collect(Collectors.toList());
		
	}
	
	@Override
	public boolean removeAnnotation(String name) {
		String prefixed = name.startsWith("@") ? name : "@" + name;
		if(annotations==null || !annotations.stream().map(Annotation::toString).anyMatch(a->a.equals(prefixed)))
			return false;
		annotations = annotations.stream().filter(a->!a.toString().equals(prefixed)).collect(Collectors.toList());
		return true;
	}
	
	@Override
	public Collection<Annotation> getLocalAnnotations() {
		return annotations;
	}
	
	
	@Override
	public Collection<Annotation> getAllAnnotations(Context context) {
		return annotations;
	}
	
	@Override
	public Stream<Annotation> getAllAnnotationsAsStream(Context context) {
		return annotations==null ? Stream.empty() : annotations.stream();
	}
	
	@Override
	public boolean hasLocalAnnotation(String name) {
		if(annotations==null)
			return false;
		else {
			String prefixed = name.startsWith("@") ? name : "@" + name;
			return annotations.stream().map(Annotation::toString).anyMatch(a->a.equals(prefixed));
		}
	}
	
	@Override
	public boolean hasAnyLocalAnnotation(Set<String> names) {
		if(annotations==null)
			return false;
		else 
			// assumption is that names is already cured
			return annotations.stream().anyMatch(a->names.contains(a.toString()));
	}
	
	@Override
	public boolean hasInheritedAnnotation(Context context, String name) {
		return false;
	}
	
	/* 
	 * TODO
	 */
	
	@Override
	public int computeStartLine() {
		if(comments!=null && !comments.isEmpty())
			return comments.iterator().next().getSection().getStartLocation().getLine();
		else if(annotations!=null && !annotations.isEmpty())
			return annotations.iterator().next().getSection().getStartLocation().getLine();
		else 
			return super.computeStartLine();
	}
	
}
