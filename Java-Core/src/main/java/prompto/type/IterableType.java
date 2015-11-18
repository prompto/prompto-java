package prompto.type;

import prompto.error.SyntaxError;
import prompto.runtime.Context;

public abstract class IterableType extends NativeType {

	IType itemType;
	
	protected IterableType(String name, IType itemType) {
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
	
	
}
