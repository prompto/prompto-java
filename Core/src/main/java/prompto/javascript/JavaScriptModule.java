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

	public void declare(Transpiler transpiler) {
		if(isPromptoIntrinsic()) {
			String[] ids = identifiers.toArray(new String[identifiers.size()]);
			transpiler.require(ids[2]);
		}
	}

	public void transpile(Transpiler transpiler) {
		for(String id : identifiers) {
			if("js".equals(id)) {
				transpiler.trimLast(1);
				transpiler.append('.');
			}
			transpiler.append(id);
			transpiler.append('/');
		}
		transpiler.trimLast(1);
	}

	public boolean isPromptoIntrinsic() {
		String[] ids = identifiers.toArray(new String[identifiers.size()]);
		return ids.length >= 2 && "prompto".equals(ids[0]) &&  "intrinsic".equals(ids[1]);
	}


}
