package presto.python;

import presto.utils.CodeWriter;


public class Python3NativeCategoryMapping extends PythonNativeCategoryMapping {

	public Python3NativeCategoryMapping(PythonNativeCategoryMapping mapping) {
		super(mapping);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Python3: ");
		super.toDialect(writer);
	}

}