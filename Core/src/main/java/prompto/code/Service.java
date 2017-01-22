package prompto.code;

import prompto.code.ICodeStore.ModuleType;

public class Service extends Module {

	@Override
	public ModuleType getType() {
		return ModuleType.SERVICE;
	}
}
