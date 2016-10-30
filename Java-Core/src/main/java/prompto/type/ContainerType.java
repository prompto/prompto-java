package prompto.type;

import prompto.runtime.Context;
import prompto.store.Family;

public abstract class ContainerType extends IterableType {

	protected ContainerType(Family family, IType itemType, String fullName) {
		super(family, itemType, fullName);
	}
	
	@Override
	public IType checkContains(Context context, IType other) {
		if(itemType.isAssignableFrom(context, other))
			return BooleanType.instance();
		else
			return super.checkContains(context, other);
	}
	
}
