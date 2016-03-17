package prompto.type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.runtime.Context;

public class EntryType extends BaseType {

	IType itemType;

	public EntryType(IType itemType) {
		super(itemType.getId() + "{}[]");
		this.itemType = itemType;
	}

	public IType getItemType() {
		return itemType;
	}

	@Override
	public Class<?> toJavaClass() {
		return PromptoDict.Entry.class;
	}

	@Override
	public void checkUnique(Context context) throws SyntaxError {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public void checkExists(Context context) throws SyntaxError {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
		if ("key".equals(name))
			return TextType.instance();
		else if ("value".equals(name))
			return itemType;
		else
			return super.checkMember(context, id);
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		throw new RuntimeException("Should never get there!");
	}

}
