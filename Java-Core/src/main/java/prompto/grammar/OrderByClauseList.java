package prompto.grammar;

import prompto.utils.ObjectList;

@SuppressWarnings("serial")
public class OrderByClauseList extends ObjectList<OrderByClause> {

	public OrderByClauseList() {	
	}
	
	public OrderByClauseList(OrderByClause clause) {
		this.add(clause);
	}

}
