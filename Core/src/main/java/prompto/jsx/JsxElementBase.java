package prompto.jsx;

import java.util.List;

import prompto.declaration.IDeclaration;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.JsxType;
import prompto.utils.CodeWriter;

public abstract class JsxElementBase implements IJsxExpression {

	Identifier id;
	List<JsxAttribute> attributes;
	
	public JsxElementBase(Identifier id, List<JsxAttribute> attributes) {
		this.id = id;
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
	
	@Override
	public void declare(Transpiler transpiler) {
		if(Character.isUpperCase(id.toString().charAt(0))) {
			IDeclaration decl = transpiler.getContext().getRegisteredDeclaration(IDeclaration.class, id);
			decl.declare(transpiler);
		}
		if(this.attributes!=null)
			this.attributes.forEach(attr -> attr.declare(transpiler));
		this.declareChildren(transpiler);
	}
	
	public void declareChildren(Transpiler transpiler) {
		// nothing to do
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		// TODO call htmlEngine
	    transpiler.append("React.createElement(");
	    if (Character.isUpperCase(this.id.toString().charAt(0)))
	        transpiler.append(this.id.toString());
	    else
	        transpiler.append('"').append(this.id.toString()).append('"');
	    transpiler.append(", ");
	    if(this.attributes==null || this.attributes.isEmpty())
	        transpiler.append("null");
	    else {
	        transpiler.append("{");
	        this.attributes.forEach(attr -> {
	            attr.transpile(transpiler);
	            transpiler.append(", ");
	        });
	        transpiler.trimLast(2).append("}");
	    }
	    this.transpileChildren(transpiler);
	    transpiler.append(")");
	    return false;
	}
	
	public void transpileChildren(Transpiler transpiler) {
		// nothing to do
	}
}
