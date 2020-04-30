package prompto.type;

import prompto.runtime.Context;
import prompto.store.Family;
import prompto.store.FamilyInfo;
import prompto.transpiler.Transpiler;

public abstract class IterableType extends NativeType {

	IType itemType;
	String typeName;
	
	protected IterableType(Family family, IType itemType, String typeName) {
		super(family);
		this.itemType = itemType;
		this.typeName = typeName;
	}
	
	@Override
	public FamilyInfo getFamilyInfo() {
		return new FamilyInfo(family, true);
	}
	
	@Override
	public String getTypeName() {
		return typeName;
	}
	
	public IType getItemType() {
		return itemType;
	}
	
	public void setItemType(IType itemType) {
		this.itemType = itemType;
	}
	
	@Override
	public IType checkContains(Context context, IType other) {
		if(itemType.isAssignableFrom(context, other))
			return BooleanType.instance();
		else
			return super.checkContains(context, other);
	}
	
	@Override
	public void checkExists(Context context) {
		itemType.checkExists(context);
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return other instanceof IterableType
			&& itemType.isMoreSpecificThan(context, ((IterableType)other).itemType);
	}

	public abstract IterableType withItemType(IType itemType);
	
	@Override
	public void transpileCode(Transpiler transpiler) {
		transpiler.append(".toArray()");
	}
	
	
}
