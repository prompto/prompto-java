package prompto.declaration;

import java.util.Collection;

import prompto.code.ICodeStore;
import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.statement.CommentStatement;

public abstract class BaseDeclaration extends Section implements IDeclaration {

	Collection<CommentStatement> comments = null;
	private Identifier id;
	private ICodeStore origin;
	
	protected BaseDeclaration(Identifier id) {
		this.id = id;
	}
		
	@Override
	public Identifier getId() {
		return id;
	}
	
	public void setOrigin(ICodeStore origin) {
		this.origin = origin;
	}
	
	public ICodeStore getOrigin() {
		return origin;
	}
	
	public String getName() {
		return id.toString();
	}
	
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	
	public Collection<CommentStatement> getComments() {
		return comments;
	}
	
	@Override
	public void setComments(Collection<CommentStatement> stmts) {
		this.comments = stmts;
	}
	
}