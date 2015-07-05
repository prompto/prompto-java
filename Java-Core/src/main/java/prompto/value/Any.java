package prompto.value;

import prompto.type.AnyType;

public class Any extends BaseValue {
	
	String text;
	
	public Any() {
		super(AnyType.instance());
	}
	
	public void setId(Object value) {
		// nothing to do, this is just a side effect of exposing Any as a Prompto category
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "{id:" + System.identityHashCode(this) + ", text:" + text + "}";
	}
}
