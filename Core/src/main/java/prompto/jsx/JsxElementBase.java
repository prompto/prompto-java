package prompto.jsx;

import java.util.List;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.JsxType;
import prompto.utils.CodeWriter;

public abstract class JsxElementBase implements IJsxExpression {

	Identifier name;
	List<JsxAttribute> attributes;
	
	public JsxElementBase(Identifier name, List<JsxAttribute> attributes) {
		this.name = name;
		this.attributes = attributes;
	}

	@Override
	public IType check(Context context) {
		if(attributes!=null)
			attributes.forEach(attr->attr.check(context));
		return JsxType.instance();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		throw new UnsupportedOperationException("toDialect " + this.getClass().getName());
	}
	
	
}
