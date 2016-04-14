package prompto.value;

import prompto.error.NotStorableError;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;

import com.fasterxml.jackson.core.JsonGenerator;

/** IValue is a wrapper around intrinsic or primitive values 
 * which helps expose an API for the interpreter 
 */
public interface IValue {
	
	@SuppressWarnings("unchecked")
	public static int compareValues(IValue v1, IValue v2) {
		if(v1==null && v2==null)
			return 0;
		else if(v1==null)
			return -1;
		else if(v2==null)
			return 1;
		else if(v1 instanceof Comparable)
			return ((Comparable<Object>)v1).compareTo(v2);
		else
			return v1.toString().compareTo(v2.toString());
	}
	
	 // the underlying primitive/intrinsic data
	default Object getStorableData() throws NotStorableError {
		throw new UnsupportedOperationException("getStorableData not supported by " + this.getClass().getSimpleName());
	};
	
	default IType getType() {
		throw new UnsupportedOperationException("getType not supported by " + this.getClass().getSimpleName());
	};
	
	default boolean isMutable() {
		throw new UnsupportedOperationException("isMutable not supported by " + this.getClass().getSimpleName());
	}
	
	default IValue plus(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("plus not supported by " + this.getClass().getSimpleName());
	}

	default public IValue minus(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("minus not supported by " + this.getClass().getSimpleName());
	}

	default IValue multiply(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("multiply not supported by " + this.getClass().getSimpleName());
	}

	default IValue divide(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("divide not supported by " + this.getClass().getSimpleName());
	}

	default IValue intDivide(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("intDivide not supported by " + this.getClass().getSimpleName());
	}

	default IValue modulo(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("modulo not supported by " + this.getClass().getSimpleName());
	}

	default int compareTo(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("compareTo not supported by " + this.getClass().getSimpleName());
	}

	default void setMember(Context context, Identifier name, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("No member support for " + this.getClass().getSimpleName());
	}

	default IValue getMember(Context context, Identifier name, boolean autoCreate) throws PromptoError {
		throw new UnsupportedOperationException("No member support for " + this.getClass().getSimpleName());
	}

	default boolean roughly(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("roughly not supported by " + this.getClass().getSimpleName());
	};
	
	default ISliceable<IValue> asSliceable(Context context) throws PromptoError {
		throw new UnsupportedOperationException("asSliceable not supported by " + this.getClass().getSimpleName());
	};

	default Object convertTo(Class<?> type) throws PromptoError {
		throw new UnsupportedOperationException("convertTo not supported by " + this.getClass().getSimpleName());
	};

	default void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		throw new UnsupportedOperationException("toJson not supported by " + this.getClass().getSimpleName());
	};

	
}
