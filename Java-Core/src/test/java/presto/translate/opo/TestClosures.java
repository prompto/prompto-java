package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestClosures extends BaseOParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceOPO("closures/globalClosureNoArg.o");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceOPO("closures/globalClosureWithArg.o");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceOPO("closures/instanceClosureNoArg.o");
	}

}

