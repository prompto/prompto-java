package prompto.store;

import java.util.Collection;

public class AttributeInfo extends FamilyInfo {

	public static final AttributeInfo CATEGORY = new AttributeInfo("category", Family.TEXT, true, null);
	public static final AttributeInfo NAME = new AttributeInfo("name", Family.TEXT, false, null);
	public static final AttributeInfo STORABLE = new AttributeInfo("storable", Family.BOOLEAN, false, null);
	public static final AttributeInfo SYMBOLS = new AttributeInfo("symbols", Family.TEXT, true, null);
	public static final AttributeInfo DERIVED_FROM = new AttributeInfo("derivedFrom", Family.TEXT, true, null);
	public static final AttributeInfo ANNOTATIONS = new AttributeInfo("annotations", Family.TEXT, true, null);
	public static final AttributeInfo MODULE = new AttributeInfo("module", Family.CATEGORY, false, null);
	
	public static final String KEY = "key";
	public static final String VALUE = "value";
	public static final String WORDS = "words";

	protected String name;
	protected boolean key = false;
	protected boolean value = false;
	protected boolean words = false;
	
	public AttributeInfo(String name, Family family, boolean collection, Collection<String> indexTypes) {
		super(family, collection);
		this.name = name;
		if(indexTypes!=null) {
			key = indexTypes.contains(KEY);
			value = indexTypes.contains(VALUE);
			words = indexTypes.contains(WORDS);
		} 
	}
	
	public AttributeInfo(String name, Family family, boolean collection, boolean key, boolean value, boolean words) {
		super(family, collection);
		this.name = name;
		this.key = key;
		this.value = value;
		this.words = words;
	}

	public AttributeInfo(AttributeInfo info) {
		super(info.getFamily(), info.isCollection());
		this.name = info.getName();
		this.key = info.isKey();
		this.value = info.isValue();
		this.words = info.isWords();
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isKey() {
		return key;
	}
	
	public boolean isValue() {
		return value;
	}
	
	public boolean isWords() {
		return words;
	}
	
	public boolean isIndexed() {
		return key || value || words;
	}

	public String toTranspiled() {
	    return "new AttributeInfo('" + this.name + "', TypeFamily." + this.family.name() + ", " + this.collection + ", null)";
	}
}
