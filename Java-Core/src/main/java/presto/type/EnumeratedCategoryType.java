package presto.type;

import presto.error.SyntaxError;
import presto.runtime.Context;


public class EnumeratedCategoryType extends CategoryType {

	public EnumeratedCategoryType(String name) {
		super(name); 
	}
	
	@Override
	public IType checkMember(Context context, String name) throws SyntaxError {
		if ("value".equals(name))
			return this;
		else if ("name".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, name);
	}

}
