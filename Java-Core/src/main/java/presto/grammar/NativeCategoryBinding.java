package presto.grammar;

import presto.utils.CodeWriter;

public abstract class NativeCategoryBinding {

	public abstract void toDialect(CodeWriter writer);

}
