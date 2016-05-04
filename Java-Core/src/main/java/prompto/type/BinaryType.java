package prompto.type;

import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.value.BinaryValue;
import prompto.value.IValue;


public abstract class BinaryType extends NativeType { 

	protected BinaryType(Family family) {
		super(family);
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
		if ("name".equals(name))
			return TextType.instance();
		else if ("format".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if(value instanceof PromptoBinary)
			return BinaryValue.newInstance((PromptoBinary)value);
		else
			return super.convertJavaValueToIValue(context, value);
	}

}
