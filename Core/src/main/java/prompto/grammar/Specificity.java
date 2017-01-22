package prompto.grammar;

public enum Specificity {
	INCOMPATIBLE,
	RESOLVED,
	INHERITED,
	EXACT,
	ANCESTOR;
	
	public boolean isAssignable() {
		return this!=INCOMPATIBLE && this!=ANCESTOR;
	}
}