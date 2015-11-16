package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.value.Text;

public class Application extends Module {

	private Text entryPoint;

	public Text getEntryPoint() {
		return entryPoint;
	}

	public void setEntryPoint(Text entryPoint) {
		this.entryPoint = entryPoint;
	}

	@Override
	public ModuleType getType() {
		return ModuleType.APPLICATION;
	}
	
	@Override
	public void populate(Context context, IStorable storable) throws PromptoError {
		super.populate(context, storable);
		storable.setValue(context, new Identifier("entryPoint"), entryPoint);
	}

}
