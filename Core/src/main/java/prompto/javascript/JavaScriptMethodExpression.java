package prompto.javascript;

import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Argument;
import prompto.grammar.Identifier;
import prompto.param.IParameter;
import prompto.statement.MethodCall;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class JavaScriptMethodExpression extends JavaScriptSelectorExpression {

	String name;
	JavaScriptExpressionList arguments = new JavaScriptExpressionList();
	
	public JavaScriptMethodExpression(String name) {
		this.name = name;
	}

	public void setArguments(JavaScriptExpressionList arguments) {
		this.arguments = arguments!=null ? arguments : new JavaScriptExpressionList();
	}

	@Override
	public String toString() {
		if(parent!=null)
			return parent.toString() + "." + name + "(" + arguments.toString() + ")";
		else
			return name + "(" + arguments.toString() + ")";
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(parent!=null) {
			parent.toDialect(writer);
			writer.append('.');
		}
		writer.append(name);
		writer.append('(');
		if(arguments!=null)
			arguments.toDialect(writer);
		writer.append(')');
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		if(parent!=null) {
			parent.transpile(transpiler);
			transpiler.append('.');
		}
		transpiler.append(name).append('(');
		transpileArguments(transpiler);
		transpiler.append(')');
	}
	
	private void transpileArguments(Transpiler transpiler) {
		if(arguments!=null) 
			arguments.transpile(transpiler);
	}

	@Override
	public void transpileRoot(Transpiler transpiler) {
		if(parent!=null)
			parent.transpileRoot(transpiler);
		else
			transpiler.append(name);
	}
	
	@Override
	public void transpileInlineMethodCall(Transpiler transpiler, IMethodDeclaration declaration, MethodCall methodCall) {
		if(parent!=null) {
			parent.transpileInlineMethodCall(transpiler, declaration, methodCall);
			transpiler.append('.');
		}
		transpiler.append(name).append("(");
		transpileInlineArguments(transpiler, declaration, methodCall);
		transpiler.append(")");
	}

	private void transpileInlineArguments(Transpiler transpiler, IMethodDeclaration declaration, MethodCall methodCall) {
		if(arguments!=null && arguments.size()>0) {
			arguments.forEach(exp -> {
				transpileInlineArgument(transpiler, exp, declaration, methodCall);
				transpiler.append(", ");
			});
			transpiler.trimLast(", ".length());
		}
	}

	private void transpileInlineArgument(Transpiler transpiler, JavaScriptExpression exp, IMethodDeclaration declaration, MethodCall methodCall) {
		// special case for arguments receiving method references and arrow expressions
		if(exp instanceof JavaScriptIdentifierExpression && ((JavaScriptIdentifierExpression)exp).getParent()==null) {
			Identifier id = new Identifier(exp.toString());
			Argument argument = methodCall.getArguments().find(id);
			if(argument==null && declaration.getParameters().size()==1)
				argument = methodCall.getArguments().get(0);
			if(argument!=null) try {
				IParameter parameter = argument.getParameter();
				if(parameter==null && declaration.getParameters().size()==1)
					parameter = declaration.getParameters().get(0);
				parameter = declaration.getParameters().find(parameter.getId());
	            IExpression expression = argument.getExpression();
	            parameter.transpileCall(transpiler, expression);
	            return;
			} catch(SyntaxError error) {
				// nothing to do
			}
		}
		// default behaviour
		exp.transpile(transpiler);
	}
	
}
