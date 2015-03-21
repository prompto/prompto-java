package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLogic extends BaseOParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceOEO("logic/andBoolean.o");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceOEO("logic/notBoolean.o");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceOEO("logic/orBoolean.o");
	}

}

