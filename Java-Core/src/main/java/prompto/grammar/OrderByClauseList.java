package prompto.grammar;

import prompto.parser.Dialect;
import prompto.utils.CodeWriter;
import prompto.utils.ObjectList;

@SuppressWarnings("serial")
public class OrderByClauseList extends ObjectList<OrderByClause> {

	public OrderByClauseList() {	
	}
	
	public OrderByClauseList(OrderByClause clause) {
		this.add(clause);
	}

	public void toDialect(CodeWriter writer) {
		writer.append("order by ");
		if(writer.getDialect()==Dialect.O)
			writer.append("( ");
		for(OrderByClause clause : this) {
			clause.toDialect(writer);
			writer.append(", ");
		}
		writer.trimLast(2);
		if(writer.getDialect()==Dialect.O)
			writer.append(" )");
	}

}
