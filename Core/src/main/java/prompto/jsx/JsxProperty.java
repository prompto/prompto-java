package prompto.jsx;

import java.util.HashMap;
import java.util.Map;

import prompto.grammar.Identifier;
import prompto.parser.CodeSection;
import prompto.property.Property;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;

public class JsxProperty extends CodeSection {

	Identifier id;
	IJsxValue value;
	String suite;
	
	public JsxProperty(Identifier id, IJsxValue value, String suite) {
		this.id = id;
		this.value = value;
		this.suite = (suite!=null && !suite.isEmpty()) ? suite : null;
	}
	
	public Identifier getId() {
		return id;
	}

	public String getName() {
		return id.toString();
	}
	
	public IJsxValue getValue() {
		return value;
	}

	@Override
	public String toString() {
		return id.toString() + (value==null ? "" : "=" + value.toString());
	}
	
	
	public IType check(Context context) {
		if(value!=null)
			return value.check(context);
		else
			return BooleanType.instance(); // a value-less property is treated as a boolean flag
	}
	
	
	public IType checkProto(Context context, MethodType type) {
		if(value!=null)
			return value.checkProto(context, type);
		else
			return VoidType.instance();
	}



	public void toDialect(CodeWriter writer) {
		writer.append(id.toString());
		if(value!=null) {
			writer.append("=");
			value.toDialect(writer);
		}
		if(suite!=null)
			writer.appendRaw(suite);
		else
			writer.append(" ");
	}


	public void declare(Transpiler transpiler, Property property) {
	    if(this.value!=null)
	        this.value.declare(transpiler, property);
	}
	
	private static Map<String, String> REACT_REPLACEMENTS = getReactReplacements();
	
	private static Map<String, String> getReactReplacements() {
		Map<String, String> result = new HashMap<>();
		result.put("class", "className");
		result.put("for", "htmlFor");
		result.put("readonly", "readOnly");
		return result;
	}

	public void transpile(Transpiler transpiler, Property property) {
		String name = this.id.toString();
		name = REACT_REPLACEMENTS.getOrDefault(name, name);
		if(name.contains("-"))
			name = "\"" + name + "\"";
	    transpiler.append(name);
	    transpiler.append(": ");
	    if(this.value!=null)
	        this.value.transpile(transpiler, property);
	    else
	        transpiler.append("true");
	}


}
