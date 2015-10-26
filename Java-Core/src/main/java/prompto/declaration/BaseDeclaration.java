package prompto.declaration;

import java.util.Collection;

import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.statement.CommentStatement;
import prompto.store.ICodeStore;

public abstract class BaseDeclaration extends Section implements IDeclaration {

	Collection<CommentStatement> comments = null;
	private Identifier id;
	private ICodeStore origin;
	
	protected BaseDeclaration(Identifier id) {
		this.id = id;
	}
		
	@Override
	public Identifier getIdentifier() {
		return id;
	}
	
	public void setOrigin(ICodeStore origin) {
		this.origin = origin;
	}
	
	public ICodeStore getOrigin() {
		return origin;
	}
	
	public String getName() {
		return id.getName();
	}
	
	@Override
	public int hashCode() {
		return getIdentifier().hashCode();
	}
	
	public Collection<CommentStatement> getComments() {
		return comments;
	}
	
	@Override
	public void setComments(Collection<CommentStatement> stmts) {
		this.comments = stmts;
	}
	
}
