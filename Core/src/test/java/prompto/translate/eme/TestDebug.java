package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestDebug extends BaseEParserTest {

	@Test
	public void testStack() throws Exception {
		compareResourceEME("debug/stack.pec");
	}

}

