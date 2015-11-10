package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.value.Text;

public class Application extends CodeUnit {

	private Text entryPoint;

	public Text getEntryPoint() {
		return entryPoint;
	}

	public void setEntryPoint(Text entryPoint) {
		this.entryPoint = entryPoint;
	}

	@Override
	public void populate(Context context, IStorable storable) {
		super.populate(context, storable);
		storable.setValue(context, new Identifier("entryPoint"), entryPoint);
		storable.setValue(context, new Identifier("category"), ModuleType.APPLICATION.asValue());
	}

}
