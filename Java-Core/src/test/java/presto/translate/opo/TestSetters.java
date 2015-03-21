package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSetters extends BaseOParserTest {

	@Test
	public void testGetter() throws Exception {
		compareResourceOPO("setters/getter.o");
	}

	@Test
	public void testSetter() throws Exception {
		compareResourceOPO("setters/setter.o");
	}

}

