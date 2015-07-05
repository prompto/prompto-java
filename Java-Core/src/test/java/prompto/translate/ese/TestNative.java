// generated: 2015-07-05T23:01:01.063
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestNative extends BaseEParserTest {

	@Test
	public void testAnyId() throws Exception {
		compareResourceESE("native/anyId.pec");
	}

	@Test
	public void testAnyText() throws Exception {
		compareResourceESE("native/anyText.pec");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceESE("native/attribute.pec");
	}

	@Test
	public void testCategory() throws Exception {
		compareResourceESE("native/category.pec");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceESE("native/method.pec");
	}

	@Test
	public void testPrinter() throws Exception {
		compareResourceESE("native/printer.pec");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceESE("native/return.pec");
	}

}

