package prompto.code;

import java.util.List;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;

public class Batch extends Module implements IApplication {

	private String startMethod;

	public String getStartMethod() {
		return startMethod;
	}

	public void setStartMethod(String startMethod) {
		this.startMethod = startMethod;
	}

	@Override
	public ModuleType getType() {
		return ModuleType.BATCH;
	}
	
	@Override
	public IStorable populate(Context context, IStore store, List<IStorable> storables) throws PromptoError {
		IStorable storable = super.populate(context, store, storables);
		storable.setData("startMethod", startMethod);
		return storable;
	}

}
