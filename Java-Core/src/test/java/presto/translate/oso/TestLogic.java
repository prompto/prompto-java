package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLogic extends BaseOParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceOSO("logic/andBoolean.poc");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceOSO("logic/notBoolean.poc");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceOSO("logic/orBoolean.poc");
	}

}

