package prompto.remoting;

import java.io.IOException;
import java.lang.reflect.Type;
import java.security.InvalidParameterException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.ValueExpression;
import prompto.grammar.Argument;
import prompto.grammar.Identifier;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.store.DataStore;
import prompto.store.IStore;
import prompto.type.IType;
import prompto.utils.TypeUtils;
import prompto.value.IValue;
import prompto.value.NullValue;

public class RemoteArgument {

	public static RemoteArgument read(Context context, JsonNode jsonParam, Map<String, byte[]> parts) throws Exception {
		if(!jsonParam.isObject())
			throw new InvalidParameterException("Expecting a JSON object!");
		RemoteArgument remote = new RemoteArgument();
		JsonNode field = jsonParam.get("name");
		if(field==null)
			throw new InvalidParameterException("Expecting a 'name' field!");
		remote.setName(field.asText());
		// dbId type resolves to Any category, when it's actually a value, need a hack for this one
		if(IStore.dbIdName.equals(remote.getName()))
			remote.setType(TypeUtils.typeToIType(DataStore.getInstance().getNativeDbIdClass()));
		else {
			IType type;
			field = jsonParam.get("type");
			if(field!=null)
				type = IType.fromTypeName(context, field.asText());
			else {	
				AttributeDeclaration decl = context.findAttribute(remote.getName());
				if(decl==null)
					throw new InvalidParameterException("Expecting a 'type' field!");
				else
					type = decl.getType();
			}
			remote.setType(type.resolve(context, null));
		}
		field = jsonParam.get("value");
		if(field==null)
			throw new InvalidParameterException("Expecting a 'value' field!");
		if(field.isNull())
			remote.setValue(NullValue.instance());
		else
			remote.setValue(new ValueExpression(remote.getType(), remote.getType().readJSONValue(context, field, parts)));
		return remote;
	}


	private String name;
	private IType type;
	private IValue value;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IType getType() {
		return type;
	}

	public void setType(IType type) {
		this.type = type;
	}

	public IValue getValue() {
		return value;
	}

	public void setValue(IValue value) {
		this.value = value;
	}

	public Class<?> toJavaType(Context context, ClassLoader classLoader) {
		Type type = this.type.toJavaType(context);
		if(type instanceof Class<?>)
			return (Class<?>)type;
		else try {
			return classLoader.loadClass(type.getTypeName().replace('.', '/'));
		} catch(ClassNotFoundException e) {
			throw new InternalError(e);
		}
	}
	
	public Object toJavaValue(Context context) {
		return value.toJavaValue(context, Object.class);
	}
	
	public Argument toAssignment(Context context) {
		IParameter argument = new CategoryParameter(type, new Identifier(name));
		return new Argument(argument, new ValueExpression(type, value));
	}

	public void toJson(Context context, JsonGenerator generator) throws IOException, PromptoError {
		generator.writeStartObject();
		generator.writeStringField("name", name.toString());
		generator.writeStringField("type", type.toString());
		if(value==null)
			generator.writeNullField("value");
		else {
			generator.writeFieldName("value");
			value.toJsonStream(context, generator, true, null);
		}
		generator.writeEndObject();
	}


}
