package prompto.value;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;

public interface IValue {
	
	boolean isMutable();
	
	IType getType();
	
	IValue Add(Context context, IValue value) throws PromptoError;

	IValue Subtract(Context context, IValue iValue) throws PromptoError;

	IValue Multiply(Context context, IValue iValue) throws PromptoError;

	IValue Divide(Context context, IValue iValue) throws PromptoError;

	IValue IntDivide(Context context, IValue iValue) throws PromptoError;

	IValue Modulo(Context context, IValue iValue) throws PromptoError;

	IValue getMember(Context context, Identifier name) throws PromptoError;

	void setMember(Context context, Identifier name, IValue value) throws PromptoError;

	int CompareTo(Context context, IValue value) throws PromptoError;

	boolean Roughly(Context context, IValue value) throws PromptoError;
	
	ISliceable<IValue> asSliceable(Context context) throws PromptoError;

	Object ConvertTo(Class<?> type) throws PromptoError;

}
