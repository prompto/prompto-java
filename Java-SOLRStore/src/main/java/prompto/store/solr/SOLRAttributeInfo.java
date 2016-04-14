package prompto.store.solr;

import java.util.Collection;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.AttributeInfo;
import prompto.runtime.Context;
import prompto.store.IQuery.MatchOp;
import prompto.type.IType;
import prompto.type.IType.Family;
import prompto.type.ListType;
import prompto.type.TextType;

class SOLRAttributeInfo extends AttributeInfo {
	
	public static SOLRAttributeInfo computeFieldFlags(Context context, String fieldName) {
		if(context!=null) {
			AttributeDeclaration column = context.findAttribute(fieldName);
			return computeFieldFlags(column);
		} else
			return null;
	}
	
	static SOLRAttributeInfo computeFieldFlags(AttributeDeclaration column) {
		SOLRAttributeInfo info = null; 
		if(!"version".equals(column.getName())) {
			IType type = column.getType();
			if(type instanceof ListType)
				type = ((ListType)type).getItemType();
			if(type==TextType.instance())
				info = new SOLRAttributeInfo(column.getAttributeInfo());
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

	public void addFieldName(StringBuilder sb) {
		sb.append(name);
	}
	
	public void addFieldNameForEquals(StringBuilder sb) {
		sb.append(name);
		if(family==Family.TEXT && !"version".equals(name)) {
			sb.append('-');
			if(isKey())
				sb.append(KEY);
			else if(isValue())
				sb.append(VALUE);
			else if(isWords())
				sb.append(WORDS);
		}
	}

	public void addFieldNameForRoughly(StringBuilder sb) {
		sb.append(name);
		if(family==Family.TEXT && !"version".equals(name)) {
			sb.append('-');
			if(isValue())
				sb.append(VALUE);
			else if(isKey())
				sb.append(KEY);
			else if(isWords())
				sb.append(WORDS);
		}
	}

	public String getFieldNameForOrderBy() {
		if(family==Family.TEXT && !"version".equals(name)) {
			if(isKey())
				return name + '-' + KEY;
			else if(isValue())
				return name + '-' + VALUE;
			else if(isWords())
				return name + '-' + WORDS;
		}
		return name;
	}

	public void addFieldNameFor(StringBuilder sb, MatchOp operator) {
		if(collection && operator==MatchOp.CONTAINS)
			operator = MatchOp.EQUALS;
		switch(operator) {
		case EQUALS:
			addFieldNameForEquals(sb);
			break;
		case ROUGHLY:
			addFieldNameForRoughly(sb);
			break;
		default:
			addFieldName(sb);
		}
	}



}
