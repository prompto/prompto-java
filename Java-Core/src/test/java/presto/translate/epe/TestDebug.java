package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestDebug extends BaseEParserTest {

	@Test
	public void testStack() throws Exception {
		compareResourceEPE("debug/stack.e");
	}

}

