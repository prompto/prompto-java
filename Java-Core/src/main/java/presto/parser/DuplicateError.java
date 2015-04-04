package presto.parser;

public class DuplicateError extends ProblemBase {

	String name;
	ISection section;
	ISection other;
	
	public DuplicateError(String name, ISection section, ISection other) {
		super(section.getStart().getLine(), section.getStart().getColumn());
		this.name = name;
		this.section = section;
		this.other = other;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public int getStartIndex() {
		return section.getStart().getIndex();
	}
	
	@Override
	public int getEndIndex() {
		return section.getEnd().getIndex();
	}

	@Override
	public String getMessage() {
		return "Duplicate declaration: " + name + ", see: " + other.toString();
	}

}
