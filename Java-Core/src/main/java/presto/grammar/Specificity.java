package presto.grammar;

public enum Specificity {
	INCOMPATIBLE,
	RESOLVED,
	INHERITED,
	EXACT;
	
	public boolean greaterThan(Specificity other) {
		return new Integer(this.ordinal()).compareTo(new Integer(other.ordinal()))>0;
	}
}