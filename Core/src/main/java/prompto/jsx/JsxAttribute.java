package prompto.jsx;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class JsxAttribute {

	Identifier id;
	IJsxValue value;
	
	
	public JsxAttribute(Identifier id, IJsxValue value) {
		this.id = id;
		this.value = value;
	}


	public void check(Context context) {
		if(value!=null)
			value.check(context);
	}


	public void toDialect(CodeWriter writer) {
		writer.append(" ").append(id.toString());
		if(value!=null) {
			writer.append("=");
			value.toDialect(writer);
		}
	}


	public void declare(Transpiler transpiler) {
	    if(this.value!=null)
	        this.value.declare(transpiler);
	}


	public void transpile(Transpiler transpiler) {
	    transpiler.append(this.id.toString());
	    transpiler.append(": ");
	    if(this.value!=null)
	        this.value.transpile(transpiler);
	    else
	        transpiler.append("true");
	}


}
