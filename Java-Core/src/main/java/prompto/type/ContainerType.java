package prompto.type;

import prompto.error.SyntaxError;
import prompto.runtime.Context;

public abstract class ContainerType extends NativeType {

	IType itemType;
	
	protected ContainerType(String name, IType itemType) {
		super(name);
		this.itemType = itemType;
	}
	
	public IType getItemType() {
		return itemType;
	}
	
	@Override
	public void checkExists(Context context) throws SyntaxError {
		itemType.checkExists(context);
	}
	
	@Override
	public IType checkContains(Context context, IType other) throws SyntaxError {
		if(itemType.isAssignableTo(context, other))
			return BooleanType.instance();
		else
			return super.checkContains(context, other);
	}
	
}
