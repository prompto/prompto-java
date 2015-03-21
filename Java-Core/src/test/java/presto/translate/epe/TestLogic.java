package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLogic extends BaseEParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceEPE("logic/andBoolean.e");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceEPE("logic/notBoolean.e");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceEPE("logic/orBoolean.e");
	}

}

