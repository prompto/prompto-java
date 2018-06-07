package prompto.transpiler;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

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
		String js = Transpiler.transpileMethod(context, method, "ObjectAssign");
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		List<String> lines = Arrays.asList(
				js,
				"Array.from = function(values) { return Java.from(Java.type('prompto.transpiler.JSArray').from(values)); };",
				"var Set = Java.type('prompto.transpiler.JSSet');",
				"var process = { stdout: { write: print } };",
				"var method = main$Text_dict;"
				);
		js = lines.stream().collect(Collectors.joining("\n"));
		ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn");
		nashorn.eval(js);
		((Invocable)nashorn).invokeFunction("method");
	}
	

}
