package prompto.debug;

import prompto.grammar.INamed;
import prompto.runtime.Context;

public class FullVariable implements IVariable {

	Context context;
	INamed named;
	IValue value;
	
	public FullVariable(Context context, INamed named) {
		this.context = context;
		this.named = named;
	}
	
	@Override
	public String getName() {
		return named.getName();
	}
	
	@Override
	public String getTypeName() {
		return named.getType(context).getTypeName();
	}
	
	@Override
	public IValue getValue() {
		if(value==null)
			value = new IValueWrapper(context.getValue(named.getId()));
		return value;
	}
	
	static class IValueWrapper implements IValue {
		
		prompto.value.IValue value;

		public IValueWrapper(prompto.value.IValue value) {
			this.value = value;
		}
		
		@Override
		public String getValueString() {
			return this.value.toString();
		}

	}


}
