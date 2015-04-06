package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestForward extends BaseEParserTest {

	@Test
	public void testForward() throws Exception {
		compareResourceEOE("forward/forward.pec");
	}

}

