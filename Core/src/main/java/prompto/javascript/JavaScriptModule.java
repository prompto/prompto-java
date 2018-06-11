package prompto.javascript;

import java.util.Collection;

import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class JavaScriptModule {

	Collection<String> identifiers;
	
	public JavaScriptModule(Collection<String> identifiers) {
		this.identifiers = identifiers;
	}

	public void toDialect(CodeWriter writer) {
		writer.append(" from module: ");
		for(String id : identifiers) {
			if("js".equals(id)) {
				writer.trimLast(1);
				writer.append('.');
			}
			writer.append(id);
			writer.append('/');
		}
		writer.trimLast(1);
	}

	public void transpile(Transpiler transpiler, String identifier) {
		// TODO 
	}

}
