package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestClosures extends BaseOParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceOEO("closures/globalClosureNoArg.o");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceOEO("closures/globalClosureWithArg.o");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceOEO("closures/instanceClosureNoArg.o");
	}

}

