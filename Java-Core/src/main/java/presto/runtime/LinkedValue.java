package presto.runtime;

import presto.type.IType;
import presto.value.BaseValue;


/* used to ensure downcast local resolves to actual value */
public class LinkedValue extends BaseValue {
	
	Context context;

	public LinkedValue(Context context, IType type) {
		super(type);
		this.context = context;
	}

	public Context getContext() {
		return context;
	}
	
}
