package prompto.type;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDocument;
import prompto.runtime.Context;
import prompto.value.Document;
import prompto.value.IValue;
import prompto.value.NullValue;

import com.fasterxml.jackson.databind.JsonNode;

public class DocumentType extends NativeType {
	
	static DocumentType instance = new DocumentType();
	
	public static DocumentType instance() {
		return instance;
	}
	
	private DocumentType() {
		super(Family.DOCUMENT);
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoDocument.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DocumentType) || (other instanceof AnyType);
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) {
		return AnyType.instance();
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		Document instance = new Document();
		Iterator<Map.Entry<String, JsonNode>> fields = value.fields();
		while(fields.hasNext()) {
			Map.Entry<String, JsonNode> field = fields.next();
			IValue item = readJSONField(context, field.getValue(), parts);
			instance.setMember(new Identifier(field.getKey()), item);
		}
		return instance;
	}

	private IValue readJSONField(Context context, JsonNode fieldData, Map<String, byte[]> parts) throws PromptoError {
		if(fieldData==null || fieldData.isNull())
			return NullValue.instance();
		else if(fieldData.isBoolean())
			return prompto.value.Boolean.valueOf(fieldData.asBoolean());
		else if(fieldData.isInt() || fieldData.isLong())
			return new prompto.value.Integer(fieldData.asLong());
		else if(fieldData.isFloat() || fieldData.isDouble())
			return new prompto.value.Decimal(fieldData.asDouble());
		else if(fieldData.isTextual())
			return new prompto.value.Text(fieldData.asText());
		else if(fieldData.isArray()) {
			throw new UnsupportedOperationException();
		} else if(fieldData.isObject()) {
			throw new UnsupportedOperationException();
		} else
			throw new UnsupportedOperationException();
	}
		
}
