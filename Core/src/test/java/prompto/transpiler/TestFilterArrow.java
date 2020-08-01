package prompto.transpiler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.parser.o.BaseOParserTest;
import prompto.runtime.Context;
import prompto.utils.ResourceUtils;

public class TestFilterArrow extends BaseOParserTest {

	@Test
	public void promptoIntrinsicModuleIsDeclared() throws Exception {
		String code = ResourceUtils.getResourceAsString("samples/filterArrow.poc");
		DeclarationList decls = parseString(code);
		Context context = Context.newGlobalsContext();
		decls.register(context);
		IDeclaration decl = decls.getFirst();
		Transpiler transpiler = new Transpiler(new IJSEngine.DefaultJSEngine(), context);
		decl.declare(transpiler);
		String transpiled = transpiler.toString();
		assertTrue(transpiled.contains("}).bind(this)"));
	}
}