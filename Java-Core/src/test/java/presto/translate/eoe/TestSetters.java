package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSetters extends BaseEParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceEOE("setters/getter.e");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceEOE("setters/setter.e");
	}

}

