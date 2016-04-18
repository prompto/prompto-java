package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IStorable;

public class WebSite extends Module {

	private String entryPoint;

	public String getEntryPoint() {
		return entryPoint;
	}

	public void setEntryPoint(String entryPoint) {
		this.entryPoint = entryPoint;
	}

	@Override
	public ModuleType getType() {
		return ModuleType.WEBSITE;
	}
	
	@Override
	public void populate(Context context, IStorable storable) throws PromptoError {
		super.populate(context, storable);
		storable.setData("entryPoint", entryPoint);
	}

}
