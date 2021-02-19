package prompto.transpiler;

import org.junit.Test;

import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.parser.o.BaseOParserTest;

public class TestProblems extends BaseOParserTest{

	@Test
	public void transpilesAttributeCallback() throws Exception {
		DeclarationList decls = parseResource("problems/attributeCallback.poc");
		decls.register(context);
		decls.check(context);
		IDeclaration decl = decls.getLast();
		Transpiler transpiler = new Transpiler(new IJSEngine.DefaultJSEngine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
	}
}
