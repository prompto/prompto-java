package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestClosures extends BaseOParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceOSO("closures/globalClosureNoArg.poc");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceOSO("closures/globalClosureWithArg.poc");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceOSO("closures/instanceClosureNoArg.poc");
	}

}

