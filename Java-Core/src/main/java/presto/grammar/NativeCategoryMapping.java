package presto.grammar;

import presto.utils.CodeWriter;

public abstract class NativeCategoryMapping {

	public abstract void toDialect(CodeWriter writer);

}
