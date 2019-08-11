package prompto.param;

import prompto.grammar.Identifier;
import prompto.value.CodeValue;

public class ValuedCodeParameter extends CodeArgument {

	CodeValue value;
	
	public ValuedCodeParameter(Identifier id, CodeValue value) {
		super(id);
		this.value = value;
	}

	public CodeValue getValue() {
		return value;
	}

}
