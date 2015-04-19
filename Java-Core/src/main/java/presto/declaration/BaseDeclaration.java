package presto.declaration;

import presto.grammar.Identifier;
import presto.parser.Section;

public abstract class BaseDeclaration extends Section implements IDeclaration {

	private Identifier name;
	
	protected BaseDeclaration(Identifier name) {
		this.name = name;
	}
		
	@Override
	public Identifier getIdentifier() {
		return name;
	}
	
	public String getName() {
		return name.getName();
	}
	
	
}
