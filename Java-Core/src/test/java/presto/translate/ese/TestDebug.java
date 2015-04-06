package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestDebug extends BaseEParserTest {

	@Test
	public void testStack() throws Exception {
		compareResourceESE("debug/stack.pec");
	}

}

