package prompto.grammar;

import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.store.IQuery;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

public class OrderByClause extends Section {
	
	IdentifierList qualifiedName;
	boolean descending;
	
	public OrderByClause(IdentifierList qualifiedName, boolean descending) {
		this.qualifiedName = qualifiedName;
		this.descending = descending;
	}
	
	public IdentifierList getQualifiedName() {
		return qualifiedName;
	}
	
	public boolean isDescending() {
		return descending;
	}

	public void toDialect(CodeWriter writer) {
		for(Identifier name : qualifiedName) {
			writer.append(name.toString());
			writer.append(".");
		}
		writer.trimLast(1);
		if(descending)
			writer.append(" descending");
	}

	public void interpretQuery(Context context, IQuery q) {
		// TODO members
		Identifier name = qualifiedName.getFirst();
		q.addOrderByClause(name.toString(), isDescending());
	}
}
