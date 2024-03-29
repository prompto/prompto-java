package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.NotStorableError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.intrinsic.PromptoDbId;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.DbIdType;
import prompto.type.IType;

public class DbIdValue implements IValue {

	PromptoDbId dbId;

	public DbIdValue(PromptoDbId dbId) {
		this.dbId = dbId;
	}

	public void setDbId(PromptoDbId dbId) {
		this.dbId = dbId;
	}
	
	public PromptoDbId getDbId() {
		return dbId;
	}
	
	@Override
	public String toString() {
		return dbId.toString();
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
		try {
			Class<?> klass = dbId.getValue().getClass();
			if(Number.class.isAssignableFrom(klass))
				generator.writeNumber(dbId.toString());
			else
				generator.writeString(dbId.toString());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
	@Override
	public IType getType() {
		return DbIdType.instance();
	}

	@Override
	public void setType(IType type) {
		if(type!=DbIdType.instance())
			throw new RuntimeException("Should never get there!");
	}
	
	@Override
	public PromptoDbId getStorableData() throws NotStorableError {
		return dbId;
	}
	
	@Override
	public void collectStorables(Consumer<IStorable> collector) throws NotStorableError {
		// nothing to do
	}
	
	@Override
	public IValue toDocumentValue(Context context) {
		return new TextValue(this.toString());
	}

	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.textNode(this.toString());
	}

	@Override
	public Object toJavaValue(Context context, Type type) throws PromptoError {
		if(type==PromptoDbId.class || type==Object.class)
			return dbId;
		else
			return IValue.super.toJavaValue(context, type);
	}

	@Override
	public int hashCode() {
		return dbId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DbIdValue)
			return ((DbIdValue)obj).equals(this);
		else
			return dbId.toString().equals(obj.toString());
	}
	
	
	public boolean equals(DbIdValue obj) {
		return dbId.equals(obj.dbId);
	}

}
