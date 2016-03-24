package prompto.store.solr;

import java.util.UUID;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;

import prompto.declaration.AttributeDeclaration;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.type.CategoryType;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

public class SOLRQueryBuilder extends SOLRFilterBuilder implements IQueryBuilder<UUID> {

	Context context;
	
	public SOLRQueryBuilder(Context context) {
		this.context = context;
	}

	@Override
	public IQuery buildFetchOneQuery(CategoryType type, IExpression filter) throws PromptoError {
		SolrQuery q = buildQuery(type, null, null, filter, null);
		q.setRows(1);
		return new SOLRQuery(q);
	}
	
	@Override
	public IQuery buildFetchManyQuery(CategoryType type, IExpression start,
			IExpression end, IExpression filter, OrderByClauseList orderBy)
			throws PromptoError {
		SolrQuery q = buildQuery(type, start, end, filter, orderBy);
		return new SOLRQuery(q);
	}
	
	private SolrQuery buildQuery(CategoryType type,
			IExpression start, IExpression end, 
			IExpression filterExpression, OrderByClauseList orderBy) throws PromptoError {
		SOLRFilterBuilder builder = new SOLRFilterBuilder();
		if(type!=null)
			builder.pushCategory(type);
		if(filterExpression!=null)
			filterExpression.toFilter(context, builder);
		if(type!=null && filterExpression!=null)
			builder.and();
		// TODO: based on the field type and operator, should we use query/filterQuery ?
		SolrQuery query = new SolrQuery();
		query.setQuery(builder.toSolrQuery());
		Long intStart = getLong(context, start);
		Long intEnd = getLong(context, end);
		if(intStart!=null && intEnd!=null) {
			query.setStart(intStart.intValue() - 1);
			query.setRows(1 + (int)(intEnd - intStart));
		}
		if(orderBy!=null) for(OrderByClause clause : orderBy) {
			IdentifierList names = clause.getNames();
			// TODO manage member names: a.b
			String fieldName = names.get(0).toString();
			AttributeDeclaration column = context.findAttribute(fieldName);
			TextFieldFlags flags = TextFieldFlags.computeFieldFlags(column);
			if(flags!=null)
				fieldName += flags.getSuffixForOrderBy();
			query.addSort(fieldName, clause.isDescending() ? ORDER.desc : ORDER.asc);
		}
		return query;
	}
	
	private Long getLong(Context context, IExpression exp) throws PromptoError {
		if(exp==null)
			return null;
		IValue value = exp.interpret(context);
		if(!(value instanceof prompto.value.Integer))
			throw new InvalidDataError("Expecting an Integer, got:" + value.getType().toString());
		return ((prompto.value.Integer)value).longValue();
	}


}
