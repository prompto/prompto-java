package prompto.jsx;

import java.util.List;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.grammar.Identifier;
import prompto.grammar.Structure;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.JsxType;

public abstract class JsxElementBase extends Section implements IJsxExpression {

	Identifier id;
	List<JsxProperty> properties;
	
	public JsxElementBase(Identifier id, List<JsxProperty> attributes) {
		this.id = id;
		this.properties = attributes;
	}

	@Override
	public IType check(Context context) {
		Structure propertyTypes = null;
		if(Character.isUpperCase(id.toString().charAt(0))) {
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, id);
			if(decl==null)
				context.getProblemListener().reportUnknownIdentifier(id, id.toString());
			else if(decl instanceof CategoryDeclaration && ((CategoryDeclaration)decl).isAWidget(context))
				propertyTypes = ((CategoryDeclaration)decl).asWidget().getPropertyTypes();
		} else
			propertyTypes = getHtmlPropertyTypes(id.toString());
		checkProperties(context, propertyTypes);
		return JsxType.instance();
	}
	
	private void checkProperties(Context context, Structure propertyTypes) {
		if(properties==null)
			return;
		properties.forEach(prop->{
			IType actual = prop.check(context);
			if(propertyTypes!=null) {
				IType expected = propertyTypes.get(prop.getName());
				if(expected==null)
					context.getProblemListener().reportUnknownProperty(prop, prop.getName());
				else if(!expected.isAssignableFrom(context, actual))
					context.getProblemListener().reportIllegalAssignment(prop, expected, actual);
			}
		});
	}

	private Structure getHtmlPropertyTypes(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void declare(Transpiler transpiler) {
		if(Character.isUpperCase(id.toString().charAt(0))) {
			IDeclaration decl = transpiler.getContext().getRegisteredDeclaration(IDeclaration.class, id);
			if(decl==null)
				transpiler.getContext().getProblemListener().reportUnknownIdentifier(id, id.toString());
			else
				decl.declare(transpiler);
		}
		if(this.properties!=null)
			this.properties.forEach(attr -> attr.declare(transpiler));
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
	    if(this.properties==null || this.properties.isEmpty())
	        transpiler.append("null");
	    else {
	        transpiler.append("{");
	        this.properties.forEach(attr -> {
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
