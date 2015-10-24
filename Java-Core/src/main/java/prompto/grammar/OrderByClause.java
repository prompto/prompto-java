package prompto.grammar;

import prompto.parser.Section;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

public class OrderByClause extends Section {
	
	IdentifierList names;
	boolean descending;
	
	public OrderByClause(IdentifierList names, boolean descending) {
		this.names = names;
		this.descending = descending;
	}
	
	public IdentifierList getNames() {
		return names;
	}
	
	public boolean isDescending() {
		return descending;
	}

	public void toDialect(CodeWriter writer) {
		for(Identifier name : names) {
			writer.append(name.toString());
			writer.append(".");
		}
		writer.trimLast(1);
		if(descending)
			writer.append(" descending");
	}
}
