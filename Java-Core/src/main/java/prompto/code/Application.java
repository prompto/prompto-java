package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.Document;
import prompto.value.Text;

public class Application extends CodeUnit {

	private Text entryPoint;

	public Text getEntryPoint() {
		return entryPoint;
	}

	public void setEntryPoint(Text entryPoint) {
		this.entryPoint = entryPoint;
	}

	public Document asDocument() {
		Context context = Context.newGlobalContext();
		Document document = new Document();
		super.populate(context, document);
		document.setMember(context, new Identifier("entryPoint"), entryPoint);
		document.setMember(context, new Identifier("category"), ModuleType.APPLICATION.asValue());
		return document;
	}

}
