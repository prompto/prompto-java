package presto.grammar;

import presto.utils.CodeWriter;
import presto.utils.ObjectList;

public class NativeCategoryMappingList extends ObjectList<NativeCategoryMapping> {

	private static final long serialVersionUID = 1L;

	public NativeCategoryMappingList() {
		
	}
	
	public NativeCategoryMappingList(NativeCategoryMapping mapping) {
		this.add(mapping);
	}

	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case P:
			toPDialect(writer);
			break;
		}
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("define category mappings as:\n");
		writer.indent();
		for(NativeCategoryMapping m : this) {
			m.toDialect(writer);
			writer.newLine();
		}
		writer.dedent();	
	}

	private void toPDialect(CodeWriter writer) {
		writer.append("mappings:\n");
		writer.indent();
		for(NativeCategoryMapping m : this) {
			m.toDialect(writer);
			writer.newLine();
		}
		writer.dedent();	
	}

	private void toODialect(CodeWriter writer) {
		writer.append("category mappings {\n");
		writer.indent();
		for(NativeCategoryMapping m : this) {
			m.toDialect(writer);
			writer.append(';');
			writer.newLine();
		}
		writer.dedent();	
		writer.append("}");
	}
	

}
