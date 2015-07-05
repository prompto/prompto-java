package prompto.grammar;


public enum ContOp {
	IN,
	CONTAINS,
	CONTAINS_ALL,
	CONTAINS_ANY,
	NOT_IN,
	NOT_CONTAINS,
	NOT_CONTAINS_ALL,
	NOT_CONTAINS_ANY;

	public String toString() {
		return this.name().toLowerCase().replace('_', ' ');
	}
}
