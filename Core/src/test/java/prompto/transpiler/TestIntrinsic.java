package prompto.transpiler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.parser.e.BaseEParserTest;
import prompto.runtime.Context;

public class TestIntrinsic extends BaseEParserTest {

	@Test
	public void promptoIntrinsicModuleIsDeclared() throws Exception {
		String code = "define now as native method returning DateTime doing:\n" +
			"\tJavaScript: return DateTime.now(); from module: prompto/intrinsic/DateTime.js";
		DeclarationList decls = parseString(code);
		Context context = Context.newGlobalsContext();
		decls.register(context);
		IDeclaration decl = decls.getFirst();
		Transpiler transpiler = new Transpiler(new IJSEngine.DefaultJSEngine(), context);
		decl.declare(transpiler);
		assertTrue(transpiler.requires("DateTime"));
	}

	@Test
	public void promptoIntrinsicModuleIsNotTranspiled() throws Exception {
		String code = "define now as native method returning DateTime doing:\n" +
			"\tJavaScript: return DateTime.now(); from module: prompto/intrinsic/DateTime.js";
		DeclarationList decls = parseString(code);
		Context context = Context.newGlobalsContext();
		decls.register(context);
		IDeclaration decl = decls.getFirst();
		Transpiler transpiler = new Transpiler(new IJSEngine.DefaultJSEngine(), context);
		decl.transpile(transpiler);
		String transpiled = transpiler.toString();
		assertFalse(transpiled.contains("require"));
	}


}
