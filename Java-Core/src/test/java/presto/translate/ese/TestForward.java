package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestForward extends BaseEParserTest {

	@Test
	public void testForward() throws Exception {
		compareResourceESE("forward/forward.pec");
	}

}

