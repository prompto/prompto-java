package prompto.problem;

import prompto.parser.ICodeSection;
import prompto.parser.ISection;


public abstract class SyntaxProblemBase implements IProblem {
	
	ISection section;
	int hashCode = -1;
	
	public SyntaxProblemBase(ICodeSection codeSection) {
		this(codeSection.getSection());
	}

	public SyntaxProblemBase(ISection section) {
		this.section = section;
	}

	@Override
	public String getPath() {
		return section.getPath();
	}
	
	@Override
	public int getStartIndex() {
		return section.getStart().getTokenIndex();
	}
	
	@Override
	public int getStartLine() {
		return section.getStart().getLine();
	}
	
	@Override
	public int getStartColumn() {
		return section.getStart().getColumn();
	}

	@Override
	public int getEndIndex() {
		return section.getEnd().getTokenIndex();
	}

	@Override
	public int getEndLine() {
		return section.getEnd().getLine();
	}
	
	@Override
	public int getEndColumn() {
		return section.getEnd().getColumn();
	}


	@Override
	public int hashCode() {
		if(hashCode==-1)
			hashCode = (String.valueOf(getStartIndex()) + "/" + getMessage()).hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof SyntaxProblemBase))
			return false;
		SyntaxProblemBase other = (SyntaxProblemBase)obj;
		return this.getStartIndex()==other.getStartIndex()
				&& this.getMessage().equals(other.getMessage());
	}
	
	@Override
	public String toString() {
		return "{ startIndex:" + getStartIndex() + ", message:" + getMessage() + " }";
	}


}
