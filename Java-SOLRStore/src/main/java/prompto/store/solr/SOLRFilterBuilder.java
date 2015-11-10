package prompto.store.solr;

import java.util.Stack;

import org.apache.solr.client.solrj.SolrQuery;

import prompto.grammar.EqOp;
import prompto.store.IFilterBuilder;
import prompto.value.IValue;

public class SOLRFilterBuilder implements IFilterBuilder {

	Stack<String> stack = new Stack<>();
	
	@Override
	public void push(String name, EqOp operator, IValue value) {
		StringBuilder sb = new StringBuilder();
		switch(operator) {
		case IS:
		case IS_NOT:
		// TODO: could add a category clause	
		case IS_A:
		case IS_NOT_A:
			throw new UnsupportedOperationException();
		case NOT_EQUALS:
			sb.append('-');
			break;
		default:
		}
		sb.append(name);
		sb.append(':');
		sb.append(value.toString());
		stack.push(sb.toString());
	}

	public SolrQuery toSolrQuery() {
		// TODO: based on the field type and operator, we should use query/filterQuery
		SolrQuery query = new SolrQuery();
		query.setQuery(stack.pop());
		return query;
	}
	
}
