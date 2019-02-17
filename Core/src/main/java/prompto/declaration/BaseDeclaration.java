package prompto.declaration;

import java.util.Collection;

import prompto.code.ICodeStore;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.statement.CommentStatement;

public abstract class BaseDeclaration extends Section implements IDeclaration {

	Collection<CommentStatement> comments = null;
	Collection<Annotation> annotations = null;
	Identifier id;
	ICodeStore origin;
	boolean declaring = false;
	
	protected BaseDeclaration(Identifier id) {
		this.id = id;
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
	public int hashCode() {
		return getId().hashCode();
	}
	
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
	public Collection<Annotation> getAnnotations() {
		return annotations;
	}
	
	@Override
	public boolean hasLocalAnnotation(String name) {
		if(annotations==null)
			return false;
		else {
			String prefixed = name.startsWith("@") ? name : "@" + name;
			return annotations.stream().anyMatch(a->a.isNamed(prefixed));
		}
	}
	
	@Override
	public boolean hasInheritedAnnotation(Context context, String name) {
		return false;
	}
	
	@Override
	public int getStartLine() {
		if(comments!=null && !comments.isEmpty())
			return comments.iterator().next().getStart().getLine();
		else if(annotations!=null && !annotations.isEmpty())
			return annotations.iterator().next().getStart().getLine();
		else
			return this.getStart().getLine();
	}
	
}
