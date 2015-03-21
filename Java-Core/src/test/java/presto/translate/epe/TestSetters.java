package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSetters extends BaseEParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceEPE("setters/getter.e");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceEPE("setters/setter.e");
	}

}

