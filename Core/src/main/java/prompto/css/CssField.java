package prompto.css;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.transpiler.Transpiler;
import prompto.type.TextType;
import prompto.utils.CodeWriter;

public class CssField {

	String name;
	ICssValue value;
	
	public CssField(String name, ICssValue value) {
		this.name = name;
		this.value = value;
	}

	public void toDialect(CodeWriter writer) {
		writer.append(name).append(":");
		value.toDialect(writer);
		writer.append(";");
	}
	
	public void toString(StringBuilder sb) {
		sb.append(name).append(": ");
		value.toString(sb);
		sb.append("; ");
	}
	
	public void toJson(ObjectNode result, boolean withType) {
		if(withType) {
			ObjectNode value = JsonNodeFactory.instance.objectNode();
			value.put("typeName", TextType.instance().toString());
			value.put("value", this.value.toString());
			result.set(name, value);
		} else
			result.put(name, value.toString());
	}


	public void declare(Transpiler transpiler) {
		value.declare(transpiler);
	}

	public void transpile(Transpiler transpiler) {
		transpiler.append("'").append(name).append("':");
		value.transpile(transpiler);
	}


}
