package prompto.processor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.junit.Test;

import prompto.declaration.IDeclaration;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.parser.o.BaseOParserTest;
import prompto.problem.ProblemListener;
import prompto.transpiler.Nashorn8Engine;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.Instance;

public class WidgetPropertiesProcessorTest extends BaseOParserTest {

	@Test
	public void transpiles() throws Exception {
		loadResource("annotations/WidgetProps1.poc");
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
		Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
		decl.declare(transpiler);
		decl.transpile(transpiler);
		String js = transpiler.toString();
		try(OutputStream output = new FileOutputStream("transpiled.js")) {
			output.write(js.getBytes());
		}
		assertTrue(js.contains("some stuff"));
	}
	
	@Test
	public void transpilesWithWarnings() throws Exception {
		Instance<String> warning = new Instance<>();
		context.setProblemListener(new ProblemListener() {
			@Override
			public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
				warning.set("invalid");
			}
		});
		try {
			loadResource("annotations/WidgetProps2.poc");
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, new Identifier("Container"));
			Transpiler transpiler = new Transpiler(new Nashorn8Engine(), context);
			decl.declare(transpiler);
			decl.transpile(transpiler);
			String js = transpiler.toString();
			try(OutputStream output = new FileOutputStream("transpiled.js")) {
				output.write(js.getBytes());
			}
			assertTrue(js.contains("123.54"));
		} finally {
			assertNotNull(warning.get());
			assertTrue(warning.get().contains("invalid"));
		}
	}

}
