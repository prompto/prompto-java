package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSetters extends BaseOParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceEOE("setters/getter.poc");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceEOE("setters/setter.poc");
	}

}

