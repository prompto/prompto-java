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
	
	public void mergeCodeSection(ISection section) {
		if(section==null)
			return;
		else if(this.section==null)
			this.section = section;
		else
			this.section = this.section.merge(section);
	}


}
