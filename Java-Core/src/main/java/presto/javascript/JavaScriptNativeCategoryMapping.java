package presto.javascript;

import presto.grammar.NativeCategoryMapping;
import presto.utils.CodeWriter;


public class JavaScriptNativeCategoryMapping extends NativeCategoryMapping {

	String identifier;
	JavaScriptModule module;
	
	public JavaScriptNativeCategoryMapping(String identifier, JavaScriptModule module) {
		this.identifier = identifier;
		this.module = module;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("JavaScript: ");
		writer.append(identifier);
		if(module!=null)
			module.toDialect(writer);
	}

}
