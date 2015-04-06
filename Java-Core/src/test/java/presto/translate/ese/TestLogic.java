package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLogic extends BaseEParserTest {

	@Test
	public void testAndBoolean() throws Exception {
		compareResourceESE("logic/andBoolean.pec");
	}

	@Test
	public void testNotBoolean() throws Exception {
		compareResourceESE("logic/notBoolean.pec");
	}

	@Test
	public void testOrBoolean() throws Exception {
		compareResourceESE("logic/orBoolean.pec");
	}

}

