package prompto.runtime;

import prompto.grammar.Identifier;
import prompto.type.IType;

public class WidgetField extends Variable {

	Object createdBy;
	Object updatedBy;
	
	public WidgetField(Identifier name, IType type, Object createdBy) {
		super(name, type);
		this.createdBy = createdBy;
		this.updatedBy = null;
	}

}
