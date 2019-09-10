package prompto.jsx;

import java.util.List;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.property.Property;
import prompto.property.PropertyMap;
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
		PropertyMap propertyMap = null;
		if(Character.isUpperCase(id.toString().charAt(0))) {
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, id);
			if(decl==null)
				context.getProblemListener().reportUnknownIdentifier(id, id.toString());
			else if(decl instanceof CategoryDeclaration && ((CategoryDeclaration)decl).isAWidget(context))
				propertyMap = ((CategoryDeclaration)decl).asWidget().getProperties();
		} else
			propertyMap = getHtmlPropertyTypes(id.toString());
		checkProperties(context, propertyMap);
		return JsxType.instance();
	}
	
	private void checkProperties(Context context, PropertyMap propertyMap) {
		if(properties==null)
			return;
		properties.forEach(prop->{
			prop.check(context);
			if(propertyMap!=null) {
				Property declared = propertyMap.get(prop.getName());
				if(declared==null)
					context.getProblemListener().reportUnknownProperty(prop, prop.getName());
				else
					declared.validate(context, prop);
			}
		});
	}

	private PropertyMap getHtmlPropertyTypes(String string) {
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
