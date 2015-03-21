package presto.value;

import java.util.Set;

import presto.error.PrestoError;
import presto.runtime.Context;
import presto.type.CategoryType;


public interface IInstance extends IValue {

	CategoryType getType();
	void setMember(Context context, String attrName, IValue value) throws PrestoError;
	IValue getMember(Context context, String attrName) throws PrestoError;
	Set<String> getMemberNames();
	
}
