package prompto.type;

import prompto.error.SyntaxError;
import prompto.runtime.Context;

public abstract class IterableType extends NativeType {

	IType itemType;
	String typeName;
	
	protected IterableType(Family family, IType itemType, String typeName) {
		super(family);
		this.itemType = itemType;
		this.typeName = typeName;
	}
	
	@Override
	public String getTypeName() {
		return typeName;
	}
	
	public IType getItemType() {
		return itemType;
	}
	
	@Override
	public void checkExists(Context context) throws SyntaxError {
		itemType.checkExists(context);
	}
	
	
}
