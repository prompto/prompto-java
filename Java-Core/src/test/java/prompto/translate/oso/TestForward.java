package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestForward extends BaseOParserTest {

	@Test
	public void testForward() throws Exception {
		compareResourceOSO("forward/forward.poc");
	}

}

