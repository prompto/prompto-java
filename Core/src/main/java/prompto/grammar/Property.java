package prompto.grammar;

import prompto.type.IType;

public class Property {
	
	String name;
	IType type;
	String help;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IType getType() {
		return type;
	}
	public void setType(IType type) {
		this.type = type;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	
	
}
