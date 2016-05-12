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

	public ContOp reverse() {
		switch(this) {
		case IN:
			return CONTAINS;
		case CONTAINS:
			return IN;
		case NOT_IN:
			return NOT_CONTAINS;
		case NOT_CONTAINS:
			return NOT_IN;
		default:
			return null;
		}
	}
}
