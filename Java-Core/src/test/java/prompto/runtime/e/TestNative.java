package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestNative extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedAnyId() throws Exception {
		checkInterpretedOutput("native/anyId.pec");
	}

	@Test
	public void testInterpretedAnyText() throws Exception {
		checkInterpretedOutput("native/anyText.pec");
	}

	@Test
	public void testInterpretedAttribute() throws Exception {
		checkInterpretedOutput("native/attribute.pec");
	}

	@Test
	public void testInterpretedCategory() throws Exception {
		checkInterpretedOutput("native/category.pec");
	}

	@Test
	public void testInterpretedMethod() throws Exception {
		checkInterpretedOutput("native/method.pec");
	}

	@Test
	public void testInterpretedNow() throws Exception {
		checkInterpretedOutput("native/now.pec");
	}

	@Test
	public void testInterpretedPrinter() throws Exception {
		checkInterpretedOutput("native/printer.pec");
	}

}

