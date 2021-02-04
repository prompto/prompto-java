package prompto.parser;

public class CodeSection implements ICodeSection {

	ISection section;
	
	@Override
	public ISection getSection() {
		return section;
	}

	@Override
	public void setSection(ISection section) {
		this.section = section;
	}

}
