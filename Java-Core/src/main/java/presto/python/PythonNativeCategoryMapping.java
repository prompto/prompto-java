package presto.python;

import presto.grammar.NativeCategoryMapping;
import presto.utils.CodeWriter;


public class PythonNativeCategoryMapping extends NativeCategoryMapping {

	String identifier;
	PythonModule module;
	
	public PythonNativeCategoryMapping(String identifier, PythonModule module) {
		this.identifier = identifier;
		this.module = module;
	}

	public PythonNativeCategoryMapping(PythonNativeCategoryMapping mapping) {
		this.identifier = mapping.identifier;
		this.module = mapping.module;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(identifier);
		if(module!=null)
			module.toDialect(writer);
	}
}
