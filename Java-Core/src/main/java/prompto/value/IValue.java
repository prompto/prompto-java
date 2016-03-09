package prompto.value;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.IType;

import com.fasterxml.jackson.core.JsonGenerator;

public interface IValue {
	
	boolean isMutable();
	
	IType getType();
	
	IValue plus(Context context, IValue value) throws PromptoError;

	IValue minus(Context context, IValue iValue) throws PromptoError;

	IValue multiply(Context context, IValue iValue) throws PromptoError;

	IValue divide(Context context, IValue iValue) throws PromptoError;

	IValue intDivide(Context context, IValue iValue) throws PromptoError;

	IValue modulo(Context context, IValue iValue) throws PromptoError;

	IValue getMember(Context context, Identifier name, boolean autoCreate) throws PromptoError;

	void setMember(Context context, Identifier name, IValue value) throws PromptoError;

	int compareTo(Context context, IValue value) throws PromptoError;

	boolean roughly(Context context, IValue value) throws PromptoError;
	
	ISliceable<IValue> asSliceable(Context context) throws PromptoError;

	Object convertTo(Class<?> type) throws PromptoError;

	void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError;

	void storeValue(Context context, String name, IStorable storable) throws PromptoError;

}
