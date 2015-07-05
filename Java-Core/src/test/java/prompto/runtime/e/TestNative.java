// generated: 2015-07-05T23:01:01.064
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
	public void testAnyId() throws Exception {
		checkOutput("native/anyId.pec");
	}

	@Test
	public void testAnyText() throws Exception {
		checkOutput("native/anyText.pec");
	}

	@Test
	public void testAttribute() throws Exception {
		checkOutput("native/attribute.pec");
	}

	@Test
	public void testCategory() throws Exception {
		checkOutput("native/category.pec");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("native/method.pec");
	}

	@Test
	public void testPrinter() throws Exception {
		checkOutput("native/printer.pec");
	}

}

