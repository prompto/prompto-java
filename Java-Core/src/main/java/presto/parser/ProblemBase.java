package presto.parser;


public abstract class ProblemBase implements IProblem {
	
	int line;
	int column;
	int hashCode = -1;
	
	public ProblemBase(int line, int column) {
		this.line = line;
		this.column = column;
	}

	@Override
	public int getStartLine() {
		return line;
	}
	
	@Override
	public int getStartColumn() {
		return column;
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
		if(!(obj instanceof ProblemBase))
			return false;
		ProblemBase other = (ProblemBase)obj;
		return this.getStartIndex()==other.getStartIndex()
				&& this.getMessage().equals(other.getMessage());
	}
	
	@Override
	public String toString() {
		return "{ startIndex:" + getStartIndex() + ", message:" + getMessage() + " }";
	}


}
