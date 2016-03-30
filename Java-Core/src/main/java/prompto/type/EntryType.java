package prompto.type;

import java.lang.reflect.Type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.runtime.Context;

public class EntryType extends BaseType {

	IType itemType;
	String typeName;
	
	public EntryType(IType itemType) {
		super(null);
		this.itemType = itemType;
		this.typeName = itemType.getTypeName() + "{}[]";
	}

	public IType getItemType() {
		return itemType;
	}

	@Override
	public Type getJavaType() {
		return PromptoDict.Entry.class;
	}

	@Override
	public void checkUnique(Context context) {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public void checkExists(Context context) {
		throw new RuntimeException("Should never get there!");
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
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
