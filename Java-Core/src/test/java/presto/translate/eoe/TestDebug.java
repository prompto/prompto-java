package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestDebug extends BaseEParserTest {

	@Test
	public void testStack() throws Exception {
		compareResourceEOE("debug/stack.pec");
	}

}

