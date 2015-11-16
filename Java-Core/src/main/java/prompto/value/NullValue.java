package prompto.value;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.NullType;


public class NullValue extends BaseValue {

	static NullValue instance = new NullValue();
	
	public static NullValue instance() {
		return instance;
	}
	
	private NullValue() {
		super(NullType.instance());
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeNull();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}


}
