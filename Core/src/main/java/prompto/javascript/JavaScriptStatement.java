package prompto.javascript;

import prompto.declaration.IMethodDeclaration;
import prompto.statement.MethodCall;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;


public class JavaScriptStatement {

	JavaScriptExpression expression;
	JavaScriptModule module;
	boolean isReturn;
	
	public JavaScriptStatement(JavaScriptExpression expression,boolean isReturn) {
		this.expression = expression;
		this.isReturn = isReturn;
	}

	public void setModule(JavaScriptModule module) {
		this.module = module;
	}
	
	@Override
	public String toString() {
		return "" + (isReturn ? "return " : "") + expression.toString() + ";";
	}

	public void toDialect(CodeWriter writer) {
		if(isReturn)
			writer.append("return ");
		expression.toDialect(writer);
		writer.append(';');
		if(module!=null)
			module.toDialect(writer);
	}

	public void declare(Transpiler transpiler) {
		if(this.module!=null)
			this.module.declare(transpiler);
		this.expression.declare(transpiler);
	}

	public boolean transpile(Transpiler transpiler) {
	    if(this.module!=null && !this.module.isPromptoIntrinsic()) {
	    	transpiler.append("var ");
	    	expression.transpileRoot(transpiler);
	    	if(transpiler.getEngine().isTestEngine()) {
		    	transpiler.append(" = require('");
		        this.module.transpile(transpiler);
		        transpiler.append("').");
	    	} else { 
		    	transpiler.append(" = require('/");
		        this.module.transpile(transpiler);
		        transpiler.append("', null, null, function(m) { return {id: m, uri: m}; }).");
	    	}
	    	expression.transpileRoot(transpiler);
	        transpiler.append(";").newLine();
	    }
	    if(this.isReturn)
	        transpiler.append("return ");
	    this.expression.transpile(transpiler);
	    return false;
	}

	public void transpileInlineMethodCall(Transpiler transpiler, IMethodDeclaration declaration, MethodCall methodCall) {
	    this.expression.transpileInlineMethodCall(transpiler, declaration, methodCall);
	}
	
	
}
