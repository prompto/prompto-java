package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestNative extends BaseEParserTest {

	@Test
	public void testCategory() throws Exception {
		compareResourceEOE("native/category.e");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceEOE("native/method.e");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEOE("native/return.e");
	}

}

