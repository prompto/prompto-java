package prompto.store.solr;

import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.function.Function;

import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.IQueryBuilder.MatchOp;

class SOLRAttributeInfo extends AttributeInfo {
	
	static SOLRAttributeInfo computeFieldFlags(AttributeInfo column) {
		SOLRAttributeInfo info = null; 
		if(!"version".equals(column.getName())) {
			if(column.getFamily()==Family.TEXT)
				info = new SOLRAttributeInfo(column);
		}
		return info;
	}

	public SOLRAttributeInfo(AttributeInfo info) {
		super(info);
		adjustIndexFlags();
	}
	
	private void adjustIndexFlags() {
		if("category".equals(name))
			key = true;
		else if(family==Family.TEXT && !"version".equals(name)) {
			if(!key && !value && !words)
				value = true;
		} else {
			key = false;
			value = false;
			words = false;
		}
	}

	public SOLRAttributeInfo(String name, Family family, boolean collection, Collection<String> indexTypes) {
		super(name, family, collection, indexTypes);
		adjustIndexFlags();
	}
	
	
	public void addFieldNameFor(StringBuilder sb, MatchOp operator) {
		switch(operator) {
		case EQUALS:
			addFieldNameForEquals(sb);
			break;
		case ROUGHLY:
			addFieldNameForRoughly(sb);
			break;
		case LESSER:
			addFieldNameForLesser(sb);
			break;
		case GREATER:
			addFieldNameForGreater(sb);
			break;
		case CONTAINS:
			addFieldNameForContains(sb);
			break;
		case CONTAINED:
			addFieldNameForContained(sb);
			break;
		default:
			throw new InvalidParameterException(operator.name());
		}
	}

	public String getFieldNameForOrderBy() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		addTextFieldNameSuffix(sb, this::appendValue, this::appendKey, this::appendWords);
		return sb.toString();
	}


	@SafeVarargs
	private final void addTextFieldNameSuffix(StringBuilder sb, Function<StringBuilder, Boolean> ... predicates) {
		if(family==Family.TEXT && !"version".equals(name) && predicates.length>0) {
			sb.append('-');
			for(Function<StringBuilder, Boolean> predicate : predicates) {
				if(predicate.apply(sb))
					break;
			}
		}
	}

	boolean appendKey(StringBuilder sb) {
		if(isKey()) {
			sb.append(KEY);
			return true;
		} else
			return false;
	}
	
	boolean appendValue(StringBuilder sb) {
		if(isValue()) {
			sb.append(VALUE);
			return true;
		} else
			return false;
	}
	
	boolean appendWords(StringBuilder sb) {
		if(isWords()) {
			sb.append(WORDS);
			return true;
		} else
			return false;
	}



	public void addFieldNameForEquals(StringBuilder sb) {
		sb.append(name);
		addTextFieldNameSuffix(sb, this::appendKey, this::appendValue, this::appendWords);
	}

	
	private void addFieldNameForGreater(StringBuilder sb) {
		sb.append(name);
		addTextFieldNameSuffix(sb, this::appendValue, this::appendKey, this::appendWords);
	}

	private void addFieldNameForLesser(StringBuilder sb) {
		sb.append(name);
		addTextFieldNameSuffix(sb, this::appendValue, this::appendKey, this::appendWords);
	}


	public void addFieldNameForContains(StringBuilder sb) {
		sb.append(name);
		addTextFieldNameSuffix(sb, this::appendValue, this::appendKey, this::appendWords);
	}
	
	private void addFieldNameForContained(StringBuilder sb) {
		sb.append(name);
		addTextFieldNameSuffix(sb, this::appendKey, this::appendValue, this::appendWords);
	}

	public void addFieldNameForRoughly(StringBuilder sb) {
		sb.append(name);
		addTextFieldNameSuffix(sb, this::appendValue, this::appendKey, this::appendWords);
	}




}
