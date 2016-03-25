package prompto.store.solr;

import java.util.Collection;

import prompto.declaration.AttributeDeclaration;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.TextType;

class TextFieldFlags {
	
	static final String KEY = "key";
	static final String VALUE = "value";
	static final String WORDS = "words";
	
	public static TextFieldFlags computeFieldFlags(Context context, String fieldName) {
		if(context!=null) {
			AttributeDeclaration column = context.findAttribute(fieldName);
			return computeFieldFlags(column);
		} else
			return null;
	}
	
	static TextFieldFlags computeFieldFlags(AttributeDeclaration column) {
		TextFieldFlags flags = null; 
		if(!"version".equals(column.getName())) {
			IType type = column.getType();
			if(type instanceof ListType)
				type = ((ListType)type).getItemType();
			if(type==TextType.instance())
				flags = new TextFieldFlags(column.getIndexTypes());
		}
		return flags;
	}

	public boolean hasWords = false;
	public boolean hasValue = false;
	public boolean hasKey = false;
	
	public TextFieldFlags(Collection<String> indexTypes) {
		if(indexTypes!=null) {
			hasKey = indexTypes.contains(KEY);
			hasValue = indexTypes.contains(VALUE);
			hasWords = indexTypes.contains(WORDS);
		} else
			hasValue = true;
		
	}
	
	public void addSuffixForEquals(StringBuilder sb) {
		sb.append('-');
		if(hasKey)
			sb.append(KEY);
		else if(hasValue)
			sb.append(VALUE);
		else if(hasWords)
			sb.append(WORDS);
	}

	public void addSuffixForRoughly(StringBuilder sb) {
		sb.append('-');
		if(hasValue)
			sb.append(VALUE);
		else if(hasKey)
			sb.append(KEY);
		else if(hasWords)
			sb.append(WORDS);
	}

	public String getSuffixForOrderBy() {
		if(hasKey)
			return '-' + KEY;
		else if(hasValue)
			return '-' + VALUE;
		else if(hasWords)
			return '-' + WORDS;
		else
			return "";
	}


}
