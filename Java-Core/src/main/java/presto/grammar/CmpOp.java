package presto.grammar;

import presto.utils.CodeWriter;

public enum CmpOp {
	GT,
	GTE,
	LT,
	LTE;

	public void toDialect(CodeWriter writer) {
		switch(this) {
		case GT:
			writer.append(">");
			break;
		case GTE:
			writer.append(">=");
			break;
		case LT:
			writer.append("<");
			break;
		case LTE:
			writer.append("<=");
			break;
		}
	}
}
