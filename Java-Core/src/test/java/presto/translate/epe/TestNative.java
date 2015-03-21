package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestNative extends BaseEParserTest {

	@Test
	public void testCategory() throws Exception {
		compareResourceEPE("native/category.e");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceEPE("native/method.e");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEPE("native/return.e");
	}

}

