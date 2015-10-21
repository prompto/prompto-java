package prompto.declaration;

import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.store.ICodeStore;

public abstract class BaseDeclaration extends Section implements IDeclaration {

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
	
}
