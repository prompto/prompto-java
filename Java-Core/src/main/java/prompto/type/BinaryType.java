package prompto.type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;


public abstract class BinaryType extends NativeType { 

	protected BinaryType(Family family) {
		super(family);
	}

	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
		if ("name".equals(name))
			return TextType.instance();
		else if ("format".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
	}

}
