package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestNative extends BaseEParserTest {

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

