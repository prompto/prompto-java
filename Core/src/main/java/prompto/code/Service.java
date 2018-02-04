package prompto.code;

import java.util.List;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;

public class Service extends Module {

	private String serverAboutToStartMethod;

	public String getServerAboutToStartMethod() {
		return serverAboutToStartMethod;
	}

	public void setServerAboutToStartMethod(String serverAboutToStartMethod) {
		this.serverAboutToStartMethod = serverAboutToStartMethod;
	}

	@Override
	public ModuleType getType() {
		return ModuleType.SERVICE;
	}
	
	@Override
	public IStorable populate(Context context, IStore store, List<IStorable> storables) throws PromptoError {
		IStorable storable = super.populate(context, store, storables);
		storable.setData("serverAboutToStartMethod", serverAboutToStartMethod);
		return storable;
	}

}
