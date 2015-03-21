package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLogic extends BaseOParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceOPO("logic/andBoolean.o");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceOPO("logic/notBoolean.o");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceOPO("logic/orBoolean.o");
	}

}

