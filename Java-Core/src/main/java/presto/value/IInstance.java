package presto.value;

import java.util.Set;

import presto.error.PrestoError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.CategoryType;


public interface IInstance extends IValue {

	CategoryType getType();
	void setMember(Context context, Identifier attrName, IValue value) throws PrestoError;
	IValue getMember(Context context, Identifier attrName) throws PrestoError;
	Set<Identifier> getMemberNames();
	boolean setMutable(boolean set);
	
}
