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
	public FamilyInfo getFamilyInfo(Context context) {
		// TODO only works with one dimensional arrays
		FamilyInfo info = itemType.getFamilyInfo(context);
		return new FamilyInfo(info.getFamily(), true);
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
	public void checkContains(Context context, IType other) {
		if(itemType.isAssignableFrom(context, other))
			return;
		else
			super.checkContains(context, other);
	}
	
	@Override
	public void checkExists(Context context) {
		itemType.resolve(context, null);
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return other instanceof IterableType
			&& itemType.isMoreSpecificThan(context, ((IterableType)other).itemType);
	}

	public abstract IterableType withItemType(IType itemType);
	
	@Override
	public void transpileJsxCode(Transpiler transpiler) {
		transpiler.append(".toArray()");
	}
	
	
}
