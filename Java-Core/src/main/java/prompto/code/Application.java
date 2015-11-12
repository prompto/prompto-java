package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.TextType;
import prompto.value.ListValue;
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
		ListValue categories = new ListValue(TextType.instance());
		categories.addItem(new Text("Project"));
		categories.addItem(ModuleType.APPLICATION.asValue());
		storable.setValue(context, new Identifier("categories"), categories);
	}

}
