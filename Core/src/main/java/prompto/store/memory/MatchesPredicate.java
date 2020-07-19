package prompto.store.memory;

import java.util.Collection;
import java.util.Map;

import prompto.store.AttributeInfo;
import prompto.store.IQueryBuilder.MatchOp;

public class MatchesPredicate<T extends Object> implements IPredicate {

	AttributeInfo info;
	MatchOp match;
	T value;
	
	public MatchesPredicate(AttributeInfo info, MatchOp match, T value) {
		this.info = info;
		this.match = match;
		this.value = value;
	}
	
	@Override
	public boolean matches(Map<String, Object> document) {
		Object data = document.get(info.getName());
		switch(match) {
		case EQUALS:
			return matches_EQUALS(data);
		case ROUGHLY:
			return matches_ROUGHLY(data);
		case CONTAINS:
			return matches_CONTAINS(data);
		case HAS:
			return matches_HAS(data);
		case HAS_ANY:
			return matches_HAS_ANY(data);
		case HAS_ALL:
			return matches_HAS_ALL(data);
		case IN:
			return matches_IN(data);
		case GREATER:
			return matches_GREATER(data);
		case LESSER:
			return matches_LESSER(data);
		default:
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	private boolean matches_GREATER(Object data) {
		if(data instanceof Comparable && value instanceof Comparable)
			return ((Comparable<Object>)data).compareTo((Comparable<Object>)value)>0;
		else
			return false;
	}

	@SuppressWarnings("unchecked")
	private boolean matches_LESSER(Object data) {
		if(data instanceof Comparable && value instanceof Comparable)
			return ((Comparable<Object>)data).compareTo((Comparable<Object>)value)<0;
		else
			return false;
	}

	private boolean matches_HAS(Object data) {
		if(data instanceof Collection)
			return ((Collection<?>)data).contains(value);
		else
			return false;
	}

	private boolean matches_HAS_ANY(Object data) {
		if(data instanceof Collection && value instanceof Collection) {
			Collection<?> datas = (Collection<?>)data;
			Collection<?> values = (Collection<?>)value;
			return datas.stream().anyMatch(values::contains);
		} else
			return false;
	}

	private boolean matches_HAS_ALL(Object data) {
		if(data instanceof Collection && value instanceof Collection) {
			Collection<?> datas = (Collection<?>)data;
			Collection<?> values = (Collection<?>)value;
			return datas.containsAll(values);
		} else
			return false;
	}
	
	private boolean matches_CONTAINS(Object data) {
		if(data instanceof String && value instanceof String)
			return ((String)data).contains((String)value);
		// TODO clarify the below
		else if(data instanceof Collection)
			return ((Collection<?>)data).stream().anyMatch(this::matches_CONTAINS);
		else
			return false;
	}

	private boolean matches_IN(Object data) {
		if(data instanceof String && value instanceof String)
			return ((String)value).contains((String)data);
		else if(value instanceof Collection)
			return ((Collection<?>)value).stream().anyMatch(item->item.equals(data));
		else
			return false;
	}

	private boolean matches_ROUGHLY(Object data) {
		if(data instanceof String && value instanceof String)
			return ((String)data).equalsIgnoreCase((String)value);
		else
			return matches_EQUALS(data);
	}

	private boolean matches_EQUALS(Object data) {
		if(data==null) 
			return value==null;
		else
			return data.equals(value);
	}

}
