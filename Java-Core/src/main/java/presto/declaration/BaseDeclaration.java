package presto.declaration;

import presto.parser.Section;

public abstract class BaseDeclaration extends Section implements IDeclaration {

	String name;
	
	protected BaseDeclaration(String name) {
		this.name = name;
	}
		
	@Override
	public String getName() {
		return name;
	}
	
	
}
