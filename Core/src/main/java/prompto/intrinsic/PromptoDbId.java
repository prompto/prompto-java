package prompto.intrinsic;

public class PromptoDbId {

	public static PromptoDbId of(Object value) {
		if(value==null)
			return null;
		else if(value instanceof PromptoDbId)
			return (PromptoDbId)value;
		else 
			return new PromptoDbId(value);
	}

	Object value;
	
	private PromptoDbId(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof PromptoDbId)
			return ((PromptoDbId)obj).equals(this);
		else
			return value.equals(obj);
	}

	public boolean equals(PromptoDbId obj) {
		return value.equals(obj.value);
	}

	@Override
	public String toString() {
		return value.toString();
	}

	
	
}
