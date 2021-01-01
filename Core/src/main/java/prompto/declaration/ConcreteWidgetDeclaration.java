package prompto.declaration;

import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.property.PropertyMap;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

public class ConcreteWidgetDeclaration extends ConcreteCategoryDeclaration implements IWidgetDeclaration {

	PropertyMap properties;
	
	public ConcreteWidgetDeclaration(Identifier name, Identifier derivedFrom, MethodDeclarationList methods) {
		super(name, null, derivedFrom==null ? null: new IdentifierList(derivedFrom), methods);
	}
	
	
	@Override
	public boolean isAWidget(Context context) {
		return true;
	}

	@Override
	public IWidgetDeclaration asWidget() {
		return this;
	}

	@Override
	public void setProperties(PropertyMap properties) {
		this.properties = properties;
	}
	
	@Override
	public PropertyMap getProperties() {
		return properties;
	}

	@Override
	protected void categoryTypeToEDialect(CodeWriter writer) {
		if(derivedFrom==null)
			writer.append("widget");
		else
			derivedFrom.toDialect(writer, true);
	}
	
	@Override
	protected void categoryTypeToODialect(CodeWriter writer) {
		writer.append("widget");
	}
	
	@Override
	protected void categoryTypeToMDialect(CodeWriter writer) {
		writer.append("widget");
	}
	
	@Override
	protected void declareRoot(Transpiler transpiler) {
		// nothing to do
	}

	@Override
	public void declare(Transpiler transpiler) {
		registerMethods(transpiler.getContext());
		super.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    Identifier parent = this.derivedFrom!=null && this.derivedFrom.size()>0 ? this.derivedFrom.get(0) : null;
	    transpiler.append("function ").append(this.getName()).append("(props) {")
	    	.indent();
	    transpileGetterSetterAttributes(transpiler);
	    transpileSuperConstructor(transpiler, parent);
	    transpileLocalAttributes(transpiler);
	    if(hasMethod(transpiler.getContext(), new Identifier("getInitialState")))
	    	transpiler.append("this.state = this.state || this.getInitialState();").newLine();
	    else
	    	transpiler.append("this.state = this.state || {};").newLine();
	    transpiler.append("return this;")
	    	.dedent()
	    	.append("}")
	    	.newLine();
	    if(parent!=null)
	        transpiler.append(this.getName()).append(".prototype = Object.create(").append(parent.toString()).append(".prototype);").newLine();
	    else
	        transpiler.append(this.getName()).append(".prototype = Object.create(React.Component.prototype);").newLine();
	    transpiler.append(this.getName()).append(".prototype.constructor = ").append(this.getName()).append(";").newLine();
	    transpiler = transpiler.newInstanceTranspiler(new CategoryType(this.getId()));
		this.transpileLoaders(transpiler);
	    this.transpileMethods(transpiler);
	    this.transpileGetterSetters(transpiler);
	    transpiler.flush();
	    return true;
	}
	
	@Override
	protected void transpileSuperConstructor(Transpiler transpiler) {
	    Identifier parent = this.derivedFrom!=null && this.derivedFrom.size()>0 ? this.derivedFrom.get(0) : null;
	    transpileSuperConstructor(transpiler, parent);
	}


	private void transpileSuperConstructor(Transpiler transpiler, Identifier parent) {
	    if (parent!=null)
	    	transpiler.append(parent.toString()).append(".call(this, props);").newLine();
	    else
	    	transpiler.append("React.Component.call(this, props);").newLine();
	}

}
