package prompto.declaration;

import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.NativeCategoryBindingList;
import prompto.javascript.JavaScriptNativeCategoryBinding;
import prompto.property.PropertyMap;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class NativeWidgetDeclaration extends NativeCategoryDeclaration implements IWidgetDeclaration {
	
	PropertyMap properties;
	
	public NativeWidgetDeclaration(Identifier id, NativeCategoryBindingList categoryBindings, MethodDeclarationList methods) {
		super(id, null, categoryBindings, null, methods);
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
		writer.append("native widget");
	}
	
	@Override
	protected void categoryTypeToODialect(CodeWriter writer) {
		writer.append("native widget");
	}
	
	@Override
	protected void categoryTypeToMDialect(CodeWriter writer) {
		writer.append("native widget");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		processAnnotations(transpiler.getContext(), true);
		super.declare(transpiler);
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		JavaScriptNativeCategoryBinding binding = this.getJavaScriptBinding();
	    binding.transpileWidget(transpiler, getName());
	    return true;
	}


	
}
