package prompto.jsx;

import prompto.property.Property;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.TextType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;

public class JsxLiteral implements IJsxValue {

	String text;
	
	public JsxLiteral(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	@Override
	public boolean isLiteral() {
		return true;
	}
	
	@Override
	public IType check(Context context) {
		return TextType.instance();
	}
	
	@Override
	public IType checkProto(Context context, MethodType expected) {
		return VoidType.instance();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}
	
	@Override
	public void declare(Transpiler transpiler, Property property) {
		// nothing to do
	}

	@Override
	public boolean transpile(Transpiler transpiler, Property property) {
		transpiler.append(this.text);
		return false;
	}
}
