package prompto.utils;

import prompto.grammar.Identifier;


public class IdentifierList extends ObjectList<Identifier> {

	private static final long serialVersionUID = 1L;

	public static IdentifierList parse(String ids) {
		String[] parts = ids.split(",");
		IdentifierList result = new IdentifierList();
		for(String part : parts)
			result.add(new Identifier(part));
		return result;
	}
	
	public IdentifierList() {		
	}
	
	public IdentifierList(Identifier item) {
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
			toSDialect(writer);
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
			for(Identifier s : this) {
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
			for(Identifier s : this) {
				writer.append(s);
				writer.append(", ");
			}
			writer.trimLast(2);
		}
	}

	private void toSDialect(CodeWriter writer) {
		toODialect(writer);
	}
}
