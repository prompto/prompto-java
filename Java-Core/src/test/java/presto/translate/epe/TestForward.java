package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestForward extends BaseEParserTest {

	@Test
	public void testForward() throws Exception {
		compareResourceEPE("forward/forward.e");
	}

}

