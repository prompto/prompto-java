package prompto.css;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.transpiler.Transpiler;
import prompto.type.TextType;
import prompto.utils.CodeWriter;

public class CssField {

	String name;
	List<ICssValue> values;
	
	public CssField(String name, List<ICssValue> values) {
		this.name = name;
		this.values = values;
	}
	
	public String getName() {
		return name;
	}

	public void toDialect(CodeWriter writer) {
		writer.append(name).append(": ");
		values.forEach(v -> v.toDialect(writer));
		writer.append(";");
	}
	
	@Override
	public String toString() {
		return name + ": "  + this.valuesToString();
	}
	
	private String valuesToString() {
		return values.stream().map(ICssValue::toString).collect(Collectors.joining(""));
	}
	
	public void toJson(ObjectNode result, boolean withType) {
		if(withType) {
			ObjectNode value = JsonNodeFactory.instance.objectNode();
			value.put("typeName", TextType.instance().toString());
			value.put("value", this.valuesToString());
			result.set(name, value);
		} else
			result.put(name, valuesToString());
	}


	public void declare(Transpiler transpiler) {
		values.forEach(v -> v.declare(transpiler));
	}

	public void transpile(Transpiler transpiler) {
		transpiler.append("'").append(name).append("':");
		if(values.size()==1)
			values.get(0).transpile(transpiler);
		else {
			transpiler.append("\"\" + ");
			values.forEach(v -> {
				v.transpile(transpiler);
				transpiler.append(" + ");
			});
			transpiler.trimLast(" + ".length());
		}
		
	}


}
