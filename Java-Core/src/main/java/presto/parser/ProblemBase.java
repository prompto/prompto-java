package presto.parser;

import org.antlr.v4.runtime.RecognitionException;

public abstract class ProblemBase implements IProblem {
	
	int line;
	int column;
	int hashCode = -1;
	RecognitionException e;
	
	public ProblemBase(int line, int column, RecognitionException e) {
		this.line = line;
		this.column = column;
		this.e = e;
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
