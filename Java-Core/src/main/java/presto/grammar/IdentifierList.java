package presto.grammar;

import presto.utils.CodeWriter;
import presto.utils.ObjectList;

public class IdentifierList extends ObjectList<String> {

	private static final long serialVersionUID = 1L;

	public static IdentifierList parse(String ids) {
		String[] parts = ids.split(",");
		IdentifierList result = new IdentifierList();
		for(String part : parts)
			result.add(part);
		return result;
	}
	
	public IdentifierList() {		
	}
	
	public IdentifierList(String item) {
		this.add(item);
	}

	
	public void toDialect(CodeWriter writer, boolean finalAnd) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer, finalAnd);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toPDialect(writer);
			break;
		}
		
	}

	private void toEDialect(CodeWriter writer, boolean finalAnd) {
		switch(this.size()) {
		case 0:
			return;
		case 1:
			writer.append(this.getFirst());
			break;
		default:
			for(String s : this) {
				if(finalAnd && s==this.getLast())
					break;
				writer.append(s);
				writer.append(", ");
			}
			writer.trimLast(2);
			if(finalAnd) {
				writer.append(" and ");
				writer.append(this.getLast());
			}
		}
	}

	private void toODialect(CodeWriter writer) {
		if(this.size()>0) {
			for(String s : this) {
				writer.append(s);
				writer.append(", ");
			}
			writer.trimLast(2);
		}
	}

	private void toPDialect(CodeWriter writer) {
		toODialect(writer);
	}
}
