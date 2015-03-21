package presto.type;

import presto.runtime.Context;

public class ResourceType extends CategoryType {

	public ResourceType(String name) {
		super(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof ResourceType))
			return false;
		ResourceType other = (ResourceType)obj;
		return this.getName().equals(other.getName());
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return this.equals(other);
	}
	
}
