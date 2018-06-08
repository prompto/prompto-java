package prompto.type;

import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

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
	
	@Override
	public void declareMember(Transpiler transpiler, String name) {
	    if (!"count".equals(name)) {
	        super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, String name) {
	    if ("count".equals(name)) {
	        transpiler.append("length");
	    } else {
	        super.transpileMember(transpiler, name);
	    }
	}
	
}
