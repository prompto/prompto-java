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
	    if(this.module!=null) {
	    	if(transpiler.getEngine().isTestEngine()) {
		    	transpiler.append("var ").append(identifier).append(" = require('");
		        this.module.transpile(transpiler);
		        transpiler.append("').").append(identifier).append(";").newLine();
	    	} else { 
		    	transpiler.append("var ").append(identifier).append(" = require('/");
		        this.module.transpile(transpiler);
		        transpiler.append("', null, null, function(m) { return {id: m, uri: m}; }).").append(identifier).append(";").newLine();
	    	}
	    }
	}

	public String getBoundName() {
		return identifier;
	}

	public void transpileWidget(Transpiler transpiler, String name) {
		// assumption is that required module is already imported through other means
    	transpiler.append("var ").append(name).append(" = ");
    	transpileTypename(transpiler);
    	transpiler.append(";").newLine();
	}

	public void transpileTypename(Transpiler transpiler) {
	    if(this.module!=null) {
	        this.module.transpile(transpiler);
	        transpiler.append(".");
	    }
	    transpiler.append(identifier);
	}

}
