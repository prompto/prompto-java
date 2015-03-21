package presto.grammar;

import presto.utils.CodeWriter;

public enum ContOp {
	IN,
	CONTAINS,
	CONTAINS_ALL,
	CONTAINS_ANY,
	NOT_IN,
	NOT_CONTAINS,
	NOT_CONTAINS_ALL,
	NOT_CONTAINS_ANY;

	public void toDialect(CodeWriter writer) {
		writer.append(this.name().toLowerCase().replace('_', ' '));
	}
}
