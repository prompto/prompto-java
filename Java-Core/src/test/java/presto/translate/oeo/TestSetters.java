package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSetters extends BaseOParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceOEO("setters/getter.o");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceOEO("setters/setter.o");
	}

}

