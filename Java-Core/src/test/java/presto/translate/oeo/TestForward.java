package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestForward extends BaseOParserTest {

	@Test
	public void testForward() throws Exception {
		compareResourceOEO("forward/forward.o");
	}

}

