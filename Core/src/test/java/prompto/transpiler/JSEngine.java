package prompto.transpiler;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import jdk.nashorn.api.scripting.NashornScriptEngine;
import prompto.declaration.IMethodDeclaration;
import prompto.grammar.Identifier;
import prompto.literal.DictLiteral;
import prompto.runtime.Context;
import prompto.runtime.MethodLocator;
import prompto.utils.ResourceUtils;

import com.coveo.nashorn_modules.Folder;
import com.coveo.nashorn_modules.Require;

@SuppressWarnings("restriction")
public class JSEngine {

	public static void executeTests(Context context) {
		// TODO Auto-generated method stub
		
	}
	
	public static void executeMainNoArgs(Context context) throws Exception {
		IMethodDeclaration method = MethodLocator.locateMethod(context, new Identifier("main"), new DictLiteral(false));
		String js = Transpiler.transpileMethod(context, method, "ObjectAssign", "ObjectIs", "StringRepeat", "StringIncludes", "ArrayFrom", "ArrayIncludes");
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		List<String> lines = Arrays.asList(
				js,
				"var require = function(value) { return Java.from(Java.type('prompto.transpiler.JSEngine').require(value)); };",
				"var Set = Java.type('prompto.transpiler.JSSet');",
				"var process = { stdout: { write: print } };",
				"var method = main$Text_dict;"
				);
		js = lines.stream().collect(Collectors.joining("\n"));
		ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn");
		nashorn.eval(js);
		Require.enable((NashornScriptEngine)nashorn, new ScriptsFolder());
		((Invocable)nashorn).invokeFunction("method");
	}
	
	static class ScriptsFolder implements Folder {

		@Override
		public String getFile(String name) {
			String path = JSEngine.class.getPackage().getName().replace('.', '/') + '/' + name;
			try {
				return ResourceUtils.getResourceAsString(path);
			} catch(Throwable t) {
				return null;
			}
		}

		@Override
		public Folder getFolder(String name) {
			if("node_modules".equals(name))
				return this;
			else
				return null;
		}

		@Override
		public Folder getParent() {
			return null;
		}

		@Override
		public String getPath() {
			return "";
		}
	
	}
	

}
