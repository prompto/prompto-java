package prompto.javascript;

import prompto.grammar.NativeCategoryBinding;
import prompto.utils.CodeWriter;


public class JavaScriptNativeCategoryBinding extends NativeCategoryBinding {

	String identifier;
	JavaScriptModule module;
	
	public JavaScriptNativeCategoryBinding(String identifier, JavaScriptModule module) {
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
