package presto.runtime;

import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.type.IType;

/* used for downcast */
public class LinkedVariable implements INamed {

	IType type;
	INamed linked;
	
	public LinkedVariable(IType type, INamed linked) {
		this.type = type;
		this.linked = linked;
	}

	@Override
	public Identifier getName() {
		return linked.getName();
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return type;
	}
}
