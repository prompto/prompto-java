package prompto.type;

import java.lang.reflect.Type;

import prompto.grammar.Identifier;
import prompto.property.Property;
import prompto.property.PropertyMap;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

/* transient type for holding child property structure */
public class PropertiesType extends BaseType {

	PropertyMap properties;
	
	public PropertiesType(PropertyMap properties) {
		super(Family.PROPERTIES);
		this.properties = properties;
	}
	
	public PropertyMap getProperties() {
		return properties;
	}

	@Override
	public Type getJavaType(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void checkUnique(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void checkExists(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		if(other instanceof DocumentType)
			return true;
		else
			return super.isAssignableFrom(context, other);
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) {
		Property prop = properties.get(name.toString());
		return prop!=null ? prop.getValidator().getType(context) : super.checkMember(context, name);
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
		Property prop = properties.get(name.toString());
		if(prop==null)
			super.declareMember(transpiler, name);
		else
			prop.getValidator().getType(transpiler.getContext()).declare(transpiler);
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
	    if ("text".equals(name.toString())) {
	        transpiler.append("getText()");
	    } else {
	        transpiler.append(name);
	    }
	}
	
}
