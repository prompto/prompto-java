package presto.python;

import java.util.Collection;

import presto.utils.CodeWriter;

public class PythonModule {

	Collection<String> identifiers;
	
	public PythonModule(Collection<String> identifiers) {
		this.identifiers = identifiers;
	}

	public void toDialect(CodeWriter writer) {
		writer.append(" from module: ");
		for(String id : identifiers) {
			writer.append(id);
			writer.append('.');
		}
		writer.trimLast(1);
	}

}
