package presto.literal;

import java.util.LinkedList;

import presto.utils.CodeWriter;

public class DictEntryList extends LinkedList<DictEntry> {

	private static final long serialVersionUID = 1L;

	public DictEntryList() {
	}
	
	public DictEntryList(DictEntry entry) {
		this.add(entry);
	}
	
	@Override
	public String toString() {
		String text = super.toString();
		return '{' + text.substring(1,text.length()-1) + '}';
	}

	public void toDialect(CodeWriter writer) {
		writer.append('{');
		if(this.size()>0) {
			for(DictEntry entry : this) {
				entry.toDialect(writer);
				writer.append(", ");
			}
			writer.trimLast(2);
		}
		writer.append('}');
	}
	
}
