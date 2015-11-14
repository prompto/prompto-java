package prompto.code;

import prompto.code.ICodeStore.ModuleType;

public class Script extends Module {

	@Override
	public ModuleType getType() {
		return ModuleType.SCRIPT;
	}
}
