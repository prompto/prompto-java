package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSetters extends BaseOParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceOSO("setters/getter.poc");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceOSO("setters/setter.poc");
	}

}

