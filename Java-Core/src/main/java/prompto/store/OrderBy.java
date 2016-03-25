package prompto.store;

public class OrderBy implements IOrderBy {
	
	String fieldName;
	boolean descending;
	
	public OrderBy(String fieldName, boolean descending) {
		this.fieldName = fieldName;
		this.descending = descending;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public boolean isDescending() {
		return descending;
	}
	
}
