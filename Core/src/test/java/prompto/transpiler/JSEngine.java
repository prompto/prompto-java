package prompto.transpiler;

import java.io.FileOutputStream;
import java.io.OutputStream;

import prompto.declaration.IMethodDeclaration;
import prompto.grammar.Identifier;
import prompto.literal.DictLiteral;
import prompto.runtime.Context;
import prompto.runtime.MethodLocator;

public class JSEngine {

	public static void executeTests(Context context) {
		// TODO Auto-generated method stub
		
	}

	public static void executeMainNoArgs(Context context) throws Exception {
		IMethodDeclaration method = MethodLocator.locateMethod(context, new Identifier("main"), new DictLiteral(false));
		String js = Transpiler.transpileMethod(context, method);
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		// TODO Auto-generated method stub
		
	}

}
