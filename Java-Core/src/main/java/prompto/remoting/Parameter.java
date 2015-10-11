package prompto.remoting;

import java.io.IOException;
import java.security.InvalidParameterException;

import prompto.error.PromptoError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.CategoryArgument;
import prompto.grammar.IArgument;
import prompto.grammar.Identifier;
import prompto.parser.ECleverParser;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.value.ExpressionValue;
import prompto.value.IValue;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parameter {

	public static ParameterList readList(Context context, String jsonParams) throws Exception {
		JsonParser parser = new ObjectMapper().getFactory().createParser(jsonParams);
		JsonNode params = parser.readValueAsTree();
		return readParams(context, params);
	}

	private static ParameterList readParams(Context context, JsonNode jsonParams) throws Exception {
		if(!jsonParams.isArray())
			throw new InvalidParameterException("Expecting a JSON array!");
		ParameterList params = new ParameterList();
		for(JsonNode node : jsonParams)
			params.add(readParam(context, node));
		return params;
	}

	private static Parameter readParam(Context context, JsonNode jsonParam) throws Exception {
		if(!jsonParam.isObject())
			throw new InvalidParameterException("Expecting a JSON object!");
		Parameter param = new Parameter();
		JsonNode field = jsonParam.get("name");
		if(field==null)
			throw new InvalidParameterException("Expecting a 'name' field!");
		param.setName(field.asText());
		field = jsonParam.get("type");
		if(field==null)
			throw new InvalidParameterException("Expecting a 'type' field!");
		param.setType(getType(context, field.asText()));
		field = jsonParam.get("value");
		if(field==null)
			throw new InvalidParameterException("Expecting a 'value' field!");
		param.setValue(new ExpressionValue(param.getType(), param.getType().readJSONValue(field)));
		return param;
	}

	private static IType getType(Context context, String typeName) throws Exception {
		if(Character.isUpperCase(typeName.charAt(0)))
			return new ECleverParser(typeName).parse_standalone_type();
		else
			return context.findAttribute(typeName).getType();
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

	public ArgumentAssignment toAssignment(Context context) {
		IArgument argument = new CategoryArgument(type, new Identifier(name));
		return new ArgumentAssignment(argument, new ExpressionValue(type, value));
	}

	public void toJson(Context context, JsonGenerator generator) throws IOException, PromptoError {
		generator.writeStartObject();
		generator.writeStringField("name", name.toString());
		generator.writeStringField("type", type.toString());
		if(value==null)
			generator.writeNullField("value");
		else {
			generator.writeFieldName("value");
			value.toJson(context, generator);
		}
		generator.writeEndObject();
	}
}
