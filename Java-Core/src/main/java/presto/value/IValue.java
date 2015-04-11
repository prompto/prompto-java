package presto.value;

import presto.error.PrestoError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.IType;

public interface IValue {
	
	IType getType();
	
	IValue Add(Context context, IValue value) throws PrestoError;

	IValue Subtract(Context context, IValue iValue) throws PrestoError;

	IValue Multiply(Context context, IValue iValue) throws PrestoError;

	IValue Divide(Context context, IValue iValue) throws PrestoError;

	IValue IntDivide(Context context, IValue iValue) throws PrestoError;

	IValue Modulo(Context context, IValue iValue) throws PrestoError;

	IValue getMember(Context context, Identifier name) throws PrestoError;

	int CompareTo(Context context, IValue value) throws PrestoError;

	boolean Roughly(Context context, IValue value) throws PrestoError;
	
	ISliceable<IValue> asSliceable(Context context) throws PrestoError;

	Object ConvertTo(Class<?> type) throws PrestoError;

}
