package prompto.code;

import prompto.code.ICodeStore.ModuleType;

public class Library extends Module {

	@Override
	public ModuleType getType() {
		return ModuleType.LIBRARY;
	}
}
