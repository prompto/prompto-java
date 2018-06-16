package prompto.transpiler;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import jdk.nashorn.api.scripting.NashornScriptEngine;
import jdk.nashorn.api.scripting.ScriptObjectMirror;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.grammar.Identifier;
import prompto.literal.DictLiteral;
import prompto.runtime.Context;
import prompto.runtime.MethodLocator;
import prompto.utils.ResourceUtils;

import com.coveo.nashorn_modules.Folder;
import com.coveo.nashorn_modules.Require;

@SuppressWarnings("restriction")
public class Nashorn8Engine implements IJSEngine {

	public static void executeTests(Context context) throws Exception {
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		Collection<TestMethodDeclaration> tests = context.getTests();
		tests.forEach(test->test.declare(transpiler));
		Invocable invocable = transpile(transpiler);
		for(TestMethodDeclaration test : tests)
			invocable.invokeFunction(test.getTranspiledName());
	}
	
	public static void executeMainNoArgs(Context context) throws Exception {
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		IMethodDeclaration method = MethodLocator.locateMethod(context, new Identifier("main"), new DictLiteral(false));
		method.declare(transpiler);
		Invocable invocable = transpile(transpiler);
		invocable.invokeFunction("main$Text_dict");
	}
	
	private static Invocable transpile(Transpiler transpiler) throws Exception {
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		List<String> lines = Arrays.asList(
				js,
				"var require = function(value) { return Java.from(Java.type('" + Nashorn8Engine.class.getName() + "').require(value)); };",
				"var Set = Java.type('" + JSSet.class.getName() + "');",
				"var process = { stdout: { write: print } };"
				);
		js = lines.stream().collect(Collectors.joining("\n"));
		ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn");
		nashorn.eval(js);
		Object dataStore = nashorn.getBindings(ScriptContext.ENGINE_SCOPE).get("DataStore");
		if(dataStore instanceof ScriptObjectMirror)
			((ScriptObjectMirror)dataStore).setMember("instance", new MemStoreMirror(nashorn));
		Require.enable((NashornScriptEngine)nashorn, new ScriptsFolder());
		return (Invocable)nashorn;
	}

	static class ScriptsFolder implements Folder {

		@Override
		public String getFile(String name) {
			String path = Nashorn8Engine.class.getPackage().getName().replace('.', '/') + '/' + name;
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
	
	@Override
	public Iterable<String> getPolyfills() {
		return 	Arrays.asList("ObjectAssign", "ObjectIs", "StringRepeat", "StringIncludes", "ArrayFrom", "ArrayIncludes");
	}


	@Override
	public boolean supportsDestructuring() {
		return false;
	}
	
	@Override
	public boolean supportsClass() {
		return false;
	}
	
}
