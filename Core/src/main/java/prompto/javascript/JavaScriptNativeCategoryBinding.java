package prompto.javascript;

import prompto.grammar.NativeCategoryBinding;
import prompto.transpiler.Transpiler;
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

	public void transpile(Transpiler transpiler) {
	    if(this.module!=null)
	        this.module.transpile(transpiler, this.identifier);
	}

	public String getBoundName() {
		return identifier;
	}

}
