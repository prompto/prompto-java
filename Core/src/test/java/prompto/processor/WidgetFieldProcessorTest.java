package prompto.processor;

import org.junit.Test;

import prompto.declaration.IDeclaration;
import prompto.grammar.Identifier;
import prompto.parser.o.BaseOParserTest;
import prompto.transpiler.Nashorn8Engine;
import prompto.transpiler.Transpiler;

public class WidgetFieldProcessorTest extends BaseOParserTest {

	@Test
	public void transpilesWidgetField() throws Exception {
		loadResource("annotations/WidgetField.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
	}
}
