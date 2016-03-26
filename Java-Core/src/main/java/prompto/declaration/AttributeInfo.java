package prompto.declaration;

import java.util.Collection;

import prompto.type.IType.Family;

public class AttributeInfo {

	public static final String KEY = "key";
	public static final String VALUE = "value";
	public static final String WORDS = "words";

	protected String name;
	protected Family family;
	protected boolean collection;
	protected boolean key = false;
	protected boolean value = false;
	protected boolean words = false;
	
	public AttributeInfo(String name, Family family, boolean collection, Collection<String> indexTypes) {
		this.name = name;
		this.family = family;
		this.collection = collection;
		if(indexTypes!=null) {
			key = indexTypes.contains(KEY);
			value = indexTypes.contains(VALUE);
			words = indexTypes.contains(WORDS);
		} 
	}
	
	public AttributeInfo(String name, Family family, boolean collection, boolean key, boolean value, boolean words) {
		this.name = name;
		this.family = family;
		this.collection = collection;
		this.key = key;
		this.value = value;
		this.words = words;
	}

	public AttributeInfo(AttributeInfo info) {
		this.name = info.getName();
		this.family = info.getFamily();
		this.collection = info.isCollection();
		this.key = info.isKey();
		this.value = info.isValue();
		this.words = info.isWords();
	}
	
	public String getName() {
		return name;
	}
	
	public Family getFamily() {
		return family;
	}

	public boolean isCollection() {
		return collection;
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
}
