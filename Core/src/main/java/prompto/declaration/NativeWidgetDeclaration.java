package prompto.declaration;

import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.NativeCategoryBindingList;
import prompto.javascript.JavaScriptNativeCategoryBinding;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class NativeWidgetDeclaration extends NativeCategoryDeclaration implements IWidgetDeclaration {
	
	public NativeWidgetDeclaration(Identifier name, NativeCategoryBindingList categoryBindings, MethodDeclarationList methods) {
		super(name, null, categoryBindings, null, methods);
	}

	protected void categoryTypeToEDialect(CodeWriter writer) {
		writer.append("native widget");
	}
	
	protected void categoryTypeToODialect(CodeWriter writer) {
		writer.append("native widget");
	}
	
	@Override
	protected void categoryTypeToMDialect(CodeWriter writer) {
		writer.append("native widget");
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		JavaScriptNativeCategoryBinding binding = this.getJavaScriptBinding();
	    binding.transpileWidget(transpiler);
	    return true;
	}


	
}
